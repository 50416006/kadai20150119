package lib;

public class Calculation_lib {
	
	private int m,n; //�t�B�[���h�̒�`

	public Calculation_lib(int m, int n){
		this.m = m;  //�t�B�[���h��m�Ƀ��[�J����m����
		this.n = n;
	}
	
	public int getPlus(){ //�����Z
	return m+n;
	}
	
	public int getMinus(){ //�����Z
		return m-n;
	}

}
