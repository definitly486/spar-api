package c0;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f17842iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final View f17843zoijcleaow;

    private static class iobyxmoadg {
        public static void eablkybsjg(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void gxszxtbevo(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }

        static AutofillId iobyxmoadg(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j13) {
            return contentCaptureSession.newAutofillId(autofillId, j13);
        }

        static void ppxfxbqfkf(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static void wkgbmnqykc(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        static ViewStructure zoijcleaow(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j13) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j13);
        }
    }

    private ppxfxbqfkf(ContentCaptureSession contentCaptureSession, View view) {
        this.f17842iobyxmoadg = contentCaptureSession;
        this.f17843zoijcleaow = view;
    }

    public static ppxfxbqfkf lqeggnwhkg(ContentCaptureSession contentCaptureSession, View view) {
        return new ppxfxbqfkf(contentCaptureSession, view);
    }

    public void eablkybsjg(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            iobyxmoadg.wkgbmnqykc(zoijcleaow.iobyxmoadg(this.f17842iobyxmoadg), autofillId);
        }
    }

    public void gxszxtbevo(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            iobyxmoadg.eablkybsjg(zoijcleaow.iobyxmoadg(this.f17842iobyxmoadg), autofillId, charSequence);
        }
    }

    public void iobyxmoadg() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionIobyxmoadg = zoijcleaow.iobyxmoadg(this.f17842iobyxmoadg);
            c0.iobyxmoadg iobyxmoadgVarIobyxmoadg = wkgbmnqykc.iobyxmoadg(this.f17843zoijcleaow);
            Objects.requireNonNull(iobyxmoadgVarIobyxmoadg);
            iobyxmoadg.gxszxtbevo(contentCaptureSessionIobyxmoadg, iobyxmoadgVarIobyxmoadg.iobyxmoadg(), new long[]{Long.MIN_VALUE});
        }
    }

    public eablkybsjg ppxfxbqfkf(AutofillId autofillId, long j13) {
        if (Build.VERSION.SDK_INT >= 29) {
            return eablkybsjg.dxjokdxxww(iobyxmoadg.zoijcleaow(zoijcleaow.iobyxmoadg(this.f17842iobyxmoadg), autofillId, j13));
        }
        return null;
    }

    public void wkgbmnqykc(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            iobyxmoadg.ppxfxbqfkf(zoijcleaow.iobyxmoadg(this.f17842iobyxmoadg), viewStructure);
        }
    }

    public AutofillId zoijcleaow(long j13) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionIobyxmoadg = zoijcleaow.iobyxmoadg(this.f17842iobyxmoadg);
        c0.iobyxmoadg iobyxmoadgVarIobyxmoadg = wkgbmnqykc.iobyxmoadg(this.f17843zoijcleaow);
        Objects.requireNonNull(iobyxmoadgVarIobyxmoadg);
        return iobyxmoadg.iobyxmoadg(contentCaptureSessionIobyxmoadg, iobyxmoadgVarIobyxmoadg.iobyxmoadg(), j13);
    }
}
