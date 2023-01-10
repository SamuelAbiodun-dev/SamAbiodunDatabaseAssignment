package ChapterSeven;

import java.util.Collection;

public interface ListImpl {
    int size();
    boolean isEmpty();
    boolean contains(Object o);

    boolean remove(Object o);
    boolean removeAll(Collection<?> collection);
    boolean retainAll(Collection<?> collection);
    boolean equals(Object o);
    Object remove(int index);
    int indexOf(Object o);
    int lessIndexOf(Object o);

}
