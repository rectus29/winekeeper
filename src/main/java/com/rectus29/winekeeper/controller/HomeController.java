package com.rectus29.winekeeper.controller;

import com.rectus29.winekeeper.model.Bottle;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @RequestMapping(value = "/*", method = RequestMethod.GET)
    public List<Bottle> homePage(Model model){
        List<Bottle> bottles = new ArrayList<>();
        bottles.add(new Bottle());
         return bottles;
    }
}
