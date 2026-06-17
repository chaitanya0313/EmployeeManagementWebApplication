package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Employee;
import util.DBConnection;

public class EmployeeDAO {

    public void addEmployee(Employee emp) {

        String sql =
                "insert into employee values(?,?,?,?)";

        try {

            PreparedStatement ps =
                    DBConnection.getConnection()
                            .prepareStatement(sql);

            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Employee> getAllEmployees() {

        ArrayList<Employee> list =
                new ArrayList<>();

        String sql = "select * from employee";

        try {

            PreparedStatement ps =
                    DBConnection.getConnection()
                            .prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            while (rs.next()) {

                Employee e =
                        new Employee(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getString("department"),
                                rs.getDouble("salary"));

                list.add(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
    public void updateSalary(int id, double salary) {

        String sql =
                "update employee set salary=? where id=?";

        try {

            PreparedStatement ps =
                    DBConnection.getConnection()
                            .prepareStatement(sql);

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Salary Updated");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {

        String sql =
                "delete from employee where id=?";

        try {

            PreparedStatement ps =
                    DBConnection.getConnection()
                            .prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}