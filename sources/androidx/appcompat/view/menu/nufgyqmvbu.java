package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu implements draadjrbmk.eablkybsjg, btonecajqb, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Rect f2887zdlpuopuiu;

    nufgyqmvbu() {
    }

    protected static int agtfadlqog(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i13) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i14 = 0;
        int i15 = 0;
        View view = null;
        for (int i16 = 0; i16 < count; i16++) {
            int itemViewType = listAdapter.getItemViewType(i16);
            if (itemViewType != i15) {
                view = null;
                i15 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i16, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i13) {
                return i13;
            }
            if (measuredWidth > i14) {
                i14 = measuredWidth;
            }
        }
        return i14;
    }

    protected static boolean cqumvgiudr(eablkybsjg eablkybsjgVar) {
        int size = eablkybsjgVar.size();
        for (int i13 = 0; i13 < size; i13++) {
            MenuItem item = eablkybsjgVar.getItem(i13);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static wkgbmnqykc esjtqupxsv(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (wkgbmnqykc) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (wkgbmnqykc) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public void btonecajqb(Context context, eablkybsjg eablkybsjgVar) {
    }

    protected boolean draadjrbmk() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean dxjokdxxww(eablkybsjg eablkybsjgVar, lqeggnwhkg lqeggnwhkgVar) {
        return false;
    }

    public abstract void gtknphoqwx(eablkybsjg eablkybsjgVar);

    public abstract void iwizpuwonk(int i13);

    public abstract void jyumaefscl(boolean z13);

    public abstract void kcexrzcfyt(int i13);

    public abstract void ojitshcjhn(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        esjtqupxsv(listAdapter).f2903iobyxmoadg.cllcsxoeiz((MenuItem) listAdapter.getItem(i13), this, draadjrbmk() ? 0 : 4);
    }

    public abstract void oxmwwwfdhm(boolean z13);

    public void vdvldrhtss(Rect rect) {
        this.f2887zdlpuopuiu = rect;
    }

    public Rect wflxmlrfwp() {
        return this.f2887zdlpuopuiu;
    }

    @Override // androidx.appcompat.view.menu.btonecajqb
    public boolean wkgbmnqykc(eablkybsjg eablkybsjgVar, lqeggnwhkg lqeggnwhkgVar) {
        return false;
    }

    public abstract void yggfygwlhe(PopupWindow.OnDismissListener onDismissListener);

    public abstract void zdlpuopuiu(int i13);
}
