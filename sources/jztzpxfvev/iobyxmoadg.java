package jztzpxfvev;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements jhduphickx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ViewConfiguration f52720iobyxmoadg;

    public iobyxmoadg(ViewConfiguration viewConfiguration) {
        this.f52720iobyxmoadg = viewConfiguration;
    }

    public final float eablkybsjg(w0.wkgbmnqykc wkgbmnqykcVar) {
        return Build.VERSION.SDK_INT > 26 ? lxfrhoxuzk.f52804iobyxmoadg.zoijcleaow(this.f52720iobyxmoadg) : wkgbmnqykcVar.I(w0.nufgyqmvbu.lqeggnwhkg(64));
    }

    @Override // jztzpxfvev.jhduphickx
    public long ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar, t.rgvfuqvkyq rgvfuqvkyqVar, long j13) {
        float f13 = -eablkybsjg(wkgbmnqykcVar);
        float f14 = -wkgbmnqykc(wkgbmnqykcVar);
        List listPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf();
        g.eablkybsjg eablkybsjgVarWkgbmnqykc = g.eablkybsjg.wkgbmnqykc(g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf());
        int size = listPpxfxbqfkf.size();
        for (int i13 = 0; i13 < size; i13++) {
            eablkybsjgVarWkgbmnqykc = g.eablkybsjg.wkgbmnqykc(g.eablkybsjg.vdvldrhtss(eablkybsjgVarWkgbmnqykc.zdlpuopuiu(), ((t.pmvmpeiblj) listPpxfxbqfkf.get(i13)).wflxmlrfwp()));
        }
        long jZdlpuopuiu = eablkybsjgVarWkgbmnqykc.zdlpuopuiu();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jZdlpuopuiu >> 32)) * f14;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jZdlpuopuiu & 4294967295L)) * f13;
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public final float wkgbmnqykc(w0.wkgbmnqykc wkgbmnqykcVar) {
        return Build.VERSION.SDK_INT > 26 ? lxfrhoxuzk.f52804iobyxmoadg.iobyxmoadg(this.f52720iobyxmoadg) : wkgbmnqykcVar.I(w0.nufgyqmvbu.lqeggnwhkg(64));
    }
}
