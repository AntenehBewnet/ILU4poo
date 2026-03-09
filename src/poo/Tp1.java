package poo;

import java.util.function.Function;

public class Tp1{
	
	public static void main(String[] args) {
		T1 a = x -> x+1;
		System.out.println(a.t1(3));
		
		T2 f2 = new C2();
		
		System.out.println(f2.t2(a));
		
		T3<String> f3 = F3.f3();
		
		Function<String, String> preX = s -> "x" + s;
		
		String resultat3 = f3.apply(preX).apply("a");
		
		System.out.println(resultat3);
		
		//Composition a
		Function<Integer, Integer> add = x->x+1;
		Function<Integer, Integer> mul = x->x*2;
		Function<Integer, Integer> compose = add.andThen(mul);
		
		int res = compose.apply(3);
		System.out.println(res);
		
		//d
		int resD = Comp.comp2(
				(String x) -> Integer.parseInt(x) + 1,
				(String x) -> Integer.parseInt(x) * 2,
				(String x) -> Integer::max).apply("2");
		
		
		

	}
}
