package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class lxfrhoxuzk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f65780iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f65781ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final View f65782zoijcleaow;

    private lxfrhoxuzk(LinearLayout linearLayout, View view, MaterialTextView materialTextView) {
        this.f65780iobyxmoadg = linearLayout;
        this.f65782zoijcleaow = view;
        this.f65781ppxfxbqfkf = materialTextView;
    }

    public static lxfrhoxuzk iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.divider;
        View viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, i13);
        if (viewIobyxmoadg != null) {
            i13 = pm.eablkybsjg.tv_row_title;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                return new lxfrhoxuzk((LinearLayout) view, viewIobyxmoadg, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static lxfrhoxuzk ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_table_banner, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f65780iobyxmoadg;
    }
}
