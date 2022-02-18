package JUnit_UD21.UD21;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import JUnit.Junit09_Geometria.App;
import JUnit.Junit09_Geometria.dto.Geometria;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	Geometria g1 = new Geometria();
	private int id = 2;
	Geometria g2 = new Geometria(id);

	@Test
	public void testareacuadrado() {
		int resultado = g1.areacuadrado(1);
		int esperado = 1;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testareacuadrado2() {
		int resultado = g2.areacuadrado(1);
		int esperado = 1;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testareaCirculo() {
		double resultado = g1.areaCirculo(2);
		double esperado = 12.5664;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testareaCirculo2() {
		double resultado = g2.areaCirculo(2);
		double esperado = 12.5664;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testarearectangulo() {
		double resultado = g1.arearectangulo(2, 5);
		double esperado = 10;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testarearectangulo2() {
		double resultado = g2.arearectangulo(2, 5);
		double esperado = 10;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testareatriangulo() {
		double resultado = g1.areatriangulo(2, 5);
		double esperado = 5;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testareatriangulo2() {
		double resultado = g2.areatriangulo(2, 5);
		double esperado = 5;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testareapentagono() {
		double resultado = g1.areapentagono(2, 5);
		double esperado = 5;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testareapentagono2() {
		double resultado = g2.areapentagono(2, 5);
		double esperado = 5;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testarearombo() {
		double resultado = g1.arearombo(2, 5);
		double esperado = 5;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testarearombo2() {
		double resultado = g2.arearombo(2, 5);
		double esperado = 5;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testarearomboide() {
		int resultado = g1.arearomboide(2, 5);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testarearomboide2() {
		int resultado = g2.arearomboide(2, 5);
		int esperado = 10;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testareatrapecio() {
		int resultado = g1.areatrapecio(2, 2, 2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testareatrapecio2() {
		int resultado = g2.areatrapecio(2, 2, 2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testfigura1() {
		String resultado = g1.figura(1);
		String esperado = "cuadrado";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testfigura2() {
		String resultado = g1.figura(2);
		String esperado = "Circulo";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testfigura3() {
		String resultado = g1.figura(3);
		String esperado = "Triangulo";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testfigura4() {
		String resultado = g1.figura(4);
		String esperado = "Rectangulo";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testfigura5() {
		String resultado = g1.figura(5);
		String esperado = "Pentagono";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testfigura6() {
		String resultado = g1.figura(6);
		String esperado = "Rombo";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testfigura7() {
		String resultado = g1.figura(7);
		String esperado = "Romboide";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testfigura8() {
		String resultado = g1.figura(8);
		String esperado = "Trapecio";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testfigura9() {
		String resultado = g1.figura(9);
		String esperado = "Default";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testgetnom() {
		String resultado = g1.getNom();
		String esperado = "Default";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testgetnom2() {
		String resultado = g2.getNom();
		String esperado = g2.figura(g2.getId());
		assertEquals(esperado, resultado);
	}
	@Test
	public void testsetnom() {
		String esperado = "hola";
		g1.setNom(esperado);
		String resultado = g1.getNom();
		assertEquals(esperado, resultado);
	}
	@Test
	public void testsetnom2() {
		String esperado = "hola";
		g2.setNom(esperado);
		String resultado = g2.getNom();
		assertEquals(esperado, resultado);
	}
	@Test
	public void testsetid() {
		g1.setId(8);
		int resultado  = g1.getId();
		assertEquals(8, resultado);
	}
	@Test
	public void testgetid() {
		int resultado = g1.getId();
		int esperado = 9;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testgetid2() {
		int resultado = g2.getId();
		int esperado = id;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testsetid2() {
		g2.setId(8);
		int resultado  = g2.getId();
		assertEquals(8, resultado);
	}
	@Test
	public void testgetarea() {
		g1.setArea(9);
		double resultado = g1.getArea();
		double esperado = 9;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testgetarea2() {
		g2.setArea(9);
		double resultado = g2.getArea();
		double esperado = 9;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testsetarea() {
		g1.setArea(10);
		double resultado = g1.getArea();
		double esperado = 10;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testsetarea2() {
		g2.setArea(10);
		double resultado = g2.getArea();
		double esperado = 10;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testToString() {
		g1.setArea(12.5664);
		g1.setId(2);
		g1.setNom("Circulo");
		String resultado = g1.toString();
		String esperado = "Geometria [id=2, nom=Circulo, area=12.5664]";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testToString2() {
		g2.setArea(12.5664);
		g2.setId(2);
		g2.setNom("Circulo");
		String resultado = g2.toString();
		String esperado = "Geometria [id=2, nom=Circulo, area=12.5664]";
		assertEquals(esperado, resultado);
	}
	@Test
	public void testMain() {
		App.main(null);
	}
}
