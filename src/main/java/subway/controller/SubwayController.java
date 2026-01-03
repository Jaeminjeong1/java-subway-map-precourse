package subway.controller;

import subway.service.SubwayService;
import subway.util.Validator;
import subway.view.InputView;
import subway.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class SubwayController {

    private final SubwayService subwayService;

    public SubwayController(SubwayService subwayService) {
        this.subwayService = subwayService;
    }

    public void start() {
        init();
        // 시작 멘트 받기
        // 메인화면에서 원하는 기능 받기
        while(true) {
            String mainInput = inputMainFunctionAndValidate();
            if (mainInput.equals("1")) {
                String stationInput = inputStationFunctionAndValidate();
                playStationFunction(stationInput);
                continue;
            }
            if (mainInput.equals("2")) {
                String lineInput = inputLineFunctionAndValidate();
                playLineFunction(lineInput);
                continue;
            }
            if (mainInput.equals("3")) {
                String sectionInput = inputSectionFunctionAndValidate();
                playSectionFunction(sectionInput);
            }
            if (mainInput.equals("4")) {
//                subwayService.getAllSection();
            }
            if (mainInput.equals("Q")) {
                break;
            }
        }

    }

    //init
    private void init() {
        subwayService.init();
    }

    //Station
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

    //Line
    private void playLineFunction(String lineInput) {
        if (lineInput.equals("1")) {
            String addLine = inputAddLine();
            List<String> stations = inputAddUpAndDownLine();
            subwayService.addLine(addLine, stations);
            OutputView.printInfoAddLine();
            return;
        }
        if (lineInput.equals("2")) {
            String deleteLine = inputDeleteLine();
            subwayService.deleteLine(deleteLine);
            OutputView.printInfoDeleteLine();
            return;
        }
        if (lineInput.equals("3")) {
            OutputView.printLineList(subwayService.getAllLine());
        }
    }

    //Section
    private void playSectionFunction(String sectionInput) {
        if (sectionInput.equals("1")) {
            String addLine = InputView.inputSectionLine();
            String addStation = InputView.inputSectionStation();
            int addSequence = InputView.inputSectionSequence();
            subwayService.addSection(addLine, addStation, addSequence);
            OutputView.printInfoAddSection();
            return;
        }
        if (sectionInput.equals("2")) {
            String deleteLine = InputView.inputDeleteSectionLine();
            String deleteStation = InputView.inputDeleteSectionStation();
            subwayService.deleteSection(deleteLine, deleteStation);
            OutputView.printInfoDeleteSection();
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

    // Line

    private String inputAddLine() {
        while (true) {
            try {
                String input = InputView.inputLineAddName();
                subwayService.validateContainsLine(input);
                return input;
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e);
            }
        }
    }

    private List<String> inputAddUpAndDownLine() {
        while (true) {
            try {
                String upStation = InputView.inputLineAddUpName();
                subwayService.validateContainsStation(upStation);
                String downStation = InputView.inputLineAddDownName();
                subwayService.validateContainsStation(downStation);

                List<String> stations = new ArrayList<>();
                stations.add(upStation);
                stations.add(downStation);
                return stations;
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e);
            }
        }
    }

    private String inputDeleteLine() {
        while (true) {
            try {
                String input = InputView.inputLineDeleteName();
                subwayService.validateContainsLine(input);
                return input;
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e);
            }
        }
    }

}
