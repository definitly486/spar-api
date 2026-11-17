package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class un implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final LinearLayoutCompat f58872iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f58873ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f58874wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f58875zoijcleaow;

    public un(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MaterialButton materialButton) {
        this.f58872iobyxmoadg = linearLayoutCompat;
        this.f58875zoijcleaow = appCompatTextView;
        this.f58873ppxfxbqfkf = appCompatTextView2;
        this.f58874wkgbmnqykc = materialButton;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f58872iobyxmoadg;
    }
}
