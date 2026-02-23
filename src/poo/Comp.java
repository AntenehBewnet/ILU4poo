package poo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Comp {
	public static <T, A, B, R> Function<T, R> comp2(
			Function<T,A> f1,
			Function<T, B> f2,
			BiFunction<A, B, R> g) {
		return x -> g.apply(f1.apply(x), f2.apply(x));
	}

}
