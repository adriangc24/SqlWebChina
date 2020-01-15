package principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Principal {
	static File f;
	static List<Articulo> articulos = new ArrayList<Articulo>();

	public static void main(String[] args) {
		// Conexion a base de datos
		hello.Connection.conexionJDBC();
		f = new File("fichero.csv");
		readFile();
		update();
	}

	private static void update() {
		int i=0;
		for(Articulo x : articulos) {
			String query = "update articulos set categoria_id=(select id from categorias where categoria_en = '"+x.categoria+"') where referencia = '"+x.referencia+"')'";
		}
		
	}

	private static void readFile() {
		if (f.exists() && f.isFile()) {
			System.out.println("File OK");
		}
		try {

			Reader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			while (br.ready()) {
				String linea = br.readLine();
				String s = linea.substring(0,linea.indexOf(';'));
				String s2 = linea.substring(linea.indexOf(';')+1,linea.length());
				System.out.println(s + " --- " + s2);

				Articulo a = new Articulo(s,s2);
				articulos.add(a);
			}
			System.out.println(articulos.size());

			br.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
