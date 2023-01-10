package ChapterSeven;

import java.util.Collection;

public class ArrayList implements ListImpl{
    private int size;
    private Object[] elementData;
    private int addCount;
    private int modCount;
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }


    @Override
    public boolean remove(Object o) {
        final Object[] es = elementData;
        final int size = this.size;
        int i = 0;
        found: {
            if (o == null) {
                for (; i < size; i++)
                    if (es[i] == null)
                        break found;
            } else {
                for (; i < size; i++)
                    if (o.equals(es[i]))
                        break found;
            }
            return false;
        }
        fastRemove(es, i);
        return true;
    }

    private void fastRemove(Object[] es, int i) {

        modCount++;
        final int newSize;
        if ((newSize = size - 1) > i)
            System.arraycopy(es, i + 1, es, i, newSize - i);
        es[size = newSize] = null;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return indexOfRange(o, 0, size);
    }

    @Override
    public int lessIndexOf(Object o) {
        return 0;
    }
    int indexOfRange(Object o, int start, int end){

        Object[] element = elementData;
        if(o == null){
            for(int i = start; i < end; i++){
                if(element[i] == null){
                    return i;
                }
            }
        }
        else{
            for(int i = start; i < end; i++){
                if(o.equals(element[i])){
                    return i;
                }
            }
        }
        return -1;
    }
}
