package com.study.spring_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TemplateController {

    @GetMapping(value = "template") // url에서 /다음에 들어갈 경로의 이름을 지정
    public String templatePage(@RequestParam("page") String page, Model model) {
        // @RequestParam("page")으로 url을 통한 파라미터 요청
        model.addAttribute("page", page);
        // path.html에서 attributeName을 찾아 model을 통해 값을 전달하여 attributeValue로 변경
        return "template";
        // resources/templates에 있는 html파일의 이름을 리턴하면 Thymeleaf의 viewResolver가 알아서 해당 파일을
        // 찾아 리턴
    }

}
