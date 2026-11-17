package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.proloyalty.legacy.presentation.view.filter.CategoryButton;

/* JADX INFO: loaded from: classes5.dex */
public final class bfopjjpdmp implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CategoryButton f127836iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final CategoryButton f127837zoijcleaow;

    private bfopjjpdmp(CategoryButton categoryButton, CategoryButton categoryButton2) {
        this.f127836iobyxmoadg = categoryButton;
        this.f127837zoijcleaow = categoryButton2;
    }

    public static bfopjjpdmp iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CategoryButton categoryButton = (CategoryButton) view;
        return new bfopjjpdmp(categoryButton, categoryButton);
    }

    public static bfopjjpdmp ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_subcategory_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public CategoryButton getRoot() {
        return this.f127836iobyxmoadg;
    }
}
