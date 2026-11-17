package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class uawqvzlxes implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f66030iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialCardView f66031ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f66032zoijcleaow;

    private uawqvzlxes(MaterialCardView materialCardView, AppCompatImageView appCompatImageView, MaterialCardView materialCardView2) {
        this.f66030iobyxmoadg = materialCardView;
        this.f66032zoijcleaow = appCompatImageView;
        this.f66031ppxfxbqfkf = materialCardView2;
    }

    public static uawqvzlxes iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.ivLogo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
        }
        MaterialCardView materialCardView = (MaterialCardView) view;
        return new uawqvzlxes(materialCardView, appCompatImageView, materialCardView);
    }

    public static uawqvzlxes ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_sponsor, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f66030iobyxmoadg;
    }
}
