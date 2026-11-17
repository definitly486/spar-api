package m60;

import android.view.View;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialCardView f65513iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageView f65514zoijcleaow;

    private g(MaterialCardView materialCardView, ImageView imageView) {
        this.f65513iobyxmoadg = materialCardView;
        this.f65514zoijcleaow = imageView;
    }

    public static g iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.ivProductImage;
        ImageView imageView = (ImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageView != null) {
            return new g((MaterialCardView) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f65513iobyxmoadg;
    }
}
