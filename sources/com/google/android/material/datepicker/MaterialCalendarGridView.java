package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.Iterator;
import v1.jhduphickx;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f22587yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Calendar f22588zdlpuopuiu;

    class iobyxmoadg extends v1.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            zdlpuopuiuVar.ydmasvzmpa(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static boolean eablkybsjg(Long l13, Long l14, Long l15, Long l16) {
        return l13 == null || l14 == null || l15 == null || l16 == null || l15.longValue() > l14.longValue() || l16.longValue() < l13.longValue();
    }

    private void iobyxmoadg(int i13, Rect rect) {
        if (i13 == 33) {
            setSelection(getAdapter().wflxmlrfwp());
        } else if (i13 == 130) {
            setSelection(getAdapter().zoijcleaow());
        } else {
            super.onFocusChanged(true, i13, rect);
        }
    }

    private View ppxfxbqfkf(int i13) {
        return getChildAt(i13 - getFirstVisiblePosition());
    }

    private static int wkgbmnqykc(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int iIobyxmoadg;
        int iWkgbmnqykc;
        int iIobyxmoadg2;
        int iWkgbmnqykc2;
        int width;
        int i13;
        int right;
        int right2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        gtknphoqwx adapter = getAdapter();
        DateSelector dateSelector = adapter.f22693zoijcleaow;
        zoijcleaow zoijcleaowVar = adapter.f22692wkgbmnqykc;
        int iMax = Math.max(adapter.zoijcleaow(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.wflxmlrfwp(), getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        Iterator it = dateSelector.q().iterator();
        while (it.hasNext()) {
            u1.ppxfxbqfkf ppxfxbqfkfVar = (u1.ppxfxbqfkf) it.next();
            Object obj = ppxfxbqfkfVar.f112467iobyxmoadg;
            if (obj == null) {
                materialCalendarGridView = this;
            } else if (ppxfxbqfkfVar.f112468zoijcleaow != null) {
                Long l13 = (Long) obj;
                long jLongValue = l13.longValue();
                Long l14 = (Long) ppxfxbqfkfVar.f112468zoijcleaow;
                long jLongValue2 = l14.longValue();
                if (!eablkybsjg(item, item2, l13, l14)) {
                    boolean zNufgyqmvbu = com.google.android.material.internal.ojitshcjhn.nufgyqmvbu(this);
                    if (jLongValue < item.longValue()) {
                        if (adapter.nufgyqmvbu(iMax)) {
                            right2 = 0;
                        } else {
                            right2 = !zNufgyqmvbu ? materialCalendarGridView.ppxfxbqfkf(iMax - 1).getRight() : materialCalendarGridView.ppxfxbqfkf(iMax - 1).getLeft();
                        }
                        iWkgbmnqykc = right2;
                        iIobyxmoadg = iMax;
                    } else {
                        materialCalendarGridView.f22588zdlpuopuiu.setTimeInMillis(jLongValue);
                        iIobyxmoadg = adapter.iobyxmoadg(materialCalendarGridView.f22588zdlpuopuiu.get(5));
                        iWkgbmnqykc = wkgbmnqykc(materialCalendarGridView.ppxfxbqfkf(iIobyxmoadg));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        if (adapter.dxjokdxxww(iMin)) {
                            right = getWidth();
                        } else {
                            right = !zNufgyqmvbu ? materialCalendarGridView.ppxfxbqfkf(iMin).getRight() : materialCalendarGridView.ppxfxbqfkf(iMin).getLeft();
                        }
                        iWkgbmnqykc2 = right;
                        iIobyxmoadg2 = iMin;
                    } else {
                        materialCalendarGridView.f22588zdlpuopuiu.setTimeInMillis(jLongValue2);
                        iIobyxmoadg2 = adapter.iobyxmoadg(materialCalendarGridView.f22588zdlpuopuiu.get(5));
                        iWkgbmnqykc2 = wkgbmnqykc(materialCalendarGridView.ppxfxbqfkf(iIobyxmoadg2));
                    }
                    int itemId = (int) adapter.getItemId(iIobyxmoadg);
                    int i14 = iMax;
                    int i15 = iMin;
                    int itemId2 = (int) adapter.getItemId(iIobyxmoadg2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View viewPpxfxbqfkf = materialCalendarGridView.ppxfxbqfkf(numColumns);
                        int top = viewPpxfxbqfkf.getTop() + zoijcleaowVar.f22717iobyxmoadg.ppxfxbqfkf();
                        gtknphoqwx gtknphoqwxVar = adapter;
                        int bottom = viewPpxfxbqfkf.getBottom() - zoijcleaowVar.f22717iobyxmoadg.zoijcleaow();
                        if (zNufgyqmvbu) {
                            int i16 = iIobyxmoadg2 > numColumns2 ? 0 : iWkgbmnqykc2;
                            width = numColumns > iIobyxmoadg ? getWidth() : iWkgbmnqykc;
                            i13 = i16;
                        } else {
                            i13 = numColumns > iIobyxmoadg ? 0 : iWkgbmnqykc;
                            width = iIobyxmoadg2 > numColumns2 ? getWidth() : iWkgbmnqykc2;
                        }
                        canvas.drawRect(i13, top, width, bottom, zoijcleaowVar.f22719nufgyqmvbu);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = gtknphoqwxVar;
                    }
                    materialCalendarGridView = this;
                    iMax = i14;
                    iMin = i15;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z13, int i13, Rect rect) {
        if (z13) {
            iobyxmoadg(i13, rect);
        } else {
            super.onFocusChanged(false, i13, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i13, KeyEvent keyEvent) {
        if (!super.onKeyDown(i13, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().zoijcleaow()) {
            return true;
        }
        if (19 != i13) {
            return false;
        }
        setSelection(getAdapter().zoijcleaow());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i13, int i14) {
        if (!this.f22587yggfygwlhe) {
            super.onMeasure(i13, i14);
            return;
        }
        super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i13) {
        if (i13 < getAdapter().zoijcleaow()) {
            super.setSelection(getAdapter().zoijcleaow());
        } else {
            super.setSelection(i13);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public gtknphoqwx getAdapter() {
        return (gtknphoqwx) super.getAdapter();
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f22588zdlpuopuiu = vdvldrhtss.wflxmlrfwp();
        if (MaterialDatePicker.ntlheqmsrt(getContext())) {
            setNextFocusLeftId(da.gxszxtbevo.cancel_button);
            setNextFocusRightId(da.gxszxtbevo.confirm_button);
        }
        this.f22587yggfygwlhe = MaterialDatePicker.sopmlzcsov(getContext());
        jhduphickx.oipsdeybqn(this, new iobyxmoadg());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof gtknphoqwx)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), gtknphoqwx.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
