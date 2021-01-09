class Main {
public static void main(String[] args) {

  System.out.println("/n Here are the assigned seats: ");
   
  String[] names = {"Joe", "Josh", "Reese", "Reid", "Jasmine", "Lucy", "Nour", "Ruth", "Sam", "Sarah", "Harry", "Mark", "Eva", "Abbey", "Jane"}; 
  int [] seatNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};   
  
   for (int i = 0; i < names.length; i++){
    System.out.println(names[i] + " Sits in Seat # " + seatNumbers[i]);   
    }
    
   int count = 15; 
    while(count < 15){
     System.out.print(count);
      count++;
   }
  } 
}