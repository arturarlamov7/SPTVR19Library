
package sptvr19library;

import entity.Reader;
import entity.Book;
import entity.History;
import java.util.Scanner;
import tools.managers.BookManager;
import tools.severs.BookSaver;
import tools.managers.HistoryManager;
import tools.managers.ReaderManager;
import tools.severs.ReaderSaver;







class App {
    private Book[] books = new Book[100];
    private Reader[] readers = new Reader[100];  
    private History[] histories = new History[100];
    private ReaderManager readerManager = new ReaderManager();
    private BookManager bookManager = new BookManager();
    private HistoryManager historyManager = new HistoryManager();

    
    public void run(){
        System.out.println("--- Библиотека ---");
        boolean repeat = true;
        do{
            System.out.println("Список задач: ");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить новую книгу");
            System.out.println("2. Посмотреть список книг");
            System.out.println("3. Зарегистрировать нового читателя");
            System.out.println("4. Список читателей");
            
            System.out.println("5. Выдать книгу читателю");
            System.out.println("6. Вернуть книгу в библиотеку");
            System.out.print("Выберите задачу: ");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("---- Конец программы ----");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("---- Добавить новую книгу ----");
                    // создадим объект книги
                    Book book = bookManager.createBook;
                    bookManager.addReaderToArray(book, books);
                    bookManager.prtintListBooks(books);
                    BookSaver bookSaver = new BookSaver();
                    bookSaver.saveBooks(books);                                         
                case "2":
                    System.out.println("---- Список книг ----");
                    bookManager.printListBook(books);
                    break;
                case "3":
                    System.out.println("---- Зарегестрировать нового читателя ----");
                    Reader reader = readerManager.createReader();
                    readerManager.addReaderToArray(reader, readers);
                    readerManager.printListReaders(readers);
                    ReaderSaver readerSaver = new ReaderSaver();
                    readerSaver.saveReaders(readers);               
                    break;
                case "4":
                    System.out.println("--- Список читателей ---");
                    for (int i = 0; i < readers.length; i++) {
                        if(readers[i] != null){
                            System.out.printf("%d. %s%n",i+1,readers[i].toString());
                        }
                    }
                    break;
                case "5":
                    System.out.println("");
                    break;
                case "6":
                    System.out.println("");
                    break;
                default:
                    System.out.println("Нет такой задачи.");
            }
        }while(repeat);
    }
}
