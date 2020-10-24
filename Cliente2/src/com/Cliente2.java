package com;

import javax.naming.InitialContext;
import javax.naming.NamingException;



public class Cliente2 {

	public static void main(String[] args) throws NamingException {
		
		AreasBeanRemote areasBean = (AreasBeanRemote) InitialContext.doLookup("Universidad/AreasBean!com.services.AreasBeanRemote");
		MaterialBeanRemote materialBean = (MaterialBeanRemote) InitialContext.doLookup("Universidad/MaterialBean!com.services.MaterialBeanRemote");
		SalonesBeanRemote salonesBean = (SalonesBeanRemote) InitialContext.doLookup("Universidad/SalonesBean!com.services.SalonesBeanRemote");
		

	}

}
