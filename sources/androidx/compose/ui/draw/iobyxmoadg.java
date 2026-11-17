package androidx.compose.ui.draw;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e.nufgyqmvbu;
import gg.wwaezpbzkn;
import h.auzgnhcxok;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import w0.kcexrzcfyt;
import z.gtknphoqwx;
import z.rlfsiqarku;
import z.ydmasvzmpa;
import z.yfnezrywwk;
import z.yggfygwlhe;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements e.ppxfxbqfkf, yfnezrywwk, e.zoijcleaow {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private gxszxtbevo f6171hcddaimhww;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private draadjrbmk f6172jpowsppfya;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f6173pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final e.wkgbmnqykc f6174ylkuphrtab;

    /* JADX INFO: renamed from: androidx.compose.ui.draw.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0109iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {
        C0109iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final auzgnhcxok invoke() {
            return iobyxmoadg.this.I0();
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ e.wkgbmnqykc f6176yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(e.wkgbmnqykc wkgbmnqykcVar) {
            super(0);
            this.f6176yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            iobyxmoadg.this.H0().invoke(this.f6176yggfygwlhe);
        }
    }

    public iobyxmoadg(e.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar) {
        this.f6174ylkuphrtab = wkgbmnqykcVar;
        this.f6172jpowsppfya = draadjrbmkVar;
        wkgbmnqykcVar.gtknphoqwx(this);
        wkgbmnqykcVar.oxmwwwfdhm(new C0109iobyxmoadg());
    }

    private final nufgyqmvbu J0(j.ppxfxbqfkf ppxfxbqfkfVar) {
        if (!this.f6173pkzmftpjix) {
            e.wkgbmnqykc wkgbmnqykcVar = this.f6174ylkuphrtab;
            wkgbmnqykcVar.agtfadlqog(null);
            wkgbmnqykcVar.wflxmlrfwp(ppxfxbqfkfVar);
            ydmasvzmpa.iobyxmoadg(this, new zoijcleaow(wkgbmnqykcVar));
            if (wkgbmnqykcVar.gxszxtbevo() == null) {
                w.iobyxmoadg.ppxfxbqfkf("DrawResult not defined, did you forget to call onDraw?");
                throw new KotlinNothingValueException();
            }
            this.f6173pkzmftpjix = true;
        }
        nufgyqmvbu nufgyqmvbuVarGxszxtbevo = this.f6174ylkuphrtab.gxszxtbevo();
        zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVarGxszxtbevo);
        return nufgyqmvbuVarGxszxtbevo;
    }

    public final draadjrbmk H0() {
        return this.f6172jpowsppfya;
    }

    public final auzgnhcxok I0() {
        gxszxtbevo gxszxtbevoVar = this.f6171hcddaimhww;
        if (gxszxtbevoVar == null) {
            gxszxtbevoVar = new gxszxtbevo();
            this.f6171hcddaimhww = gxszxtbevoVar;
        }
        if (gxszxtbevoVar.ppxfxbqfkf() == null) {
            gxszxtbevoVar.eablkybsjg(gtknphoqwx.wflxmlrfwp(this));
        }
        return gxszxtbevoVar;
    }

    public final void K0(draadjrbmk draadjrbmkVar) {
        this.f6172jpowsppfya = draadjrbmkVar;
        e();
    }

    @Override // e.ppxfxbqfkf
    public void e() {
        gxszxtbevo gxszxtbevoVar = this.f6171hcddaimhww;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.wkgbmnqykc();
        }
        this.f6173pkzmftpjix = false;
        this.f6174ylkuphrtab.agtfadlqog(null);
        yggfygwlhe.iobyxmoadg(this);
    }

    @Override // e.zoijcleaow
    public w0.wkgbmnqykc getDensity() {
        return gtknphoqwx.draadjrbmk(this);
    }

    @Override // e.zoijcleaow
    public w0.zdlpuopuiu getLayoutDirection() {
        return gtknphoqwx.ojitshcjhn(this);
    }

    @Override // z.zdlpuopuiu
    public void gtknphoqwx(j.ppxfxbqfkf ppxfxbqfkfVar) {
        J0(ppxfxbqfkfVar).iobyxmoadg().invoke(ppxfxbqfkfVar);
    }

    @Override // z.yfnezrywwk
    public void igdgnonuha() {
        e();
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void r0() {
        super.r0();
        gxszxtbevo gxszxtbevoVar = this.f6171hcddaimhww;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.wkgbmnqykc();
        }
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void s0() {
        super.s0();
        e();
    }

    @Override // z.zdlpuopuiu
    public void v() {
        e();
    }

    @Override // z.btonecajqb
    public void yadqdtsiqt() {
        e();
    }

    @Override // z.btonecajqb
    public void zfvoamnweg() {
        e();
    }

    @Override // e.zoijcleaow
    public long zoijcleaow() {
        return kcexrzcfyt.wkgbmnqykc(gtknphoqwx.gtknphoqwx(this, rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_PATTERN)).iobyxmoadg());
    }
}
