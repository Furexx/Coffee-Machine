package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static Scanner scanner = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int cups = 9;
    static int money = 550;


    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            System.out.println();
            switch (action){

                case "buy" :
                    buyCoffee();
                    break;

                case "fill":
                    fillMachine();
                    break;

                case "take":
                    takeProfit();
                    break;

                case "exit":
                    loop = false;
                    break;

                case "remaining":
                    showStats();
                    break;

                default:
                    break;
            }

        }


    }


public static void fillMachine() {
        System.out.println("Write how many ml of water the coffee machine has:");
        int havingWater = scanner.nextInt();
        water += havingWater;

        System.out.println("Write how many ml of milk the coffee machine has:");
        int havingMilk = scanner.nextInt();
        milk += havingMilk;

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int havingCoffee = scanner.nextInt();
        coffee += havingCoffee;

        System.out.println("Write how many disposable cups of coffee you will need:");
        int havingCups = scanner.nextInt();
        cups += havingCups;
        scanner.nextLine();
}

    public static void showStats(){
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water\n",water);
        System.out.printf("%d ml of milk\n",milk);
        System.out.printf("%d g of coffee beans\n",coffee);
        System.out.printf("%d disposable cups\n",cups);
        System.out.printf("$%d of money\n",money);
        System.out.println();
    }


    public static void buyCoffee(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino,back - to main menu:");
        String coffeeVar = scanner.nextLine();
        if (coffeeVar.equals("1")){
            if (cups >= 1 && water >= 250 && coffee >= 16) {
                System.out.println("I have enough resources, making you a coffee!\n");
                cups -= 1;
                water -= 250;
                coffee -= 16;
                money += 4;
            }
            else if (water < 250){
                System.out.println("Sorry, not enough water\n");
            }
            else if (coffee < 16){
                System.out.println("Sorry, not enough coffee beans\n");
            }
            else {
                System.out.println("Sorry, not enough cups\n");
            }
        }
        if (coffeeVar.equals("2")){
            if (cups >= 1 && water >= 350 && milk >= 75 && coffee >= 20) {
                System.out.println("I have enough resources, making you a coffee!\n");
                cups -= 1;
                water -= 350;
                milk -= 75;
                coffee -= 20;
                money += 7;
            }
            else if (water < 350){
                System.out.println("Sorry, not enough water\n");
            }
            else if (milk < 75){
                System.out.println("Sorry, not enough milk\n");
            }
            else if (coffee < 20){
                System.out.println("Sorry, not enough coffee beans\n");
            }
            else {
                System.out.println("Sorry, not enough cups\n");
            }
        }
        if (coffeeVar.equals("3")){
            if (cups >= 1 && water >= 200 && milk >= 100 && coffee >= 12) {
                System.out.println("I have enough resources, making you a coffee!\n");
                cups -= 1;
                water -= 200;
                milk -= 100;
                coffee -= 12;
                money += 6;
            }
            else if (water < 200){
                System.out.println("Sorry, not enough water\n");
            }
            else if (milk < 100){
                System.out.println("Sorry, not enough milk\n");
            }
            else if (coffee < 12){
                System.out.println("Sorry, not enough coffee beans\n");
            }
            else {
                System.out.println("Sorry, not enough cups\n");
            }
        }
    }

    public static void takeProfit(){
        System.out.printf("I gave you $%d\n",money);
        System.out.println();
        money = 0;
    }
}
