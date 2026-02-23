package poo;

import java.util.function.Function;

public class F3<A> implements T3<A> {

	@Override
	public Function<A,A> apply(Function<A,A> f) {
		return x -> f.apply(f.apply(x));
	}
	
	public static <T> T3<T> f3() {
		return new F3<>();
	}
	
	
}
