package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes5.dex */
public final class draadjrbmk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CardView f127910iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f127911ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final CardView f127912zoijcleaow;

    private draadjrbmk(CardView cardView, CardView cardView2, AppCompatImageView appCompatImageView) {
        this.f127910iobyxmoadg = cardView;
        this.f127912zoijcleaow = cardView2;
        this.f127911ppxfxbqfkf = appCompatImageView;
    }

    public static draadjrbmk iobyxmoadg(View view) {
        CardView cardView = (CardView) view;
        int i13 = vk0.wkgbmnqykc.ivPhoto;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            return new draadjrbmk(cardView, cardView, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static draadjrbmk ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.dialog_fullscreen_photo_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f127910iobyxmoadg;
    }
}
