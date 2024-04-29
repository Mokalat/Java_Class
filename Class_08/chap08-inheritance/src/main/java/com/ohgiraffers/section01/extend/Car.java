package com.ohgiraffers.section01.extend;

public class Car {
    private boolean runningStatus;

    public Car(boolean isOn) {
        this.runningStatus = isOn;
        System.out.println("Car 클래스의 기본 생성자 호출됨");
    }

    public void SoundHorn(){
        if (isRunningStatus()){
            System.out.println(("빵! 빵!"));
        }else {
            System.out.println("주행중이 아닌 상태에서는 경적을 올릴 수 없습니다.");
        }
    }
      private boolean isRunningStatus(){
//    protected boolean isRunningStatus() {
        return runningStatus;
    }
    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }
}
