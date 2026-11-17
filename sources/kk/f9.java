package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class f9 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f56510iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ConstraintLayout f56511ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f56512zoijcleaow;

    public f9(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2) {
        this.f56510iobyxmoadg = constraintLayout;
        this.f56512zoijcleaow = appCompatTextView;
        this.f56511ppxfxbqfkf = constraintLayout2;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f56510iobyxmoadg;
    }
}
