package mundo;

public class Descargador implements Runnable{

	private Bodega bodega;
	
	
	public Descargador(Bodega bodega){
		this.bodega = bodega;
	}
	
	
	@Override
	public void run() {
		
		int i = 5;
		while(i !=0){
			i--;
			bodega.descargarArticulo(1);
			bodega.descargarArticulo(2);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("descargador descargó paquete");

		}
		
	}

}
