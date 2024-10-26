package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.validator.Validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {
    public static List<String> inputCarList() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();

        Validator.validateCarNames(input);

        List<String> carList = splitCarName(input);

        return carList;
    }

    private static List<String> splitCarName(String input) {
        return new ArrayList<>(Arrays.asList(input.split(",")));
    }
}
