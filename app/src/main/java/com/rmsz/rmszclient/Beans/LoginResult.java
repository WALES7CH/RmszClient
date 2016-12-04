package com.rmsz.rmszclient.Beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by witt on 16/12/2.
 */

public class LoginResult{


    /**
     * status : 200
     * message : 登陆成功,请存储token信息
     * data : {"user":{"id":"1","username":"admin","password":"15bcbb7ab711b95cf0a29885701fadc9","logintime":"1480076156","loginip":"0.0.0.0","lock":"0"},"token":"e83d5509ada51936b41920bac567602aef28844b"}
     */

    private int status;
    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return "Token{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * user : {"id":"1","username":"admin","password":"15bcbb7ab711b95cf0a29885701fadc9","logintime":"1480076156","loginip":"0.0.0.0","lock":"0"}
         * token : e83d5509ada51936b41920bac567602aef28844b
         */

        private UserBean user;
        private String token;

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public static class UserBean {
            /**
             * id : 1
             * username : admin
             * password : 15bcbb7ab711b95cf0a29885701fadc9
             * logintime : 1480076156
             * loginip : 0.0.0.0
             * lock : 0
             */

            private String id;
            private String username;
            private String password;
            private String logintime;
            private String loginip;
            private String lock;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getLogintime() {
                return logintime;
            }

            public void setLogintime(String logintime) {
                this.logintime = logintime;
            }

            public String getLoginip() {
                return loginip;
            }

            public void setLoginip(String loginip) {
                this.loginip = loginip;
            }

            public String getLock() {
                return lock;
            }

            public void setLock(String lock) {
                this.lock = lock;
            }
        }
    }
}
