package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 extends yzdjzghtvl.pmvmpeiblj implements yzdjzghtvl.wflxmlrfwp {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private iobyxmoadg f6052jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final u0 f6053yggfygwlhe;

    private static final class iobyxmoadg extends yzdjzghtvl.zynmafqrjb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Object f6054ppxfxbqfkf;

        public iobyxmoadg(long j13, Object obj) {
            super(j13);
            this.f6054ppxfxbqfkf = obj;
        }

        public final Object btonecajqb() {
            return this.f6054ppxfxbqfkf;
        }

        @Override // yzdjzghtvl.zynmafqrjb
        /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg wkgbmnqykc(long j13) {
            return new iobyxmoadg(androidx.compose.runtime.snapshots.btonecajqb.hkdspvbjdz().dxjokdxxww(), this.f6054ppxfxbqfkf);
        }

        public final void gtknphoqwx(Object obj) {
            this.f6054ppxfxbqfkf = obj;
        }

        @Override // yzdjzghtvl.zynmafqrjb
        public void ppxfxbqfkf(yzdjzghtvl.zynmafqrjb zynmafqrjbVar) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f6054ppxfxbqfkf = ((iobyxmoadg) zynmafqrjbVar).f6054ppxfxbqfkf;
        }
    }

    public t0(Object obj, u0 u0Var) {
        this.f6053yggfygwlhe = u0Var;
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarHkdspvbjdz = androidx.compose.runtime.snapshots.btonecajqb.hkdspvbjdz();
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(lqeggnwhkgVarHkdspvbjdz.dxjokdxxww(), obj);
        if (!(lqeggnwhkgVarHkdspvbjdz instanceof androidx.compose.runtime.snapshots.iobyxmoadg)) {
            iobyxmoadgVar.lqeggnwhkg(new iobyxmoadg(yzdjzghtvl.nufgyqmvbu.ppxfxbqfkf(1), obj));
        }
        this.f6052jyumaefscl = iobyxmoadgVar;
    }

    @Override // yzdjzghtvl.lereixgezr
    public void cllcsxoeiz(yzdjzghtvl.zynmafqrjb zynmafqrjbVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f6052jyumaefscl = (iobyxmoadg) zynmafqrjbVar;
    }

    @Override // yzdjzghtvl.wflxmlrfwp
    public u0 eablkybsjg() {
        return this.f6053yggfygwlhe;
    }

    @Override // androidx.compose.runtime.iwxlajgraz, androidx.compose.runtime.i1
    public Object getValue() {
        return ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.jztzpxfvev(this.f6052jyumaefscl, this)).btonecajqb();
    }

    @Override // yzdjzghtvl.lereixgezr
    /* JADX INFO: renamed from: iozdgvuglv */
    public yzdjzghtvl.zynmafqrjb getFirstStateRecord() {
        return this.f6052jyumaefscl;
    }

    @Override // androidx.compose.runtime.iwxlajgraz
    public void setValue(Object obj) {
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf;
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.hcddaimhww(this.f6052jyumaefscl);
        if (eablkybsjg().zoijcleaow(iobyxmoadgVar.btonecajqb(), obj)) {
            return;
        }
        iobyxmoadg iobyxmoadgVar2 = this.f6052jyumaefscl;
        synchronized (androidx.compose.runtime.snapshots.btonecajqb.dsvhmnatus()) {
            lqeggnwhkgVarPpxfxbqfkf = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
            ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.ribwqtqdhb(iobyxmoadgVar2, this, lqeggnwhkgVarPpxfxbqfkf, iobyxmoadgVar)).gtknphoqwx(obj);
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        androidx.compose.runtime.snapshots.btonecajqb.crxdokpmqz(lqeggnwhkgVarPpxfxbqfkf, this);
    }

    public String toString() {
        return "MutableState(value=" + ((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.hcddaimhww(this.f6052jyumaefscl)).btonecajqb() + ")@" + hashCode();
    }

    @Override // yzdjzghtvl.lereixgezr
    public yzdjzghtvl.zynmafqrjb ylkuphrtab(yzdjzghtvl.zynmafqrjb zynmafqrjbVar, yzdjzghtvl.zynmafqrjb zynmafqrjbVar2, yzdjzghtvl.zynmafqrjb zynmafqrjbVar3) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) zynmafqrjbVar;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) zynmafqrjbVar2;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        iobyxmoadg iobyxmoadgVar3 = (iobyxmoadg) zynmafqrjbVar3;
        if (eablkybsjg().zoijcleaow(iobyxmoadgVar2.btonecajqb(), iobyxmoadgVar3.btonecajqb())) {
            return zynmafqrjbVar2;
        }
        Object objIobyxmoadg = eablkybsjg().iobyxmoadg(iobyxmoadgVar.btonecajqb(), iobyxmoadgVar2.btonecajqb(), iobyxmoadgVar3.btonecajqb());
        if (objIobyxmoadg == null) {
            return null;
        }
        iobyxmoadg iobyxmoadgVarWkgbmnqykc = iobyxmoadgVar3.wkgbmnqykc(iobyxmoadgVar3.gxszxtbevo());
        iobyxmoadgVarWkgbmnqykc.gtknphoqwx(objIobyxmoadg);
        return iobyxmoadgVarWkgbmnqykc;
    }
}
