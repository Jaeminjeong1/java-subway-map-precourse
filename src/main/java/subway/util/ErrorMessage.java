package subway.util;

public enum ErrorMessage {

    INPUT_ERROR("선택할 수 없는 기능입니다."),
    DUPLICATE_STATION_NAME_ERROR("이미 등록된 역 이름입니다.");

    private final static String PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = PREFIX + message;
    }

    public String getMessage() {
        return message;
    }
}
