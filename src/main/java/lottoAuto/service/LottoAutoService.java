package lottoAuto.service;

import lottoAuto.vo.LottoResultVo;

import java.util.*;

public class LottoAutoService {

    private List<Integer> winning_count;
    private List<Boolean> bonus_count;

    public int statistic(List<Lotto> lottos, List<Integer> winningNum) {
        int count = 0;
        for (int i = 0; i < lottos.size(); i++) {
            count = getCount(lottos.get(i).getNumbers(), winningNum, i);
        }
        return count;
    }

    private int getCount(List<Integer> lottos, List<Integer> winningNum, int i) {
        int count = 0;
        for (int j = 0; j < winningNum.size(); j++) {
            if (lottos.contains(winningNum.get(j))) {
                count++;
            }
        }
        return count;
    }

    public List<Boolean> statisticBonus(List<List> result, int bonus) {
        bonus_count = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            Boolean count = getBonusCount(result, bonus, i);
            bonus_count.add(count);
        }
        return bonus_count;
    }

    private Boolean getBonusCount(List<List> result, int bonus, int i) {
        Boolean count = false;
        if (winning_count.get(i) == 5 && result.get(i).contains(bonus)) {
            count = true;
        }
        return count;
    }

    public List<LottoResultVo> setWinningStatistic(List<Integer> winning_count, List<Boolean> bonus_count) {
        List<LottoResultVo> lottoResultVoList = new ArrayList<>();

        for (int i = 0; i < winning_count.size(); i++) {
            lottoResultVoList.add(new LottoResultVo(Rank.findByRank(winning_count.get(i), bonus_count.get(i)), 1));
        }
        return lottoResultVoList;
    }
}
