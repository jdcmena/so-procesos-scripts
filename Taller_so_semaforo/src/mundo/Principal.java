package mundo;

public class Principal {

	private static Bodega bodega;
	private static Empacador empacador;
	private static Descargador descargador;
	
	
	public static void main(String[] args) {
		
		bodega = new Bodega(200);
		empacador= new Empacador(bodega);
		descargador = new Descargador(bodega);
		
		Thread asd1 = new Thread(empacador);
		Thread asd2 = new Thread(descargador);
		asd1.start();
		asd2.start();
		
		
	}

}
