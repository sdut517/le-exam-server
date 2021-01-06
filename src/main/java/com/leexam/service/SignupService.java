package com.leexam.service;

import java.util.Date;

public interface SignupService {
    String inster(String sname, Date start_time, Date end_time, String banner, String sdesc, Integer is_verify, Integer oid, String url, String collect_info);
}
