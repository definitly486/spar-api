package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: loaded from: classes3.dex */
public final class F2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiConsumer f45776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f45777b;

    public F2(C3373a3 c3373a3, ICommonExecutor iCommonExecutor) {
        this.f45776a = c3373a3;
        this.f45777b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f45777b.execute(new E2(this, context, intent));
    }
}
