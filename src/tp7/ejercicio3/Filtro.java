package tp7.ejercicio3;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Filtro {

	public Filtro() {
		super();
	}
	
	public List<WikipediaPage> getSimilarPages(WikipediaPage paginaWikipedia, List<WikipediaPage> paginasAComparar)
	{
		return paginasAComparar.stream().
								filter(pagina -> this.pasaElFiltro(pagina, paginaWikipedia)).
								collect(Collectors.toList());
	}
	
	public abstract boolean pasaElFiltro(WikipediaPage unaPagina, WikipediaPage otraPagina);
	
}
