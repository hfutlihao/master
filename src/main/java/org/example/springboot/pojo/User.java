package org.example.springboot.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    String name;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Timestamp updateTime;
}
