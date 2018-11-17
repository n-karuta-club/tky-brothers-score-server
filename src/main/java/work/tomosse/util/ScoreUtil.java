package work.tomosse.util;

import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import work.tomosse.config.ScoreConfig;
import work.tomosse.entity.Score;

@Component
public class ScoreUtil {

    /**
     * md5化するメソッド
     *
     * @param JSON
     * @return
     */
    private String hashMd5(String score) {
        String hash = DigestUtils.md5DigestAsHex(score.getBytes());
        for (int i = 1; i < ScoreConfig.md5; i++) {
            hash = DigestUtils.md5DigestAsHex(score.getBytes());
        }
        return hash;
    }

    /**
     * tokenが正しいかどうか判定するメソッド
     *
     * @param score
     * @param token
     * @return
     */
    public boolean isMatch(Score score, String token) {
        return token.equals(hashMd5(String.valueOf(score.getPoint())));
    }
}
