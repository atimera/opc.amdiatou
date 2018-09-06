package com.ocr.anthony;

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
        System.out.println("Vous avez choisi le menu " + nbMenu);
    }
}