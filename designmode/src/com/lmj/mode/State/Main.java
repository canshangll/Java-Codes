package com.lmj.mode.State;

public class Main {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        //设置播放视频状态
        courseVideoContext.setCourseVideoState(new PlayState());
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        //设置暂停播放视频状态
        courseVideoContext.pause();
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        //设置快进播放视频功能
        courseVideoContext.speed();
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        //设置停止播放视频功能
        courseVideoContext.stop();
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        //停止播放视频在调用快进功能
        courseVideoContext.speed();
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.play();
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
    }
}
