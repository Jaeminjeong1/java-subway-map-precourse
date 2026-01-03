package subway.util;

public enum ErrorMessage {

    INPUT_ERROR("선택할 수 없는 기능입니다."),
    DUPLICATE_STATION_NAME_ERROR("이미 등록된 역 이름입니다."),
    NOT_CONTAINS_STATION_NAME_ERROR("삭제하려는 역은 존재하지 않습니다."),
    NOT_EXIST_LINE_ERROR("존재하지 않은 노선입니다."),
    DUPLICATE_LINE_ERROR("중복된 노선입니다."),
    NUMBER_FORMAT_ERROR("숫자형식이 아닙니다. 다시 입력해 주세요.");

    private final static String PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = PREFIX + message;
    }

    public String getMessage() {
        return message;
    }
}
