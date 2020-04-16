package com.xuecheng.framework.domain.media;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class MediaFileProcess_m3u8 extends MediaFileProcess {

    //ts列表
    private List<String> tslist;

    public void setTslist(List<String> tslist) {
        this.tslist = tslist;
    }

    public List<String> getTslist() {
        return tslist;
    }
}
