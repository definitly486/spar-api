package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
class agtfadlqog extends PopupWindow {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final boolean f3251zoijcleaow = false;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f3252iobyxmoadg;

    public agtfadlqog(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        iobyxmoadg(context, attributeSet, i13, i14);
    }

    private void iobyxmoadg(Context context, AttributeSet attributeSet, int i13, int i14) {
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(context, attributeSet, lqeggnwhkg.btonecajqb.PopupWindow, i13, i14);
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(lqeggnwhkg.btonecajqb.PopupWindow_overlapAnchor)) {
            zoijcleaow(mbcevpiqjqVarJyumaefscl.iobyxmoadg(lqeggnwhkg.btonecajqb.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.PopupWindow_android_popupBackground));
        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
    }

    private void zoijcleaow(boolean z13) {
        if (f3251zoijcleaow) {
            this.f3252iobyxmoadg = z13;
        } else {
            androidx.core.widget.nufgyqmvbu.iobyxmoadg(this, z13);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i13, int i14) {
        if (f3251zoijcleaow && this.f3252iobyxmoadg) {
            i14 -= view.getHeight();
        }
        super.showAsDropDown(view, i13, i14);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i13, int i14, int i15, int i16) {
        if (f3251zoijcleaow && this.f3252iobyxmoadg) {
            i14 -= view.getHeight();
        }
        super.update(view, i13, i14, i15, i16);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i13, int i14, int i15) {
        if (f3251zoijcleaow && this.f3252iobyxmoadg) {
            i14 -= view.getHeight();
        }
        super.showAsDropDown(view, i13, i14, i15);
    }
}
