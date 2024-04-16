package exercise2;


import java.io.*;

public class FileCopyBinary {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopyBinary <source file> <target file>");
            return;
        }

        String sourceFile = args[0];
        String targetFile = args[1];

        File file = new File(sourceFile);
        if (!file.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        file = new File(targetFile);
        if (file.exists()) {
            System.out.println("Target file already exists.");
            return;
        }

        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(targetFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytesCopied = 0;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                totalBytesCopied += bytesRead;
            }

            System.out.println("File copied successfully.");
            System.out.println("Number of bytes copied: " + totalBytesCopied);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

