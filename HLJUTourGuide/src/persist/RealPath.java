package persist;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

import model.AMGraph;

public class RealPath {
	private boolean[] S = new boolean[26];   
	//��¼��Դ��v0���յ�Vi�Ƿ��ѱ�ȷ�����·������,trueΪȷ��,falseΪ��δȷ��
	public int[] path = new int[26];
	//��¼��Դ��v0���յ�vi�ĵ�ǰ���·����vi��ֱ��ǰ���������.����Ϊ-1
	private int[] D = new int[26];
	//��¼��Դ��v0���յ�vi�ĵ�ǰ���·������
	public Stack<Integer> AtoB = new Stack();
	//��¼A��B�����ֱ�ʾ
	public Queue<String> AtoBString = new LinkedBlockingQueue();
	//A��B���ַ���ʾ
	public RealPath(){}
	public void shortPath_DIJ(AMGraph g,int v0){
		int n = g.getVexNum();  //�������
		for(int v=0;v<n;++v){
			S[v] = false;
			D[v] = g.getArcs()[v0-1][v];
			if(D[v]<999) path[v] = v0-1;
			else path[v] = -1;
		}
		S[v0-1] = true;
		D[v0-1] = 0;
		int v=0,w;
		int y =1;
		int countI = 1;
		for(int i=0;i<n;++i){
			if(i!=v0-1){    //������n-1������,���ν��м���
				int min = 999;
				for(w=0;w<n;w++)  //ѡ�����
					if(!S[w]&&D[w]<min&&w!=v0-1){
						//���w������V-S��,�����Ǿ���v0����ĵ�
						v = w;min = D[w];
						break;
					}
				S[v] = true;
				for(int k=0;k<n;++k){
					//���µ�ǰ���·���;���
					//vΪ��ǰ��ѡ��S�ĵ�
					//���Դ˵�VΪ���ĵ�,����D[v]+D[v][k]�Ƿ�С��D[w],���С�������
					if((D[v]+g.getArcs()[v][k]<D[k])&&(k!=v0-1)){
						System.out.println("dao"+(k+1));
						D[k] = D[v] + g.getArcs()[v][k];
						path[k] = v;
					}
				}
				
			}
			
			System.out.println("֮���:"+(countI++));
			System.out.println("S[v]:");
			for(int yy=0;yy<26;yy++){
				System.out.print("S["+(yy+1)+"]"+"="+S[yy]+"\t");
			}
			System.out.println();
			System.out.println("D[v]");
			for(int yy=0;yy<26;yy++){
				System.out.print("D["+(yy+1)+"]"+"="+D[yy]+"\t");
			}
			System.out.println();
			System.out.println("path[v]");
			for(int yy=0;yy<26;yy++){
				System.out.print("path["+(yy+1)+"]"+"="+(path[yy]+1)+"\t");
			}
			System.out.println();
			System.out.println("uuuuuuuuuuuuuuuuuuuuuu");
			
		}
		//this.ShowResult(S,D,path);
	}
	
	public int[] getPath() {
		return path;
	}

	public void setPath(int[] path) {
		this.path = path;
	}

	public int[] getD() {
		return D;
	}

	public void setD(int[] d) {
		D = d;
	}
	
	public void ShowResult(boolean[] S,int[] D,int[] path){
		System.out.println("֮���:");
		System.out.println("S[v]:");
		for(int i=0;i<26;i++){
			System.out.print("S["+(i+1)+"]"+"="+S[i]+"\t");
		}
		System.out.println();
		System.out.println("D[v]");
		for(int i=0;i<26;i++){
			System.out.print("D["+(i+1)+"]"+"="+D[i]+"\t");
		}
		System.out.println();
		System.out.println("path[v]");
		for(int i=0;i<26;i++){
			System.out.print("path["+(i+1)+"]"+"="+(path[i]+1)+"\t");
		}
	}
	
	public Stack<Integer> GetAtoB(int[] path,int start,int end){
		for(int i=0;i<26;i++){
			if(i+1==end){
				AtoB.add(path[i]+1);
			}
		}
		if(AtoB.peek()==start)  return AtoB;
		else return GetAtoB(path, start, AtoB.peek());
	}
	
	public Queue<String> GetStringAtoB(Stack<Integer> AtoB){
		Stack<Integer> AtoBInteger = AtoB;
		while(!AtoBInteger.empty()){
			AtoBString.add("v"+(AtoBInteger.pop()));
		}
		return AtoBString;
	}
	
	
	public static void main(String[] args) {
		AMGraph g = new AMGraph();
		RealPath rap = new RealPath();
		rap.shortPath_DIJ(g,26);
		/*System.out.println("����Ҫ���Եĵ�:");
		rap.GetAtoB(rap.path, 26, 1);*/
		//System.out.println(rap.getD()[1]);
	}
}
