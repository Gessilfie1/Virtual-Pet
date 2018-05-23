package me.gessilfie.virtualpet;

import java.util.Random;
import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("KONO THE MUTANT LAB RAT:....Please enter your name.");
		String name = input.nextLine();

		VirtualPet pet = new VirtualPet(name);
		System.out.println("Hi " + pet.getName() + "! Let's have some fun");

		backStory(" Let's go!");

		int select;

		do {
			System.out.println("Pick a number.");
			System.out.println("[0] Quit. ");
			System.out.println("[1] Play with Kono");
			System.out.println("[2] Feed Kono");
			System.out.println("[3] Relax and watch a movie with Kono ");

			select = input.nextInt();

			if (select == 0) {
				continue;

			}

			else if (select == 1) { // Play with Kono

				if (pet.getHunger() + 1 > 6) {// if hunger reaches max
					System.out.println(
							"Alright...That's enough. I'm running my tail off here. Get me some food before I pass out.");

					continue;
				}

				if (pet.getSleepy() + 1 > 6) { // if sleepy reaches max
					System.out.println(" I'm tired. I need some chill time. Let's go watch a movie or somethin'");

					continue;
				}

				System.out.println("Let's go out and play! Avoid that mouse trap obstacle course!");
				pet.modifyHunger(1);
				pet.modifySleepy(1);

			}

			else if (select == 2) {// Feed Kono

				// If hunger reaches minimum
				if (pet.getHunger() - 1 < 0) {
					System.out.println("ugggg....no more. One more bite of cheese and I'm gonna throw up.");
					continue;
				}

				if (pet.getSleepy() + 1 > 6) { // if sleepy reaches max
					System.out.println(" I'm tired. I need some chill time. Let's go watch a movie or somethin'");

					continue;
				}

				System.out.println("mmmhh mmhh delicious...cheese is my favorite.");
				// hunger -= 1 hunger goes down.
				pet.modifyHunger(-1);
				pet.modifySleepy(1);

			}

			else if (select == 3) {// Chill and relax with pet
				// If Boredom is at max 5.

				if (pet.getBoredom() + 1 > 6) {
					System.out.println("I'm bored. Let's go out and Play!");

					continue;
				}

				System.out.println("Let's pick a movie!");
				// boredom += 1 boredom goes up.
				pet.modifyBoredom(1);

				String[] movies = new String[] { "Tom and Jerry. ", "Ratatouille ", "3 Blind Mice " };
				// randomize the movie it picks when selected
				System.out.println(movies[rand.nextInt(movies.length)]);

			}

			else {
				System.out.println("Invalid selection. Please select one of the numbers listed");
			}

			// pet.tick();

		} while (select != 0);

	}

	public static void backStory(String msg) {
		System.out.println(
				"Kono accidentally swallowed some test solution which is causing some extreme swings in his heart rate."
						+ "\nWe must manage his heart by playing with him to keep his heart rate up"
						+ "\nor make him relax and watch some of his favorite movies to bring his heart rate down."
						+ "\nWe also need to get him food to replenish his energy every once in a while " + msg);
	}

}
