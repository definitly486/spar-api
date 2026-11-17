package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3655l6 f46031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f46034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Sh f46035e;

    public Ih(C3655l6 c3655l6, boolean z13, int i13, HashMap map, Sh sh2) {
        this.f46031a = c3655l6;
        this.f46032b = z13;
        this.f46033c = i13;
        this.f46034d = map;
        this.f46035e = sh2;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f46031a + ", serviceDataReporterType=" + this.f46033c + ", environment=" + this.f46035e + ", isCrashReport=" + this.f46032b + ", trimmedFields=" + this.f46034d + ')';
    }
}
