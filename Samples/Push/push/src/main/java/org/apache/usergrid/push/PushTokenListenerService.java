package org.apache.usergrid.push;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class PushTokenListenerService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        if( refreshedToken != null ) {
            MainActivity.registerPush(this,refreshedToken);
        }
    }
}
