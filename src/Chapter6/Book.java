//package Chapter6;
//import ChapterSeven.T;
//
//import java.util.*;
//
//public class Book implements List<T> {
//        public Book(String firstName, String lastName, String phone, String email) {
//
//        }
//
//        public Book() {
//
//        }
//
//        public static <Contact, T> void main(String[] args) {
//            Book[] contacts = new Book[20];
//
//            Scanner scanner = new Scanner(System.in);
//
//            for (int i = 0 ; i < contacts.length; i++) {
//                System.out.println("insert firstname : ");
//                String firstName = scanner.nextLine();
//                System.out.println("insert lastName : ");
//                String lastName = scanner.nextLine();
//                System.out.println("insert phone : ");
//                String phone = scanner.nextLine();
//                System.out.println("insert email : ");
//                String email = scanner.nextLine();
//                Book cont = new Book(firstName, lastName, phone, email);
//                Contact[] lsCont = null;
//                lsCont.equals(cont);
//                List<T> book = null;
//                List<T> tell = null;
//
//
//                Collections.sort(new Book());
//                for (Contact contact : lsCont) {
//                    System.out.println(contact.toString());
//                }
//            }
//
//        }
//
//    @Override
//    public int size() {
//        return 0;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return false;
//    }
//
//    @Override
//    public boolean contains(Object o) {
//        return false;
//    }
//
//    @Override
//    public Iterator<T> iterator() {
//        return null;
//    }
//
//    @Override
//    public Object[] toArray() {
//        return new Object[0];
//    }
//
//    @Override
//    public boolean add(T t) {
//        return false;
//    }
//
//    @Override
//    public boolean remove(Object o) {
//        return false;
//    }
//
//    @Override
//    public boolean containsAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(Collection<? extends T> c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(int index, Collection<? extends T> c) {
//        return false;
//    }
//
//    @Override
//    public boolean removeAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean retainAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
//    @Override
//    public T get(int index) {
//        return null;
//    }
//
//    @Override
//    public T set(int index, T element) {
//        return null;
//    }
//
//    @Override
//    public void add(int index, T element) {
//
//    }
//
//    @Override
//    public T remove(int index) {
//        return null;
//    }
//
//    @Override
//    public int indexOf(Object o) {
//        return 0;
//    }
//
//    @Override
//    public int lastIndexOf(Object o) {
//        return 0;
//    }
//
//    @Override
//    public ListIterator<T> listIterator() {
//        return null;
//    }
//
//    @Override
//    public ListIterator<T> listIterator(int index) {
//        return null;
//    }
//
//    @Override
//    public List<T> subList(int fromIndex, int toIndex) {
//        return null;
//    }
//
//    @Override
//    public <T> T[] toArray(ChapterSeven.T[] a) {
//        return null;
//    }
//}
//
//
