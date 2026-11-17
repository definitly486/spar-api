package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3679m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f47695a = new CopyOnWriteArrayList();

    public final void a(A4 a13) {
        this.f47695a.add(a13);
    }

    public final void b(A4 a13) {
        this.f47695a.remove(a13);
    }

    public final List<A4> a() {
        return this.f47695a;
    }
}
