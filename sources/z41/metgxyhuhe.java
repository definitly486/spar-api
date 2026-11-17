package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class metgxyhuhe implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f128260iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f128261ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final RecyclerView f128262zoijcleaow;

    private metgxyhuhe(FrameLayout frameLayout, RecyclerView recyclerView, MaterialTextView materialTextView) {
        this.f128260iobyxmoadg = frameLayout;
        this.f128262zoijcleaow = recyclerView;
        this.f128261ppxfxbqfkf = materialTextView;
    }

    public static metgxyhuhe iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.rvCards;
        RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (recyclerView != null) {
            i13 = vk0.wkgbmnqykc.tvEmptyCards;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                return new metgxyhuhe((FrameLayout) view, recyclerView, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static metgxyhuhe ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_saved_cards_list_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f128260iobyxmoadg;
    }
}
