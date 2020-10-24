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
		
		AreaBeanRemote areasBean = (AreaBeanRemote) InitialContext.doLookup("UNIVERSIDAD2/AreaBean!com.services.AreaBeanRemote");
		MaterialBeanRemote materialBean = (MaterialBeanRemote) InitialContext.doLookup("UNIVERSIDAD2/MaterialBean!com.services.MaterialBeanRemote");
		SalonesBeanRemote salonesBean = (SalonesBeanRemote) InitialContext.doLookup("UNIVERSIDAD2/SalonesBean!com.services.SalonesBeanRemote");
		
		//Creo el area LTI
		
		Area a1 = new Area();
		a1.setId((long) 1);
		a1.setNombre("�rea LTI");
		
		//Creo los materiales de los salones del Area LTI
		
		Material m1 = new Material();
		m1.setId((long) 1);
		m1.setNombre("Placa Arduino");
		m1.setDescripcion("Placa con microcontrolador programable");
		try {
			materialBean.crear(m1);
			System.out.println("Se cre� exitosamente el material "+ m1.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m2 = new Material();
		m1.setId((long) 2);
		m1.setNombre("Impresora 3D");
		m1.setDescripcion("Impresora capaz de imprimir modelos de tres dimensiones");
		try {
			materialBean.crear(m1);
			System.out.println("Se cre� exitosamente el material "+ m2.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m3 = new Material();
		m1.setId((long) 3);
		m1.setNombre("Televisor 4");
		m1.setDescripcion("Dispoitivo audiovisual");
		try {
			materialBean.crear(m1);
			System.out.println("Se cre� exitosamente el material "+ m3.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m4 = new Material();
		m1.setId((long) 4);
		m1.setNombre("Pizzarra electr�nica");
		m1.setDescripcion("Dispoitivo diseniado para facilitar el aprendizaje");
		try {
			materialBean.crear(m1);
			System.out.println("Se cre� exitosamente el material "+ m4.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m5 = new Material();
		m1.setId((long) 5);
		m1.setNombre("Servidor BD");
		m1.setDescripcion("Servidor dedicado a BBDD");
		try {
			materialBean.crear(m1);
			System.out.println("Se cre� exitosamente el material "+ m5.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
				
		Material m6 = new Material();
		m1.setId((long) 6);
		m1.setNombre("Servidor PRT");
		m1.setDescripcion("Servidor dedicado a PRT");
		try {
			materialBean.crear(m1);
			System.out.println("Se cre� exitosamente el material "+ m6.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}		
		
		Material m7 = new Material();
		m1.setId((long) 7);
		m1.setNombre("Servidor APP");
		m1.setDescripcion("Servidor dedicado a APP");
		try {
			materialBean.crear(m1);
			System.out.println("Se cre� exitosamente el material "+ m7.getNombre());
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
			System.out.println("Se cre� exitosamente el salon "+ s1.getNombre()+" "+"su numero identificador es "+s1.getId());
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
			System.out.println("Se cre� exitosamente el salon "+ s2.getNombre()+" "+"su numero identificador es "+s2.getId());
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
			System.out.println("Se cre� exitosamente el salon "+ s3.getNombre()+" "+"su numero identificador es "+s3.getId());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo Area Biomedicas
		
		Area a2 = new Area();
		a1.setId((long) 2);
		a1.setNombre("�rea Biomedicas");
		
		//Creo los materiales para Area Biomedicas
		
		Material m8 = new Material();
		m8.setId((long) 8);
		m8.setNombre("Microscopio");
		m8.setDescripcion("Instrumento óptico para ampliar la imagen de objetos o seres");
		
		try {
			materialBean.crear(m8);
			System.out.println("Se creo exitosamente el material "+m8.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m9 = new Material();
		m9.setId((long) 9);
		m9.setNombre("Tijera");
		m9.setDescripcion("Instrumento para corte con presicion de objetos como papel, tela, entre otros");
		
		try {
			materialBean.crear(m9);
			System.out.println("Se creo exitosamente el material " +m9.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m10 = new Material();
		m10.setId((long) 10);
		m10.setNombre("Televisor 21' ");
		m10.setDescripcion("Electrodomestico para reproduccion de videos o contenidos multimedia "+m10.getNombre());
		
		try {
			materialBean.crear(m10);
			System.out.println("Se creo exitosamente el material "+m10.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m11 = new Material();
		m11.setId((long) 11);
		m11.setNombre("Canion");
		m11.setDescripcion("Aparato que recibe una señal de vídeo y proyecta la imagen correspondiente en una pantalla de proyección");
		
		try {
			materialBean.crear(m11);
			System.out.println("Se creo exitosamente el material "+m11.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Material m12 = new Material();
		m12.setId((long) 12);
		m12.setNombre("Panel movil");
		m12.setDescripcion("El panel móvil crea espacios en el mismo espacio");
		
		try {
			materialBean.crear(m12);
			System.out.println("Se creo exitosamente el material "+m12.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		} 
		
		Material m13 = new Material();
		m13.setId((long) 13);
		m13.setNombre("Mesa operaciones");
		m13.setDescripcion("Estructura metálica articulable en la cual se coloca al paciente que se somete a una intervención quirúrgica");
		
		try {
			materialBean.crear(m13);
			System.out.println("Se creo exitosamente el material "+m13.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo Salones de Area Biomedicas
		
		//Lista de materiales para S4
		
		List<Material> materialess4 = new ArrayList<>();
		materialess4.add(m8);
		materialess4.add(m9);
				
		//Lista de materiales para S5
		List<Material> materialess5 = new ArrayList<>();
		materialess5.add(m10);
		materialess5.add(m11);
				
		//Lista de materiales para S6
		List<Material> materialess6 = new ArrayList<>();
		materialess6.add(m12);
		materialess6.add(m13);
				
		
		Salon s4 = new Salon();
		s4.setArea(a2);
		s4.setBandera(false);
		s4.setCapacidadMaxima(30);
		s4.setId((long) 4);
		s4.setMateriales(materialess4);
		s4.setNombre("Laboratorio 1");
		s4.setTipo(Tipo.LABORATORIO);
		
		try {
			salonesBean.crear(s4);
			System.out.println("Se creo el nuevo salon " +s4.getNombre()+" "+"su numero identificador es "+s4.getId());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Salon s5 = new Salon();
		s5.setArea(a2);
		s5.setBandera(false);
		s5.setCapacidadMaxima(30);
		s5.setId((long) 4);
		s5.setMateriales(materialess5);
		s5.setNombre("Aula de clases 2");
		s5.setTipo(Tipo.COMUN);
		
		try {
			salonesBean.crear(s5);
			System.out.println("Se creo el nuevo salon " +s5.getNombre()+" "+"su numero identificador es "+s5.getId());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		Salon s6 = new Salon();
		s6.setArea(a2);
		s6.setBandera(false);
		s6.setCapacidadMaxima(30);
		s6.setId((long) 4);
		s6.setMateriales(materialess4);
		s6.setNombre("Deposito de materiales");
		s6.setTipo(Tipo.COMUN);
		
		try {
			salonesBean.crear(s6);
			System.out.println("Se creo el nuevo salon " +s6.getNombre()+" "+"su numero identificador es "+s6.getId());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}


	}
	
	

}
