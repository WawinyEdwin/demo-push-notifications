package com.example.firepush
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService: FirebaseMessagingService() {
    private val TAG: String = String::class.java.simpleName


    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("R", token)
    }


    private fun sendRegistrationToServer(token: String) {
        // send
    }



    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        Log.d(TAG, "From: ${remoteMessage?.from}")

        remoteMessage?.data?.isNotEmpty()?.let {
            Log.d(TAG, "message data payload" + remoteMessage.data)

            if(!remoteMessage.data.isNullOrEmpty()) {
                val msg: String = remoteMessage.data["message"].toString()
            }
        }

        remoteMessage?.notification?.let{}
    }
}