package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.legacy.presentation.view.filter.CategoryButton;

/* JADX INFO: loaded from: classes4.dex */
public final class igdgnonuha implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CategoryButton f65573iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final CategoryButton f65574zoijcleaow;

    private igdgnonuha(CategoryButton categoryButton, CategoryButton categoryButton2) {
        this.f65573iobyxmoadg = categoryButton;
        this.f65574zoijcleaow = categoryButton2;
    }

    public static igdgnonuha iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CategoryButton categoryButton = (CategoryButton) view;
        return new igdgnonuha(categoryButton, categoryButton);
    }

    public static igdgnonuha ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(pm.gxszxtbevo.item_subcategory, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public CategoryButton getRoot() {
        return this.f65573iobyxmoadg;
    }
}
