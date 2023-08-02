package com.serveryn.zabara.task.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "calendars")
public class Calendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @OneToMany()
    @Column(name = "alarmClock")
    private List<AlarmClock> alarmClocks;
    @OneToMany
    @Column(name = "timer")
    private  List<Timer> timers;

    private Date date;

    public Calendar() {
    }

    public Calendar(List<AlarmClock> alarmClocks, List<Timer> timers, Date date) {
        this.alarmClocks = alarmClocks;
        this.timers = timers;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<AlarmClock> getAlarmClocks() {
        return alarmClocks;
    }

    public void setAlarmClocks(List<AlarmClock> alarmClocks) {
        this.alarmClocks = alarmClocks;
    }

    public List<Timer> getTimers() {
        return timers;
    }

    public void setTimers(List<Timer> timers) {
        this.timers = timers;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
