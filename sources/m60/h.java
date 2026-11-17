package m60;

import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f65542iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final LottieAnimationView f65543zoijcleaow;

    private h(FrameLayout frameLayout, LottieAnimationView lottieAnimationView) {
        this.f65542iobyxmoadg = frameLayout;
        this.f65543zoijcleaow = lottieAnimationView;
    }

    public static h iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.lvCopyToCheck;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (lottieAnimationView != null) {
            return new h((FrameLayout) view, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f65542iobyxmoadg;
    }
}
