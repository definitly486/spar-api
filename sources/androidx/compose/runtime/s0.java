package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 extends yzdjzghtvl.pmvmpeiblj implements auzgnhcxok, yzdjzghtvl.wflxmlrfwp {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private iobyxmoadg f5933yggfygwlhe;

    private static final class iobyxmoadg extends yzdjzghtvl.zynmafqrjb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private long f5934ppxfxbqfkf;

        public iobyxmoadg(long j13, long j14) {
            super(j13);
            this.f5934ppxfxbqfkf = j14;
        }

        public final void btonecajqb(long j13) {
            this.f5934ppxfxbqfkf = j13;
        }

        public final long dxjokdxxww() {
            return this.f5934ppxfxbqfkf;
        }

        @Override // yzdjzghtvl.zynmafqrjb
        public void ppxfxbqfkf(yzdjzghtvl.zynmafqrjb zynmafqrjbVar) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f5934ppxfxbqfkf = ((iobyxmoadg) zynmafqrjbVar).f5934ppxfxbqfkf;
        }

        @Override // yzdjzghtvl.zynmafqrjb
        public yzdjzghtvl.zynmafqrjb wkgbmnqykc(long j13) {
            return new iobyxmoadg(j13, this.f5934ppxfxbqfkf);
        }
    }

    public s0(long j13) {
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarHkdspvbjdz = androidx.compose.runtime.snapshots.btonecajqb.hkdspvbjdz();
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(lqeggnwhkgVarHkdspvbjdz.dxjokdxxww(), j13);
        if (!(lqeggnwhkgVarHkdspvbjdz instanceof androidx.compose.runtime.snapshots.iobyxmoadg)) {
            iobyxmoadgVar.lqeggnwhkg(new iobyxmoadg(yzdjzghtvl.nufgyqmvbu.ppxfxbqfkf(1), j13));
        }
        this.f5933yggfygwlhe = iobyxmoadgVar;
    }

    @Override // yzdjzghtvl.lereixgezr
    public void cllcsxoeiz(yzdjzghtvl.zynmafqrjb zynmafqrjbVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f5933yggfygwlhe = (iobyxmoadg) zynmafqrjbVar;
    }

    @Override // yzdjzghtvl.wflxmlrfwp
    public u0 eablkybsjg() {
        return v0.rgvfuqvkyq();
    }

    @Override // yzdjzghtvl.lereixgezr
    /* JADX INFO: renamed from: iozdgvuglv */
    public yzdjzghtvl.zynmafqrjb getFirstStateRecord() {
        return this.f5933yggfygwlhe;
    }

    @Override // androidx.compose.runtime.auzgnhcxok, androidx.compose.runtime.bfopjjpdmp
    public long ppxfxbqfkf() {
        return ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.jztzpxfvev(this.f5933yggfygwlhe, this)).dxjokdxxww();
    }

    public String toString() {
        return "MutableLongState(value=" + ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.hcddaimhww(this.f5933yggfygwlhe)).dxjokdxxww() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.auzgnhcxok
    public void tzroggbefp(long j13) {
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.hcddaimhww(this.f5933yggfygwlhe);
        if (iobyxmoadgVar.dxjokdxxww() != j13) {
            iobyxmoadg iobyxmoadgVar2 = this.f5933yggfygwlhe;
            synchronized (androidx.compose.runtime.snapshots.btonecajqb.dsvhmnatus()) {
                lqeggnwhkgVarPpxfxbqfkf = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.ribwqtqdhb(iobyxmoadgVar2, this, lqeggnwhkgVarPpxfxbqfkf, iobyxmoadgVar)).btonecajqb(j13);
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            androidx.compose.runtime.snapshots.btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
        }
    }

    @Override // yzdjzghtvl.lereixgezr
    public yzdjzghtvl.zynmafqrjb ylkuphrtab(yzdjzghtvl.zynmafqrjb zynmafqrjbVar, yzdjzghtvl.zynmafqrjb zynmafqrjbVar2, yzdjzghtvl.zynmafqrjb zynmafqrjbVar3) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((iobyxmoadg) zynmafqrjbVar2).dxjokdxxww() == ((iobyxmoadg) zynmafqrjbVar3).dxjokdxxww()) {
            return zynmafqrjbVar2;
        }
        return null;
    }
}
