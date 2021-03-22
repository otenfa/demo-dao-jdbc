package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println(" === TESTE findById === ");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n=== TESTE department findAll === ");
		List<Department> list = departmentDao.findAll();
		for (Department listaDep : list) {
			System.out.println(listaDep);
		}
		
		System.out.println("\n=== TESTE department insert === ");
		Department newDepartment = new Department(null, "Sociology II");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted new Department = " + newDepartment.getId());
	
		System.out.println("\n=== TESTE department update === ");
		newDepartment = departmentDao.findById(4); 
		newDepartment.setName("Economics III");
		departmentDao.update(newDepartment);
		System.out.println("Update executed! ");
		
		System.out.println("\n=== TESTE department delete === ");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed ");
		
		sc.close();
			
	}

}
