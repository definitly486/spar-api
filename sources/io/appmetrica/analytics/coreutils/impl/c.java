package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import kotlin.jvm.internal.jyumaefscl;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends jyumaefscl implements iobyxmoadg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafePackageManager f45267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f45268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SafePackageManager safePackageManager, Context context) {
        super(0);
        this.f45267a = safePackageManager;
        this.f45268b = context;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        SafePackageManager safePackageManager = this.f45267a;
        Context context = this.f45268b;
        ApplicationInfo applicationInfo = safePackageManager.getApplicationInfo(context, context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }
}
