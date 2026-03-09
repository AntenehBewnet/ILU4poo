package tp2;

import java.util.function.Function;

public interface Expr<V> {

	int eval(Function<V,Integer> env);

	//a
	static <V> Expr<V> Var(V v){
		return env -> env.apply(v);
	}
	
	//b
	default Expr<V> add(Expr<V> e){
		return env-> this.eval(env) + e.eval(env);
	}
	
	//c
	default Expr<V> mul(Expr<V> e){
		return env -> this.eval(env) * e.eval(env);
	}
}
