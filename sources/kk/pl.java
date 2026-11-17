package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class pl implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialButton f58095eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f58096iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f58097ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatTextView f58098wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f58099zoijcleaow;

    public pl(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, MaterialButton materialButton) {
        this.f58096iobyxmoadg = constraintLayout;
        this.f58099zoijcleaow = appCompatTextView;
        this.f58097ppxfxbqfkf = appCompatTextView2;
        this.f58098wkgbmnqykc = appCompatTextView3;
        this.f58095eablkybsjg = materialButton;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f58096iobyxmoadg;
    }
}
