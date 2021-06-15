package lottoAuto.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LottoResults {
    private List<LottoResult> lottoResults;

    public LottoResults() {
        this.lottoResults = new ArrayList<>();
    }

    public void add(LottoResult lottoResult) {
        lottoResults.add(lottoResult);
    }

    public void matchBonusBall(Lottos lottos, int bonus) {
        lottoResults.stream()
                .forEach(lottoResult -> lottoResult.add(lottos.getLottos(), bonus));
    }

    public Map<Rank, Long> lottoRankCounting() {
        return lottoResults.stream()
                .collect(Collectors.groupingBy(x -> Rank.findByRank(x), Collectors.counting()));
    }

}
