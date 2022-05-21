package articulos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import articulos.Investigador.Categoria;

class InvestigadorTest {

	Biblioteca bi;
	Investigador i1,i2;
	Articulo a, b;
	ArrayList<String> fi, aut, kw;
	
	@BeforeEach
	void setUp() throws Exception {
		bi = new Biblioteca();
		fi = new ArrayList<String>();
		aut = new ArrayList<String>();
		kw = new ArrayList<String>();
		aut.add("Josesito");
		aut.add("Miguel Romero");
		fi.add("Universidad");
		kw.add("Polimorfismo");
		kw.add("SOLID");
		kw.add("Encapsulamiento");
		kw.add("Objetos");
		a = new Articulo("Poo2", aut, fi, "Programacion", "Argentina", kw);
		fi = new ArrayList<String>();
		aut = new ArrayList<String>();
		kw = new ArrayList<String>();
		aut.add("Fercho");
		fi.add("Laboratorio");
		kw.add("Funcional");
		kw.add("Recursion");
		b = new Articulo("Funcional", aut, fi, "Programacion", "Alemania", kw);
		i1 = new Investigador();
		i2 = new Investigador();
		i1.addSuscripcion(Categoria.AUTOR, "Miguel Romero").addSuscripcion(Categoria.LUGAR, "Argentina");
		i2.addSuscripcion(Categoria.AUTOR, "Josesito").addSuscripcion(Categoria.TITULO, "Funcional");
		bi.Attach(i1);
		bi.Attach(i2);
	}

	@Test
	void test() {
		bi.addArticle(a);
		bi.addArticle(b);
		assertEquals(i1.getCantidadDeInteres(), 1);
		assertEquals(i2.getCantidadDeInteres(), 2);
	}

}
