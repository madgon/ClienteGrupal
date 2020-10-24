package com;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.services.AreaBeanRemote;
import com.services.MaterialBeanRemote;
import com.services.SalonesBeanRemote;



public class Cliente2 {

	public static void main(String[] args) throws NamingException {
		
		AreaBeanRemote areasBean = (AreaBeanRemote) InitialContext.doLookup("Universidad/AreaBean!com.services.AreaBeanRemote");
		MaterialBeanRemote materialBean = (MaterialBeanRemote) InitialContext.doLookup("Universidad/MaterialBean!com.services.MaterialBeanRemote");
		SalonesBeanRemote salonesBean = (SalonesBeanRemote) InitialContext.doLookup("Universidad/SalonesBean!com.services.SalonesBeanRemote");
		

	}

}
