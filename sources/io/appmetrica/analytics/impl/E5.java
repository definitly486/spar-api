package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class E5 implements PermissionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionStrategy[] f45688a;

    public E5(PermissionStrategy... permissionStrategyArr) {
        this.f45688a = permissionStrategyArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        for (PermissionStrategy permissionStrategy : this.f45688a) {
            if (permissionStrategy.forbidUsePermission(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "CompositePermissionStrategy(strategies=" + Arrays.toString(this.f45688a) + ')';
    }
}
