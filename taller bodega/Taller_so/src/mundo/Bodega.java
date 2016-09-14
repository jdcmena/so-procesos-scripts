package mundo;

import java.util.ArrayList;
import java.util.List;

public class Bodega {
	
	int capacidad;
	int uno;
	int dos;
	
	private List<Articulo> articulos;

	public Bodega(int capacidad) {
		
		this.capacidad = capacidad;
		this.articulos= new ArrayList<Articulo>();
		uno=0;
		dos=0;
	}
	
	public void cargarPaquete(Empacador empaca)throws Exception{
		
		if(uno>=3 &&dos>=4){
			empaca.recbirPaquete(new Paquete(3, 4));
			capacidad = capacidad -(uno*10 + dos*15);
			uno=uno-3;
			dos=dos-4;
		}
		else{
			throw new Exception();
		}
		
	}
	
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public void descargarArticulo(int a){
		
		switch(a){
		
		case 1: articulos.add(new Articulo(1));
		capacidad = capacidad + 10;
		uno ++;
		break;
		
		case 2: articulos.add(new Articulo(2));
		capacidad = capacidad + 15;
		dos++;
		break;
		
		}
		
	}

}
