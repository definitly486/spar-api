package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3408bc implements InterfaceC3751p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H4 f46960a;

    public C3408bc(H4 h13) {
        this.f46960a = h13;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3751p2
    public final C3446co a(C3394ao c3394ao, C3446co c3446co) {
        int i13 = c3394ao.f46931b;
        int i14 = this.f46960a.f45878a;
        if (i13 == i14) {
            if (((C3446co) ((HashMap) c3394ao.f46930a.get(c3446co.f47048b)).get(new String(c3446co.f47047a))) != null) {
                ((HashMap) c3394ao.f46930a.get(c3446co.f47048b)).put(new String(c3446co.f47047a), c3446co);
            }
        } else if (i13 < i14) {
            ((HashMap) c3394ao.f46930a.get(c3446co.f47048b)).put(new String(c3446co.f47047a), c3446co);
            c3394ao.f46931b++;
        }
        return c3446co;
    }
}
