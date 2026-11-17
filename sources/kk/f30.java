package kk;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class f30 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f56488iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f56489zoijcleaow;

    public f30(ConstraintLayout constraintLayout, MaterialButton materialButton) {
        this.f56488iobyxmoadg = constraintLayout;
        this.f56489zoijcleaow = materialButton;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f56488iobyxmoadg;
    }
}
