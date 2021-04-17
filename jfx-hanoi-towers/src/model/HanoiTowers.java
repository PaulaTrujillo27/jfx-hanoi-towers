package model;

public class HanoiTowers {
	private int origin;
	private int aux;
	private int dest;

	public HanoiTowers() {
		origin=0;
		aux=0;
		dest=0;
	}
	public void hanoiTowers(int d) {
		hanoiTowers(d,"A","B","C");
	}
	
	public void setTowers(int d) {
		origin=d;
		aux=0;
		dest=0;
	}
	
	private void hanoiTowers(int d, String o, String a, String des) {
		String space=" ";	
		if(d==1){	
			hanoiTowers(o,des);
			System.out.println(origin+space+aux+space+dest);
		}else{		
			hanoiTowers(d-1,o,des,a);
			hanoiTowers(o,des);
			System.out.println(origin+space+aux+space+dest);
			hanoiTowers(d-1,a,o,des);
		}
	}
	
	private void hanoiTowers(String o, String des) {
		switch(o) {
		case "A":
			origin--;
		break;
		case "B":
			aux--;
		break;	
		case "C":
			dest--;
		break;
		}
		switch(des) {
		case "A":
			origin++;
		break;
		case "B":
			aux++;
		break;
		case "C":
			dest++;
		break;
		}
	}
}