package sx1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialTextView f108631iobyxmoadg;

    private dxjokdxxww(MaterialTextView materialTextView) {
        this.f108631iobyxmoadg = materialTextView;
    }

    public static dxjokdxxww iobyxmoadg(View view) {
        if (view != null) {
            return new dxjokdxxww((MaterialTextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static dxjokdxxww ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(nx1.gxszxtbevo.purchase_list_detail_empty_section_message, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialTextView getRoot() {
        return this.f108631iobyxmoadg;
    }
}
