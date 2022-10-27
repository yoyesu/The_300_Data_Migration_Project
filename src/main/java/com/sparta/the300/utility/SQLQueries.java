package com.sparta.the300.utility;

public interface SQLQueries {

    String SELECT_EMPLOYEES = "SELECT * FROM employees;";
    String SELECT_COUNT_EMPLOYEES = "SELECT COUNT(*) FROM employees";
    String DROP_TABLE = "DROP TABLE employees";
    String INSERT_INTO = "INSERT INTO employees " +
            "(employee_id, title, first_name, middle_initial, last_name, gender, " +
            "email, birth_date, join_date, salary) " +
            "VALUES(?,?,?,?,?,?,?,?,?,?);";
    String CREATE_TABLE = "CREATE TABLE employees (" +
            "employee_id VARCHAR(10) NOT NULL PRIMARY KEY," +
            "title VARCHAR(5)," +
            "first_name VARCHAR(30)," +
            "middle_initial CHAR(1)," +
            "last_name VARCHAR(30)," +
            "gender VARCHAR(1)," +
            "email VARCHAR(40)," +
            "birth_date DATE," +
            "join_date DATE," +
            "salary INTEGER" +
            ");";


}
