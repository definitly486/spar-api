package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C3408bc;
import io.appmetrica.analytics.impl.C3680m6;
import io.appmetrica.analytics.impl.InterfaceC3420bo;
import io.appmetrica.analytics.impl.Lb;
import io.appmetrica.analytics.impl.O6;

/* JADX INFO: loaded from: classes3.dex */
public final class CounterAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O6 f48892a;

    CounterAttribute(String str, Lb lb3, C3408bc c3408bc) {
        this.f48892a = new O6(str, lb3, c3408bc);
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withDelta(double d13) {
        return new UserProfileUpdate<>(new C3680m6(this.f48892a.f46309c, d13));
    }
}
