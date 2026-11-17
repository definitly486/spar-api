package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes5.dex */
public final class sflfametgt implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f128379iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialCardView f128380ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f128381zoijcleaow;

    private sflfametgt(MaterialCardView materialCardView, AppCompatImageView appCompatImageView, MaterialCardView materialCardView2) {
        this.f128379iobyxmoadg = materialCardView;
        this.f128381zoijcleaow = appCompatImageView;
        this.f128380ppxfxbqfkf = materialCardView2;
    }

    public static sflfametgt iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.ivLogo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
        }
        MaterialCardView materialCardView = (MaterialCardView) view;
        return new sflfametgt(materialCardView, appCompatImageView, materialCardView);
    }

    public static sflfametgt ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_sponsor_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f128379iobyxmoadg;
    }
}
