package com.xuecheng.framework.model.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class QueryResponseResult<T> extends ResponseResult {

    QueryResult<T> queryResult;

    public QueryResponseResult(ResultCode resultCode,QueryResult queryResult){
        super(resultCode);
       this.queryResult = queryResult;
    }

    public void setQueryResult(QueryResult<T> queryResult) {
        this.queryResult = queryResult;
    }

    public QueryResult<T> getQueryResult() {
        return queryResult;
    }
}
