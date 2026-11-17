package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
final class w implements s {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float f117330eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pkzmftpjix f117331iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private kcexrzcfyt f117332ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private kcexrzcfyt f117333wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private kcexrzcfyt f117334zoijcleaow;

    public w(pkzmftpjix pkzmftpjixVar) {
        this.f117331iobyxmoadg = pkzmftpjixVar;
        this.f117330eablkybsjg = pkzmftpjixVar.iobyxmoadg();
    }

    @Override // vipkmwdibw.s
    public kcexrzcfyt eablkybsjg(long j13, kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2) {
        if (this.f117334zoijcleaow == null) {
            this.f117334zoijcleaow = zdlpuopuiu.lqeggnwhkg(kcexrzcfytVar);
        }
        kcexrzcfyt kcexrzcfytVar3 = this.f117334zoijcleaow;
        if (kcexrzcfytVar3 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("valueVector");
            kcexrzcfytVar3 = null;
        }
        int iZoijcleaow = kcexrzcfytVar3.zoijcleaow();
        for (int i13 = 0; i13 < iZoijcleaow; i13++) {
            kcexrzcfyt kcexrzcfytVar4 = this.f117334zoijcleaow;
            if (kcexrzcfytVar4 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("valueVector");
                kcexrzcfytVar4 = null;
            }
            kcexrzcfytVar4.eablkybsjg(i13, this.f117331iobyxmoadg.eablkybsjg(j13, kcexrzcfytVar.iobyxmoadg(i13), kcexrzcfytVar2.iobyxmoadg(i13)));
        }
        kcexrzcfyt kcexrzcfytVar5 = this.f117334zoijcleaow;
        if (kcexrzcfytVar5 != null) {
            return kcexrzcfytVar5;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("valueVector");
        return null;
    }

    @Override // vipkmwdibw.s
    public float iobyxmoadg() {
        return this.f117330eablkybsjg;
    }

    @Override // vipkmwdibw.s
    public kcexrzcfyt ppxfxbqfkf(long j13, kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2) {
        if (this.f117332ppxfxbqfkf == null) {
            this.f117332ppxfxbqfkf = zdlpuopuiu.lqeggnwhkg(kcexrzcfytVar);
        }
        kcexrzcfyt kcexrzcfytVar3 = this.f117332ppxfxbqfkf;
        if (kcexrzcfytVar3 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("velocityVector");
            kcexrzcfytVar3 = null;
        }
        int iZoijcleaow = kcexrzcfytVar3.zoijcleaow();
        for (int i13 = 0; i13 < iZoijcleaow; i13++) {
            kcexrzcfyt kcexrzcfytVar4 = this.f117332ppxfxbqfkf;
            if (kcexrzcfytVar4 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("velocityVector");
                kcexrzcfytVar4 = null;
            }
            kcexrzcfytVar4.eablkybsjg(i13, this.f117331iobyxmoadg.zoijcleaow(j13, kcexrzcfytVar.iobyxmoadg(i13), kcexrzcfytVar2.iobyxmoadg(i13)));
        }
        kcexrzcfyt kcexrzcfytVar5 = this.f117332ppxfxbqfkf;
        if (kcexrzcfytVar5 != null) {
            return kcexrzcfytVar5;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("velocityVector");
        return null;
    }

    @Override // vipkmwdibw.s
    public long wkgbmnqykc(kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2) {
        if (this.f117332ppxfxbqfkf == null) {
            this.f117332ppxfxbqfkf = zdlpuopuiu.lqeggnwhkg(kcexrzcfytVar);
        }
        kcexrzcfyt kcexrzcfytVar3 = this.f117332ppxfxbqfkf;
        if (kcexrzcfytVar3 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("velocityVector");
            kcexrzcfytVar3 = null;
        }
        int iZoijcleaow = kcexrzcfytVar3.zoijcleaow();
        long jMax = 0;
        for (int i13 = 0; i13 < iZoijcleaow; i13++) {
            jMax = Math.max(jMax, this.f117331iobyxmoadg.ppxfxbqfkf(kcexrzcfytVar.iobyxmoadg(i13), kcexrzcfytVar2.iobyxmoadg(i13)));
        }
        return jMax;
    }

    @Override // vipkmwdibw.s
    public kcexrzcfyt zoijcleaow(kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2) {
        if (this.f117333wkgbmnqykc == null) {
            this.f117333wkgbmnqykc = zdlpuopuiu.lqeggnwhkg(kcexrzcfytVar);
        }
        kcexrzcfyt kcexrzcfytVar3 = this.f117333wkgbmnqykc;
        if (kcexrzcfytVar3 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("targetVector");
            kcexrzcfytVar3 = null;
        }
        int iZoijcleaow = kcexrzcfytVar3.zoijcleaow();
        for (int i13 = 0; i13 < iZoijcleaow; i13++) {
            kcexrzcfyt kcexrzcfytVar4 = this.f117333wkgbmnqykc;
            if (kcexrzcfytVar4 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("targetVector");
                kcexrzcfytVar4 = null;
            }
            kcexrzcfytVar4.eablkybsjg(i13, this.f117331iobyxmoadg.wkgbmnqykc(kcexrzcfytVar.iobyxmoadg(i13), kcexrzcfytVar2.iobyxmoadg(i13)));
        }
        kcexrzcfyt kcexrzcfytVar5 = this.f117333wkgbmnqykc;
        if (kcexrzcfytVar5 != null) {
            return kcexrzcfytVar5;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("targetVector");
        return null;
    }
}
