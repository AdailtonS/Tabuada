import java.util.Scanner;

/**
 * 
 */

/**
 * @author AGJ
 *
 */
public class Tabuada {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num;
		int num2;
		
		System.out.println("Qual é a tabuada que você quer executar?");
		num = scanner.nextInt();
		
		System.out.println("Até qual número quer executar?");
		num2 = scanner.nextInt();
		
		for (int i = 1; i < num2+1; i++) {
			System.out.println(i + "X" + num + "=" + i*num);
		}

	}

}
