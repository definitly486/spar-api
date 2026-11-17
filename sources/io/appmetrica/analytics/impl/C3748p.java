package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3748p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f47851a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC3723o enumC3723o) {
        if (activity != null && this.f47851a.get(activity) == enumC3723o) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f47851a.put(activity, enumC3723o);
        return true;
    }
}
