package kk;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class ue0 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ShapeableImageView f58841eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final TextView f58842gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f58843iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final TextView f58844lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f58845ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f58846wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f58847zoijcleaow;

    public ue0(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, MaterialButton materialButton, MaterialButton materialButton2, ShapeableImageView shapeableImageView, TextView textView, TextView textView2, TextView textView3) {
        this.f58843iobyxmoadg = constraintLayout;
        this.f58847zoijcleaow = appCompatTextView;
        this.f58845ppxfxbqfkf = materialButton;
        this.f58846wkgbmnqykc = materialButton2;
        this.f58841eablkybsjg = shapeableImageView;
        this.f58842gxszxtbevo = textView2;
        this.f58844lqeggnwhkg = textView3;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f58843iobyxmoadg;
    }
}
