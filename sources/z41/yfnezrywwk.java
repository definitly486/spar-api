package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class yfnezrywwk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f128496iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final LinearLayout f128497ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f128498wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f128499zoijcleaow;

    private yfnezrywwk(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, MaterialTextView materialTextView) {
        this.f128496iobyxmoadg = linearLayout;
        this.f128499zoijcleaow = appCompatImageView;
        this.f128497ppxfxbqfkf = linearLayout2;
        this.f128498wkgbmnqykc = materialTextView;
    }

    public static yfnezrywwk iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.ivIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i14 = vk0.wkgbmnqykc.tvServiceName;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i14);
            if (materialTextView != null) {
                return new yfnezrywwk(linearLayout, appCompatImageView, linearLayout, materialTextView);
            }
            i13 = i14;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static yfnezrywwk ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_shop_service_dialog_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f128496iobyxmoadg;
    }
}
