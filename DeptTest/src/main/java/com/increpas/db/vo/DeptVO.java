package com.increpas.db.vo;

import lombok.Data;

@Data  // @Getter, @Setter, @ToString, @EqualsAndHashCode
public class DeptVO {
    private int deptno;
    private String dname;
    private String loc;
}