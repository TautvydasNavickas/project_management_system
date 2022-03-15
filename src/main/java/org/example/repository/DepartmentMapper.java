package org.example.repository;

import org.example.domain.Department;
import org.example.domain.DepartmentType;
import org.example.domain.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentMapper {

    public Department fromResultSet(ResultSet resultSet) throws SQLException {
        return new Department(
                resultSet.getString("vadovas_asmenskodas"),
                toDepartment(resultSet.getString("pavadinimas"))

                );
    }








    private DepartmentType toDepartment(String department) {
        if (department == null) {
            return null;
        }

        switch (department) {
            case "Testavimo" -> {
                return DepartmentType.QA;
            }
            case "Java" -> {
                return DepartmentType.JAVA;
            }
            case "C#" -> {
                return DepartmentType.C_SHARP;
            }
            default -> {
                return null;
            }
        }
    }
}
