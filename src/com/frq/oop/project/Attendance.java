package com.frq.oop.project;

import java.util.List;

public class Attendance {
    boolean attend;

    public Attendance(boolean attend) {
        this.attend = attend;
    }

    public boolean hasAttended() {
        return attend;
    }

    public void setAttend(boolean attend) {
        this.attend = attend;
    }
}
