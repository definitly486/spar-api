package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class hr implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialButton f56950eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final LinearLayoutCompat f56951iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f56952ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f56953wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f56954zoijcleaow;

    public hr(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f56951iobyxmoadg = linearLayoutCompat;
        this.f56954zoijcleaow = appCompatTextView;
        this.f56952ppxfxbqfkf = appCompatTextView2;
        this.f56953wkgbmnqykc = materialButton;
        this.f56950eablkybsjg = materialButton2;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f56951iobyxmoadg;
    }
}
