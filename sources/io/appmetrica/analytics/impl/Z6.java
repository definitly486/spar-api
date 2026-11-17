package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class Z6 implements DataSendingRestrictionController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X6 f46844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f46845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f46846c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f46847d = new HashSet();

    public Z6(X6 x13) {
        this.f46844a = x13;
        this.f46845b = ((Y6) x13).a();
    }

    public final synchronized void a(Boolean bool) {
        try {
            if (io.a(bool) || this.f46845b == null) {
                boolean zEquals = Boolean.FALSE.equals(bool);
                this.f46845b = Boolean.valueOf(zEquals);
                ((Y6) this.f46844a).f46798a.c(zEquals).b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Boolean bool) {
        if (this.f46845b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f46845b;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool == null ? this.f46847d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(String str, Boolean bool) {
        try {
            if (io.a(bool) || (!this.f46847d.contains(str) && !this.f46846c.contains(str))) {
                if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                    this.f46847d.add(str);
                    this.f46846c.remove(str);
                } else {
                    this.f46846c.add(str);
                    this.f46847d.remove(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
