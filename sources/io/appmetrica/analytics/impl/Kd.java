package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* JADX INFO: loaded from: classes3.dex */
public final class Kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3510fb f46149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S9 f46150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Oe f46151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mo f46152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile IdentifiersResult f46153f;

    public Kd(Context context, InterfaceC3510fb interfaceC3510fb) {
        this(context, interfaceC3510fb, Ld.a(context), new Oe(context), new mo());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:10:0x0019, B:12:0x0029, B:14:0x002f, B:17:0x003d, B:19:0x0056, B:20:0x0064, B:22:0x006f), top: B:34:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:10:0x0019, B:12:0x0029, B:14:0x002f, B:17:0x003d, B:19:0x0056, B:20:0x0064, B:22:0x006f), top: B:34:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x006f A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:10:0x0019, B:12:0x0029, B:14:0x002f, B:17:0x003d, B:19:0x0056, B:20:0x0064, B:22:0x006f), top: B:34:0x0019 }] */
    public final IdentifiersResult a() {
        String strA;
        IdentifiersResult identifiersResult = this.f46153f;
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            mo moVar = this.f46152e;
            String str = identifiersResult.f48647id;
            moVar.getClass();
            if (mo.a(str)) {
                return identifiersResult;
            }
        }
        try {
            S9 s13 = this.f46150c;
            s13.f46504a.lock();
            s13.f46505b.a();
            identifiersResult = this.f46153f;
            if (identifiersResult == null || identifiersResult.status != IdentifierStatus.OK) {
                strA = AbstractC3484eb.a(FileUtils.getFileFromSdkStorage(this.f46151d.f46335a, "uuid.dat"));
                this.f46152e.getClass();
                if (!mo.a(strA)) {
                    strA = this.f46151d.a(this.f46149b.a(this.f46148a));
                }
                this.f46152e.getClass();
                if (mo.a(strA)) {
                    IdentifiersResult identifiersResult2 = new IdentifiersResult(strA, IdentifierStatus.OK, null);
                    try {
                        this.f46153f = identifiersResult2;
                    } catch (Throwable unused) {
                    }
                    identifiersResult = identifiersResult2;
                }
            } else {
                mo moVar2 = this.f46152e;
                String str2 = identifiersResult.f48647id;
                moVar2.getClass();
                if (!mo.a(str2)) {
                    strA = AbstractC3484eb.a(FileUtils.getFileFromSdkStorage(this.f46151d.f46335a, "uuid.dat"));
                    this.f46152e.getClass();
                    if (!mo.a(strA)) {
                        strA = this.f46151d.a(this.f46149b.a(this.f46148a));
                    }
                    this.f46152e.getClass();
                    if (mo.a(strA)) {
                        IdentifiersResult identifiersResult3 = new IdentifiersResult(strA, IdentifierStatus.OK, null);
                        this.f46153f = identifiersResult3;
                        identifiersResult = identifiersResult3;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        S9 s14 = this.f46150c;
        s14.f46505b.b();
        s14.f46504a.unlock();
        return identifiersResult != null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
    }

    public Kd(Context context, InterfaceC3510fb interfaceC3510fb, S9 s13, Oe oe2, mo moVar) {
        this.f46148a = context;
        this.f46149b = interfaceC3510fb;
        this.f46150c = s13;
        this.f46151d = oe2;
        this.f46152e = moVar;
        try {
            s13.a();
            oe2.a();
            s13.b();
        } catch (Throwable unused) {
            this.f46150c.b();
        }
    }
}
