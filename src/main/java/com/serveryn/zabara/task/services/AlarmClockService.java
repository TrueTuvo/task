package com.serveryn.zabara.task.services;

import com.serveryn.zabara.task.domain.AlarmClock;


import java.util.List;

public interface AlarmClockService {

    List<AlarmClock> getAllAlarmClocks();

    AlarmClock getAlarmClock(int id);

    void saveAlarmClock(AlarmClock alarmClock);

    void deleteAlarmClock(int id);

}
