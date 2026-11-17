package q6;

/* JADX INFO: loaded from: classes2.dex */
public final class iozdgvuglv implements Runnable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f77938iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f77939jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final h6.esjtqupxsv f77940yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final h6.zdlpuopuiu f77941zdlpuopuiu;

    public iozdgvuglv(h6.zdlpuopuiu processor, h6.esjtqupxsv token, boolean z13, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(processor, "processor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(token, "token");
        this.f77941zdlpuopuiu = processor;
        this.f77940yggfygwlhe = token;
        this.f77939jyumaefscl = z13;
        this.f77938iwizpuwonk = i13;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zJyumaefscl = this.f77939jyumaefscl ? this.f77941zdlpuopuiu.jyumaefscl(this.f77940yggfygwlhe, this.f77938iwizpuwonk) : this.f77941zdlpuopuiu.iwizpuwonk(this.f77940yggfygwlhe, this.f77938iwizpuwonk);
        g6.yggfygwlhe.eablkybsjg().iobyxmoadg(g6.yggfygwlhe.dxjokdxxww("StopWorkRunnable"), "StopWorkRunnable for " + this.f77940yggfygwlhe.iobyxmoadg().zoijcleaow() + "; Processor.stopWork = " + zJyumaefscl);
    }
}
