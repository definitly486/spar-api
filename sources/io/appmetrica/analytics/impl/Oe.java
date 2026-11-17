package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class Oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lo f46336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mo f46337c;

    public Oe(Context context) {
        this(context, new lo(), new mo());
    }

    public final String a(String str) {
        try {
            this.f46337c.getClass();
            if (!mo.a(str)) {
                this.f46336b.getClass();
                str = mj.kcexrzcfyt.hcddaimhww(UUID.randomUUID().toString(), "-", "", false, 4, null).toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f46335a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                AbstractC3484eb.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Oe(Context context, lo loVar, mo moVar) {
        this.f46335a = context;
        this.f46336b = loVar;
        this.f46337c = moVar;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f46335a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f46335a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
