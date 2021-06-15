package lottoAuto.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String INPUT_PRICE_MESSGAE = "구입금액을 입력해 주세요.";
    private static final String INPUT_WINNING_NUMBER_MESSAGE = "지난 주 당첨 번호를 입력해 주세요.";
    private static final String INPUT_BONUS_BALL_MESSAGE = "보너스 볼을 입력해 주세요.";

    public static int inputPrice() {
        System.out.println(INPUT_PRICE_MESSGAE);

        return SCANNER.nextInt();
    }

    public static String inputWinningNumber() {
        System.out.println(INPUT_WINNING_NUMBER_MESSAGE);

        return SCANNER.next();
    }

    public static int inputBonusBall() {
        System.out.println(INPUT_BONUS_BALL_MESSAGE);

        return SCANNER.nextInt();
    }
}
