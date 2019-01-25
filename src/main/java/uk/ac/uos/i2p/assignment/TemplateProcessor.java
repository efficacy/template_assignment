package uk.ac.uos.i2p.assignment;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

public interface TemplateProcessor {
	void loadTemplate(String name, String template);
	void loadTemplates(Map<String, String> templates);
	void expandTemplate(Reader input, Writer output, Map<String, Object> context) throws IOException;
}
