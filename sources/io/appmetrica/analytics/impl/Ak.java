package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SafePackageManager f45474a = new SafePackageManager();

    public static Intent a(Context context) {
        Bundle bundle;
        C3743oj c3743oj;
        Intent intentAddFlags = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme("appmetrica").authority(context.getPackageName()).build()).addFlags(32);
        try {
            bundle = f45474a.getApplicationInfo(context, context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused) {
            bundle = new Bundle();
        }
        Intent intentPutExtras = intentAddFlags.putExtras(bundle);
        intentPutExtras.setData(intentPutExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Pf.f46388c).build());
        C3952x4 c3952x4L = C3952x4.l();
        synchronized (c3952x4L) {
            try {
                if (c3952x4L.f48385o == null) {
                    C3743oj c3743oj2 = new C3743oj();
                    c3952x4L.f48385o = c3743oj2;
                    c3952x4L.f48378h.a(c3743oj2);
                }
                c3743oj = c3952x4L.f48385o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ScreenInfo screenInfoA = c3743oj.a(context);
        intentPutExtras.putExtra("screen_size", screenInfoA == null ? null : Bb.a(screenInfoA));
        return intentPutExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
