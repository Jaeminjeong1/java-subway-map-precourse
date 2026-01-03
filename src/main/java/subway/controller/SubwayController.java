package subway.controller;

import subway.service.SubwayService;
import subway.util.Validator;
import subway.view.InputView;
import subway.view.OutputView;

public class SubwayController {

    private final SubwayService subwayService;

    public SubwayController(SubwayService subwayService) {
        this.subwayService = subwayService;
    }

    public void start() {
        // 시작 멘트 받기
        // 메인화면에서 원하는 기능 받기
        while(true) {
            String mainInput = inputMainFunctionAndValidate();
            if (mainInput.equals("1")) {
                String stationInput = inputStationFunctionAndValidate();
                playStationFunction(stationInput);
                break;
            }
        }
            // 번호에 맞게 다음 로직 실행.

    }

    private void playStationFunction(String stationInput) {
        if (stationInput.equals("1")) {
            String inputtedStationAddName = InputView.inputStationAddName();
            subwayService.addStation(inputtedStationAddName);
            OutputView.printInfoAddStation();
            return;
        }
        if (stationInput.equals("2")) {
            String inputtedStationDeleteName = InputView.inputStationDeleteName();
            subwayService.deleteStation(inputtedStationDeleteName);
            OutputView.printInfoDeleteStation();
            return;
        }
        if (stationInput.equals("3")) {
            OutputView.printStationList(subwayService.getAllStation());
        }
    }

    private String inputMainFunctionAndValidate() {
        while (true) {
            try {
                OutputView.printMainScreen();
                String input = InputView.inputFunction();
                Validator.validateMainInput(input);

                return input;
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e);
            }
        }
    }

    private String inputStationFunctionAndValidate() {
        while (true) {
            try {
                OutputView.printStationScreen();
                String input = InputView.inputFunction();
                Validator.validateStationInput(input);

                return input;
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e);
            }
        }
    }

    private String inputLineFunctionAndValidate() {
        while (true) {
            try {
                OutputView.printLineScreen();
                String input = InputView.inputFunction();
                Validator.validateLineInput(input);

                return input;
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e);
            }
        }
    }

    private String inputSectionFunctionAndValidate() {
        while (true) {
            try {
                OutputView.printSectionScreen();
                String input = InputView.inputFunction();
                Validator.validateSectionInput(input);

                return input;
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e);
            }
        }
    }

}
