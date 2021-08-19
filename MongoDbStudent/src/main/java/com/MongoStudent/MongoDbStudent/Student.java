package com.MongoStudent.MongoDbStudent;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {
	 @Id
	    private long id;
	    private String name;
	    @Indexed(direction = IndexDirection.ASCENDING)
	    private String department;
	    private String college;
		public long getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getDepartment() {
			return department;
		}
		public String getCollege() {
			return college;
		}
		public void setId(long id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public void setCollege(String college) {
			this.college = college;
		}
		public Student(long id,String name, String department, String college) {
			super();
			this.id=id;
			this.name = name;
			this.department = department;
			this.college = college;
		}
		
}
