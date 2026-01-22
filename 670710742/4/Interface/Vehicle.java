public class Vehicle
{
    private String plateNo;
    private String brand;
    private double dailyRate;
    
    public Vehicle(String plateNo, String brand, double dailyRate){
        this.plateNo = plateNo;
        this.brand = brand;
        this.dailyRate = dailyRate;
    }
    
    public String getPlatNo(){
        return plateNo;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public double getDailyRate(){
        return dailyRate;
    }
    
    public double calcRentalCost(int day){
        return 0;  
    }
    
    public String toString(){
        return "plateNo : " + plateNo + " brand : " + brand + " dailyRate : " + dailyRate;
    }
}
