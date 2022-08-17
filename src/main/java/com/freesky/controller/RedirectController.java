package com.freesky.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * verify the redirect function
 *
 * @author Max
 * @since 2022/8/17
 */
@Controller
public class RedirectController {

    @GetMapping("/redirect/{id}")
    public void goToBaidu(@PathVariable(value="id") String id, HttpServletResponse rep) {
        System.err.println(id);
        String baidu = "https://www.baidu.com/";

        try {
            rep.sendRedirect(baidu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
