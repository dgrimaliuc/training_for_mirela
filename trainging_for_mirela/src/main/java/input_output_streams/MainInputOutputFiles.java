package input_output_streams;

import java.io.*;

public class MainInputOutputFiles {
    static String inputFileName;
    static String outputFileName;
    static File inputFile;
    static File outputFile;
    static String information;

    public static void main(String[] args) {

        try {
            inputFileName = readFileName();
            outputFileName = readFileName();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        inputFile = createInputFile(inputFileName);
        outputFile = createOutputFile(outputFileName);

        System.out.println();
        writeInformationIntoTheFile(inputFile);
        readContentsBufferedReader(inputFile);
        writeReversedContentInOutputFile(outputFile);

    }

    public static String readFileName() throws IOException {
        System.out.println("Write the name of the file: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    //I have 2 different methods because I have 2 different exceptions for input/output files
    public static File createInputFile(String fileName) {
        File createdFile = null;

        try {
            createdFile = new File(fileName);
            if (createdFile.createNewFile()) {
                System.out.println("Input file created: " + createdFile.getName());
            } else if (!createdFile.exists()) {
                throw new InvalidFileExeption(createdFile);
            }
        } catch (InvalidFileExeption | IOException e) {
            throw new RuntimeException(e);
        }

        return createdFile;
    }

    public static File createOutputFile(String fileName) {
        File createdFile = null;

        try {
            createdFile = new File(fileName);
            if (createdFile.createNewFile()) {
                System.out.println("Output file created: " + createdFile.getName());
            } else {
                throw new FileCreationExeption(createdFile);//In this case file can't be created just if it exists already
            }
        } catch (FileCreationExeption | IOException e) {
            throw new RuntimeException(e);
        }

        return createdFile;
    }

    public static void writeInformationIntoTheFile(File fileName) {
        String data = "Hello World!";

        try {
            OutputStream file = new FileOutputStream(fileName);
            byte[] dataBytes = data.getBytes();
            file.write(dataBytes);
            System.out.println("Input file " + fileName + " contents: " + data);
            file.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void readContentsBufferedReader(File fileName) {
        int i;
        String line;
        StringBuilder stringBuilder = new StringBuilder();

        try (FileInputStream file = new FileInputStream(fileName);
             BufferedReader input = new BufferedReader(new InputStreamReader(file));) {

            while ((line = input.readLine()) != null) {
                stringBuilder.append(line + System.lineSeparator());
            }
            information = stringBuilder.toString();

            input.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeReversedContentInOutputFile(File fileName) {
        String fileContents;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(information).reverse();
        fileContents = String.valueOf(stringBuilder);

        try {
            OutputStream file = new FileOutputStream(fileName);
            byte[] contentsBytes = fileContents.getBytes();
            file.write(contentsBytes);
            System.out.print("Output file " + fileName + " contents: " + fileContents);
            file.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}



