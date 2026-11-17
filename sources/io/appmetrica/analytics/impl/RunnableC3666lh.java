package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3666lh implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C3714nf c3714nfX = Ia.F.x();
        if (timePassedChecker.didTimePassMillis(c3714nfX.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg("major", Integer.valueOf(kotlinVersion.getMajor()));
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg2 = gg.cqumvgiudr.iobyxmoadg("minor", Integer.valueOf(kotlinVersion.getMinor()));
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg3 = gg.cqumvgiudr.iobyxmoadg("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(kotlinVersion.getMajor());
            sb3.append('.');
            sb3.append(kotlinVersion.getMinor());
            sb3.append('.');
            sb3.append(kotlinVersion.getPatch());
            Map mapDraadjrbmk = hg.tzroggbefp.draadjrbmk(vdvldrhtssVarIobyxmoadg, vdvldrhtssVarIobyxmoadg2, vdvldrhtssVarIobyxmoadg3, gg.cqumvgiudr.iobyxmoadg("version", sb3.toString()));
            C3442ck c3442ck = Bj.f45542a;
            c3442ck.getClass();
            c3442ck.a(new C3416bk("kotlin_version", mapDraadjrbmk));
            c3714nfX.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
