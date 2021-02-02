import java.util.*;
import java.util.concurrent.Callable;

//class Book {
//   String nameAuthor;

// public Book(String nameAuthor) {
//  this.nameAuthor = nameAuthor;
//}

//@Override
//  public String toString() {
//   return "Book{" +
//       "nameAuthor='" + nameAuthor + '\'' +
//       '}';
//  }
//}

public class Coll {
    public static  void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.remove(2);
        for (Object o : collection) {
            //  System.out.println(o);
        }
        System.out.println( );
        List collection1 = new ArrayList();
        collection1.add("1");
        collection1.add("2");
        collection1.add("3");
        collection1.add("4");
        for (int i = 0; i <= collection.size() ; i++)
        {
            // System.out.println(collection1.get(i));
        }
        System.out.println( collection1.get(0));
        Set collection3 = new HashSet() ;
        collection3.add("1");
        collection3.add("1");
        collection3.add("2");
        collection3.add("2");
        collection3.add("3");
        collection3.add("3");
        collection3.add("4");
        collection3.add("4");
        for(Object o : collection3) {
            System.out.println(o);
        }
        Map collection4 = new HashMap() ;
        collection4.put("1" ,  new Student("Юсупов Наиль"));
        collection4.put("2" , "Дмитриев Дмитрий" );
        collection4.put("3" , "Иванов Иван" );
        collection4.put("4" , "Сергеев Сергей " );
        System.out.println(collection4.get("1"));
    }
}
class Student { //вот это что тут делает?
    String  name;
    public  Student( String name ) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

}
