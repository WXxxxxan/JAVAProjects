package objectIOStream;

import java.io.Serializable;

public class Student implements Comparable<Student>,Serializable  {
	private long studentID;
	private String name;
	private String sex;
	public Student(){} 
	public Student(long _studentID,String name,String sex){
		studentID = _studentID;
		this.name = name;
		this.sex =sex;
	}
	public long getStudentID(){
		return studentID;
	}
	public String getName(){
		return name;
	}		
	public String getSex(){
		return sex;
	}
	@Override
	public int compareTo(Student s) {
		int result = studentID > s.studentID ? 1 : (studentID == s.studentID ? 0 : -1);
		return result;
	}
	@Override
	public String toString() {
		return studentID + "  " + name + "     " + sex;
	}
}
