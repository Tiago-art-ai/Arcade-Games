import java.util.Scanner;

import service.ArcadeService;

public class ArcadeGamesApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean isRunning = true;
		
		ArcadeService arcadeService = new ArcadeService();
		
		while (isRunning)
		{
			System.out.println("Scegli comando ");
			System.out.println("1) Aggiungi gioco alla lista: ");
			System.out.println("2) Vedi tutta la lista ");
			System.out.println("3) Cerca il gioco che vuoi: ");
			System.out.println("4) Gioci Difficile (Livello di difficoltà > 4)");
			System.out.println("5) Esci ");
			
			String choose = scanner.nextLine();
			
			if (choose.equals("1"))
			{
				System.out.println("Inserisci il nome del nuovo gioco: ");
				String name = scanner.nextLine();
				System.out.println("Inserisci la data di uscita del nuovo gioco: ");
				int release = scanner.nextInt();
				System.out.println("Inserisci la difficoltà del nuovo gioco: ");
				int difficultLevel = scanner.nextInt();
				
				arcadeService.insertGame(name, release, difficultLevel);
			}
			
			else if (choose.equals("2"))
			{
				arcadeService.printGame();
			}
			
			else if (choose.equals("3"))
			{
				System.out.println("Quale gioco vuoi cercare? ");
				String gameName = scanner.nextLine();
				arcadeService.searchGame(gameName);
			}
			
			else if (choose.equals("5"))
			{
				isRunning = false;
				System.out.println("Ciao!1 <3");
			}
			
			
		}
		
		scanner.close();

	}

}
