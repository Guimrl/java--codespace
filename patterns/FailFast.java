import java.util.Arrays;
import java.util.List;

public class FailFast {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, null, 5);
        try {
            new FailFast().processList(numbers);
            System.out.println("Todos os números foram processados com sucesso.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void processList(List<Integer> numbers) {

        for (Integer number : numbers) {
            if (number == null) {
                throw new IllegalArgumentException("A lista não pode conter números nulos.");
            }

            System.out.println("Processando número: " + number);
        }
    }

}
