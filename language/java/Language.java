package display.language.java;

import java.util.Locale;

public class Language{

	public static void main(String[] args) {

		Locale currentLocale = Locale.getDefault();
		System.out.println(currentLocale.getDisplayLanguage());
		
	}
}