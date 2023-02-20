/**

    La clase Rectangulo_JMBM, hereda de FiguraGeometrica_JMBM y

    define los métodos para calcular el área y perímetro del rectángulo.

    @author Juan Manuel Belaunde Martinez

    @version 1.2
    */

public class Rectangulo_JMBM extends FiguraGeometrica_JMBM {
	private double l1;
	private double l2;
	
	/**

    Constructor de la clase Rectangulo_JMBM que recibe el tipo de figura que se creará, la longitud del lado
    grande y la longitud del lado pequeño en este caso un rectángulo.
    @param tipoFigura el tipo de figura
    @param lG la longitud del lado grande
    @param lP la longitud del lado pequeño
    
    */
	
	
	public Rectangulo_JMBM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
    Método para calcular el área del rectángulo.
    @return devuelve el área del rectángulo
    */

	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**

    Método para calcular el perímetro del rectángulo.
    @return devuelve el perímetro del rectángulo
    */
	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
