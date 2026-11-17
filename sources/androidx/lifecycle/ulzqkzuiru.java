package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class ulzqkzuiru {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final u2.gxszxtbevo f9561iobyxmoadg = new u2.gxszxtbevo();

    public static final pj.cllcsxoeiz iobyxmoadg(ntlheqmsrt ntlheqmsrtVar) {
        u2.zoijcleaow zoijcleaowVarIobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ntlheqmsrtVar, "<this>");
        synchronized (f9561iobyxmoadg) {
            zoijcleaowVarIobyxmoadg = (u2.zoijcleaow) ntlheqmsrtVar.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (zoijcleaowVarIobyxmoadg == null) {
                zoijcleaowVarIobyxmoadg = u2.ppxfxbqfkf.iobyxmoadg();
                ntlheqmsrtVar.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", zoijcleaowVarIobyxmoadg);
            }
        }
        return zoijcleaowVarIobyxmoadg;
    }
}
