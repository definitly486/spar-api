package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3456d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f47091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47093c;

    public C3456d8(String str, HashMap map, String str2) {
        this.f47092b = str;
        this.f47091a = map;
        this.f47093c = str2;
    }

    public final String toString() {
        return "DeferredDeeplinkState{mParameters=" + this.f47091a + ", mDeeplink='" + this.f47092b + "', mUnparsedReferrer='" + this.f47093c + "'}";
    }
}
