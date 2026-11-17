package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v1.yfnezrywwk;

/* JADX INFO: loaded from: classes.dex */
class iozdgvuglv extends ListView {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private yfnezrywwk f3323cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f3324cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f3325esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    gxszxtbevo f3326iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f3327istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f3328iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f3329jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private wkgbmnqykc f3330lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f3331pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private androidx.core.widget.gxszxtbevo f3332yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f3333yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Rect f3334zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f3335zynmafqrjb;

    static class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final Field f3336iobyxmoadg;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e13) {
                e13.printStackTrace();
            }
            f3336iobyxmoadg = declaredField;
        }

        static boolean iobyxmoadg(AbsListView absListView) {
            Field field = f3336iobyxmoadg;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e13) {
                e13.printStackTrace();
                return false;
            }
        }

        static void zoijcleaow(AbsListView absListView, boolean z13) {
            Field field = f3336iobyxmoadg;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z13));
                } catch (IllegalAccessException e13) {
                    e13.printStackTrace();
                }
            }
        }
    }

    private class gxszxtbevo implements Runnable {
        gxszxtbevo() {
        }

        public void iobyxmoadg() {
            iozdgvuglv iozdgvuglvVar = iozdgvuglv.this;
            iozdgvuglvVar.f3326iozdgvuglv = null;
            iozdgvuglvVar.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            iozdgvuglv iozdgvuglvVar = iozdgvuglv.this;
            iozdgvuglvVar.f3326iozdgvuglv = null;
            iozdgvuglvVar.drawableStateChanged();
        }

        public void zoijcleaow() {
            iozdgvuglv.this.post(this);
        }
    }

    static class iobyxmoadg {
        static void iobyxmoadg(View view, float f13, float f14) {
            view.drawableHotspotChanged(f13, f14);
        }
    }

    static class ppxfxbqfkf {
        static boolean iobyxmoadg(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void zoijcleaow(AbsListView absListView, boolean z13) {
            absListView.setSelectedChildViewEnabled(z13);
        }
    }

    private static class wkgbmnqykc extends dxjokdxxww.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f3338yggfygwlhe;

        wkgbmnqykc(Drawable drawable) {
            super(drawable);
            this.f3338yggfygwlhe = true;
        }

        @Override // dxjokdxxww.iobyxmoadg, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f3338yggfygwlhe) {
                super.draw(canvas);
            }
        }

        @Override // dxjokdxxww.iobyxmoadg, android.graphics.drawable.Drawable
        public void setHotspot(float f13, float f14) {
            if (this.f3338yggfygwlhe) {
                super.setHotspot(f13, f14);
            }
        }

        @Override // dxjokdxxww.iobyxmoadg, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i13, int i14, int i15, int i16) {
            if (this.f3338yggfygwlhe) {
                super.setHotspotBounds(i13, i14, i15, i16);
            }
        }

        @Override // dxjokdxxww.iobyxmoadg, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f3338yggfygwlhe) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // dxjokdxxww.iobyxmoadg, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z13, boolean z14) {
            if (this.f3338yggfygwlhe) {
                return super.setVisible(z13, z14);
            }
            return false;
        }

        void zoijcleaow(boolean z13) {
            this.f3338yggfygwlhe = z13;
        }
    }

    static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static Method f3339iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static Method f3340ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static boolean f3341wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static Method f3342zoijcleaow;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f3339iobyxmoadg = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f3342zoijcleaow = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f3340ppxfxbqfkf = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f3341wkgbmnqykc = true;
            } catch (NoSuchMethodException e13) {
                e13.printStackTrace();
            }
        }

        static boolean iobyxmoadg() {
            return f3341wkgbmnqykc;
        }

        static void zoijcleaow(iozdgvuglv iozdgvuglvVar, int i13, View view) {
            try {
                f3339iobyxmoadg.invoke(iozdgvuglvVar, Integer.valueOf(i13), view, Boolean.FALSE, -1, -1);
                f3342zoijcleaow.invoke(iozdgvuglvVar, Integer.valueOf(i13));
                f3340ppxfxbqfkf.invoke(iozdgvuglvVar, Integer.valueOf(i13));
            } catch (IllegalAccessException e13) {
                e13.printStackTrace();
            } catch (InvocationTargetException e14) {
                e14.printStackTrace();
            }
        }
    }

    iozdgvuglv(Context context, boolean z13) {
        super(context, null, lqeggnwhkg.iobyxmoadg.dropDownListViewStyle);
        this.f3334zdlpuopuiu = new Rect();
        this.f3333yggfygwlhe = 0;
        this.f3329jyumaefscl = 0;
        this.f3328iwizpuwonk = 0;
        this.f3324cqumvgiudr = 0;
        this.f3335zynmafqrjb = z13;
        setCacheColorHint(0);
    }

    private void agtfadlqog() {
        Drawable selector = getSelector();
        if (selector != null && wflxmlrfwp() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void btonecajqb(boolean z13) {
        wkgbmnqykc wkgbmnqykcVar = this.f3330lereixgezr;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.zoijcleaow(z13);
        }
    }

    private void draadjrbmk(boolean z13) {
        if (Build.VERSION.SDK_INT >= 33) {
            ppxfxbqfkf.zoijcleaow(this, z13);
        } else {
            eablkybsjg.zoijcleaow(this, z13);
        }
    }

    private void dxjokdxxww(View view, int i13, float f13, float f14) {
        View childAt;
        this.f3327istkbnxepw = true;
        iobyxmoadg.iobyxmoadg(this, f13, f14);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i14 = this.f3325esjtqupxsv;
        if (i14 != -1 && (childAt = getChildAt(i14 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f3325esjtqupxsv = i13;
        iobyxmoadg.iobyxmoadg(view, f13 - view.getLeft(), f14 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        nufgyqmvbu(i13, view, f13, f14);
        btonecajqb(false);
        refreshDrawableState();
    }

    private boolean gtknphoqwx() {
        return Build.VERSION.SDK_INT >= 33 ? ppxfxbqfkf.iobyxmoadg(this) : eablkybsjg.iobyxmoadg(this);
    }

    private void gxszxtbevo(int i13, View view) {
        Rect rect = this.f3334zdlpuopuiu;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f3333yggfygwlhe;
        rect.top -= this.f3329jyumaefscl;
        rect.right += this.f3328iwizpuwonk;
        rect.bottom += this.f3324cqumvgiudr;
        boolean zGtknphoqwx = gtknphoqwx();
        if (view.isEnabled() != zGtknphoqwx) {
            draadjrbmk(!zGtknphoqwx);
            if (i13 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void iobyxmoadg() {
        this.f3327istkbnxepw = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f3325esjtqupxsv - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        yfnezrywwk yfnezrywwkVar = this.f3323cdpycssgdh;
        if (yfnezrywwkVar != null) {
            yfnezrywwkVar.ppxfxbqfkf();
            this.f3323cdpycssgdh = null;
        }
    }

    private void lqeggnwhkg(int i13, View view) {
        Drawable selector = getSelector();
        boolean z13 = (selector == null || i13 == -1) ? false : true;
        if (z13) {
            selector.setVisible(false, false);
        }
        gxszxtbevo(i13, view);
        if (z13) {
            Rect rect = this.f3334zdlpuopuiu;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            k1.iobyxmoadg.gtknphoqwx(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void nufgyqmvbu(int i13, View view, float f13, float f14) {
        lqeggnwhkg(i13, view);
        Drawable selector = getSelector();
        if (selector == null || i13 == -1) {
            return;
        }
        k1.iobyxmoadg.gtknphoqwx(selector, f13, f14);
    }

    private void ppxfxbqfkf(Canvas canvas) {
        Drawable selector;
        if (this.f3334zdlpuopuiu.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f3334zdlpuopuiu);
        selector.draw(canvas);
    }

    private boolean wflxmlrfwp() {
        return this.f3327istkbnxepw;
    }

    private void zoijcleaow(View view, int i13) {
        performItemClick(view, i13, getItemIdAtPosition(i13));
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        ppxfxbqfkf(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f3326iozdgvuglv != null) {
            return;
        }
        super.drawableStateChanged();
        btonecajqb(true);
        agtfadlqog();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean eablkybsjg(MotionEvent motionEvent, int i13) {
        boolean z13;
        boolean z14;
        androidx.core.widget.gxszxtbevo gxszxtbevoVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z13 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z13 = true;
                    z14 = false;
                } else {
                    z14 = false;
                    z13 = false;
                }
                if (z13 || z14) {
                    iobyxmoadg();
                }
                if (z13) {
                    if (this.f3332yadqdtsiqt == null) {
                        this.f3332yadqdtsiqt = new androidx.core.widget.gxszxtbevo(this);
                    }
                    this.f3332yadqdtsiqt.wflxmlrfwp(true);
                    this.f3332yadqdtsiqt.onTouch(this, motionEvent);
                } else {
                    gxszxtbevoVar = this.f3332yadqdtsiqt;
                    if (gxszxtbevoVar != null) {
                        gxszxtbevoVar.wflxmlrfwp(false);
                    }
                }
                return z13;
            }
            z13 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i13);
        if (iFindPointerIndex < 0) {
            z14 = false;
            z13 = false;
        } else {
            int x13 = (int) motionEvent.getX(iFindPointerIndex);
            int y13 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x13, y13);
            if (iPointToPosition == -1) {
                z14 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                dxjokdxxww(childAt, iPointToPosition, x13, y13);
                if (actionMasked == 1) {
                    zoijcleaow(childAt, iPointToPosition);
                }
                z13 = true;
                z14 = false;
            }
        }
        if (z13) {
            iobyxmoadg();
        } else {
            iobyxmoadg();
        }
        if (z13) {
            if (this.f3332yadqdtsiqt == null) {
                this.f3332yadqdtsiqt = new androidx.core.widget.gxszxtbevo(this);
            }
            this.f3332yadqdtsiqt.wflxmlrfwp(true);
            this.f3332yadqdtsiqt.onTouch(this, motionEvent);
        } else {
            gxszxtbevoVar = this.f3332yadqdtsiqt;
            if (gxszxtbevoVar != null) {
                gxszxtbevoVar.wflxmlrfwp(false);
            }
        }
        return z13;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f3335zynmafqrjb || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f3335zynmafqrjb || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f3335zynmafqrjb || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f3335zynmafqrjb && this.f3331pmvmpeiblj) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f3326iozdgvuglv = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i13 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3326iozdgvuglv == null) {
            gxszxtbevo gxszxtbevoVar = new gxszxtbevo();
            this.f3326iozdgvuglv = gxszxtbevoVar;
            gxszxtbevoVar.zoijcleaow();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i13 < 30 || !zoijcleaow.iobyxmoadg()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        zoijcleaow.zoijcleaow(this, iPointToPosition, childAt);
                    }
                }
                agtfadlqog();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3325esjtqupxsv = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        gxszxtbevo gxszxtbevoVar = this.f3326iozdgvuglv;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.iobyxmoadg();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z13) {
        this.f3331pmvmpeiblj = z13;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        wkgbmnqykc wkgbmnqykcVar = drawable != null ? new wkgbmnqykc(drawable) : null;
        this.f3330lereixgezr = wkgbmnqykcVar;
        super.setSelector(wkgbmnqykcVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3333yggfygwlhe = rect.left;
        this.f3329jyumaefscl = rect.top;
        this.f3328iwizpuwonk = rect.right;
        this.f3324cqumvgiudr = rect.bottom;
    }

    public int wkgbmnqykc(int i13, int i14, int i15, int i16, int i17) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i18 = 0;
        int i19 = 0;
        int i23 = 0;
        View view = null;
        while (i18 < count) {
            int itemViewType = adapter.getItemViewType(i18);
            if (itemViewType != i19) {
                view = null;
                i19 = itemViewType;
            }
            view = adapter.getView(i18, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i24 = layoutParams.height;
            view.measure(i13, i24 > 0 ? View.MeasureSpec.makeMeasureSpec(i24, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i18 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i16) {
                return (i17 < 0 || i18 <= i17 || i23 <= 0 || measuredHeight == i16) ? i16 : i23;
            }
            if (i17 >= 0 && i18 >= i17) {
                i23 = measuredHeight;
            }
            i18++;
        }
        return measuredHeight;
    }
}
