package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3990yh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3655l6 f48533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f48534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3927w4 f48535d;

    public RunnableC3990yh(Context context, C3655l6 c3655l6, Bundle bundle, C3927w4 c3927w4) {
        this.f48532a = context;
        this.f48533b = c3655l6;
        this.f48534c = bundle;
        this.f48535d = c3927w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C3452d4 c3452d4A = C3452d4.a(this.f48532a, this.f48534c);
            if (c3452d4A == null) {
                return;
            }
            C3653l4 c3653l4A = C3653l4.a(c3452d4A);
            C3817rj c3817rjU = Ia.F.u();
            c3817rjU.a(c3452d4A.f47066b.getAppVersion(), c3452d4A.f47066b.getAppBuildNumber());
            c3817rjU.a(c3452d4A.f47066b.getDeviceType());
            K4 k13 = new K4(new Zl(c3452d4A), new J4(c3452d4A.f47066b, Bb.c(c3452d4A.f47065a.f46389a.getAsString("PROCESS_CFG_CLIDS"))), c3452d4A.f47065a.f46390b);
            this.f48535d.a(c3653l4A, k13).a(this.f48533b, k13);
        } catch (Throwable th2) {
            C3442ck c3442ck = Bj.f45542a;
            String str = "Exception during processing event with type: " + this.f48533b.f47634d + " (" + this.f48533b.f47635e + "): " + th2.getMessage();
            c3442ck.getClass();
            c3442ck.a(new Cj(str, th2));
        }
    }
}
