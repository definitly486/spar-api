package c0;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {

    static class iobyxmoadg {
        public static AutofillId iobyxmoadg(View view) {
            return view.getAutofillId();
        }
    }

    private static class ppxfxbqfkf {
        static void iobyxmoadg(View view, int i13) {
            view.setImportantForContentCapture(i13);
        }
    }

    private static class zoijcleaow {
        static ContentCaptureSession iobyxmoadg(View view) {
            return view.getContentCaptureSession();
        }
    }

    public static c0.iobyxmoadg iobyxmoadg(View view) {
        return c0.iobyxmoadg.zoijcleaow(iobyxmoadg.iobyxmoadg(view));
    }

    public static void ppxfxbqfkf(View view, int i13) {
        if (Build.VERSION.SDK_INT >= 30) {
            ppxfxbqfkf.iobyxmoadg(view, i13);
        }
    }

    public static c0.ppxfxbqfkf zoijcleaow(View view) {
        ContentCaptureSession contentCaptureSessionIobyxmoadg;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionIobyxmoadg = zoijcleaow.iobyxmoadg(view)) == null) {
            return null;
        }
        return c0.ppxfxbqfkf.lqeggnwhkg(contentCaptureSessionIobyxmoadg, view);
    }
}
