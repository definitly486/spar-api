package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f127808eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final View f127809gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final RelativeLayout f127810iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final RelativeLayout f127811ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialTextView f127812wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final View f127813zoijcleaow;

    private a(RelativeLayout relativeLayout, View view, RelativeLayout relativeLayout2, MaterialTextView materialTextView, MaterialTextView materialTextView2, View view2) {
        this.f127810iobyxmoadg = relativeLayout;
        this.f127813zoijcleaow = view;
        this.f127811ppxfxbqfkf = relativeLayout2;
        this.f127812wkgbmnqykc = materialTextView;
        this.f127808eablkybsjg = materialTextView2;
        this.f127809gxszxtbevo = view2;
    }

    public static a iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = vk0.wkgbmnqykc.button;
        View viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg2 != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i13 = vk0.wkgbmnqykc.tvQuantity;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                i13 = vk0.wkgbmnqykc.tvWeight;
                MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialTextView2 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = vk0.wkgbmnqykc.vMask))) != null) {
                    return new a(relativeLayout, viewIobyxmoadg2, relativeLayout, materialTextView, materialTextView2, viewIobyxmoadg);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static a ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.view_quantity_type_toggle_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f127810iobyxmoadg;
    }
}
