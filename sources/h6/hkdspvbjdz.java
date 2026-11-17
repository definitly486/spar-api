package h6;

import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes2.dex */
public final class hkdspvbjdz implements hcddaimhww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu f39551iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final r6.zoijcleaow f39552zoijcleaow;

    public hkdspvbjdz(zdlpuopuiu processor, r6.zoijcleaow workTaskExecutor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(processor, "processor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workTaskExecutor, "workTaskExecutor");
        this.f39551iobyxmoadg = processor;
        this.f39552zoijcleaow = workTaskExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lqeggnwhkg(hkdspvbjdz hkdspvbjdzVar, esjtqupxsv esjtqupxsvVar, WorkerParameters.iobyxmoadg iobyxmoadgVar) {
        hkdspvbjdzVar.f39551iobyxmoadg.kcexrzcfyt(esjtqupxsvVar, iobyxmoadgVar);
    }

    @Override // h6.hcddaimhww
    public void iobyxmoadg(esjtqupxsv workSpecId, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpecId, "workSpecId");
        this.f39552zoijcleaow.wkgbmnqykc(new q6.iozdgvuglv(this.f39551iobyxmoadg, workSpecId, false, i13));
    }

    @Override // h6.hcddaimhww
    public void ppxfxbqfkf(final esjtqupxsv workSpecId, final WorkerParameters.iobyxmoadg iobyxmoadgVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpecId, "workSpecId");
        this.f39552zoijcleaow.wkgbmnqykc(new Runnable() { // from class: h6.jpowsppfya
            @Override // java.lang.Runnable
            public final void run() {
                hkdspvbjdz.lqeggnwhkg(this.f39572zdlpuopuiu, workSpecId, iobyxmoadgVar);
            }
        });
    }
}
