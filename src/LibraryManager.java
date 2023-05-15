import java.util.ArrayList;
import java.util.List;

public class LibraryManager <T extends LibraryItem> implements LibraryOperations<T> {
    private List<T> items;
    public LibraryManager() {
        items = new ArrayList<>();
    }


    @Override
    public void addItem(T item) {
        items.add(item);
        System.out.println("This item has been added: " + item.getItemDetails());
    }

    @Override
    public void removeItem(T item) {
        if(items.remove(item)) {
            System.out.println("This item has been removed: " + item.getItemDetails());
        } else {
            System.out.println("This item was not found: " + item.getItemDetails());
        }

    }

    @Override
    public void displayItems() {
    if(items.isEmpty()) {
        System.out.println("The library is empty.");
    } else {
        System.out.println("Library content: ");
        for (T item : items) {
            System.out.println(item.getItemDetails());
        }
    }
  }
}
