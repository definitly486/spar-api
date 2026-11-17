package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class S extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f46473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ti f46474b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t13, Ti ti2) {
        super(0);
        this.f46473a = t13;
        this.f46474b = ti2;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        T t13 = this.f46473a;
        M m13 = t13.f46532h;
        Context context = t13.f46525a;
        Ti ti2 = this.f46474b;
        m13.getClass();
        return M.a(new L(m13, context, ti2));
    }
}
