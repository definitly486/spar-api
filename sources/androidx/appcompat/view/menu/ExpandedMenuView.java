package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.mbcevpiqjq;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements eablkybsjg.zoijcleaow, gtknphoqwx, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final int[] f2758jyumaefscl = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f2759yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private eablkybsjg f2760zdlpuopuiu;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public int getWindowAnimations() {
        return this.f2759yggfygwlhe;
    }

    @Override // androidx.appcompat.view.menu.gtknphoqwx
    public void iobyxmoadg(eablkybsjg eablkybsjgVar) {
        this.f2760zdlpuopuiu = eablkybsjgVar;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        wkgbmnqykc((lqeggnwhkg) getAdapter().getItem(i13));
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg.zoijcleaow
    public boolean wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar) {
        return this.f2760zdlpuopuiu.hkdspvbjdz(lqeggnwhkgVar, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(context, attributeSet, f2758jyumaefscl, i13, 0);
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(0)) {
            setBackgroundDrawable(mbcevpiqjqVarJyumaefscl.lqeggnwhkg(0));
        }
        if (mbcevpiqjqVarJyumaefscl.kcexrzcfyt(1)) {
            setDivider(mbcevpiqjqVarJyumaefscl.lqeggnwhkg(1));
        }
        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
    }
}
