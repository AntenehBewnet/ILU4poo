package tp2;

public class MyNat implements HasPlus<MyNat>{

	private int val;
	
	public MyNat(int v) {
		this.val = v;
	}
	
	public int getVal() {
		return val;
	}
	
	@Override
	public MyNat Succ() {
		return new MyNat(val + 1);
	}
}
