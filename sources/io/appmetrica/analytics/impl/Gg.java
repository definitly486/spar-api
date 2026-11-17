package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class Gg extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3839sg f45856a;

    public Gg(Handler handler, InterfaceC3839sg interfaceC3839sg) {
        super(handler);
        this.f45856a = interfaceC3839sg;
    }

    public static void a(ResultReceiver resultReceiver, Ag ag2) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", ag2 == null ? null : ag2.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i13, Bundle bundle) {
        if (i13 == 1) {
            Ag ag2 = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    ag2 = new Ag(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f45856a.a(ag2);
        }
    }
}
