package com.bitlabs.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int rollno;
String name;
String address;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "StudentEntity [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
}
public Student(int rollno, String name, String address) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.address = address;
}
public Student()
{

}
}