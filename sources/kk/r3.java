package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class r3 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f58261iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f58262zoijcleaow;

    public r3(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView) {
        this.f58261iobyxmoadg = constraintLayout;
        this.f58262zoijcleaow = appCompatImageView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f58261iobyxmoadg;
    }
}
