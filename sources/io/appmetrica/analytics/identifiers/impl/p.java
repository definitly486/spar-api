package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.jyumaefscl;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends jyumaefscl implements draadjrbmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f45423a = new p();

    public p() {
        super(1);
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i13 = t.f45427a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof u)) ? new s(iBinder) : (u) iInterfaceQueryLocalInterface;
    }
}
