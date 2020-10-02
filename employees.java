
import java.util.*;
class employees
{
    int ch;
    void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("WHAT WOULD YOU LIKE TO KNOW?");
        System.out.println("1. See the list of employees");
        System.out.println("2. Calculate salary on basis of working hours");
        System.out.println("3. Know how happy customers are with the employee");
        System.out.println("4. Get to know the employee of the month");
        System.out.print("Enter 1, 2, 3 or 4 to proceed: ");
        ch=sc.nextInt();
        System.out.println("\f");
    }
    void choice(String name[], int salary[], int hours[], String rating[])
    {
        salary_customer sal_cus =new salary_customer();
        switch(ch)
        {
            case 1: list obj=new list();
                    obj.sort(name, salary, hours, rating);
                    break;
            case 2: sal_cus.input(name, hours, salary);   
                    break;
            case 3:  sal_cus.customer(name,rating);     
                      break;
            case 4: sal_cus.employee_of_month(name, hours, rating);
                     break;
            default: System.out.println("Please choose a valid option");
                     break;      
        }
            }
        }