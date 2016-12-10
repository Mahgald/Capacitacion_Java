package practica6.ej03;

public class TestEjercicio3 {

	public static void main(String[] args)
	{
		Organizador o1=new Organizador();
		Organizador o2=new Organizador();
		
		System.out.println(o1.bajarTelon());
		System.out.println(o2.bajarTelon());
		System.out.println(o2.subirTelon());
		System.out.println(o1.bajarTelon());
		System.out.println(o1.subirTelon());
		System.out.println(o2.bajarTelon());
		System.out.println(o1.bajarTelon());
		

	}

}
