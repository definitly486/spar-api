package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.lmojexxdyd;
import com.google.firebase.messaging.wflxmlrfwp;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    private static Intent iobyxmoadg(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    protected int onMessageReceive(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new wflxmlrfwp(context).gtknphoqwx(cloudMessage.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException e13) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e13);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    protected void onNotificationDismissed(Context context, Bundle bundle) {
        Intent intentIobyxmoadg = iobyxmoadg(context, CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS, bundle);
        if (lmojexxdyd.cdpycssgdh(intentIobyxmoadg)) {
            lmojexxdyd.jyumaefscl(intentIobyxmoadg);
        }
    }
}
