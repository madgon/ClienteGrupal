package com;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.entities.Area;
import com.entities.Material;
import com.entities.Salon;
import com.exception.ServiciosException;
import com.services.AreaBean;
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
			System.out.println("Se crea exitosamente el area");
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Area IAgro
		areaBiomedicas.setNombre("Biomedicas");
		try {
			areasBean.crear(areaBiomedicas);
			System.out.println("Se crea exitosamente el area");
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Area IAgro
		areaIAgro.setNombre("IAgro");
		try {
			areasBean.crear(areaIAgro);
			System.out.println("Se crea exitosamente el area");
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
		Material mesaOperaciones = new Material();
		
		// Creo el Material microscopio
		microscopio.setNombre("Microscopio");
		microscopio.setDescripcion("Instrumento óptico para ampliar la imagen de objetos o seres");
		
		try {
			materialesBean.crear(microscopio);
			System.out.println("Se creo exitosamente el material "+microscopio.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material tijeras
		tijeras.setNombre("Tijera");
		tijeras.setDescripcion("Instrumento para corte con presicion de objetos como papel, tela, entre otros");
		
		try {
			materialesBean.crear(tijeras);
			System.out.println("Se creo exitosamente el material " +tijeras.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material televisor 21
		televisor21.setNombre("Televisor 21' ");
		televisor21.setDescripcion("Electrodomestico para reproduccion de videos o contenidos multimedia "+televisor21.getNombre());
		
		try {
			materialesBean.crear(televisor21);
			System.out.println("Se creo exitosamente el material "+televisor21.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material canion
		canion.setNombre("Canion");
		canion.setDescripcion("Aparato que recibe una señal de vídeo y proyecta la imagen correspondiente en una pantalla de proyección");
		
		try {
			materialesBean.crear(canion);
			System.out.println("Se creo exitosamente el material "+canion.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material panel movil
		panelMovil.setNombre("Panel movil");
		panelMovil.setDescripcion("El panel móvil crea espacios en el mismo espacio");
		
		try {
			materialesBean.crear(panelMovil);
			System.out.println("Se creo exitosamente el material "+panelMovil.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		} 
		
		// Creo el Material mesa operaciones
		mesaOperaciones.setNombre("Mesa operaciones");
		mesaOperaciones.setDescripcion("Estructura metálica articulable en la cual se coloca al paciente que se somete a una intervención quirúrgica");
		
		try {
			materialesBean.crear(mesaOperaciones);
			System.out.println("Se creo exitosamente el material "+mesaOperaciones.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// CREO LOS MATERIALES de Area IAgro
		
		Material maqueta1 = new Material();
		Material maqueta2 = new Material();
		Material televisor48 = new Material();
		Material mesaTrabajo = new Material();
		Material tractor = new Material();
		Material molino = new Material();
		
		// Creo el Material maqueta 1
		maqueta1.setNombre("Maqueta 1");
		maqueta1.setDescripcion("Composición de una página o de una publicación en la que se distribuyen los distintos elementos");
		
		try {
			materialesBean.crear(maqueta1);
			System.out.println("Se creo exitosamente el material "+maqueta1.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material maqueta 2
		maqueta2.setNombre("Maqueta 2");
		maqueta1.setDescripcion("Composición de una página o de una publicación en la que se distribuyen los distintos elementos");
		
		try {
			materialesBean.crear(maqueta2);
			System.out.println("Se creo exitosamente el material "+maqueta2.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material televisor 48
		televisor48.setNombre("Televisor de 48' ");
		televisor48.setDescripcion("Electrodomestico para reproduccion de videos o contenidos multimedia");
		
		try {
			materialesBean.crear(televisor48);
			System.out.println("Se creo exitosamente el material "+televisor48.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material mesa de trabajo
		mesaTrabajo.setNombre("Televisor de 48' ");
		mesaTrabajo.setDescripcion("Objeto plano en donde se colocan documentos, etc");
		
		try {
			materialesBean.crear(mesaTrabajo);
			System.out.println("Se creo exitosamente el material "+mesaTrabajo.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material tractor
		tractor.setNombre("Tractor");
		tractor.setDescripcion("Maquinaria vial");
		
		try {
			materialesBean.crear(tractor);
			System.out.println("Se creo exitosamente el material "+tractor.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Creo el Material molino
		molino.setNombre("Molino");
		molino.setDescripcion("Objeto de trituracion de materiales");
		
		try {
			materialesBean.crear(molino);
			System.out.println("Se creo exitosamente el material "+molino.getNombre());
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// CREO LOS SALONES de Area LTI
		
		Salon robotica = new Salon();
		Salon aulaClases3 = new Salon();
		Salon salaServidores = new Salon();
		
		// Creo el salon robotica
		salonesBean.crear("Robotica", areasBean.leerTodosFiltro("LTI").get(0).getId());//
		
		// Creo el salon aulaClases3
		salonesBean.crear("Aula Clases 3", areasBean.leerTodosFiltro("LTI").get(0).getId());
		
		
		// Creo el salon salaServidores
		salonesBean.crear("Sala Servidores", areasBean.leerTodosFiltro("LTI").get(0).getId());
		
		// CREO LOS SALONES de Area Biomedicas
		
		Salon laboratorio1 = new Salon();
		Salon aulaClases2 = new Salon();
		Salon depositoMateriales = new Salon();
		
		// Creo el salon laboratorio1
		salonesBean.crear("Laboratorio 1", areasBean.leerTodosFiltro("Biomedicas").get(0).getId());
		
		// Creo el salon aulaClases2
		salonesBean.crear("Aula Clases 2", areasBean.leerTodosFiltro("Biomedicas").get(0).getId());
		
		// Creo el salon depositoMateriales
		salonesBean.crear("Deposito Materiales", areasBean.leerTodosFiltro("Biomedicas").get(0).getId());
		

		// CREO LOS SALONES de Area IAgro
		
		Salon laboratorio2 = new Salon();
		Salon aulaClases1 = new Salon();
		Salon galponMateriales = new Salon();
		
		// Creo el salon laboratorio2
		salonesBean.crear("Laboratorio 2", areasBean.leerTodosFiltro("IAgro").get(0).getId());
		
		
		// Creo el salon aulaClases1
		salonesBean.crear("Aula Clases", areasBean.leerTodosFiltro("IAgro").get(0).getId());
		
		// Creo el salon galponMateriales
		salonesBean.crear("Galpon Materiales", areasBean.leerTodosFiltro("IAgro").get(0).getId());
		
		
		// ASIGNO LOS MATERIALES A CADA SALON
		
		// Asigno los materiales a Robotica
		try {
			salonesBean.asignarMaterial(
					salonesBean.obtenerUno("Robotica").get(0).getId(),
					materialesBean.obtenerTodos("Placa Arduino").get(0).getId()
					);
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			salonesBean.asignarMaterial(
					salonesBean.obtenerUno("Robotica").get(0).getId(),
					materialesBean.obtenerTodos("Impresora 3D").get(0).getId()
					);
		} catch (ServiciosException e) {
			System.out.println(e.getMessage());
		}
		
		// Asigno los materiales a Aula de clases 3
		
		// Asigno los materiales a Sala de Servidores
		
		// Asigno los materiales a Laboratorio 1
		
		// Asigno los materiales a Aula de clases 2
		
		// Asigno los materiales a Deposito de materiales
		
		// Asigno los materiales a Laboratorio 2
		
		// Asigno los materiales a Aula de clases de 1
		
		// Asigno los materiales a Galpon de materiales
		
		
	}

}
