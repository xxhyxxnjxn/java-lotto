package lottoAuto.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Lotto {
    private static final String CHECK_UNDER_LOTTO_COUNT_MESSAGE = "로또 번호의 개수는 6개보다 작으면 안됩니다.";
    private static final String CHECK_OVER_LOTTO_COUNT_MESSAGE = "로또 번호의 개수는 6개보다 크면 안됩니다.";
    private static final int LOTTO_NUMBERS_SIZE = 6;

    private Set<LottoNumber> lottoNumbers;

    public Lotto(Set<LottoNumber> lottoNumbers) {
        checkLottoNumbersCount(lottoNumbers.size());
        this.lottoNumbers = new HashSet<>(lottoNumbers);
    }

    public void checkLottoNumbersCount(int lottoNumbersSize) {
        if (lottoNumbersSize < LOTTO_NUMBERS_SIZE) {
            throw new IllegalArgumentException(CHECK_UNDER_LOTTO_COUNT_MESSAGE);
        }
        if (lottoNumbersSize > LOTTO_NUMBERS_SIZE) {
            throw new IllegalArgumentException(CHECK_OVER_LOTTO_COUNT_MESSAGE);
        }
    }

    public int getCorrectCount(Set<LottoNumber> winningLottoNumbers) {
        return (int) lottoNumbers.stream()
                .filter(winningLottoNumbers::contains)
                .count()
                ;
    }

    public Set<LottoNumber> getLottoNumbers() {
        return Collections.unmodifiableSet(lottoNumbers);
    }
}
