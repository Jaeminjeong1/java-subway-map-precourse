package subway;

import subway.controller.SubwayController;
import subway.service.SubwayService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        SubwayService subwayService = new SubwayService();
        SubwayController subwayController = new SubwayController(subwayService);
        subwayController.start();
    }
}
