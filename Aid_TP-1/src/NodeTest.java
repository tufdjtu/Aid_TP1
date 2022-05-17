import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class NodeTest {
	
	Node node = new Node("123405678");
	Node parent = new Node("123450678");
	Node b = new Node("123456708");
	
	NodeTest(){
	node.setParent(parent);
	parent.setParent(b);
	}
	
	@Test
	void testgetParent() {
		assertEquals(parent.getPuzzle(),node.getParent().getPuzzle());
		assertNotNull(parent.getParent());
	}
	@Test
	void testgetPecabranca() {
		
		assertEquals(4, node.getPecabranca());
	}
	
	@Test
	void testgetPuzzle() {
		assertEquals("123405678",node.getPuzzle());
	}

	@Test
	void testTroca() {
		
		assertEquals("023415678",node.Troca(0));
	}

	@Test
	void testOrdenarPuzzle() {
		
		assertEquals(4 , node.ordenarPuzzle().size());
	}

}
