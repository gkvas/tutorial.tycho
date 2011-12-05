package at.kvas.tutorial.tycho.codegen2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CodeGen2 {

	public static void main(String[] args) throws IOException {

		String dest = "/home/gernot/workspaces/tycho/at.kvas.tutorial.tycho.gendest2/gen/src/at/kvas/tutorial/tycho/gendest2/";

		new File(dest).mkdirs();

		System.out.println(CodeGen2.class);

		FileWriter fstream = new FileWriter(dest + "Ui.java");
		BufferedWriter out = new BufferedWriter(fstream);
		out.write("package at.kvas.tutorial.tycho.gendest2;");
		out.write("public class Ui {");
		out.write("public String test() { return \"Test\"; }");
		out.write("}");
		out.close();

	}

}
