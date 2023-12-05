package com.study.spring_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
    @GetMapping(value = "api")
    @ResponseBody
    // @ResponseBody를 사용하면 viewResolver를 사용하지 않는다.
    // html을 리턴하는 것이 아닌 응답에 대한 responsebody를 그대로 리턴하기 때믄
    public ReturnBody apiPage(@RequestParam("page") String api) {
        ReturnBody returnBody = new ReturnBody();
        returnBody.setStr(api);
        return returnBody;  // @ResponseBody 를 사용하고 객체를 리턴하면 객체가 JSON으로 변환됨
        // return "This is " + api; //url에서 parameter를 전달 /api?page=<요청값>에 따라 값이 달라짐
    }

    static class ReturnBody {
        private String str;

        public String getStr() {
            return str;
        }
        
        public void setStr(String input) {
            this.str = input;
        }
    }
}
