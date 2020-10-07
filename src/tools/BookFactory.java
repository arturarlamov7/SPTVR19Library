
package tools;

import entity.Book;
import java.util.Scanner;

public class BookFactory {

    public Book createBook() {
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Создание книги ---");
        System.out.print("Название книги: ");
        book.setName(scanner.nextLine());
        System.out.print("Автор книги: ");
        book.setAuthor(scanner.nextLine());
        System.out.print("Год издания книги: ");
        book.setPublishedYear(scanner.nextInt());
        return book;
    }
    
}