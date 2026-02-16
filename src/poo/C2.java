package poo;

public class C2 implements T2{

	@Override
	public int t2(T1 f) {
		return f.t1(f.t1(0));
	}
}
