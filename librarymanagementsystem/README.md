# Library-Management-System-Core-Java-Project
This console-based Library Management System (LMS) project is implemented in Core Java, providing essential functionalities for managing a library's book inventory. The system follows the widely adopted Model-View-Controller (MVC) architectural pattern to enhance maintainability, scalability, and code organization.  The system includes features for adding, removing, updating, and fetching books, offering a practical solution for librarians to streamline their daily tasks.   


**MVC Architecture**

**Model**

The **edu.qsp.lms.model package** contains classes defining the data model for the library.
The Library class represents the core data structure, encapsulating details such as library name, address, and pin code.
The Book class defines the structure for individual books, including attributes like name, author, and price.

**View**

The **edu.qsp.lms.view package** houses the user interface layer.
The View class handles user input and output, providing an interactive console-based interface.
User interactions trigger actions within the Controller to maintain a clear separation of concerns.

**Controller**

The **edu.qsp.lms_controller** package contains the controller logic, serving as the intermediary between the View and Model.
The controller class orchestrates the flow of data and operations, ensuring that user requests are appropriately processed.

**Controller Operations**

1.Add Book:

The **'addBook'** method allows the addition of a new book to the library's inventory.
It ensures the existence of the books list and updates the library's book collection.

2.Remove Book:

The **'removeBook'** method removes a book from the library's inventory based on the provided book name.
It iterates through the list of books, finds the matching book, and removes it.

3.Update Book:

The **'updateBook'** method updates an existing book with new information.
It searches for the book to be updated, removes it from the list, and adds the updated version.

4.Get Book By Book Name:

The **'getbookbyname'** method search the book based on the name of the book and it retrieves the corresponding data. 5.Get all Books: The **'getbookbyname'**

5.Get all Books:

The **'getBook'** method retrieves a book from the library based on the provided book name. It iterates through the list of books to find the matching book and returns it.

**Controller Interaction**

The controller class interacts directly with the library model to retrieve and update the list of books.
It ensures data integrity and consistency by managing the flow of information between the user interface and the underlying data model.

**Features**

**Library Initialization**

The LMS starts by prompting the user to initialize the library with the following information:

Library Name
Library Address
Library Pin Code

This initialization process ensures that each library instance has unique identification details.

**Book Management**


Users can add a new book to the library.
Required details include the book name, author name, price and publication.


Users can remove a book from the library by providing the book's name.


Users can update existing book details.
Options include updating the book name, author name, price and publication.


Users can retrieve details of a specific book by searching for it using its name.

**User Interface**

The program provides a simple and interactive console-based user interface.
Users are presented with a menu, and they can input a digit corresponding to the desired operation.

**Continuous Operation**

The program runs in a loop, allowing users to perform multiple operations without restarting.
Users can exit the program gracefully by choosing the "Exit" option.

**How to Run**

1.Compile and Run:

javac edu/qsp/lms/view/View.java, 

java esu/qsp/lms/view/View

2.Follow On-screen Prompts:

Enter library details during initialization.

Choose options to add, remove, update, or get book details.

**Use Cases**

**To Add Book**

![Screenshot (117)](https://github.com/ganeshmohite1808/librarymanagementsystem/assets/147703435/4d14f269-29cb-4c5a-b975-eea69e4c96bc)

**To Remove Book**

![Screenshot (120)](https://github.com/ganeshmohite1808/librarymanagementsystem/assets/147703435/c902f615-b0ba-487e-8390-e704fe474a4c)


**To Update Book**

![Screenshot (119)](https://github.com/ganeshmohite1808/librarymanagementsystem/assets/147703435/60e99ee5-3d75-40d7-9d17-d902ff4f8c60)


**To Fetch Book By Book Name**

![Screenshot (118)](https://github.com/ganeshmohite1808/librarymanagementsystem/assets/147703435/4fa57eb2-2a31-409f-9b4f-b0354276ee34)


**To Fetch All records**

![Screenshot (11118)](https://github.com/ganeshmohite1808/librarymanagementsystem/assets/147703435/3d2452a4-3cb4-4230-a991-14a685e5b2e3)


**To Exit Console**

![Screenshot (121)](https://github.com/ganeshmohite1808/librarymanagementsystem/assets/147703435/a7c8b2ba-00d3-4f04-b2ee-daf76edb5516)



Contributions are welcome! If you encounter any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.


