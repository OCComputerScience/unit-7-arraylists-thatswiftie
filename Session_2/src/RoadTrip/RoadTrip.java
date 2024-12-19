package RoadTrip;

import java.util.ArrayList;

public class RoadTrip
{
    private ArrayList<GeoLocation> locations = new ArrayList<>();

    public RoadTrip(ArrayList<GeoLocation> locations)
    {
        this.locations = locations;
    }

    public void addStop(String name, double latitude, double longitude)
    {
        locations.add(new GeoLocation(longitude, latitude, name));
    }

    public int getNumberOfStops()
    {
        return locations.size();
    }

    public double getTripLength()
    {
        double sum = 0;
        for(int i = 0; i < locations.size() - 1; i++)
        {
            sum += locations.get(i).distanceFrom(locations.get(i+1));
        }
        return sum;
    }

    @Override
    public String toString() {
        String allLocations = "";
        for(int i = 0; i < locations.size(); i++){
            GeoLocation gl = locations.get(i);
            allLocations += (i + 1) + "." + gl + "\n";
        }
        return allLocations;
    }
}
