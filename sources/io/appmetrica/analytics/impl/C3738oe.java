package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3738oe implements po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47831a;

    public C3738oe(String str) {
        this.f47831a = str;
    }

    @Override // io.appmetrica.analytics.impl.po
    public final no a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new no(this, true, "");
        }
        return new no(this, false, this.f47831a + " is empty.");
    }
}
