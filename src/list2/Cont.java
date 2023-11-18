package list2;


public class Cont {
    private Element element;
    private int count;
    public Cont() {
        this.element = new Element(null, null);
        count=0;
    }
    public Element getLast(){
        Element el = this.element;
        while (el.getNext()!=null){
            el = el.getNext();
        }
        return el;
    }
    public void insert(String string){
        getLast().setNext(new Element(string, null));
        count++;
    }
    public boolean remove(int index){
        if (index < 1 && index > count) return false;
        Element current = element;
        for (int i =1; i < index; i++){
            if (current.getNext() == null) return false;
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        count--;
        return true;
    }
    @Override
    public String toString() {
        if (element.getNext() == null) return "В списке нет студентов";
        else {
            Element st = element.getNext();
            String str = "";
            do {
                str = str + st.toString() + "\n";
                st = st.getNext();
            } while (st != null);
            return str;
        }
    }
    public void sort(){
        Element current = this.element.getNext();
        Element el = current;
        Element maxi = el;
        Element premaxi = el;
        for (int i=0; i<=count; i++){
            while (el.getNext()!=null){
                if (maxi.getString().compareTo(el.getNext().getString())<0){
                    maxi = el.getNext();
                    premaxi = el;
                }
                el = el.getNext();
            }
            premaxi.setNext(maxi.getNext());
            maxi.setNext(current.getNext());
            current = maxi.getNext();
            getLast().setNext(null);
            element.setNext(maxi);
            System.out.println(i);
        }
    }
    public void sort2(){
        Element list_start = element;
        Element current;
        Element premaxi = new Element("", null);
        Element prev_list_start = new Element("", element);
        for (int i=0; i<count; i++){

            System.out.println(toString());
            current = prev_list_start.getNext();
            Element maxi = current.getNext();
            while (current.getNext()!=null){
                if (maxi.getString().compareTo(current.getNext().getString())<0){
                    maxi = current.getNext();
                    premaxi.setNext(current);
                }
                current = current.getNext();
            }
            premaxi.getNext().setNext(maxi.getNext());
            prev_list_start.getNext().setNext(maxi);

            if (prev_list_start.getNext()!=null){
                if(prev_list_start.getNext()!=maxi){
                    maxi.setNext(prev_list_start.getNext());
                } else if (prev_list_start.getNext().getNext() !=null) {
                    maxi.setNext(prev_list_start.getNext().getNext());
                }
            }
            else maxi.setNext(null);
            prev_list_start=prev_list_start.getNext();

        }
    }
    /*
    // Функция для сортировки односвязного списка путем исключения максимального элемента и включения его в начало списка
    public void sortListByMax() {
        Element head = element;
        // Если список пустой или содержит один элемент, то ничего не делаем
        if (head == null || head.getNext() == null) {
            return;
        }
        // Создаем фиктивный узел, который будет указывать на начало списка
        Element dummy = new Element(0);
        dummy.setNext(head);
        // Создаем два указателя, один для текущего узла, другой для предыдущего узла
        Element curr = head;
        Element prev = dummy;
        // Пока список не отсортирован
        while (!isSorted(dummy.next)) {
            // Находим максимальный элемент в списке и его предыдущий узел
            Element max = curr;
            Element maxPrev = prev;
            while (curr != null) {
                if (curr.data > max.data) {
                    max = curr;
                    maxPrev = prev;
                }
                prev = curr;
                curr = curr.next;
            }
            // Исключаем максимальный элемент из списка
            maxPrev.next = max.next;
            // Включаем его в начало списка
            max.next = dummy.next;
            dummy.next = max;
            // Сбрасываем указатели на начало списка
            curr = dummy.next;
            prev = dummy;
        }
        // Возвращаем отсортированный список
        head = dummy.next;
    }*/
    public void sort3(){
        Element test = new Element("1", element);
        System.out.println(element);
        System.out.println(test);
        test = element;
        System.out.println(test);
        test.setString("2");
        System.out.println(test);
        System.out.println(element);
        test.setNext(new Element("123", null));
        System.out.println(test.getNext());
        System.out.println(element.getNext());
    }
    public void sort4(){
        Element premax;
        Element max;
        Element lastmax = element;
        for (int i=0; i<count;i++){
            Element current = lastmax;
            max = lastmax.getNext();
            premax = lastmax;
            while(current.getNext()!=null){
                if (max.getString().compareTo(current.getNext().getString())<0){
                    max = current.getNext();
                    premax = current;
                }
                current = current.getNext();
            }
            if (max.getNext() != null){
                premax.setNext(max.getNext());
            }
            else {
                premax.setNext(null);
            }
            max.setNext(lastmax.getNext());
            lastmax.setNext(max);

            lastmax = max;

        }
    }
}