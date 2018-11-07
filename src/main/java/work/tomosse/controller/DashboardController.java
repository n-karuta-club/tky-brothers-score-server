package work.tomosse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.val;
import work.tomosse.repository.ScoreRepository;

@Controller
@RequestMapping("/")
public class DashboardController {
    @Autowired
    private ScoreRepository scoreRepository;

    /**
     * GET /
     *
     * @param mav
     * @return
     */
    @GetMapping
    public ModelAndView index(ModelAndView mav) {
        val scores = scoreRepository.findAll();
        mav.addObject("scores", scores);
        mav.setViewName("dashboard/index");
        return mav;
    }
}
