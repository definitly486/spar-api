package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3578i3 implements BillingInfoSender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3635kb f47416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f47417b;

    public C3578i3(InterfaceC3635kb interfaceC3635kb) {
        this(interfaceC3635kb, Ia.j().w().e());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(List<ProductInfo> list) {
        Iterator<ProductInfo> it = list.iterator();
        while (it.hasNext()) {
            this.f47417b.execute(new C3553h3(this, it.next()));
        }
    }

    public C3578i3(InterfaceC3635kb interfaceC3635kb, ICommonExecutor iCommonExecutor) {
        this.f47416a = interfaceC3635kb;
        this.f47417b = iCommonExecutor;
    }
}
