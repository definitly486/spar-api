package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f66106eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final View f66107gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final RelativeLayout f66108iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final RelativeLayout f66109ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f66110wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final View f66111zoijcleaow;

    private y(RelativeLayout relativeLayout, View view, RelativeLayout relativeLayout2, MaterialTextView materialTextView, MaterialTextView materialTextView2, View view2) {
        this.f66108iobyxmoadg = relativeLayout;
        this.f66111zoijcleaow = view;
        this.f66109ppxfxbqfkf = relativeLayout2;
        this.f66110wkgbmnqykc = materialTextView;
        this.f66106eablkybsjg = materialTextView2;
        this.f66107gxszxtbevo = view2;
    }

    public static y iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = pm.eablkybsjg.button;
        View viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg2 != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i13 = pm.eablkybsjg.tvQuantity;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                i13 = pm.eablkybsjg.tvWeight;
                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = pm.eablkybsjg.vMask))) != null) {
                    return new y(relativeLayout, viewIobyxmoadg2, relativeLayout, materialTextView, materialTextView2, viewIobyxmoadg);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static y ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.view_quantity_type_toggle, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f66108iobyxmoadg;
    }
}
