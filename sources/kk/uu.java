package kk;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class uu implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f58889iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final TextView f58890ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final CardView f58891zoijcleaow;

    public uu(ConstraintLayout constraintLayout, CardView cardView, TextView textView) {
        this.f58889iobyxmoadg = constraintLayout;
        this.f58891zoijcleaow = cardView;
        this.f58890ppxfxbqfkf = textView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f58889iobyxmoadg;
    }
}
