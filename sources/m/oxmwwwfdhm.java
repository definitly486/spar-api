package m;

import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.zeieaojujs;
import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public abstract class oxmwwwfdhm {
    private static final long eablkybsjg(w0.wkgbmnqykc wkgbmnqykcVar, float f13, float f14) {
        float fI = wkgbmnqykcVar.I(f13);
        float fI2 = wkgbmnqykcVar.I(f14);
        return g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(fI)) << 32) | (((long) Float.floatToRawIntBits(fI2)) & 4294967295L));
    }

    private static final long gxszxtbevo(long j13, float f13, float f14) {
        if (Float.isNaN(f13)) {
            f13 = Float.intBitsToFloat((int) (j13 >> 32));
        }
        if (Float.isNaN(f14)) {
            f14 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        }
        return g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L));
    }

    public static final vdvldrhtss iobyxmoadg(vdvldrhtss vdvldrhtssVar, long j13, long j14, String str, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar, boolean z13) {
        vdvldrhtssVar.yggfygwlhe(j13);
        vdvldrhtssVar.vdvldrhtss(z13);
        vdvldrhtssVar.oxmwwwfdhm(wkgbmnqykcVar);
        vdvldrhtssVar.jyumaefscl(j14);
        vdvldrhtssVar.zdlpuopuiu(str);
        return vdvldrhtssVar;
    }

    public static final vdvldrhtss lqeggnwhkg(wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(1413834416, i13, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        w0.wkgbmnqykc wkgbmnqykcVar2 = (w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(zeieaojujs.gxszxtbevo());
        float fLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg();
        boolean zWkgbmnqykc = draadjrbmkVar.wkgbmnqykc((((long) Float.floatToRawIntBits(wkgbmnqykcVar2.getDensity())) & 4294967295L) | (Float.floatToRawIntBits(fLqeggnwhkg) << 32));
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (zWkgbmnqykc || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
            ppxfxbqfkf(ppxfxbqfkfVar, wkgbmnqykcVar.dxjokdxxww());
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            objYadqdtsiqt = wkgbmnqykc(wkgbmnqykcVar2, wkgbmnqykcVar, ppxfxbqfkfVar);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) objYadqdtsiqt;
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return vdvldrhtssVar;
    }

    public static final ppxfxbqfkf ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar, agtfadlqog agtfadlqogVar) {
        int iDraadjrbmk = agtfadlqogVar.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = agtfadlqogVar.zoijcleaow(i13);
            if (rgvfuqvkyqVarZoijcleaow instanceof kcexrzcfyt) {
                lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg();
                kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) rgvfuqvkyqVarZoijcleaow;
                lqeggnwhkgVar.gtknphoqwx(kcexrzcfytVar.wkgbmnqykc());
                lqeggnwhkgVar.draadjrbmk(kcexrzcfytVar.eablkybsjg());
                lqeggnwhkgVar.btonecajqb(kcexrzcfytVar.ppxfxbqfkf());
                lqeggnwhkgVar.nufgyqmvbu(kcexrzcfytVar.iobyxmoadg());
                lqeggnwhkgVar.dxjokdxxww(kcexrzcfytVar.zoijcleaow());
                lqeggnwhkgVar.wflxmlrfwp(kcexrzcfytVar.gxszxtbevo());
                lqeggnwhkgVar.agtfadlqog(kcexrzcfytVar.dxjokdxxww());
                lqeggnwhkgVar.oxmwwwfdhm(kcexrzcfytVar.wflxmlrfwp());
                lqeggnwhkgVar.ojitshcjhn(kcexrzcfytVar.btonecajqb());
                lqeggnwhkgVar.rgvfuqvkyq(kcexrzcfytVar.gtknphoqwx());
                lqeggnwhkgVar.vdvldrhtss(kcexrzcfytVar.draadjrbmk());
                lqeggnwhkgVar.yggfygwlhe(kcexrzcfytVar.rgvfuqvkyq());
                lqeggnwhkgVar.kcexrzcfyt(kcexrzcfytVar.agtfadlqog());
                lqeggnwhkgVar.zdlpuopuiu(kcexrzcfytVar.ojitshcjhn());
                ppxfxbqfkfVar.dxjokdxxww(i13, lqeggnwhkgVar);
            } else if (rgvfuqvkyqVarZoijcleaow instanceof agtfadlqog) {
                ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf();
                agtfadlqog agtfadlqogVar2 = (agtfadlqog) rgvfuqvkyqVarZoijcleaow;
                ppxfxbqfkfVar2.rgvfuqvkyq(agtfadlqogVar2.wkgbmnqykc());
                ppxfxbqfkfVar2.kcexrzcfyt(agtfadlqogVar2.dxjokdxxww());
                ppxfxbqfkfVar2.zdlpuopuiu(agtfadlqogVar2.btonecajqb());
                ppxfxbqfkfVar2.yggfygwlhe(agtfadlqogVar2.gtknphoqwx());
                ppxfxbqfkfVar2.jyumaefscl(agtfadlqogVar2.wflxmlrfwp());
                ppxfxbqfkfVar2.iwizpuwonk(agtfadlqogVar2.agtfadlqog());
                ppxfxbqfkfVar2.vdvldrhtss(agtfadlqogVar2.eablkybsjg());
                ppxfxbqfkfVar2.oxmwwwfdhm(agtfadlqogVar2.gxszxtbevo());
                ppxfxbqfkfVar2.ojitshcjhn(agtfadlqogVar2.ppxfxbqfkf());
                ppxfxbqfkf(ppxfxbqfkfVar2, agtfadlqogVar2);
                ppxfxbqfkfVar.dxjokdxxww(i13, ppxfxbqfkfVar2);
            }
        }
        return ppxfxbqfkfVar;
    }

    public static final vdvldrhtss wkgbmnqykc(w0.wkgbmnqykc wkgbmnqykcVar, wkgbmnqykc wkgbmnqykcVar2, ppxfxbqfkf ppxfxbqfkfVar) {
        long jEablkybsjg = eablkybsjg(wkgbmnqykcVar, wkgbmnqykcVar2.gxszxtbevo(), wkgbmnqykcVar2.eablkybsjg());
        return iobyxmoadg(new vdvldrhtss(ppxfxbqfkfVar), jEablkybsjg, gxszxtbevo(jEablkybsjg, wkgbmnqykcVar2.wflxmlrfwp(), wkgbmnqykcVar2.draadjrbmk()), wkgbmnqykcVar2.nufgyqmvbu(), zoijcleaow(wkgbmnqykcVar2.gtknphoqwx(), wkgbmnqykcVar2.btonecajqb()), wkgbmnqykcVar2.wkgbmnqykc());
    }

    private static final androidx.compose.ui.graphics.wkgbmnqykc zoijcleaow(long j13, int i13) {
        if (j13 != 16) {
            return androidx.compose.ui.graphics.wkgbmnqykc.f6377zoijcleaow.iobyxmoadg(j13, i13);
        }
        return null;
    }
}
