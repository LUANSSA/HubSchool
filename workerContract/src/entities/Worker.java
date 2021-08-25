package entities;

import java.util.ArrayList;

public class Worker {

	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	private Department department;
	private ArrayList<HourContract> contracts;
	public Integer manyContractsWork;
	
	public Worker() {
		department = new Department();
		contracts = new ArrayList<HourContract>();
	}
	
	//Métodos getters e setters
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//worker level
	public WorkerLevel getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = WorkerLevel.valueOf(level);
	}
	//basy salary
	public double getSalaryBase() {
		return this.baseSalary;
	}
	public void setSalaryBase(double salaryBase) {
		this.baseSalary = salaryBase;
	}
	//department
	public Department getDepartment() {
		return this.department;
	}
	//Contracts
	public ArrayList<HourContract> getContracts() {
		return contracts;
	}
	public void setaddContract(HourContract contract) {
		this.contracts.add(contract);
	}
	public void setRemoveContract(HourContract contract) {
		for(HourContract ctr : this.contracts) {
			
		}
		
	}
	
	
	
	
	//Método que retorna ganho do Worker
	public Double income(Integer year, Integer month ) {
		for(HourContract ctr : this.contracts) {
			
		}
		
		return null;
	}
}
