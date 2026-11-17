package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import android.content.Context;
import hg.jyumaefscl;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.screenshot.impl.a0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f48966a;

    public a0(d0 d0Var) {
        this.f48966a = d0Var;
    }

    public static final Boolean a(d0 d0Var, a0 a0Var, C4034m c4034m, ActivityManager activityManager) {
        Object next;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = jyumaefscl.wflxmlrfwp();
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
        }
        Iterator<T> it = runningServices.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!zdlpuopuiu.eablkybsjg(((ActivityManager.RunningServiceInfo) next).process, "com.android.systemui:screenshot"));
        if (((ActivityManager.RunningServiceInfo) next) != null) {
            ((C4042v) d0Var.f48976b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(d0Var.f48977c.postDelayed(a0Var, TimeUnit.SECONDS.toMillis(c4034m.f49003b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C4034m c4034m = this.f48966a.f48979e;
        if (this.f48966a.f48978d || c4034m == null || !c4034m.f49002a) {
            return;
        }
        Context context = this.f48966a.f48975a.getContext();
        final d0 d0Var = this.f48966a;
        SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "running service screenshot captor", "ActivityManager", new FunctionWithThrowable() { // from class: dg.zoijcleaow
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return a0.a(d0Var, this, c4034m, (ActivityManager) obj);
            }
        });
    }
}
