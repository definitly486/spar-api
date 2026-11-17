package bz;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes2.dex */
public class n extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String f17534eablkybsjg = t6.iwizpuwonk.iobyxmoadg(new byte[]{-108, 34, 36, -31, -21, 4, 55, -21, -51, -89, -116, 86, -6, 0, 34, 70, -20, 84, 110, -85, 21, 92, 27, -123, 39, -92, 67, -48, -104, -38, -103, 117});

    n() {
        super(kc2.lqeggnwhkg.BootId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws u4 {
        try {
            FileInputStream fileInputStream = new FileInputStream(f17534eablkybsjg);
            try {
                String strTrim = new BufferedReader(new InputStreamReader(fileInputStream)).readLine().trim();
                fileInputStream.close();
                return strTrim;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            throw new u4(t6.iwizpuwonk.iobyxmoadg(new byte[]{-22, -49, -23, -24, 100, 125, -50, -90, 8, -5, 49, 36, 125, -116, -18, -36, 54, -118, 38, -79, 115, -66, 109, -5, 74, -38, -2, -12, -13, -122, 124, 32, 66, 110, 6, -14, 26, -46, -53, 5, -128, 110, 102, 51, -42, -110, -97, 91, -2, -102, 107, -98, -122, 59, 82, 86, 100, -74, 51, -115, -37, 64, -51, -67}));
        }
    }
}
