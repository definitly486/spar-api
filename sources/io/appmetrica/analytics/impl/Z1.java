package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2 f46838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f46839c;

    public Z1(List list, J2 j13, List list2) {
        this.f46837a = list;
        this.f46838b = j13;
        this.f46839c = list2;
    }

    public final String toString() {
        return "AppPermissionsState{mPermissionStateList=" + this.f46837a + ", mBackgroundRestrictionsState=" + this.f46838b + ", mAvailableProviders=" + this.f46839c + '}';
    }
}
