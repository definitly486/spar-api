package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class n50 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialButton f57734eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f57735iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f57736ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f57737wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f57738zoijcleaow;

    public n50(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f57735iobyxmoadg = constraintLayout;
        this.f57738zoijcleaow = appCompatTextView;
        this.f57736ppxfxbqfkf = appCompatTextView2;
        this.f57737wkgbmnqykc = materialButton;
        this.f57734eablkybsjg = materialButton2;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f57735iobyxmoadg;
    }
}
