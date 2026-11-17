package kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class uc extends o7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(af diffUtilCallback) {
        super(null, diffUtilCallback);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(diffUtilCallback, "diffUtilCallback");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public final RecyclerView.iozdgvuglv onCreateViewHolder(ViewGroup parent, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.spay_rv_item_bnpl_graph_section, parent, false);
        int i14 = R.id.spay_sribgs_section;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(viewInflate, i14);
        if (appCompatImageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
        }
        ikoacuggdj ikoacuggdjVar = new ikoacuggdj((FrameLayout) viewInflate, appCompatImageView);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVar, "inflate(\n            Lay…          false\n        )");
        return new cg(ikoacuggdjVar);
    }
}
