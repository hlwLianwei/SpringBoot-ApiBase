package com.lenway.api.controller;

import com.lenway.api.enums.ResultCode;
import com.lenway.api.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("error")
public class ErrorController {
    @GetMapping("/error")
    @ResponseBody
    public ResultVO handleError(){
        return new ResultVO(ResultCode.UNEXIST_URL, null);
    }
}
