package _10_happy_pet;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static int cuddlePoints = 0;
	static int feedPoints = 0;
	static int walkPoints = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");


		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
					
					if (pet.equalsIgnoreCase("dog")){
						walkPoints = 3;
						cuddlePoints = 3;
						feedPoints = 3;
								}
					if (pet.equalsIgnoreCase("fish")){
						walkPoints = -10;
						cuddlePoints = -5;
						feedPoints = 5;
					}
					if (pet.equalsIgnoreCase("cat")){
						walkPoints = 3;
						cuddlePoints = 3;
						feedPoints = 3;
					}
					if (pet.equalsIgnoreCase("snake")){
						walkPoints = 0;
						cuddlePoints = 0;
						feedPoints = 3;
					}
					for (int i = 0; i < 10; i++) {	
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Pet's Current Happiness: " + happinessLevel, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Talk for a walk" }, null);
					System.out.println(task);
					
					if (task == 0) {
						walk();
					}
					if (task == 1) {
						feed();
					}
					if (task == 2) {
						cuddle();
					}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
					if (happinessLevel >= 15) {
						
						JOptionPane.showMessageDialog(null, "Your pet loves you!");
						break;
						
					}
					}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void cuddle() {
		happinessLevel += cuddlePoints;
	}
	static void feed() {
		happinessLevel += feedPoints;
	}
	static void walk() {
		happinessLevel += walkPoints;
	}
}