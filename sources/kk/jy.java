package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class jy implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialButton f57232eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f57233iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f57234ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f57235wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f57236zoijcleaow;

    public jy(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f57233iobyxmoadg = constraintLayout;
        this.f57236zoijcleaow = appCompatImageView;
        this.f57234ppxfxbqfkf = appCompatTextView;
        this.f57235wkgbmnqykc = materialButton;
        this.f57232eablkybsjg = materialButton2;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f57233iobyxmoadg;
    }
}
