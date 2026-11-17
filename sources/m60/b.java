package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CardView f65351iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f65352ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f65353zoijcleaow;

    private b(CardView cardView, AppCompatImageView appCompatImageView, MaterialTextView materialTextView) {
        this.f65351iobyxmoadg = cardView;
        this.f65353zoijcleaow = appCompatImageView;
        this.f65352ppxfxbqfkf = materialTextView;
    }

    public static b iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.ivIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = pm.eablkybsjg.tvTitle;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                return new b((CardView) view, appCompatImageView, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static b ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.view_chip, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f65351iobyxmoadg;
    }
}
