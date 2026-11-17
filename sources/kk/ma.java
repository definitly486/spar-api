package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ma implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final CardView f57613iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f57614ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatImageView f57615wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f57616zoijcleaow;

    public ma(CardView cardView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView) {
        this.f57613iobyxmoadg = cardView;
        this.f57616zoijcleaow = appCompatTextView;
        this.f57614ppxfxbqfkf = appCompatTextView2;
        this.f57615wkgbmnqykc = appCompatImageView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f57613iobyxmoadg;
    }
}
