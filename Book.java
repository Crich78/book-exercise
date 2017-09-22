/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Connor Richardson)
 * @version (9/22/2017)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    public int pages;
    public String refNumber;
    

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages =  bookPages;
        refNumber = "";
    }

    // Add the methods here ...
    
   public String getAuthor()
   {
     return author;  
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
     return refNumber;   
    }
    
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    public void printAuthor()
    {
        System.out.println ("The author is " + author+".");
    }

    public void printTitle()
    {
        System.out.println ("The title of the book is " + title + ".");
    }
    
    public void printPages()
    {
        System.out.println ("The book is "+pages + " pages.");
    }
    
    public void printDetails()
    {
        System.out.println("Title: "+ title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    
        if (refNumber.length() >= 3)
        {
            System.out.println("Reference Number: " + refNumber);
        }
        else 
        {
            System.out.println("Your reference number is invalid!");
        }
    
    }
    
   
}
