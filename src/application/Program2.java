package application;

import java.util.Date;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n==== TEST 1: Department Insert =====");
		Department newdepartment = new Department(null, "Games");
		departmentDao.insert(newdepartment);
		System.out.println("Inserted! New Id = " + newdepartment.getId());

	}

}
