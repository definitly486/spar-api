package io.appmetrica.analytics.impl;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class Hb implements InterfaceC3391al {
    @Override // io.appmetrica.analytics.impl.InterfaceC3391al
    public final boolean a(Eb eb3) {
        Integer num = eb3.f45716f;
        return num == null || num.intValue() != Process.myPid();
    }
}
