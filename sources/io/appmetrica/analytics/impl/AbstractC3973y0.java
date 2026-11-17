package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3973y0 {
    public static W6 a(Handler handler, C3948x0 c3948x0) {
        return new W6(handler, c3948x0);
    }

    public static Pf a(Context context, W6 w13) {
        return new Pf(context, w13);
    }

    public static Ji a(Pf pf2, Context context, ICommonExecutor iCommonExecutor) {
        C3674m0 c3674m0 = new C3674m0(context, iCommonExecutor, C3952x4.l().e());
        return new Ji(c3674m0, new Pn(new Gb()), new C3375a5(pf2), new C3594ik(context, c3674m0));
    }

    public static Ol a(Context context, Ji ji2, C3614jf c3614jf, Handler handler) {
        return new Ol(ji2, new Wl(context, c3614jf), handler);
    }

    public static C3939wg a(Ji ji2, C3614jf c3614jf, Handler handler) {
        return new C3939wg(ji2, c3614jf, handler, c3614jf.s());
    }

    public static C3941wi a(Context context, Pf pf2, Ji ji2, Handler handler, Ol ol2) {
        return new C3941wi(context, pf2, ji2, handler, ol2);
    }
}
