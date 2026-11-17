package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3933wa implements yo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48299b;

    public C3933wa(Context context, String str) {
        this.f48298a = context;
        this.f48299b = str;
    }

    @Override // io.appmetrica.analytics.impl.yo
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f48298a, this.f48299b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f48298a, this.f48299b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return rg.gxszxtbevo.nufgyqmvbu(fileFromSdkStorage, null, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.yo
    public final void a(String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f48298a, this.f48299b);
            if (fileFromSdkStorage != null) {
                rg.gxszxtbevo.btonecajqb(fileFromSdkStorage, str, null, 2, null);
            }
        } catch (Throwable unused) {
        }
    }
}
