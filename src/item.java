import java.util.ArrayList;
import java.util.Scanner;
public class item {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean start = true;
        while (start){
            System.out.println("Enter start to start the program and enter quit if you want to quit.");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("quit")){
                start = false;
            }
            else {
                ArrayList<Integer> myarray = new ArrayList<>();
                System.out.println("Enter your ID: ");
                String id = sc.nextLine();
                System.out.println("Enter your password: ");
                String pass = sc.nextLine();
                System.out.println("Logged in Succesfully.");
                System.out.println("Enter the number of items you have purchased.");
                int num = sc.nextInt();
                for (int i = 0; i < num; i++) {
                    System.out.println("Enter amount: ");
                    int amount = sc.nextInt();
                    myarray.add(num);
                }
                System.out.println("Enter true if you want to include Vat else enter false.");
                boolean vat = sc.nextBoolean();
                int price = 0;
                for (int i = 0; i < num; i++) {
                    price = price + myarray.get(i);
                }
                if (vat) {
                    price = price * (13 / 100);
                    System.out.println(price);
                    System.out.println("Enter true if you want to include discount else enter false.");
                    boolean discount = sc.nextBoolean();

                    if (discount) {
                        System.out.println("Enter the amount of discount to be given.");
                        int discountAmt = sc.nextInt();
                        price = price - (price *discountAmt/100);
                        System.out.println("The final amount to be paid is: "+" "+ price);
                        System.out.println("Enter the amount of cash you want to pay.");
                        int cash = sc.nextInt();

                        if (cash >= price){
                            cash = cash - price;
                            if(cash >= 1000){
                                int note1 = cash/1000;
                                cash = cash - (note1*1000);
                                System.out.println("1000: "+note1);
                        }
                            if(cash >= 500){
                                int note2 = cash/500;
                                cash = cash - (note2*500);
                                System.out.println("500: "+note2);
                            }
                            if(cash >= 100){
                                int note3 = cash/100;
                                cash = cash - (note3*100);
                                System.out.println("100: "+note3);
                            }
                            if(cash >= 50){
                                int note4 = cash/50;
                                cash = cash - (note4*50);
                                System.out.println("50: "+note4);
                            }
                            if(cash >= 20){
                                int note5 = cash/20;
                                cash = cash - (note5*20);
                                System.out.println("20: "+note5);
                            }
                            if(cash >= 10){
                                int note6 = cash/10;
                                cash = cash - (note6*10);
                                System.out.println("10: "+note6);
                            }
                            if(cash >= 5){
                                int note7 = cash/5;
                                cash = cash - (note7*5);
                                System.out.println("5: "+note7);
                            }
                    }
                        else{
                            System.out.println("Discount is not added.");
                        }
                }
                    else{
                        System.out.println("Vat is not included.");
                    }
                }

            }
        }
    }
}
