import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class HRDepartment {
	
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	public void addEmployee(int employeeId, String name, int role) {
		Employee newEmployee = new Employee(employeeId, name, role);
		employeeList.add(newEmployee);
	}
	
	public void printAllEmployees() {
		
		for(int i = 0; i < employeeList.size(); i++) {
			System.out.println("Name: " + employeeList.get(i).getName() + " ID: " + employeeList.get(i).getEmployeeId()
					+ " Role: " + employeeList.get(i).getRole());
		}
	}
	
	public Employee findEmployee(int employeeId) {
		
		for(int i = 0; i < employeeList.size(); i++) {
			
			if(employeeId == employeeList.get(i).getEmployeeId()){
				return employeeList.get(i);
			}
			
		}
		
		
		return null;
		
	}
	
	public boolean recordEmployeeAppraisal(int employeeId, Date appraisalDate, int score) {
		
		if (findEmployee(employeeId) != null) {
		
			EmployeeAppraisal appraisal = new EmployeeAppraisal(appraisalDate, score);
			findEmployee(employeeId).getAppraisalHistory().add(appraisal);
			return true;
		}
		return false;
		
	}
	
	public boolean promoteEmployee(int employeeId){
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.YEAR,-1);
		Date date = calendar.getTime();
		
		Employee tempEmployee = findEmployee(employeeId);
		
		if (tempEmployee.getAppraisalHistory().size() >= 2 ) {

		
			if (tempEmployee.getAppraisalHistory().get(tempEmployee.getAppraisalHistory().size() - 1).getAppraisalScore() == 1
					&& tempEmployee.getAppraisalHistory().get(tempEmployee.getAppraisalHistory().size() - 2).getAppraisalScore() == 1){
				
				if(tempEmployee.getPromotionDate().getTime() <= date.getTime() && tempEmployee.getRole() > 1) {
					findEmployee(employeeId).setRole(tempEmployee.getRole() - 1);
					return true;
				}
				
			}
		
		}
		
		return false;
		
	}

}
