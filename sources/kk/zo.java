package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class zo implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final LinearLayoutCompat f59612iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f59613ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f59614wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f59615zoijcleaow;

    public zo(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MaterialButton materialButton) {
        this.f59612iobyxmoadg = linearLayoutCompat;
        this.f59615zoijcleaow = appCompatTextView;
        this.f59613ppxfxbqfkf = appCompatTextView2;
        this.f59614wkgbmnqykc = materialButton;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f59612iobyxmoadg;
    }
}
