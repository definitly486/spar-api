package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3729o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3828s5 f47812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47813b = "[ComponentMigrationToV113]";

    public AbstractC3729o5(C3828s5 c3828s5) {
        this.f47812a = c3828s5;
    }

    public final C3828s5 a() {
        return this.f47812a;
    }

    public final String b() {
        return this.f47813b;
    }

    public abstract boolean b(int i13);

    public abstract void c();

    public final void a(int i13) {
        if (b(i13)) {
            c();
        }
    }
}
