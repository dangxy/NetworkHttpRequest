package com.dxy.networkhttprequest.bean;

import java.util.ArrayList;

/**
 * Created by dangxueyi on 16/6/4.
 */
public class GankMeiziEntity {

    /**
     * error : false
     * results : [{"_id":"56cc6d1d421aa95caa7075bf","createdAt":"2015-11-17T01:30:17.111Z","desc":"11.17","publishedAt":"2015-11-17T04:00:01.748Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1ey3ptkta45j20hs0qomzy.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa707534","createdAt":"2015-11-13T03:57:41.206Z","desc":"11.13","publishedAt":"2015-11-13T04:03:12.613Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bgw1exz7lm0ow0j20qo0hrjud.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707678","createdAt":"2015-06-05T01:05:18.878Z","desc":"6.5\u2014\u2014（1）","publishedAt":"2015-06-05T03:54:29.403Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bgw1essxulfqxxj20hr0qo77f.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70757d","createdAt":"2015-10-29T01:49:31.473Z","desc":"10.29","publishedAt":"2015-10-29T04:40:26.424Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1exhrgo769bj20ox0zk42e.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70755f","createdAt":"2015-10-27T01:17:26.385Z","desc":"10.27","publishedAt":"2015-10-27T02:43:16.906Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1exfffnlf2gj20hq0qoju9.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075a6","createdAt":"2015-11-02T03:53:25.557Z","desc":"11.2","publishedAt":"2015-11-02T04:16:06.443Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bgw1exmhnx76z9j20go0dcabp.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa707523","createdAt":"2015-11-04T10:33:50.564Z","desc":"11.5","publishedAt":"2015-11-05T04:02:52.968Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exp4h479xfj20hs0qoq6t.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa70752b","createdAt":"2015-11-06T01:54:17.536Z","desc":"11.6","publishedAt":"2015-11-06T04:11:25.973Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exr0p4r0h3j20oy15445o.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075b1","createdAt":"2015-11-02T23:46:36.247Z","desc":"11.3","publishedAt":"2015-11-03T06:04:59.454Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1exng5dd728j20go0m877n.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075a6","createdAt":"2015-11-02T03:53:25.557Z","desc":"11.2","publishedAt":"2015-11-02T04:16:06.443Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bgw1exmhnx76z9j20go0dcabp.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707642","createdAt":"2015-07-15T03:56:42.772Z","desc":"7.15","publishedAt":"2015-07-15T04:05:29.732Z","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034gw1eu3bld296jj20df0kudhx.jpg","used":true,"who":"小贝"},{"_id":"56cc6d1d421aa95caa70755a","createdAt":"2015-10-26T01:16:49.787Z","desc":"10.26","publishedAt":"2015-10-26T03:52:58.746Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1exe9ssy2gsj20qo0hndjr.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707692","createdAt":"2015-06-12T01:31:07.31Z","desc":"6.12","publishedAt":"2015-06-12T03:48:54.790Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1et11xp5wwij20hs0qotb2.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa70752b","createdAt":"2015-11-06T01:54:17.536Z","desc":"11.6","publishedAt":"2015-11-06T04:11:25.973Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exr0p4r0h3j20oy15445o.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075b1","createdAt":"2015-11-02T23:46:36.247Z","desc":"11.3","publishedAt":"2015-11-03T06:04:59.454Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1exng5dd728j20go0m877n.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa70752b","createdAt":"2015-11-06T01:54:17.536Z","desc":"11.6","publishedAt":"2015-11-06T04:11:25.973Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exr0p4r0h3j20oy15445o.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707637","createdAt":"2015-06-16T01:02:36.279Z","desc":"6.16","publishedAt":"2015-06-16T05:56:27.410Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bgw1et5nl9mno8j20hs0qoacj.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075dd","createdAt":"2015-05-28T01:44:11.137Z","desc":"5.28","publishedAt":"2015-05-28T03:49:22.702Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1esjpu1vxggj20qo0hrgqw.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa70750f","createdAt":"2015-11-04T03:20:20.50Z","desc":"11.4","publishedAt":"2015-11-04T04:01:55.601Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1exory1k01ej20go0gnjv8.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707573","createdAt":"2015-10-28T03:38:43.164Z","desc":"10.28","publishedAt":"2015-10-28T03:51:19.336Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1exgp509vvxj20fr0nm786.jpg","used":true,"who":"张涵宇"}]
     */

    private boolean error;
    /**
     * _id : 56cc6d1d421aa95caa7075bf
     * createdAt : 2015-11-17T01:30:17.111Z
     * desc : 11.17
     * publishedAt : 2015-11-17T04:00:01.748Z
     * type : 福利
     * url : http://ww4.sinaimg.cn/large/7a8aed7bjw1ey3ptkta45j20hs0qomzy.jpg
     * used : true
     * who : 张涵宇
     */

    private ArrayList<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public ArrayList<ResultsBean> getResults() {
        return results;
    }

    public void setResults(ArrayList<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
