package com.example.fuelcalculator.controller;

import com.example.fuelcalculator.model.FuelCalculatorForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("fuelCalculatorForm", new FuelCalculatorForm());
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute FuelCalculatorForm form, Model model) {
        double distance = form.getDistance();
        double fuelConsumption = form.getFuelConsumption();
        double fuelPrice = form.getFuelPrice();
        
        double cost = (distance / 100) * fuelConsumption * fuelPrice;
        
        model.addAttribute("cost", cost);
        model.addAttribute("fuelCalculatorForm", form);
        
        return "index";
    }
}
