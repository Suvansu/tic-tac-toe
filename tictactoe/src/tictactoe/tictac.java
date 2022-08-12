package tictactoe;

import java.util.*;

public class tictac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dispboard();
		int row1[] = new int [3];
		int row2[] = new int [3];
		int row3[] = new int [3];
		row1[0] = 9;
		row1[1] =9;
		row1[2] =9;
		row2[0] =9;
		row2[1] =9;
		row2[2] =9;
		row3[0] =9;
		row3[1] =9;
		row3[2] =9;


		//int p=1;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Player one turn using 0");
		System.out.println("enter your position looking at the sample board");


		System.out.println("Player two turn using 1");
		System.out.println("enter your position looking at the sample board");
		//player2(choice,choice1,row1,row2,row3);
		int z=0;
		for(int p=0; p<=9;p++) 
		{


			if (p==0 || p==2 || p==4 || p==6 || p==8)
			{
				System.out.println("Input 1st choice for player 1");
				int choice = sc.nextInt();
				System.out.println("Input 2nd choice for player 1");
				int choice1 = sc.nextInt();
				player1(choice,choice1,row1,row2,row3);
				printboard(row1,row2,row3);
				z=checkwinner(row1,row2,row3);
				if(z==1) {
					System.out.println("Player 1 won");
					System.exit(0);
				}
			}

			else if (p==1 || p==3 || p==5 || p==7 )
			{
				System.out.println("Input 1st choice for player 2");
				int choice = sc.nextInt();
				System.out.println("Input 2nd choice for player 2");
				int choice1 = sc.nextInt();
				player2(choice,choice1,row1,row2,row3);
				printboard(row1,row2,row3);
				z=checkwinner(row1,row2,row3);
				 if(z==2)
				{
					System.out.println("Player 2 won");
					System.exit(0);
				}
			}

		}

		//System.out.println(row1[0]);
		//		System.out.println("-" + "-"+ "-" + "-"+"-" + "-" + "-"+ "-"+ "-"+ "-"+ "-"+ "-"+ "-");
		//		System.out.println("|" +  row1[1]  + "|" +  row1[2]  + "|" + row1[3]  + "|");
		//		System.out.println("|" +  row2[1]  + "|" +  row2[2]  + "|" + row2[3]  + "|");
		//		System.out.println("|" +  row3[1]  + "|" +  row3[2]  + "|" + row3[3]  + "|");
		//		System.out.println("-" + "-"+ "-" + "-"+"-" + "-" + "-"+ "-"+ "-"+ "-"+ "-"+ "-"+ "-");
		int x=3;
		x= checkwinner(row1,row2,row3);
		if(x==1) {
			System.out.println("Player 1 won");
			System.exit(0);
			//exit();
		}

		else if(x==2)
		{
			System.out.println("Player 2 won");
		}

		else if (x!=1 && x!=2){
			System.out.println("Game drew");
			System.exit(0);
		}


	}

	public static void dispboard()
	{
		System.out.println("-" + "-"+ "-" + "-"+"-" + "-" + "-"+ "-"+ "-"+ "-"+ "-"+ "-"+ "-");
		System.out.println("|" + " 1 1" +  "|" + " 1 2 " + "|"  +" 1 3 "+ "|");
		System.out.println("|" + " 2 1 " + "|" + " 2 2 " + "|" +" 2 3 " + "|");
		System.out.println("|" + " 3 1 " + "|" + " 3 2 " + "|" +" 3 3 " + "|");
		System.out.println("-" + "-"+ "-" + "-"+"-" + "-" + "-"+ "-"+ "-"+ "-"+ "-"+ "-"+ "-");
		//System.out.println("|");

	}

	public static int checkwinner(int[]  row1, int[]  row2, int[]  row3)
	{
		//		if (row1[1]==0 && row1[2] == 0 && row1[3] ==0)
		//		{
		//			System.out.println("player one won");
		//			
		//		}
		//		else if (row1[1]==1 && row1[2] == 1 && row1[3] ==1)
		//		{
		//			System.out.println("player two won");
		//			
		//		}
		for (int a = 0; a < 8; a++) {
			int line = 9 ;

			switch (a) {
			case 0:
				line =  (row1[0] + row1[1] + row1[2]);
				break;
			case 1:
				line =  (row2[0] + row2[1] + row2[2]);
				break;
			case 2:
				line =  (row3[0] + row3[1] + row3[2]);
				break;
			case 3:
				line= (row1[0] + row2[0] + row3[0]);
				break;
			case 4:
				line=(row1[1] + row2[1] + row3[1]);
				break;
			case 5:
				line=(row1[2] + row2[2] + row3[2]);
				break;
			case 6:
				line=(row1[0] + row2[1] + row3[2]);
				break;
			case 7:
				line=(row1[2] + row2[1] + row3[0]);
				break;

			}
			if (line==3) {
				return 1;

			}
			else if(line==6)
			{
				return 2;
			}


		}
		return 0;       	
	}

	public static void printboard(int[]  row1, int[]  row2, int[]  row3)
	{
		System.out.println("-" + "-"+ "-" + "-"+"-" + "-" + "-"+ "-"+ "-"+ "-"+ "-"+ "-"+ "-");
		System.out.println("|" +  row1[0]  + "|" +  row1[1]  + "|" + row1[2]  + "|");
		System.out.println("|" +  row2[0]  + "|" +  row2[1]  + "|" + row2[2]  + "|");
		System.out.println("|" +  row3[0]  + "|" +  row3[1]  + "|" + row3[2]  + "|");
		System.out.println("-" + "-"+ "-" + "-"+"-" + "-" + "-"+ "-"+ "-"+ "-"+ "-"+ "-"+ "-");
		//System.out.println("|");

	}

	public static int player1(int choice, int choice1, int[]  row1, int[]  row2, int[]  row3)
	{



		if (choice==1 & choice1==1 && row1[0]!=2 && row1[0] !=1)
		{
			row1[0] =1;
			//System.out.println("hello");
			return 0;
		}
		else if (choice==1 & choice1==2 && row1[1]!=2 && row1[1]!=1)
		{
			row1[1] =1;
			return 0;
		}
		else if (choice==1 & choice1==3 && row1[2]!=2 && row1[2]!=1)
		{
			row1[2] =1;
			return 0;
		}
		else if (choice==2 & choice1==1 && row2[0]!=2 && row2[0]!=1)
		{
			row2[0] =1;
			return 0;
		}
		else if (choice==2 & choice1==2 && row2[1]!=2 && row2[1]!=1 )
		{
			row2[1] =1;
			return 0;
		}
		else if (choice==2 & choice1==3 && row2[2]!=2 && row2[2]!=1)
		{
			row2[2] =1;
			return 0;
		}
		else if (choice==3 & choice1==1 && row3[0]!=2 && row3[0]!=1)
		{
			row3[0] =1;
			return 0;
		}
		else if (choice==3 & choice1==2  && row3[1]!=2 && row3[1]!=1)
		{
			row3[1] =1;
			return 0;
		}
		else if (choice==3 & choice1==3 && row3[2]!=2 && row3[2]!=1 )
		{
			row3[2] =1;
			return 0;
		}
		else {
			System.out.println("invalid entry");
			System.exit(1);
		}

		return 9;

	}

	public static void player2(int choice, int choice1, int[]  row1, int[]  row2, int[]  row3)
	{
		if (choice==1 & choice1==1 && row1[0]!=1 && row1[0] !=2)
		{
			row1[0] =2;
			//System.out.println("hi");
			//return 1;
		}
		else if (choice==1 & choice1==2 && row1[1]!=1 && row1[1]!=2)
		{
			row1[1] =2;
			//return 1;
		}
		else if (choice==1 & choice1==3 && row1[2]!=1 && row1[2]!=2)
		{
			row1[2] =2;
			//return 1;
		}
		else if (choice==2 & choice1==1 && row2[0]!=1 && row2[0]!=2)
		{
			row2[0] =2;
			//return 1;
		}
		else if (choice==2 & choice1==2 && row2[1]!=1 && row2[1]!=2)
		{
			row2[1] =2;
			//return 1;
		}
		else if (choice==2 & choice1==3 && row2[2]!=1 && row2[2]!=2)
		{
			row2[2] =2;
			//return 1;
		}
		else if (choice==3 & choice1==1 && row3[0]!=1 && row3[0]!=2)
		{
			row3[0] =2;
			//return 1;
		}
		else if (choice==3 & choice1==2 && row3[1]!=1 && row3[1]!=2)
		{
			row3[1] =2;
			//return 1;
		}
		else if (choice==3 & choice1==3 && row3[2]!=1 && row3[2]!=2)
		{
			row3[2] =2;
			//return 1;
		}
		else
		{
			System.out.println("invalid entry");
			System.exit(1);
		}
		//return 9;
	}



}
