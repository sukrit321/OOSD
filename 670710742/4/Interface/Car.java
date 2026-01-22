public class Car extends Vehicle implements Discountable
{
   public Car(String plateNo, String brand, double dailyRate){
       super(plateNo, brand, dailyRate);
   }
   
   @Override
   public double calcRentalCost(int day){
       return ((getDailyRate() - getDiscountRate()) * day) + 300 * 0.95; 
   }
   
   @Override
   public double getDiscountRate(){
       return getDailyRate() * 0.05;
   }
   
   //Polymorphism
   @Override
   public String toString(){
       return "Car_PlateNo : " + getPlatNo() + " Brand : " + getBrand() + " DailyRate : " + getDailyRate();
   }
}
