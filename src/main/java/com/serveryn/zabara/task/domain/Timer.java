package com.serveryn.zabara.task.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "timers")
public class Timer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne
    @Column(name = "calendar")
    public Calendar calendar;
    @OneToOne
    @Column(name = "alarmClock")
    public AlarmClock alarmClock;

    private int second;

    public Timer() {
    }

    public Timer(Calendar calendar, AlarmClock alarmClock, int second) {
        this.calendar = calendar;
        this.alarmClock = alarmClock;
        this.second = second;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public AlarmClock getAlarmClock() {
        return alarmClock;
    }

    public void setAlarmClock(AlarmClock alarmClock) {
        this.alarmClock = alarmClock;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
