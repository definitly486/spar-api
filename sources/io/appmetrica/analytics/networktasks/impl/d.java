package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkTask f48806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48807b;

    public d(NetworkTask networkTask) {
        this.f48806a = networkTask;
        this.f48807b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f48807b.equals(((d) obj).f48807b);
    }

    public final int hashCode() {
        return this.f48807b.hashCode();
    }
}
