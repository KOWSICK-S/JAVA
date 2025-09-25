import java.util.Scanner;
class menu{

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Menu Card:");
				System.out.println("1.Coffee     RS.15");
				System.out.println("2.Tea        RS.10");
				System.out.println("3.Coldcoffee RS.25");
				System.out.println("4.Milkshake  RS.50");
				System.out.print("Enter your choice:");
				int n=sc.nextInt();
				switch(n){
				case 1:	System.out.println("you choose coffee");
				System.out.print("Enter the quantity:");
				int a=sc.nextInt();
				int amount =a*15;
				System.out.println("Total Amount is " +amount);
				break;
				case 2:	System.out.println("you choose tea");
				System.out.print("Enter the quantity:");
				int b=sc.nextInt();
				int amount1 =b*10;
				System.out.println("Total Amount is " +amount1);
				break;
				case 3:	System.out.println("you choose Coldcoffee");
				System.out.print("Enter the quantity:");
				int c=sc.nextInt();
				int amount2 =c*25;
				System.out.println("Total Amount is " +amount2);
				break;
				case 4:	System.out.println("you choose Milkshake");
				System.out.print("Enter the quantity:");
				int d=sc.nextInt();
				int amount3 =d*50;
				System.out.println("Total Amount is " +amount3);
				break;
				default:
				}
				}
				
				
			}