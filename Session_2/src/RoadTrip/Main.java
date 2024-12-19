package RoadTrip;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<GeoLocation> locations = new ArrayList<>();
        locations.add(new GeoLocation(41.78583, -70.87167, "OC"));
        locations.add(new GeoLocation(44.8549, -93.2422, "Mall Of America"));
        locations.add(new GeoLocation(48.8584, 2.2945, "Eiffel Tower"));
        RoadTrip bestLocations = new RoadTrip(locations);
        System.out.println(bestLocations);
        System.out.println("Stops: " + bestLocations.getNumberOfStops());
        System.out.println("Total Miles: " + bestLocations.getTripLength());
        bestLocations.addStop("Disney World", 28.3772, -81.5707);
        System.out.println();
        System.out.println(bestLocations);
        System.out.println("Stops: " + bestLocations.getNumberOfStops());
        System.out.println("Total Miles: " + bestLocations.getTripLength());
    }
}
