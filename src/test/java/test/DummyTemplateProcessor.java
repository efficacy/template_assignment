package test;

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
	public String expandTemplate(String templateName, Map<String, Object> context) {
		return "hello";
	}

}
