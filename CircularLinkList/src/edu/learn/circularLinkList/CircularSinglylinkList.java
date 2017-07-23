package edu.learn.circularLinkList;

import java.util.Scanner;

public class CircularSinglylinkList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		linkList list = new  linkList();
		
		System.out.println("CircularLinkListTest \n ");
		char ch;
		
		do{
			System.out.println("\nSingly link list Options\n 1.insert at begining\n 2.insert at end\n 3.insert at position\n 4.cheak empty\n 5.get size ");
			int choice = scan.nextInt();
			switch(choice){
			case 1:
				System.out.println("\n enter the element to insert");
				list.insertAtStart(scan.nextInt());
				break;
			case 2:
				System.out.println("\n enter elements to insert");
				list.insertAtEnd(scan.nextInt());
				break;
			case 3:
				System.out.println("\n enter elements to insert ");
				int num = scan.nextInt();
				System.out.println("\n enter the position ");
				int pos = scan.nextInt();
				if(pos<=1||pos>list.getSize()){
					System.out.println("invalid position\n");
				}
				else{
					list.insertAtpos(num, pos);
				}
				break;
			case 4:
				System.out.println("empty status "+ list.isEmpty());
				break;
			case 5:
				System.out.println("size : "+list.getSize()+"\n");
				break;
			default:
				System.out.println("wrong input \n");
			}
			list.Display();
			System.out.println("\ndo you want to continue (type y or n)\n ");
			ch= scan.next().charAt(0);
		}while(ch=='Y'||ch=='y');

	}

}
