package model;

public class Redo_File {
	private String path;
	private int size;
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Redo_File(String path, int size) {
		super();
		this.path = path;
		this.size = size;
	}
	
	

}
