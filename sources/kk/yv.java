package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class yv implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f59487iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f59488ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f59489zoijcleaow;

    public yv(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, MaterialButton materialButton) {
        this.f59487iobyxmoadg = constraintLayout;
        this.f59489zoijcleaow = appCompatTextView;
        this.f59488ppxfxbqfkf = materialButton;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f59487iobyxmoadg;
    }
}
