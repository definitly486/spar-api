package b3;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {
    public static void iobyxmoadg(androidx.media3.datasource.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar != null) {
            try {
                iobyxmoadgVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
