package exceptions.task3;

import static exceptions.task1.FileReader.readFileAsString;


public class MainAverageOfNumbers {
    private static final String fileName = "src/main/resources/numbers.txt";
    public static void main(String[] args) {

        try {
            String line = readFileAsString(fileName);
            if (line.isEmpty())
                throw new EmptyFileException(fileName);
            System.out.println(line);
            double average = average(getNumbersFromString(line));
            System.out.println(average);
        } catch (InvalidFileExeption | EmptyFileException | InvalidInputExeption e) {
            throw new RuntimeException(e);
        }

    }

    private static int[] getNumbersFromString(String line) throws InvalidInputExeption {
        String[] characters = line.split(" ");
        int[] numbers = new int[characters.length];
        for (int i = 0; i < characters.length; i++) {
            try {
                numbers[i] = Integer.parseInt(characters[i]);
            } catch (NumberFormatException e){
                throw new InvalidInputExeption(fileName);
            }
        }
        return numbers;
    }


    private static double average(int[] numbers) {
        double sum = 0;
        int k = 0;
        for (int number : numbers) {
            sum += number;
            k++;
        }
        return sum / k;
    }
}
