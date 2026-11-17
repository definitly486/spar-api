package kk;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class te0 implements e7.nufgyqmvbu.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final /* synthetic */ Drawable f58655eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final /* synthetic */ ShimmerFrameLayout f58656ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final /* synthetic */ ImageView f58657wkgbmnqykc;

    public te0(ShimmerFrameLayout shimmerFrameLayout, ImageView imageView, Drawable drawable) {
        this.f58656ppxfxbqfkf = shimmerFrameLayout;
        this.f58657wkgbmnqykc = imageView;
        this.f58655eablkybsjg = drawable;
    }

    @Override // e7.nufgyqmvbu.zoijcleaow
    public final void onError(e7.nufgyqmvbu request, e7.gxszxtbevo result) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("IMAGE REQUEST LISTENER EXCEPTION").ppxfxbqfkf(result.ppxfxbqfkf());
        ShimmerFrameLayout shimmerFrameLayout = this.f58656ppxfxbqfkf;
        shimmerFrameLayout.wkgbmnqykc();
        shimmerFrameLayout.setVisibility(8);
        this.f58657wkgbmnqykc.setImageDrawable(this.f58655eablkybsjg);
        this.f58657wkgbmnqykc.setVisibility(0);
        super.onError(request, result);
    }

    @Override // e7.nufgyqmvbu.zoijcleaow
    public final void onStart(e7.nufgyqmvbu request) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        ShimmerFrameLayout shimmerFrameLayout = this.f58656ppxfxbqfkf;
        shimmerFrameLayout.ppxfxbqfkf();
        shimmerFrameLayout.setVisibility(0);
        super.onStart(request);
    }

    @Override // e7.nufgyqmvbu.zoijcleaow
    public final void onSuccess(e7.nufgyqmvbu request, e7.rgvfuqvkyq result) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        ShimmerFrameLayout shimmerFrameLayout = this.f58656ppxfxbqfkf;
        shimmerFrameLayout.wkgbmnqykc();
        shimmerFrameLayout.setVisibility(8);
        this.f58657wkgbmnqykc.setVisibility(0);
        super.onSuccess(request, result);
    }
}
