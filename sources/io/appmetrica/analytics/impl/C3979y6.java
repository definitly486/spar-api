package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3979y6 extends C3439ch {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f48503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ih f48504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M6 f48505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final R1 f48506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final J6 f48507j;

    public C3979y6(Context context, C3674m0 c3674m0, Zk zk2, Ih ih2) {
        super(c3674m0, zk2, ih2);
        this.f48503f = context;
        this.f48504g = ih2;
        this.f48505h = C3952x4.l().i();
        this.f48506i = C3952x4.l().f();
        this.f48507j = new J6(context);
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final synchronized void a() {
        try {
            if (this.f46160c) {
                return;
            }
            this.f46160c = true;
            String strB = this.f48505h.b();
            R1 r13 = this.f48506i;
            Context context = this.f48503f;
            r13.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strB, serviceInfo != null ? serviceInfo.processName : null)) {
                this.f48507j.a(this.f48504g);
            } else {
                this.f46158a.c();
                this.f46160c = false;
                super.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final boolean c() {
        this.f48507j.a(this.f48504g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Kh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
