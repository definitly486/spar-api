package kk;

import android.view.ViewTreeObserver;
import spay.sdk.view.SpayDotsLoaderView;

/* JADX INFO: loaded from: classes3.dex */
public final class rc implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ SpayDotsLoaderView f58305yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ SpayDotsLoaderView f58306zdlpuopuiu;

    public rc(SpayDotsLoaderView spayDotsLoaderView, SpayDotsLoaderView spayDotsLoaderView2) {
        this.f58306zdlpuopuiu = spayDotsLoaderView;
        this.f58305yggfygwlhe = spayDotsLoaderView2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        SpayDotsLoaderView spayDotsLoaderView = this.f58306zdlpuopuiu;
        int i13 = SpayDotsLoaderView.f107877m;
        spayDotsLoaderView.b();
        this.f58305yggfygwlhe.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
