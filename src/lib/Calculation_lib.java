package lib;

public class Calculation_lib {
	
	private int m,n; //フィールドの定義

	public Calculation_lib(int m, int n){
		this.m = m;  //フィールドのmにローカルのmを代入
		this.n = n;
	}
	
	public int getPlus(){ //足し算
	return m+n;
	}
	
	public int getMinus(){ //引き算
		return m-n;
	}

}
