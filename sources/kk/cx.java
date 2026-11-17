package kk;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class cx implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f56195iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f56196ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f56197zoijcleaow;

    public cx(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f56195iobyxmoadg = constraintLayout;
        this.f56197zoijcleaow = materialButton;
        this.f56196ppxfxbqfkf = materialButton2;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f56195iobyxmoadg;
    }
}
