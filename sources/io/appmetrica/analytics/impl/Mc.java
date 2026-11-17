package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class Mc extends C3953x5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C3818rk f46233n;

    public Mc(Context context, C3654l5 c3654l5, J4 j13, AbstractC3779q5 abstractC3779q5, C3521fm c3521fm, InterfaceC3890uh interfaceC3890uh, ICommonExecutor iCommonExecutor, int i13, C3818rk c3818rk, C3382ac c3382ac, N9 n13) {
        super(context, c3654l5, j13, abstractC3779q5, c3521fm, interfaceC3890uh, iCommonExecutor, i13, c3382ac, n13);
        this.f46233n = c3818rk;
    }

    public final C3702n3 a(Kc kc3) {
        String str;
        BillingType billingType;
        Field field;
        Context context = this.f48393c;
        IHandlerExecutor iHandlerExecutorA = this.f46233n.a();
        Executor executorF = this.f46233n.f();
        try {
            Class<?> clsFindClass = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
            str = (String) ((clsFindClass == null || (field = clsFindClass.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null || mj.kcexrzcfyt.zfvoamnweg(str) || mj.kcexrzcfyt.stevsuqkhv(str, "2.", false, 2, null) || mj.kcexrzcfyt.stevsuqkhv(str, "3.", false, 2, null) || mj.kcexrzcfyt.stevsuqkhv(str, "4.", false, 2, null)) {
            billingType = BillingType.NONE;
        } else {
            billingType = (!mj.kcexrzcfyt.stevsuqkhv(str, "5.", false, 2, null) && mj.kcexrzcfyt.stevsuqkhv(str, "6.", false, 2, null)) ? BillingType.LIBRARY_V6 : BillingType.LIBRARY_V6;
        }
        return new C3702n3(context, iHandlerExecutorA, executorF, billingType, new C3602j3(Qm.a(C3925w2.class).a(this.f48393c)), new C3578i3(kc3, Ia.j().w().e()));
    }

    public final Cg b(Kc kc3) {
        C4012ze c4012ze = new C4012ze(kc3);
        Objects.requireNonNull(kc3);
        return new Cg(c4012ze, new Jc(kc3), kc3);
    }

    @Override // io.appmetrica.analytics.impl.C3953x5
    public final L9 a(Q9 q13, C3532g7 c3532g7, C3465dh c3465dh, J4 j13, C3654l5 c3654l5, C3639kf c3639kf) {
        return this.f48402l.a(q13, c3532g7, c3465dh, j13, c3654l5, c3639kf).a();
    }
}
