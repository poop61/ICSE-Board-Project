import java.util.*; 
class sort
{
        Scanner sc=new Scanner(System.in);
        void product_list(String name[],long code[],String category[],double price[],int quantity[], int min[],int max[])
        {
            int list_choice;
            String temp1;
            double temp2;
            int temp3;
            String temp4;
            System.out.println();
            System.out.println("Would you like to know the products in the order of:");
            System.out.println("1. Product name");
            System.out.println("2. Price");
            System.out.println("3. Quantity");
            System.out.print("Enter your choice:");
            list_choice=sc.nextInt();
            if(list_choice==1)
            {
                for(int i=0; i<name.length; i++)
                {
                    for(int j=0; j<name.length-i-1; j++)
                    {
                        if(name[j].compareTo(name[j+1])>0)
                        {
                            temp1=name[j];
                            name[j]=name[j+1];
                            name[j+1]=temp1;
                        
                            temp2=price[j];
                            price[j]=price[j+1];
                            price[j+1]=temp2;
                        
                            temp3=quantity[j];
                            quantity[j]=quantity[j+1];
                            quantity[j+1]=temp3;
                            
                            temp4=category[j];
                            category[j]=category[j+1];
                            category[j+1]=temp4;
                        
                        }
                    }
                }
               
            }
            else if(list_choice==2)
            {
                for(int i=0; i<price.length; i++)
                {
                    for(int j=0; j<price.length-i-1; j++)
                    {
                        if(price[j]>price[j+1])
                        {
                            temp1=name[j];
                            name[j]=name[j+1];
                            name[j+1]=temp1;
                        
                            temp2=price[j];
                            price[j]=price[j+1];
                            price[j+1]=temp2;
                        
                            temp3=quantity[j];
                            quantity[j]=quantity[j+1];
                            quantity[j+1]=temp3;
                            
                            temp4=category[j];
                            category[j]=category[j+1];
                            category[j+1]=temp4;
                        
                        }
                    }
                }
                
            }
            else if(list_choice==3)
            {
                for(int i=0; i<quantity.length; i++)
                {
                    for(int j=0; j<quantity.length-i-1; j++)
                    {
                        if(quantity[j]>quantity[j+1])
                        {
                            temp1=name[j];
                            name[j]=name[j+1];
                            name[j+1]=temp1;
                        
                            temp2=price[j];
                            price[j]=price[j+1];
                            price[j+1]=temp2;
                        
                            temp3=quantity[j];
                            quantity[j]=quantity[j+1];
                            quantity[j+1]=temp3;
                            
                            temp4=category[j];
                            category[j]=category[j+1];
                            category[j+1]=temp4;
                        
                        }
                    }
                }
                
            }
            System.out.println();
            System.out.println("PRODUCT"+"\t"+"\t"+"ITEM CODE"+"\t"+"PRICE"+"\t"+"\t"+"QUANTITY"+"\t"+"MIN QUAN"+"\t"+"MAX QUAN"+"\t"+"CATEGORY");
                for(int k=0; k<name.length; k++)
                    System.out.println(name[k]+"\t"+"\t"+code[k]+"\t"+"\t"+price[k]+"\t"+"\t"+quantity[k]+"\t"+"\t"+min[k]+"\t"+"\t"+max[k]+"\t"+"\t"+category[k]);
        }
        }