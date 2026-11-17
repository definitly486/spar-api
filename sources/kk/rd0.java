package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SpayBonusOverallCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class rd0 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final SpayBonusOverallCompositeView f58313eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final CardView f58314gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f58315iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f58316ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatTextView f58317wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f58318zoijcleaow;

    public rd0(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, SpayBonusOverallCompositeView spayBonusOverallCompositeView, CardView cardView) {
        this.f58315iobyxmoadg = constraintLayout;
        this.f58318zoijcleaow = appCompatTextView;
        this.f58316ppxfxbqfkf = appCompatTextView2;
        this.f58317wkgbmnqykc = appCompatTextView3;
        this.f58313eablkybsjg = spayBonusOverallCompositeView;
        this.f58314gxszxtbevo = cardView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f58315iobyxmoadg;
    }
}
