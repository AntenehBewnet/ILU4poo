package tp2;

public interface Integrable {
	
	double apply(double x);
	
	default double integr(double a, double b, int n) {
		
		double h = (b-a)/n;
		double sum = (apply(a) +apply(b)) /2.0;
		 for (int i = 1; i < n; i++) {
			double x = a+i*h;
			sum += apply(x);
		}
		 return sum*h;
	}

}
