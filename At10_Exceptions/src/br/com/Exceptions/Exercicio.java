//  Exercício 1 – Checked Exception (Obrigatória)

package br.com.Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio {
	public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("meuarquivo.txt");
            BufferedReader br = new BufferedReader(fr);

            String linha = br.readLine();
            System.out.println("Conteúdo do arquivo: " + linha);

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo!");
        }
    }

}
