package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class y5 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ConstraintLayout f59384eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f59385iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f59386ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatTextView f59387wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f59388zoijcleaow;

    public y5(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout2) {
        this.f59385iobyxmoadg = constraintLayout;
        this.f59388zoijcleaow = appCompatImageView;
        this.f59386ppxfxbqfkf = appCompatTextView;
        this.f59387wkgbmnqykc = appCompatTextView2;
        this.f59384eablkybsjg = constraintLayout2;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f59385iobyxmoadg;
    }
}
