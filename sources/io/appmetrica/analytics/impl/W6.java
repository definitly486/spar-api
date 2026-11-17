package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class W6 extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V6 f46704a;

    public W6(Handler handler, V6 v13) {
        super(handler);
        this.f46704a = v13;
    }

    public static void a(ResultReceiver resultReceiver, C3728o4 c3728o4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c3728o4.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i13, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f46704a.a(i13, bundle);
    }

    public static void a(ResultReceiver resultReceiver, Jl jl2, C3728o4 c3728o4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", jl2.f46115a);
            c3728o4.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
