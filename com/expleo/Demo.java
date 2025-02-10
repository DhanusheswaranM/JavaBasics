package com.expleo;

public class Demo {
	/*public static void main(String args[]) {
		String seatType[][]=new String[][] {{"B","B","A","A","A"},{"A","A","A","B","B"},{"A","B","B","B","B"},{"B","A","A","B","A"}};
		int vipcount=0,premiumcount=0,regularcount=0,viptotal=5,premiumtotal=10,regulartotal=5;
		System.out.println("--movie seat arrangement--");
		for(int i=0;i<seatType.length;i++) {
			if(i==0)
				System.out.println("----VIP seats----");
			else if(i==1) {
				System.out.println("----Premium seats----");
			}
			else if(i==3)
				System.out.println("----Regular seats----");
			for(int j=0;j<seatType[i].length;j++) {
				System.out.print(" "+seatType[i][j]+" ");
				if(i==0 && seatType[i][j].equalsIgnoreCase("B")) {
					vipcount++;
				}
				else if(i>0 && i<3 && seatType[i][j].equalsIgnoreCase("B")) {
					premiumcount++;
				}
				else if(i==3 && seatType[i][j].equalsIgnoreCase("B")) {
					regularcount++;
				System.out.print(" ");
			}
			System.out.print("\n");
			System.out.println("---seat booked detail----");
			System.out.println("---VIP seat---");
			System.out.println("Booked:"+vipcount+"  Available:"+(viptotal-vipcount)+"  Total:"+viptotal);
			System.out.println("---Premium seat---");
			System.out.println("Booked:"+premiumcount+"  Available:"+(premiumtotal-premiumcount)+"  Total:"+premiumtotal);
			System.out.println("---Regular seat---");
			System.out.println("Booked:"+regularcount+"  Available:"+(regulartotal-regularcount)+"  Total:"+regulartotal);
		}*/
		/*System.out.println("----------------JAGGED ARRAY----------");
		int book[][]=new int [3][]; //row size is fixed and column size is not fixed
		book[0]=new int[] {1,2,3,4,51};
		book[1]=new int[] {8,9,71,45};
		book[2]=new int[] {10,11,17,25,14,16,147,};
		System.out.println("2 dimensional array");
		for(int i=0;i<book.length;i++) {// gives the no of rows 
			for(int j=0;j<book[i].length;j++) {  // gives the no of columns 
				System.out.print(book[i][j]+" ");
			}
			System.out.println();
		}*/
		/*String seatType[][]=new String[][] {{"B","B","A","A","A"},{"A","A","B","B"},{"A","B","B","B","B"},{"B","A","B","A"}};
		int vipcount=0,premiumcount=0,regularcount=0,viptotal=5,premiumtotal=10,regulartotal=5;
		System.out.println("--movie seat arrangement--");
		for(int i=0;i<seatType.length;i++) {
			if(i==0)
				System.out.println("----VIP seats----");
			else if(i==1) {
				System.out.println("----Premium seats----");
			}
			else if(i==3)
				System.out.println("----Regular seats----");
			for(int j=0;j<seatType[i].length;j++) {
				System.out.print(" "+seatType[i][j]+" ");
				if(i==0 && seatType[i][j].equalsIgnoreCase("B")) {
					vipcount++;
				}
				else if(i>0 && i<3 && seatType[i][j].equalsIgnoreCase("B")) {
					premiumcount++;
				}
				else if(i==3 && seatType[i][j].equalsIgnoreCase("B")) {
					regularcount++;
				}
				System.out.print(" ");
			}
			System.out.print("\n");
			System.out.println("---seat booked detail----");
			System.out.println("\n---VIP seat---");
			System.out.println("Booked:"+vipcount+"  Available:"+(viptotal-vipcount)+"  Total:"+viptotal);
			System.out.println("\n---Premium seat---");
			System.out.println("Booked:"+premiumcount+"  Available:"+(premiumtotal-premiumcount)+"  Total:"+premiumtotal);
			System.out.println("\n---Regular seat---");
			System.out.println("Booked:"+regularcount+"  Available:"+(regulartotal-regularcount)+"  Total:"+regulartotal);
		}*/
	public static void main(String args[]) {
		int sum;
		sum=add(10,25);
		System.out.println("The sum is:"+sum);

	}
	public static int add(int a,int b) {
		return a+b;
	}
			
}
