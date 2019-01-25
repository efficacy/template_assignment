package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import uk.ac.uos.i2p.assignment.TemplateProcessor;

class PlainTextTest {
	TemplateProcessor tp;
	
	@Test
	void testDummyProcessor() throws IOException {
		tp = new DummyTemplateProcessor();
		StringWriter out = new StringWriter();
		tp.expandTemplate(new StringReader("hello"), out, Collections.emptyMap());
		assertEquals("hello", out.toString());
	}

}
