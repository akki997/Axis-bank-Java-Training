package com.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {

	Scanner s=new Scanner(System.in);
List<Book>li=new ArrayList<Book>();

public void add(Book b)
{
	li.add(b);
}
public void searchByTitle(String title)
{
	
	for(int i=0;i<li.size();i++)
	{
		if(li.get(i).getTitle().equals(title))
		System.out.println("Details of "+"(i+1)"+ "Book:\n"+ li.get(i).getBookId()+
				"\n"+li.get(i).getTitle()+"\n"+li.get(i).getAuthor()+"\n"+
				li.get(i).getCategory()+"\n"+li.get(i).getPrice());
	}
	
}

public void searchByAuthor(String author)
{
	
	for(int i=0;i<li.size();i++)
	{
		if(li.get(i).getTitle().equals(author))
		System.out.println("Details of "+"(i+1)"+ "Book:\n"+ li.get(i).getBookId()+
				"\n"+li.get(i).getTitle()+"\n"+li.get(i).getAuthor()+"\n"+
				li.get(i).getCategory()+"\n"+li.get(i).getPrice());
	}
	
}
public void displayAll()
{
	for(int i=0;i<li.size();i++)
	{
		System.out.println("Details of "+"(i+1)"+ "Book:\n"+ li.get(i).getBookId()+
				"\n"+li.get(i).getTitle()+"\n"+li.get(i).getAuthor()+"\n"+
				li.get(i).getCategory()+"\n"+li.get(i).getPrice());
	}
}
public void displayBook(String bookId)
{
	for(int i=0;i<li.size();i++)
	{
		if(li.get(i).getTitle().equals(bookId))
		System.out.println("Details of "+"(i+1)"+ "Book:\n"+ li.get(i).getBookId()+
				"\n"+li.get(i).getTitle()+"\n"+li.get(i).getAuthor()+"\n"+
				li.get(i).getCategory()+"\n"+li.get(i).getPrice());
	}
}
public void updateBook(String bookId)
{
	for(int i=0;i<li.size();i++)
	{
		if(li.get(i).getTitle().equals(bookId))
			
		{
			System.out.println("Enter new bookId");
			li.get(i).setBookId(s.next());
			System.out.println("Enter new title");
			li.get(i).setTitle(s.next());
			System.out.println("Enter new Author");
			li.get(i).setAuthor(s.next());
			System.out.println("Enter new category");
			li.get(i).setCategory(s.next());
			System.out.println("Enter new Price");
			li.get(i).setPrice(s.nextFloat());
		}
	}
}
}
