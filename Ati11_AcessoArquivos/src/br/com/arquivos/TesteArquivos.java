package br.com.arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivos {
	
	public static void main(String[] args) {
		
		String nomeDoArquivo = "estoque.csv";                  // Arquivo onde o conteúdo será gravado
		String diretorio = System.getProperty("user.home");    // Pasta onde o arquivo será gravado
		String caminho = diretorio + "\\" + nomeDoArquivo;     // Concatena para ter o caminho completo do arquivo
		
		List<String> conteudo = new ArrayList<>();             // Conjunto de infos. que serão armazenadas no arquivo
		conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade;");
		conteudo.add("Pera; 200; pct; R$ 5.40;");
		conteudo.add("Morango; 400; cx; R$ 6.50;");
		conteudo.add("Abacaxi; 280; un; R$ 5.00;");
		conteudo.add("Uva; 300; cx; R$ 10.00;");
		
		gravarEstoque(nomeDoArquivo, caminho, conteudo);       // Método responsável por gravar conteúdo no arquivo
		lerEstoque(caminho);                                   // Método responsável por ler o conteúdo do arquivo
		
		
		File arquivo = new File(caminho);

		if (arquivo.exists()) {
		    // O arquivo já existe
		    System.out.println("O arquivo existe!" +
		        "\nPode ser lido: " + arquivo.canRead() +         // true/false
		        "\nPode ser gravado: " + arquivo.canWrite() +     // true/false
		        "\nTamanho: " + arquivo.length() +                // em bytes
		        "\nCaminho: " + arquivo.getPath());               // caminho completo
		}
		
		else {
		    try {
		        if (arquivo.createNewFile()) {
		            System.out.println("Arquivo criado!");
		        } else {
		            System.out.println("Arquivo não criado!");
		        }
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
		
		File fDiretorio = new File(diretorio);
		
		if (fDiretorio.exists()) {
		    System.out.println("Diretório existe!");
		}else {
		    if (fDiretorio.mkdir()) {
		        System.out.println("Diretório criado!");
		    } else {
		        System.out.println("Diretório não criado.");
		    }
		}
	}
	
	
	
	
	private static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) {

	    // Cria os objetos responsáveis por gravar no arquivo
	    FileWriter stream;      // Classe usada para escrever caracteres em um arquivo
	    PrintWriter print;      // Classe usada para escrever linhas de texto de forma mais simples

	    try {
	        // Instancia o FileWriter apontando para o caminho completo do arquivo
	        stream = new FileWriter(caminho);

	        // Instancia o PrintWriter usando o FileWriter como base
	        print = new PrintWriter(stream);

	        // Percorre todas as linhas da lista de conteúdo
	        for (String linha : conteudo) {
	            // Escreve cada linha no arquivo e quebra a linha automaticamente
	            print.println(linha);
	        }

	        // Fecha os recursos para garantir que tudo seja gravado corretamente
	        print.close();   // Fecha o PrintWriter
	        stream.close();  // Fecha o FileWriter

	        // Exibe uma mensagem de sucesso com o caminho do arquivo
	        System.out.println("O arquivo " + nomeDoArquivo + " foi salvo em " + caminho);

	    } catch (IOException e) {
	        // Caso ocorra um erro ao tentar gravar no arquivo, imprime o erro no console
	        e.printStackTrace();
	    }
		
	}
	
	

	
	private static void lerEstoque(String caminho) {
	    try {
	        // Abre o arquivo
	        FileReader stream = new FileReader(caminho);

	        // BufferedReader possui o método readLine()
	        // Lê uma linha do arquivo e retorna uma String com o valor lido ou null
	        BufferedReader reader = new BufferedReader(stream);

	        // Lê uma linha do arquivo
	        String linha = reader.readLine();

	        // Enquanto linha for diferente de null
	        while (linha != null) {

	            System.out.println(linha); // Imprime a linha

	            // Lê a próxima linha do arquivo
	            linha = reader.readLine();
	        }

	        reader.close(); // Fecha o leitor
	        stream.close(); // Fecha o arquivo

	    } catch (IOException e) {
	        e.printStackTrace(); // Exibe erro, se houver
	    }
	    
	}

}














