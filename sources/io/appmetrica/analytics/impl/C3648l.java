package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3648l implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f47619a = new HashSet();

    public C3648l(C3698n c3698n) {
        c3698n.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(InterfaceC3623k interfaceC3623k) {
        this.f47619a.add(interfaceC3623k);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        C3952x4.l().f48373c.a().execute(new RunnableC3598j(this, activity));
    }

    public final void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f47619a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C3743oj) ((InterfaceC3623k) it.next())).a(activity);
        }
    }
}
