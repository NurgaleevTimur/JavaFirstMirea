package list2;
public class Element {
    private String string;
    private Element next;

    public Element(String string, Element next) {
        this.string = string;
        this.next = next;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return string;
    }
}