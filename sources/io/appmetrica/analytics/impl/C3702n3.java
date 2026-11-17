package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3702n3 implements InterfaceC3646km {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BillingMonitor f47734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f47735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f47736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f47737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BillingType f47738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BillingInfoStorage f47739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BillingInfoSender f47740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ApplicationStateProvider f47741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3652l3 f47742i;

    public C3702n3(Context context, Executor executor, Executor executor2, BillingType billingType, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender) {
        this(context, executor, executor2, billingType, billingInfoStorage, billingInfoSender, Ia.j().d(), new C3652l3());
    }

    public final void a(C3521fm c3521fm, Boolean bool) {
        BillingMonitor c3732o8;
        if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
            synchronized (this) {
                try {
                    C3652l3 c3652l3 = this.f47742i;
                    Context context = this.f47735b;
                    Executor executor = this.f47736c;
                    Executor executor2 = this.f47737d;
                    BillingType billingType = this.f47738e;
                    BillingInfoStorage billingInfoStorage = this.f47739f;
                    BillingInfoSender billingInfoSender = this.f47740g;
                    c3652l3.getClass();
                    if (AbstractC3627k3.f47580a[billingType.ordinal()] == 1) {
                        c3732o8 = new BillingLibraryMonitor(context, executor, executor2, billingInfoStorage, billingInfoSender, null, null, 96, null);
                    } else {
                        c3732o8 = new C3732o8();
                    }
                    this.f47734a = c3732o8;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c3732o8.onBillingConfigChanged(c3521fm.f47251x);
            if (this.f47741h.registerStickyObserver(new C3677m3(this)) == ApplicationState.VISIBLE) {
                try {
                    BillingMonitor billingMonitor = this.f47734a;
                    if (billingMonitor != null) {
                        billingMonitor.onSessionResumed();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public C3702n3(Context context, Executor executor, Executor executor2, BillingType billingType, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, ApplicationStateProvider applicationStateProvider, C3652l3 c3652l3) {
        this.f47735b = context;
        this.f47736c = executor;
        this.f47737d = executor2;
        this.f47738e = billingType;
        this.f47739f = billingInfoStorage;
        this.f47740g = billingInfoSender;
        this.f47741h = applicationStateProvider;
        this.f47742i = c3652l3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3646km
    public final synchronized void a(C3521fm c3521fm) {
        BillingMonitor billingMonitor;
        synchronized (this) {
            billingMonitor = this.f47734a;
        }
        if (billingMonitor != null) {
            billingMonitor.onBillingConfigChanged(c3521fm.f47251x);
        }
    }
}
