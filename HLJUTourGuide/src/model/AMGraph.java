package model;

import java.util.Scanner;

public class AMGraph {
	String[] vexs= new String[26];
	int arcs[][] = new int[26][26];
	int vexNum,arcNum;
	public String[] getVexs() {
		return vexs;
	}
	public void setVexs(String[] vexs) {
		this.vexs = vexs;
	}
	public int[][] getArcs() {
		return arcs;
	}
	public void setArcs(int[][] arcs) {
		this.arcs = arcs;
	}
	public int getVexNum() {
		return vexNum;
	}
	public void setVexNum(int vexNum) {
		this.vexNum = vexNum;
	}
	public int getArcNum() {
		return arcNum;
	}
	public void setArcNum(int arcNum) {
		this.arcNum = arcNum;
	}
	public AMGraph(){
		vexNum = 26;
		arcNum = 44;
		//顶点信息
		for(int i =0;i<vexNum;i++){
			vexs[i] = "v"+(i+1); 
		}
		//初始化邻接矩阵
		for(int i=0;i<vexNum;i++)
			for(int j=0;j<vexNum;j++){
				arcs[i][j] = 999;
			}
		//构造邻接矩阵
		//出边
		arcs[0][25] = 5;
		arcs[0][1] = 1;
		arcs[1][25] = 3;
		arcs[1][2] = 1;
		arcs[2][5] = 4;
		arcs[2][3] = 1;
		arcs[2][25] = 1;
		arcs[25][3] = 1;
		arcs[25][4] = 6;
		arcs[3][5] = 1;
		arcs[3][6] = 1;
		arcs[3][4] = 1;
		arcs[4][7] = 1;
		arcs[4][8] = 3;
		
		arcs[5][6] = 1;
		arcs[5][9] = 1;
		arcs[6][10] = 1;
		arcs[6][7] = 1;
		arcs[7][8] = 1;
		arcs[7][11] = 1;
		arcs[7][12] = 2;
		arcs[8][13] = 1;
		arcs[9][10] = 1;
		arcs[9][14] = 1;
		arcs[10][14] = 1;
		arcs[10][11] = 1;
		arcs[11][12] = 1;
		arcs[12][14] = 1;
		
		
		arcs[12][13] = 1;
		arcs[12][16] = 4;
		arcs[13][16] = 1;
		arcs[14][15] = 1;
		arcs[15][19] = 11;
		arcs[15][17] = 7;
		arcs[16][17] = 1;
		arcs[17][20] = 1;
		arcs[17][21] = 1;
		arcs[18][19] = 1;
		arcs[20][21] = 1;
		arcs[20][22] = 3;
		arcs[21][22] = 6;
		arcs[22][23] = 1;
		arcs[23][24] = 2;
		//入边
		arcs[25][0] = 5;
		arcs[1][0] = 1;
		arcs[25][1] = 3;
		arcs[2][1] = 1;
		arcs[5][2] = 4;
		arcs[3][2] = 1;
		arcs[25][2] = 1;
		arcs[3][25] = 1;
		arcs[4][25] = 6;
		arcs[5][3] = 1;
		arcs[6][3] = 1;
		arcs[4][3] = 1;
		arcs[7][4] = 1;
		arcs[8][4] = 3;
		
		arcs[6][5] = 1;
		arcs[9][5] = 1;
		arcs[10][6] = 1;
		arcs[7][6] = 1;
		arcs[8][7] = 1;
		arcs[11][7] = 1;
		arcs[12][7] = 2;
		arcs[13][8] = 1;
		arcs[10][9] = 1;
		arcs[14][9] = 1;
		arcs[14][10] = 1;
		arcs[11][10] = 1;
		arcs[12][11] = 1;
		arcs[14][12] = 1;
		
		arcs[13][12] = 1;
		arcs[16][12] = 4;
		arcs[16][13] = 1;
		arcs[15][14] = 1;
		arcs[19][15] = 11;
		arcs[17][15] = 7;
		arcs[17][16] = 1;
		arcs[20][17] = 1;
		arcs[21][17] = 1;
		arcs[19][18] = 1;
		arcs[21][20] = 1;
		arcs[22][20] = 3;
		arcs[22][21] = 6;
		arcs[23][22] = 1;
		arcs[24][23] = 2;
	}
	public static void main(String[] args) {
		System.out.println();
	}
}
