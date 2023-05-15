
public class LibraryApp {
    public static void main(String[] args) {

        LibraryManager<LibraryItem> libraryManager = new LibraryManager<>();

        Book book1 = new Book("1984", 1949, "George Orwell", "9780451524935");
        libraryManager.addItem(book1);
        System.out.println();

        Book book2 = new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald", "9780743273565");
        libraryManager.addItem(book2);
        System.out.println();

        DVD dvd1 = new DVD("Pulp Fiction", 1994, "Quentin Tarantino", 154);
        libraryManager.addItem(dvd1);
        System.out.println();

        DVD dvd2 = new DVD("Inception", 2010, "Christopher Nolan", 148);
        libraryManager.addItem(dvd2);
        System.out.println();


        libraryManager.removeItem(book1);
        System.out.println();
        libraryManager.removeItem(book1);
        System.out.println();

        libraryManager.displayItems();
        }
}