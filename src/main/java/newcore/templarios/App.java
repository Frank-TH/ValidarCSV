package newcore.templarios;

import java.io.IOException;

import com.opencsv.exceptions.CsvValidationException;

import newcore.templarios.doc.Validar;

public class App {
	//Rutas
	//C:\Java\Doc\expr\INT0084E_PER_POST_EXPR_20211020.csv | C:\Java\Doc\comp\INT0285_PER_POST_COMP_20211020.csv
	static String archCSV = "";

	public static void main(String[] args) throws CsvValidationException, IOException{
			
		Validar execute = new Validar();
		execute.Comp(archCSV);
	}	

}
