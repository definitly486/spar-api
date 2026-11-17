package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class Group extends zoijcleaow {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.zoijcleaow
    protected void btonecajqb(AttributeSet attributeSet) {
        super.btonecajqb(attributeSet);
        this.f8279cqumvgiudr = false;
    }

    @Override // androidx.constraintlayout.widget.zoijcleaow
    protected void gxszxtbevo(ConstraintLayout constraintLayout) {
        eablkybsjg(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.zoijcleaow, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        wkgbmnqykc();
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        wkgbmnqykc();
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        wkgbmnqykc();
    }

    @Override // androidx.constraintlayout.widget.zoijcleaow
    public void wflxmlrfwp(ConstraintLayout constraintLayout) {
        ConstraintLayout.zoijcleaow zoijcleaowVar = (ConstraintLayout.zoijcleaow) getLayoutParams();
        zoijcleaowVar.f8040nuxfzjnpeb.u(0);
        zoijcleaowVar.f8040nuxfzjnpeb.ezmngbhpjk(0);
    }
}
