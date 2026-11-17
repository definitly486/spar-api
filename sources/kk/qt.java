package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes3.dex */
public final class qt implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatTextView f58234eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f58235iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Group f58236ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final LottieAnimationView f58237wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatTextView f58238zoijcleaow;

    public qt(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, Group group, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView2) {
        this.f58235iobyxmoadg = constraintLayout;
        this.f58238zoijcleaow = appCompatTextView;
        this.f58236ppxfxbqfkf = group;
        this.f58237wkgbmnqykc = lottieAnimationView;
        this.f58234eablkybsjg = appCompatTextView2;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f58235iobyxmoadg;
    }
}
