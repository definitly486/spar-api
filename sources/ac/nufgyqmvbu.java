package ac;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
class nufgyqmvbu implements hkdspvbjdz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f1390iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f1391ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f1392zoijcleaow;

    nufgyqmvbu(String str, String str2, byte[] bArr) {
        this.f1392zoijcleaow = str;
        this.f1391ppxfxbqfkf = str2;
        this.f1390iobyxmoadg = bArr;
    }

    private byte[] iobyxmoadg() {
        if (zoijcleaow()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f1390iobyxmoadg);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean zoijcleaow() {
        byte[] bArr = this.f1390iobyxmoadg;
        return bArr == null || bArr.length == 0;
    }

    @Override // ac.hkdspvbjdz
    public dc.iozdgvuglv.wkgbmnqykc.zoijcleaow draadjrbmk() {
        byte[] bArrIobyxmoadg = iobyxmoadg();
        if (bArrIobyxmoadg == null) {
            return null;
        }
        return dc.iozdgvuglv.wkgbmnqykc.zoijcleaow.iobyxmoadg().zoijcleaow(bArrIobyxmoadg).ppxfxbqfkf(this.f1392zoijcleaow).iobyxmoadg();
    }

    @Override // ac.hkdspvbjdz
    public InputStream gtknphoqwx() {
        if (zoijcleaow()) {
            return null;
        }
        return new ByteArrayInputStream(this.f1390iobyxmoadg);
    }

    @Override // ac.hkdspvbjdz
    public String wflxmlrfwp() {
        return this.f1391ppxfxbqfkf;
    }
}
