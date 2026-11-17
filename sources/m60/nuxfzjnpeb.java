package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class nuxfzjnpeb implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AppCompatImageView f65832iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f65833zoijcleaow;

    private nuxfzjnpeb(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f65832iobyxmoadg = appCompatImageView;
        this.f65833zoijcleaow = appCompatImageView2;
    }

    public static nuxfzjnpeb iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view;
        return new nuxfzjnpeb(appCompatImageView, appCompatImageView);
    }

    public static nuxfzjnpeb ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_services_icon, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public AppCompatImageView getRoot() {
        return this.f65832iobyxmoadg;
    }
}
