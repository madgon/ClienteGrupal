package com;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.entities.Material;
import com.exception.ServiciosException;
import com.services.AreaBeanRemote;
import com.services.MaterialBean;
import com.services.MaterialBeanRemote;
import com.services.SalonesBeanRemote;



public class Cliente2 {

	public static void main(String[] args) throws NamingException {
		
		AreaBeanRemote areasBean = (AreaBeanRemote) InitialContext.doLookup("Universidad/AreaBean!com.services.AreaBeanRemote");
		MaterialBeanRemote materialBean = (MaterialBeanRemote) InitialContext.doLookup("Universidad/MaterialBean!com.services.MaterialBeanRemote");
		SalonesBeanRemote salonesBean = (SalonesBeanRemote) InitialContext.doLookup("Universidad/SalonesBean!com.services.SalonesBeanRemote");
		
		//Creo los materiales
		
		Material m1 = new Material();
		m1.setId((long) 1);
		m1.setNombre("Placa Arduino");
		m1.setDescripcion("Placa con microcontrolador programable");
		try {
			materialBean.crear(m1);
			System.out.println("Se creó exitosamente el material "+ m1.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m2 = new Material();
		m1.setId((long) 1);
		m1.setNombre("Impresora 3D");
		m1.setDescripcion("Impresora capaz de imprimir modelos de tres dimensiones");
		try {
			materialBean.crear(m1);
			System.out.println("Se creó exitosamente el material "+ m2.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m3 = new Material();
		m1.setId((long) 1);
		m1.setNombre("Televisor 4");
		m1.setDescripcion("Dispoitivo audiovisual");
		try {
			materialBean.crear(m1);
			System.out.println("Se creó exitosamente el material "+ m3.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m4 = new Material();
		m1.setId((long) 1);
		m1.setNombre("Pizzarra electrónica");
		m1.setDescripcion("Dispoitivo diseniado para facilitar el aprendizaje");
		try {
			materialBean.crear(m1);
			System.out.println("Se creó exitosamente el material "+ m4.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m5 = new Material();
		m1.setId((long) 1);
		m1.setNombre("Servidor BD");
		m1.setDescripcion("Servidor dedicado a BBDD");
		try {
			materialBean.crear(m1);
			System.out.println("Se creó exitosamente el material "+ m5.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
				
		Material m6 = new Material();
		m1.setId((long) 1);
		m1.setNombre("Servidor PRT");
		m1.setDescripcion("Servidor dedicado a PRT");
		try {
			materialBean.crear(m1);
			System.out.println("Se creó exitosamente el material "+ m6.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}		
		
		Material m7 = new Material();
		m1.setId((long) 1);
		m1.setNombre("Servidor APP");
		m1.setDescripcion("Servidor dedicado a APP");
		try {
			materialBean.crear(m1);
			System.out.println("Se creó exitosamente el material "+ m7.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}

	}

}
