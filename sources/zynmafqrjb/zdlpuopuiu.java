package zynmafqrjb;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.utils.ImageUtil;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import istkbnxepw.jztzpxfvev;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zdlpuopuiu implements jpowsppfya.yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pkzmftpjix.ppxfxbqfkf f131687iobyxmoadg;

    static abstract class iobyxmoadg {
        iobyxmoadg() {
        }

        static iobyxmoadg ppxfxbqfkf(jpowsppfya.jyumaefscl jyumaefsclVar, int i13) {
            return new ppxfxbqfkf(jyumaefsclVar, i13);
        }

        abstract int iobyxmoadg();

        abstract jpowsppfya.jyumaefscl zoijcleaow();
    }

    zdlpuopuiu(jztzpxfvev jztzpxfvevVar) {
        this.f131687iobyxmoadg = new pkzmftpjix.ppxfxbqfkf(jztzpxfvevVar);
    }

    private jpowsppfya.jyumaefscl ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, int i13) {
        jpowsppfya.jyumaefscl jyumaefsclVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
        byte[] bArrIobyxmoadg = this.f131687iobyxmoadg.iobyxmoadg((androidx.camera.core.agtfadlqog) jyumaefsclVarZoijcleaow.ppxfxbqfkf());
        cdpycssgdh.gxszxtbevo gxszxtbevoVarWkgbmnqykc = jyumaefsclVarZoijcleaow.wkgbmnqykc();
        Objects.requireNonNull(gxszxtbevoVarWkgbmnqykc);
        return jpowsppfya.jyumaefscl.wflxmlrfwp(bArrIobyxmoadg, gxszxtbevoVarWkgbmnqykc, i13, jyumaefsclVarZoijcleaow.nufgyqmvbu(), jyumaefsclVarZoijcleaow.zoijcleaow(), jyumaefsclVarZoijcleaow.gxszxtbevo(), jyumaefsclVarZoijcleaow.lqeggnwhkg(), jyumaefsclVarZoijcleaow.iobyxmoadg());
    }

    private jpowsppfya.jyumaefscl wkgbmnqykc(iobyxmoadg iobyxmoadgVar) throws ImageCaptureException {
        jpowsppfya.jyumaefscl jyumaefsclVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
        androidx.camera.core.agtfadlqog agtfadlqogVar = (androidx.camera.core.agtfadlqog) jyumaefsclVarZoijcleaow.ppxfxbqfkf();
        Rect rectZoijcleaow = jyumaefsclVarZoijcleaow.zoijcleaow();
        try {
            byte[] bArrBtonecajqb = ImageUtil.btonecajqb(agtfadlqogVar, rectZoijcleaow, iobyxmoadgVar.iobyxmoadg(), jyumaefsclVarZoijcleaow.gxszxtbevo());
            return jpowsppfya.jyumaefscl.wflxmlrfwp(bArrBtonecajqb, zoijcleaow(bArrBtonecajqb), UserVerificationMethods.USER_VERIFY_HANDPRINT, new Size(rectZoijcleaow.width(), rectZoijcleaow.height()), new Rect(0, 0, rectZoijcleaow.width(), rectZoijcleaow.height()), jyumaefsclVarZoijcleaow.gxszxtbevo(), cdpycssgdh.vdvldrhtss.zdlpuopuiu(jyumaefsclVarZoijcleaow.lqeggnwhkg(), rectZoijcleaow), jyumaefsclVarZoijcleaow.iobyxmoadg());
        } catch (ImageUtil.CodecFailedException e13) {
            throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e13);
        }
    }

    private static cdpycssgdh.gxszxtbevo zoijcleaow(byte[] bArr) throws ImageCaptureException {
        try {
            return cdpycssgdh.gxszxtbevo.nufgyqmvbu(new ByteArrayInputStream(bArr));
        } catch (IOException e13) {
            throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e13);
        }
    }

    @Override // jpowsppfya.yggfygwlhe
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public jpowsppfya.jyumaefscl apply(iobyxmoadg iobyxmoadgVar) {
        jpowsppfya.jyumaefscl jyumaefsclVarWkgbmnqykc;
        try {
            int iEablkybsjg = iobyxmoadgVar.zoijcleaow().eablkybsjg();
            if (iEablkybsjg != 35) {
                if (iEablkybsjg != 256 && iEablkybsjg != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iEablkybsjg);
                }
                jyumaefsclVarWkgbmnqykc = ppxfxbqfkf(iobyxmoadgVar, iEablkybsjg);
            } else {
                jyumaefsclVarWkgbmnqykc = wkgbmnqykc(iobyxmoadgVar);
            }
            ((androidx.camera.core.agtfadlqog) iobyxmoadgVar.zoijcleaow().ppxfxbqfkf()).close();
            return jyumaefsclVarWkgbmnqykc;
        } catch (Throwable th2) {
            ((androidx.camera.core.agtfadlqog) iobyxmoadgVar.zoijcleaow().ppxfxbqfkf()).close();
            throw th2;
        }
    }
}
