package hcddaimhww;

import android.util.Size;
import androidx.camera.core.impl.istkbnxepw;
import androidx.camera.core.impl.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {
    public static void iobyxmoadg(istkbnxepw.iobyxmoadg iobyxmoadgVar, int i13) {
        Size sizeCllcsxoeiz;
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) iobyxmoadgVar.wkgbmnqykc();
        int iYadqdtsiqt = rgvfuqvkyqVar.yadqdtsiqt(-1);
        if (iYadqdtsiqt == -1 || iYadqdtsiqt != i13) {
            ((rgvfuqvkyq.iobyxmoadg) iobyxmoadgVar).zoijcleaow(i13);
        }
        if (iYadqdtsiqt == -1 || i13 == -1 || iYadqdtsiqt == i13) {
            return;
        }
        if (Math.abs(cdpycssgdh.ppxfxbqfkf.zoijcleaow(i13) - cdpycssgdh.ppxfxbqfkf.zoijcleaow(iYadqdtsiqt)) % 180 != 90 || (sizeCllcsxoeiz = rgvfuqvkyqVar.cllcsxoeiz(null)) == null) {
            return;
        }
        ((rgvfuqvkyq.iobyxmoadg) iobyxmoadgVar).ppxfxbqfkf(new Size(sizeCllcsxoeiz.getHeight(), sizeCllcsxoeiz.getWidth()));
    }
}
