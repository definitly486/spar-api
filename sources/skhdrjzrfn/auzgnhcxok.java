package skhdrjzrfn;

import java.util.List;
import opjhrmiecq.p0;

/* JADX INFO: loaded from: classes.dex */
public final class auzgnhcxok extends btonecajqb {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final p0.tzroggbefp f107331btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final p0 f107332gtknphoqwx;

    public auzgnhcxok(p0.tzroggbefp tzroggbefpVar, p0.ylkuphrtab ylkuphrtabVar, p0 p0Var, h hVar) {
        super(tzroggbefpVar.dxjokdxxww(), tzroggbefpVar.gtknphoqwx(), p0Var != null ? p0Var.gxszxtbevo() : null, ylkuphrtabVar, hVar, null);
        this.f107331btonecajqb = tzroggbefpVar;
        this.f107332gtknphoqwx = p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final int jhduphickx(p0 p0Var, int i13) {
        g.lqeggnwhkg lqeggnwhkgVarIobyxmoadg;
        x.rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = p0Var.ppxfxbqfkf();
        if (rgvfuqvkyqVarPpxfxbqfkf != null) {
            x.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = p0Var.zoijcleaow();
            lqeggnwhkgVarIobyxmoadg = rgvfuqvkyqVarZoijcleaow != null ? x.rgvfuqvkyq.cdpycssgdh(rgvfuqvkyqVarZoijcleaow, rgvfuqvkyqVarPpxfxbqfkf, false, 2, null) : null;
            if (lqeggnwhkgVarIobyxmoadg == null) {
                lqeggnwhkgVarIobyxmoadg = g.lqeggnwhkg.f35592eablkybsjg.iobyxmoadg();
            }
        } else {
            lqeggnwhkgVarIobyxmoadg = g.lqeggnwhkg.f35592eablkybsjg.iobyxmoadg();
        }
        g.lqeggnwhkg lqeggnwhkgVarEablkybsjg = p0Var.gxszxtbevo().eablkybsjg(rgvfuqvkyq().zoijcleaow(j0.l.dxjokdxxww(this.f107331btonecajqb.gtknphoqwx())));
        return rgvfuqvkyq().iobyxmoadg(p0Var.gxszxtbevo().cqumvgiudr(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(lqeggnwhkgVarEablkybsjg.nufgyqmvbu())) << 32) | (((long) Float.floatToRawIntBits(lqeggnwhkgVarEablkybsjg.gtknphoqwx() + (Float.intBitsToFloat((int) (lqeggnwhkgVarIobyxmoadg.btonecajqb() & 4294967295L)) * i13))) & 4294967295L))));
    }

    public final auzgnhcxok ikoacuggdj() {
        p0 p0Var;
        if (cqumvgiudr().length() > 0 && (p0Var = this.f107332gtknphoqwx) != null) {
            ntlheqmsrt(jhduphickx(p0Var, 1));
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final auzgnhcxok okpsazkaxt() {
        p0 p0Var;
        if (cqumvgiudr().length() > 0 && (p0Var = this.f107332gtknphoqwx) != null) {
            ntlheqmsrt(jhduphickx(p0Var, -1));
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final List ribwqtqdhb(tg.draadjrbmk draadjrbmkVar) {
        if (!j0.l.nufgyqmvbu(jyumaefscl())) {
            return hg.jyumaefscl.rgvfuqvkyq(new p0.iobyxmoadg("", 0), new p0.wypolnanlu(j0.l.draadjrbmk(jyumaefscl()), j0.l.draadjrbmk(jyumaefscl())));
        }
        p0.dxjokdxxww dxjokdxxwwVar = (p0.dxjokdxxww) draadjrbmkVar.invoke(this);
        if (dxjokdxxwwVar != null) {
            return hg.jyumaefscl.eablkybsjg(dxjokdxxwwVar);
        }
        return null;
    }

    public final p0.tzroggbefp vipkmwdibw() {
        return p0.tzroggbefp.lqeggnwhkg(this.f107331btonecajqb, eablkybsjg(), jyumaefscl(), null, 4, null);
    }
}
