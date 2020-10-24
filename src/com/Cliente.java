package com;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.entities.Area;
import com.entities.Material;
import com.entities.Salon;
import com.exception.ServiciosException;
import com.services.AreaBeanRemote;
import com.services.MaterialBeanRemote;
import com.services.SalonesBeanRemote;

public class Cliente {

	public static void main(String[] args) throws NamingException {
		String salonesContext = "ejb:/Universidad/SalonesBean!com.services.SalonesBeanRemote";
		String materialesContext = "ejb:/Universidad/MaterialBean!com.services.MaterialBeanRemote";
		String areasContext = "ejb:/Universidad/AreaBean!com.services.AreaBeanRemote";
		
		SalonesBeanRemote salonesBean = (SalonesBeanRemote)InitialContext.doLookup(salonesContext);
		MaterialBeanRemote materialesBean = (MaterialBeanRemote)InitialContext.doLookup(materialesContext);
		AreaBeanRemote areasBean = (AreaBeanRemote)InitialContext.doLookup(areasContext);

		// CREO LAS AREAS
		
		Area areaLTI = new Area();
		Area areaBiomedicas = new Area();
		Area areaIAgro = new Area();
		
		// Creo el Area IAgro
		areaLTI.setNombre("LTI");
		try {
			areasBean.crear(areaLTI);
			System.out.println("Se cre� exitosamente el area");
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Area IAgro
		areaBiomedicas.setNombre("Biomedicas");
		try {
			areasBean.crear(areaBiomedicas);
			System.out.println("Se cre� exitosamente el area");
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Area IAgro
		areaIAgro.setNombre("IAgro");
		try {
			areasBean.crear(areaIAgro);
			System.out.println("Se cre� exitosamente el area");
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// CREO LOS MATERIALES de Area LTI
		
		Material placaArduino = new Material();
		Material impresora3D = new Material();
		Material televisor4 = new Material();
		Material pizarraElectronica = new Material();
		Material servidorBD = new Material();
		Material servidorPRT = new Material();
		Material servidorAPP = new Material();
		
		
		// Creo el Material placa Arduino
		placaArduino.setNombre("Placa Arduino");
		placaArduino.setDescripcion("Placa con microcontrolador programable");
		try {
			materialesBean.crear(placaArduino);
			System.out.println("Se cre� exitosamente el material "+ placaArduino.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material impresora 3D
		impresora3D.setNombre("Impresora 3D");
		impresora3D.setDescripcion("Impresora capaz de imprimir modelos de tres dimensiones");
		try {
			materialesBean.crear(impresora3D);
			System.out.println("Se cre� exitosamente el material "+ impresora3D.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material televisor 4
		televisor4.setNombre("Televisor 4");
		televisor4.setDescripcion("Dispoitivo audiovisual");
		try {
			materialesBean.crear(televisor4);
			System.out.println("Se cre� exitosamente el material "+ televisor4.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material pizarra electronica
		pizarraElectronica.setNombre("Pizzarra electr�nica");
		pizarraElectronica.setDescripcion("Dispoitivo diseniado para facilitar el aprendizaje");
		try {
			materialesBean.crear(pizarraElectronica);
			System.out.println("Se cre� exitosamente el material "+ pizarraElectronica.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material servidor BD
		servidorBD.setNombre("Servidor BD");
		servidorBD.setDescripcion("Servidor dedicado a BBDD");
		try {
			materialesBean.crear(servidorBD);
			System.out.println("Se cre� exitosamente el material "+ servidorBD.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material servidor PRT
		servidorPRT.setNombre("Servidor PRT");
		servidorPRT.setDescripcion("Servidor dedicado a PRT");
		try {
			materialesBean.crear(servidorPRT);
			System.out.println("Se cre� exitosamente el material "+ servidorPRT.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}		
		
		// Creo el Material servidor APP
		servidorAPP.setNombre("Servidor APP");
		servidorAPP.setDescripcion("Servidor dedicado a APP");
		try {
			materialesBean.crear(servidorAPP);
			System.out.println("Se cre� exitosamente el material "+ servidorAPP.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// CREO LOS MATERIALES de Area Biomedicas
		
		Material microscopio = new Material();
		Material tijeras = new Material();
		Material televisor21 = new Material();
		Material canion = new Material();
		Material panelMovil = new Material();
		Material mesaOpeaciones = new Material();
		
		// Creo el Material microscopio
		// TODO
		
		// Creo el Material tijeras
		// TODO
		
		// Creo el Material televisor 21
		// TODO
		
		// Creo el Material canion
		// TODO
		
		// Creo el Material panel movil
		// TODO
		
		// Creo el Material mesa operaciones
		// TODO
		
		// CREO LOS MATERIALES de Area IAgro
		
		Material maqueta1 = new Material();
		Material maqueta2 = new Material();
		Material televisor48 = new Material();
		Material mesaTrabajo = new Material();
		Material tractor = new Material();
		Material molino = new Material();
		
		// Creo el Material maqueta 1
		// TODO
		
		// Creo el Material maqueta 2
		// TODO
		
		// Creo el Material televisor 48
		// TODO
		
		// Creo el Material mesa de trabajo
		// TODO
		
		// Creo el Material tractor
		// TODO
		
		// Creo el Material molino
		// TODO
		
		// CREO LOS SALONES de Area LTI
		
		Salon robotica = new Salon();
		Salon aulaClases3 = new Salon();
		Salon salaServidores = new Salon();
		
		
		
//		Salon robotica = new Salon();
//		Salon robotica = new Salon();
//		Salon robotica = new Salon();
//		Salon robotica = new Salon();
		
		
	}

}
