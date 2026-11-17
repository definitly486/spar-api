package io.appmetrica.analytics.impl;

import android.util.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3550h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3383ad f47360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3819rl f47363d;

    public C3550h0(String str, long j13, C3819rl c3819rl) {
        this.f47361b = j13;
        try {
            this.f47360a = new C3383ad(str);
        } catch (Throwable unused) {
            this.f47360a = new C3383ad();
        }
        this.f47363d = c3819rl;
    }

    public final synchronized void a(Pair pair) {
        if (this.f47363d.b(this.f47360a, (String) pair.first, (String) pair.second)) {
            this.f47362c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f47360a.size() + ". Is changed " + this.f47362c + ". Current revision " + this.f47361b;
    }

    public final synchronized C3525g0 a() {
        try {
            if (this.f47362c) {
                this.f47361b++;
                this.f47362c = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new C3525g0(Bb.b(this.f47360a), this.f47361b);
    }
}
