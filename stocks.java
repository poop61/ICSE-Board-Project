
import java.util.*;
class stocks
{
        int choice_num;
        char ch;
        Scanner sc=new Scanner(System.in);
        void display()
        {
            System.out.println();
            System.out.println("WHAT WOULD YOU LIKE TO DO?");
            System.out.println("1. See the list of products");
            System.out.println("2. Remove items from stock");
            System.out.println("3. Add items to stock");
            System.out.println("4. Get to know which item needs restocking");
            System.out.println("5. Get the information for a product");
            System.out.println("6. Sell or deliver an item");
            System.out.print("Enter the number of the function you would like to perform: ");
            choice_num=sc.nextInt();
            System.out.println("\f");
        }
        void select(String name[], String category[] ,double price[], int quantity[], int min[], int max[], long code[])
        {   
            stock_functions obj=new stock_functions();
            switch(choice_num)
            {
                case 1: sort sorting=new sort();
                        sorting.product_list(name,code,category,price,quantity,min,max);
                        break;
                case 2: 
                case 3: obj.remove_add(name,category,price,quantity,choice_num,code, min, max);
                        break;
                case 4: obj.restock(name,quantity,price,category,min,code,max);
                        break;
 
                case 5: obj.product_info(code,name,price,quantity,max,min,category);
                         break;
                case 6: delievery del=new delievery();
                        del.input(name,code,price, quantity);
                        break;
                default: System.out.println("Please choose a valid option");
                         break;
            }
        }
    }
            