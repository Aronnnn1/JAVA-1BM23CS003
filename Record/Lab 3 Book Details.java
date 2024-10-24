import java.util.Scanner; 
class Book {
    String name;
    String author;
    int price;
    int num_pages;
    Book(String name, String author, int price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }
    public String toString() {
        String book_details = "Book name: " + this.name + "\n" +
        "Author name: " + this.author + "\n" +
        "Price: " + this.price + "\n" +
        "Number of pages: " + this.num_pages + "\n";
        return book_details; 
    }
} 

class Run {
    public static void main(String[] args) {
        System.out.println("Name: Aaron B Ajay");
	System.out.println("USN: 1BM23CS003 ");
	Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of books: "); 
        int n = sc.nextInt(); 
        Book[] books=new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of book " + (i + 1) + ": ");
            String name = sc.next();
	    sc.nextLine(); 
            System.out.println("Enter author: ");
            String author = sc.next();
	    sc.nextLine();
            System.out.println("Enter price: ");
            int price = sc.nextInt();
            System.out.println("Enter number of pages in book: ");
            int num_pages = sc.nextInt();
            books[i] = new Book(name, author, price, num_pages);
        }
        System.out.println("\nBook Details:");
        for (int i=0; i<n;i++) {
            System.out.println(books[i].toString());        
	}
    }
}