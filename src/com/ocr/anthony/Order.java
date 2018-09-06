package com.ocr.anthony;

import java.util.Scanner;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix Menu");
        System.out.println("1 - poulet");
        System.out.println("2 - Boeuf");
        System.out.println("3 - Végétatien");
        System.out.println("4 - Poisson");
        System.out.println("Que souhaitez-vous comme menu ?");
    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        if(nbMenu == 1){
            System.out.println("Vous avez choisi comme menu : poulet");
        }else if(nbMenu == 2){
            System.out.println("Vous avez choisi comme menu : boeuf");
        }else if(nbMenu == 3){
            System.out.println("Vous avez choisi comme menu : végétarien");
        }else if (nbMenu == 4){
            System.out.println("Vous avez choisi comme menu : poisson");
        }else {
            System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
        }
    }

    /**
     * Run asking process for a menu.
     */
    public void runMenu(){
        this.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        this.displaySelectedMenu(nb);
    }
}