package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class gtknphoqwx implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialTextView f15302iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f15303zoijcleaow;

    private gtknphoqwx(MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f15302iobyxmoadg = materialTextView;
        this.f15303zoijcleaow = materialTextView2;
    }

    public static gtknphoqwx iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MaterialTextView materialTextView = (MaterialTextView) view;
        return new gtknphoqwx(materialTextView, materialTextView);
    }

    public static gtknphoqwx ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_header_three, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialTextView getRoot() {
        return this.f15302iobyxmoadg;
    }
}
