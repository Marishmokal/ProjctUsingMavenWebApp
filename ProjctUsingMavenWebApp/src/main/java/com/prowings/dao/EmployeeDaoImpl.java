package com.prowings.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prowings.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void createEmployee(Employee employee) {
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		session.save(employee);
		txn.commit();
		session.close();
		
	}

	@Override
	public void deleteEmployee(int id) {
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		Employee e=session.get(Employee.class, id);
		session.delete(e);
		txn.commit();
		session.close();
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		session.saveOrUpdate(employee);
		txn.commit();
		session.close();
		
	}

	@Override
	public Employee retriveEmployee(int id) {
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		Employee e2=session.get(Employee.class, id);
		System.out.println(e2);
		txn.commit();
		session.close();
		return e2;
	}

	
	
	
}
