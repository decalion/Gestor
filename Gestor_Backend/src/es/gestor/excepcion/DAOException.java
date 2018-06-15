package es.gestor.excepcion;

/**
 * Control de Excepciones de la Capa de datos
 * @author ismael
 *
 */
public class DAOException extends RuntimeException {
	
	
	/**
	 * Constructor
	 * @param mensaje
	 */
	public DAOException(String mensaje) {
		super(mensaje);
	}

}
