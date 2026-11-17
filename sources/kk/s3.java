package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class s3 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f58498iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f58499ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f58500zoijcleaow;

    public s3(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f58498iobyxmoadg = constraintLayout;
        this.f58500zoijcleaow = appCompatImageView;
        this.f58499ppxfxbqfkf = appCompatTextView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f58498iobyxmoadg;
    }
}
