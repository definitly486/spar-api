package ps;

import a6.zoijcleaow;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f77262eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f77263gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f77264iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatImageView f77265ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f77266wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f77267zoijcleaow;

    private iobyxmoadg(View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f77264iobyxmoadg = view;
        this.f77267zoijcleaow = appCompatImageView;
        this.f77265ppxfxbqfkf = appCompatImageView2;
        this.f77266wkgbmnqykc = materialTextView;
        this.f77262eablkybsjg = materialTextView2;
        this.f77263gxszxtbevo = materialTextView3;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        int i13 = ls.iobyxmoadg.appCompatImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            i13 = ls.iobyxmoadg.ivQr;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) zoijcleaow.iobyxmoadg(view, i13);
            if (appCompatImageView2 != null) {
                i13 = ls.iobyxmoadg.tvBalance;
                MaterialTextView materialTextView = (MaterialTextView) zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView != null) {
                    i13 = ls.iobyxmoadg.tvBalanceCaption;
                    MaterialTextView materialTextView2 = (MaterialTextView) zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView2 != null) {
                        i13 = ls.iobyxmoadg.tvDescCaption;
                        MaterialTextView materialTextView3 = (MaterialTextView) zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView3 != null) {
                            return new iobyxmoadg(view, appCompatImageView, appCompatImageView2, materialTextView, materialTextView2, materialTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static iobyxmoadg zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(ls.zoijcleaow.view_card, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f77264iobyxmoadg;
    }
}
