package tp7.ejercicio3;

import java.util.HashMap;
import java.util.List;

public interface WikipediaPage {

	public abstract String getTitle();
	public abstract List<WikipediaPage> getLinks();
	public abstract HashMap<String, WikipediaPage> getInfobox();
	
}
