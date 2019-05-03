package com.tibco.schemas._5xcode_after.mig.schema;


public class CG_getXsdData {
	public static void main(String[] args) {
		CGEmployeeSet cgEmployeeSet = new CGEmployeeSet();
		CGEmployeeSet.ITStaff itStaffs = new CGEmployeeSet.ITStaff();
		CGEmployeeSet.NonITStaff nonItStaffs = new CGEmployeeSet.NonITStaff();
		CGEmployeeSet.ContractorStaffs contractorStaffs = new CGEmployeeSet.ContractorStaffs();
		CGEmployeeSet.ManagementStaff managementStaffs = new CGEmployeeSet.ManagementStaff();
		
		System.out.println(itStaffs.toString());
		System.out.println(nonItStaffs.toString());
		System.out.println(contractorStaffs.toString());
		System.out.println(managementStaffs.toString());
		/* System.out.println(cgEmployeeSet.setContractorStaff)); */
	}
	

}
