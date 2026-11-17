package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3764pf implements Yn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47879a;

    public C3764pf(C3813rf c3813rf) {
        boolean z13;
        List<C3789qf> list = c3813rf.f47990b;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C3789qf) it.next()).f47924c == EnumC3657l8.f47648c) {
                    z13 = false;
                }
            }
            z13 = true;
        } else {
            z13 = true;
        }
        this.f47879a = z13;
    }

    @Override // io.appmetrica.analytics.impl.Yn, tg.rgvfuqvkyq
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C3789qf> invoke(List<? extends C3789qf> list, Ef ef2) {
        C3789qf c3789qf = new C3789qf(ef2.f45727a, ef2.f45728b, ef2.f45731e);
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C3789qf) it.next()).f47924c == ef2.f45731e) {
                    if (c3789qf.f47924c == EnumC3657l8.f47648c && this.f47879a) {
                        return hg.jyumaefscl.jrbgnlbqoe(list, c3789qf);
                    }
                    return null;
                }
            }
        }
        return hg.jyumaefscl.jrbgnlbqoe(list, c3789qf);
    }
}
