package com.tibco.mg.schema.generation;

import javax.xml.bind.annotation.XmlRegistry;
import com.tibco.mg.schema.generation.CGEmployeeSet;


	@XmlRegistry
	public class ObjectFactory {

	    public CGEmployeeSet createCGEmployeeSet() {
	        return new CGEmployeeSet();
	    }

	    public CGEmployeeSet.ITStaff createCGEmployeeSetITStaff() {
	        return new CGEmployeeSet.ITStaff();
	    }

	    public CGEmployeeSet.NonITStaff createCGEmployeeSetNonITStaff() {
	        return new CGEmployeeSet.NonITStaff();
	    }

	    public CGEmployeeSet.ManagementStaff createCGEmployeeSetManagementStaff() {
	        return new CGEmployeeSet.ManagementStaff();
	    }

//	    public CGEmployeeSet.ContractorStaffs createCGEmployeeSetContractorStaffs() {
//	        return new CGEmployeeSet.ContractorStaffs();
//	    }

	}

