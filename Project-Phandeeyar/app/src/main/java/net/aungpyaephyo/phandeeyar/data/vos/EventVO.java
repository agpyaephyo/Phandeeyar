package net.aungpyaephyo.phandeeyar.data.vos;

import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by aung on 2/25/16.
 */
public class EventVO {

    private static final SimpleDateFormat sdfEventTimeReceive = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
    private static final SimpleDateFormat sdfEventStartTime = new SimpleDateFormat("EEEE, MMM dd, hh:mm aa");
    private static final SimpleDateFormat sdfEventEndTime = new SimpleDateFormat("hh:mm aa");

    @SerializedName("event_title")
    private String eventTitle;

    @SerializedName("stock_photo")
    private String stockPhoto;

    @SerializedName("event_desc")
    private String eventDesc;

    @SerializedName("start_time")
    private String startTime;

    @SerializedName("end_time")
    private String endTime;

    public String getEventTitle() {
        return eventTitle;
    }

    public String getStockPhoto() {
        return stockPhoto;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getEventTime() {
        try {
            Date startDateTime = sdfEventTimeReceive.parse(startTime);
            Date endDateTime = sdfEventTimeReceive.parse(endTime);

            return sdfEventStartTime.format(startDateTime) + " - " + sdfEventEndTime.format(endDateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
