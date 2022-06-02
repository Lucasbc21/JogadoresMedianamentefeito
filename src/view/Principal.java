package view;

import controller.ControllerJogadores;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		IArquivosController arqCont = new ControllerJogadores();
		
		String dirWin = "C:\\Windows";
		String path = "C:\\TEMP";
		String nome = "data.csv";
		try {
			arqCont.readFile(path, nome);
		
		} catch (Exception e) {
		

	}

}
}
