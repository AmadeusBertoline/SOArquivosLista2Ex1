package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArquivosController implements IArquivosController {

	public ArquivosController() {
		super();
	}

	@Override
	public void readDir(String path) throws IOException {

		File dir = new File(path);

		if (dir.exists() && dir.isDirectory()) {

			File[] file = dir.listFiles();

			for (File f : file) {
				if (f.isFile()) {

					System.out.println("    \t " + f.getName());

				} else {

					System.out.println("<DIR>\t" + f.getName());

				}

			}

		} else {

			throw new IOException("Diretório inválido");

		}

	}

	@Override
	public void createFile(String path, String nome) throws IOException {

		File dir = new File(path);
		File arq = new File(path, nome);

		if (dir.exists() && dir.isDirectory()) {

			boolean existe = false;

			if (arq.exists()) {

				existe = true;

			}

			String conteudo = geraTxt();

			FileWriter fileWriter = new FileWriter(arq, existe);
			PrintWriter print = new PrintWriter(fileWriter);
			print.write(conteudo);
			print.flush();
			print.close();
			fileWriter.close();

		}

	}

	private String geraTxt() {

		StringBuffer buffer = new StringBuffer();
		String linha = ""; 
		
		while() {
			
		}

	}

	@Override
	public void readFile(String path, String nome) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void openFile(String path, String nome) throws IOException {
		// TODO Auto-generated method stub

	}

}
