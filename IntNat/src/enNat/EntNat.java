package enNat;

public class EntNat {
	private int num;
	public EntNat(int num)throws ErrorConst {
		if(num<0) throw new ErrorConst();
		else {
		this.num=num;}
	}
	public int getN() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	
}

