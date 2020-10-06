package com.bookutil;
import java.util.Scanner;

import com.book.*;

public class BookUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        BookStore bookstore=new BookStore();
        System.out.println("1. Instantiate the BookStore class ");
        System.out.println("2. Read data from user for 3 Book objects. and call addBook method  ");
        System.out.println("3. Search the books by title and author ");
        System.out.println("4. Display all the book details ");
        System.out.println("5. Update the title and author of a particular book");
        System.out.println("6. Display the details of updated book");
        while(true)
        {
        	System.out.println("Enter choice");
        
        int ch=s.nextInt();
        switch(ch)
        {
        case 1:BookStore bs=new BookStore();
           break;
        case 2:
        	
        	
        	for(int i=0;i<3;i++)
        	{
        		Book b=new Book();
        		System.out.println("Enter the BookId");
        		b.setBookId(s.next());
        		System.out.println("Enter the Title");
        		b.setTitle(s.next());
        		System.out.println("Enter the Author");
        		b.setAuthor(s.next());
        		System.out.println("Enter the Category");
        		b.setCategory(s.next());
        		System.out.println("Enter the Price");
        		b.setPrice(s.nextFloat());
        		bookstore.add(b);
        	}
        	break;
        case 3:
        	System.out.println("Enter the title or author");
        	String st=s.next();
        	bookstore.searchByTitle(st);
        	bookstore.searchByAuthor(st);
        	
        	break;
        case 4:
        	bookstore.displayAll();
        	break;
        case 5:
        	System.out.println("Enter the bookId to update");
        	bookstore.updateBook(s.next());
        	break;
        case 6:
        	System.out.println("Enter the title or author");
         	String t=s.next();
        	bookstore.searchByTitle(t);
        	bookstore.searchByAuthor(t);
        }
        }
        
	}

}
