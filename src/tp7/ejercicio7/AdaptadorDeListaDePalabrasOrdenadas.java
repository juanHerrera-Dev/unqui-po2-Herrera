package tp7.ejercicio7;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import java.util.List;

public class AdaptadorDeListaDePalabrasOrdenadas extends DefaultListModel {

	private ListaDePalabrasOrdenadas listaOrdenada;
	
	public AdaptadorDeListaDePalabrasOrdenadas(ListaDePalabrasOrdenadas listaOrdenada) {
		this.listaOrdenada = listaOrdenada;
	}
	//se creo este metodo para poder usar el addAll de DefaultListModel
    public List <String> elementos () {
        List <String> list = new ArrayList <String> ();
        for (int i = 0; i < this.listaOrdenada.cantidadDePalabras(); i++) {
            list.add(listaOrdenada.getPalabraDePosicion(i));
        }
        return list;
    }
    //se realiza esta secuencia porque fue la forma que encontre de agregar los elementos de manera ordenada a la clase adapter
    //y asi que la ventana lo pueda mostrar por pantalla.
    @Override
    public void addElement(Object element) {
        
    	this.listaOrdenada.agregarPalabra((String)element);
        this.removeAllElements();
        this.addAll(this.elementos());
        
    }
    	
}
