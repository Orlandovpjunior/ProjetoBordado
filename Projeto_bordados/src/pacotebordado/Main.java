package pacotebordado;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println(menu.exibeMenu());
			String escolha = scanner.nextLine();
			menu.escolhaDeAcao(escolha);
		}
		
	}

}
