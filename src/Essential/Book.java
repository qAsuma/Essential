package Essential;
import java.util.Scanner;

public class Book {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя автора :");
        String text = scanner.next();
        System.out.println("Введите название книги :");
        String text1 = scanner.next();
        System.out.println("тема книги :");
        String text2 = scanner.next();




        Author author = new Author();
        author.show();
        author.setAuthorName(text);
        System.out.println(author.getAuthorName());



        Title title = new Title();
        title.show();
        title.setTitleName(text1);
        System.out.println(title.getTitleName());


        Content content = new Content();
        content.show();
        content.setContent(text2);
        System.out.println(content.getContent());


    }



}
