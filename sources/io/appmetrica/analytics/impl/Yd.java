package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class Yd implements NativeCrashHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg.draadjrbmk f46804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f46805b = Ia.j().w().e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3410be f46806c;

    public Yd(Context context, C3516fh c3516fh, tg.draadjrbmk draadjrbmkVar, InterfaceC3539ge interfaceC3539ge, EnumC3934wb enumC3934wb, String str) {
        this.f46804a = draadjrbmkVar;
        this.f46806c = new C3410be(context, c3516fh, interfaceC3539ge, enumC3934wb);
    }

    public static final void a(Yd yd2, NativeCrash nativeCrash, File file) {
        yd2.f46804a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(final NativeCrash nativeCrash) {
        B0 b13;
        C3883ua c3883ua;
        try {
            NativeCrashSource nativeCrashSource = nativeCrash.getIo.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY java.lang.String();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            C0 c0A = D0.a(nativeCrash.getMetadata());
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(c0A);
            b13 = new B0(nativeCrashSource, handlerVersion, str, dumpFile, creationTime, c0A);
        } catch (Throwable unused) {
            b13 = null;
        }
        if (b13 == null) {
            this.f46804a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(b13.f45487f.f45549a).info("Detected native crash with uuid = " + b13.f45484c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f46805b;
        C3410be c3410be = this.f46806c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.cqumvgiudr
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Yd.a(this.f47051iobyxmoadg, nativeCrash, (File) obj);
            }
        };
        c3410be.getClass();
        Ud ud2 = new Ud(new Wd(b13.f45482a, b13.f45483b), c3410be.f46969f);
        Rd rd2 = new Rd(c3410be.f46965b, b13.f45487f, new C3384ae(b13, c3410be.f46967d));
        C3908va c3908va = c3410be.f46968e;
        String str2 = b13.f45485d;
        c3908va.getClass();
        File file = new File(str2);
        Context context = c3410be.f46964a;
        if (C3883ua.f48195c == null) {
            synchronized (kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(C3883ua.class)) {
                try {
                    if (C3883ua.f48195c == null) {
                        C3883ua.f48195c = new C3883ua(context);
                    }
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C3883ua c3883ua2 = C3883ua.f48195c;
        if (c3883ua2 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("INSTANCE");
            c3883ua = null;
        } else {
            c3883ua = c3883ua2;
        }
        iHandlerExecutor.execute(new RunnableC3541gg(file, ud2, consumer, rd2, c3883ua, c3410be.f46966c.a(b13)));
    }
}
