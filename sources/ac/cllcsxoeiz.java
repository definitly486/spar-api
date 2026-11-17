package ac;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
abstract class cllcsxoeiz {
    private static void iobyxmoadg(InputStream inputStream, File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i13 = inputStream.read(bArr);
                    if (i13 <= 0) {
                        gZIPOutputStream2.finish();
                        btonecajqb.lqeggnwhkg(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i13);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    btonecajqb.lqeggnwhkg(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static void zoijcleaow(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hkdspvbjdz hkdspvbjdzVar = (hkdspvbjdz) it.next();
            InputStream inputStreamGtknphoqwx = null;
            try {
                inputStreamGtknphoqwx = hkdspvbjdzVar.gtknphoqwx();
                if (inputStreamGtknphoqwx != null) {
                    iobyxmoadg(inputStreamGtknphoqwx, new File(file, hkdspvbjdzVar.wflxmlrfwp()));
                }
            } catch (IOException unused) {
            } finally {
                btonecajqb.lqeggnwhkg(null);
            }
        }
    }
}
