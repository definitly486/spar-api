package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 extends yzdjzghtvl.pmvmpeiblj implements roivzttewh, yzdjzghtvl.wflxmlrfwp {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private iobyxmoadg f5922yggfygwlhe;

    private static final class iobyxmoadg extends yzdjzghtvl.zynmafqrjb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private float f5923ppxfxbqfkf;

        public iobyxmoadg(long j13, float f13) {
            super(j13);
            this.f5923ppxfxbqfkf = f13;
        }

        public final void btonecajqb(float f13) {
            this.f5923ppxfxbqfkf = f13;
        }

        public final float dxjokdxxww() {
            return this.f5923ppxfxbqfkf;
        }

        @Override // yzdjzghtvl.zynmafqrjb
        public void ppxfxbqfkf(yzdjzghtvl.zynmafqrjb zynmafqrjbVar) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f5923ppxfxbqfkf = ((iobyxmoadg) zynmafqrjbVar).f5923ppxfxbqfkf;
        }

        @Override // yzdjzghtvl.zynmafqrjb
        public yzdjzghtvl.zynmafqrjb wkgbmnqykc(long j13) {
            return new iobyxmoadg(j13, this.f5923ppxfxbqfkf);
        }
    }

    public q0(float f13) {
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarHkdspvbjdz = androidx.compose.runtime.snapshots.btonecajqb.hkdspvbjdz();
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(lqeggnwhkgVarHkdspvbjdz.dxjokdxxww(), f13);
        if (!(lqeggnwhkgVarHkdspvbjdz instanceof androidx.compose.runtime.snapshots.iobyxmoadg)) {
            iobyxmoadgVar.lqeggnwhkg(new iobyxmoadg(yzdjzghtvl.nufgyqmvbu.ppxfxbqfkf(1), f13));
        }
        this.f5922yggfygwlhe = iobyxmoadgVar;
    }

    @Override // yzdjzghtvl.lereixgezr
    public void cllcsxoeiz(yzdjzghtvl.zynmafqrjb zynmafqrjbVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f5922yggfygwlhe = (iobyxmoadg) zynmafqrjbVar;
    }

    @Override // yzdjzghtvl.wflxmlrfwp
    public u0 eablkybsjg() {
        return v0.rgvfuqvkyq();
    }

    @Override // yzdjzghtvl.lereixgezr
    /* JADX INFO: renamed from: iozdgvuglv */
    public yzdjzghtvl.zynmafqrjb getFirstStateRecord() {
        return this.f5922yggfygwlhe;
    }

    @Override // androidx.compose.runtime.roivzttewh
    public void pkzmftpjix(float f13) {
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.hcddaimhww(this.f5922yggfygwlhe);
        if (iobyxmoadgVar.dxjokdxxww() == f13) {
            return;
        }
        iobyxmoadg iobyxmoadgVar2 = this.f5922yggfygwlhe;
        synchronized (androidx.compose.runtime.snapshots.btonecajqb.dsvhmnatus()) {
            lqeggnwhkgVarPpxfxbqfkf = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
            ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.ribwqtqdhb(iobyxmoadgVar2, this, lqeggnwhkgVarPpxfxbqfkf, iobyxmoadgVar)).btonecajqb(f13);
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        androidx.compose.runtime.snapshots.btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
    }

    public String toString() {
        return "MutableFloatState(value=" + ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.hcddaimhww(this.f5922yggfygwlhe)).dxjokdxxww() + ")@" + hashCode();
    }

    @Override // yzdjzghtvl.lereixgezr
    public yzdjzghtvl.zynmafqrjb ylkuphrtab(yzdjzghtvl.zynmafqrjb zynmafqrjbVar, yzdjzghtvl.zynmafqrjb zynmafqrjbVar2, yzdjzghtvl.zynmafqrjb zynmafqrjbVar3) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((iobyxmoadg) zynmafqrjbVar2).dxjokdxxww() == ((iobyxmoadg) zynmafqrjbVar3).dxjokdxxww()) {
            return zynmafqrjbVar2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.roivzttewh, androidx.compose.runtime.ribwqtqdhb
    public float zoijcleaow() {
        return ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.jztzpxfvev(this.f5922yggfygwlhe, this)).dxjokdxxww();
    }
}
