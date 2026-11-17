package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialTextView f15294iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f15295zoijcleaow;

    private dxjokdxxww(MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f15294iobyxmoadg = materialTextView;
        this.f15295zoijcleaow = materialTextView2;
    }

    public static dxjokdxxww iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MaterialTextView materialTextView = (MaterialTextView) view;
        return new dxjokdxxww(materialTextView, materialTextView);
    }

    public static dxjokdxxww ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_header_one, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialTextView getRoot() {
        return this.f15294iobyxmoadg;
    }
}
