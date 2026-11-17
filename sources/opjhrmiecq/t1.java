package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
final class t1 implements x.jyumaefscl {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final tg.iobyxmoadg f73964eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f73965ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final p0.jhduphickx f73966wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final j0 f73967zoijcleaow;

    public t1(j0 j0Var, int i13, p0.jhduphickx jhduphickxVar, tg.iobyxmoadg iobyxmoadgVar) {
        this.f73967zoijcleaow = j0Var;
        this.f73965ppxfxbqfkf = i13;
        this.f73966wkgbmnqykc = jhduphickxVar;
        this.f73964eablkybsjg = iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(t1 t1Var, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i13, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        int i14 = t1Var.f73965ppxfxbqfkf;
        p0.jhduphickx jhduphickxVar = t1Var.f73966wkgbmnqykc;
        p0 p0Var = (p0) t1Var.f73964eablkybsjg.invoke();
        t1Var.f73967zoijcleaow.ojitshcjhn(jztzpxfvev.jlmebxxoox.Vertical, c0.ppxfxbqfkf(iobyxmoadgVar, i14, jhduphickxVar, p0Var != null ? p0Var.gxszxtbevo() : null, false, kcexrzcfytVar.eslsurpljm()), i13, kcexrzcfytVar.ipoelvxyzq());
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, kcexrzcfytVar, 0, Math.round(-t1Var.f73967zoijcleaow.nufgyqmvbu()), 0.0f, 4, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f73967zoijcleaow, t1Var.f73967zoijcleaow) && this.f73965ppxfxbqfkf == t1Var.f73965ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f73966wkgbmnqykc, t1Var.f73966wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f73964eablkybsjg, t1Var.f73964eablkybsjg);
    }

    @Override // x.jyumaefscl
    public x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(w0.zoijcleaow.wkgbmnqykc(j13, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int iMin = Math.min(kcexrzcfytVarSflfametgt.ipoelvxyzq(), w0.zoijcleaow.gtknphoqwx(j13));
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), iMin, null, new tg.draadjrbmk() { // from class: opjhrmiecq.s1
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return t1.draadjrbmk(this.f73952zdlpuopuiu, kcexrzcfytVarSflfametgt, iMin, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    public int hashCode() {
        return (((((this.f73967zoijcleaow.hashCode() * 31) + Integer.hashCode(this.f73965ppxfxbqfkf)) * 31) + this.f73966wkgbmnqykc.hashCode()) * 31) + this.f73964eablkybsjg.hashCode();
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f73967zoijcleaow + ", cursorOffset=" + this.f73965ppxfxbqfkf + ", transformedText=" + this.f73966wkgbmnqykc + ", textLayoutResultProvider=" + this.f73964eablkybsjg + ')';
    }
}
