package me.lunatic.newcontextgenerator;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java -jar generator.jar <extension> <display-name>");
            System.out.println("Example: java -jar generator.jar json \"Json Document\"");
            return;
        }
        String ext = args[0];
        String name = args[1];
        String key = ext + "KeyNew";

        File file = new File("new-" + ext + ".reg");
        file.createNewFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writeLine(writer, "Windows Registry Editor Version 5.00");
            writeLine(writer, "");
            writeLine(writer, "[HKEY_CLASSES_ROOT\\." + ext + "]");
            writeLine(writer, "@=\"" + key + "\"");
            writeLine(writer, "");
            writeLine(writer, "[HKEY_CLASSES_ROOT\\." + ext + "\\ShellNew]");
            writeLine(writer, "\"NullFile\"=\"\"");
            writeLine(writer, "");
            writeLine(writer, "[HKEY_CLASSES_ROOT\\" + key + "]");
            writeLine(writer, "@=\"" + name + "\"");
        }
        System.out.println("Reg-File created! PLEASE REVIEW IT BEFORE EXECUTING!");
    }

    private static void writeLine(BufferedWriter writer, String line) throws IOException {
        writer.write(line);
        writer.newLine();
    }
}