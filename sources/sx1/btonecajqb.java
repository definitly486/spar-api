package sx1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialTextView f108622iobyxmoadg;

    private btonecajqb(MaterialTextView materialTextView) {
        this.f108622iobyxmoadg = materialTextView;
    }

    public static btonecajqb iobyxmoadg(View view) {
        if (view != null) {
            return new btonecajqb((MaterialTextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static btonecajqb ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(nx1.gxszxtbevo.purchase_list_detail_hint, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialTextView getRoot() {
        return this.f108622iobyxmoadg;
    }
}
