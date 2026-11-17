package androidx.camera.camera2.internal.compat.quirk;

import istkbnxepw.jztzpxfvev;
import istkbnxepw.vipkmwdibw;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface CaptureIntentPreviewQuirk extends vipkmwdibw {
    static boolean iobyxmoadg(jztzpxfvev jztzpxfvevVar) {
        Iterator it = jztzpxfvevVar.ppxfxbqfkf(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).zoijcleaow()) {
                return true;
            }
        }
        return false;
    }

    default boolean zoijcleaow() {
        return true;
    }
}
