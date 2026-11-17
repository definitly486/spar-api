package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.legacy.presentation.view.ComboSetView;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ComboSetView f15336iobyxmoadg;

    private ppxfxbqfkf(ComboSetView comboSetView) {
        this.f15336iobyxmoadg = comboSetView;
    }

    public static ppxfxbqfkf iobyxmoadg(View view) {
        if (view != null) {
            return new ppxfxbqfkf((ComboSetView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static ppxfxbqfkf ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_combo_set, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ComboSetView getRoot() {
        return this.f15336iobyxmoadg;
    }
}
