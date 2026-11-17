package ac;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
class wwaezpbzkn implements hkdspvbjdz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final File f1467iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f1468ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f1469zoijcleaow;

    wwaezpbzkn(String str, String str2, File file) {
        this.f1469zoijcleaow = str;
        this.f1468ppxfxbqfkf = str2;
        this.f1467iobyxmoadg = file;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private byte[] iobyxmoadg() {
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamGtknphoqwx = gtknphoqwx();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamGtknphoqwx == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (inputStreamGtknphoqwx != null) {
                            inputStreamGtknphoqwx.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i13 = inputStreamGtknphoqwx.read(bArr);
                            if (i13 <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                inputStreamGtknphoqwx.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i13);
                        } catch (Throwable th2) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    byteArrayOutputStream.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                if (inputStreamGtknphoqwx != null) {
                    try {
                        inputStreamGtknphoqwx.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
            if (inputStreamGtknphoqwx != null) {
                inputStreamGtknphoqwx.close();
            }
            throw th6;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // ac.hkdspvbjdz
    public dc.iozdgvuglv.wkgbmnqykc.zoijcleaow draadjrbmk() {
        byte[] bArrIobyxmoadg = iobyxmoadg();
        if (bArrIobyxmoadg != null) {
            return dc.iozdgvuglv.wkgbmnqykc.zoijcleaow.iobyxmoadg().zoijcleaow(bArrIobyxmoadg).ppxfxbqfkf(this.f1469zoijcleaow).iobyxmoadg();
        }
        return null;
    }

    @Override // ac.hkdspvbjdz
    public InputStream gtknphoqwx() {
        if (this.f1467iobyxmoadg.exists() && this.f1467iobyxmoadg.isFile()) {
            try {
                return new FileInputStream(this.f1467iobyxmoadg);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // ac.hkdspvbjdz
    public String wflxmlrfwp() {
        return this.f1468ppxfxbqfkf;
    }
}
