package io.appmetrica.analytics.impl;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class J0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f46040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46041b;

    public J0(C3750p1 c3750p1, Intent intent) {
        this.f46041b = c3750p1;
        this.f46040a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U7 u13 = this.f46041b.d().f45722b;
        Intent intent = this.f46040a;
        u13.getClass();
        if (intent != null) {
            u13.a(intent.getDataString(), false);
        }
    }
}
