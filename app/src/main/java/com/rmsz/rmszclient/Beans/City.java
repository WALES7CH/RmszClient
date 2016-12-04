package com.rmsz.rmszclient.Beans;

import java.util.List;

/**
 * Created by witt on 16/12/3.
 */

public class City {
    /**
     * status : 200
     * message : 查询成功
     * data : [{"id":"2","name":"成都市","pid":"1","unused":"0","level":"2","note":"","engnieer":"黄俊","search":"成都"},{"id":"3","name":"绵阳市","pid":"1","unused":"0","level":"2","note":"","engnieer":"黄俊","search":"绵阳"},{"id":"4","name":"巴中市","pid":"1","unused":"0","level":"2","note":"","engnieer":"刘俊杰","search":"巴中"},{"id":"6","name":"资阳地区","pid":"1","unused":"0","level":"2","note":"","engnieer":"黄俊","search":"资阳"},{"id":"8","name":"资阳市","pid":"1","unused":"1","level":"2","note":"","engnieer":"黄俊","search":""},{"id":"9","name":"广元市","pid":"1","unused":"0","level":"2","note":"","engnieer":"卢炼","search":"广元"},{"id":"11","name":"达州市","pid":"1","unused":"0","level":"2","note":"","engnieer":"黄志君","search":"达州"},{"id":"12","name":"金水区","pid":"1","unused":"0","level":"2","note":"","engnieer":"黄俊","search":"金水"},{"id":"14","name":"广安市","pid":"1","unused":"0","level":"2","note":"","engnieer":"黄俊","search":"广安"},{"id":"15","name":"阿坝州","pid":"1","unused":"0","level":"2","note":"","engnieer":"黄俊","search":"阿坝"},{"id":"16","name":"泸州市","pid":"1","unused":"0","level":"2","note":"","engnieer":"黄俊","search":"泸州"},{"id":"17","name":"遂宁市","pid":"1","unused":"0","level":"2","note":"","engnieer":"黄俊","search":"遂宁"},{"id":"18","name":"内江市","pid":"1","unused":"1","level":"2","note":"","engnieer":"黄俊","search":"内江"},{"id":"19","name":"简阳市","pid":"1","unused":"0","level":"2","note":"","engnieer":"黄俊","search":"简阳"},{"id":"20","name":"攀枝花市","pid":"1","unused":"0","level":"2","note":"","engnieer":"黄俊","search":"攀枝花"},{"id":"21","name":"甘孜州","pid":"1","unused":"0","level":"2","note":"","engnieer":"黄俊","search":"甘孜"},{"id":"22","name":"南充市","pid":"1","unused":"0","level":"2","note":"","engnieer":"黄俊","search":"南充"}]
     */

    private int status;
    private String message;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 2
         * name : 成都市
         * pid : 1
         * unused : 0
         * level : 2
         * note :
         * engnieer : 黄俊
         * search : 成都
         */

        private String id;
        private String name;
        private String pid;
        private String unused;
        private String level;
        private String note;
        private String engnieer;
        private String search;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getUnused() {
            return unused;
        }

        public void setUnused(String unused) {
            this.unused = unused;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public String getEngnieer() {
            return engnieer;
        }

        public void setEngnieer(String engnieer) {
            this.engnieer = engnieer;
        }

        public String getSearch() {
            return search;
        }

        public void setSearch(String search) {
            this.search = search;
        }
    }
}
