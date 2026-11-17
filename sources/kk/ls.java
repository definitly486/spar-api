package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import spay.sdk.view.SpayUserDataCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class ls implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final RecyclerView f57527eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final RecyclerView f57528gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f57529iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final SpayUserDataCompositeView f57530lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f57531ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f57532wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f57533zoijcleaow;

    public ls(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MaterialButton materialButton, RecyclerView recyclerView, RecyclerView recyclerView2, SpayUserDataCompositeView spayUserDataCompositeView) {
        this.f57529iobyxmoadg = constraintLayout;
        this.f57533zoijcleaow = appCompatTextView;
        this.f57531ppxfxbqfkf = appCompatTextView2;
        this.f57532wkgbmnqykc = materialButton;
        this.f57527eablkybsjg = recyclerView;
        this.f57528gxszxtbevo = recyclerView2;
        this.f57530lqeggnwhkg = spayUserDataCompositeView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f57529iobyxmoadg;
    }
}
