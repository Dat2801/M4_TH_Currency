package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/convert")
public class ConvertController {
    @GetMapping("")
    public ModelAndView currency() {
        ModelAndView modelAndView = new ModelAndView("list");
        return modelAndView;
    }

    @PostMapping("")
    public ModelAndView convert(@RequestParam() int money, int rate) {
        ModelAndView modelAndView = new ModelAndView("list");
        int result = money * rate;
        modelAndView.addObject("result",result);
        return modelAndView;
    }
}
