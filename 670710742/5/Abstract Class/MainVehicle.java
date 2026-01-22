import java.util.ArrayList;

public class MainVehicle
{
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        
        vehicles.add(new Car("C001", "BMW", 3000));
        vehicles.add(new Car("C002", "Honda", 1200));
        vehicles.add(new Motorcycle("M001", "Homda", 250));
        vehicles.add(new Motorcycle("M002", "BMW", 850));
        
        for(Vehicle v : vehicles){
            System.out.println(v.toString()); //Polymorphism
            System.out.println("จำนวนวันที่เช่า : 3 วัน ");
            System.out.println("ค่าเช่าที่ต้องชำละ : " + v.calcRentalCost(3) + " บาท");
        }
        
        
    }
}
