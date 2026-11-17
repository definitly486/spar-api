package n0;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
final class tzroggbefp implements wypolnanlu {
    private final Typeface ppxfxbqfkf(String str, yadqdtsiqt yadqdtsiqtVar, int i13) {
        if (lereixgezr.gxszxtbevo(i13, lereixgezr.f68283zoijcleaow.zoijcleaow()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(yadqdtsiqtVar, yadqdtsiqt.f68367yggfygwlhe.wkgbmnqykc()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iPpxfxbqfkf = gxszxtbevo.ppxfxbqfkf(yadqdtsiqtVar, i13);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iPpxfxbqfkf) : Typeface.create(str, iPpxfxbqfkf);
    }

    private final Typeface wkgbmnqykc(String str, yadqdtsiqt yadqdtsiqtVar, int i13) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefacePpxfxbqfkf = ppxfxbqfkf(str, yadqdtsiqtVar, i13);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(typefacePpxfxbqfkf, Typeface.create(Typeface.DEFAULT, gxszxtbevo.ppxfxbqfkf(yadqdtsiqtVar, i13))) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(typefacePpxfxbqfkf, ppxfxbqfkf(null, yadqdtsiqtVar, i13))) {
            return null;
        }
        return typefacePpxfxbqfkf;
    }

    @Override // n0.wypolnanlu
    public Typeface iobyxmoadg(yadqdtsiqt yadqdtsiqtVar, int i13) {
        return ppxfxbqfkf(null, yadqdtsiqtVar, i13);
    }

    @Override // n0.wypolnanlu
    public Typeface zoijcleaow(ylkuphrtab ylkuphrtabVar, yadqdtsiqt yadqdtsiqtVar, int i13) {
        Typeface typefaceWkgbmnqykc = wkgbmnqykc(mbcevpiqjq.zoijcleaow(ylkuphrtabVar.gxszxtbevo(), yadqdtsiqtVar), yadqdtsiqtVar, i13);
        return typefaceWkgbmnqykc == null ? ppxfxbqfkf(ylkuphrtabVar.gxszxtbevo(), yadqdtsiqtVar, i13) : typefaceWkgbmnqykc;
    }
}
