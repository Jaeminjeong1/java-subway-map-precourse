package subway.view;

import subway.util.Validator;

import java.util.Scanner;

public class InputView {

    private static final String WANTED_FUNCTION = "## 원하는 기능을 선택하세요.";
    private static final String STATION_ADD_INPUT = "## 등록할 역 이름을 입력하세요.";
    private static final String STATION_DELETE_INPUT = "## 삭제할 역 이름을 입력하세요.";
    private static final String LINE_ADD_INPUT = "## 등록할 노선 이름을 입력하세요.";
    private static final String LINE_ADD_UP_STATION_INPUT = "## 등록할 노선의 상행 종점역 이름을 입력하세요.";
    private static final String LINE_ADD_DOWN_STATION_INPUT = "## 등록할 노선의 하행 종점역 이름을 입력하세요.";
    private static final String LINE_DELETE_INPUT = "## 삭제할 노선 이름을 입력하세요.";
    //Section
    private static final String ADD_LINE_SECTION = "## 노선을 입력하세요.";
    private static final String ADD_STATION_SECTION = "## 역이름을 입력하세요.";
    private static final String ADD_SEQUENCE_SECTION = "## 순서를 입력하세요.";
    private static final String DELETE_LINE_SECTION = "## 삭제할 구간의 노선을 입력하세요.";
    private static final String DELETE_STATION_SECTION = "## 삭제할 구간의 역을 입력하세요.";


    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static String inputFunction() {
        System.out.println(WANTED_FUNCTION);
        String userInput = scanner.nextLine();

        Validator.validateEmptyInput(userInput);
        return userInput;
    }

    public static String inputStationAddName() {
        System.out.println("\n" + STATION_ADD_INPUT);
        String userInput = scanner.nextLine();

        Validator.validateEmptyInput(userInput);
        Validator.validateRange(userInput.length());

        return userInput;
    }

    public static String inputStationDeleteName() {
        System.out.println("\n" + STATION_DELETE_INPUT);
        String userInput = scanner.nextLine();

        Validator.validateEmptyInput(userInput);
        Validator.validateRange(userInput.length());

        return userInput;
    }

    // Line

    public static String inputLineAddName() {
        System.out.println("\n" + LINE_ADD_INPUT);
        String userInput = scanner.nextLine();

        Validator.validateEmptyInput(userInput);
        Validator.validateRange(userInput.length());

        return userInput;
    }

    public static String inputLineAddUpName() {
        System.out.println("\n" + LINE_ADD_UP_STATION_INPUT);
        String userInput = scanner.nextLine();

        Validator.validateEmptyInput(userInput);
        Validator.validateRange(userInput.length());

        return userInput;
    }

    public static String inputLineAddDownName() {
        System.out.println("\n" + LINE_ADD_DOWN_STATION_INPUT);
        String userInput = scanner.nextLine();

        Validator.validateEmptyInput(userInput);
        Validator.validateRange(userInput.length());

        return userInput;
    }

    public static String inputLineDeleteName() {
        System.out.println("\n" + LINE_DELETE_INPUT);
        String userInput = scanner.nextLine();

        Validator.validateEmptyInput(userInput);
        Validator.validateRange(userInput.length());

        return userInput;
    }

    //Section

    public static String inputSectionLine() {
        System.out.println("\n" + ADD_LINE_SECTION);
        String userInput = scanner.nextLine();

        Validator.validateEmptyInput(userInput);
        Validator.validateRange(userInput.length());

        return userInput;
    }

    public static String inputSectionStation() {
        System.out.println("\n" + ADD_STATION_SECTION);
        String userInput = scanner.nextLine();

        Validator.validateEmptyInput(userInput);
        Validator.validateRange(userInput.length());

        return userInput;
    }

    public static int inputSectionSequence() {
        System.out.println("\n" + ADD_SEQUENCE_SECTION);
        String userInput = scanner.nextLine();

        Validator.validateEmptyInput(userInput);
        Validator.validateNumberFormat(userInput);

        int input = Integer.parseInt(userInput);
        Validator.validatePositive(input);

        return input;
    }

    public static String inputDeleteSectionLine() {
        System.out.println("\n" + DELETE_LINE_SECTION);
        String userInput = scanner.nextLine();

        Validator.validateEmptyInput(userInput);
        Validator.validateRange(userInput.length());

        return userInput;
    }

    public static String inputDeleteSectionStation() {
        System.out.println("\n" + DELETE_STATION_SECTION);
        String userInput = scanner.nextLine();

        Validator.validateEmptyInput(userInput);
        Validator.validateRange(userInput.length());

        return userInput;
    }


}
