package uq1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MaterialTextView f114150iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialTextView f114151zoijcleaow;

    private btonecajqb(MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f114150iobyxmoadg = materialTextView;
        this.f114151zoijcleaow = materialTextView2;
    }

    public static btonecajqb iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MaterialTextView materialTextView = (MaterialTextView) view;
        return new btonecajqb(materialTextView, materialTextView);
    }

    public static btonecajqb ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(mq1.zoijcleaow.item_special_banner_header_six_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public MaterialTextView getRoot() {
        return this.f114150iobyxmoadg;
    }
}
