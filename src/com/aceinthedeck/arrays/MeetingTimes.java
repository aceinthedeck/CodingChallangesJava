package com.aceinthedeck.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*

a meeting is stored as an object of a Meeting class with integer variables startTime and endTime. These integers represent the number of 30-minute blocks past 9:00am.

example

new Meeting(2, 3);  // meeting from 10:00 – 10:30 am
new Meeting(6, 9);  // meeting from 12:00 – 1:30 pm

Write a method mergeRanges() that takes a list of multiple meeting time ranges and returns a list of condensed ranges.

For example, given:

  [Meeting(0, 1), Meeting(3, 5), Meeting(4, 8), Meeting(10, 12), Meeting(9, 10)]

your method would return:

  [Meeting(0, 1), Meeting(3, 8), Meeting(9, 12)]

 */

public class MeetingTimes {

    private int startTime;
    private int endTime;

    public MeetingTimes(int startTime, int endTime) {
        // number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime   = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }


    public List<MeetingTimes> mergeRanges(List<MeetingTimes> meetings){

        Collections.sort(meetings, new Comparator<MeetingTimes>() {
            @Override
            public int compare(MeetingTimes m1, MeetingTimes m2) {
                return m1.getStartTime() - m2.getStartTime();
            }
        });

        List<MeetingTimes> mergedMeetings = new ArrayList<>();

        mergedMeetings.add(meetings.get(0));

        for(MeetingTimes currentMeeting: meetings){

            MeetingTimes lastMergedMeeting = mergedMeetings.get(mergedMeetings.size()-1);

            if(currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()){
                lastMergedMeeting.setEndTime(Math.max(currentMeeting.getEndTime(), lastMergedMeeting.getEndTime()));

            }
            else {
                mergedMeetings.add(currentMeeting);
            }
        }

        return mergedMeetings;

    }

}
