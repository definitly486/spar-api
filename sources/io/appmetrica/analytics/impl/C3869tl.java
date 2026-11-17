package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.services.ContextPermissionChecker;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3869tl implements PermissionExtractor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f48140b = "[SimplePermissionExtractor]";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionStrategy f48141a;

    public C3869tl(PermissionStrategy permissionStrategy) {
        this.f48141a = permissionStrategy;
    }

    public final PermissionStrategy a() {
        return this.f48141a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(Context context, String str) {
        if (this.f48141a.forbidUsePermission(str)) {
            return false;
        }
        return ContextPermissionChecker.hasPermission(context, str);
    }
}
