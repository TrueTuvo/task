package com.serveryn.zabara.task.domain;


import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "alarm_clocks")
public class AlarmClock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne()
    @Column(name = "calendar")
    private Calendar calendar;

    @OneToOne()
    @Column(name = "timer")
    private Timer timer;

    private Timestamp timestamp;

    public AlarmClock() {
    }

    public AlarmClock(Calendar calendar, Timer timer, Timestamp timestamp) {
        this.calendar = calendar;
        this.timer = timer;
        this.timestamp = timestamp;
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

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

}
