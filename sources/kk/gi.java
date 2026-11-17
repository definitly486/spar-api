package kk;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class gi implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final CardView f56707eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final WebView f56708gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f56709iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ConstraintLayout f56710ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final TextView f56711wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f56712zoijcleaow;

    public gi(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, TextView textView, CardView cardView, WebView webView) {
        this.f56709iobyxmoadg = constraintLayout;
        this.f56712zoijcleaow = appCompatImageView;
        this.f56710ppxfxbqfkf = constraintLayout2;
        this.f56711wkgbmnqykc = textView;
        this.f56707eablkybsjg = cardView;
        this.f56708gxszxtbevo = webView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f56709iobyxmoadg;
    }
}
