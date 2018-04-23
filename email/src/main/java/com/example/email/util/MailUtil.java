package com.example.email.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailUtil {
    private static Logger logger= LoggerFactory.getLogger(MailUtil.class);
    @Autowired
    JavaMailSender mailSender;


    /**
     *
     * @param fromMail:发送者邮件地址
     * @param tomail：接收者邮件地址数组
     * @param carbonCopy：抄送者邮件地址数组
     * @param subject：邮件主题
     * @param content：邮件内容
     */
    public void sendSimpleMail(String fromMail,String[] tomail,String[] carbonCopy,String subject,String content){
        long startTime=System.currentTimeMillis();
        logger.info("开始发送邮件时间="+startTime);

        try {
            SimpleMailMessage smm=new SimpleMailMessage();
            smm.setFrom(fromMail);
            smm.setTo(tomail);
            smm.setCc(carbonCopy);
            smm.setSubject(subject);
            smm.setText(content);
            mailSender.send(smm);
            long overTime=System.currentTimeMillis();
            logger.info("结束发送邮件时间="+overTime);
        }catch (MailException e){
            logger.error("发送邮件异常="+e);
            e.printStackTrace();
        }

    }


}
