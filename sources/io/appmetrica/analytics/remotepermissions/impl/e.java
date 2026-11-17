package io.appmetrica.analytics.remotepermissions.impl;

import hg.ikoacuggdj;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements PermissionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f48908a = ikoacuggdj.eablkybsjg();

    public final synchronized void a(Set<String> set) {
        this.f48908a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(String str) {
        return !this.f48908a.contains(str);
    }
}
