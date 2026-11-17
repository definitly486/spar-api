package androidx.preference;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
    }

    @Override // androidx.preference.Preference
    public void hcddaimhww(nufgyqmvbu nufgyqmvbuVar) {
        super.hcddaimhww(nufgyqmvbuVar);
        if (Build.VERSION.SDK_INT >= 28) {
            nufgyqmvbuVar.itemView.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public boolean istkbnxepw() {
        return false;
    }

    @Override // androidx.preference.Preference
    public boolean oipsdeybqn() {
        return !super.istkbnxepw();
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i1.gtknphoqwx.iobyxmoadg(context, dxjokdxxww.preferenceCategoryStyle, R.attr.preferenceCategoryStyle));
    }
}
