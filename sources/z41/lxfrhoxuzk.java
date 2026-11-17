package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class lxfrhoxuzk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f128256iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f128257zoijcleaow;

    private lxfrhoxuzk(View view, MaterialTextView materialTextView) {
        this.f128256iobyxmoadg = view;
        this.f128257zoijcleaow = materialTextView;
    }

    public static lxfrhoxuzk iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.tvTitle;
        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialTextView != null) {
            return new lxfrhoxuzk(view, materialTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static lxfrhoxuzk zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(vk0.eablkybsjg.view_category_button_proloyalty, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f128256iobyxmoadg;
    }
}
