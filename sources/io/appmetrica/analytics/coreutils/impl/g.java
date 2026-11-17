package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.internal.jyumaefscl;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends jyumaefscl implements iobyxmoadg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f45277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f45278b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str) {
        super(0);
        this.f45277a = context;
        this.f45278b = str;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        return Boolean.valueOf(this.f45277a.getPackageManager().hasSystemFeature(this.f45278b));
    }
}
