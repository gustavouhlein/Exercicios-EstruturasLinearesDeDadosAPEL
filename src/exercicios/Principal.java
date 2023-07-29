package exercicios;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Exercício 1:");
		DoublyLinkedList<Integer> listaInteger1 = new DoublyLinkedList<>();
		listaInteger1.insert(5, 0);
		listaInteger1.insert(10, 1);
		listaInteger1.insert(15, 2);
		listaInteger1.insert(20, 3);
		listaInteger1.insert(25, 4);
		listaInteger1.insert(20, 5);
		listaInteger1.insert(20, 6);
		System.out.println(listaInteger1);
		listaInteger1.moveToFirst(20);
		System.out.println(listaInteger1);
		
		/********************/

		QuestoesC manipulador = new QuestoesC();		
		System.out.println("\nExercício 2:");
		char[] arrayCaracteres = new char[6];
		arrayCaracteres[0] = 'R';
		arrayCaracteres[1] = 'E';
		arrayCaracteres[2] = 'N';
		arrayCaracteres[3] = 'N';
		arrayCaracteres[4] = 'E';
		arrayCaracteres[5] = 'R';
		System.out.println(manipulador.isPalindrome(arrayCaracteres));
		
		/********************/

		System.out.println("\nExercício 3a:");
		StaticList<Double> listaDouble1 = new StaticList(10);
		listaDouble1.insert(1.0, 0);
		listaDouble1.insert(2.1, 1);
		listaDouble1.insert(3.2, 2);
		listaDouble1.insert(4.3, 3);
		manipulador.listToFile(listaDouble1);
		System.out.println(listaDouble1);
		
		/********************/

		System.out.println("\nExercício 3b:");
		StaticStack<Integer> pilhaInteger1 = new StaticStack(10);
		StaticStack<Integer> pilhaInteger2 = new StaticStack(10);
		pilhaInteger1.push(1);
		pilhaInteger1.push(3);
		pilhaInteger1.push(5);
		pilhaInteger1.push(7);
		pilhaInteger2.push(2);
		pilhaInteger2.push(4);
		pilhaInteger2.push(6);
		pilhaInteger2.push(8);
		System.out.println(pilhaInteger1);
		System.out.println(pilhaInteger2);
		System.out.println(manipulador.sumStacks(pilhaInteger1, pilhaInteger2));
		
		/********************/
		System.out.println("\nExercício 4:");
		int[][] arrayBi = new int[3][6];
		arrayBi[0][0] = 1;
		arrayBi[0][1] = 6;
		arrayBi[0][2] = -5;
		arrayBi[0][3] = 4;
		arrayBi[0][4] = 2;
		arrayBi[0][5] = 8;
		arrayBi[1][0] = 9;
		arrayBi[1][1] = 10;
		arrayBi[1][2] = 0;
		arrayBi[1][3] = -1;
		arrayBi[1][4] = 3;
		arrayBi[1][5] = -7;
		arrayBi[2][0] = -2;
		arrayBi[2][1] = 90;
		arrayBi[2][2] = -11;
		arrayBi[2][3] = 5;
		arrayBi[2][4] = 68;
		arrayBi[2][5] = 10;
		StaticQueue<Integer> filaInteger1 = manipulador.matrix2queue(arrayBi);
		System.out.println(filaInteger1);
		System.out.println("Front: " + filaInteger1.front());
		System.out.println("Back: " + filaInteger1.back());
	}
}
