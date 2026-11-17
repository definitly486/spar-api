package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3905v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3455d7 f48232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f48233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48234c;

    public C3905v7(InterfaceC3455d7 interfaceC3455d7, ArrayList arrayList, boolean z13) {
        this.f48232a = interfaceC3455d7;
        this.f48233b = arrayList;
        this.f48234c = z13;
    }

    public final String a(Context context, InterfaceC3830s7 interfaceC3830s7) {
        File parentFile;
        try {
            File fileA = this.f48232a.a(context, interfaceC3830s7.b());
            if (!fileA.exists() && (parentFile = fileA.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, interfaceC3830s7.a(), fileA);
            }
            return fileA.getPath();
        } catch (Throwable unused) {
            return interfaceC3830s7.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.f48233b;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File fileA = ((InterfaceC3455d7) it.next()).a(context, str);
                if (fileA.exists()) {
                    try {
                        if (this.f48234c) {
                            FileUtils.copyToNullable(fileA, file);
                        } else {
                            FileUtils.move(fileA, file);
                        }
                        String path = fileA.getPath();
                        String path2 = file.getPath();
                        for (String str2 : hg.jyumaefscl.rgvfuqvkyq("-journal", "-shm", "-wal")) {
                            File file2 = new File(path + str2);
                            File file3 = new File(path2 + str2);
                            if (this.f48234c) {
                                FileUtils.copyToNullable(file2, file3);
                            } else {
                                FileUtils.move(file2, file3);
                            }
                        }
                        return;
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
        }
    }
}
