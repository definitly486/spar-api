package kk;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import spay.sdk.view.otpTextView.SpayOtpTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class nz implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TextView f57862eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final TextView f57863gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f57864iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final TextView f57865lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f57866ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final SpayOtpTextView f57867wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f57868zoijcleaow;

    public nz(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, SpayOtpTextView spayOtpTextView, TextView textView, TextView textView2, TextView textView3) {
        this.f57864iobyxmoadg = constraintLayout;
        this.f57868zoijcleaow = materialButton;
        this.f57866ppxfxbqfkf = materialButton2;
        this.f57867wkgbmnqykc = spayOtpTextView;
        this.f57862eablkybsjg = textView;
        this.f57863gxszxtbevo = textView2;
        this.f57865lqeggnwhkg = textView3;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f57864iobyxmoadg;
    }
}
