package edu.qsp.lms.view;


import java.util.Scanner;
import edu.qsp.lms.controller.LibraryController;
import edu.qsp.lms.model.Book;
import edu.qsp.lms.model.Library;

public class View {
	static Scanner myInput = new Scanner(System.in);
	static LibraryController controller = new LibraryController();
	static Library library = new Library();

	static {
		System.out.println("----WELCOME TO LIBRARY MANAGEMENT SYSTEM----");
		//
		System.out.println("Enter name of the Library : ");
		String libraryName = myInput.nextLine();
		library.setLibraryName(libraryName);
		System.out.println("Enter address of library : ");
		String libraryAddress = myInput.nextLine();
		library.setLibraryAddress(libraryAddress);
		System.out.println("Enter Pincode : ");
		int librarayPincode = myInput.nextInt();
		myInput.nextLine();
		library.setLibraryPincode(librarayPincode);
	}

	public static void main(String[] args) {
		do {
			System.out.println("Select operation to perform : ");
			System.out.println("1.Add book\n2.Remove book\n3.Update book\n4.Get book by book name\n5.Get all books\n0.Exit");
			System.out.println("Enter digit respective to desired option : ");
			int userChoice=myInput.nextInt();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				myInput.close();
				System.out.println("----EXITED----");
				System.exit(0);
				break;
			case 1:
				Book book= new Book();
				System.out.println("Enetr book name : ");
				book.setBookName(myInput.nextLine());
				System.out.println("Enter author name : ");
				book.setBookAuthor(myInput.nextLine());
				System.out.println("Enter price of the book : ");
				book.setPrice(myInput.nextDouble());
				System.out.println("Enter publication : ");
				myInput.nextLine();
				book.setPublication(myInput.nextLine());
				//
				controller.addBook(book);
				break;
			case 2:
				System.out.println("Enter the name of the book to be removed : ");
				String booktobeRemoved =myInput.nextLine();
				boolean verify = controller.removeBookByBookName(booktobeRemoved);
				if (verify) {
					System.out.println("Book removed from the library");
				} else {
					System.out.println("Book does not Exit");
				}
				break;
			case 3:
				Book book3 = new Book();
				System.out.println("Enter name of the book to update : ");
				String bookToUpdate = myInput.nextLine();
				book3.setBookName(bookToUpdate);
				System.out.println("Enter price to update : ");
				double newPrice = myInput.nextDouble();
				book3.setPrice(newPrice);
				//
				boolean verifyUpdate =controller.updateBookPriceByBookName(book3);
				if (verifyUpdate) {
					System.out.println("Book price is updated.");
				} else {
					System.out.println("Mentioned book does not exist in library");
				}
				break;
			case 4:
				System.out.println("Enter name of book : ");
				String bookToGet = myInput.nextLine();
				//
				Book book4 = controller.searchBook(bookToGet);
				if (book4!=null) {
					System.out.println(book4);
				} else {
					System.out.println("Book not found.");
				}
				break;
			case 5:
				System.out.println(controller.getAllBooks());
				break;
			default:
				System.out.println("----INVALID SELECTION----");
				break;
			}
		} while (true);
			
	}
}