import java.util.*;

public class Studienberatung{
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		String temp;
		
		System.out.println("Hast du Abitur? [y / n]");
		temp = scanner.nextLine();
		
		if(temp.equals("y")){
			System.out.println("Bist du wissbegierig?");
			temp = scanner.nextLine();
			if(temp.equals("y")){
				System.out.println("Auf jeden Fall studieren");
			}
			else if(temp.equals("n")){
				System.out.println("Nicht studieren");
			}
			else{
				System.out.println("ungueltige Eingabe");
			}
		}
		else if(temp.equals("n")){
			System.out.println("Hast du Fachabitur");
			temp = scanner.nextLine();
			if(temp.equals("y")){
				System.out.println("Hast du eine Berufsausbildung?");
				temp = scanner.nextLine();
				if(temp.equals("y")){
					System.out.println("Du kannst ja speater noch studieren");
				}
				else if(temp.equals("n")){
					System.out.println("Besser boch studieren");
				}
				else{
				System.out.println("ungueltige Eingabe");
				}
			}
			else if(temp.equals("n")){
				System.out.println("Nicht studieren");
			}
			else{
				System.out.println("ungueltige Eingabe");
			}
		}
	}
}