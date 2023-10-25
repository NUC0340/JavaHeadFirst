package nuc_zhy0340_list_abstract;

public class MyArrayList extends MyAbstractList{

	private Object[] data = new Object[CAPACITY];
	public static final int CAPACITY = 100;
	
	
	public MyArrayList() {}
	
	

	public MyArrayList(Object[] data) {
		super(data);
	}

	public int indexOf(Object e) {
		for(int i = 0; i < size; i++) {
			if(data[i].equals(e)) return i+1;
		}
		return -1;
	}

	public boolean remove(int index) {
        for(int i = index-1; i < size; i++) {
            data[i] = data[i+1];
        }
        size--;
		return true;
	}

	public void change(int index, Object e) {
		data[index - 1] = e;
	}

	public void clear() {
		size = 0;
	}
	
	public void insertElem(int index, Object e) {
		for(int i = size-1; i >= index; i--) {
			data[i+1] = data[i];
		}
		data[index] = e;
		size++;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer("[");
		for(int i = 0; i < size; i++) {
			result.append(data[i]);
			if(i<size-1) {
				result.append(",");
			}
		}
		StringBuffer result1 = new StringBuffer("]");
		return result.toString() + result1.toString();
	}

	public int lastIndexOf(Object e) {
        for (int i = size-1; i > 0; i--) {
            if(data[i].equals(e)) {
                return i+1;
            }
        }
        return -1;
    }
}
