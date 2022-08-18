package funciones;
/**
 * Clase que modela la clase pública utilidades.
 * @author Esther Robleda
 *
 */
public class Utilidades {

	/**
	 * Metodo que debe devolvernos una nota, suspenso si es menor de 5, bien entre 5 y 6.5,
	 * notable ente 6.5 y 8.5, sobresaliente entre 8.5 y 10, matrícula si es mayor que 10.
	 * @param devuelve double con el valor de la nota obtenida
	 * @return nos debe devolver un double con la nota obtenida.
	 */

	public String devuelveNota(double nota) {
		String descripcion = "Matrícula";
		
		if (nota<0.0 || nota >10) {
			throw new ArithmeticException("La nota debe estar entre 0.0 y 10");
		} else if (nota<5.0) {
			descripcion="Suspenso";
		} else if (nota <6.5) {
			descripcion = "Bien";
		} else if (nota<8.5) {
			descripcion ="Notable";
		} else if (nota<10) {
			descripcion ="Sobresaliente";
		} else {
			descripcion = "Matrícula";
		}
		return descripcion;
	}
}