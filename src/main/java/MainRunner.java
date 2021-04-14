import org.perscholas.data.Address;
import org.perscholas.data.BookManager;
import org.perscholas.data.Person;

public class MainRunner {

    public static void main(String[] args) {

//        //instanciate new contact
//        Person p = new Person("Pete", "Prattis", 210123456, 123456, "pete@mail.com",
//                new Address(1, "Newstrt", "Athens", 1234));
//        Person p2 = new Person("Adam", "Adams", 210234567, 123987, "adam@mail.com",
//                new Address(21, "Oldstrt", "London", 5553));
        BookManager bm = new BookManager();
        Person p = bm.update("Pete", "Mobile", "28865534");



    }
}
