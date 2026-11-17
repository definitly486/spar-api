package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class y10 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final RecyclerView f59364dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatTextView f59365eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final AppCompatTextView f59366gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final NestedScrollView f59367iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final AppCompatTextView f59368lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final AppCompatCheckBox f59369nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f59370ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f59371wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f59372zoijcleaow;

    public y10(NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView, MaterialButton materialButton, MaterialButton materialButton2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatCheckBox appCompatCheckBox, RecyclerView recyclerView) {
        this.f59367iobyxmoadg = nestedScrollView;
        this.f59372zoijcleaow = appCompatTextView;
        this.f59370ppxfxbqfkf = materialButton;
        this.f59371wkgbmnqykc = materialButton2;
        this.f59365eablkybsjg = appCompatTextView2;
        this.f59366gxszxtbevo = appCompatTextView3;
        this.f59368lqeggnwhkg = appCompatTextView4;
        this.f59369nufgyqmvbu = appCompatCheckBox;
        this.f59364dxjokdxxww = recyclerView;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f59367iobyxmoadg;
    }
}
