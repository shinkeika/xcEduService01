package com.xuecheng.framework.utils;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class XcOauth2Util {

    public UserJwt getUserJwtFromHeader(HttpServletRequest request){
        Map<String, String> jwtClaims = Oauth2Util.getJwtClaimsFromHeader(request);
        if(jwtClaims == null || StringUtils.isEmpty(jwtClaims.get("id"))){
            return null;
        }
        UserJwt userJwt = new UserJwt();
        userJwt.setId(jwtClaims.get("id"));
        userJwt.setName(jwtClaims.get("name"));
        userJwt.setCompanyId(jwtClaims.get("companyId"));
        userJwt.setUtype(jwtClaims.get("utype"));
        userJwt.setUserpic(jwtClaims.get("userpic"));
        return userJwt;
    }

    @Data
    public class UserJwt{
        private String id;
        private String name;
        private String userpic;
        private String utype;
        private String companyId;

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setUserpic(String userpic) {
            this.userpic = userpic;
        }

        public void setUtype(String utype) {
            this.utype = utype;
        }

        public void setCompanyId(String companyId) {
            this.companyId = companyId;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getUserpic() {
            return userpic;
        }

        public String getUtype() {
            return utype;
        }

        public String getCompanyId() {
            return companyId;
        }
    }

}
