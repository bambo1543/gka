package com.example.GKA100;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

/**
 * Created by andreas on 23.03.14.
 */
public class SMSReceiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent)
    {
        if(intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED"))
        {
            Bundle bundle = intent.getExtras();
            Object messages[] = (Object[]) bundle.get("pdus");
            SmsMessage smsMessage[] = new SmsMessage[messages.length];

            for (int n = 0; n < messages.length; n++)
                smsMessage[n] = SmsMessage.createFromPdu((byte[]) messages[n]);

            String toast = "Received SMS from: " + smsMessage[0].getDisplayOriginatingAddress();
            toast += "\nMessage: " + smsMessage[0].getDisplayMessageBody();

            Toast.makeText(context, toast, Toast.LENGTH_LONG).show();
        }
    }
}
