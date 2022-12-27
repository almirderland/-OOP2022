package intranet;

import java.util.HashMap;

/**
* @generated
*/
public class Librarian extends Employee {
    
    public Librarian(String name, String surname, String birthDate, String phoneNumber, String email,
            String password) {
        super(name, surname, birthDate, phoneNumber, email, password);
        //TODO Auto-generated constructor stub
    }


    //                          Operations                                  
    
    /**
    * @generated
    */
    public void addBook(String title, String id, String author) {
        // TODO: existingBookException
        Book b = new Book(title, id, author);
        if(!Database.books.contains(b)) {
            Database.books.add(b);
        } 
    }
    /**
    * @generated
    */
    public void removeBook(String id) {
        // TODO: notExistingBookException
        for (Book book : Database.books) {
            if(book.getId().equals(id)) {
                Database.books.remove(book);
            }
        }
    }
    /**
    * @generated
    */
    public String updateOrderBook(String studentId, String bookId, String request) {
        Book b = new Book();
        for (Book book : Database.books) {
            if(book.getId().equals(bookId)) {
                b = book;
            }
        }

        for(HashMap.Entry<String, Book> item : Database.orders.entrySet()) {
            if(item.getKey().equals(studentId) && item.getValue().equals(b)) {
                if(request.equals(BookRequest.ACCEPT.toString())) {
                    Database.orders.remove(studentId, b);
                    return "Student's book is accepted";
                } else if(request.equals(BookRequest.REJECT.toString())) {
                    return "Student's book is rejected";
                }
            } else return "This order does not exist";
        }
        return "Orders does not exist";
    }
    
}
