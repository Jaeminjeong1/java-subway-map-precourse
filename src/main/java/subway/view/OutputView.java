package subway.view;

import subway.domain.Station;

import java.util.List;

public class OutputView {

    private static final String MAIN_SCREEN = "## 메인 화면\n" +
            "1. 역 관리\n" +
            "2. 노선 관리\n" +
            "3. 구간 관리\n" +
            "4. 지하철 노선도 출력\n" +
            "Q. 종료\n";
    private static final String STATION_SCREEN = "## 역 관리 화면\n" +
            "1. 역 등록\n" +
            "2. 역 삭제\n" +
            "3. 역 조회\n" +
            "B. 돌아가기\n";
    private static final String LINE_SCREEN = "## 노선 관리 화면\n" +
            "1. 노선 등록\n" +
            "2. 노선 삭제\n" +
            "3. 노선 조회\n" +
            "B. 돌아가기\n";
    private static final String SECTION_SCREEN = "## 구간 관리 화면\n" +
            "1. 구간 등록\n" +
            "2. 구간 삭제\n" +
            "B. 돌아가기\n";
    private static final String INFO_PREFIX = "[INFO] ";
    private static final String DELETE_STATION = "지하철 역이 삭제되었습니다.";
    private static final String ADD_STATION = "지하철 역이 등록되었습니다.";
    private static final String LIST_STATION = "\n## 역 목록";

    private OutputView() {
    }

    public static void printMainScreen() {
        System.out.println(MAIN_SCREEN);
    }

    public static void printStationScreen() {
        System.out.println(STATION_SCREEN);
    }

    public static void printLineScreen() {
        System.out.println(LINE_SCREEN);
    }

    public static void printSectionScreen() {
        System.out.println(SECTION_SCREEN);
    }

    public static void printInfoAddStation() {
        System.out.println(INFO_PREFIX + ADD_STATION);
    }

    public static void printInfoDeleteStation() {
        System.out.println(INFO_PREFIX + DELETE_STATION);
    }

    public static void printStationList(List<Station> stations) {
        System.out.println(LIST_STATION);
        for (Station station : stations) {
            System.out.println(INFO_PREFIX + station.getName());
        }
        System.out.println("\n");
    }

    // 에러메세지 출력
    public static void printErrorMessage(IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

}
