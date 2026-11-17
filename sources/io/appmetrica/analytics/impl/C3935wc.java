package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3935wc extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3960xc f48326a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3935wc(C3960xc c3960xc) {
        super(0);
        this.f48326a = c3960xc;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    @Override // tg.iobyxmoadg
    public final Object invoke() {
        Pc ye2;
        C3960xc c3960xc = this.f48326a;
        Qc qc3 = c3960xc.f48424f;
        M9 m13 = c3960xc.f48420b;
        C3465dh c3465dh = c3960xc.f48419a;
        J4 j13 = c3960xc.f48421c;
        C3639kf c3639kf = c3960xc.f48422d;
        qc3.getClass();
        if (FrameworkDetector.isNative()) {
            C3560ha c3560haH = Ia.F.h();
            Bundle applicationMetaData = c3560haH.f47384d.getApplicationMetaData(c3560haH.f47381a);
            if (TextUtils.isEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                ye2 = new C3513fe();
            } else {
                ye2 = new Ye(m13, c3465dh, j13, c3639kf);
            }
        } else {
            ye2 = new Ye(m13, c3465dh, j13, c3639kf);
        }
        return ye2.a();
    }
}
