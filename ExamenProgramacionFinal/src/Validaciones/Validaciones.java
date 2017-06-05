package Validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Validaciones {

	
	
	static public String validarmatricula(String matricula) {

		Pattern pat = Pattern.compile("^[0-9]{4}[a-zA-Z]{3}$");
		Matcher mat = pat.matcher(matricula);

		if (matricula.isEmpty()) {

			JOptionPane.showMessageDialog(null, "ERROR: Inserte una matricula correcta");
			return "0";
		}
		if (!mat.matches()) {
			JOptionPane.showMessageDialog(null, "ERROR: Inserte una matricula correcta");
			return "0";
		} else {

			return matricula;
		}

	}
}
