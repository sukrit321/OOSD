import java.util.ArrayList;

public class MainBook
{
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<>();
        
        books.add(new EBook("กระต่ายกับเต่า", 30));
        books.add(new EBook("ปลานีโม", 25));
        books.add(new EBook("SQL", 120));
        books.add(new PhysicalBook("C++", 130));
        books.add(new PhysicalBook("Java", 140));
        books.add(new PhysicalBook("PHP", 170));
        
        for(Book b : books){
            System.out.println(b.toString());
        }
    }
}