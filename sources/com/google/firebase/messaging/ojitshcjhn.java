package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
class ojitshcjhn implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Queue f24465zdlpuopuiu = new ArrayDeque(10);

    ojitshcjhn() {
    }

    private void iobyxmoadg(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String strNufgyqmvbu = lmojexxdyd.nufgyqmvbu(extras);
                if (!TextUtils.isEmpty(strNufgyqmvbu)) {
                    if (this.f24465zdlpuopuiu.contains(strNufgyqmvbu)) {
                        return;
                    } else {
                        this.f24465zdlpuopuiu.add(strNufgyqmvbu);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e13) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e13);
        }
        if (lmojexxdyd.yadqdtsiqt(bundle)) {
            lmojexxdyd.cqumvgiudr(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        iobyxmoadg(intent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
