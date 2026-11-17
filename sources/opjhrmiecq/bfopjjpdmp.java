package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
final class bfopjjpdmp implements x.jyumaefscl {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final tg.iobyxmoadg f73480eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f73481ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final p0.jhduphickx f73482wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final j0 f73483zoijcleaow;

    public bfopjjpdmp(j0 j0Var, int i13, p0.jhduphickx jhduphickxVar, tg.iobyxmoadg iobyxmoadgVar) {
        this.f73483zoijcleaow = j0Var;
        this.f73481ppxfxbqfkf = i13;
        this.f73482wkgbmnqykc = jhduphickxVar;
        this.f73480eablkybsjg = iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(bfopjjpdmp bfopjjpdmpVar, androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i13, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        int i14 = bfopjjpdmpVar.f73481ppxfxbqfkf;
        p0.jhduphickx jhduphickxVar = bfopjjpdmpVar.f73482wkgbmnqykc;
        p0 p0Var = (p0) bfopjjpdmpVar.f73480eablkybsjg.invoke();
        bfopjjpdmpVar.f73483zoijcleaow.ojitshcjhn(jztzpxfvev.jlmebxxoox.Horizontal, c0.ppxfxbqfkf(iobyxmoadgVar, i14, jhduphickxVar, p0Var != null ? p0Var.gxszxtbevo() : null, draadjrbmkVar.getLayoutDirection() == w0.zdlpuopuiu.Rtl, kcexrzcfytVar.eslsurpljm()), i13, kcexrzcfytVar.eslsurpljm());
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, kcexrzcfytVar, Math.round(-bfopjjpdmpVar.f73483zoijcleaow.nufgyqmvbu()), 0, 0.0f, 4, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfopjjpdmp)) {
            return false;
        }
        bfopjjpdmp bfopjjpdmpVar = (bfopjjpdmp) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f73483zoijcleaow, bfopjjpdmpVar.f73483zoijcleaow) && this.f73481ppxfxbqfkf == bfopjjpdmpVar.f73481ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f73482wkgbmnqykc, bfopjjpdmpVar.f73482wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f73480eablkybsjg, bfopjjpdmpVar.f73480eablkybsjg);
    }

    @Override // x.jyumaefscl
    public x.istkbnxepw gxszxtbevo(final androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(pmvmpeibljVar.ydmasvzmpa(w0.zoijcleaow.gtknphoqwx(j13)) < w0.zoijcleaow.draadjrbmk(j13) ? j13 : w0.zoijcleaow.wkgbmnqykc(j13, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int iMin = Math.min(kcexrzcfytVarSflfametgt.eslsurpljm(), w0.zoijcleaow.draadjrbmk(j13));
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, iMin, kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new tg.draadjrbmk() { // from class: opjhrmiecq.oipsdeybqn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return bfopjjpdmp.draadjrbmk(this.f73850zdlpuopuiu, draadjrbmkVar, kcexrzcfytVarSflfametgt, iMin, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    public int hashCode() {
        return (((((this.f73483zoijcleaow.hashCode() * 31) + Integer.hashCode(this.f73481ppxfxbqfkf)) * 31) + this.f73482wkgbmnqykc.hashCode()) * 31) + this.f73480eablkybsjg.hashCode();
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f73483zoijcleaow + ", cursorOffset=" + this.f73481ppxfxbqfkf + ", transformedText=" + this.f73482wkgbmnqykc + ", textLayoutResultProvider=" + this.f73480eablkybsjg + ')';
    }
}
