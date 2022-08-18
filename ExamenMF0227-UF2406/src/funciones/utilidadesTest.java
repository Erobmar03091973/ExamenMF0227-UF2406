package funciones;

import static org.junit.jupiter.api.Assertions.assertEquals;


	

	

	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.Test;

	public class utilidadesTest {

		 private static Utilidades u ;
		 
		 @BeforeAll
			static void inicializarUtilidades() {
				u = new Utilidades();
			}
		 
		 @Test
		 
		 void evuelveCentralTest() {
			 
			 assertEquals(1,u.devuelveNota(1), "Es suspenso");
			 assertEquals(2,u.devuelveNota(2), "Es suspenso");
			 assertEquals(3,u.devuelveNota(3), "Es suspenso");
			 assertEquals(4,u.devuelveNota(4), "Es suspenso");
			 assertEquals(5,u.devuelveNota(5), "La nota es un bien");
			 assertEquals(6,u.devuelveNota(6), "La nota es un bien");
			 assertEquals(8,u.devuelveNota(8), "La nota es un notable");
			 assertEquals(9,u.devuelveNota(9), "La nota es un sobresaliente");
			 assertEquals(10,u.devuelveNota(10), "La nota es una matricula");
			 

}
	}
