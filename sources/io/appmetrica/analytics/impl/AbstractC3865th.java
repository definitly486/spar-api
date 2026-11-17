package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.th, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3865th implements InterfaceC3890uh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final DataSendingRestrictionController f48130a;

    public AbstractC3865th(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f48130a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3890uh
    public boolean a(Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
