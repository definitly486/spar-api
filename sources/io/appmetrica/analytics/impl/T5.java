package io.appmetrica.analytics.impl;

import hg.ikoacuggdj;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class T5 implements Y8, InterfaceC3658l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3532g7 f46547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f46548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f46549c;

    public T5(C3532g7 c3532g7) {
        this.f46547a = c3532g7;
        Set setDxjokdxxww = ikoacuggdj.dxjokdxxww(Integer.valueOf(EnumC3934wb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC3934wb.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC3934wb.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC3934wb.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC3934wb.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC3934wb.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC3934wb.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC3934wb.EVENT_TYPE_SEND_REVENUE_EVENT.a()));
        this.f46548b = setDxjokdxxww;
        this.f46549c = new AtomicLong(c3532g7.a(setDxjokdxxww));
        c3532g7.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3658l9
    public final void a() {
        this.f46549c.set(this.f46547a.a(this.f46548b));
    }

    @Override // io.appmetrica.analytics.impl.Y8
    public final boolean b() {
        return this.f46549c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3658l9
    public final void b(List<Integer> list) {
        int i13 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f46548b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i13 = i13 + 1) < 0) {
                    hg.jyumaefscl.jyumaefscl();
                }
            }
        }
        this.f46549c.addAndGet(-i13);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3658l9
    public final void a(List<Integer> list) {
        int i13 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f46548b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i13 = i13 + 1) < 0) {
                    hg.jyumaefscl.jyumaefscl();
                }
            }
        }
        this.f46549c.addAndGet(i13);
    }
}
