package nb2;

/* JADX INFO: loaded from: classes6.dex */
public final class zdlpuopuiu {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final Object f69633ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final agtfadlqog f69634iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final kcexrzcfyt f69635zoijcleaow;

    public zdlpuopuiu(agtfadlqog persistentMetricsEventRepository, kcexrzcfyt sendMetricsEventBatchUseCase) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(persistentMetricsEventRepository, "persistentMetricsEventRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sendMetricsEventBatchUseCase, "sendMetricsEventBatchUseCase");
        this.f69634iobyxmoadg = persistentMetricsEventRepository;
        this.f69635zoijcleaow = sendMetricsEventBatchUseCase;
    }

    public final void iobyxmoadg() {
        synchronized (f69633ppxfxbqfkf) {
            while (true) {
                try {
                    jyumaefscl jyumaefsclVarIobyxmoadg = this.f69635zoijcleaow.iobyxmoadg();
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jyumaefsclVarIobyxmoadg, jyumaefscl.iobyxmoadg.f69579iobyxmoadg)) {
                        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    } else if (jyumaefsclVarIobyxmoadg instanceof jyumaefscl.zoijcleaow) {
                        this.f69634iobyxmoadg.iobyxmoadg(((jyumaefscl.zoijcleaow) jyumaefsclVarIobyxmoadg).f69580iobyxmoadg);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
