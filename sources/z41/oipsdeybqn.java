package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class oipsdeybqn implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final RecyclerView f128291iobyxmoadg;

    private oipsdeybqn(RecyclerView recyclerView) {
        this.f128291iobyxmoadg = recyclerView;
    }

    public static oipsdeybqn iobyxmoadg(View view) {
        if (view != null) {
            return new oipsdeybqn((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static oipsdeybqn ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_square_cards_list_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f128291iobyxmoadg;
    }
}
