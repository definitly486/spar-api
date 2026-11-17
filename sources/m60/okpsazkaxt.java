package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class okpsazkaxt implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f65853iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialCardView f65854ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageView f65855zoijcleaow;

    private okpsazkaxt(MaterialCardView materialCardView, ImageView imageView, MaterialCardView materialCardView2) {
        this.f65853iobyxmoadg = materialCardView;
        this.f65855zoijcleaow = imageView;
        this.f65854ppxfxbqfkf = materialCardView2;
    }

    public static okpsazkaxt iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.ivLogo;
        ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
        }
        MaterialCardView materialCardView = (MaterialCardView) view;
        return new okpsazkaxt(materialCardView, imageView, materialCardView);
    }

    public static okpsazkaxt ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_myspar_brand, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f65853iobyxmoadg;
    }
}
