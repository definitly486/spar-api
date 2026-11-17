package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.model.SdkInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3817rj implements SdkEnvironmentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3460dc f48005b = new C3460dc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f48006c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SdkEnvironment f48007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f48008e;

    public C3817rj(Context context) {
        this.f48004a = context;
        this.f48007d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("7.10.0", "50135769", AbstractC3842sj.a()), "phone", C3460dc.a(context.getResources().getConfiguration()));
    }

    public final synchronized void a(ScreenInfo screenInfo) {
        float f13;
        if (screenInfo != null) {
            try {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(screenInfo, getSdkEnvironment().getScreenInfo())) {
                    String str = this.f48008e;
                    if (str == null) {
                        Context context = this.f48004a;
                        Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                        SafePackageManager safePackageManager = Ue.f46612a;
                        try {
                            f13 = context.getResources().getDisplayMetrics().density;
                        } catch (Throwable unused) {
                            f13 = 0.0f;
                        }
                        if (f13 == 0.0f) {
                            str = "phone";
                        } else {
                            float f14 = point.x;
                            float f15 = point.y;
                            float fMin = Math.min(f14 / f13, f15 / f13);
                            float f16 = f13 * 160.0f;
                            float f17 = f14 / f16;
                            float f18 = f15 / f16;
                            double dSqrt = Math.sqrt((f18 * f18) + (f17 * f17));
                            if (dSqrt < 15.0d || Ue.f46612a.hasSystemFeature(context, "android.hardware.touchscreen")) {
                                str = (dSqrt >= 7.0d || fMin >= 600.0f) ? "tablet" : "phone";
                            } else {
                                str = "tv";
                            }
                        }
                    }
                    this.f48007d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    Iterator it = this.f48006c.iterator();
                    while (it.hasNext()) {
                        ((J5) ((InterfaceC3793qj) it.next())).d();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(InterfaceC3793qj interfaceC3793qj) {
        this.f48006c.remove(interfaceC3793qj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f48007d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("sdkEnvironment");
        return null;
    }

    public final synchronized void a(String str) {
        if (str != null) {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, this.f48008e)) {
                this.f48008e = str;
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, getSdkEnvironment().getDeviceType())) {
                    this.f48007d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f48006c.iterator();
                    while (it.hasNext()) {
                        ((J5) ((InterfaceC3793qj) it.next())).d();
                    }
                }
            }
        }
    }

    public final synchronized void a(String str, String str2) {
        if (str == null) {
            try {
                str = getSdkEnvironment().getAppVersionInfo().getAppVersionName();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str2 == null) {
            str2 = getSdkEnvironment().getAppVersionInfo().getAppBuildNumber();
        }
        AppVersionInfo appVersionInfo = getSdkEnvironment().getAppVersionInfo();
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(appVersionInfo.getAppVersionName(), str) || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f48007d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f48006c.iterator();
            while (it.hasNext()) {
                ((J5) ((InterfaceC3793qj) it.next())).d();
            }
        }
    }

    public final synchronized void a(Configuration configuration) {
        this.f48005b.getClass();
        List listA = C3460dc.a(configuration);
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getSdkEnvironment().getLocales(), listA)) {
            this.f48007d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, listA, 31, null);
            Iterator it = this.f48006c.iterator();
            while (it.hasNext()) {
                ((J5) ((InterfaceC3793qj) it.next())).d();
            }
        }
    }

    public final void a(InterfaceC3793qj interfaceC3793qj) {
        this.f48006c.add(interfaceC3793qj);
    }
}
