package com.tibco.mg.schema.generation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "itStaff", "nonITStaff", "managementStaff" })

@XmlRootElement(name = "CG_Employee_Set")
public class CGEmployeeSet {

	@XmlElement(name = "IT_Staff", required = false)
	protected CGEmployeeSet.ITStaff itStaff;
	@XmlElement(name = "NonIT_Staff", required = false)
	protected CGEmployeeSet.NonITStaff nonITStaff;
	@XmlElement(name = "Management_Staff", required = false)
	protected CGEmployeeSet.ManagementStaff managementStaff;
//	@XmlElement(name = "Contractor_Staffs", required = false)
//	protected CGEmployeeSet.ContractorStaffs contractorStaffs;

	/********************************* IT STAFFS *********************************/
	// getters and setters for IT
	public CGEmployeeSet.ITStaff getITStaff() {
		return itStaff;
	}

	public void setITStaff(CGEmployeeSet.ITStaff value) {
		this.itStaff = value;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "itEmpID", "itEmpName", "itEmpAge" })
	public static class ITStaff {

		@XmlElement(name = "IT_EmpID", required = true)
		protected String itEmpID;
		@XmlElement(name = "IT_EmpName", required = true)
		protected String itEmpName;
		@XmlElement(name = "IT_EmpAge", required = true)
		protected int itEmpAge;

		public String getITEmpID() {
			return itEmpID;
		}

		public void setITEmpID(String value) {
			this.itEmpID = value;
		}

		public String getITEmpName() {
			return itEmpName;
		}

		public void setITEmpName(String value) {
			this.itEmpName = value;
		}

		public int getITEmpAge() {
			return itEmpAge;
		}

		public void setITEmpAge(int value) {
			this.itEmpAge = value;
		}

		@Override
		public String toString() {
			return "ITStaff [itEmpID=" + itEmpID + ", itEmpName=" + itEmpName + ", itEmpAge=" + itEmpAge + "]";
		}

	}

	/*********************************
	 * NON-IT STAFFS
	 *********************************/
	// getters and setters for Non-IT
	public CGEmployeeSet.NonITStaff getNonITStaff() {
		return nonITStaff;
	}

	public void setNonITStaff(CGEmployeeSet.NonITStaff value) {
		this.nonITStaff = value;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "nonITEmpID", "nonITEmpName", "nonITEmpAge" })
	public static class NonITStaff {

		@XmlElement(name = "NonIT_EmpID", required = true)
		protected String nonITEmpID;
		@XmlElement(name = "NonIT_EmpName", required = true)
		protected String nonITEmpName;
		@XmlElement(name = "NonIT_EmpAge", required = true)
		protected int nonITEmpAge;

		public String getNonITEmpID() {
			return nonITEmpID;
		}

		public void setNonITEmpID(String value) {
			this.nonITEmpID = value;
		}

		public String getNonITEmpName() {
			return nonITEmpName;
		}

		public void setNonITEmpName(String value) {
			this.nonITEmpName = value;
		}

		public int getNonITEmpAge() {
			return nonITEmpAge;
		}

		public void setNonITEmpAge(int value) {
			this.nonITEmpAge = value;
		}

		@Override
		public String toString() {
			return "NonITStaff [nonITEmpID=" + nonITEmpID + ", nonITEmpName=" + nonITEmpName + ", nonITEmpAge="
					+ nonITEmpAge + "]";
		}

	}

	/*********************************
	 * MANAGEMENT STAFFS
	 *********************************/
	// getters and setters for Management
	public CGEmployeeSet.ManagementStaff getManagementStaff() {
		return managementStaff;
	}

	public void setManagementStaff(CGEmployeeSet.ManagementStaff value) {
		this.managementStaff = value;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "managementEmpID", "managementEmpName", "managementEmpAge" })
	public static class ManagementStaff {

		@XmlElement(name = "Management_EmpID", required = true)
		protected String managementEmpID;
		@XmlElement(name = "Management_EmpName", required = true)
		protected String managementEmpName;
		@XmlElement(name = "Management_EmpAge", required = true)
		protected int managementEmpAge;

		public String getManagementEmpID() {
			return managementEmpID;
		}

		public void setManagementEmpID(String value) {
			this.managementEmpID = value;
		}

		public String getManagementEmpName() {
			return managementEmpName;
		}

		public void setManagementEmpName(String value) {
			this.managementEmpName = value;
		}

		public int getManagementEmpAge() {
			return managementEmpAge;
		}

		public void setManagementEmpAge(int value) {
			this.managementEmpAge = value;
		}

		@Override
		public String toString() {
			return "ManagementStaff [managementEmpID=" + managementEmpID + ", managementEmpName=" + managementEmpName
					+ ", managementEmpAge=" + managementEmpAge + "]";
		}

	}

//	/*********************************
//	 * CONTRACTOR STAFFS
//	 *********************************/
//	// getters and setters for ContractorStaffs
//	public CGEmployeeSet.ContractorStaffs getContractorStaffs() {
//		return contractorStaffs;
//	}
//
//	public void setContractorStaffs(CGEmployeeSet.ContractorStaffs value) {
//		this.contractorStaffs = value;
//	}
//
//	@XmlAccessorType(XmlAccessType.FIELD)
//	@XmlType(name = "", propOrder = { "contractorEmpID", "contractorEmpName", "contractorEmpAge" })
//
//	public static class ContractorStaffs {
//
//		@XmlElement(name = "Contractor_EmpID", required = true)
//		protected String contractorEmpID;
//		@XmlElement(name = "Contractor_EmpName", required = true)
//		protected String contractorEmpName;
//		@XmlElement(name = "Contractor_EmpAge", required = true)
//		protected int contractorEmpAge;
//
//		public String getContractorEmpID() {
//			return contractorEmpID;
//		}
//
//		public void setContractorEmpID(String value) {
//			this.contractorEmpID = value;
//		}
//
//		public String getContractorEmpName() {
//			return contractorEmpName;
//		}
//
//		public void setContractorEmpName(String value) {
//			this.contractorEmpName = value;
//		}
//
//		public int getContractorEmpAge() {
//			return contractorEmpAge;
//		}
//
//		public void setContractorEmpAge(int value) {
//			this.contractorEmpAge = value;
//		}
//
//		@Override
//		public String toString() {
//			return "ContractorStaffs [contractorEmpID=" + contractorEmpID + ", contractorEmpName=" + contractorEmpName
//					+ ", contractorEmpAge=" + contractorEmpAge + "]";
//		}
//
//	}

}
