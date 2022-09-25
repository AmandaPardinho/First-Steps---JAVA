package language

import java.util.Locale;

public class Language{

	public static void main(String[] args) {

		Locale currentLocale = Locale.getDefault();
		System.out.println(currentLocale.getDisplayLanguage());
		
	}
}