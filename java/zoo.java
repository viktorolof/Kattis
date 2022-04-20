import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.Collections;

public class zoo {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int animals = scan.nextInt();
        int listCounter = 1;

        while(animals != 0) {
            scan.nextLine();
            System.out.println("List " + listCounter + ":");
            HashMap<String, Integer> amountOfAnimals = new HashMap<>();
            ArrayList<String> names = new ArrayList<>();
            for(int i = 0 ; i < animals ; i++) {
                String animalName = scan.nextLine();
                String [] strings = animalName.split("\\s+");
                String nameToMap = strings[strings.length -1].toLowerCase(Locale.ROOT);
                if(amountOfAnimals.containsKey(nameToMap)) {
                    amountOfAnimals.put(nameToMap, amountOfAnimals.get(nameToMap) + 1);
                }
                else {
                    amountOfAnimals.put(nameToMap, 1);
                    names.add(nameToMap);
                }
            }
            animals = scan.nextInt();
            listCounter++;
            Collections.sort(names);
            for (String name : names) {
                System.out.println(name + " | " + amountOfAnimals.get(name));
            }
        }
    }


}
