package com.lmj.mode.State;

/**
 * 定义一个播放功能状态类
 */
public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("正常播放课程视频状态");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_SATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
