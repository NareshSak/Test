class Hotel{

          public static void main(String[] args){

	System.out.println("Welcome to the Hotel"+"\n");
	System.out.println("Today Chellenging Offer : "+"If your Bill amout crossed above $3000...Your bill consisdered to $0"+"\n");
	int Billamount,Offeramount,Invoice;
	         Billamount = 3522;
             Offeramount = 0;
             Invoice=0;
     try {
            if (Billamount > 3000)
                 Invoice=Billamount/Offeramount;
            System.out.println("Your Total Billamount : " +Invoice+"\n");
         }
     catch(Exception e){
             System.out.println("Today Offers is calimed"+"\n");
             }
             finally{
	System.out.println("Thank you...Visit Again");
	}
 }
}