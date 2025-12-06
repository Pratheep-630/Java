import java.util.ArrayList;
import java.util.Scanner;

import books.Book;
import users.User;

public class LibraryManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static LibraryManagementSystem lms = new LibraryManagementSystem();
    static boolean isLoggedIn = false;
    static User currentUser = null;
    public static void main(String[] args) {
        while (true) {
            try {
                // System.out.println("choice is: " + choice)
                lms.coreFunctionality();
            } catch (Exception e) {
                System.out.println("Error is: " + (e.getMessage() != null ? e.getMessage() : e.getClass().getSimpleName()));
                e.printStackTrace();
            }
        }
    }

    public static void menu() {
        System.out.println();
        System.out.println("The Below are the list of available functionalities.\n");
        System.out.println("1. Register/Signup");
        System.out.println("2. Login");
        System.out.println("3. Add Books");
        System.out.println("4. View Books");
        System.out.println("5. Search books");
        System.out.println("6. Delete Books");
        System.out.println("7. Update Books");
        System.out.println("10. Exit");
    }

    public void coreFunctionality() {
        System.out.println("==============Library Management System=================");
        // for now only two functionalities login and signup
        menu();
        int choice;
        System.out.println("Enter your choice : ");
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                register();
                coreFunctionality();
                break;
            case 2:
                login();
                coreFunctionality();
                break;
            case 3:
                lms.addBooks();
                coreFunctionality();
                break;
            case 4: 
                lms.viewBooks();
                coreFunctionality();
                break;

            case 5:
                lms.searchBooks();
                coreFunctionality();
                break;

            case 6:
                lms.deleteBooks();
                coreFunctionality();
                break;

            case 7:
                lms.updateBooks();
                coreFunctionality();
                break;

            case 10:
                System.out.println("Exiting the program .....");
                System.exit(0);

            default:
                System.out.println("Invalid choice .... ");
                coreFunctionality();
        }
    }

    public void addBooks() {
        System.out.println("================Add Books=========");
        // if (isLoggedIn != true) {
        //     System.out.println("You are not logged in please login to add books .... ");
        //     return;
        // }
        // if (!currentUser.role.equals("admin")) {
        //     System.out.println("You are not authorized to add books .....");
        //     return;
        // }
        System.out.println("Enter the title: ");
        String title = sc.nextLine();
        // data validations
        int retryCount = 1;
        while (title.toCharArray().length > 10) {
            if (retryCount > 3) {
                System.out.println("Exceeded the maximum no of attempts .... ");
                System.exit(0);
            }
            System.out.println("Title length cannot be geater than 100 characters ... ");
            System.out.println("Enter the title: ");
            title = sc.nextLine();
            retryCount += 1;
        }
        System.out.println("Enter author name: ");
        String author = sc.nextLine();
        System.out.println("Enter the description: ");
        String description = sc.nextLine();
        System.out.println("Enter the ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Enter the publisher:");
        String publisher = sc.nextLine();
        System.out.println("Enter the category: ");
        String category = sc.nextLine();
        System.out.println("Enter the qunatity: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        // create an object of Book
        Book book = new Book(title, author, description, isbn, publisher, category, quantity);
        books.add(book);
        System.out.println("Book added successfully .... ");
    }
    
    public void viewBooks() {
        System.out.println("================View Books=========");
        // if (isLoggedIn != true) {
        //     System.out.println("You are not logged in please login to view books .... ");
        //     return;
        // }
        // read all books from the books list 
        for (Book book : books) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Publisher: " + book.publisher);
            System.out.println("Category: " + book.category);
            System.out.println("Quantity: " + book.quantity);
            System.out.println("Description: " + book.description);
            System.out.println("ISBN: " + book.isbn);
            System.out.println("--------------------------------");
        }
    }

    public void updateBooks() {
        System.out.println("================Update Books=========");
        // if (isLoggedIn != true) {
        //     System.out.println("You are not logged in please login to update books .... ");
        //     return;
        // }
        // if (!currentUser.role.equals("admin")) {
        //     System.out.println("You are not authorized to add books .....");
        //     return;
        // }
        System.out.println("Enter the book name to update: ");
        String bookNameToUpdate = sc.nextLine();
        for (Book book : books) {
            if (book.title.equals(bookNameToUpdate)) {
                System.out.println("The current title is : " + book.title);
                System.out.println("Enter the new title: ");
                String title = sc.nextLine();
                System.out.println("The current author is : " + book.author);
                System.out.println("Enter new author name: ");
                String author = sc.nextLine();
                System.out.println("The current description is : " + book.description);
                System.out.println("Enter the new description: ");
                String description = sc.nextLine();
                System.out.println("The current ISBN is : " + book.isbn);
                System.out.println("Enter the new ISBN: ");
                String isbn = sc.nextLine();
                System.out.println("The current publisher is : " + book.publisher);
                System.out.println("Enter the new publisher: ");
                String publisher = sc.nextLine();
                System.out.println("The current category is : " + book.category);
                System.out.println("Enter the new category: ");
                String category = sc.nextLine();
                System.out.println("The current quantity is : " + book.quantity);
                System.out.println("Enter the new qunatity: ");
                int quantity = sc.nextInt();
                sc.nextLine();
                book.title = title;
                book.author = author;
                book.description = description;
                book.isbn = isbn;
                book.publisher = publisher;
                book.category = category;
                book.quantity = quantity;
                System.out.println("Book updated successfully .... ");
                return;
            }
        }
    }

    public void searchBooks() {
        System.out.println("================Search Books=========");
        System.out.println("Enter the title of the book to search: ");
        System.out.println("Enter the title to search: ");
        // we will return all the books that match title and also very closely matches the title like if the title is "The Great Gatsby" and the user searches for "The Gatsby" we will return the book "The Great Gatsby"
        String titleToSearch = sc.nextLine();
        // boolean found = false;
        for (Book book : books) {
            if (book.title.contains(titleToSearch)) {
                // we need to print the search results 
                System.out.println("Title: " + book.title);
                System.out.println("Author: " + book.author);
                System.out.println("Publisher: " + book.publisher);
                System.out.println("Category: " + book.category);
                System.out.println("Quantity: " + book.quantity);
                System.out.println("Description: " + book.description);
                System.out.println("ISBN: " + book.isbn);
                System.out.println("--------------------------------");
            }
        }
        // if (!found) {
        //     System.out.println("No books found with title: " + titleToSearch);
        // }
    }

    public void deleteBooks() {
        System.out.println("================Delete Books=========");
        // if (isLoggedIn != true) {
        //     System.out.println("You are not logged in please login to update books .... ");
        //     return;
        // }
        // if (!currentUser.role.equals("admin")) {
        //     System.out.println("You are not authorized to add books .....");
        //     return;
        // }
        System.out.println("Enter the title of the book to delete: ");
        String titleToDelete = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equals(titleToDelete)) {
                books.remove(i);
                System.out.println("Book deleted successfully .... ");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found with title: " + titleToDelete);
        }
    }

    public static void login() {
        System.out.println("==========Login=============");
        System.out.println("Enter your emailId : ");
        String emailId = sc.nextLine();
        System.out.println("Enter your password .... ");
        String password = sc.nextLine();
        for (User user : users) {
            if (user.emailId.equals(emailId) && user.getPassword().equals(password)) {
                isLoggedIn = true;
                currentUser = user;
                System.out.println("Login successful .... ");
                break;
            } else {
                System.out.println("Invalid emailId or password .... ");
                isLoggedIn = false;
                currentUser = null;
                break;
            }
        }
    }

    public static void register() {
        System.out.println("==========Register=============");
        System.out.println("Enter your username :");
        String username = sc.nextLine();
        System.out.println("Enter your contact number :");
        long contactNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your emailId: ");
        String emailId = sc.nextLine();
        System.out.println("Enter your password : ");
        String password = sc.nextLine();
        System.out.println("Enter the role: ");
        String role = sc.nextLine();
        System.out.println("Enter your door number: ");
        String doorNumber = sc.nextLine();
        System.out.println("Enter your street: ");
        String street = sc.nextLine();
        System.out.println("Enter your city: ");
        String city = sc.nextLine();
        System.out.println("Enter your state: ");
        String state = sc.nextLine();
        System.out.println("Enter your country: ");
        String country = sc.nextLine();
        System.out.println("Enter your pincode; ");
        long pincode = sc.nextLong();
        sc.nextLine();
        String id = "USER - " + users.size() + 1;
        // create a User object
        User user = new User(username, contactNumber, password, emailId, state, country, city, street, doorNumber,
                pincode, role, id);
        users.add(user);
        System.out.println("User Registered successfully .... ");
    }
}
