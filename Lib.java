package CodeWithHarry.Playground;
import java.util.Arrays;
class Library {
    private Book[] availableBooks;
    private Book[] issuedBooks;

    public Library() {
        this.availableBooks = new Book[0];
        this.issuedBooks = new Book[0];
    }

    public void addBook(Book book) {
        this.availableBooks = Arrays.copyOf(this.availableBooks, this.availableBooks.length + 1);
        this.availableBooks[this.availableBooks.length - 1] = book;
        System.out.println("Book added to library: " + book.getTitle());
    }

    public void issueBook(Book book) {
        boolean found = false;
        for (int i = 0; i < this.availableBooks.length; i++) {
            if (this.availableBooks[i] == book) {
                found = true;
                this.availableBooks = removeBookFromArray(this.availableBooks, i);
                this.issuedBooks = Arrays.copyOf(this.issuedBooks, this.issuedBooks.length + 1);
                this.issuedBooks[this.issuedBooks.length - 1] = book;
                System.out.println("Book issued: " + book.getTitle());
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in library: " + book.getTitle());
        }
    }

    public void returnBook(Book book) {
        boolean found = false;
        for (int i = 0; i < this.issuedBooks.length; i++) {
            if (this.issuedBooks[i] == book) {
                found = true;
                this.issuedBooks = removeBookFromArray(this.issuedBooks, i);
                this.availableBooks = Arrays.copyOf(this.availableBooks, this.availableBooks.length + 1);
                this.availableBooks[this.availableBooks.length - 1] = book;
                System.out.println("Book returned: " + book.getTitle());
                break;
            }
        }
        if (!found) {
            System.out.println("Book not issued from library: " + book.getTitle());
        }
    }

    public void showAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : this.availableBooks) {
            System.out.println(book);
        }
    }

    private static Book[] removeBookFromArray(Book[] books, int index) {
        Book[] newBooks = new Book[books.length - 1];
        for (int i = 0, j = 0; i < books.length; i++) {
            if (i != index) {
                newBooks[j++] = books[i];
            }
        }
        return newBooks;
    }

    public static void main(String[] args) {
        // Test the library
        Library library = new Library();

        Book book1 = new Book("The Catcher in the Rye", "9780316769488");
        Book book2 = new Book("To Kill a Mockingbird", "9780446310789");
        Book book3 = new Book("The Great Gatsby", "9780743273565");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.showAvailableBooks();

//        library.issueBook(book1);
//        library.issueBook(book2);
//
//        library.showAvailableBooks();
//
//        library.returnBook(book2);
//
//        library.showAvailableBooks();
    }

    private static class Book {
        private String title;
        private String isbn;

        public Book(String title, String isbn) {
            this.title = title;
            this.isbn = isbn;
        }

        public String getTitle() {
            return title;
        }

        public String getIsbn() {
            return isbn;
        }
    }
    }