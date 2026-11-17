package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3566hg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f47394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f47395b;

    public RunnableC3566hg(File file, C6 c13) {
        this.f47394a = file;
        this.f47395b = c13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] fileArrListFiles;
        if (!this.f47394a.exists() || !this.f47394a.isDirectory() || (fileArrListFiles = this.f47394a.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                this.f47395b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
