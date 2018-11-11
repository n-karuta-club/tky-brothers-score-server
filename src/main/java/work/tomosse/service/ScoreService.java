package work.tomosse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.tomosse.entity.Score;
import work.tomosse.repository.ScoreRepository;
import work.tomosse.util.ScoreUtil;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    @Autowired
    private ScoreUtil scoreUtil;

    public List<Score> findAll() {
        return scoreRepository.findAll();
    }

    public Score save(Score score, String token) {
        System.out.println(scoreUtil.isMatch(score, token));
        if (scoreUtil.isMatch(score, token)) {
            return scoreRepository.save(score);
        }
        return null;
    }
}
