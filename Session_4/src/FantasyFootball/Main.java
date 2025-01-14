package FantasyFootball;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);


        String[] roster = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Add five players to your team");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter name of player you would like to add");
            String player = input.nextLine();
            if(search(availablePlayers, player) != -1) {
                System.out.println("Successfully added player");
                availablePlayers.remove(search(availablePlayers,player));
                roster[i] = player;
            }
            else
            {
                System.out.println(player + " is not an availible player ");
                i--;
            }
        }
        System.out.println("Final Team Roster:");
        for(int i = 0; i < roster.length; i++)
        {
            System.out.println(roster[i]);
        }
    }

    public static int search(ArrayList playerList, String player)
    {
        if(playerList.isEmpty()) return -1;
        for(int i = 0; i < playerList.size(); i++)
        {
            if(player.equals(playerList.get(i)))
            {
                return i;
            }
        }
        return -1;
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
