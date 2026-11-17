package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45666a;

    public Dm(int i13) {
        this.f45666a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Dm) && this.f45666a == ((Dm) obj).f45666a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45666a);
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f45666a + ')';
    }
}
