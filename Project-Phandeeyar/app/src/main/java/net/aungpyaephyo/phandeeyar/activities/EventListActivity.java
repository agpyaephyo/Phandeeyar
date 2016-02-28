package net.aungpyaephyo.phandeeyar.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import net.aungpyaephyo.phandeeyar.R;
import net.aungpyaephyo.phandeeyar.utils.PhandeeyarConstants;
import net.aungpyaephyo.phandeeyar.views.ViewPodFabs;

public class EventListActivity extends BaseActivity
        implements ViewPodFabs.ControllerFabs {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        ViewPodFabs vpFabs = (ViewPodFabs) findViewById(R.id.vp_fabs);
        vpFabs.setController(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTapCall() {
        makeCall(PhandeeyarConstants.NUMBER_TO_CALL);
    }

    @Override
    public void onTapMap() {
        navigateInMap(PhandeeyarConstants.URI_TO_OPEN_IN_MAP);
    }

    @Override
    public void onTapFacebook() {
        openInFacebook(PhandeeyarConstants.URI_TO_OPEN_IN_FACEBOOK);
    }
}
