package cg0;

import hg.jyumaefscl;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import q00.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: cg0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C0362iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f19845iobyxmoadg;

        static {
            int[] iArr = new int[pf0.zoijcleaow.values().length];
            try {
                iArr[pf0.zoijcleaow.PRODUCT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pf0.zoijcleaow.IMAGE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pf0.zoijcleaow.TEXT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pf0.zoijcleaow.PROMO_CODE_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pf0.zoijcleaow.APP_UPDATE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19845iobyxmoadg = iArr;
        }
    }

    public static final eg0.iobyxmoadg iobyxmoadg(pf0.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        int i13 = C0362iobyxmoadg.f19845iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            return eg0.iobyxmoadg.PRODUCT_TYPE;
        }
        if (i13 == 2) {
            return eg0.iobyxmoadg.IMAGE_TYPE;
        }
        if (i13 == 3) {
            return eg0.iobyxmoadg.TEXT_TYPE;
        }
        if (i13 == 4) {
            return eg0.iobyxmoadg.PROMO_CODE_TYPE;
        }
        if (i13 == 5) {
            return eg0.iobyxmoadg.APP_UPDATE_TYPE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final eg0.zoijcleaow zoijcleaow(pf0.iobyxmoadg iobyxmoadgVar) {
        p00.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        List listVdvldrhtss = iobyxmoadgVar.iobyxmoadg().vdvldrhtss();
        String strWkgbmnqykc = null;
        wkgbmnqykc wkgbmnqykcVar = listVdvldrhtss != null ? (wkgbmnqykc) jyumaefscl.weqkydbzbr(listVdvldrhtss) : null;
        String strBtonecajqb = iobyxmoadgVar.iobyxmoadg().btonecajqb();
        String strKcexrzcfyt = iobyxmoadgVar.iobyxmoadg().kcexrzcfyt();
        String str = strKcexrzcfyt == null ? "" : strKcexrzcfyt;
        int iRgvfuqvkyq = iobyxmoadgVar.iobyxmoadg().rgvfuqvkyq();
        String strIobyxmoadg = wkgbmnqykcVar != null ? wkgbmnqykcVar.iobyxmoadg() : null;
        String str2 = strIobyxmoadg == null ? "" : strIobyxmoadg;
        String strZoijcleaow = wkgbmnqykcVar != null ? wkgbmnqykcVar.zoijcleaow() : null;
        if (strZoijcleaow == null) {
            strZoijcleaow = "";
        }
        String strWkgbmnqykc2 = iobyxmoadgVar.iobyxmoadg().wkgbmnqykc();
        if (strWkgbmnqykc2 != null && strWkgbmnqykc2.length() != 0) {
            strWkgbmnqykc = iobyxmoadgVar.iobyxmoadg().wkgbmnqykc();
        }
        String str3 = strWkgbmnqykc;
        String strGtknphoqwx = iobyxmoadgVar.iobyxmoadg().gtknphoqwx();
        eg0.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadg(iobyxmoadgVar.zoijcleaow());
        String strNufgyqmvbu = iobyxmoadgVar.iobyxmoadg().nufgyqmvbu();
        Integer numEablkybsjg = iobyxmoadgVar.iobyxmoadg().eablkybsjg();
        long jIntValue = 1000 * ((long) (numEablkybsjg != null ? numEablkybsjg.intValue() : 0));
        String strOxmwwwfdhm = iobyxmoadgVar.iobyxmoadg().oxmwwwfdhm();
        String str4 = strOxmwwwfdhm == null ? "" : strOxmwwwfdhm;
        String strAgtfadlqog = iobyxmoadgVar.iobyxmoadg().agtfadlqog();
        f40.zoijcleaow zoijcleaowVarDraadjrbmk = iobyxmoadgVar.iobyxmoadg().draadjrbmk();
        String strOjitshcjhn = iobyxmoadgVar.iobyxmoadg().ojitshcjhn();
        q00.iobyxmoadg iobyxmoadgVarZoijcleaow = iobyxmoadgVar.iobyxmoadg().zoijcleaow();
        if (iobyxmoadgVarZoijcleaow == null || (iobyxmoadgVarIobyxmoadg = iobyxmoadgVarZoijcleaow.zoijcleaow()) == null) {
            iobyxmoadgVarIobyxmoadg = p00.iobyxmoadg.f75338iobyxmoadg.iobyxmoadg();
        }
        return new eg0.zoijcleaow(strBtonecajqb, str, iRgvfuqvkyq, str2, strZoijcleaow, str3, strGtknphoqwx, iobyxmoadgVarIobyxmoadg2, strNufgyqmvbu, jIntValue, str4, strAgtfadlqog, zoijcleaowVarDraadjrbmk, strOjitshcjhn, iobyxmoadgVarIobyxmoadg, iobyxmoadgVar.iobyxmoadg().yggfygwlhe(), new nb0.iobyxmoadg("popup", "Всплывающие окна"));
    }
}
