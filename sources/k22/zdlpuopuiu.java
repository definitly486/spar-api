package k22;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class zdlpuopuiu implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f53652iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final RecyclerView f53653ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final View f53654wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageButton f53655zoijcleaow;

    private zdlpuopuiu(LinearLayout linearLayout, ImageButton imageButton, RecyclerView recyclerView, View view) {
        this.f53652iobyxmoadg = linearLayout;
        this.f53655zoijcleaow = imageButton;
        this.f53653ppxfxbqfkf = recyclerView;
        this.f53654wkgbmnqykc = view;
    }

    public static zdlpuopuiu iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = s12.zoijcleaow.btnClose;
        ImageButton imageButton = (ImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageButton != null) {
            i13 = s12.zoijcleaow.rvTutorialItems;
            RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (recyclerView != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = s12.zoijcleaow.vItemDivider))) != null) {
                return new zdlpuopuiu((LinearLayout) view, imageButton, recyclerView, viewIobyxmoadg);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static zdlpuopuiu ppxfxbqfkf(LayoutInflater layoutInflater) {
        return wkgbmnqykc(layoutInflater, null, false);
    }

    public static zdlpuopuiu wkgbmnqykc(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(s12.ppxfxbqfkf.popup_window_scan_go_tutorial, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f53652iobyxmoadg;
    }
}
