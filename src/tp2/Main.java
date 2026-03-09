package tp2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Integrable f1 = new Carre(); 
	Integrable f2 = new Sin();
	
	double res1 = f1.integr(0, 10, 1000);
	double res2 = f2.integr(0, Math.PI,1000);
	
	System.out.println(res1);
	System.out.println(res2);
	}

}
