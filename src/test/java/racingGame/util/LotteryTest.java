package racingGame.util;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LotteryTest {

    @Test
    public void 랜덤번호_범위체크(){
        assertThat(Lottery.getLotteryNumber()).isLessThan(11);
        assertThat(Lottery.getLotteryNumber()).isGreaterThanOrEqualTo(0);
    }
}