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
		
		System.out.println("Qual � a tabuada que voc� quer executar?");
		num = scanner.nextInt();
		
		System.out.println("At� qual n�mero quer executar?");
		num2 = scanner.nextInt();
		
		for (int i = 1; i < num2+1; i++) {
			System.out.println(i + "X" + num + "=" + i*num);
		}

	}

}
