package service;


import dao.LogBfDao;
import model.LogBuffer;

public class LogBfManagerImpl  {

	
LogBfDao lbd=new LogBfDao();
	
	public LogBuffer getLogBuffer() {
		// TODO Auto-generated method stub
		LogBuffer lg=null;
		 
		lbd.getLogBuffer();
	      
		 return lg;
	            
	        
	}

	
	public void increaseSize(int percent) {
		// TODO Auto-generated method stub
		lbd.increaseSize(percent);
		
}


	public void decreaseSize(int percent) {
		// TODO Auto-generated method stub
		lbd.decreaseSize(percent);
	}

	
	public void setSize(int size) {
		// TODO Auto-generated method stub
		lbd.setSize(size);
		
	}



}
