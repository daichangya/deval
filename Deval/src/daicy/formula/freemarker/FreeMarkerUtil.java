package daicy.formula.freemarker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreeMarkerUtil {

	private Configuration cfg;

	public void init() throws Exception {
		// ��ʼ��FreeMarker����
		// ����һ��Configurationʵ��
		cfg = new Configuration();
		// ����FreeMarker��ģ���ļ�λ��
		cfg.setDirectoryForTemplateLoading(new File(
				"src/daicy/formula/function"));
	}

	public void process(FreeMarkerUtil hf) throws Exception {

		Map root = new HashMap();
		String savePath = "src/daicy/formula/function/";

		Template template = cfg.getTemplate("Max.ftl");

		String[] functionNames = new String[] { "Min" };

		for (int i = 0; i < functionNames.length; i++) {
			String class_name = functionNames[i];
			String function_name = functionNames[i].toLowerCase();

			root.put("class_name", class_name);
			root.put("function_name", function_name);
			String fileName = class_name + ".java";

			hf.buildTemplate(root, savePath, fileName, template);
		}

	}

	public void buildTemplate(Map root, String savePath, String fileName,
			Template template) {
		String realFileName = savePath + fileName;

		String realSavePath = savePath;

		File newsDir = new File(realSavePath);
		if (!newsDir.exists()) {
			newsDir.mkdirs();
		}

		try {
			// SYSTEM_ENCODING = "UTF-8";
			Writer out = new OutputStreamWriter(new FileOutputStream(
					realFileName));

			template.process(root, out);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws Exception {
		FreeMarkerUtil hf = new FreeMarkerUtil();
		hf.init();
		hf.process(hf);
	}

}
