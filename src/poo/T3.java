package poo;

import java.util.function.Function;

public interface T3 <A>{
	
	A f1(Function<A,A> fun, A a);
	
}
