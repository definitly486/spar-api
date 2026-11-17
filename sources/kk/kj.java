package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class kj implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f57326iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f57327ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final RecyclerView f57328wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f57329zoijcleaow;

    public kj(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RecyclerView recyclerView) {
        this.f57326iobyxmoadg = constraintLayout;
        this.f57329zoijcleaow = appCompatTextView;
        this.f57327ppxfxbqfkf = appCompatTextView2;
        this.f57328wkgbmnqykc = recyclerView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f57326iobyxmoadg;
    }
}
