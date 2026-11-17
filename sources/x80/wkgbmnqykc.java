package x80;

import android.graphics.Bitmap;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.zeieaojujs;
import gg.cqumvgiudr;
import gg.kcexrzcfyt;
import gg.vdvldrhtss;
import gg.zdlpuopuiu;
import h.hkdspvbjdz;
import ikoacuggdj.lereixgezr;
import java.util.LinkedHashMap;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {
    /* JADX INFO: Access modifiers changed from: private */
    public static final l.iobyxmoadg ppxfxbqfkf(int i13, boolean z13, String str, int i14) {
        Object objWkgbmnqykc;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(com.google.zxing.ppxfxbqfkf.MARGIN, Integer.valueOf(i14));
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(new af.iobyxmoadg().iobyxmoadg(str, com.google.zxing.iobyxmoadg.QR_CODE, i13, i13, linkedHashMap));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        te.zoijcleaow zoijcleaowVar = (te.zoijcleaow) objWkgbmnqykc;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zoijcleaowVar != null ? zoijcleaowVar.gxszxtbevo() : i13, zoijcleaowVar != null ? zoijcleaowVar.eablkybsjg() : i13, Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bitmapCreateBitmap, "createBitmap(...)");
        int iGxszxtbevo = zoijcleaowVar != null ? zoijcleaowVar.gxszxtbevo() : i13;
        int iEablkybsjg = zoijcleaowVar != null ? zoijcleaowVar.eablkybsjg() : i13;
        int[] iArr = new int[iGxszxtbevo * iEablkybsjg];
        vdvldrhtss vdvldrhtssVarIobyxmoadg = z13 ? cqumvgiudr.iobyxmoadg(-1, 0) : cqumvgiudr.iobyxmoadg(-16777216, -1);
        int iIntValue = ((Number) vdvldrhtssVarIobyxmoadg.iobyxmoadg()).intValue();
        int iIntValue2 = ((Number) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).intValue();
        for (int i15 = 0; i15 < iGxszxtbevo; i15++) {
            for (int i16 = 0; i16 < iEablkybsjg; i16++) {
                iArr[(i16 * iGxszxtbevo) + i15] = zoijcleaowVar != null ? zoijcleaowVar.wkgbmnqykc(i15, i16) : false ? iIntValue : iIntValue2;
            }
        }
        bitmapCreateBitmap.setPixels(iArr, 0, iGxszxtbevo, 0, 0, iGxszxtbevo, iEablkybsjg);
        return new l.iobyxmoadg(hkdspvbjdz.ppxfxbqfkf(bitmapCreateBitmap), 0L, 0L, 6, null);
    }

    public static final i1 zoijcleaow(final String content, float f13, float f14, final boolean z13, draadjrbmk draadjrbmkVar, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(content, "content");
        draadjrbmkVar.sopmlzcsov(-2002234631);
        if ((i14 & 4) != 0) {
            f14 = nufgyqmvbu.lqeggnwhkg(0);
        }
        if ((i14 & 8) != 0) {
            z13 = lereixgezr.iobyxmoadg(draadjrbmkVar, 0);
        }
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-2002234631, i13, -1, "ru.myspar.dynamic_qr.impl.presentation.compose.qrcode.image.rememberQrBitmapPainter (RememberQrBitmapPainter.kt:24)");
        }
        w0.wkgbmnqykc wkgbmnqykcVar = (w0.wkgbmnqykc) draadjrbmkVar.ojitshcjhn(zeieaojujs.gxszxtbevo());
        vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(Integer.valueOf(wkgbmnqykcVar.hszhottldk(f13)), Integer.valueOf(wkgbmnqykcVar.hszhottldk(f14)));
        final int iIntValue = ((Number) vdvldrhtssVarIobyxmoadg.iobyxmoadg()).intValue();
        final int iIntValue2 = ((Number) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).intValue();
        draadjrbmkVar.sopmlzcsov(1732940742);
        boolean zPpxfxbqfkf = ((((i13 & 14) ^ 6) > 4 && draadjrbmkVar.ulzqkzuiru(content)) || (i13 & 6) == 4) | draadjrbmkVar.ppxfxbqfkf(iIntValue) | draadjrbmkVar.ppxfxbqfkf(iIntValue2) | ((((i13 & 7168) ^ 3072) > 2048 && draadjrbmkVar.iobyxmoadg(z13)) || (i13 & 3072) == 2048);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (zPpxfxbqfkf || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: x80.ppxfxbqfkf
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return wkgbmnqykc.ppxfxbqfkf(iIntValue, z13, content, iIntValue2);
                }
            });
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        i1 i1Var = (i1) objYadqdtsiqt;
        draadjrbmkVar.stevsuqkhv();
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return i1Var;
    }
}
