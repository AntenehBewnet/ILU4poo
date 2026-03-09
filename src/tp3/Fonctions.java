package tp3;

import java.util.List;
import java.util.stream.IntStream;

public class Fonctions {
	
	public int fact(int n) {
		return IntStream.range(1, n+1).reduce(1,(x,y)->x*y);
	}
	
	public IntStream fact10() {
		
		IntStream f10 = IntStream
			.range(1, 11)
			.map(n->fact(n))
			.peek(System.out::print);
		
		return f10;
	}
	


}
