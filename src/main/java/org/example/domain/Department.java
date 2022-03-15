package org.example.domain;

public class Department {
    private String id;
    private DepartmentType departmentType;

    public Department(String id, DepartmentType departmentType) {
        this.id = id;
        this.departmentType = departmentType;
    }

    public String getId() {
        return id;
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", departmentType=" + departmentType +
                '}';
    }
}


