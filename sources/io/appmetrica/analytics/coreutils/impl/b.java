package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.internal.jyumaefscl;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends jyumaefscl implements iobyxmoadg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f45264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f45265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, int i13) {
        super(0);
        this.f45264a = context;
        this.f45265b = str;
        this.f45266c = i13;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        return this.f45264a.getPackageManager().getApplicationInfo(this.f45265b, this.f45266c);
    }
}
