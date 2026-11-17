package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.jyumaefscl;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends jyumaefscl implements iobyxmoadg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f45284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f45285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Intent intent, int i13) {
        super(0);
        this.f45284a = context;
        this.f45285b = intent;
        this.f45286c = i13;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        return this.f45284a.getPackageManager().resolveService(this.f45285b, this.f45286c);
    }
}
