package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f65474iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final f f65475ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final jrbgnlbqoe f65476wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final d f65477zoijcleaow;

    private e(FrameLayout frameLayout, d dVar, f fVar, jrbgnlbqoe jrbgnlbqoeVar) {
        this.f65474iobyxmoadg = frameLayout;
        this.f65477zoijcleaow = dVar;
        this.f65475ppxfxbqfkf = fVar;
        this.f65476wkgbmnqykc = jrbgnlbqoeVar;
    }

    public static e iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.container_combo_list;
        View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg != null) {
            d dVarIobyxmoadg = d.iobyxmoadg(viewIobyxmoadg);
            int i14 = pm.eablkybsjg.container_combo_single;
            View viewIobyxmoadg2 = a6.zoijcleaow.iobyxmoadg(view, i14);
            if (viewIobyxmoadg2 != null) {
                f fVarIobyxmoadg = f.iobyxmoadg(viewIobyxmoadg2);
                int i15 = pm.eablkybsjg.container_shimmer;
                View viewIobyxmoadg3 = a6.zoijcleaow.iobyxmoadg(view, i15);
                if (viewIobyxmoadg3 != null) {
                    return new e((FrameLayout) view, dVarIobyxmoadg, fVarIobyxmoadg, jrbgnlbqoe.iobyxmoadg(viewIobyxmoadg3));
                }
                i13 = i15;
            } else {
                i13 = i14;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static e ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.view_combo_set_layout_custom_view, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f65474iobyxmoadg;
    }
}
