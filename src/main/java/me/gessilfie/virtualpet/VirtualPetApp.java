package me.gessilfie.virtualpet;

import java.util.Random;
import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Welcome to Virtual Pet....Please give a name for your pet!");
		String name = input.nextLine();

		VirtualPet pet = new VirtualPet(name);
		System.out.println("Let's have some fun with, " + pet.getName() + "!");

		int select;

		do {
			System.out.println("What do you want to do? Please pick a number.");
			System.out.println("[0] Quit. ");
			System.out.println("[1] Play with " + pet.getName());
			System.out.println("[2] Feed " + pet.getName());
			System.out.println("[3] Chill and relax with " + pet.getName());

			select = input.nextInt();

			if (select == 0) {
				continue;
			}

			else if (select == 1) { // Play with pet

				if (pet.getBoredom() - 1 < 0) {
					System.out.println("Alright " + pet.getName() + " that's enough fetch for today");
					
					continue;
				}

				if (pet.getSleepy() + 1 > 5) {
					System.out.println(pet.getName() + " has reached it's max and needs rest");
					
					continue;
				}

				System.out.println("Let's go " + pet.getName() + " run and fetch!");				
				pet.modifySleepy(1);				
				pet.modifyBoredom(-1);
			}

			else if (select == 2) {// Feed pet

				// If hunger goes below 0
				if (pet.getHunger() - 1 < 0) {
					System.out.println("I am full and can't eat anymore");
					continue;
				}
				// If thirst is at max 5.
				if (pet.getThirst() + 1 > 5) {
					System.out.println("I need some water");
					continue;
				}
				System.out.println("mmmhh mmhh delicious");
				// hunger -= 1 hunger goes down.
				pet.modifyHunger(-1);
				// thirst += 1 thirst goes up.
				pet.modifyThirst(1);
			}

			else if (select == 3) {// Chill and relax with pet
				// If Boredom is at max 5.

				if (pet.getBoredom() + 1 > 5) {
					System.out.println("I'm bored. Let's go out and Play!");
					
					continue;
				}
				
				System.out.println("Let's pick a movie!");
					// boredom += 1 boredom goes up.
					pet.modifyBoredom(1);
					
					String [] movies = new String [] {
							"101 Dalmatians. ",
							"Lady and the Trump ",
							"Homeward Bound "
					};

					System.out.println(movies[rand.nextInt(movies.length)]);
					
					}
				

			else {
				System.out.println("Invalid selection. Please select one of the numbers listed");
			}
			
		} while (select != 0);

	}

}
