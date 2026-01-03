package subway.util;

import java.util.List;

import static subway.util.ErrorMessage.INPUT_ERROR;

public class Validator {

    private static final List<String> mainNumber = List.of("1", "2", "3", "4", "Q");
    private static final List<String> stationNumber = List.of("1", "2", "3", "B");
    private static final List<String> lineNumber = List.of("1", "2", "3", "B");
    private static final List<String> sectionNumber = List.of("1", "2", "B");
    private static final int MIN_NAME_LENGTH = 2;
    private static final int MAX_NUM = 10; // 수정

    private Validator() {
    }

    // 빈값 검증
    public static void validateEmptyInput(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException(INPUT_ERROR.getMessage());
        }
    }

    public static void validateMainInput(String input) {
        if (!mainNumber.contains(input)) {
            throw new IllegalArgumentException(INPUT_ERROR.getMessage());
        }
    }

    public static void validateStationInput(String input) {
        if (!stationNumber.contains(input)) {
            throw new IllegalArgumentException(INPUT_ERROR.getMessage());
        }
    }

    public static void validateLineInput(String input) {
        if (!lineNumber.contains(input)) {
            throw new IllegalArgumentException(INPUT_ERROR.getMessage());
        }
    }

    public static void validateSectionInput(String input) {
        if (!sectionNumber.contains(input)) {
            throw new IllegalArgumentException(INPUT_ERROR.getMessage());
        }
    }


    // 값 범위 검증
    public static void validateRange(int value) {
        if (value < MIN_NAME_LENGTH) {
            throw new IllegalArgumentException(INPUT_ERROR.getMessage());
        }
    }
}

