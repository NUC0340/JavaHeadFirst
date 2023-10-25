package nuc_zhy0340_list_abstract;

public  abstract class MyAbstractList implements MyList{

	protected int size = 0;

	
	public MyAbstractList() {
		super();
	}

	public MyAbstractList (Object[] objects) {
		for(int i=0; i<objects.length; i++) {
			insertElem(objects[i]);
		}
		size = objects.length;
	}

	public void insertElem(Object e) {
		// TODO Auto-generated method stub
		insertElem(size,e);
	}

	public boolean remove(Object e) {
			if (indexOf(e) >= 0) {
				remove(indexOf(e));
				return true;
			}
			return false;
		}
	


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	public int getLength() {
		// TODO Auto-generated method stub
		return size;
	}


	

}
