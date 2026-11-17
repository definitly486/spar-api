package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingService extends nufgyqmvbu {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final Queue f24327lereixgezr = new ArrayDeque(10);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Rpc f24328esjtqupxsv;

    private String agtfadlqog(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private void cqumvgiudr(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                kcexrzcfyt();
                break;
            case "gcm":
                lmojexxdyd.esjtqupxsv(intent);
                wflxmlrfwp(intent);
                break;
            case "send_error":
                iwizpuwonk(agtfadlqog(intent), new SendException(intent.getStringExtra("error")));
                break;
            case "send_event":
                yggfygwlhe(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    private boolean draadjrbmk(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f24327lereixgezr;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    private Rpc rgvfuqvkyq(Context context) {
        if (this.f24328esjtqupxsv == null) {
            this.f24328esjtqupxsv = new Rpc(context.getApplicationContext());
        }
        return this.f24328esjtqupxsv;
    }

    private void vdvldrhtss(Intent intent) {
        if (!draadjrbmk(intent.getStringExtra("google.message_id"))) {
            cqumvgiudr(intent);
        }
        rgvfuqvkyq(this).messageHandled(new CloudMessage(intent));
    }

    private void wflxmlrfwp(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (ylkuphrtab.zdlpuopuiu(extras)) {
            ylkuphrtab ylkuphrtabVar = new ylkuphrtab(extras);
            ExecutorService executorServiceEablkybsjg = agtfadlqog.eablkybsjg();
            try {
                if (new eablkybsjg(this, ylkuphrtabVar, executorServiceEablkybsjg).iobyxmoadg()) {
                    executorServiceEablkybsjg.shutdown();
                    return;
                } else {
                    executorServiceEablkybsjg.shutdown();
                    if (lmojexxdyd.cdpycssgdh(intent)) {
                        lmojexxdyd.iwizpuwonk(intent);
                    }
                }
            } catch (Throwable th2) {
                executorServiceEablkybsjg.shutdown();
                throw th2;
            }
        }
        zdlpuopuiu(new RemoteMessage(extras));
    }

    @Override // com.google.firebase.messaging.nufgyqmvbu
    protected Intent eablkybsjg(Intent intent) {
        return mbcevpiqjq.zoijcleaow().ppxfxbqfkf();
    }

    @Override // com.google.firebase.messaging.nufgyqmvbu
    public void gxszxtbevo(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            vdvldrhtss(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            jyumaefscl(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public void iwizpuwonk(String str, Exception exc) {
    }

    public void jyumaefscl(String str) {
    }

    public void kcexrzcfyt() {
    }

    public void yggfygwlhe(String str) {
    }

    public void zdlpuopuiu(RemoteMessage remoteMessage) {
    }
}
