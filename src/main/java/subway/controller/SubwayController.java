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
        String mainNumber =  inputMainFunctionAndValidate();
        // 메인화면에서 원하는 기능 받기
            // 번호에 맞게 다음 로직 실행.

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

}
