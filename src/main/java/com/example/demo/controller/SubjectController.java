package com.example.demo.controller;

import com.example.demo.model.Scholarship;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("subj")
public class SubjectController {

    @GetMapping("/getPageSub")
    private String getCalculate(Model model) {
        model.addAttribute("sub", new Scholarship());
        return "scholarshipCalculation";
    }

    @PostMapping("/calculateValue")
    public String saveAndReturnValue(@ModelAttribute("sub") Scholarship scholarship, Model model) {
        double aa =0.0;
        double avgValue = 0.0;
        avgValue = (scholarship.getEconomic() + scholarship.getMathematics() + scholarship.getPhysical() + scholarship.getProgramming() + scholarship.getSiSharp()) / 5;

        if (avgValue > 0 && avgValue < 4) {
            aa = 0.0;
        } else if (avgValue >= 4 && avgValue < 6) {
            aa = 50.0;
        } else if (avgValue >= 6 && avgValue < 8) {
            aa = 80.0;
        } else if (avgValue >= 8 && avgValue < 9) {
            aa = 100.0;
        } else if (avgValue == 10 ) {
            aa = 130;
        }
        model.addAttribute("result", "Стипендия:  "+ aa + " рублей");
        return "scholarshipCalculation";
    }
}