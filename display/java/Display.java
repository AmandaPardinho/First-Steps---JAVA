package display.display.java;

import java.awt.*;

public class Display{

	public static void main(String[] args) {

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("A resolução da sua máquina é: " +d.width + " x " +d.height);
	
	}
}

	