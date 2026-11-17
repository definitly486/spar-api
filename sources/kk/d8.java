package kk;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SpayBonusCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class d8 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f56236iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final SpayBonusCompositeView f56237zoijcleaow;

    public d8(ConstraintLayout constraintLayout, SpayBonusCompositeView spayBonusCompositeView) {
        this.f56236iobyxmoadg = constraintLayout;
        this.f56237zoijcleaow = spayBonusCompositeView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f56236iobyxmoadg;
    }
}
