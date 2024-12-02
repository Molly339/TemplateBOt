import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        System.out.println("Welcome to P.M. Café!");
        System.out.println("I am happy to assist you on your journey today!");
        System.out.println("Here's what you can ask:");
        wonder(); 
        askQuestion(new Scanner(System.in));
    }

    public static void wonder() {
        System.out.println("1. Type 'Menu' to see what drinks and snacks we offer!");
        System.out.println("2. Type 'Hours' to see when we are open!");
        System.out.println("3. Type 'Location' to find where we are located.");
        System.out.println("4. Otherwise, type 'Exit' to leave.");
    }

    public static void askQuestion(Scanner scanner) {
        System.out.print("What would you like to know? ");
        String input = scanner.nextLine().toLowerCase();

        if (input.contains("menu")) {
            showMenu(scanner);
        } if (input.contains("hours")) {
            showHours();
        } else if (input.contains("location")) {
            showLocation();
        } else if (input.contains("exit")) {
            System.out.println("Goodbye! Thanks for visiting P.M. Café."); 
            System.out.println("Please give us a five stars if you are happy with our service!");
            System.exit(0);
        } else {
            showError();
        }

        askQuestion(scanner); 
    }


    public static void showMenu(Scanner scanner) {
        
        String[] items = {
            "Drinks:",
            "-Espresso ($3.00)",
            "-Latte ($3.50)",
            "-Americano ($3.25)",
            "-Cappuccino ($3.75)",
            "-Green Tea ($2.50)",
            "-Black Tea ($2.75)",
            "-Matcha Boba ($4.00)",
            "-Thai Boba ($4.50)"
            // " ",
            // "Food:",
            // "-Croissant ($2.50)",
            // "-Brownies ($2.75)",
            // "-Cake Pops ($3.00)",

        };

        System.out.println("Menu:");
        for (String item : items) {
            System.out.println(" " + item);
        }


        System.out.print("Please type the name of the item you'd like to order or know more about: ");
        String itemChoice = scanner.nextLine().toLowerCase();
        for (String item : items) {
            if (item.toLowerCase().contains(itemChoice)) {
            
                System.out.println("Great choice! Here's a mini description:");
                describeItem(item);
                System.out.println("Would you like to order this one?");
                System.out.println("Type 'yes' or 'no'.");
                String y = scanner.nextLine().toLowerCase();
                if (y.equalsIgnoreCase("yes")){
                    String[] drinks ={
                        "espresso", "latte", "americano","cappuccino", 
                        "green tea", "black tea", "matcha boba", "thai boba"
                    };

                    // Drink espresso = new Drink("espresso", "hot", 0, "coffee");

                    // System.out.println(espresso.getName());
                    // System.out.println(espresso.getTemp());
                    // espresso.changeTemp();
                    // System.out.println(espresso.getSweet());
                    // System.out.println(espresso.getType());

                    System.out.println("Perfect! Here is some information for your drink, you can change the temperature or the sweetness for your drink");
                    if (item.toLowerCase().contains(drinks[0])){
                        Drink espresso = new Drink("espresso", "hot", 0, "coffee");
                       
                    }
                    else if(item.toLowerCase().contains(drinks[1])){
                        Drink latte = new Drink("latte", "hot", 0,"coffee");

                    }
                    else if(item.toLowerCase().contains(drinks[2])){
                        Drink americano = new Drink("americano", "hot", 0, "coffee");

                    }
                    else if(item.toLowerCase().contains(drinks[3])){
                        Drink cappuccino = new Drink("cappuccino", "hot", 0, "coffee");

                    }
                    else if(item.toLowerCase().contains(drinks[4])){
                        Drink greenTea = new Drink("green tea", "hot", 0, "tea");

                    }
                    else if(item.toLowerCase().contains(drinks[5])){
                        Drink blackTea = new Drink("black tea", "hot", 0, "tea"); 

                    }
                    else if(item.toLowerCase().contains(drinks[6])){
                        Drink matchaBoba = new Drink("matcha boba", "hot", 0, "boba");

                    }
                    else if(item.toLowerCase().contains(drinks[7])){
                        Drink thaiBoba = new Drink("thai boba", "hot", 0, "boba");
                    }
                    System.out.println("type 'temperature' if you want to change your drink from hot to iced.");
                    System.out.println("type 'sweetness' if you want to change your drink from 0% sweetness to 100% sweetness.");
                    System.out.println("type both 'temperature' and 'sweetness' to change both!");
                    System.out.println("type 'n/a' if you don't want to change anything.");
                    String change = scanner.nextLine().toLowerCase();
                    if(change.toLowerCase().contains("temperature")){
                        if (item.toLowerCase().contains(drinks[0])){
                            Drink espresso = new Drink("espresso", "hot", 0, "coffee");
                            espresso.changeTemp();
                            System.out.println("Your drink will changed to an " + espresso.getTemp() + " drink!");
                        }
                        else if(item.toLowerCase().contains(drinks[1])){
                            Drink latte = new Drink("latte", "hot", 0,"coffee");
                            latte.changeTemp();
                            System.out.println("Your drink will changed to an " + latte.getTemp() + " drink!");

                        }
                        else if(item.toLowerCase().contains(drinks[2])){
                            Drink americano = new Drink("americano", "hot", 0, "coffee");
                            americano.changeTemp();
                            System.out.println("Your drink will changed to an " + americano.getTemp() + " drink!");

                        }
                        else if(item.toLowerCase().contains(drinks[3])){
                            Drink cappuccino = new Drink("cappuccino", "hot", 0, "coffee");
                            cappuccino.changeTemp();
                            System.out.println("Your drink will changed to an " + cappuccino.getTemp() + " drink!");

                        }
                        else if(item.toLowerCase().contains(drinks[4])){
                            Drink greenTea = new Drink("green tea", "hot", 0, "tea");
                            greenTea.changeTemp();
                            System.out.println("Your drink will changed to an " + greenTea.getTemp() + " drink!");

                        }
                        else if(item.toLowerCase().contains(drinks[5])){
                            Drink blackTea = new Drink("black tea", "hot", 0, "tea"); 
                            blackTea.changeTemp();
                            System.out.println("Your drink will changed to an " + blackTea.getTemp() + " drink!");

                        }
                        else if(item.toLowerCase().contains(drinks[6])){
                            Drink matchaBoba = new Drink("matcha boba", "hot", 0, "boba");
                            matchaBoba.changeTemp();
                            System.out.println("Your drink will changed to an " + matchaBoba.getTemp()+" drink!");

                        }
                        else if(item.toLowerCase().contains(drinks[7])){
                            Drink thaiBoba = new Drink("thai boba", "hot", 0, "boba");
                            thaiBoba.changeTemp();
                            System.out.println("Your drink will changed to an " + thaiBoba.getTemp()+" drink!");

                        }
                    }if(change.toLowerCase().contains("sweetness")){
                            if (item.toLowerCase().contains(drinks[0])){
                                Drink espresso = new Drink("espresso", "hot", 0, "coffee");
                                espresso.changeSweet();
                                System.out.println("Your drink will have the sweetness of "+ espresso.getSweet()+"%");

                            }
                            else if(item.toLowerCase().contains(drinks[1])){
                                Drink latte = new Drink("latte", "hot", 0,"coffee");
                                latte.changeSweet();
                                System.out.println("Your drink will have the sweetness of "+latte.getSweet()+"%");

                            }
                            else if(item.toLowerCase().contains(drinks[2])){
                                Drink americano = new Drink("americano", "hot", 0, "coffee");
                                americano.changeSweet();
                                System.out.println("Your drink will have the sweetness of "+ americano.getSweet()+"%");


                            }
                            else if(item.toLowerCase().contains(drinks[3])){
                                Drink cappuccino = new Drink("cappuccino", "hot", 0, "coffee");
                                cappuccino.changeSweet();
                                System.out.println("Your drink will have the sweetness of "+ cappuccino.getSweet()+"%");

                            }
                            else if(item.toLowerCase().contains(drinks[4])){
                                Drink greenTea = new Drink("green tea", "hot", 0, "tea");
                                greenTea.changeSweet();
                                System.out.println("Your drink will have the sweetness of "+ greenTea.getSweet()+"%");

                            }
                            else if(item.toLowerCase().contains(drinks[5])){
                                Drink blackTea = new Drink("black tea", "hot", 0, "tea"); 
                                blackTea.changeSweet();
                                System.out.println("Your drink will have the sweetness of "+ blackTea.getSweet()+"%");

                            }
                            else if(item.toLowerCase().contains(drinks[6])){
                                Drink matchaBoba = new Drink("matcha boba", "hot", 0, "boba");
                                matchaBoba.changeSweet();
                                System.out.println("Your drink will have the sweetness of "+ matchaBoba.getSweet()+"%");

                            }
                            else if(item.toLowerCase().contains(drinks[7])){
                                Drink thaiBoba = new Drink("thai boba", "hot", 0, "boba");
                                thaiBoba.changeSweet();
                                System.out.println("Your drink will have the sweetness of "+ thaiBoba.getSweet()+"%");

                            }else if(change.toLowerCase().contains("n/a")){
                                if (item.toLowerCase().contains(drinks[0])){
                                    Drink espresso = new Drink("espresso", "hot", 0, "coffee");
            
                                }
                                else if(item.toLowerCase().contains(drinks[1])){
                                    Drink latte = new Drink("latte", "hot", 0,"coffee");
            
                                }
                                else if(item.toLowerCase().contains(drinks[2])){
                                    Drink americano = new Drink("americano", "hot", 0, "coffee");
            
                                }
                                else if(item.toLowerCase().contains(drinks[3])){
                                    Drink cappuccino = new Drink("cappuccino", "hot", 0, "coffee");
            
                                }
                                else if(item.toLowerCase().contains(drinks[4])){
                                    Drink greenTea = new Drink("green tea", "hot", 0, "tea");
            
                                }
                                else if(item.toLowerCase().contains(drinks[5])){
                                    Drink blackTea = new Drink("black tea", "hot", 0, "tea"); 
            
                                }
                                else if(item.toLowerCase().contains(drinks[6])){
                                    Drink matchaBoba = new Drink("matcha boba", "hot", 0, "boba");
            
                                }
                                else if(item.toLowerCase().contains(drinks[7])){
                                    Drink thaiBoba = new Drink("thai boba", "hot", 0, "boba");
                                }
                            }
                            System.out.println("Your drink will be ready in 5 minutes!");
                            askQuestion(scanner); 
                    }


                
                else if (y.equalsIgnoreCase("no")){
                    System.out.println("Thats okay! Would you like to explore any of our other options?");
                    wonder();
                    askQuestion(scanner);
                }
            }
        }
    }
    }

        

    public static void describeItem(String item) {
       
        if (item.toLowerCase().contains("espresso")) {
            System.out.println("Espresso - A strong black coffee made by forcing steam through ground coffee beans.");
        } else if (item.toLowerCase().contains("latte")) {
            System.out.println("Latte - Espresso mixed with steamed milk, making it smooth and creamy.");
        } else if (item.toLowerCase().contains("americano")) {
            System.out.println("Americano - Espresso diluted with hot water for a smoother taste.");
        } else if (item.toLowerCase().contains("cappuccino")) {
            System.out.println("Cappuccino - Espresso with steamed milk foam for a rich taste.");
        } else if (item.toLowerCase().contains("green tea")) {
            System.out.println("Green Tea - A mild and refreshing tea with subtle flavors.");
        } else if (item.toLowerCase().contains("black tea")) {
            System.out.println("Black Tea - A strong and full-bodied tea with robust flavor.");
        // } else if (item.toLowerCase().contains("croissant")) {
        //     System.out.println("Croissant - Flaky and buttery pastry, perfect for breakfast.");
        // } else if (item.toLowerCase().contains("brownies")) {
        //     System.out.println("Brownies - Rich chocolate squares with a chewy texture.");
        // } else if (item.toLowerCase().contains("cake pops")) {
        //     System.out.println("Cake Pops - Miniature cakes on a stick, decorated for fun.");
        } else if (item.toLowerCase().contains("matcha boba")) {
            System.out.println("Matcha Boba - Sweet matcha-flavored milk tea with chewy boba pearls.");
        } else if (item.toLowerCase().contains("thai boba")) {
            System.out.println("Thai Boba - Sweet milk tea with Thai spices and chewy boba pearls.");
        }
    }


    public static void showHours() {
        System.out.println("\nWe are open:");
        System.out.println("Monday-Friday: 7 AM - 7 PM");
        System.out.println("Saturday-Sunday: 8 AM - 5 PM");
    }

    public static void showLocation() {
        System.out.println("\nWe are located at Mr. Thai's classroom!");
    }

    public static void showError() {
        String[] errorResponses = {
            "I didn't catch that. Could you rephrase?",
            "Hmm, I'm not sure I understand. Try asking again!",
            "Sorry, I didn't get that. Can you try something else?",
            "Oops, that option isn't available. Check our menu options again!",
            "Apologies! I'm not sure how to respond to that."
        };
        int randomIndex = (int) (Math.random() * errorResponses.length);
        System.out.println("\n" + errorResponses[randomIndex]);
    }
}