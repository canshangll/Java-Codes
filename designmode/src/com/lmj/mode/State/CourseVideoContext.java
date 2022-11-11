package com.lmj.mode.State;

/**
 * 定义一个课程视频上下文类
 */
public class CourseVideoContext {
    private CourseVideoState courseVideoState;

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    //声明常量
    public static final PlayState PLAY_STATE = new PlayState();
    public static final SpeedState SPEED_STATE = new SpeedState();
    public static final PauseSate PAUSE_SATE = new PauseSate();
    public static final StopState STOP_STATE = new StopState();

    public void play() {
        this.courseVideoState.play();
    }

    public void speed() {
        this.courseVideoState.speed();
    }

    public void pause() {
        this.courseVideoState.pause();
    }

    public void stop() {
        this.courseVideoState.stop();
    }

}
