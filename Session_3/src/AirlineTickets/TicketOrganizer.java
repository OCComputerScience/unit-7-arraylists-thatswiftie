package AirlineTickets;

import java.util.ArrayList;

public class TicketOrganizer
{
    ArrayList<AirlineTicket> tickets = new ArrayList<>();

    public TicketOrganizer(ArrayList<AirlineTicket> tickets)
    {
        this.tickets = tickets;
    }
    public ArrayList<AirlineTicket> getTickets()
    {
        return tickets;
    }
    public void printPassengersByBoardingGroup()
    {
        int maxGroups = 5;
        for(int i = 1; i <= maxGroups; i++)
        {
            System.out.println("Boarding Group " + i + ":");
            for(int j = 0; j < tickets.size(); j++)
            {
                if(tickets.get(j).getBoardingGroup() == i)
                {
                    System.out.println(tickets.get(j).getName());
                }
            }
        }
    }
    public void canBoardTogether()
    {
        int count = 0;
        for(int i = 0; i < tickets.size() - 1; i++)
        {
            for(int j = i + 1; j < tickets.size(); j++)
            {
                if(tickets.get(i).getRow() == tickets.get(j).getRow() && tickets.get(i).getBoardingGroup() == tickets.get(j).getBoardingGroup())
                {
                    System.out.println(tickets.get(i).getName() + " can board with " + tickets.get(j).getName());
                    count++;
                }
            }
        }
        if(count == 0)
        {
            System.out.println("No passengers can board together");
        }
    }
}
