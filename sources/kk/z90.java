package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class z90 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f59547iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f59548ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f59549zoijcleaow;

    public z90(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, MaterialButton materialButton) {
        this.f59547iobyxmoadg = constraintLayout;
        this.f59549zoijcleaow = appCompatTextView;
        this.f59548ppxfxbqfkf = materialButton;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f59547iobyxmoadg;
    }
}
