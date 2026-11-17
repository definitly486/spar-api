package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Y1 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46793a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile U7 f46794b = null;

    public final void a(U7 u13) {
        ArrayList arrayListA;
        synchronized (this) {
            this.f46794b = u13;
            arrayListA = a();
        }
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ((InterfaceC3763pe) it.next()).consume(u13);
        }
    }

    public final void b() {
        C3952x4.l().f48375e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C3952x4.l().f48375e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new W1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        X1 x13 = new X1(dataString);
        synchronized (this) {
            try {
                U7 u13 = this.f46794b;
                if (u13 == null) {
                    this.f46793a.add(x13);
                } else {
                    ((U9) C3952x4.l().f48373c.a()).f46606b.post(new V1(x13, u13));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f46793a);
        this.f46793a.clear();
        return arrayList;
    }
}
