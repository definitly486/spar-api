package j0;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int f50256iobyxmoadg = 8;

    public static final h iobyxmoadg(int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14, int i15) {
        boolean z13 = true;
        if ((i15 & 1) != 0) {
            i13 = f50256iobyxmoadg;
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1538166871, i14, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
        }
        n0.wflxmlrfwp.zoijcleaow zoijcleaowVar = (n0.wflxmlrfwp.zoijcleaow) draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.nufgyqmvbu());
        w0.wkgbmnqykc wkgbmnqykcVar = (w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.gxszxtbevo());
        w0.zdlpuopuiu zdlpuopuiuVar = (w0.zdlpuopuiu) draadjrbmkVar.ojitshcjhn(androidx.compose.ui.platform.zeieaojujs.draadjrbmk());
        boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(zoijcleaowVar) | draadjrbmkVar.ulzqkzuiru(wkgbmnqykcVar) | draadjrbmkVar.ppxfxbqfkf(zdlpuopuiuVar.ordinal());
        if ((((i14 & 14) ^ 6) <= 4 || !draadjrbmkVar.ppxfxbqfkf(i13)) && (i14 & 6) != 4) {
            z13 = false;
        }
        boolean z14 = zUlzqkzuiru | z13;
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new h(zoijcleaowVar, wkgbmnqykcVar, zdlpuopuiuVar, i13);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        h hVar = (h) objYadqdtsiqt;
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return hVar;
    }
}
