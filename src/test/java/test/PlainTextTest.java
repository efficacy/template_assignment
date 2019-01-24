package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;

import org.junit.jupiter.api.Test;

import uk.ac.uos.i2p.assignment.TemplateProcessor;

class PlainTextTest {
	TemplateProcessor tp;
	
	@Test
	void testDummyProcessor() {
		tp = new DummyTemplateProcessor();
		tp.loadTemplate("greet", "hello");
		assertEquals("hello", tp.expandTemplate("greet", Collections.emptyMap()));
	}

}
