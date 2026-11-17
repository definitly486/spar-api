package yi1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialTextView f125402iobyxmoadg;

    private dxjokdxxww(MaterialTextView materialTextView) {
        this.f125402iobyxmoadg = materialTextView;
    }

    public static dxjokdxxww iobyxmoadg(View view) {
        if (view != null) {
            return new dxjokdxxww((MaterialTextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static dxjokdxxww ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(ti1.gxszxtbevo.purchase_list_detail_empty_section_message_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialTextView getRoot() {
        return this.f125402iobyxmoadg;
    }
}
