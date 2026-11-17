package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;

/* JADX INFO: loaded from: classes5.dex */
public final class wypolnanlu implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AppCompatCheckBox f128468iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatCheckBox f128469zoijcleaow;

    private wypolnanlu(AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2) {
        this.f128468iobyxmoadg = appCompatCheckBox;
        this.f128469zoijcleaow = appCompatCheckBox2;
    }

    public static wypolnanlu iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view;
        return new wypolnanlu(appCompatCheckBox, appCompatCheckBox);
    }

    public static wypolnanlu ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(vk0.eablkybsjg.item_filter_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public AppCompatCheckBox getRoot() {
        return this.f128468iobyxmoadg;
    }
}
