package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3499f0 implements po {
    @Override // io.appmetrica.analytics.impl.po
    public final no a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new no(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new no(this, true, "");
        } catch (Throwable unused) {
            return new no(this, false, "Invalid ApiKey=" + str + ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
    }
}
