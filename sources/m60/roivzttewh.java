package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class roivzttewh implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f65942iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final LinearLayout f65943ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f65944wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f65945zoijcleaow;

    private roivzttewh(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, MaterialTextView materialTextView) {
        this.f65942iobyxmoadg = linearLayout;
        this.f65945zoijcleaow = appCompatImageView;
        this.f65943ppxfxbqfkf = linearLayout2;
        this.f65944wkgbmnqykc = materialTextView;
    }

    public static roivzttewh iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.ivIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (appCompatImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i14 = pm.eablkybsjg.tvServiceName;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i14);
            if (materialTextView != null) {
                return new roivzttewh(linearLayout, appCompatImageView, linearLayout, materialTextView);
            }
            i13 = i14;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static roivzttewh ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_shop_service_dialog, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f65942iobyxmoadg;
    }
}
