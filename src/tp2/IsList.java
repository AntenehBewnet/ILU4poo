package tp2;

import java.util.function.BiFunction;

interface IsList<E, L extends IsList<E,L>> {
	L add(E x); // ajout en tête
	<T> T cases(T z, BiFunction<E,L,T> f);
	
	//a
	default boolean isEmpty() {
		return cases(true, (hd,tl) -> false);
	}
} 

