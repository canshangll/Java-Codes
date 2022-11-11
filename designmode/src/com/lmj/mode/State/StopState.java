package com.lmj.mode.State;

/**
 * 定义一个暂停功能状态类
 */
public class StopState extends CourseVideoState{
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("停止暂停不能快进");
    }

    @Override
    public void pause() {
        System.out.println("停止状态不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("停止播放课程视频状态");
    }
}
