package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 extends yzdjzghtvl.pmvmpeiblj implements uawqvzlxes, yzdjzghtvl.wflxmlrfwp {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private iobyxmoadg f5925yggfygwlhe;

    private static final class iobyxmoadg extends yzdjzghtvl.zynmafqrjb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f5926ppxfxbqfkf;

        public iobyxmoadg(long j13, int i13) {
            super(j13);
            this.f5926ppxfxbqfkf = i13;
        }

        public final void btonecajqb(int i13) {
            this.f5926ppxfxbqfkf = i13;
        }

        public final int dxjokdxxww() {
            return this.f5926ppxfxbqfkf;
        }

        @Override // yzdjzghtvl.zynmafqrjb
        public void ppxfxbqfkf(yzdjzghtvl.zynmafqrjb zynmafqrjbVar) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.f5926ppxfxbqfkf = ((iobyxmoadg) zynmafqrjbVar).f5926ppxfxbqfkf;
        }

        @Override // yzdjzghtvl.zynmafqrjb
        public yzdjzghtvl.zynmafqrjb wkgbmnqykc(long j13) {
            return new iobyxmoadg(j13, this.f5926ppxfxbqfkf);
        }
    }

    public r0(int i13) {
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarHkdspvbjdz = androidx.compose.runtime.snapshots.btonecajqb.hkdspvbjdz();
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(lqeggnwhkgVarHkdspvbjdz.dxjokdxxww(), i13);
        if (!(lqeggnwhkgVarHkdspvbjdz instanceof androidx.compose.runtime.snapshots.iobyxmoadg)) {
            iobyxmoadgVar.lqeggnwhkg(new iobyxmoadg(yzdjzghtvl.nufgyqmvbu.ppxfxbqfkf(1), i13));
        }
        this.f5925yggfygwlhe = iobyxmoadgVar;
    }

    @Override // androidx.compose.runtime.uawqvzlxes
    public void btonecajqb(int i13) {
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.hcddaimhww(this.f5925yggfygwlhe);
        if (iobyxmoadgVar.dxjokdxxww() != i13) {
            iobyxmoadg iobyxmoadgVar2 = this.f5925yggfygwlhe;
            synchronized (androidx.compose.runtime.snapshots.btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.ribwqtqdhb(iobyxmoadgVar2, this, lqeggnwhkgVarPpxfxbqfkf, iobyxmoadgVar)).btonecajqb(i13);
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            androidx.compose.runtime.snapshots.btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        }
    }

    @Override // yzdjzghtvl.lereixgezr
    public void cllcsxoeiz(yzdjzghtvl.zynmafqrjb zynmafqrjbVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f5925yggfygwlhe = (iobyxmoadg) zynmafqrjbVar;
    }

    @Override // yzdjzghtvl.wflxmlrfwp
    public u0 eablkybsjg() {
        return v0.rgvfuqvkyq();
    }

    @Override // androidx.compose.runtime.uawqvzlxes, androidx.compose.runtime.metgxyhuhe
    public int gxszxtbevo() {
        return ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.jztzpxfvev(this.f5925yggfygwlhe, this)).dxjokdxxww();
    }

    @Override // yzdjzghtvl.lereixgezr
    /* JADX INFO: renamed from: iozdgvuglv */
    public yzdjzghtvl.zynmafqrjb getFirstStateRecord() {
        return this.f5925yggfygwlhe;
    }

    public String toString() {
        return "MutableIntState(value=" + ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.hcddaimhww(this.f5925yggfygwlhe)).dxjokdxxww() + ")@" + hashCode();
    }

    @Override // yzdjzghtvl.lereixgezr
    public yzdjzghtvl.zynmafqrjb ylkuphrtab(yzdjzghtvl.zynmafqrjb zynmafqrjbVar, yzdjzghtvl.zynmafqrjb zynmafqrjbVar2, yzdjzghtvl.zynmafqrjb zynmafqrjbVar3) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((iobyxmoadg) zynmafqrjbVar2).dxjokdxxww() == ((iobyxmoadg) zynmafqrjbVar3).dxjokdxxww()) {
            return zynmafqrjbVar2;
        }
        return null;
    }
}
