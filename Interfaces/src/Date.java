

public class Date {
	
	private int dd, mm ,yy;
	
	Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
//	Setters
	public void setDd(int dd) {
		this.dd = dd;
	}
	
	public void setMm(int mm) {
		this.mm = mm;
	}
	
	public void setYv(int yy) {
		this.yy = yy;
	}
	
	
	
//	Getters
	public int getDd() {
		return dd;
	}
	
	public int getMm() {
		return mm;
	}
	
	public int getYy() {
		return yy;
	}

	public String toString() {
		return +dd+"/"+mm+"/"+yy;
	}
	public static void main(String[] args) {
		
		

	}

}
