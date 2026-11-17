package b;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class yggfygwlhe implements zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AutofillManager f14884iobyxmoadg;

    public yggfygwlhe(AutofillManager autofillManager) {
        this.f14884iobyxmoadg = autofillManager;
    }

    @Override // b.zdlpuopuiu
    public void commit() {
        this.f14884iobyxmoadg.commit();
    }

    @Override // b.zdlpuopuiu
    public void eablkybsjg(View view, int i13, Rect rect) {
        this.f14884iobyxmoadg.notifyViewEntered(view, i13, rect);
    }

    @Override // b.zdlpuopuiu
    public void iobyxmoadg(View view, int i13, AutofillValue autofillValue) {
        this.f14884iobyxmoadg.notifyValueChanged(view, i13, autofillValue);
    }

    @Override // b.zdlpuopuiu
    public void ppxfxbqfkf(View view, int i13, Rect rect) {
        this.f14884iobyxmoadg.requestAutofill(view, i13, rect);
    }

    @Override // b.zdlpuopuiu
    public void wkgbmnqykc(View view, int i13, boolean z13) {
        if (Build.VERSION.SDK_INT >= 27) {
            btonecajqb.f14825iobyxmoadg.iobyxmoadg(view, this.f14884iobyxmoadg, i13, z13);
        }
    }

    @Override // b.zdlpuopuiu
    public void zoijcleaow(View view, int i13) {
        this.f14884iobyxmoadg.notifyViewExited(view, i13);
    }
}
