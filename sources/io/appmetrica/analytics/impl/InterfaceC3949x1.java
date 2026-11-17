package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3949x1 {
    /* synthetic */ void a(Intent intent);

    /* synthetic */ void a(Intent intent, int i13);

    /* synthetic */ void a(Intent intent, int i13, int i14);

    void a(InterfaceC3924w1 interfaceC3924w1);

    /* synthetic */ void b(Intent intent);

    /* synthetic */ void c(Intent intent);

    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    /* synthetic */ void onCreate();

    /* synthetic */ void onDestroy();

    void pauseUserSession(Bundle bundle);

    void reportData(int i13, Bundle bundle);

    void resumeUserSession(Bundle bundle);
}
