package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class uwvvkdfqfp implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AppCompatImageView f128414iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f128415zoijcleaow;

    private uwvvkdfqfp(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f128414iobyxmoadg = appCompatImageView;
        this.f128415zoijcleaow = appCompatImageView2;
    }

    public static uwvvkdfqfp iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view;
        return new uwvvkdfqfp(appCompatImageView, appCompatImageView);
    }

    public static uwvvkdfqfp ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_services_icon_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public AppCompatImageView getRoot() {
        return this.f128414iobyxmoadg;
    }
}
