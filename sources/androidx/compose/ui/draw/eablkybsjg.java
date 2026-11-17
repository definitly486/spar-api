package androidx.compose.ui.draw;

import androidx.compose.ui.layout.kcexrzcfyt;
import g.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.jyumaefscl;
import tg.draadjrbmk;
import w0.agtfadlqog;
import w0.oxmwwwfdhm;
import x.istkbnxepw;
import x.pmvmpeiblj;
import x.stevsuqkhv;
import x.wflxmlrfwp;
import z.yadqdtsiqt;
import z.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements yadqdtsiqt, zdlpuopuiu {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private androidx.compose.ui.graphics.wkgbmnqykc f6162cllcsxoeiz;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private a.eablkybsjg f6163hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private float f6164hkdspvbjdz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private x.gxszxtbevo f6165jpowsppfya;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f6166pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private l.ppxfxbqfkf f6167ylkuphrtab;

    static final class iobyxmoadg extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kcexrzcfyt f6168zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(kcexrzcfyt kcexrzcfytVar) {
            super(1);
            this.f6168zdlpuopuiu = kcexrzcfytVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((kcexrzcfyt.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
            kcexrzcfyt.iobyxmoadg.cllcsxoeiz(iobyxmoadgVar, this.f6168zdlpuopuiu, 0, 0, 0.0f, 4, null);
        }
    }

    public eablkybsjg(l.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, a.eablkybsjg eablkybsjgVar, x.gxszxtbevo gxszxtbevoVar, float f13, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar) {
        this.f6167ylkuphrtab = ppxfxbqfkfVar;
        this.f6166pkzmftpjix = z13;
        this.f6163hcddaimhww = eablkybsjgVar;
        this.f6165jpowsppfya = gxszxtbevoVar;
        this.f6164hkdspvbjdz = f13;
        this.f6162cllcsxoeiz = wkgbmnqykcVar;
    }

    private final long H0(long j13) {
        if (!K0()) {
            return j13;
        }
        long jWkgbmnqykc = gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(!M0(this.f6167ylkuphrtab.nufgyqmvbu()) ? Float.intBitsToFloat((int) (j13 >> 32)) : Float.intBitsToFloat((int) (this.f6167ylkuphrtab.nufgyqmvbu() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!L0(this.f6167ylkuphrtab.nufgyqmvbu()) ? Float.intBitsToFloat((int) (j13 & 4294967295L)) : Float.intBitsToFloat((int) (this.f6167ylkuphrtab.nufgyqmvbu() & 4294967295L)))) & 4294967295L));
        return (Float.intBitsToFloat((int) (j13 >> 32)) == 0.0f || Float.intBitsToFloat((int) (j13 & 4294967295L)) == 0.0f) ? gtknphoqwx.f35588zoijcleaow.zoijcleaow() : stevsuqkhv.iobyxmoadg(jWkgbmnqykc, this.f6165jpowsppfya.iobyxmoadg(jWkgbmnqykc, j13));
    }

    private final boolean K0() {
        return this.f6166pkzmftpjix && this.f6167ylkuphrtab.nufgyqmvbu() != 9205357640488583168L;
    }

    private final boolean L0(long j13) {
        return !gtknphoqwx.nufgyqmvbu(j13, gtknphoqwx.f35588zoijcleaow.iobyxmoadg()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j13 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    private final boolean M0(long j13) {
        return !gtknphoqwx.nufgyqmvbu(j13, gtknphoqwx.f35588zoijcleaow.iobyxmoadg()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j13 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    private final long N0(long j13) {
        boolean z13 = false;
        boolean z14 = w0.zoijcleaow.nufgyqmvbu(j13) && w0.zoijcleaow.lqeggnwhkg(j13);
        if (w0.zoijcleaow.btonecajqb(j13) && w0.zoijcleaow.dxjokdxxww(j13)) {
            z13 = true;
        }
        if ((!K0() && z14) || z13) {
            return w0.zoijcleaow.wkgbmnqykc(j13, w0.zoijcleaow.draadjrbmk(j13), 0, w0.zoijcleaow.gtknphoqwx(j13), 0, 10, null);
        }
        long jNufgyqmvbu = this.f6167ylkuphrtab.nufgyqmvbu();
        long jH0 = H0(gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(w0.ppxfxbqfkf.lqeggnwhkg(j13, M0(jNufgyqmvbu) ? Math.round(Float.intBitsToFloat((int) (jNufgyqmvbu >> 32))) : w0.zoijcleaow.agtfadlqog(j13)))) << 32) | (((long) Float.floatToRawIntBits(w0.ppxfxbqfkf.gxszxtbevo(j13, L0(jNufgyqmvbu) ? Math.round(Float.intBitsToFloat((int) (jNufgyqmvbu & 4294967295L))) : w0.zoijcleaow.wflxmlrfwp(j13)))) & 4294967295L)));
        return w0.zoijcleaow.wkgbmnqykc(j13, w0.ppxfxbqfkf.lqeggnwhkg(j13, Math.round(Float.intBitsToFloat((int) (jH0 >> 32)))), 0, w0.ppxfxbqfkf.gxszxtbevo(j13, Math.round(Float.intBitsToFloat((int) (jH0 & 4294967295L)))), 0, 10, null);
    }

    public final l.ppxfxbqfkf I0() {
        return this.f6167ylkuphrtab;
    }

    public final boolean J0() {
        return this.f6166pkzmftpjix;
    }

    public final void O0(a.eablkybsjg eablkybsjgVar) {
        this.f6163hcddaimhww = eablkybsjgVar;
    }

    public final void P0(x.gxszxtbevo gxszxtbevoVar) {
        this.f6165jpowsppfya = gxszxtbevoVar;
    }

    public final void Q0(l.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f6167ylkuphrtab = ppxfxbqfkfVar;
    }

    public final void R0(boolean z13) {
        this.f6166pkzmftpjix = z13;
    }

    @Override // z.yadqdtsiqt
    public int cdpycssgdh(wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        if (!K0()) {
            return draadjrbmkVar.czzsidtyhn(i13);
        }
        long jN0 = N0(w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, i13, 7, null));
        return Math.max(w0.zoijcleaow.agtfadlqog(jN0), draadjrbmkVar.czzsidtyhn(i13));
    }

    public final void eablkybsjg(float f13) {
        this.f6164hkdspvbjdz = f13;
    }

    @Override // z.zdlpuopuiu
    public void gtknphoqwx(j.ppxfxbqfkf ppxfxbqfkfVar) {
        long jNufgyqmvbu = this.f6167ylkuphrtab.nufgyqmvbu();
        float fIntBitsToFloat = M0(jNufgyqmvbu) ? Float.intBitsToFloat((int) (jNufgyqmvbu >> 32)) : Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow() >> 32));
        long jWkgbmnqykc = gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(L0(jNufgyqmvbu) ? Float.intBitsToFloat((int) (jNufgyqmvbu & 4294967295L)) : Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        long jZoijcleaow = (Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow() >> 32)) == 0.0f || Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow() & 4294967295L)) == 0.0f) ? gtknphoqwx.f35588zoijcleaow.zoijcleaow() : stevsuqkhv.iobyxmoadg(jWkgbmnqykc, this.f6165jpowsppfya.iobyxmoadg(jWkgbmnqykc, ppxfxbqfkfVar.zoijcleaow()));
        long jIobyxmoadg = this.f6163hcddaimhww.iobyxmoadg(oxmwwwfdhm.ppxfxbqfkf((((long) Math.round(Float.intBitsToFloat((int) (jZoijcleaow & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (jZoijcleaow >> 32)))) << 32)), oxmwwwfdhm.ppxfxbqfkf((((long) Math.round(Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow() & 4294967295L)))) & 4294967295L)), ppxfxbqfkfVar.getLayoutDirection());
        float fDxjokdxxww = agtfadlqog.dxjokdxxww(jIobyxmoadg);
        float fBtonecajqb = agtfadlqog.btonecajqb(jIobyxmoadg);
        ppxfxbqfkfVar.K().wkgbmnqykc().wkgbmnqykc(fDxjokdxxww, fBtonecajqb);
        try {
            this.f6167ylkuphrtab.lqeggnwhkg(ppxfxbqfkfVar, jZoijcleaow, this.f6164hkdspvbjdz, this.f6162cllcsxoeiz);
            ppxfxbqfkfVar.K().wkgbmnqykc().wkgbmnqykc(-fDxjokdxxww, -fBtonecajqb);
            ppxfxbqfkfVar.b0();
        } catch (Throwable th2) {
            ppxfxbqfkfVar.K().wkgbmnqykc().wkgbmnqykc(-fDxjokdxxww, -fBtonecajqb);
            throw th2;
        }
    }

    @Override // z.yadqdtsiqt
    public istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, pmvmpeiblj pmvmpeibljVar, long j13) {
        kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(N0(j13));
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new iobyxmoadg(kcexrzcfytVarSflfametgt), 4, null);
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public boolean l0() {
        return false;
    }

    @Override // z.yadqdtsiqt
    public int lmojexxdyd(wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        if (!K0()) {
            return draadjrbmkVar.ydmasvzmpa(i13);
        }
        long jN0 = N0(w0.ppxfxbqfkf.zoijcleaow(0, 0, 0, i13, 7, null));
        return Math.max(w0.zoijcleaow.agtfadlqog(jN0), draadjrbmkVar.ydmasvzmpa(i13));
    }

    @Override // z.yadqdtsiqt
    public int lqeggnwhkg(wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        if (!K0()) {
            return draadjrbmkVar.yggfygwlhe(i13);
        }
        long jN0 = N0(w0.ppxfxbqfkf.zoijcleaow(0, i13, 0, 0, 13, null));
        return Math.max(w0.zoijcleaow.wflxmlrfwp(jN0), draadjrbmkVar.yggfygwlhe(i13));
    }

    @Override // z.yadqdtsiqt
    public int oxmwwwfdhm(wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        if (!K0()) {
            return draadjrbmkVar.wypolnanlu(i13);
        }
        long jN0 = N0(w0.ppxfxbqfkf.zoijcleaow(0, i13, 0, 0, 13, null));
        return Math.max(w0.zoijcleaow.wflxmlrfwp(jN0), draadjrbmkVar.wypolnanlu(i13));
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f6167ylkuphrtab + ", sizeToIntrinsics=" + this.f6166pkzmftpjix + ", alignment=" + this.f6163hcddaimhww + ", alpha=" + this.f6164hkdspvbjdz + ", colorFilter=" + this.f6162cllcsxoeiz + ')';
    }

    public final void wkgbmnqykc(androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar) {
        this.f6162cllcsxoeiz = wkgbmnqykcVar;
    }
}
