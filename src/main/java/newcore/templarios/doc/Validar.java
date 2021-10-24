package newcore.templarios.doc;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import newcore.templarios.Regex;

public class Validar {

	Regex regex = new Regex();

	public void Comp(String archCSV) throws CsvValidationException, IOException {
		int errores0 = 0, errores1 = 0, errores2 = 0, errores3 = 0, errores4 = 0, errores5 = 0, errores6 = 0,
				errores7 = 0, errores8 = 0;
		try (CSVReader csvReader = new CSVReader(new FileReader(archCSV))) {
			String[] fila = null;
			// int contador = 0;

			while ((fila = csvReader.readNext()) != null) {

				// contador++;

				if (!fila[0].equalsIgnoreCase("PER_mensual")) {
					// System.out.println("[Error Country: {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[0].concat("}]"));
					errores0++;
				}

				if (!regex.employee_id(fila[1])) {
					// System.out.println("[Error Employee ID: {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[1].concat("}]"));
					errores1++;
				}

				if (!fila[2].isEmpty()) {
					// System.out.println("[Error Position ID: {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[2].concat("}]"));
					errores2++;
				}

				if (!regex.fecha(fila[3])) {
					// System.out.println("[Error Compensation Change Date: {Fila:
					// ".concat(String.valueOf(contador))
					// .concat("\tDato: ") + fila[3].concat("}]"));
					errores3++;
				}

				if (!fila[4].equalsIgnoreCase("REQUEST_COMPENSATION_CHANGE_GLO_POST-PAYROLL_UPDATE$ADJUSTMENT#UM4")) {
					// System.out.println("[Error Reason (Compensation Plan): {Fila:
					// ".concat(String.valueOf(contador))
					// .concat("\tDato: ") + fila[4].concat("}]"));
					errores4++;
				}

				if (!fila[5].equalsIgnoreCase("NIVRET")) {
					// System.out.println(
					// "[Error Compensation ID: {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[5].concat("}]"));
					errores5++;
				}
				if (!regex.amount(fila[6])) {
					// System.out.println("[Error Amount: {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[6].concat("}]"));
					errores6++;
				}

				if (!fila[7].isEmpty()) {
					// System.out.println("[Error Frequecy: {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[7].concat("}]"));
					errores7++;
				}

				if (!fila[8].equalsIgnoreCase("PEN")) {
					// System.out.println("[Error Currency: {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[8].concat("}]"));
					errores8++;
				}

			}

			csvReader.close();
			System.out.println("\n*********************************************");

			System.out.println("Total errores Country: ".concat(String.valueOf(errores0))
					.concat("\nTotal Errores Employee ID: ".concat(String.valueOf(errores1)))
					.concat("\nTotal Errores Position ID: ".concat(String.valueOf(errores2)))
					.concat("\nTotal Errores Compensation Change Date: ".concat(String.valueOf(errores3)))
					.concat("\nTotal Errores Reason (Compensation Plan): ".concat(String.valueOf(errores4)))
					.concat("\nTotal Errores Compensation ID: ".concat(String.valueOf(errores5)))
					.concat("\nTotal Errores Amount: ".concat(String.valueOf(errores6)))
					.concat("\nTotal Errores Frequecy: ".concat(String.valueOf(errores7)))
					.concat("\nTotal Errores Currency: ".concat(String.valueOf(errores8))));
		}
	}

	public void Expr(String archCSV) throws CsvValidationException, IOException {
		int errores0 = 0, errores1 = 0, errores2 = 0, errores3 = 0, errores4 = 0, errores5 = 0, errores6 = 0,
				errores7 = 0, errores8 = 0, errores9 = 0, errores10 = 0, errores11 = 0, errores12 = 0, errores13 = 0,
				errores14 = 0, errores15 = 0, errores16 = 0;
		try (CSVReader csvReader = new CSVReader(new FileReader(archCSV))) {
			String[] fila = null;
			// int contador = 0;
			while ((fila = csvReader.readNext()) != null) {
				// contador++;
				if (!fila[0].isEmpty()) {
					// System.out.println("[Error Batch ID: {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[0].concat("}]"));
					errores0++;
				}
				if (!fila[1].equalsIgnoreCase("PER_mensual")) {
					// System.out.println("[Error Pay Group: {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[1].concat("}]"));
					errores1++;
				}
				if (!regex.fecha(fila[2])) {
					// System.out.println(
					// "[Error Period End Date: {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[2].concat("}]"));
					errores2++;
				}
				if (!fila[3].isEmpty()) {
					// System.out.println(
					// "[Error Pay Group Currency ID : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[3].concat("}]"));
					errores3++;
				}
				if (!fila[4].isEmpty()) {
					// System.out.println(
					// "[Error Delete Result : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[4].concat("}]"));
					errores4++;
				}
				if (!regex.employee_id(fila[5])) {
					// System.out
					// .println("[Error Employee ID : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[5].concat("}]"));
					errores5++;
				}
				if (!fila[6].isEmpty()) {
					// System.out
					// .println("[Error Position ID : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[6].concat("}]"));
					errores6++;
				}
				if (!regex.company(fila[7])) {
					// System.out.println("[Error Company ID : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[7].concat("}]"));
					errores7++;
				}
				if (!fila[8].isEmpty()) {
					// System.out.println(
					// "[Error Company Currency ID : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[8].concat("}]"));
					errores8++;
				}
				if (!regex.fecha(fila[9])) {
					// System.out
					// .println("[Error Payment Date : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[9].concat("}]"));
					errores9++;
				}
				if (!fila[10].equalsIgnoreCase("1")) {
					// System.out
					// .println("[Error Check Number : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[10].concat("}]"));
					errores10++;
				}
				if (!fila[11].isEmpty()) {
					// System.out
					// .println("[Error Gross Amount : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[11].concat("}]"));
					errores11++;
				}
				if (!fila[12].isEmpty()) {
					// System.out.println("[Error Net Amount : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[12].concat("}]"));
					errores12++;
				}
				if (!regex.code(fila[13])) {
					// System.out.println("[Error Code : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[13].concat("}]"));
					errores13++;
				}
				if (!fila[14].equalsIgnoreCase("E")) {
					// System.out.println(
					// "[Error Earning or Deduction : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[14].concat("}]"));
					errores14++;
				}
				if (!fila[15].equalsIgnoreCase("PEN")) {
					// System.out.println(
					// "[Error Recorded Currency ID : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[15].concat("}]"));
					errores15++;
				}
				if (fila[16].isEmpty()) {
					// System.out.println("[Error Amount : {Fila:
					// ".concat(String.valueOf(contador)).concat("\tDato: ")
					// + fila[16].concat("}]"));
					errores16++;
				}
			}
			csvReader.close();
			System.out.println("\n*********************************************");

			System.out.println("Total errores Batch ID: ".concat(String.valueOf(errores0))
					.concat("\nTotal Errores Pay Group: ".concat(String.valueOf(errores1)))
					.concat("\nTotal Errores Period End Date: ".concat(String.valueOf(errores2)))
					.concat("\nTotal Errores Pay Group Currency ID: ".concat(String.valueOf(errores3)))
					.concat("\nTotal Errores Delete Result: ".concat(String.valueOf(errores4)))
					.concat("\nTotal Errores Employee ID: ".concat(String.valueOf(errores5)))
					.concat("\nTotal Errores Position ID: ".concat(String.valueOf(errores6)))
					.concat("\nTotal Errores Company ID: ".concat(String.valueOf(errores7)))
					.concat("\nTotal Errores Company Currency ID: ".concat(String.valueOf(errores8)))
					.concat("\nTotal Errores Payment Date: ".concat(String.valueOf(errores9)))
					.concat("\nTotal Errores Check Number: ".concat(String.valueOf(errores10)))
					.concat("\nTotal Errores Gross Amount: ".concat(String.valueOf(errores11)))
					.concat("\nTotal Errores Net Amount: ".concat(String.valueOf(errores12)))
					.concat("\nTotal Errores Code: ".concat(String.valueOf(errores13)))
					.concat("\nTotal Errores Earning or Deduction: ".concat(String.valueOf(errores14)))
					.concat("\nTotal Errores Recorded Currency ID: ".concat(String.valueOf(errores15)))
					.concat("\nTotal Errores Amount: ".concat(String.valueOf(errores16)))

			);
		}
	}

}
