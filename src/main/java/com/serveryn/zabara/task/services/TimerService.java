package com.serveryn.zabara.task.services;



import com.serveryn.zabara.task.domain.Timer;

import java.util.List;

public interface TimerService {

    List<Timer> getAllTimers();

    Timer getTimer(int id);

    void saveTimer(Timer timer);

    void deleteTimer(int id);

}
