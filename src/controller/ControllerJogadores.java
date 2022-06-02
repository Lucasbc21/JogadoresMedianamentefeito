package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ControllerJogadores implements IArquivosController{
	public ControllerJogadores (){
		super();
	}

	@Override
	public void readFile(String path, String nome) throws IOException {
		File arq = new File(path,nome);

		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();		
	
				while(linha != null) {
					System.out.println(linha);
					linha = buffer.readLine();
					
			}
				buffer.close();
				leitor.close();
				fluxo.close();
				}else {
					throw new IOException("Arquivo invalido");
				}
		
	}

}
