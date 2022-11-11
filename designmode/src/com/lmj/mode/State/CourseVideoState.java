package com.lmj.mode.State;

/**
 * 定义一个抽象的课程视频状态类
 */
public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    //播放功能方法
    public abstract void play();

    //快进功能方法
    public abstract void speed();

    //暂停功能方法
    public abstract void pause();

    //停止功能方法
    public abstract void stop();

}
