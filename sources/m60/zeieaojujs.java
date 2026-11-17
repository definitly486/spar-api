package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class zeieaojujs implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialTextView f66192iobyxmoadg;

    private zeieaojujs(MaterialTextView materialTextView) {
        this.f66192iobyxmoadg = materialTextView;
    }

    public static zeieaojujs iobyxmoadg(View view) {
        if (view != null) {
            return new zeieaojujs((MaterialTextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static zeieaojujs ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_saved_cards_subtitle, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialTextView getRoot() {
        return this.f66192iobyxmoadg;
    }
}
