package persist;

import model.AMGraph;

public class GetAtoBWeight {
	public int get(String v1,String v2,AMGraph g){
		int vv1 = Integer.parseInt(v1.split("v")[1])-1;
		int vv2 = Integer.parseInt(v2.split("v")[1])-1;
		return g.getArcs()[vv1][vv2];
	}
	public int get(int v1,int v2,AMGraph g){
		int vv1 = v1-1;
		int vv2 = v2-1;
		return g.getArcs()[vv1][vv2];
	}
	public static void main(String[] args) {
		AMGraph g = new AMGraph();
		GetAtoBWeight test = new GetAtoBWeight();
		System.out.println(test.get("v15", "v16", g));
	}
}
