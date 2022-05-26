package com.jdbc.example;

public class BussLayer {

	DBmanager db;

	public BussLayer() {
		db = new DBmanager();
	}

	public void insertData(int sid, String name, String rollno, int marks) {
		String cmd = "insert into dbtable values('" + sid + "', '" + name + "', '" + rollno + "', '" + marks + "')";

		if (db.RecordsManipulation(cmd)) {
			System.out.println("Record has been saved successfully");
		} else {
			System.out.println("Records has not been saved successfully");
		}
	}

	public void updateData(int sid, int marks) {
		String cmd = "UPDATE dbtable set marks = '" + marks + "' WHERE id = '" + sid + "'";

		if (db.RecordsManipulation(cmd)) {
			System.out.println("Record has been updated successfully");
		} else {
			System.out.println("Records has not been updatedS successfully");
		}
	}

	public void deleteData(int sid) {
		String cmd = "delete from dbtable where id = '" + sid + "'";
		if (db.RecordsManipulation(cmd)) {
			System.out.println("Record has been deleted successfully");
		} else {
			System.out.println("Record has not been deleted successfully");
		}
	}
}
