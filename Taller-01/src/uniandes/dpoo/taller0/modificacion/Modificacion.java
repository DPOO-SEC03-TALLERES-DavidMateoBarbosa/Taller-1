package uniandes.dpoo.taller0.modificacion;
import uniandes.dpoo.taller0.procesamiento.*;
import java.io.*;

public class Modificacion {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Hola, mundo!");
		CalculadoraEstadisticas calculator = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println(calculator.paisConMasMedallistas());
	}
}