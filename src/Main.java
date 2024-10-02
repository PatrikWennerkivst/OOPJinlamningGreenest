import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public Main() {

        boolean dialogWindow = true;
        boolean foundPlantInArray = false;

        Greenest Laura = new Palms("Laura", 5);
        Greenest Olof = new Palms("Olof", 1);
        Greenest Meatloaf = new MeatEatingPlant("Meatloaf", 0.7);
        Greenest Igge = new Cactus("Igge", 0.2);

        List<Greenest> listOfPlants = Arrays.asList(Laura, Olof, Meatloaf, Igge);

        while (dialogWindow) {
            String userInput = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");

            if (userInput == null) {
                dialogWindow = false;
                continue;
            }

            for (int i = 0; i < listOfPlants.size(); i++) {
                if (userInput.equalsIgnoreCase(listOfPlants.get(i).getName())) {
                    //Här har jag använt polymorfism eftersom att jag hämtar den önskade metoden från rätt klass
                    listOfPlants.get(i).lastMessage();
                    foundPlantInArray = true;
                    break;
                }
            }
            if (foundPlantInArray != true) {
                JOptionPane.showMessageDialog(null, userInput + " finns inte på hotellet.\nFörsök igen.");
            }
        }
    }

    public static void main (String[]args) {
        Main main = new Main();
    }
}

