package service;

import java.util.ArrayList;

import models.Arcade;

public class ArcadeService {
	
	private ArrayList<Arcade> arcades = new ArrayList<Arcade>();

	public void insertGame(String n, int r, int d)
	{
		Arcade arcade = new Arcade(n,r,d);
		this.arcades.add(arcade);
	}
	
	public void printGame()
	{
		for (int i = 0; i < this.arcades.size() ; i++)
		{
			System.out.println(this.arcades.get(i));
		}
	}
	
	public void searchGame(String search)
	{
		for (int i = 0; i < this.arcades.size(); i++)
		{
			if (this.arcades.get(i).getName().equals(search));
			{
				System.out.println("Il nome del gioco è " + this.arcades.get(i).getName()+" è uscito l'anno "+this.arcades.get(i).getRelease()+" e la sua difficoltà è "+this.arcades.get(i).getDifficultLevel());
			}
		}
	}

}
