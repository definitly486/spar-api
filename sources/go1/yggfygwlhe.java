package go1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.divider.MaterialDivider;

/* JADX INFO: loaded from: classes6.dex */
public final class yggfygwlhe implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f38113iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final RecyclerView f38114ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialDivider f38115wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageButton f38116zoijcleaow;

    private yggfygwlhe(LinearLayout linearLayout, ImageButton imageButton, RecyclerView recyclerView, MaterialDivider materialDivider) {
        this.f38113iobyxmoadg = linearLayout;
        this.f38116zoijcleaow = imageButton;
        this.f38114ppxfxbqfkf = recyclerView;
        this.f38115wkgbmnqykc = materialDivider;
    }

    public static yggfygwlhe iobyxmoadg(View view) {
        int i13 = on1.zoijcleaow.btnClose;
        ImageButton imageButton = (ImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageButton != null) {
            i13 = on1.zoijcleaow.rvTutorialItems;
            RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (recyclerView != null) {
                i13 = on1.zoijcleaow.vItemDivider;
                MaterialDivider materialDivider = (MaterialDivider) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialDivider != null) {
                    return new yggfygwlhe((LinearLayout) view, imageButton, recyclerView, materialDivider);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static yggfygwlhe ppxfxbqfkf(LayoutInflater layoutInflater) {
        return wkgbmnqykc(layoutInflater, null, false);
    }

    public static yggfygwlhe wkgbmnqykc(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(on1.ppxfxbqfkf.popup_window_scan_go_tutorial_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f38113iobyxmoadg;
    }
}
