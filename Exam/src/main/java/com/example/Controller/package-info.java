package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.model.Mother;
import com.example.model.Child;
import com.example.dao.MotherChildDao;

@Controller
public class MotherChildController {

    @Autowired
    private MotherChildDao motherChildDao;

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/addMother")
    public String addMother() {
        return "addMother";
    }

    @RequestMapping(value = "/saveMother", method = RequestMethod.POST)
    public String saveMother(@ModelAttribute("mother") Mother mother) {
        motherChildDao.addMother(mother);
        return "redirect:/viewData";
    }

    @RequestMapping("/addChild")
    public String addChild(Model model) {
        model.addAttribute("mothers", motherChildDao.getAllMothers());
        return "addChild";
    }

    @RequestMapping(value = "/saveChild", method = RequestMethod.POST)
    public String saveChild(@ModelAttribute("child") Child child) {
        motherChildDao.addChild(child);
        return "redirect:/viewData";
    }

    @RequestMapping("/viewData")
    public String viewData(Model model) {
        model.addAttribute("mothers", motherChildDao.getAllMothers());
        model.addAttribute("children", motherChildDao.getAllChildren());
        return "viewData";
    }

    @RequestMapping("/editMother/{id}")
    public String editMother(@PathVariable int id, Model model) {
        Mother mother = motherChildDao.getAllMothers().stream().filter(m -> m.getId() == id).findFirst().orElse(null);
        model.addAttribute("mother", mother);
        return "editMother";
    }

    @RequestMapping("/editChild/{id}")
    public String editChild(@PathVariable int id, Model model) {
        Child child = motherChildDao.getAllChildren().stream().filter(c -> c.getId() == id).findFirst().orElse(null);
        model.addAttribute("child", child);
        model.addAttribute("mothers", motherChildDao.getAllMothers());
        return "editChild";
    }

    @RequestMapping(value = "/updateMother", method = RequestMethod.POST)
    public String updateMother(@ModelAttribute("mother") Mother mother) {
        motherChildDao.updateMother(mother);
        return "redirect:/viewData";
    }

    @RequestMapping(value = "/updateChild", method = RequestMethod.POST)
    public String updateChild(@ModelAttribute("child") Child child) {
        motherChildDao.updateChild(child);
        return "redirect:/viewData";
    }

    @RequestMapping("/deleteMother/{id}")
    public String deleteMother(@PathVariable int id) {
        motherChildDao.deleteMother(id);
        return "redirect:/viewData";
    }

    @RequestMapping("/deleteChild/{id}")
    public String deleteChild(@PathVariable int id) {
        motherChildDao.deleteChild(id);
        return "redirect:/viewData";
    }
}