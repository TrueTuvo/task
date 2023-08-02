package com.serveryn.zabara.task.services;

import com.serveryn.zabara.task.domain.Calendar;

import java.util.List;

public interface CalendarService {

    List<Calendar> getAllCalendars();

    Calendar getCalendar(int id);

    void saveCalendar(Calendar calendar);

    void deleteCalendar(int id);

}
