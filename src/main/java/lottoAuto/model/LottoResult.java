package lottoAuto.model;

public class LottoResult {
    private int countMatchWinningNumbers;
    private boolean hasBonusBall;

    public LottoResult(int countMatchWinningNumbers, boolean hasBonusBall) {
        this.countMatchWinningNumbers = countMatchWinningNumbers;
        this.hasBonusBall = hasBonusBall;
    }

    public Rank findByRank(){
        return Rank.findByRank(countMatchWinningNumbers,hasBonusBall);
    }
}
