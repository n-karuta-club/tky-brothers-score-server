package work.tomosse.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.val;
import work.tomosse.entity.Score;
import work.tomosse.service.ScoreService;

@RestController
@RequestMapping("/api/score/")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    /**
     * Score返却メソッド
     *
     * @param score
     * @return
     */
    @GetMapping
    public List<Score> index(@ModelAttribute Score score) {
        val scores = scoreService.findAll();
        return scores;
    }

    /**
     * Score登録メソッド
     *
     * @param score
     * @return
     */
    @PostMapping
    public Score create(@RequestBody @Validated Score score) {
        return scoreService.save(score);
    }
}