import java.util.*;
class stock_functions
{
    Scanner sc=new Scanner (System.in);
    void remove_add(String name[],String category[],double price[],int quantity[], int ch, long code[], int min[], int max[])
    {
        String item="";
        int quan=0;
        int new_quan;
        System.out.println();
        if(ch==2)
           System.out.print("Enter the name of the item you want to remove:");
        else
           System.out.print("Enter the name of the item you want to add:");
        item=sc.next();
        System.out.print("Enter the quantity:");
        quan=sc.nextInt();
        if(ch==2)
        {
            for(int i=0; i<name.length; i++)
            {
                if(name[i].equalsIgnoreCase(item))
                {
                    if(!(item.charAt(item.length()-1)=='s'))
                       item=item+'s';
                    new_quan=(quantity[i]-quan);
                    System.out.println();
                    if(new_quan>min[i])
                    {
                    
                    System.out.println(item.toUpperCase()+" EARLIER:"+quantity[i]);
                    System.out.println(item.toUpperCase()+" NOW:"+ new_quan);
                     quantity[i]=new_quan;
                }
                
                   
                    else
                    {
                       System.out.println("Item needs restocking");
                       System.out.println("The amount of items inputted were not removed since it exceeds the minimum quantity");
                        System.out.println("You are first requested to add more items to the stock and then remove the desired quantity");
                        System.out.println();
                       System.out.println(quantity[i]-min[i]+" items were removed");
                       System.out.println();
                        System.out.println(item.toUpperCase()+" EARLIER:"+quantity[i]);
                       System.out.println(item.toUpperCase()+" NOW:"+(min[i]));
                       quantity[i]=min[i];
                    }
                }
            }
        }
        else if(ch==3)
        {
            for(int i=0; i<name.length; i++)
            {
                if(name[i].equalsIgnoreCase(item))
                {
                    if(!(item.charAt(item.length()-1)=='s'))
                       item=item+'s';
                    new_quan=(quantity[i]+quan);
                    System.out.println();         
                     if(quan>max[i])
                    {
                       System.out.println("The number of items that were requested to be added were not added");
                       System.out.println("since the quantity exceeded the maximum quantity");
                       System.out.println();
                       System.out.println(quan-max[i]+" items were not added");
                       System.out.println();
                       System.out.println(item.toUpperCase()+" EARLIER:"+quantity[i]);
                       System.out.println(item.toUpperCase()+" NOW:"+(max[i]));
                       quantity[i]=max[i];
                    }
                    else
                    {
                      System.out.println(item.toUpperCase()+" EARLIER:"+quantity[i]);
                      System.out.println(item.toUpperCase()+" NOW:"+(new_quan));
                      quantity[i]=new_quan;
                   }         
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("New List:");
        System.out.println();
        System.out.println("PRODUCT"+"\t"+"\t"+"ITEM CODE"+"\t"+"PRICE"+"\t"+"\t"+"QUANTITY"+"\t"+"CATEGORY"+"\t");
        for(int k=0; k<name.length; k++)
            System.out.println(name[k]+"\t"+"\t"+code[k]+"\t"+"\t"+price[k]+"\t"+"\t"+quantity[k]+"\t"+"\t"+category[k]+"\t");
    }
    void restock(String name[],int quantity[],double price[],String category[],int min[],long code[], int max[])
    {
        System.out.println("Items that need restocking are:");
        System.out.println();
        System.out.println("PRODUCT"+"\t"+"\t"+"ITEM CODE"+"\t"+"QUANTITY"+"\t"+"CATEGORY"+"\t"+"MIN QUANTITY"+"\t"+"MAX QUANTITY");
        for(int i=0; i<name.length; i++)
        {
            if(quantity[i]<=min[i])
            {
               System.out.println(name[i]+"\t"+"\t"+code[i]+"\t"+"\t"+quantity[i]+"\t"+"\t"+category[i]+"\t"+"\t"+min[i]+"\t"+"\t"+max[i]);
               System.out.println("No of pieces required to reach minimum quantity:"+(min[i]-quantity[i]));
               System.out.println();
            }
    }
}
      void product_info(long code[],String product[] ,double price[] ,int quan[] ,int max[] ,int min[] ,String category[])
      {
          int num=0;
          long code_num=0;
          System.out.println();
          System.out.print("How many items do you need information for?");
          num=sc.nextInt();
          for(int i=0; i<num; i++)
          {
              System.out.print("Enter item code:");
              code_num=sc.nextLong();
              for(int j=0; j<code.length; j++)
              {
                  if(code_num==code[j])
                  {
                      System.out.println();
                      System.out.println("Product: "+product[j]);
                      System.out.println("Category:"+category[j]);
                      System.out.println("Cost per item: "+price[j]);
                      System.out.println("Quantity in stock: "+quan[j]);
                      System.out.println("Maximum items: "+max[j]);
                      System.out.println("Minimum items: "+min[j]);
                  }
                }     
            }               
        }      
}
