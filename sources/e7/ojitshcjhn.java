package e7;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import coil.request.NullRequestDataException;
import pj.auzgnhcxok;

/* JADX INFO: loaded from: classes2.dex */
public final class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v6.wkgbmnqykc f30739iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final i7.ojitshcjhn f30740ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final i7.yggfygwlhe f30741zoijcleaow;

    public ojitshcjhn(v6.wkgbmnqykc wkgbmnqykcVar, i7.yggfygwlhe yggfygwlheVar, i7.kcexrzcfyt kcexrzcfytVar) {
        this.f30739iobyxmoadg = wkgbmnqykcVar;
        this.f30741zoijcleaow = yggfygwlheVar;
        this.f30740ppxfxbqfkf = i7.gxszxtbevo.iobyxmoadg(kcexrzcfytVar);
    }

    private final boolean eablkybsjg(nufgyqmvbu nufgyqmvbuVar) {
        return nufgyqmvbuVar.dsvhmnatus().isEmpty() || hg.agtfadlqog.okpsazkaxt(i7.gtknphoqwx.ojitshcjhn(), nufgyqmvbuVar.btonecajqb());
    }

    private final boolean wkgbmnqykc(nufgyqmvbu nufgyqmvbuVar, f7.dxjokdxxww dxjokdxxwwVar) {
        if (i7.iobyxmoadg.wkgbmnqykc(nufgyqmvbuVar.btonecajqb())) {
            return ppxfxbqfkf(nufgyqmvbuVar, nufgyqmvbuVar.btonecajqb()) && this.f30740ppxfxbqfkf.zoijcleaow(dxjokdxxwwVar);
        }
        return true;
    }

    public final draadjrbmk gxszxtbevo(nufgyqmvbu nufgyqmvbuVar, f7.dxjokdxxww dxjokdxxwwVar) {
        Bitmap.Config configBtonecajqb = (eablkybsjg(nufgyqmvbuVar) && wkgbmnqykc(nufgyqmvbuVar, dxjokdxxwwVar)) ? nufgyqmvbuVar.btonecajqb() : Bitmap.Config.ARGB_8888;
        zoijcleaow zoijcleaowVarCdpycssgdh = this.f30741zoijcleaow.zoijcleaow() ? nufgyqmvbuVar.cdpycssgdh() : zoijcleaow.DISABLED;
        f7.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = dxjokdxxwwVar.wkgbmnqykc();
        f7.ppxfxbqfkf.zoijcleaow zoijcleaowVar = f7.ppxfxbqfkf.zoijcleaow.f33045iobyxmoadg;
        return new draadjrbmk(nufgyqmvbuVar.draadjrbmk(), configBtonecajqb, nufgyqmvbuVar.gtknphoqwx(), dxjokdxxwwVar, (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarWkgbmnqykc, zoijcleaowVar) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dxjokdxxwwVar.ppxfxbqfkf(), zoijcleaowVar)) ? f7.nufgyqmvbu.FIT : nufgyqmvbuVar.pkzmftpjix(), i7.dxjokdxxww.iobyxmoadg(nufgyqmvbuVar), nufgyqmvbuVar.dxjokdxxww() && nufgyqmvbuVar.dsvhmnatus().isEmpty() && configBtonecajqb != Bitmap.Config.ALPHA_8, nufgyqmvbuVar.ylkuphrtab(), nufgyqmvbuVar.oxmwwwfdhm(), nufgyqmvbuVar.cqumvgiudr(), nufgyqmvbuVar.jpowsppfya(), nufgyqmvbuVar.yadqdtsiqt(), nufgyqmvbuVar.istkbnxepw(), nufgyqmvbuVar.kcexrzcfyt(), zoijcleaowVarCdpycssgdh);
    }

    public final boolean iobyxmoadg(draadjrbmk draadjrbmkVar) {
        return !i7.iobyxmoadg.wkgbmnqykc(draadjrbmkVar.gxszxtbevo()) || this.f30740ppxfxbqfkf.iobyxmoadg();
    }

    public final agtfadlqog lqeggnwhkg(nufgyqmvbu nufgyqmvbuVar, auzgnhcxok auzgnhcxokVar) {
        androidx.lifecycle.gtknphoqwx gtknphoqwxVarLereixgezr = nufgyqmvbuVar.lereixgezr();
        g7.ppxfxbqfkf ppxfxbqfkfVarHkdspvbjdz = nufgyqmvbuVar.hkdspvbjdz();
        return ppxfxbqfkfVarHkdspvbjdz instanceof g7.wkgbmnqykc ? new zdlpuopuiu(this.f30739iobyxmoadg, nufgyqmvbuVar, (g7.wkgbmnqykc) ppxfxbqfkfVarHkdspvbjdz, gtknphoqwxVarLereixgezr, auzgnhcxokVar) : new iobyxmoadg(gtknphoqwxVarLereixgezr, auzgnhcxokVar);
    }

    public final boolean ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar, Bitmap.Config config) {
        if (!i7.iobyxmoadg.wkgbmnqykc(config)) {
            return true;
        }
        if (!nufgyqmvbuVar.nufgyqmvbu()) {
            return false;
        }
        g7.ppxfxbqfkf ppxfxbqfkfVarHkdspvbjdz = nufgyqmvbuVar.hkdspvbjdz();
        if (ppxfxbqfkfVarHkdspvbjdz instanceof g7.wkgbmnqykc) {
            View view = ((g7.wkgbmnqykc) ppxfxbqfkfVarHkdspvbjdz).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public final gxszxtbevo zoijcleaow(nufgyqmvbu nufgyqmvbuVar, Throwable th2) {
        Drawable drawableZdlpuopuiu;
        if (!(th2 instanceof NullRequestDataException) || (drawableZdlpuopuiu = nufgyqmvbuVar.yggfygwlhe()) == null) {
            drawableZdlpuopuiu = nufgyqmvbuVar.zdlpuopuiu();
        }
        return new gxszxtbevo(drawableZdlpuopuiu, nufgyqmvbuVar, th2);
    }
}
