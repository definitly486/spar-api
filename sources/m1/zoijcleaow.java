package m1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface zoijcleaow extends MenuItem {
    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    zoijcleaow iobyxmoadg(v1.zoijcleaow zoijcleaowVar);

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i13);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c13, int i13);

    @Override // android.view.MenuItem
    zoijcleaow setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c13, int i13);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c13, char c14, int i13, int i14);

    @Override // android.view.MenuItem
    void setShowAsAction(int i13);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i13);

    @Override // android.view.MenuItem
    zoijcleaow setTooltipText(CharSequence charSequence);

    v1.zoijcleaow zoijcleaow();
}
