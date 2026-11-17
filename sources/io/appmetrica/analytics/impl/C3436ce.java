package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3436ce extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
    public C3436ce(Object obj) {
        super(1, obj, C3462de.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        C3462de c3462de = (C3462de) this.receiver;
        c3462de.f47099a.markCrashCompleted((String) obj);
        c3462de.f47099a.deleteCompletedCrashes();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
