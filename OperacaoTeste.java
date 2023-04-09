public class OperacaoTeste {
	 
	public static void calcular(OperacaoMatematica o, double x ,double y) {
		 System.out.println(o.calcular(x,y));
	}



	public static void main(String[] args) {
		OperacaoMatematica t = new Soma ();
		System.out.println(t.calcular(5, 5));
		OperacaoMatematica g = new Multiplicacao();
		System.out.println(g.calcular(5, 5));
		OperacaoMatematica j = new Divisao();
		System.out.println(j.calcular(10,5));
		
		// ao criar uma operacao fora do main o mesmo se torna acessivel em qualquer lugar do codigo evitando assim ter que instanciar um objeto para chamar o metodo
		calcular(new Soma(),5,70);
		calcular(new Multiplicacao(),10,9);
		calcular(new Divisao(),12,2);
		
		
	


	}

}
