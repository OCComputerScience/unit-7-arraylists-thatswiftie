package BillBoardTop10;

import java.util.ArrayList;

public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<>();

    /*Slightly confused by directions
    Musician tSwizzle = new Musician("Taylor Swift", 427, 114000000);
    Musician sabrinaCarpenter = new Musician("Sabrina Carpenter", 83, 11300000);
    Musician oliviaRod = new Musician("Olivia Rodrigo", 137, 17400000);
    Musician tylerCreate = new Musician("Tyler The Creator", 21, 7000000);
    Musician billieEilish = new Musician("Billie Eilish", 228, 10576207);
    */

    public void add(Musician artist)
    {
        if(top10.size() < 10 && artist.getIsPlatinum())
        {
            top10.add(artist);
        }
        else if(top10.size() == 10 && artist.getIsPlatinum())
        {
            replace(artist);
        }
        else
        {
            System.out.println("Could not add artist to Top ten");
        }
    }
    public void replace(Musician artist)
    {
        Musician loser = top10.get(0);
        int idxOfMinWeeks = 0;
        for(int i = 0; i < top10.size(); i++)
        {
            if(loser.getWeeksInTop40() > top10.get(i).getWeeksInTop40())
            {
                loser = top10.get(i);
                idxOfMinWeeks = i;
            }
        }
        if(artist.getWeeksInTop40() > loser.getWeeksInTop40())
        {
            top10.remove(idxOfMinWeeks);
            top10.add(artist);
            System.out.println("The musician " + loser.getName() + " has been replaced by " + artist.getName());
        }
        else
        {
            System.out.println("Sorry, " + artist.getName() + " has less weeks in the Top 40 than other Musicians");
        }
    }
    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}
