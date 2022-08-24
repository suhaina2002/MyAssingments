package week4;

public class bike extends Bicycle{
public void applyBreak() {
	System.out.print("Apply Break");}
	public static void main(String[] args) {
		bike b=new bike();
		b.applyBreak();
		b.applyPedal();
		
}
}
