package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class hcddaimhww extends ylkuphrtab implements pkzmftpjix {

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private static Method f3305ikoacuggdj;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private pkzmftpjix f3306jhduphickx;

    static class iobyxmoadg {
        static void iobyxmoadg(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void zoijcleaow(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class ppxfxbqfkf extends iozdgvuglv {

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        final int f3307lmojexxdyd;

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        private MenuItem f3308pkzmftpjix;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        final int f3309wwaezpbzkn;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        private pkzmftpjix f3310ylkuphrtab;

        public ppxfxbqfkf(Context context, boolean z13) {
            super(context, z13);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f3307lmojexxdyd = 21;
                this.f3309wwaezpbzkn = 22;
            } else {
                this.f3307lmojexxdyd = 22;
                this.f3309wwaezpbzkn = 21;
            }
        }

        @Override // androidx.appcompat.widget.iozdgvuglv
        public /* bridge */ /* synthetic */ boolean eablkybsjg(MotionEvent motionEvent, int i13) {
            return super.eablkybsjg(motionEvent, i13);
        }

        @Override // androidx.appcompat.widget.iozdgvuglv, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.iozdgvuglv, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.iozdgvuglv, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.iozdgvuglv, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.iozdgvuglv, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.wkgbmnqykc wkgbmnqykcVar;
            int headersCount;
            int iPointToPosition;
            int i13;
            if (this.f3310ylkuphrtab != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    wkgbmnqykcVar = (androidx.appcompat.view.menu.wkgbmnqykc) headerViewListAdapter.getWrappedAdapter();
                } else {
                    wkgbmnqykcVar = (androidx.appcompat.view.menu.wkgbmnqykc) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.lqeggnwhkg item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i13 = iPointToPosition - headersCount) < 0 || i13 >= wkgbmnqykcVar.getCount()) ? null : wkgbmnqykcVar.getItem(i13);
                MenuItem menuItem = this.f3308pkzmftpjix;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.eablkybsjg eablkybsjgVarZoijcleaow = wkgbmnqykcVar.zoijcleaow();
                    if (menuItem != null) {
                        this.f3310ylkuphrtab.ojitshcjhn(eablkybsjgVarZoijcleaow, menuItem);
                    }
                    this.f3308pkzmftpjix = item;
                    if (item != null) {
                        this.f3310ylkuphrtab.eablkybsjg(eablkybsjgVarZoijcleaow, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i13, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i13 == this.f3307lmojexxdyd) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i13 != this.f3309wwaezpbzkn) {
                return super.onKeyDown(i13, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.wkgbmnqykc) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.wkgbmnqykc) adapter).zoijcleaow().eablkybsjg(false);
            return true;
        }

        @Override // androidx.appcompat.widget.iozdgvuglv, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(pkzmftpjix pkzmftpjixVar) {
            this.f3310ylkuphrtab = pkzmftpjixVar;
        }

        @Override // androidx.appcompat.widget.iozdgvuglv, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        @Override // androidx.appcompat.widget.iozdgvuglv
        public /* bridge */ /* synthetic */ int wkgbmnqykc(int i13, int i14, int i15, int i16, int i17) {
            return super.wkgbmnqykc(i13, i14, i15, i16, i17);
        }
    }

    static class zoijcleaow {
        static void iobyxmoadg(PopupWindow popupWindow, boolean z13) {
            popupWindow.setTouchModal(z13);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3305ikoacuggdj = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public hcddaimhww(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
    }

    @Override // androidx.appcompat.widget.pkzmftpjix
    public void eablkybsjg(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, MenuItem menuItem) {
        pkzmftpjix pkzmftpjixVar = this.f3306jhduphickx;
        if (pkzmftpjixVar != null) {
            pkzmftpjixVar.eablkybsjg(eablkybsjgVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ylkuphrtab
    iozdgvuglv kcexrzcfyt(Context context, boolean z13) {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(context, z13);
        ppxfxbqfkfVar.setHoverListener(this);
        return ppxfxbqfkfVar;
    }

    public void mbcevpiqjq(Object obj) {
        iobyxmoadg.zoijcleaow(this.f3470jlmebxxoox, (Transition) obj);
    }

    public void ntlheqmsrt(pkzmftpjix pkzmftpjixVar) {
        this.f3306jhduphickx = pkzmftpjixVar;
    }

    @Override // androidx.appcompat.widget.pkzmftpjix
    public void ojitshcjhn(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, MenuItem menuItem) {
        pkzmftpjix pkzmftpjixVar = this.f3306jhduphickx;
        if (pkzmftpjixVar != null) {
            pkzmftpjixVar.ojitshcjhn(eablkybsjgVar, menuItem);
        }
    }

    public void tzroggbefp(Object obj) {
        iobyxmoadg.iobyxmoadg(this.f3470jlmebxxoox, (Transition) obj);
    }

    public void ulzqkzuiru(boolean z13) {
        if (Build.VERSION.SDK_INT > 28) {
            zoijcleaow.iobyxmoadg(this.f3470jlmebxxoox, z13);
            return;
        }
        Method method = f3305ikoacuggdj;
        if (method != null) {
            try {
                method.invoke(this.f3470jlmebxxoox, Boolean.valueOf(z13));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
