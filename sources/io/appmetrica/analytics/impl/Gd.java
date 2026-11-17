package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Gd extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ab f45854a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gd(Ab ab3) {
        super(1);
        this.f45854a = ab3;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        C3861td c3861td = (C3861td) ((Map.Entry) obj).getValue();
        return c3861td.f48122b.parse(this.f45854a);
    }
}
