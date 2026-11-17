package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3689mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47705b;

    public C3689mf(String str, String str2) {
        this.f47704a = str;
        this.f47705b = a(str2);
    }

    public final String a(String str) {
        if (str == null) {
            return this.f47704a;
        }
        return this.f47704a + str;
    }
}
