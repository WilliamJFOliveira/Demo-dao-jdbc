package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
		
		System.out.println("\n ===== TEST 1: Department findById =====");
		
			Department department = departmentDao.findById(3);
			System.out.println(department);
			
		System.out.println("\n ===== TEST 2: Department findAll =====");
			List<Department> list = departmentDao.findAll();
			for(Department obj : list) {
				System.out.println(obj);
			}
		System.out.println("\n===== TEST 1: Department Insert =====");
			Department newdepartment = new Department(null, "Games");
			departmentDao.insert(newdepartment);
			System.out.println("Inserted! New Id = " + newdepartment.getId());
		
		System.out.println("\n ===== TEST 2: Department Update =====");
					
		System.out.println("\n ===== TEST 3: Department Delete =====");
		
		
		
		
		
		

	}

}
