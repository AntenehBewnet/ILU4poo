package tp2;
import java.util.function.Function;

interface HasSucc<N extends HasSucc<N>> {
	N Succ(); // renvoie le successeur de l’objet courant
	
	<T> cases(T x, Function<N,T> f);
	
	//a
	default boolean isSucc() {
		return cases(false, n-> true);
	}
	
	//b
	default N pred() {
		return cases((N) this, n ->n);
	}
}

