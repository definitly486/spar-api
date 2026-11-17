package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zo extends SimpleThreadSafeToggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f48638a;

    public zo() {
        super(false, "[WakelocksToggle]");
        this.f48638a = new WeakHashMap();
    }

    public final synchronized void a(Object obj) {
        this.f48638a.put(obj, null);
        if (this.f48638a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(Object obj) {
        this.f48638a.remove(obj);
        if (this.f48638a.isEmpty()) {
            updateState(false);
        }
    }
}
