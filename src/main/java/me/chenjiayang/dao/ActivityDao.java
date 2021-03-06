package me.chenjiayang.dao;

import me.chenjiayang.entity.Activity;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;

/**
 * create by chenjiayang on 2018/3/22
 */

@Component
public interface ActivityDao {
    void insert(Activity activity);
    List<Activity> getActivityByPage(int page, int capacity);
    List<Activity> getAll();
}
