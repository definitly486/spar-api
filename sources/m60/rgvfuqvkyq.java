package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes4.dex */
public final class rgvfuqvkyq implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CardView f65922iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f65923ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final CardView f65924zoijcleaow;

    private rgvfuqvkyq(CardView cardView, CardView cardView2, AppCompatImageView appCompatImageView) {
        this.f65922iobyxmoadg = cardView;
        this.f65924zoijcleaow = cardView2;
        this.f65923ppxfxbqfkf = appCompatImageView;
    }

    public static rgvfuqvkyq iobyxmoadg(View view) {
        CardView cardView = (CardView) view;
        int i13 = pm.eablkybsjg.ivPhoto;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            return new rgvfuqvkyq(cardView, cardView, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static rgvfuqvkyq ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.dialog_fullscreen_photo, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f65922iobyxmoadg;
    }
}
