package zynmafqrjb;

import android.net.Uri;
import androidx.camera.core.ImageCaptureException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class cqumvgiudr implements jpowsppfya.yggfygwlhe {

    static abstract class iobyxmoadg {
        abstract lereixgezr.cllcsxoeiz.wkgbmnqykc iobyxmoadg();

        abstract jpowsppfya.jyumaefscl zoijcleaow();
    }

    cqumvgiudr() {
    }

    private static void dxjokdxxww(File file, byte[] bArr) throws ImageCaptureException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new pkzmftpjix.zoijcleaow().zoijcleaow(bArr));
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e13) {
            throw new ImageCaptureException(1, "Failed to write to temp file", e13);
        }
    }

    private static boolean eablkybsjg(lereixgezr.cllcsxoeiz.wkgbmnqykc wkgbmnqykcVar) {
        throw null;
    }

    private static boolean gxszxtbevo(lereixgezr.cllcsxoeiz.wkgbmnqykc wkgbmnqykcVar) {
        throw null;
    }

    static Uri lqeggnwhkg(File file, lereixgezr.cllcsxoeiz.wkgbmnqykc wkgbmnqykcVar) {
        Uri uriZoijcleaow = null;
        try {
            try {
                if (eablkybsjg(wkgbmnqykcVar)) {
                    uriZoijcleaow = zoijcleaow(file, wkgbmnqykcVar);
                } else if (gxszxtbevo(wkgbmnqykcVar) || wkgbmnqykc(wkgbmnqykcVar)) {
                    throw null;
                }
                file.delete();
                return uriZoijcleaow;
            } catch (IOException unused) {
                throw new ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th2) {
            file.delete();
            throw th2;
        }
    }

    private static void nufgyqmvbu(File file, cdpycssgdh.gxszxtbevo gxszxtbevoVar, lereixgezr.cllcsxoeiz.wkgbmnqykc wkgbmnqykcVar, int i13) throws ImageCaptureException {
        try {
            cdpycssgdh.gxszxtbevo gxszxtbevoVarEablkybsjg = cdpycssgdh.gxszxtbevo.eablkybsjg(file);
            gxszxtbevoVar.wkgbmnqykc(gxszxtbevoVarEablkybsjg);
            if (gxszxtbevoVarEablkybsjg.agtfadlqog() == 0 && i13 != 0) {
                gxszxtbevoVarEablkybsjg.yggfygwlhe(i13);
            }
            throw null;
        } catch (IOException e13) {
            throw new ImageCaptureException(1, "Failed to update Exif data", e13);
        }
    }

    private static File ppxfxbqfkf(lereixgezr.cllcsxoeiz.wkgbmnqykc wkgbmnqykcVar) {
        throw null;
    }

    private static boolean wkgbmnqykc(lereixgezr.cllcsxoeiz.wkgbmnqykc wkgbmnqykcVar) {
        throw null;
    }

    private static Uri zoijcleaow(File file, lereixgezr.cllcsxoeiz.wkgbmnqykc wkgbmnqykcVar) {
        throw null;
    }

    @Override // jpowsppfya.yggfygwlhe
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public lereixgezr.cllcsxoeiz.eablkybsjg apply(iobyxmoadg iobyxmoadgVar) throws ImageCaptureException {
        jpowsppfya.jyumaefscl jyumaefsclVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
        iobyxmoadgVar.iobyxmoadg();
        File filePpxfxbqfkf = ppxfxbqfkf(null);
        dxjokdxxww(filePpxfxbqfkf, (byte[]) jyumaefsclVarZoijcleaow.ppxfxbqfkf());
        cdpycssgdh.gxszxtbevo gxszxtbevoVarWkgbmnqykc = jyumaefsclVarZoijcleaow.wkgbmnqykc();
        Objects.requireNonNull(gxszxtbevoVarWkgbmnqykc);
        nufgyqmvbu(filePpxfxbqfkf, gxszxtbevoVarWkgbmnqykc, null, jyumaefsclVarZoijcleaow.gxszxtbevo());
        return new lereixgezr.cllcsxoeiz.eablkybsjg(lqeggnwhkg(filePpxfxbqfkf, null));
    }
}
