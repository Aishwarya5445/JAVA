class Box<T> {
    private T item;
    public void set(T item) {
    this.item = item;
    }
    public T get() {
    return item;
    }
    }
public class Generics {
    public static void main(String[] args) {
    Box<String> strBox = new Box<>();
    strBox.set("Hello Generics");
    System.out.println(strBox.get()); 
    Box<Integer> intBox = new Box<>();
    intBox.set(100);
    System.out.println(intBox.get());
    }
    }

