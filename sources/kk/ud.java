package kk;

import android.view.animation.Animation;
import spay.sdk.view.SpayDotsLoaderView;

/* JADX INFO: loaded from: classes3.dex */
public final class ud implements Animation.AnimationListener {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final /* synthetic */ SpayDotsLoaderView f58839iobyxmoadg;

    public ud(SpayDotsLoaderView spayDotsLoaderView) {
        this.f58839iobyxmoadg = spayDotsLoaderView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        SpayDotsLoaderView spayDotsLoaderView = this.f58839iobyxmoadg;
        int i13 = SpayDotsLoaderView.f107877m;
        spayDotsLoaderView.b();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animation, "animation");
    }
}
