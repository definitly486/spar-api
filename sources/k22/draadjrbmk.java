package k22;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialTextView f53544iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f53545zoijcleaow;

    private draadjrbmk(MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f53544iobyxmoadg = materialTextView;
        this.f53545zoijcleaow = materialTextView2;
    }

    public static draadjrbmk iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MaterialTextView materialTextView = (MaterialTextView) view;
        return new draadjrbmk(materialTextView, materialTextView);
    }

    public static draadjrbmk ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(s12.ppxfxbqfkf.item_scan_go_cart_regular_header, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialTextView getRoot() {
        return this.f53544iobyxmoadg;
    }
}
