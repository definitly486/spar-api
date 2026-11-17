package v1;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f115250iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f115251zoijcleaow;

    public ylkuphrtab(ViewGroup viewGroup) {
    }

    public void eablkybsjg(View view, int i13) {
        if (i13 == 1) {
            this.f115251zoijcleaow = 0;
        } else {
            this.f115250iobyxmoadg = 0;
        }
    }

    public int iobyxmoadg() {
        return this.f115250iobyxmoadg | this.f115251zoijcleaow;
    }

    public void ppxfxbqfkf(View view, View view2, int i13, int i14) {
        if (i14 == 1) {
            this.f115251zoijcleaow = i13;
        } else {
            this.f115250iobyxmoadg = i13;
        }
    }

    public void wkgbmnqykc(View view) {
        eablkybsjg(view, 0);
    }

    public void zoijcleaow(View view, View view2, int i13) {
        ppxfxbqfkf(view, view2, i13, 0);
    }
}
