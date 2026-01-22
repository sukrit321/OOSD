public class Car extends Vehicle
{
   public Car(String plateNo, String brand, double dailyRate){
       super(plateNo, brand, dailyRate);
   }
   
   @Override
   public double calcRentalCost(int day){
       return (getDailyRate() * day) + 300; 
   }
   
   //Polymorphism
   @Override
   public String toString(){
       return "Car_PlateNo : " + getPlatNo() + " Brand : " + getBrand() + " DailyRate : " + getDailyRate();
   }
}
