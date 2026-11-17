package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class dq implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialButton f56308eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialButton f56309gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final LinearLayoutCompat f56310iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f56311ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatTextView f56312wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f56313zoijcleaow;

    public dq(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f56310iobyxmoadg = linearLayoutCompat;
        this.f56313zoijcleaow = appCompatTextView;
        this.f56311ppxfxbqfkf = appCompatTextView2;
        this.f56312wkgbmnqykc = appCompatTextView3;
        this.f56308eablkybsjg = materialButton;
        this.f56309gxszxtbevo = materialButton2;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f56310iobyxmoadg;
    }
}
