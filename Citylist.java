import java.util.*;

class Citylist
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> cities = new ArrayList<>();

        System.out.println("Enter cities number:");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter city name:");
        for(int i = 0; i < n; i++)
        {
            cities.add(sc.nextLine());
        }

        System.out.println("Enter city to append:");
        String appendCity = sc.nextLine();
        cities.add(appendCity);

        System.out.println("Enter index:");
        int index = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter city to insert:");
        String insertCity = sc.nextLine();
        cities.add(index, insertCity);

        System.out.println("Enter city to search:");
        String searchCity = sc.nextLine();

        if (cities.contains(searchCity))
            System.out.println("City found at index: " + cities.indexOf(searchCity));
        else
            System.out.println("City not found");

        System.out.println("Enter character:");
        char ch = sc.next().charAt(0);

        System.out.println("Cities starting with " + ch + ":");
        for (String city : cities)
        {
            if (city.toLowerCase().startsWith(String.valueOf(ch).toLowerCase()))
            {
                System.out.println(city);
            }
        }

        sc.close();
    }
}
