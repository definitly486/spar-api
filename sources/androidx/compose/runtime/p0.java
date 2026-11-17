package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends yzdjzghtvl.pmvmpeiblj implements tbqsvytpvh, yzdjzghtvl.wflxmlrfwp {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private iobyxmoadg f5886yggfygwlhe;

    private static final class iobyxmoadg extends yzdjzghtvl.zynmafqrjb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private double f5887ppxfxbqfkf;

        public iobyxmoadg(long j13, double d13) {
            super(j13);
            this.f5887ppxfxbqfkf = d13;
        }

        public final void btonecajqb(double d13) {
            this.f5887ppxfxbqfkf = d13;
        }

        public final double dxjokdxxww() {
            return this.f5887ppxfxbqfkf;
        }

        @Override // yzdjzghtvl.zynmafqrjb
        public void ppxfxbqfkf(yzdjzghtvl.zynmafqrjb zynmafqrjbVar) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.f5887ppxfxbqfkf = ((iobyxmoadg) zynmafqrjbVar).f5887ppxfxbqfkf;
        }

        @Override // yzdjzghtvl.zynmafqrjb
        public yzdjzghtvl.zynmafqrjb wkgbmnqykc(long j13) {
            return new iobyxmoadg(j13, this.f5887ppxfxbqfkf);
        }
    }

    public p0(double d13) {
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarHkdspvbjdz = androidx.compose.runtime.snapshots.btonecajqb.hkdspvbjdz();
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(lqeggnwhkgVarHkdspvbjdz.dxjokdxxww(), d13);
        if (!(lqeggnwhkgVarHkdspvbjdz instanceof androidx.compose.runtime.snapshots.iobyxmoadg)) {
            iobyxmoadgVar.lqeggnwhkg(new iobyxmoadg(yzdjzghtvl.nufgyqmvbu.ppxfxbqfkf(1), d13));
        }
        this.f5886yggfygwlhe = iobyxmoadgVar;
    }

    @Override // yzdjzghtvl.lereixgezr
    public void cllcsxoeiz(yzdjzghtvl.zynmafqrjb zynmafqrjbVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.f5886yggfygwlhe = (iobyxmoadg) zynmafqrjbVar;
    }

    @Override // yzdjzghtvl.wflxmlrfwp
    public u0 eablkybsjg() {
        return v0.rgvfuqvkyq();
    }

    @Override // androidx.compose.runtime.tbqsvytpvh
    public void esjtqupxsv(double d13) {
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.hcddaimhww(this.f5886yggfygwlhe);
        if (iobyxmoadgVar.dxjokdxxww() == d13) {
            return;
        }
        iobyxmoadg iobyxmoadgVar2 = this.f5886yggfygwlhe;
        synchronized (androidx.compose.runtime.snapshots.btonecajqb.dsvhmnatus()) {
            lqeggnwhkgVarPpxfxbqfkf = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
            ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.ribwqtqdhb(iobyxmoadgVar2, this, lqeggnwhkgVarPpxfxbqfkf, iobyxmoadgVar)).btonecajqb(d13);
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        androidx.compose.runtime.snapshots.btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
    }

    @Override // androidx.compose.runtime.tbqsvytpvh
    public double getDoubleValue() {
        return ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.jztzpxfvev(this.f5886yggfygwlhe, this)).dxjokdxxww();
    }

    @Override // yzdjzghtvl.lereixgezr
    public yzdjzghtvl.zynmafqrjb iozdgvuglv() {
        return this.f5886yggfygwlhe;
    }

    public String toString() {
        return "MutableDoubleState(value=" + ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.hcddaimhww(this.f5886yggfygwlhe)).dxjokdxxww() + ")@" + hashCode();
    }

    @Override // yzdjzghtvl.lereixgezr
    public yzdjzghtvl.zynmafqrjb ylkuphrtab(yzdjzghtvl.zynmafqrjb zynmafqrjbVar, yzdjzghtvl.zynmafqrjb zynmafqrjbVar2, yzdjzghtvl.zynmafqrjb zynmafqrjbVar3) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        if (((iobyxmoadg) zynmafqrjbVar2).dxjokdxxww() == ((iobyxmoadg) zynmafqrjbVar3).dxjokdxxww()) {
            return zynmafqrjbVar2;
        }
        return null;
    }
}
