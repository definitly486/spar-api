package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.jyumaefscl;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends jyumaefscl implements iobyxmoadg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f45287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f45288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f45290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i13, int i14) {
        super(0);
        this.f45287a = context;
        this.f45288b = componentName;
        this.f45289c = i13;
        this.f45290d = i14;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        this.f45287a.getPackageManager().setComponentEnabledSetting(this.f45288b, this.f45289c, this.f45290d);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
