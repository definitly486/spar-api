package zynmafqrjb;

import android.graphics.Bitmap;
import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class lqeggnwhkg implements jpowsppfya.yggfygwlhe {

    private static class iobyxmoadg {
        static boolean iobyxmoadg(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    static abstract class zoijcleaow {
        zoijcleaow() {
        }

        static zoijcleaow ppxfxbqfkf(jpowsppfya.jyumaefscl jyumaefsclVar, int i13) {
            return new zynmafqrjb.iobyxmoadg(jyumaefsclVar, i13);
        }

        abstract int iobyxmoadg();

        abstract jpowsppfya.jyumaefscl zoijcleaow();
    }

    lqeggnwhkg() {
    }

    private static int zoijcleaow(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 34 || !iobyxmoadg.iobyxmoadg(bitmap)) {
            return UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        return 4101;
    }

    @Override // jpowsppfya.yggfygwlhe
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public jpowsppfya.jyumaefscl apply(zoijcleaow zoijcleaowVar) {
        jpowsppfya.jyumaefscl jyumaefsclVarZoijcleaow = zoijcleaowVar.zoijcleaow();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) jyumaefsclVarZoijcleaow.ppxfxbqfkf()).compress(Bitmap.CompressFormat.JPEG, zoijcleaowVar.iobyxmoadg(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cdpycssgdh.gxszxtbevo gxszxtbevoVarWkgbmnqykc = jyumaefsclVarZoijcleaow.wkgbmnqykc();
        Objects.requireNonNull(gxszxtbevoVarWkgbmnqykc);
        return jpowsppfya.jyumaefscl.wflxmlrfwp(byteArray, gxszxtbevoVarWkgbmnqykc, zoijcleaow((Bitmap) jyumaefsclVarZoijcleaow.ppxfxbqfkf()), jyumaefsclVarZoijcleaow.nufgyqmvbu(), jyumaefsclVarZoijcleaow.zoijcleaow(), jyumaefsclVarZoijcleaow.gxszxtbevo(), jyumaefsclVarZoijcleaow.lqeggnwhkg(), jyumaefsclVarZoijcleaow.iobyxmoadg());
    }
}
