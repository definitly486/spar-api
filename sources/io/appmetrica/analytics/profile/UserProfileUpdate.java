package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.InterfaceC3420bo;
import io.appmetrica.analytics.impl.Pd;

/* JADX INFO: loaded from: classes3.dex */
public class UserProfileUpdate<T extends InterfaceC3420bo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3420bo f48901a;

    UserProfileUpdate(Pd pd2) {
        this.f48901a = pd2;
    }

    public T getUserProfileUpdatePatcher() {
        return (T) this.f48901a;
    }
}
