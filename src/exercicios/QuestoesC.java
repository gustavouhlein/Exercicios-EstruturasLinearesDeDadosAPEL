package exercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class QuestoesC {

	public boolean isPalindrome(char word[]) {
		return isPalindrome(word, 0);
	}
	private boolean isPalindrome(char word[], int pos) {
		if (pos >= word.length/2)
			return true;
		if(word[word.length-pos-1] != word[pos])
			return false;
		else
			return isPalindrome(word, pos+1);
	}
	
	public static void listToFile(StaticList<Double> listaDouble) {
		String listaInvertida = "";
		for(int i = listaDouble.numElements()-1; i >= 0; i--)
			listaInvertida += " " + listaDouble.get(i) + " |";
		listaInvertida = "|" + listaInvertida;
		File file = new File ("list2File.txt");
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter (file);
			PrintWriter out = new PrintWriter (fileWriter);
			out.println(listaInvertida);
			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao escrever arquivo.");
		}
	}
	
	public StaticStack<Integer> sumStacks(StaticStack<Integer> pilha1, StaticStack<Integer> pilha2) {
		if(pilha1.numElements() != pilha2.numElements())
			throw new RuntimeException("Pilhas com tamanhos diferentes!");
		
		int qtdElementos = pilha1.numElements();
		StaticStack<Integer> pilhaSomaAux = new StaticStack<>(qtdElementos);
		StaticStack<Integer> pilhaSoma = new StaticStack<>(qtdElementos);

		for(int i = 0; i < qtdElementos; i++)
			pilhaSomaAux.push(pilha1.pop() + pilha2.pop());
		
		for(int i = 0; i < qtdElementos; i++)
			pilhaSoma.push(pilhaSomaAux.pop());
		
		return pilhaSoma;
	}
	
	public StaticQueue<Integer> matrix2queue(int[][] m) {
		int qtdElementos = m.length * m[0].length;
		StaticQueue<Integer> fila = new StaticQueue<>(qtdElementos);
		System.out.println(qtdElementos);
		
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[0].length; j++)
				if(m[i][j] % 2 == 1 && m[i][j] > - 1)
					fila.enqueue(m[i][j]);
		
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[0].length; j++)
				if(m[i][j] % 2 == 0 && m[i][j] > - 1)
					fila.enqueue(m[i][j]);
		
		return fila;
	}
}
