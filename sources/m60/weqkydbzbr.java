package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class weqkydbzbr implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FrameLayout f66057iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialTextView f66058ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final RecyclerView f66059zoijcleaow;

    private weqkydbzbr(FrameLayout frameLayout, RecyclerView recyclerView, MaterialTextView materialTextView) {
        this.f66057iobyxmoadg = frameLayout;
        this.f66059zoijcleaow = recyclerView;
        this.f66058ppxfxbqfkf = materialTextView;
    }

    public static weqkydbzbr iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.rvCards;
        RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (recyclerView != null) {
            i13 = pm.eablkybsjg.tvEmptyCards;
            MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialTextView != null) {
                return new weqkydbzbr((FrameLayout) view, recyclerView, materialTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static weqkydbzbr ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_saved_cards_list, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f66057iobyxmoadg;
    }
}
