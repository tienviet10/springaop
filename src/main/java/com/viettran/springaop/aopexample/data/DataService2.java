package com.viettran.springaop.aopexample.data;

import com.viettran.springaop.aopexample.annotations.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DataService2 {
    @TrackTime
    public int[] retrieveData() {

        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return new int[]{111, 222, 333, 444, 555};
    }
}
