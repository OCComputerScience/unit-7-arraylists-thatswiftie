package FantasyFootball;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);


        ArrayList<String> roster = new ArrayList<String>(5);
        Scanner input = new Scanner(System.in);
        System.out.println("Add five players to your team");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter name of player you would like to add");
            String player = input.nextLine();
            if(checkForPlayer(availablePlayers, player))
            {
                System.out.println("Successfully added player");
                roster += player;
            }
        }
    }

    public static boolean checkForPlayer(ArrayList playerList, String player)
    {
        for(int i = 0; i < playerList.size(); i++)
        {
            if(player.equals(playerList.get(i)))
            {
                return true;
            }
        }
        return false;
    }

    public static void addPlayers(ArrayList<String> array)
    {
        array.add("Frodo");
        array.add("Gandalf");
        array.add("Aragorn");
        array.add("Legolas");
        array.add("Gimli");
        array.add("Samwise");
        array.add("Bilbo");
        array.add("Gollum");
        array.add("Thorin");
        array.add("Balin");
        array.add("Galadriel");
        array.add("Elrond");
        array.add("Sauron");
        array.add("Melkor");
        array.add("Lúthien");
    }
}
