package com.xuecheng.framework.domain.media.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;

@Data
public class QueryMediaFileRequest extends RequestData {

    private String fileOriginalName;
    private String processStatus;
    private String tag;

    public void setFileOriginalName(String fileOriginalName) {
        this.fileOriginalName = fileOriginalName;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getFileOriginalName() {
        return fileOriginalName;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public String getTag() {
        return tag;
    }
}
