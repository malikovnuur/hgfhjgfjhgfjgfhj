import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;
import service.Impl.BookServiceImpl;
import service.Impl.UserServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.

Book book1=new Book(11l,"Alice", Genre.ROMANCE,new BigDecimal(1000),"Michael Robert", Language.ENGLISH, LocalDate.now());
Book book2=new Book(22l,"Red Apple", Genre.ROMANCE,new BigDecimal(600),"Michael Vielem", Language.KYRGYZ, LocalDate.now());
Book book3=new Book(33l,"Sherlock Holms", Genre.DETECTIVE,new BigDecimal(1200),"Michael Etson", Language.RUSSIAN, LocalDate.now());
Book book4=new Book(44l,"War of Africa", Genre.HISTORICAL,new BigDecimal(1500),"Robert Krew", Language.RUSSIAN, LocalDate.now());
Book book5=new Book(55l,"Fly in the Sky", Genre.FANTASY,new BigDecimal(2300),"Michael Atkinson", Language.ENGLISH, LocalDate.now());


List<Book> books=new ArrayList<>(Arrays.asList(book1,book2,book3,book4,book5));
        BookServiceImpl bookServiceImpl=new BookServiceImpl();


User user1=new User(1l,"Akyl","Mamytov","@mamytov","0700030003", Gender.MALE,new BigDecimal(7000));
User user2=new User(2l,"Asel","Janarova","@janarova","0700010001", Gender.FEMALE,new BigDecimal(7000));
User user3=new User(3l,"Bermet","Asylova","@asylova","0700020002", Gender.FEMALE,new BigDecimal(7000));
User user4=new User(4l,"Aydana","Kimsanbaeva","@kimsanbaeva","0700040004", Gender.FEMALE,new BigDecimal(7000));
User user5=new User(5l,"Alibek","Japarova","@japarova","0700050005", Gender.FEMALE,new BigDecimal(7000));

List<User>users=new ArrayList<>(Arrays.asList(user1,user2,user3,user4,user5));

        UserServiceImpl userServiceImpl=new UserServiceImpl();

        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        System.out.println(userServiceImpl.createUser(users));
        System.out.println(userServiceImpl.findAllUsers(users));
        System.out.println(userServiceImpl.findUserById(new Scanner(System.in).nextLong(),users));
        System.out.println(userServiceImpl.removeUserByName(input.nextLine(),users));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(bookServiceImpl.createBooks(books));














        

    }
}