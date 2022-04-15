package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipoDeTrabajoTest {

	EquipoDeTrabajo e, f;
	Persona p1,p2,p3,p4,p5,p6,p7,p8;
	
	@BeforeEach
	public void setUp() {
		p1 = new Persona("Pepe", 1998, 5, 20); //23
		p2 = new Persona("Juan", 2002, 8, 2);  //19
		p3 = new Persona("Luana", 1968, 3, 22);//54
		p4 = new Persona("Gero", 1972, 4, 10); //50
		p5 = new Persona("Gus", 1988, 5, 28);  //33 //35.8
		p6 = new Persona("Ana", 1990, 3, 2);   //32
		p7 = new Persona("Miguel", 1991, 1, 4);//31
		p8 = new Persona("Jose", 1998, 12, 5); //23 //28.6667
		
		e = new EquipoDeTrabajo("Desarrollo");
		f = new EquipoDeTrabajo("Testing");
		e.agregarAlEquipo(p1);
		e.agregarAlEquipo(p2);
		e.agregarAlEquipo(p3);
		e.agregarAlEquipo(p4);
		e.agregarAlEquipo(p5);
		f.agregarAlEquipo(p6);
		f.agregarAlEquipo(p7);
		f.agregarAlEquipo(p8);
	}
	
	@Test
	public void testEquipo() {
		assertEquals(e.getNombre(), "Desarrollo");
		assertEquals(f.getNombre(), "Testing");
		assertEquals(e.edadPromedio(), 35);
		assertEquals(f.edadPromedio(), 28);
	}

}
