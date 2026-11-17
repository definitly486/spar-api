package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class ydmasvzmpa implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f128492iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f128493ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f128494wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialCardView f128495zoijcleaow;

    private ydmasvzmpa(MaterialCardView materialCardView, MaterialCardView materialCardView2, AppCompatImageView appCompatImageView, MaterialTextView materialTextView) {
        this.f128492iobyxmoadg = materialCardView;
        this.f128495zoijcleaow = materialCardView2;
        this.f128493ppxfxbqfkf = appCompatImageView;
        this.f128494wkgbmnqykc = materialTextView;
    }

    public static ydmasvzmpa iobyxmoadg(View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i13 = vk0.wkgbmnqykc.ivIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = vk0.wkgbmnqykc.tvTitle;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                return new ydmasvzmpa(materialCardView, materialCardView, appCompatImageView, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static ydmasvzmpa ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_shop_service_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f128492iobyxmoadg;
    }
}
