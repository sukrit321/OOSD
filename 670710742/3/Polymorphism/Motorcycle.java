public class Motorcycle extends Vehicle
{
   public Motorcycle(String plateNo, String brand, double dailyRate){
       super(plateNo, brand, dailyRate);
   }
   
   @Override
   public double calcRentalCost(int day){
       return (getDailyRate() * day) + 50; 
   }
   
   //Polymorphism
   @Override
   public String toString(){
       return "Motorcycle_PlateNo : " + getPlatNo() + " Brand : " + getBrand() + " DailyRate : " + getDailyRate();
   }
}
