package test;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

import uk.ac.uos.i2p.assignment.TemplateProcessor;

public class DummyTemplateProcessor implements TemplateProcessor {

	@Override
	public void loadTemplate(String name, String template) {
	}

	@Override
	public void loadTemplates(Map<String, String> templates) {
	}

	@Override
	public void expandTemplate(Reader input, Writer output, Map<String, Object> context) throws IOException {
		output.write("hello");
	}

}
