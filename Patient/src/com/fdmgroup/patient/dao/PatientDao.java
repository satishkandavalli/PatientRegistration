package com.fdmgroup.patient.dao;

import java.sql.SQLException;
import java.util.List;

import com.fdmgroup.patient.model.Patient;

public interface PatientDao {

	void insertTodo(Patient todo) throws SQLException;

	Patient selectTodo(long todoId);

	List<Patient> selectAllTodos();

	boolean deleteTodo(int id) throws SQLException;

	boolean updateTodo(Patient todo) throws SQLException;

}