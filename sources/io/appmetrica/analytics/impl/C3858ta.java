package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3858ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f48116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileLock f48117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RandomAccessFile f48118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f48119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48120e;

    public C3858ta(Context context, String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f48116a, "rw");
            this.f48118c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f48119d = channel;
            if (this.f48120e == 0) {
                this.f48117b = channel.lock();
            }
            this.f48120e++;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            this.f48116a.getAbsolutePath();
            int i13 = this.f48120e - 1;
            this.f48120e = i13;
            if (i13 == 0) {
                AbstractC3484eb.a(this.f48117b);
            }
            io.a((Closeable) this.f48118c);
            io.a((Closeable) this.f48119d);
            this.f48118c = null;
            this.f48117b = null;
            this.f48119d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C3858ta(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public C3858ta(File file) {
        this.f48120e = 0;
        this.f48116a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
