package mundo;

import java.util.ArrayList;

public class Empacador implements Runnable {

	private Bodega bodega;
	
	private ArrayList<Paquete> paquetes;
	
	public Empacador(Bodega bodega){
		this.bodega = bodega;
		paquetes = new ArrayList<Paquete>();
	}
	

	public void recbirPaquete(Paquete paquete) {
		
		paquetes.add(paquete);

	}


	@Override
	public void run() {
		
		while(true){
			
			try {
				Thread.sleep(2000);
				bodega.cargarPaquete(this);
				System.out.println("empacador recibió paquete");
			} catch (Exception e) {
				System.out.println("empacador no pudo recibir paquete");
			}
			
		}
	}

}
