package la;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f61993iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f61995zoijcleaow = false;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f61994ppxfxbqfkf = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public zoijcleaow(iobyxmoadg iobyxmoadgVar) {
        this.f61993iobyxmoadg = (View) iobyxmoadgVar;
    }

    private void iobyxmoadg() {
        ViewParent parent = this.f61993iobyxmoadg.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).gxszxtbevo(this.f61993iobyxmoadg);
        }
    }

    public Bundle eablkybsjg() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f61995zoijcleaow);
        bundle.putInt("expandedComponentIdHint", this.f61994ppxfxbqfkf);
        return bundle;
    }

    public void gxszxtbevo(int i13) {
        this.f61994ppxfxbqfkf = i13;
    }

    public boolean ppxfxbqfkf() {
        return this.f61995zoijcleaow;
    }

    public void wkgbmnqykc(Bundle bundle) {
        this.f61995zoijcleaow = bundle.getBoolean("expanded", false);
        this.f61994ppxfxbqfkf = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f61995zoijcleaow) {
            iobyxmoadg();
        }
    }

    public int zoijcleaow() {
        return this.f61994ppxfxbqfkf;
    }
}
