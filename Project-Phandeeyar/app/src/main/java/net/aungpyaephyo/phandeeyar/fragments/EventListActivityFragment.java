package net.aungpyaephyo.phandeeyar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import net.aungpyaephyo.phandeeyar.R;
import net.aungpyaephyo.phandeeyar.data.vos.EventVO;
import net.aungpyaephyo.phandeeyar.managers.DataManager;
import net.aungpyaephyo.phandeeyar.views.ViewItemEvent;

import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class EventListActivityFragment extends Fragment {

    public EventListActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_event_list, container, false);

        LinearLayout llEventContainer = (LinearLayout) rootView.findViewById(R.id.ll_event_container);
        llEventContainer.removeAllViews();

        List<EventVO> eventList = DataManager.getInstance().getEventList();
        for (EventVO event : eventList) {
            ViewItemEvent viEvent = (ViewItemEvent) inflater.inflate(R.layout.view_item_event, container, false);
            viEvent.setData(event);
            llEventContainer.addView(viEvent);
        }

        return rootView;
    }
}
