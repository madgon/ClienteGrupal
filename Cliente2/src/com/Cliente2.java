package com;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.entities.Area;
import com.entities.Material;
import com.entities.Salon;
import com.entities.Salon.Tipo;
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
		
		//Creo el area LTI
		
		Area a1 = new Area();
		a1.setId((long) 1);
		a1.setNombre("Área LTI");
		
		//Creo los materiales de los salones del Area LTI
		
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
		m1.setId((long) 2);
		m1.setNombre("Impresora 3D");
		m1.setDescripcion("Impresora capaz de imprimir modelos de tres dimensiones");
		try {
			materialBean.crear(m1);
			System.out.println("Se creó exitosamente el material "+ m2.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m3 = new Material();
		m1.setId((long) 3);
		m1.setNombre("Televisor 4");
		m1.setDescripcion("Dispoitivo audiovisual");
		try {
			materialBean.crear(m1);
			System.out.println("Se creó exitosamente el material "+ m3.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m4 = new Material();
		m1.setId((long) 4);
		m1.setNombre("Pizzarra electrónica");
		m1.setDescripcion("Dispoitivo diseniado para facilitar el aprendizaje");
		try {
			materialBean.crear(m1);
			System.out.println("Se creó exitosamente el material "+ m4.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m5 = new Material();
		m1.setId((long) 5);
		m1.setNombre("Servidor BD");
		m1.setDescripcion("Servidor dedicado a BBDD");
		try {
			materialBean.crear(m1);
			System.out.println("Se creó exitosamente el material "+ m5.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
				
		Material m6 = new Material();
		m1.setId((long) 6);
		m1.setNombre("Servidor PRT");
		m1.setDescripcion("Servidor dedicado a PRT");
		try {
			materialBean.crear(m1);
			System.out.println("Se creó exitosamente el material "+ m6.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}		
		
		Material m7 = new Material();
		m1.setId((long) 7);
		m1.setNombre("Servidor APP");
		m1.setDescripcion("Servidor dedicado a APP");
		try {
			materialBean.crear(m1);
			System.out.println("Se creó exitosamente el material "+ m7.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		//Creo los salones del Area LTI
		
		//Lista de materiales para S1
		List<Material> materialess1 = new ArrayList<>();
		materialess1.add(m1);
		materialess1.add(m2);
		
		//Lista de materiales para S2
		List<Material> materialess2 = new ArrayList<>();
		materialess2.add(m3);
		materialess2.add(m4);
		
		//Lista de materiales para S3
		List<Material> materialess3 = new ArrayList<>();
		materialess3.add(m5);
		materialess3.add(m6);
		materialess3.add(m7);
		
		
		Salon s1 = new Salon();
		s1.setArea(a1);
		s1.setBandera(true);
		s1.setCapacidadMaxima(20);
		s1.setId((long) 1);
		s1.setMateriales(materialess1);
		s1.setNombre("Robotica");
		s1.setTipo(Tipo.LABORATORIO);
		try {
			salonesBean.crear(s1);
			System.out.println("Se creó exitosamente el salon "+ s1.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Salon s2 = new Salon();
		s1.setArea(a1);
		s1.setBandera(false);
		s1.setCapacidadMaxima(30);
		s1.setId((long) 2);
		s1.setMateriales(materialess2);
		s1.setNombre("Aula de clases 3");
		s1.setTipo(Tipo.COMUN);
		try {
			salonesBean.crear(s2);
			System.out.println("Se creó exitosamente el salon "+ s2.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Salon s3 = new Salon();
		s1.setArea(a1);
		s1.setBandera(false);
		s1.setCapacidadMaxima(30);
		s1.setId((long) 3);
		s1.setMateriales(materialess2);
		s1.setNombre("Sala de servidores");
		s1.setTipo(Tipo.EXAMEN);
		try {
			salonesBean.crear(s3);
			System.out.println("Se creó exitosamente el salon "+ s3.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
