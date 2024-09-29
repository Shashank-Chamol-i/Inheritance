/*To check whole implementation check the program 06 */
package Relationship;
class Book
{
    String title;
    String ISBN;
    int publicationYear;
    Author author;
    public Book(String title,String ISBN,int publicationYear,Author author)
    {
        this.title = title;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.author = author;
    }
    void display()
    {
        System.out.println("Title of Book : "+title+" ISBN : "+ISBN+" Year : "+publicationYear);
        System.out.println("Author Name : "+author.name+" Birth Year : "+author.birthYear+" Nationality : "+author.nationality);
    }
}
public class Program07 {
    public static void main(String[] args)
    {
        Author author = new Author("JK Rowling",1965,"British");
        Book book = new Book("Harry Potter", "US000069",1997,author);
        book.display();
    }
}
