package subway.view;

import subway.util.Validator;

import java.util.Scanner;

public class InputView {

    private static final String WANTED_FUNCTION = "## 원하는 기능을 선택하세요.";
    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static String inputFunction() {
        System.out.println(WANTED_FUNCTION);
        String userInput = scanner.nextLine();

        Validator.validateEmptyInput(userInput);
        return userInput;
    }
}
