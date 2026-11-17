package hd1;

import hg.jyumaefscl;
import hh1.eablkybsjg;
import hh1.gxszxtbevo;
import hh1.wkgbmnqykc;
import java.util.List;
import jd1.ppxfxbqfkf;
import k21.ojitshcjhn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: hd1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C0930iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f40095iobyxmoadg;

        static {
            int[] iArr = new int[eablkybsjg.values().length];
            try {
                iArr[eablkybsjg.PRODUCT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eablkybsjg.IMAGE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eablkybsjg.TEXT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[eablkybsjg.PROMO_CODE_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[eablkybsjg.APP_UPDATE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f40095iobyxmoadg = iArr;
        }
    }

    public static final jd1.zoijcleaow iobyxmoadg(eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        int i13 = C0930iobyxmoadg.f40095iobyxmoadg[eablkybsjgVar.ordinal()];
        if (i13 == 1) {
            return jd1.zoijcleaow.PRODUCT_TYPE;
        }
        if (i13 == 2) {
            return jd1.zoijcleaow.IMAGE_TYPE;
        }
        if (i13 == 3) {
            return jd1.zoijcleaow.TEXT_TYPE;
        }
        if (i13 == 4) {
            return jd1.zoijcleaow.PROMO_CODE_TYPE;
        }
        if (i13 == 5) {
            return jd1.zoijcleaow.APP_UPDATE_TYPE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ppxfxbqfkf zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        hz0.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        List listVdvldrhtss = wkgbmnqykcVar.iobyxmoadg().vdvldrhtss();
        String strWkgbmnqykc = null;
        gxszxtbevo gxszxtbevoVar = listVdvldrhtss != null ? (gxszxtbevo) jyumaefscl.weqkydbzbr(listVdvldrhtss) : null;
        String strBtonecajqb = wkgbmnqykcVar.iobyxmoadg().btonecajqb();
        String strKcexrzcfyt = wkgbmnqykcVar.iobyxmoadg().kcexrzcfyt();
        String str = strKcexrzcfyt == null ? "" : strKcexrzcfyt;
        int iRgvfuqvkyq = wkgbmnqykcVar.iobyxmoadg().rgvfuqvkyq();
        String strIobyxmoadg = gxszxtbevoVar != null ? gxszxtbevoVar.iobyxmoadg() : null;
        String str2 = strIobyxmoadg == null ? "" : strIobyxmoadg;
        String strZoijcleaow = gxszxtbevoVar != null ? gxszxtbevoVar.zoijcleaow() : null;
        if (strZoijcleaow == null) {
            strZoijcleaow = "";
        }
        String strWkgbmnqykc2 = wkgbmnqykcVar.iobyxmoadg().wkgbmnqykc();
        if (strWkgbmnqykc2 != null && strWkgbmnqykc2.length() != 0) {
            strWkgbmnqykc = wkgbmnqykcVar.iobyxmoadg().wkgbmnqykc();
        }
        String str3 = strWkgbmnqykc;
        String strGtknphoqwx = wkgbmnqykcVar.iobyxmoadg().gtknphoqwx();
        jd1.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadg(wkgbmnqykcVar.zoijcleaow());
        String strNufgyqmvbu = wkgbmnqykcVar.iobyxmoadg().nufgyqmvbu();
        Integer numEablkybsjg = wkgbmnqykcVar.iobyxmoadg().eablkybsjg();
        long jIntValue = 1000 * ((long) (numEablkybsjg != null ? numEablkybsjg.intValue() : 0));
        String strOxmwwwfdhm = wkgbmnqykcVar.iobyxmoadg().oxmwwwfdhm();
        String str4 = strOxmwwwfdhm == null ? "" : strOxmwwwfdhm;
        String strAgtfadlqog = wkgbmnqykcVar.iobyxmoadg().agtfadlqog();
        ojitshcjhn ojitshcjhnVarDraadjrbmk = wkgbmnqykcVar.iobyxmoadg().draadjrbmk();
        String strOjitshcjhn = wkgbmnqykcVar.iobyxmoadg().ojitshcjhn();
        hh1.zoijcleaow zoijcleaowVarZoijcleaow = wkgbmnqykcVar.iobyxmoadg().zoijcleaow();
        if (zoijcleaowVarZoijcleaow == null || (iobyxmoadgVarIobyxmoadg = zoijcleaowVarZoijcleaow.zoijcleaow()) == null) {
            iobyxmoadgVarIobyxmoadg = hz0.iobyxmoadg.f41447iobyxmoadg.iobyxmoadg();
        }
        return new ppxfxbqfkf(strBtonecajqb, str, iRgvfuqvkyq, str2, strZoijcleaow, str3, strGtknphoqwx, zoijcleaowVarIobyxmoadg, strNufgyqmvbu, jIntValue, str4, strAgtfadlqog, ojitshcjhnVarDraadjrbmk, strOjitshcjhn, iobyxmoadgVarIobyxmoadg, wkgbmnqykcVar.iobyxmoadg().yggfygwlhe(), new m91.iobyxmoadg("popup", "Всплывающие окна"));
    }
}
