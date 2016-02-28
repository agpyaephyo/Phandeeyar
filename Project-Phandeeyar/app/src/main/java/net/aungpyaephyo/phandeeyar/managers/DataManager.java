package net.aungpyaephyo.phandeeyar.managers;

import com.google.gson.reflect.TypeToken;

import net.aungpyaephyo.phandeeyar.data.vos.EventVO;
import net.aungpyaephyo.phandeeyar.utils.CommonInstances;
import net.aungpyaephyo.phandeeyar.utils.JsonUtils;

import org.json.JSONException;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by aung on 2/25/16.
 */
public class DataManager {

    private static final String DUMMY_EVENT_LIST = "event_list.json";

    private static DataManager objInstance;

    private List<EventVO> eventList;

    private DataManager() {

    }

    public static DataManager getInstance() {
        if (objInstance == null) {
            objInstance = new DataManager();
        }

        return objInstance;
    }

    public void loadEventList() {
        try {
            String dummyEventList = JsonUtils.getInstance().loadDummyData(DUMMY_EVENT_LIST);
            Type listType = new TypeToken<List<EventVO>>() {
            }.getType();
            eventList = CommonInstances.getGsonInstance().fromJson(dummyEventList, listType);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public List<EventVO> getEventList() {
        return eventList;
    }
}
