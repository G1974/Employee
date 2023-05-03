package gr.prog.dao;

import java.sql.SQLException;
import java.util.List;

import gr.prog.model.EmployeeGeneral;

public interface EmployeeDao {
void insert(EmployeeGeneral empolyeegeneral)throws SQLException;
void delete(EmployeeGeneral empolyeegeneral)throws SQLException;
void update (EmployeeGeneral  oldempolyeegeneral,EmployeeGeneral  newempolyeegeneral)throws SQLException;
List<EmployeeGeneral>getDetails(String surname)throws SQLException;
EmployeeGeneral getId(int id)throws SQLException;
}
