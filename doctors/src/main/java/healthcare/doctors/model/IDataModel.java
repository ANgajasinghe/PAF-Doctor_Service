package healthcare.doctors.model;

import java.sql.Connection;
import java.util.List;

import dto.DoctorDTO;


public interface IDataModel {
	
	public boolean connectionChecker(Connection MYSQLcon);
	
	public DoctorDTO getAllDoctors(String ALL);
	public DoctorDTO getAllSpecifications();
	
	
	public DoctorDTO SelectDocId(String regNO);
	public DoctorDTO SelectDocById(String id);
	
	public DoctorDTO insertIntoDoctors(DoctorDTO doctorDTOs);
	
	public DoctorDTO insertIntoDocHospital(String Hospitals,String RegNo);
	
	
	public String DocWorkAssign(DoctorDTO doctorDTO);
	
	public DoctorDTO DeleteDoc(int docID);
	public String UpdateDoc(String docID , DoctorDTO dto);
	
	
}
