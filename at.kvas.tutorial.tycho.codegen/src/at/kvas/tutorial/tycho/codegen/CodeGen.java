package at.kvas.tutorial.tycho.codegen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CodeGen {

	public static void main(String[] args) throws IOException {

		String dest = args[0];

		new File(dest).mkdirs();

		System.out.println(CodeGen.class);

		FileWriter fstream = new FileWriter(dest + "Entity.java");
		BufferedWriter out = new BufferedWriter(fstream);
		out.write("package at.kvas.tutorial.tycho.gendest;");
		out.write("public class Entity {");
		out.write("public String test() { return \"Test\"; }");
		out.write("}");
		out.close();
	}

}
