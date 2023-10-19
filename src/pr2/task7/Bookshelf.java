package pr2.task7;
import java.util.Arrays;
public class Bookshelf {
    private Book[] shelf;
    private int amo;

    public Bookshelf(Book[] shelf, int amo) {
        this.shelf = shelf;
        this.amo = amo;
    }

    public Book[] getShelf() {
        return shelf;
    }

    public void setBook(Book book, int i){
        this.shelf[i] = book;
    }
    public void setShelf(Book[] shelf) {
        this.shelf = shelf;
    }

    public int getAmo() {
        return amo;
    }

    public void setAmo(int amo) {
        this.amo = amo;
    }
    public Book minyear(){
        int mini = 10000;
        int j = 0;
        for (int i = 0; i<this.shelf.length; i++)
        {
            if (this.shelf[i].getYear()<mini){
                mini = this.shelf[i].getYear();
                j=i;
            }
        }
        return this.shelf[j];
    }
    public Book maxyear(){
        int maxi = -10000;
        int j = 0;
        for (int i = 0; i<this.shelf.length; i++)
        {
            if (this.shelf[i].getYear()>maxi){
                maxi = this.shelf[i].getYear();
                j =i;
            }
        }
        return this.shelf[j];
    }

    @Override
    public String toString() {
        return "Количество книг: "+amo +"\n" +Arrays.toString(shelf) +
                ", amo=" + amo;
    }
    public void sortShelf(){
        for (int i=0; i<this.shelf.length; i++){
            for (int j=0; j<this.shelf.length-1; j++){
                if (this.shelf[j].getYear()>this.shelf[j+1].getYear()){
                    Book tmp = this.shelf[j];
                    this.shelf[j] = this.shelf[j+1];
                    this.shelf[j+1] = tmp;
                }
            }
        }
    }
}