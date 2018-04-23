package com.example.email.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailUtilTest {
    @Autowired
    private MailUtil mailUtil;
    @Test
    public void sendSimpleMail() throws Exception {
        String deliver = "tianyuan881214@sina.com";
        String[] receiver = {"497043213@qq.com"};
        String[] carbonCopy = {"283194691@qq.com"};
        String subject = "This is a simple email";
        String content = "This is a simple content";
        mailUtil.sendSimpleMail(deliver,receiver,carbonCopy,subject,content);
    }

}