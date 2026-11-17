package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class iwxlajgraz implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final RecyclerView f65625iobyxmoadg;

    private iwxlajgraz(RecyclerView recyclerView) {
        this.f65625iobyxmoadg = recyclerView;
    }

    public static iwxlajgraz iobyxmoadg(View view) {
        if (view != null) {
            return new iwxlajgraz((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static iwxlajgraz ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_square_cards_list, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f65625iobyxmoadg;
    }
}
