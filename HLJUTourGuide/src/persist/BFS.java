package persist;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

import model.AMGraph;

public class BFS {
	private ArrayList<String> allPath = new ArrayList();//allPath �������()-(),ǰһ������ʼ��,��һ���ǵ����
	public Stack<String> AtoB = new Stack();  //A�㵽B���·��,������B
	private Queue<String> qTemp = new LinkedBlockingQueue();
	private boolean []visited = new boolean[26];
	
	public Stack<String> getAtoB() {
		return AtoB;
	}

	public void setAtoB(Stack<String> atoB) {
		AtoB = atoB;
	}

	public ArrayList<String> getAllPath() {
		return allPath;
	}

	public void setAllPath(ArrayList<String> allPath) {
		this.allPath = allPath;
	}

	public ArrayList<String> GetBFS(AMGraph g,String vex){
		//������ʼ��,�õ�����ʼ�㵽�������ArrayList<String>
		InitVisited(visited);
		qTemp.add(vex);
		visited[Integer.parseInt(vex.split("v")[1])-1] = true;
		allPath.add("0-"+vex);
		while(qTemp.size()!=0){
			String u = qTemp.poll();
			Integer getVexLocation = Integer.parseInt(u.split("v")[1]);
			int i =getVexLocation-1;
			for(int j=0;j<g.getVexNum();++j){
				if(visited[j]==false&&g.getArcs()[i][j]!=999){
					allPath.add("v"+(i+1)+"-"+"v"+(j+1));
					visited[j]=true;
					qTemp.add("v"+(j+1));
				}
			}
		}
		return allPath;
	}
	public Stack<String> GetPath(ArrayList<String> allPath,String vexBegin,String vexEnd){
		//ArrayList allPath,��GetBFS �л�õ�allPath
		//������ʼ�� vexBegin
		//������ֹ��vexEnd
		//�õ�һ����vexBegin��vexEnd��·��
		for(int i=0;i<allPath.size();++i){
			if(vexEnd.equals(allPath.get(i).split("-")[1])){
				AtoB.add(allPath.get(i).split("-")[0]);
			}
		}
		if(AtoB.peek().equals(vexBegin))  return AtoB;
		else  return GetPath(allPath,vexBegin,AtoB.peek());
	}
	
	private void InitVisited(boolean visited []){
		for(boolean v:visited){
			v = false;
		}
	}
	
	public void ShowAllPath(ArrayList<String> alP){
		for(String al:alP){
			System.out.println(al);
		}
	}
	
	public void ShowAtoB(Stack<String> AtoB){
		for(String al:AtoB){
			System.out.println(al);
		}
	}
	
	public static void main(String[] args) {
		/*AMGraph g = new AMGraph();
		BFS test = new BFS();
		(test).GetBFS(g, "v26");
		(test).ShowAllPath(test.allPath);
		
		System.out.println("-----------------------");
		test.ShowAtoB((test).GetPath((test).GetBFS(g, "v26"), "v26", "v24"));*/
		AMGraph g = new AMGraph();
		BFS bfs = new BFS();
		(bfs).GetBFS(g, "v26");
		(bfs).ShowAllPath(bfs.allPath);
		//�´ν�AtoB
		Stack s = new Stack();
		for(int i=0;i<g.getVexNum()-1;i++){
			System.out.println("��"+(i+1));
			s = (bfs).GetPath((bfs).GetBFS(g, "v26"), "v26", "v"+(i+1));
			bfs.ShowAtoB(s);
			bfs.AtoB.clear();
			System.out.println("--------------------");
		}
	}
}
