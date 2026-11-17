package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.specialbanner.impl.presentation.views.iconsone.IconsOneBlockLayoutView;

/* JADX INFO: loaded from: classes6.dex */
public final class agtfadlqog implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final IconsOneBlockLayoutView f15286iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final IconsOneBlockLayoutView f15287zoijcleaow;

    private agtfadlqog(IconsOneBlockLayoutView iconsOneBlockLayoutView, IconsOneBlockLayoutView iconsOneBlockLayoutView2) {
        this.f15286iobyxmoadg = iconsOneBlockLayoutView;
        this.f15287zoijcleaow = iconsOneBlockLayoutView2;
    }

    public static agtfadlqog iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        IconsOneBlockLayoutView iconsOneBlockLayoutView = (IconsOneBlockLayoutView) view;
        return new agtfadlqog(iconsOneBlockLayoutView, iconsOneBlockLayoutView);
    }

    public static agtfadlqog ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_icons_one_block, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public IconsOneBlockLayoutView getRoot() {
        return this.f15286iobyxmoadg;
    }
}
