package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class E2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f45678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f45679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F2 f45680c;

    public E2(F2 f13, Context context, Intent intent) {
        this.f45680c = f13;
        this.f45678a = context;
        this.f45679b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45680c.f45776a.consume(this.f45678a, this.f45679b);
    }
}
