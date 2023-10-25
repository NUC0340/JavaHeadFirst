package nuc_zhy0340_list_abstract;

public interface MyList {
	public void insertElem(int index, Object e);
	
	public void insertElem(Object e);
	
	public int indexOf(Object e);
	
    public int lastIndexOf(Object e);
	
	public boolean remove(int index);
	
	public boolean remove(Object e);
	
	public void change(int index, Object e);
	
	public boolean isEmpty();
	
	public int getLength();
	
	public void clear();
}
