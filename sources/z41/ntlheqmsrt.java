package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes5.dex */
public final class ntlheqmsrt implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f128268iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialCardView f128269ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageView f128270zoijcleaow;

    private ntlheqmsrt(MaterialCardView materialCardView, ImageView imageView, MaterialCardView materialCardView2) {
        this.f128268iobyxmoadg = materialCardView;
        this.f128270zoijcleaow = imageView;
        this.f128269ppxfxbqfkf = materialCardView2;
    }

    public static ntlheqmsrt iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.ivLogo;
        ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
        }
        MaterialCardView materialCardView = (MaterialCardView) view;
        return new ntlheqmsrt(materialCardView, imageView, materialCardView);
    }

    public static ntlheqmsrt ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_myspar_brand_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f128268iobyxmoadg;
    }
}
