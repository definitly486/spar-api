package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class q2 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ConstraintLayout f58142eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f58143iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f58144ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatTextView f58145wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f58146zoijcleaow;

    public q2(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout2) {
        this.f58143iobyxmoadg = constraintLayout;
        this.f58146zoijcleaow = appCompatImageView;
        this.f58144ppxfxbqfkf = appCompatTextView;
        this.f58145wkgbmnqykc = appCompatTextView2;
        this.f58142eablkybsjg = constraintLayout2;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f58143iobyxmoadg;
    }
}
