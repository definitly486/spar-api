package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C3408bc;
import io.appmetrica.analytics.impl.C3887ue;
import io.appmetrica.analytics.impl.H4;
import io.appmetrica.analytics.impl.InterfaceC3420bo;
import io.appmetrica.analytics.impl.Lb;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.O6;
import io.appmetrica.analytics.impl.Oi;
import io.appmetrica.analytics.impl.Yk;

/* JADX INFO: loaded from: classes3.dex */
public final class NumberAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O6 f48896a;

    NumberAttribute(String str, Lb lb3, C3408bc c3408bc) {
        this.f48896a = new O6(str, lb3, c3408bc);
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withValue(double d13) {
        return new UserProfileUpdate<>(new C3887ue(this.f48896a.f46309c, d13, new Lb(), new N4(new C3408bc(new H4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withValueIfUndefined(double d13) {
        return new UserProfileUpdate<>(new C3887ue(this.f48896a.f46309c, d13, new Lb(), new Yk(new C3408bc(new H4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC3420bo> withValueReset() {
        return new UserProfileUpdate<>(new Oi(1, this.f48896a.f46309c, new Lb(), new C3408bc(new H4(100))));
    }
}
