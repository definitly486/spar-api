package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3958xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Boolean f48417a;

    public final void a(Context context) {
        if (this.f48417a == null) {
            synchronized (this) {
                try {
                    if (this.f48417a == null) {
                        boolean z13 = false;
                        try {
                            File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "uuid.dat");
                            boolean zExists = fileFromAppStorage != null ? fileFromAppStorage.exists() : false;
                            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, "uuid.dat");
                            boolean zExists2 = fileFromSdkStorage != null ? fileFromSdkStorage.exists() : false;
                            if (zExists || zExists2) {
                                z13 = true;
                            }
                        } catch (Throwable unused) {
                        }
                        this.f48417a = Boolean.valueOf(z13);
                    }
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
