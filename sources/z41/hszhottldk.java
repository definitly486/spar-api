package z41;

import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes5.dex */
public final class hszhottldk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f128090iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final LottieAnimationView f128091zoijcleaow;

    private hszhottldk(FrameLayout frameLayout, LottieAnimationView lottieAnimationView) {
        this.f128090iobyxmoadg = frameLayout;
        this.f128091zoijcleaow = lottieAnimationView;
    }

    public static hszhottldk iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.lvCopyToCheck;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (lottieAnimationView != null) {
            return new hszhottldk((FrameLayout) view, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f128090iobyxmoadg;
    }
}
