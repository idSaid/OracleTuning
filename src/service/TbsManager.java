package service;

import java.util.List;

import model.tableSpaceFactory.TableSpace;

public interface TbsManager {
	
	public void addTbs(TableSpace tableSpace);
	public TableSpace findOne(String name);
	public List<TableSpace> findAll();
	public void setDefaultTableSpace(TableSpace tableSpace);
	public void editSize(TableSpace tableSpace, Long size);
	public void editThreshold(TableSpace tableSpace, Long threshold);
	public void activerTbs(TableSpace tableSpace);
	public void desactiverTbs(TableSpace tableSpace);
	public double getFreeSpace(TableSpace tableSpace);
	public void replaceCurrentUndoTbs(TableSpace tableSpace);
	
}
