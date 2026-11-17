package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.legacy.presentation.view.ComboSetCardItemView;

/* JADX INFO: loaded from: classes4.dex */
public final class crxdokpmqz implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ComboSetCardItemView f65419iobyxmoadg;

    private crxdokpmqz(ComboSetCardItemView comboSetCardItemView) {
        this.f65419iobyxmoadg = comboSetCardItemView;
    }

    public static crxdokpmqz iobyxmoadg(View view) {
        if (view != null) {
            return new crxdokpmqz((ComboSetCardItemView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static crxdokpmqz ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_combo_set_list_layout, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ComboSetCardItemView getRoot() {
        return this.f65419iobyxmoadg;
    }
}
