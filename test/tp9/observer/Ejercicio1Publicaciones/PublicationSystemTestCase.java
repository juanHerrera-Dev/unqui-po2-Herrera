package tp9.observer.Ejercicio1Publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PublicationSystemTestCase {

	private PublicationSystem sistema;
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new PublicationSystem();
	}

	@Test
	void testConstructor() {
		assertTrue(sistema.getSuscriptores().isEmpty());
	}
	
	@Test
	void testAñadirSuscriptor() {
		//Setup
		IInvestigador investigador = mock(IInvestigador.class);
		List<String> preferencias = Arrays.asList("Bernal", "Smalltalk");
		
		//Exercise
		sistema.añadirSuscriptor(investigador, preferencias);
		
		//Verify
		assertTrue(sistema.getSuscriptores().containsKey(investigador));
		assertEquals(preferencias, sistema.preferenciasDe(investigador));
	}
	
	@Test
	void testRemoverSuscriptor() {
		//Setup
		IInvestigador investigador = mock(IInvestigador.class);
		List<String> preferencias = Arrays.asList("Bernal", "Smalltalk");
				
		//Exercise
		sistema.añadirSuscriptor(investigador, preferencias);
		sistema.removerSuscriptor(investigador);
				
		//Verify
		assertFalse(sistema.getSuscriptores().containsKey(investigador));
	}
	
	@Test
	void testCuandoSeAñadeUnArticulo_SeNotificaALosSuscriptoresConEsosIntereses() {
		//Setup
		IInvestigador investigadorNotificado = mock(IInvestigador.class);
		List<String> preferenciasNotificables = Arrays.asList("Bernal", "Smalltalk");
		
		IInvestigador investigadorNoNotificado = mock(IInvestigador.class);
		List<String> preferenciasNoNotificables = Arrays.asList("Java");
		
		Article articulo = mock(Article.class);
		
		when(articulo.correspondeConLasPreferencias(preferenciasNotificables)).thenReturn(true);
		when(articulo.correspondeConLasPreferencias(preferenciasNoNotificables)).thenReturn(false);
		
		//Exercise
		sistema.añadirSuscriptor(investigadorNotificado, preferenciasNotificables);
		sistema.añadirSuscriptor(investigadorNoNotificado, preferenciasNoNotificables);
		
		sistema.addArticle(articulo);
		
		//Verify
		assertTrue(sistema.getArticulos().contains(articulo));
		verify(investigadorNotificado, times(1)).update(articulo);
		verifyNoInteractions(investigadorNoNotificado);
	}
	
	@Test
	void testRemoveArticle() {
		//Setup
		Article articulo = mock(Article.class);
						
		//Exercise
		sistema.removeArticle(articulo);
						
		//Verify
		assertFalse(sistema.getArticulos().contains(articulo));
	}

}
