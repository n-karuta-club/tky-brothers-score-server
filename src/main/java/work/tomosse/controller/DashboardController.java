package work.tomosse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.val;
import work.tomosse.service.ScoreService;

@Controller
@RequestMapping("/")
public class DashboardController {
    @Autowired
    private ScoreService scoreService;

    /**
     * GET /
     *
     * @param mav
     * @return
     */
    @GetMapping
    public ModelAndView index(ModelAndView mav) {
        val scores = scoreService.findAll();
        mav.addObject("scores", scores);
        mav.setViewName("dashboard/index");
        return mav;
    }
}
