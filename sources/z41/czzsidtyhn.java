package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class czzsidtyhn implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialTextView f127900iobyxmoadg;

    private czzsidtyhn(MaterialTextView materialTextView) {
        this.f127900iobyxmoadg = materialTextView;
    }

    public static czzsidtyhn iobyxmoadg(View view) {
        if (view != null) {
            return new czzsidtyhn((MaterialTextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static czzsidtyhn ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_saved_cards_subtitle_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialTextView getRoot() {
        return this.f127900iobyxmoadg;
    }
}
