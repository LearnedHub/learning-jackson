package cn.zhucongqi.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ：Jobsz
 * @project ：learing-spt
 * @date ：Created in 2019/12/19 18:09
 * @description：
 * @modified By：
 * @version:
 */
@ToString
public class User {

    @Setter @Getter
    private Integer id;

    @Setter @Getter
    private String name;
}
