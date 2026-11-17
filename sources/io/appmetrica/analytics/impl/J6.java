package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public final class J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3908va f46071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B6 f46072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f46073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3883ua f46074d;

    public J6(Context context) {
        this(context, new C3908va(), new B6(), C3883ua.a(context));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void a(Ih ih2) {
        boolean zMkdir;
        String str;
        S9 s9B;
        PrintWriter printWriter;
        C3883ua c3883ua;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.f46073c);
        this.f46072b.getClass();
        if (crashesDirectory == null) {
            return;
        }
        try {
            try {
                if (crashesDirectory.exists()) {
                    if (!crashesDirectory.isDirectory()) {
                        if (!crashesDirectory.delete()) {
                            return;
                        } else {
                            zMkdir = crashesDirectory.mkdir();
                        }
                    }
                    Pf pf2 = ih2.f46035e.f47065a;
                    str = pf2.f46389a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + pf2.f46389a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                    s9B = this.f46074d.b(str);
                    s9B.f46504a.lock();
                    s9B.f46505b.a();
                    this.f46071a.getClass();
                    printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                    printWriter.write(new Eb(ih2.f46031a, ih2.f46035e, ih2.f46034d).k());
                    io.a((Closeable) printWriter);
                    s9B.c();
                    c3883ua = this.f46074d;
                    synchronized (c3883ua) {
                        c3883ua.f48197b.remove(str);
                    }
                    return;
                }
                zMkdir = crashesDirectory.mkdir();
                printWriter.write(new Eb(ih2.f46031a, ih2.f46035e, ih2.f46034d).k());
                io.a((Closeable) printWriter);
                s9B.c();
                c3883ua = this.f46074d;
                synchronized (c3883ua) {
                    c3883ua.f48197b.remove(str);
                    return;
                }
            } catch (Throwable unused) {
                io.a((Closeable) printWriter);
                s9B.c();
                this.f46074d.a(str);
                return;
            }
            s9B.f46504a.lock();
            s9B.f46505b.a();
            this.f46071a.getClass();
            printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
        } catch (Throwable unused2) {
            printWriter = null;
        }
        if (!zMkdir) {
            return;
        }
        Pf pf3 = ih2.f46035e.f47065a;
        str = pf3.f46389a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + pf3.f46389a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        s9B = this.f46074d.b(str);
    }

    public J6(Context context, C3908va c3908va, B6 b13, C3883ua c3883ua) {
        this.f46073c = context;
        this.f46071a = c3908va;
        this.f46072b = b13;
        this.f46074d = c3883ua;
    }
}
