package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import spay.sdk.view.BnplLogoCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class x5 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatImageView f59248eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final CardView f59249iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f59250ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatTextView f59251wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final BnplLogoCompositeView f59252zoijcleaow;

    public x5(CardView cardView, BnplLogoCompositeView bnplLogoCompositeView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, CardView cardView2, AppCompatImageView appCompatImageView) {
        this.f59249iobyxmoadg = cardView;
        this.f59252zoijcleaow = bnplLogoCompositeView;
        this.f59250ppxfxbqfkf = appCompatTextView;
        this.f59251wkgbmnqykc = appCompatTextView2;
        this.f59248eablkybsjg = appCompatImageView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f59249iobyxmoadg;
    }
}
