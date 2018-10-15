package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

import static android.content.ContentValues.TAG;


/**
 * Created by diegocotta on 15/10/2018.
 */

public class Service extends FirebaseMessagingService {

    public void onNewToken(String token) {
        Log.d(TAG, "Refreshed token: " + token);


    }

}
