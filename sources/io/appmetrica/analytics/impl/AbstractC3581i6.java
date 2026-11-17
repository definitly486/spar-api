package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3581i6 extends BaseRequestConfig.ComponentLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafePackageManager f47427a;

    public AbstractC3581i6(Context context, String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* JADX INFO: renamed from: a */
    public C3605j6 load(C3556h6 c3556h6) {
        C3605j6 c3605j6 = (C3605j6) super.load(c3556h6);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f47427a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i13 = applicationInfo.flags;
            c3605j6.f47514a = (i13 & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            c3605j6.f47515b = (i13 & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            c3605j6.f47514a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            c3605j6.f47515b = (getContext().getApplicationInfo().flags & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else {
            c3605j6.f47514a = CommonUrlParts.Values.FALSE_INTEGER;
            c3605j6.f47515b = CommonUrlParts.Values.FALSE_INTEGER;
        }
        C3521fm c3521fm = c3556h6.f47372a;
        c3605j6.f47516c = c3521fm;
        c3605j6.setRetryPolicyConfig(c3521fm.f47247t);
        return c3605j6;
    }

    public AbstractC3581i6(Context context, String str, SafePackageManager safePackageManager) {
        super(context, str);
        this.f47427a = safePackageManager;
    }
}
