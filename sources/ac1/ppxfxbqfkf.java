package ac1;

import android.graphics.Bitmap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f1541iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static /* synthetic */ Bitmap zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, String str, int i13, int i14, int i15, Integer num, int i16, Object obj) {
        if ((i16 & 8) != 0) {
            i15 = UserVerificationMethods.USER_VERIFY_NONE;
        }
        int i17 = i15;
        if ((i16 & 16) != 0) {
            num = null;
        }
        return ppxfxbqfkfVar.iobyxmoadg(str, i13, i14, i17, num);
    }

    public final Bitmap iobyxmoadg(String str, int i13, int i14, int i15, Integer num) {
        Map mapGxszxtbevo;
        if (num != null) {
            try {
                mapGxszxtbevo = tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg(com.google.zxing.ppxfxbqfkf.MARGIN, num));
            } catch (Exception unused) {
                return null;
            }
        } else {
            mapGxszxtbevo = null;
        }
        te.zoijcleaow zoijcleaowVarIobyxmoadg = new com.google.zxing.wkgbmnqykc().iobyxmoadg(str, com.google.zxing.iobyxmoadg.QR_CODE, i15, i15, mapGxszxtbevo);
        int iGxszxtbevo = zoijcleaowVarIobyxmoadg.gxszxtbevo();
        int iEablkybsjg = zoijcleaowVarIobyxmoadg.eablkybsjg();
        int[] iArr = new int[iGxszxtbevo * iEablkybsjg];
        for (int i16 = 0; i16 < iEablkybsjg; i16++) {
            int i17 = i16 * iGxszxtbevo;
            for (int i18 = 0; i18 < iGxszxtbevo; i18++) {
                iArr[i17 + i18] = zoijcleaowVarIobyxmoadg.wkgbmnqykc(i18, i16) ? i13 : i14;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iGxszxtbevo, iEablkybsjg, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, i15, 0, 0, iGxszxtbevo, iEablkybsjg);
        return bitmapCreateBitmap;
    }
}
