package com.gw.website.flux.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URLDecoder;

@RestController
public class LoggerController {
    private static final Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @RequestMapping("/log")
    public void log(HttpServletRequest req) throws IOException {

        String qs = URLDecoder.decode(req.getQueryString(), "utf-8");

        String kvs[] = qs.split("\\&");
        StringBuilder sb = new StringBuilder();

        //拼接客户端ip sb.append(req.getRemoteAddr());
        for (String kv : kvs) {
            String[] arr = kv.split("=");
            String v = arr.length >= 2 ? arr[1] : "";
            sb.append(v + "|");
        }
        String line = sb.toString();

        //System.out.println(line);
        logger.info(line);
    }
}