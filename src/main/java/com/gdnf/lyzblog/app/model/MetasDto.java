package com.gdnf.lyzblog.app.model;

import com.gdnf.lyzblog.app.entity.Metas;

/**
 * Created by babyant on 17/4/13.
 */
public class MetasDto extends Metas {
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
