package uq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.TableBlockLayoutView;

/* JADX INFO: loaded from: classes6.dex */
public final class esjtqupxsv implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TableBlockLayoutView f114162iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final TableBlockLayoutView f114163zoijcleaow;

    private esjtqupxsv(TableBlockLayoutView tableBlockLayoutView, TableBlockLayoutView tableBlockLayoutView2) {
        this.f114162iobyxmoadg = tableBlockLayoutView;
        this.f114163zoijcleaow = tableBlockLayoutView2;
    }

    public static esjtqupxsv iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TableBlockLayoutView tableBlockLayoutView = (TableBlockLayoutView) view;
        return new esjtqupxsv(tableBlockLayoutView, tableBlockLayoutView);
    }

    public static esjtqupxsv ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(mq1.zoijcleaow.item_special_banner_table_block_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public TableBlockLayoutView getRoot() {
        return this.f114162iobyxmoadg;
    }
}
