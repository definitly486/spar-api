package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import v1.jhduphickx;
import v1.lmojexxdyd;
import v1.pkzmftpjix;
import v1.skhdrjzrfn;
import v1.wwaezpbzkn;
import v1.ylkuphrtab;
import v1.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements lmojexxdyd, wwaezpbzkn {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    static final String f8288cllcsxoeiz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    static final Class[] f8289dsvhmnatus;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private static final u1.eablkybsjg f8290kegysxyocb;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    static final Comparator f8291stevsuqkhv;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    static final ThreadLocal f8292wypolnanlu;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private View f8293cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Paint f8294cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final int[] f8295esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f8296hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final ylkuphrtab f8297hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private lqeggnwhkg f8298iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int[] f8299istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final List f8300iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private pkzmftpjix f8301jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f8302jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final int[] f8303lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f8304lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private Drawable f8305pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f8306pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private skhdrjzrfn f8307wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private View f8308yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.zoijcleaow f8309yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private boolean f8310ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f8311zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f8312zynmafqrjb;

    private class eablkybsjg implements ViewGroup.OnHierarchyChangeListener {
        eablkybsjg() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f8296hcddaimhww;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.wwaezpbzkn(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f8296hcddaimhww;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class iobyxmoadg implements pkzmftpjix {
        iobyxmoadg() {
        }

        @Override // v1.pkzmftpjix
        public skhdrjzrfn iobyxmoadg(View view, skhdrjzrfn skhdrjzrfnVar) {
            return CoordinatorLayout.this.sopmlzcsov(skhdrjzrfnVar);
        }
    }

    class lqeggnwhkg implements ViewTreeObserver.OnPreDrawListener {
        lqeggnwhkg() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.wwaezpbzkn(0);
            return true;
        }
    }

    static class nufgyqmvbu implements Comparator {
        nufgyqmvbu() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fHkdspvbjdz = jhduphickx.hkdspvbjdz(view);
            float fHkdspvbjdz2 = jhduphickx.hkdspvbjdz(view2);
            if (fHkdspvbjdz > fHkdspvbjdz2) {
                return -1;
            }
            return fHkdspvbjdz < fHkdspvbjdz2 ? 1 : 0;
        }
    }

    public static abstract class ppxfxbqfkf {
        public ppxfxbqfkf() {
        }

        public void agtfadlqog() {
        }

        public skhdrjzrfn btonecajqb(CoordinatorLayout coordinatorLayout, View view, skhdrjzrfn skhdrjzrfnVar) {
            return skhdrjzrfnVar;
        }

        public boolean cdpycssgdh(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13) {
            return false;
        }

        public void cqumvgiudr(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
            iArr[0] = iArr[0] + i15;
            iArr[1] = iArr[1] + i16;
            iwizpuwonk(coordinatorLayout, view, view2, i13, i14, i15, i16, i17);
        }

        public boolean draadjrbmk(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean dxjokdxxww(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean eablkybsjg(CoordinatorLayout coordinatorLayout, View view) {
            return nufgyqmvbu(coordinatorLayout, view) > 0.0f;
        }

        public void esjtqupxsv(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13) {
        }

        public void gtknphoqwx(gxszxtbevo gxszxtbevoVar) {
        }

        public boolean gxszxtbevo(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public void iozdgvuglv(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public Parcelable istkbnxepw(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public void iwizpuwonk(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17) {
            if (i17 == 0) {
                jyumaefscl(coordinatorLayout, view, view2, i13, i14, i15, i16);
            }
        }

        public void jyumaefscl(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16) {
        }

        public boolean kcexrzcfyt(CoordinatorLayout coordinatorLayout, View view, View view2, float f13, float f14) {
            return false;
        }

        public void lereixgezr(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
            if (i14 == 0) {
                esjtqupxsv(coordinatorLayout, view, view2, view3, i13);
            }
        }

        public void lmojexxdyd(CoordinatorLayout coordinatorLayout, View view, View view2, int i13) {
            if (i13 == 0) {
                iozdgvuglv(coordinatorLayout, view, view2);
            }
        }

        public int lqeggnwhkg(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float nufgyqmvbu(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean ojitshcjhn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean oxmwwwfdhm(CoordinatorLayout coordinatorLayout, View view, View view2, float f13, float f14, boolean z13) {
            return false;
        }

        public boolean pmvmpeiblj(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z13) {
            return false;
        }

        public boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, View view, int i13) {
            return false;
        }

        public boolean vdvldrhtss(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15, int i16) {
            return false;
        }

        public void wflxmlrfwp(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public boolean wwaezpbzkn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean yadqdtsiqt(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
            if (i14 == 0) {
                return cdpycssgdh(coordinatorLayout, view, view2, view3, i13);
            }
            return false;
        }

        public void yggfygwlhe(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int[] iArr, int i15) {
            if (i15 == 0) {
                zdlpuopuiu(coordinatorLayout, view, view2, i13, i14, iArr);
            }
        }

        public void zdlpuopuiu(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int[] iArr) {
        }

        public void zynmafqrjb(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public ppxfxbqfkf(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface wkgbmnqykc {
        Class value();
    }

    public interface zoijcleaow {
        ppxfxbqfkf getBehavior();
    }

    static {
        Package r13 = CoordinatorLayout.class.getPackage();
        f8288cllcsxoeiz = r13 != null ? r13.getName() : null;
        f8291stevsuqkhv = new nufgyqmvbu();
        f8289dsvhmnatus = new Class[]{Context.class, AttributeSet.class};
        f8292wypolnanlu = new ThreadLocal();
        f8290kegysxyocb = new u1.lqeggnwhkg(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f1.iobyxmoadg.coordinatorLayoutStyle);
    }

    private void cdpycssgdh(View view, View view2, int i13) {
        Rect rectIobyxmoadg = iobyxmoadg();
        Rect rectIobyxmoadg2 = iobyxmoadg();
        try {
            zdlpuopuiu(view2, rectIobyxmoadg);
            yggfygwlhe(view, i13, rectIobyxmoadg, rectIobyxmoadg2);
            view.layout(rectIobyxmoadg2.left, rectIobyxmoadg2.top, rectIobyxmoadg2.right, rectIobyxmoadg2.bottom);
        } finally {
            dsvhmnatus(rectIobyxmoadg);
            dsvhmnatus(rectIobyxmoadg2);
        }
    }

    private void crxdokpmqz() {
        if (!jhduphickx.iwizpuwonk(this)) {
            jhduphickx.igdgnonuha(this, null);
            return;
        }
        if (this.f8301jpowsppfya == null) {
            this.f8301jpowsppfya = new iobyxmoadg();
        }
        jhduphickx.igdgnonuha(this, this.f8301jpowsppfya);
        setSystemUiVisibility(1280);
    }

    private static void dsvhmnatus(Rect rect) {
        rect.setEmpty();
        f8290kegysxyocb.iobyxmoadg(rect);
    }

    private skhdrjzrfn eablkybsjg(skhdrjzrfn skhdrjzrfnVar) {
        ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        if (skhdrjzrfnVar.vdvldrhtss()) {
            return skhdrjzrfnVar;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (jhduphickx.iwizpuwonk(childAt) && (ppxfxbqfkfVarGxszxtbevo = ((gxszxtbevo) childAt.getLayoutParams()).gxszxtbevo()) != null) {
                skhdrjzrfnVar = ppxfxbqfkfVarGxszxtbevo.btonecajqb(this, childAt, skhdrjzrfnVar);
                if (skhdrjzrfnVar.vdvldrhtss()) {
                    break;
                }
            }
        }
        return skhdrjzrfnVar;
    }

    static ppxfxbqfkf hcddaimhww(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f8288cllcsxoeiz;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f8292wypolnanlu;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f8289dsvhmnatus);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (ppxfxbqfkf) constructor.newInstance(context, attributeSet);
        } catch (Exception e13) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e13);
        }
    }

    private void hkdspvbjdz() {
        this.f8311zdlpuopuiu.clear();
        this.f8309yggfygwlhe.ppxfxbqfkf();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            gxszxtbevo gxszxtbevoVarEsjtqupxsv = esjtqupxsv(childAt);
            gxszxtbevoVarEsjtqupxsv.wkgbmnqykc(this, childAt);
            this.f8309yggfygwlhe.zoijcleaow(childAt);
            for (int i14 = 0; i14 < childCount; i14++) {
                if (i14 != i13) {
                    View childAt2 = getChildAt(i14);
                    if (gxszxtbevoVarEsjtqupxsv.zoijcleaow(this, childAt, childAt2)) {
                        if (!this.f8309yggfygwlhe.wkgbmnqykc(childAt2)) {
                            this.f8309yggfygwlhe.zoijcleaow(childAt2);
                        }
                        this.f8309yggfygwlhe.iobyxmoadg(childAt2, childAt);
                    }
                }
            }
        }
        this.f8311zdlpuopuiu.addAll(this.f8309yggfygwlhe.dxjokdxxww());
        Collections.reverse(this.f8311zdlpuopuiu);
    }

    private static Rect iobyxmoadg() {
        Rect rect = (Rect) f8290kegysxyocb.zoijcleaow();
        return rect == null ? new Rect() : rect;
    }

    private void iozdgvuglv(View view, Rect rect, int i13) {
        boolean z13;
        boolean z14;
        int width;
        int i14;
        int i15;
        int i16;
        int height;
        int i17;
        int i18;
        int i19;
        if (jhduphickx.tzroggbefp(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) view.getLayoutParams();
            ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar.gxszxtbevo();
            Rect rectIobyxmoadg = iobyxmoadg();
            Rect rectIobyxmoadg2 = iobyxmoadg();
            rectIobyxmoadg2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (ppxfxbqfkfVarGxszxtbevo == null || !ppxfxbqfkfVarGxszxtbevo.gxszxtbevo(this, view, rectIobyxmoadg)) {
                rectIobyxmoadg.set(rectIobyxmoadg2);
            } else if (!rectIobyxmoadg2.contains(rectIobyxmoadg)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectIobyxmoadg.toShortString() + " | Bounds:" + rectIobyxmoadg2.toShortString());
            }
            dsvhmnatus(rectIobyxmoadg2);
            if (rectIobyxmoadg.isEmpty()) {
                dsvhmnatus(rectIobyxmoadg);
                return;
            }
            int iZoijcleaow = zdlpuopuiu.zoijcleaow(gxszxtbevoVar.f8324nufgyqmvbu, i13);
            boolean z15 = true;
            if ((iZoijcleaow & 48) != 48 || (i18 = (rectIobyxmoadg.top - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).topMargin) - gxszxtbevoVar.f8316btonecajqb) >= (i19 = rect.top)) {
                z13 = false;
            } else {
                ulzqkzuiru(view, i19 - i18);
                z13 = true;
            }
            if ((iZoijcleaow & 80) == 80 && (height = ((getHeight() - rectIobyxmoadg.bottom) - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).bottomMargin) + gxszxtbevoVar.f8316btonecajqb) < (i17 = rect.bottom)) {
                ulzqkzuiru(view, height - i17);
                z13 = true;
            }
            if (!z13) {
                ulzqkzuiru(view, 0);
            }
            if ((iZoijcleaow & 3) != 3 || (i15 = (rectIobyxmoadg.left - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).leftMargin) - gxszxtbevoVar.f8318dxjokdxxww) >= (i16 = rect.left)) {
                z14 = false;
            } else {
                ntlheqmsrt(view, i16 - i15);
                z14 = true;
            }
            if ((iZoijcleaow & 5) != 5 || (width = ((getWidth() - rectIobyxmoadg.right) - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).rightMargin) + gxszxtbevoVar.f8318dxjokdxxww) >= (i14 = rect.right)) {
                z15 = z14;
            } else {
                ntlheqmsrt(view, width - i14);
            }
            if (!z15) {
                ntlheqmsrt(view, 0);
            }
            dsvhmnatus(rectIobyxmoadg);
        }
    }

    private void istkbnxepw(View view, int i13) {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) view.getLayoutParams();
        Rect rectIobyxmoadg = iobyxmoadg();
        rectIobyxmoadg.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).bottomMargin);
        if (this.f8307wwaezpbzkn != null && jhduphickx.iwizpuwonk(this) && !jhduphickx.iwizpuwonk(view)) {
            rectIobyxmoadg.left += this.f8307wwaezpbzkn.gtknphoqwx();
            rectIobyxmoadg.top += this.f8307wwaezpbzkn.wflxmlrfwp();
            rectIobyxmoadg.right -= this.f8307wwaezpbzkn.draadjrbmk();
            rectIobyxmoadg.bottom -= this.f8307wwaezpbzkn.btonecajqb();
        }
        Rect rectIobyxmoadg2 = iobyxmoadg();
        zdlpuopuiu.iobyxmoadg(tzroggbefp(gxszxtbevoVar.f8327ppxfxbqfkf), view.getMeasuredWidth(), view.getMeasuredHeight(), rectIobyxmoadg, rectIobyxmoadg2, i13);
        view.layout(rectIobyxmoadg2.left, rectIobyxmoadg2.top, rectIobyxmoadg2.right, rectIobyxmoadg2.bottom);
        dsvhmnatus(rectIobyxmoadg);
        dsvhmnatus(rectIobyxmoadg2);
    }

    private int iwizpuwonk(int i13) {
        int[] iArr = this.f8299istkbnxepw;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i13);
            return 0;
        }
        if (i13 >= 0 && i13 < iArr.length) {
            return iArr[i13];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i13 + " out of range for " + this);
        return 0;
    }

    private boolean jpowsppfya(MotionEvent motionEvent, int i13) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f8302jyumaefscl;
        lereixgezr(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOjitshcjhn = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) list.get(i14);
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) view.getLayoutParams();
            ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar.gxszxtbevo();
            if (!(zOjitshcjhn || z13) || actionMasked == 0) {
                if (!zOjitshcjhn && ppxfxbqfkfVarGxszxtbevo != null) {
                    if (i13 == 0) {
                        zOjitshcjhn = ppxfxbqfkfVarGxszxtbevo.ojitshcjhn(this, view, motionEvent);
                    } else if (i13 == 1) {
                        zOjitshcjhn = ppxfxbqfkfVarGxszxtbevo.wwaezpbzkn(this, view, motionEvent);
                    }
                    if (zOjitshcjhn) {
                        this.f8293cdpycssgdh = view;
                    }
                }
                boolean zPpxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf();
                boolean zDxjokdxxww = gxszxtbevoVar.dxjokdxxww(this, view);
                z13 = zDxjokdxxww && !zPpxfxbqfkf;
                if (zDxjokdxxww && !z13) {
                    break;
                }
            } else if (ppxfxbqfkfVarGxszxtbevo != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i13 == 0) {
                    ppxfxbqfkfVarGxszxtbevo.ojitshcjhn(this, view, motionEventObtain);
                } else if (i13 == 1) {
                    ppxfxbqfkfVarGxszxtbevo.wwaezpbzkn(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOjitshcjhn;
    }

    private void jyumaefscl(View view, int i13, Rect rect, Rect rect2, gxszxtbevo gxszxtbevoVar, int i14, int i15) {
        int iWidth;
        int iHeight;
        int iZoijcleaow = zdlpuopuiu.zoijcleaow(kegysxyocb(gxszxtbevoVar.f8327ppxfxbqfkf), i13);
        int iZoijcleaow2 = zdlpuopuiu.zoijcleaow(tzroggbefp(gxszxtbevoVar.f8331wkgbmnqykc), i13);
        int i16 = iZoijcleaow & 7;
        int i17 = iZoijcleaow & 112;
        int i18 = iZoijcleaow2 & 7;
        int i19 = iZoijcleaow2 & 112;
        if (i18 != 1) {
            iWidth = i18 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i19 != 16) {
            iHeight = i19 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i16 == 1) {
            iWidth -= i14 / 2;
        } else if (i16 != 5) {
            iWidth -= i14;
        }
        if (i17 == 16) {
            iHeight -= i15 / 2;
        } else if (i17 != 80) {
            iHeight -= i15;
        }
        rect2.set(iWidth, iHeight, i14 + iWidth, i15 + iHeight);
    }

    private static int kegysxyocb(int i13) {
        if (i13 == 0) {
            return 17;
        }
        return i13;
    }

    private void lereixgezr(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i13) : i13));
        }
        Comparator comparator = f8291stevsuqkhv;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private static int mbcevpiqjq(int i13) {
        if (i13 == 0) {
            return 8388661;
        }
        return i13;
    }

    private void ntlheqmsrt(View view, int i13) {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) view.getLayoutParams();
        int i14 = gxszxtbevoVar.f8318dxjokdxxww;
        if (i14 != i13) {
            jhduphickx.jlmebxxoox(view, i13 - i14);
            gxszxtbevoVar.f8318dxjokdxxww = i13;
        }
    }

    private boolean pmvmpeiblj(View view) {
        return this.f8309yggfygwlhe.btonecajqb(view);
    }

    private static int ppxfxbqfkf(int i13, int i14, int i15) {
        if (i13 < i14) {
            return i14;
        }
        return i13 > i15 ? i15 : i13;
    }

    private void stevsuqkhv(boolean z13) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = ((gxszxtbevo) childAt.getLayoutParams()).gxszxtbevo();
            if (ppxfxbqfkfVarGxszxtbevo != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z13) {
                    ppxfxbqfkfVarGxszxtbevo.ojitshcjhn(this, childAt, motionEventObtain);
                } else {
                    ppxfxbqfkfVarGxszxtbevo.wwaezpbzkn(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            ((gxszxtbevo) getChildAt(i14).getLayoutParams()).wflxmlrfwp();
        }
        this.f8293cdpycssgdh = null;
        this.f8306pmvmpeiblj = false;
    }

    private static int tzroggbefp(int i13) {
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        return (i13 & 112) == 0 ? i13 | 48 : i13;
    }

    private void ulzqkzuiru(View view, int i13) {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) view.getLayoutParams();
        int i14 = gxszxtbevoVar.f8316btonecajqb;
        if (i14 != i13) {
            jhduphickx.ribwqtqdhb(view, i13 - i14);
            gxszxtbevoVar.f8316btonecajqb = i13;
        }
    }

    private void wkgbmnqykc(gxszxtbevo gxszxtbevoVar, Rect rect, int i13, int i14) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i13) - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i14) - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).bottomMargin));
        rect.set(iMax, iMax2, i13 + iMax, i14 + iMax2);
    }

    private void yadqdtsiqt(View view, int i13, int i14) {
        int i15;
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) view.getLayoutParams();
        int iZoijcleaow = zdlpuopuiu.zoijcleaow(mbcevpiqjq(gxszxtbevoVar.f8327ppxfxbqfkf), i14);
        int i16 = iZoijcleaow & 7;
        int i17 = iZoijcleaow & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i14 == 1) {
            i13 = width - i13;
        }
        int iIwizpuwonk = iwizpuwonk(i13) - measuredWidth;
        if (i16 == 1) {
            iIwizpuwonk += measuredWidth / 2;
        } else if (i16 == 5) {
            iIwizpuwonk += measuredWidth;
        }
        if (i17 != 16) {
            i15 = i17 != 80 ? 0 : measuredHeight;
        } else {
            i15 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).leftMargin, Math.min(iIwizpuwonk, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).topMargin, Math.min(i15, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    @Override // v1.lmojexxdyd
    public void agtfadlqog(View view, int i13, int i14, int i15, int i16, int i17) {
        wflxmlrfwp(view, i13, i14, i15, i16, 0, this.f8303lereixgezr);
    }

    @Override // v1.lmojexxdyd
    public void btonecajqb(View view, int i13) {
        this.f8297hkdspvbjdz.eablkybsjg(view, i13);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) childAt.getLayoutParams();
            if (gxszxtbevoVar.btonecajqb(i13)) {
                ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar.gxszxtbevo();
                if (ppxfxbqfkfVarGxszxtbevo != null) {
                    ppxfxbqfkfVarGxszxtbevo.lmojexxdyd(this, childAt, view, i13);
                }
                gxszxtbevoVar.draadjrbmk(i13);
                gxszxtbevoVar.gtknphoqwx();
            }
        }
        this.f8308yadqdtsiqt = null;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof gxszxtbevo) && super.checkLayoutParams(layoutParams);
    }

    void cllcsxoeiz(View view, Rect rect) {
        ((gxszxtbevo) view.getLayoutParams()).vdvldrhtss(rect);
    }

    void cqumvgiudr(View view, Rect rect) {
        rect.set(((gxszxtbevo) view.getLayoutParams()).nufgyqmvbu());
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo generateLayoutParams(AttributeSet attributeSet) {
        return new gxszxtbevo(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j13) {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) view.getLayoutParams();
        ppxfxbqfkf ppxfxbqfkfVar = gxszxtbevoVar.f8322iobyxmoadg;
        if (ppxfxbqfkfVar != null) {
            float fNufgyqmvbu = ppxfxbqfkfVar.nufgyqmvbu(this, view);
            if (fNufgyqmvbu > 0.0f) {
                if (this.f8294cqumvgiudr == null) {
                    this.f8294cqumvgiudr = new Paint();
                }
                this.f8294cqumvgiudr.setColor(gxszxtbevoVar.f8322iobyxmoadg.lqeggnwhkg(this, view));
                this.f8294cqumvgiudr.setAlpha(ppxfxbqfkf(Math.round(fNufgyqmvbu * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f8294cqumvgiudr);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j13);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8305pkzmftpjix;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // v1.lmojexxdyd
    public void dxjokdxxww(View view, View view2, int i13, int i14) {
        ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        this.f8297hkdspvbjdz.ppxfxbqfkf(view, view2, i13, i14);
        this.f8308yadqdtsiqt = view2;
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) childAt.getLayoutParams();
            if (gxszxtbevoVar.btonecajqb(i14) && (ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar.gxszxtbevo()) != null) {
                ppxfxbqfkfVarGxszxtbevo.lereixgezr(this, childAt, view, view2, i13, i14);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    gxszxtbevo esjtqupxsv(View view) {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) view.getLayoutParams();
        if (!gxszxtbevoVar.f8332zoijcleaow) {
            if (view instanceof zoijcleaow) {
                ppxfxbqfkf behavior = ((zoijcleaow) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                gxszxtbevoVar.ojitshcjhn(behavior);
                gxszxtbevoVar.f8332zoijcleaow = true;
            } else {
                wkgbmnqykc wkgbmnqykcVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    wkgbmnqykcVar = (wkgbmnqykc) superclass.getAnnotation(wkgbmnqykc.class);
                    if (wkgbmnqykcVar != null) {
                        break;
                    }
                }
                if (wkgbmnqykcVar != null) {
                    try {
                        gxszxtbevoVar.ojitshcjhn((ppxfxbqfkf) wkgbmnqykcVar.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e13) {
                        Log.e("CoordinatorLayout", "Default behavior class " + wkgbmnqykcVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e13);
                    }
                }
                gxszxtbevoVar.f8332zoijcleaow = true;
            }
        }
        return gxszxtbevoVar;
    }

    final List<View> getDependencySortedChildren() {
        hkdspvbjdz();
        return Collections.unmodifiableList(this.f8311zdlpuopuiu);
    }

    public final skhdrjzrfn getLastWindowInsets() {
        return this.f8307wwaezpbzkn;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f8297hkdspvbjdz.iobyxmoadg();
    }

    public Drawable getStatusBarBackground() {
        return this.f8305pkzmftpjix;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // v1.lmojexxdyd
    public void gtknphoqwx(View view, int i13, int i14, int[] iArr, int i15) {
        ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        int childCount = getChildCount();
        boolean z13 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                gxszxtbevo gxszxtbevoVar = (gxszxtbevo) childAt.getLayoutParams();
                if (gxszxtbevoVar.btonecajqb(i15) && (ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar.gxszxtbevo()) != null) {
                    int[] iArr2 = this.f8295esjtqupxsv;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ppxfxbqfkfVarGxszxtbevo.yggfygwlhe(this, childAt, view, i13, i14, iArr2, i15);
                    int[] iArr3 = this.f8295esjtqupxsv;
                    iMax = i13 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f8295esjtqupxsv;
                    iMax2 = i14 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z13 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z13) {
            wwaezpbzkn(1);
        }
    }

    public void gxszxtbevo(View view) {
        List listLqeggnwhkg = this.f8309yggfygwlhe.lqeggnwhkg(view);
        if (listLqeggnwhkg == null || listLqeggnwhkg.isEmpty()) {
            return;
        }
        for (int i13 = 0; i13 < listLqeggnwhkg.size(); i13++) {
            View view2 = (View) listLqeggnwhkg.get(i13);
            ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = ((gxszxtbevo) view2.getLayoutParams()).gxszxtbevo();
            if (ppxfxbqfkfVarGxszxtbevo != null) {
                ppxfxbqfkfVarGxszxtbevo.draadjrbmk(this, view2, view);
            }
        }
    }

    public List kcexrzcfyt(View view) {
        List listLqeggnwhkg = this.f8309yggfygwlhe.lqeggnwhkg(view);
        this.f8300iwizpuwonk.clear();
        if (listLqeggnwhkg != null) {
            this.f8300iwizpuwonk.addAll(listLqeggnwhkg);
        }
        return this.f8300iwizpuwonk;
    }

    void lmojexxdyd(View view, int i13) {
        ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) view.getLayoutParams();
        if (gxszxtbevoVar.f8320gtknphoqwx != null) {
            Rect rectIobyxmoadg = iobyxmoadg();
            Rect rectIobyxmoadg2 = iobyxmoadg();
            Rect rectIobyxmoadg3 = iobyxmoadg();
            zdlpuopuiu(gxszxtbevoVar.f8320gtknphoqwx, rectIobyxmoadg);
            vdvldrhtss(view, false, rectIobyxmoadg2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            jyumaefscl(view, i13, rectIobyxmoadg, rectIobyxmoadg3, gxszxtbevoVar, measuredWidth, measuredHeight);
            boolean z13 = (rectIobyxmoadg3.left == rectIobyxmoadg2.left && rectIobyxmoadg3.top == rectIobyxmoadg2.top) ? false : true;
            wkgbmnqykc(gxszxtbevoVar, rectIobyxmoadg3, measuredWidth, measuredHeight);
            int i14 = rectIobyxmoadg3.left - rectIobyxmoadg2.left;
            int i15 = rectIobyxmoadg3.top - rectIobyxmoadg2.top;
            if (i14 != 0) {
                jhduphickx.jlmebxxoox(view, i14);
            }
            if (i15 != 0) {
                jhduphickx.ribwqtqdhb(view, i15);
            }
            if (z13 && (ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar.gxszxtbevo()) != null) {
                ppxfxbqfkfVarGxszxtbevo.draadjrbmk(this, view, gxszxtbevoVar.f8320gtknphoqwx);
            }
            dsvhmnatus(rectIobyxmoadg);
            dsvhmnatus(rectIobyxmoadg2);
            dsvhmnatus(rectIobyxmoadg3);
        }
    }

    void lqeggnwhkg() {
        int childCount = getChildCount();
        boolean z13 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            if (pmvmpeiblj(getChildAt(i13))) {
                z13 = true;
                break;
            }
        }
        if (z13 != this.f8304lmojexxdyd) {
            if (z13) {
                zoijcleaow();
            } else {
                wypolnanlu();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo generateDefaultLayoutParams() {
        return new gxszxtbevo(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof gxszxtbevo) {
            return new gxszxtbevo((gxszxtbevo) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new gxszxtbevo((ViewGroup.MarginLayoutParams) layoutParams) : new gxszxtbevo(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        stevsuqkhv(false);
        if (this.f8304lmojexxdyd) {
            if (this.f8298iozdgvuglv == null) {
                this.f8298iozdgvuglv = new lqeggnwhkg();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f8298iozdgvuglv);
        }
        if (this.f8307wwaezpbzkn == null && jhduphickx.iwizpuwonk(this)) {
            jhduphickx.ydmasvzmpa(this);
        }
        this.f8312zynmafqrjb = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stevsuqkhv(false);
        if (this.f8304lmojexxdyd && this.f8298iozdgvuglv != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f8298iozdgvuglv);
        }
        View view = this.f8308yadqdtsiqt;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f8312zynmafqrjb = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f8310ylkuphrtab || this.f8305pkzmftpjix == null) {
            return;
        }
        skhdrjzrfn skhdrjzrfnVar = this.f8307wwaezpbzkn;
        int iWflxmlrfwp = skhdrjzrfnVar != null ? skhdrjzrfnVar.wflxmlrfwp() : 0;
        if (iWflxmlrfwp > 0) {
            this.f8305pkzmftpjix.setBounds(0, 0, getWidth(), iWflxmlrfwp);
            this.f8305pkzmftpjix.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            stevsuqkhv(true);
        }
        boolean zJpowsppfya = jpowsppfya(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            stevsuqkhv(true);
        }
        return zJpowsppfya;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        int iLereixgezr = jhduphickx.lereixgezr(this);
        int size = this.f8311zdlpuopuiu.size();
        for (int i17 = 0; i17 < size; i17++) {
            View view = (View) this.f8311zdlpuopuiu.get(i17);
            if (view.getVisibility() != 8 && ((ppxfxbqfkfVarGxszxtbevo = ((gxszxtbevo) view.getLayoutParams()).gxszxtbevo()) == null || !ppxfxbqfkfVarGxszxtbevo.rgvfuqvkyq(this, view, iLereixgezr))) {
                ylkuphrtab(view, iLereixgezr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:46:0x011f  */
    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        int i15;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        gxszxtbevo gxszxtbevoVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        hkdspvbjdz();
        lqeggnwhkg();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int iLereixgezr = jhduphickx.lereixgezr(this);
        boolean z13 = iLereixgezr == 1;
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i14);
        int i25 = paddingLeft + paddingRight;
        int i26 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z14 = this.f8307wwaezpbzkn != null && jhduphickx.iwizpuwonk(this);
        int size3 = this.f8311zdlpuopuiu.size();
        int i27 = suggestedMinimumWidth;
        int i28 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i29 = 0;
        while (i29 < size3) {
            View view = (View) this.f8311zdlpuopuiu.get(i29);
            if (view.getVisibility() == 8) {
                i23 = i29;
                i17 = size3;
                i18 = paddingLeft;
            } else {
                gxszxtbevo gxszxtbevoVar2 = (gxszxtbevo) view.getLayoutParams();
                int i33 = gxszxtbevoVar2.f8319eablkybsjg;
                if (i33 < 0 || mode == 0) {
                    i15 = iCombineMeasuredStates;
                } else {
                    int iIwizpuwonk = iwizpuwonk(i33);
                    int iZoijcleaow = zdlpuopuiu.zoijcleaow(mbcevpiqjq(gxszxtbevoVar2.f8327ppxfxbqfkf), iLereixgezr) & 7;
                    i15 = iCombineMeasuredStates;
                    if ((iZoijcleaow == 3 && !z13) || (iZoijcleaow == 5 && z13)) {
                        iMax = Math.max(0, (size - paddingRight) - iIwizpuwonk);
                    } else if ((iZoijcleaow == 5 && !z13) || (iZoijcleaow == 3 && z13)) {
                        iMax = Math.max(0, iIwizpuwonk - paddingLeft);
                    }
                    if (z14 || jhduphickx.iwizpuwonk(view)) {
                        iMakeMeasureSpec = i13;
                        iMakeMeasureSpec2 = i14;
                    } else {
                        int iGtknphoqwx = this.f8307wwaezpbzkn.gtknphoqwx() + this.f8307wwaezpbzkn.draadjrbmk();
                        int iWflxmlrfwp = this.f8307wwaezpbzkn.wflxmlrfwp() + this.f8307wwaezpbzkn.btonecajqb();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iGtknphoqwx, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iWflxmlrfwp, mode2);
                    }
                    ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar2.gxszxtbevo();
                    if (ppxfxbqfkfVarGxszxtbevo != null) {
                        gxszxtbevoVar = gxszxtbevoVar2;
                        i19 = i15;
                        i23 = i29;
                        i16 = i28;
                        i18 = paddingLeft;
                        i24 = i27;
                        i17 = size3;
                        if (!ppxfxbqfkfVarGxszxtbevo.vdvldrhtss(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                        }
                        gxszxtbevo gxszxtbevoVar3 = gxszxtbevoVar;
                        int iMax2 = Math.max(i24, i25 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar3).leftMargin + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar3).rightMargin);
                        int iMax3 = Math.max(i16, i26 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar3).topMargin + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar3).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                        i27 = iMax2;
                        i28 = iMax3;
                    } else {
                        gxszxtbevoVar = gxszxtbevoVar2;
                        i16 = i28;
                        i17 = size3;
                        i18 = paddingLeft;
                        i19 = i15;
                        i23 = i29;
                        i24 = i27;
                    }
                    pkzmftpjix(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    gxszxtbevo gxszxtbevoVar4 = gxszxtbevoVar;
                    int iMax4 = Math.max(i24, i25 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar4).leftMargin + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar4).rightMargin);
                    int iMax5 = Math.max(i16, i26 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar4).topMargin + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar4).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                    i27 = iMax4;
                    i28 = iMax5;
                }
                iMax = 0;
                if (z14) {
                    iMakeMeasureSpec = i13;
                    iMakeMeasureSpec2 = i14;
                } else {
                    iMakeMeasureSpec = i13;
                    iMakeMeasureSpec2 = i14;
                }
                ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar2.gxszxtbevo();
                if (ppxfxbqfkfVarGxszxtbevo != null) {
                    gxszxtbevoVar = gxszxtbevoVar2;
                    i19 = i15;
                    i23 = i29;
                    i16 = i28;
                    i18 = paddingLeft;
                    i24 = i27;
                    i17 = size3;
                    if (!ppxfxbqfkfVarGxszxtbevo.vdvldrhtss(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                    }
                    gxszxtbevo gxszxtbevoVar5 = gxszxtbevoVar;
                    int iMax6 = Math.max(i24, i25 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar5).leftMargin + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar5).rightMargin);
                    int iMax7 = Math.max(i16, i26 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar5).topMargin + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar5).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                    i27 = iMax6;
                    i28 = iMax7;
                } else {
                    gxszxtbevoVar = gxszxtbevoVar2;
                    i16 = i28;
                    i17 = size3;
                    i18 = paddingLeft;
                    i19 = i15;
                    i23 = i29;
                    i24 = i27;
                }
                pkzmftpjix(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                gxszxtbevo gxszxtbevoVar6 = gxszxtbevoVar;
                int iMax8 = Math.max(i24, i25 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar6).leftMargin + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar6).rightMargin);
                int iMax9 = Math.max(i16, i26 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar6).topMargin + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar6).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                i27 = iMax8;
                i28 = iMax9;
            }
            i29 = i23 + 1;
            paddingLeft = i18;
            size3 = i17;
        }
        int i34 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i27, i13, (-16777216) & i34), View.resolveSizeAndState(i28, i14, i34 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        int childCount = getChildCount();
        boolean zOxmwwwfdhm = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                gxszxtbevo gxszxtbevoVar = (gxszxtbevo) childAt.getLayoutParams();
                if (gxszxtbevoVar.btonecajqb(0) && (ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar.gxszxtbevo()) != null) {
                    zOxmwwwfdhm |= ppxfxbqfkfVarGxszxtbevo.oxmwwwfdhm(this, childAt, view, f13, f14, z13);
                }
            }
        }
        if (zOxmwwwfdhm) {
            wwaezpbzkn(1);
        }
        return zOxmwwwfdhm;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f13, float f14) {
        ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        int childCount = getChildCount();
        boolean zKcexrzcfyt = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                gxszxtbevo gxszxtbevoVar = (gxszxtbevo) childAt.getLayoutParams();
                if (gxszxtbevoVar.btonecajqb(0) && (ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar.gxszxtbevo()) != null) {
                    zKcexrzcfyt |= ppxfxbqfkfVarGxszxtbevo.kcexrzcfyt(this, childAt, view, f13, f14);
                }
            }
        }
        return zKcexrzcfyt;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
        gtknphoqwx(view, i13, i14, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        agtfadlqog(view, i13, i14, i15, i16, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i13) {
        dxjokdxxww(view, view2, i13, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.zoijcleaow());
        SparseArray sparseArray = savedState.f8313jyumaefscl;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            int id2 = childAt.getId();
            ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = esjtqupxsv(childAt).gxszxtbevo();
            if (id2 != -1 && ppxfxbqfkfVarGxszxtbevo != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                ppxfxbqfkfVarGxszxtbevo.zynmafqrjb(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableIstkbnxepw;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            int id2 = childAt.getId();
            ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = ((gxszxtbevo) childAt.getLayoutParams()).gxszxtbevo();
            if (id2 != -1 && ppxfxbqfkfVarGxszxtbevo != null && (parcelableIstkbnxepw = ppxfxbqfkfVarGxszxtbevo.istkbnxepw(this, childAt)) != null) {
                sparseArray.append(id2, parcelableIstkbnxepw);
            }
        }
        savedState.f8313jyumaefscl = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i13) {
        return rgvfuqvkyq(view, view2, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        btonecajqb(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zJpowsppfya;
        boolean zWwaezpbzkn;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f8293cdpycssgdh == null) {
            zJpowsppfya = jpowsppfya(motionEvent, 1);
            if (!zJpowsppfya) {
                zWwaezpbzkn = false;
            }
            motionEventObtain = null;
            if (this.f8293cdpycssgdh == null) {
                zWwaezpbzkn |= super.onTouchEvent(motionEvent);
            } else if (zJpowsppfya) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                stevsuqkhv(false);
            }
            return zWwaezpbzkn;
        }
        zJpowsppfya = false;
        ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = ((gxszxtbevo) this.f8293cdpycssgdh.getLayoutParams()).gxszxtbevo();
        if (ppxfxbqfkfVarGxszxtbevo != null) {
            zWwaezpbzkn = ppxfxbqfkfVarGxszxtbevo.wwaezpbzkn(this, this.f8293cdpycssgdh, motionEvent);
        } else {
            zWwaezpbzkn = false;
        }
        motionEventObtain = null;
        if (this.f8293cdpycssgdh == null) {
            zWwaezpbzkn |= super.onTouchEvent(motionEvent);
        } else if (zJpowsppfya) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            stevsuqkhv(false);
        } else {
            stevsuqkhv(false);
        }
        return zWwaezpbzkn;
    }

    public List oxmwwwfdhm(View view) {
        List listNufgyqmvbu = this.f8309yggfygwlhe.nufgyqmvbu(view);
        this.f8300iwizpuwonk.clear();
        if (listNufgyqmvbu != null) {
            this.f8300iwizpuwonk.addAll(listNufgyqmvbu);
        }
        return this.f8300iwizpuwonk;
    }

    public void pkzmftpjix(View view, int i13, int i14, int i15, int i16) {
        measureChildWithMargins(view, i13, i14, i15, i16);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z13) {
        ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = ((gxszxtbevo) view.getLayoutParams()).gxszxtbevo();
        if (ppxfxbqfkfVarGxszxtbevo == null || !ppxfxbqfkfVarGxszxtbevo.pmvmpeiblj(this, view, rect, z13)) {
            return super.requestChildRectangleOnScreen(view, rect, z13);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z13) {
        super.requestDisallowInterceptTouchEvent(z13);
        if (!z13 || this.f8306pmvmpeiblj) {
            return;
        }
        stevsuqkhv(false);
        this.f8306pmvmpeiblj = true;
    }

    @Override // v1.lmojexxdyd
    public boolean rgvfuqvkyq(View view, View view2, int i13, int i14) {
        int childCount = getChildCount();
        boolean z13 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                gxszxtbevo gxszxtbevoVar = (gxszxtbevo) childAt.getLayoutParams();
                ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar.gxszxtbevo();
                if (ppxfxbqfkfVarGxszxtbevo != null) {
                    boolean zYadqdtsiqt = ppxfxbqfkfVarGxszxtbevo.yadqdtsiqt(this, childAt, view, view2, i13, i14);
                    z13 |= zYadqdtsiqt;
                    gxszxtbevoVar.oxmwwwfdhm(i14, zYadqdtsiqt);
                } else {
                    gxszxtbevoVar.oxmwwwfdhm(i14, false);
                }
            }
        }
        return z13;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z13) {
        super.setFitsSystemWindows(z13);
        crxdokpmqz();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f8296hcddaimhww = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f8305pkzmftpjix;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f8305pkzmftpjix = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f8305pkzmftpjix.setState(getDrawableState());
                }
                k1.iobyxmoadg.wflxmlrfwp(this.f8305pkzmftpjix, jhduphickx.lereixgezr(this));
                this.f8305pkzmftpjix.setVisible(getVisibility() == 0, false);
                this.f8305pkzmftpjix.setCallback(this);
            }
            jhduphickx.xrmfcynszj(this);
        }
    }

    public void setStatusBarBackgroundColor(int i13) {
        setStatusBarBackground(new ColorDrawable(i13));
    }

    public void setStatusBarBackgroundResource(int i13) {
        setStatusBarBackground(i13 != 0 ? androidx.core.content.iobyxmoadg.getDrawable(getContext(), i13) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        boolean z13 = i13 == 0;
        Drawable drawable = this.f8305pkzmftpjix;
        if (drawable == null || drawable.isVisible() == z13) {
            return;
        }
        this.f8305pkzmftpjix.setVisible(z13, false);
    }

    final skhdrjzrfn sopmlzcsov(skhdrjzrfn skhdrjzrfnVar) {
        if (u1.zoijcleaow.iobyxmoadg(this.f8307wwaezpbzkn, skhdrjzrfnVar)) {
            return skhdrjzrfnVar;
        }
        this.f8307wwaezpbzkn = skhdrjzrfnVar;
        boolean z13 = false;
        boolean z14 = skhdrjzrfnVar != null && skhdrjzrfnVar.wflxmlrfwp() > 0;
        this.f8310ylkuphrtab = z14;
        if (!z14 && getBackground() == null) {
            z13 = true;
        }
        setWillNotDraw(z13);
        skhdrjzrfn skhdrjzrfnVarEablkybsjg = eablkybsjg(skhdrjzrfnVar);
        requestLayout();
        return skhdrjzrfnVarEablkybsjg;
    }

    void vdvldrhtss(View view, boolean z13, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z13) {
            zdlpuopuiu(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8305pkzmftpjix;
    }

    @Override // v1.wwaezpbzkn
    public void wflxmlrfwp(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        boolean z13;
        int iMin;
        int childCount = getChildCount();
        boolean z14 = false;
        int iMax = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                gxszxtbevo gxszxtbevoVar = (gxszxtbevo) childAt.getLayoutParams();
                if (gxszxtbevoVar.btonecajqb(i17) && (ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar.gxszxtbevo()) != null) {
                    int[] iArr2 = this.f8295esjtqupxsv;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ppxfxbqfkfVarGxszxtbevo.cqumvgiudr(this, childAt, view, i13, i14, i15, i16, i17, iArr2);
                    int[] iArr3 = this.f8295esjtqupxsv;
                    iMax = i15 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i16 > 0) {
                        z13 = true;
                        iMin = Math.max(i18, this.f8295esjtqupxsv[1]);
                    } else {
                        z13 = true;
                        iMin = Math.min(i18, this.f8295esjtqupxsv[1]);
                    }
                    i18 = iMin;
                    z14 = z13;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i18;
        if (z14) {
            wwaezpbzkn(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    final void wwaezpbzkn(int i13) {
        int i14;
        ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        boolean zDraadjrbmk;
        int iLereixgezr = jhduphickx.lereixgezr(this);
        int size = this.f8311zdlpuopuiu.size();
        Rect rectIobyxmoadg = iobyxmoadg();
        Rect rectIobyxmoadg2 = iobyxmoadg();
        Rect rectIobyxmoadg3 = iobyxmoadg();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) this.f8311zdlpuopuiu.get(i15);
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) view.getLayoutParams();
            if (i13 != 0 || view.getVisibility() != 8) {
                for (int i16 = 0; i16 < i15; i16++) {
                    if (gxszxtbevoVar.f8317draadjrbmk == ((View) this.f8311zdlpuopuiu.get(i16))) {
                        lmojexxdyd(view, iLereixgezr);
                    }
                }
                vdvldrhtss(view, true, rectIobyxmoadg2);
                if (gxszxtbevoVar.f8323lqeggnwhkg != 0 && !rectIobyxmoadg2.isEmpty()) {
                    int iZoijcleaow = zdlpuopuiu.zoijcleaow(gxszxtbevoVar.f8323lqeggnwhkg, iLereixgezr);
                    int i17 = iZoijcleaow & 112;
                    if (i17 == 48) {
                        rectIobyxmoadg.top = Math.max(rectIobyxmoadg.top, rectIobyxmoadg2.bottom);
                    } else if (i17 == 80) {
                        rectIobyxmoadg.bottom = Math.max(rectIobyxmoadg.bottom, getHeight() - rectIobyxmoadg2.top);
                    }
                    int i18 = iZoijcleaow & 7;
                    if (i18 == 3) {
                        rectIobyxmoadg.left = Math.max(rectIobyxmoadg.left, rectIobyxmoadg2.right);
                    } else if (i18 == 5) {
                        rectIobyxmoadg.right = Math.max(rectIobyxmoadg.right, getWidth() - rectIobyxmoadg2.left);
                    }
                }
                if (gxszxtbevoVar.f8324nufgyqmvbu != 0 && view.getVisibility() == 0) {
                    iozdgvuglv(view, rectIobyxmoadg, iLereixgezr);
                }
                if (i13 != 2) {
                    cqumvgiudr(view, rectIobyxmoadg3);
                    if (!rectIobyxmoadg3.equals(rectIobyxmoadg2)) {
                        cllcsxoeiz(view, rectIobyxmoadg2);
                        for (i14 = i15 + 1; i14 < size; i14++) {
                            View view2 = (View) this.f8311zdlpuopuiu.get(i14);
                            gxszxtbevo gxszxtbevoVar2 = (gxszxtbevo) view2.getLayoutParams();
                            ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar2.gxszxtbevo();
                            if (ppxfxbqfkfVarGxszxtbevo == null && ppxfxbqfkfVarGxszxtbevo.dxjokdxxww(this, view2, view)) {
                                if (i13 == 0 && gxszxtbevoVar2.lqeggnwhkg()) {
                                    gxszxtbevoVar2.gtknphoqwx();
                                } else {
                                    if (i13 != 2) {
                                        zDraadjrbmk = ppxfxbqfkfVarGxszxtbevo.draadjrbmk(this, view2, view);
                                    } else {
                                        ppxfxbqfkfVarGxszxtbevo.wflxmlrfwp(this, view2, view);
                                        zDraadjrbmk = true;
                                    }
                                    if (i13 == 1) {
                                        gxszxtbevoVar2.rgvfuqvkyq(zDraadjrbmk);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i14 < size) {
                        View view3 = (View) this.f8311zdlpuopuiu.get(i14);
                        gxszxtbevo gxszxtbevoVar3 = (gxszxtbevo) view3.getLayoutParams();
                        ppxfxbqfkfVarGxszxtbevo = gxszxtbevoVar3.gxszxtbevo();
                        if (ppxfxbqfkfVarGxszxtbevo == null) {
                        }
                    }
                }
            }
        }
        dsvhmnatus(rectIobyxmoadg);
        dsvhmnatus(rectIobyxmoadg2);
        dsvhmnatus(rectIobyxmoadg3);
    }

    void wypolnanlu() {
        if (this.f8312zynmafqrjb && this.f8298iozdgvuglv != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f8298iozdgvuglv);
        }
        this.f8304lmojexxdyd = false;
    }

    void yggfygwlhe(View view, int i13, Rect rect, Rect rect2) {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        jyumaefscl(view, i13, rect, rect2, gxszxtbevoVar, measuredWidth, measuredHeight);
        wkgbmnqykc(gxszxtbevoVar, rect2, measuredWidth, measuredHeight);
    }

    public void ylkuphrtab(View view, int i13) {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) view.getLayoutParams();
        if (gxszxtbevoVar.iobyxmoadg()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = gxszxtbevoVar.f8320gtknphoqwx;
        if (view2 != null) {
            cdpycssgdh(view, view2, i13);
            return;
        }
        int i14 = gxszxtbevoVar.f8319eablkybsjg;
        if (i14 >= 0) {
            yadqdtsiqt(view, i14, i13);
        } else {
            istkbnxepw(view, i13);
        }
    }

    void zdlpuopuiu(View view, Rect rect) {
        androidx.coordinatorlayout.widget.ppxfxbqfkf.iobyxmoadg(this, view, rect);
    }

    void zoijcleaow() {
        if (this.f8312zynmafqrjb) {
            if (this.f8298iozdgvuglv == null) {
                this.f8298iozdgvuglv = new lqeggnwhkg();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f8298iozdgvuglv);
        }
        this.f8304lmojexxdyd = true;
    }

    public boolean zynmafqrjb(View view, int i13, int i14) {
        Rect rectIobyxmoadg = iobyxmoadg();
        zdlpuopuiu(view, rectIobyxmoadg);
        try {
            return rectIobyxmoadg.contains(i13, i14);
        } finally {
            dsvhmnatus(rectIobyxmoadg);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f8311zdlpuopuiu = new ArrayList();
        this.f8309yggfygwlhe = new androidx.coordinatorlayout.widget.zoijcleaow();
        this.f8302jyumaefscl = new ArrayList();
        this.f8300iwizpuwonk = new ArrayList();
        this.f8295esjtqupxsv = new int[2];
        this.f8303lereixgezr = new int[2];
        this.f8297hkdspvbjdz = new ylkuphrtab(this);
        TypedArray typedArrayObtainStyledAttributes = i13 == 0 ? context.obtainStyledAttributes(attributeSet, f1.ppxfxbqfkf.CoordinatorLayout, 0, f1.zoijcleaow.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, f1.ppxfxbqfkf.CoordinatorLayout, i13, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (i13 == 0) {
                saveAttributeDataForStyleable(context, f1.ppxfxbqfkf.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, f1.zoijcleaow.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, f1.ppxfxbqfkf.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i13, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(f1.ppxfxbqfkf.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f8299istkbnxepw = resources.getIntArray(resourceId);
            float f13 = resources.getDisplayMetrics().density;
            int length = this.f8299istkbnxepw.length;
            for (int i14 = 0; i14 < length; i14++) {
                int[] iArr = this.f8299istkbnxepw;
                iArr[i14] = (int) (iArr[i14] * f13);
            }
        }
        this.f8305pkzmftpjix = typedArrayObtainStyledAttributes.getDrawable(f1.ppxfxbqfkf.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        crxdokpmqz();
        super.setOnHierarchyChangeListener(new eablkybsjg());
        if (jhduphickx.cqumvgiudr(this) == 0) {
            jhduphickx.uawqvzlxes(this, 1);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        SparseArray f8313jyumaefscl;

        static class iobyxmoadg implements Parcelable.ClassLoaderCreator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i13 = parcel.readInt();
            int[] iArr = new int[i13];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f8313jyumaefscl = new SparseArray(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                this.f8313jyumaefscl.append(iArr[i14], parcelableArray[i14]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            SparseArray sparseArray = this.f8313jyumaefscl;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i14 = 0; i14 < size; i14++) {
                iArr[i14] = this.f8313jyumaefscl.keyAt(i14);
                parcelableArr[i14] = (Parcelable) this.f8313jyumaefscl.valueAt(i14);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i13);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class gxszxtbevo extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private boolean f8315agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        int f8316btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        View f8317draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        int f8318dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public int f8319eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        View f8320gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        int f8321gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        ppxfxbqfkf f8322iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public int f8323lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public int f8324nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private boolean f8325ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        Object f8326oxmwwwfdhm;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f8327ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private boolean f8328rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        final Rect f8329vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private boolean f8330wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public int f8331wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        boolean f8332zoijcleaow;

        public gxszxtbevo(int i13, int i14) {
            super(i13, i14);
            this.f8332zoijcleaow = false;
            this.f8327ppxfxbqfkf = 0;
            this.f8331wkgbmnqykc = 0;
            this.f8319eablkybsjg = -1;
            this.f8321gxszxtbevo = -1;
            this.f8323lqeggnwhkg = 0;
            this.f8324nufgyqmvbu = 0;
            this.f8329vdvldrhtss = new Rect();
        }

        private void agtfadlqog(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f8321gxszxtbevo);
            this.f8320gtknphoqwx = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f8317draadjrbmk = null;
                    this.f8320gtknphoqwx = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f8321gxszxtbevo) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f8317draadjrbmk = null;
                this.f8320gtknphoqwx = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f8317draadjrbmk = null;
                    this.f8320gtknphoqwx = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f8317draadjrbmk = viewFindViewById;
        }

        private boolean kcexrzcfyt(View view, int i13) {
            int iZoijcleaow = zdlpuopuiu.zoijcleaow(((gxszxtbevo) view.getLayoutParams()).f8323lqeggnwhkg, i13);
            return iZoijcleaow != 0 && (zdlpuopuiu.zoijcleaow(this.f8324nufgyqmvbu, i13) & iZoijcleaow) == iZoijcleaow;
        }

        private boolean zdlpuopuiu(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f8320gtknphoqwx.getId() != this.f8321gxszxtbevo) {
                return false;
            }
            View view2 = this.f8320gtknphoqwx;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f8317draadjrbmk = null;
                    this.f8320gtknphoqwx = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f8317draadjrbmk = view2;
            return true;
        }

        boolean btonecajqb(int i13) {
            if (i13 == 0) {
                return this.f8315agtfadlqog;
            }
            if (i13 != 1) {
                return false;
            }
            return this.f8325ojitshcjhn;
        }

        void draadjrbmk(int i13) {
            oxmwwwfdhm(i13, false);
        }

        boolean dxjokdxxww(CoordinatorLayout coordinatorLayout, View view) {
            boolean z13 = this.f8330wflxmlrfwp;
            if (z13) {
                return true;
            }
            ppxfxbqfkf ppxfxbqfkfVar = this.f8322iobyxmoadg;
            boolean zEablkybsjg = (ppxfxbqfkfVar != null ? ppxfxbqfkfVar.eablkybsjg(coordinatorLayout, view) : false) | z13;
            this.f8330wflxmlrfwp = zEablkybsjg;
            return zEablkybsjg;
        }

        public int eablkybsjg() {
            return this.f8321gxszxtbevo;
        }

        void gtknphoqwx() {
            this.f8328rgvfuqvkyq = false;
        }

        public ppxfxbqfkf gxszxtbevo() {
            return this.f8322iobyxmoadg;
        }

        boolean iobyxmoadg() {
            return this.f8320gtknphoqwx == null && this.f8321gxszxtbevo != -1;
        }

        boolean lqeggnwhkg() {
            return this.f8328rgvfuqvkyq;
        }

        Rect nufgyqmvbu() {
            return this.f8329vdvldrhtss;
        }

        public void ojitshcjhn(ppxfxbqfkf ppxfxbqfkfVar) {
            ppxfxbqfkf ppxfxbqfkfVar2 = this.f8322iobyxmoadg;
            if (ppxfxbqfkfVar2 != ppxfxbqfkfVar) {
                if (ppxfxbqfkfVar2 != null) {
                    ppxfxbqfkfVar2.agtfadlqog();
                }
                this.f8322iobyxmoadg = ppxfxbqfkfVar;
                this.f8326oxmwwwfdhm = null;
                this.f8332zoijcleaow = true;
                if (ppxfxbqfkfVar != null) {
                    ppxfxbqfkfVar.gtknphoqwx(this);
                }
            }
        }

        void oxmwwwfdhm(int i13, boolean z13) {
            if (i13 == 0) {
                this.f8315agtfadlqog = z13;
            } else {
                if (i13 != 1) {
                    return;
                }
                this.f8325ojitshcjhn = z13;
            }
        }

        boolean ppxfxbqfkf() {
            if (this.f8322iobyxmoadg == null) {
                this.f8330wflxmlrfwp = false;
            }
            return this.f8330wflxmlrfwp;
        }

        void rgvfuqvkyq(boolean z13) {
            this.f8328rgvfuqvkyq = z13;
        }

        void vdvldrhtss(Rect rect) {
            this.f8329vdvldrhtss.set(rect);
        }

        void wflxmlrfwp() {
            this.f8330wflxmlrfwp = false;
        }

        View wkgbmnqykc(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f8321gxszxtbevo == -1) {
                this.f8317draadjrbmk = null;
                this.f8320gtknphoqwx = null;
                return null;
            }
            if (this.f8320gtknphoqwx == null || !zdlpuopuiu(view, coordinatorLayout)) {
                agtfadlqog(view, coordinatorLayout);
            }
            return this.f8320gtknphoqwx;
        }

        boolean zoijcleaow(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ppxfxbqfkf ppxfxbqfkfVar;
            return view2 == this.f8317draadjrbmk || kcexrzcfyt(view2, jhduphickx.lereixgezr(coordinatorLayout)) || ((ppxfxbqfkfVar = this.f8322iobyxmoadg) != null && ppxfxbqfkfVar.dxjokdxxww(coordinatorLayout, view, view2));
        }

        gxszxtbevo(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8332zoijcleaow = false;
            this.f8327ppxfxbqfkf = 0;
            this.f8331wkgbmnqykc = 0;
            this.f8319eablkybsjg = -1;
            this.f8321gxszxtbevo = -1;
            this.f8323lqeggnwhkg = 0;
            this.f8324nufgyqmvbu = 0;
            this.f8329vdvldrhtss = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1.ppxfxbqfkf.CoordinatorLayout_Layout);
            this.f8327ppxfxbqfkf = typedArrayObtainStyledAttributes.getInteger(f1.ppxfxbqfkf.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f8321gxszxtbevo = typedArrayObtainStyledAttributes.getResourceId(f1.ppxfxbqfkf.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f8331wkgbmnqykc = typedArrayObtainStyledAttributes.getInteger(f1.ppxfxbqfkf.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f8319eablkybsjg = typedArrayObtainStyledAttributes.getInteger(f1.ppxfxbqfkf.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f8323lqeggnwhkg = typedArrayObtainStyledAttributes.getInt(f1.ppxfxbqfkf.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f8324nufgyqmvbu = typedArrayObtainStyledAttributes.getInt(f1.ppxfxbqfkf.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(f1.ppxfxbqfkf.CoordinatorLayout_Layout_layout_behavior);
            this.f8332zoijcleaow = zHasValue;
            if (zHasValue) {
                this.f8322iobyxmoadg = CoordinatorLayout.hcddaimhww(context, attributeSet, typedArrayObtainStyledAttributes.getString(f1.ppxfxbqfkf.CoordinatorLayout_Layout_layout_behavior));
            }
            typedArrayObtainStyledAttributes.recycle();
            ppxfxbqfkf ppxfxbqfkfVar = this.f8322iobyxmoadg;
            if (ppxfxbqfkfVar != null) {
                ppxfxbqfkfVar.gtknphoqwx(this);
            }
        }

        public gxszxtbevo(gxszxtbevo gxszxtbevoVar) {
            super((ViewGroup.MarginLayoutParams) gxszxtbevoVar);
            this.f8332zoijcleaow = false;
            this.f8327ppxfxbqfkf = 0;
            this.f8331wkgbmnqykc = 0;
            this.f8319eablkybsjg = -1;
            this.f8321gxszxtbevo = -1;
            this.f8323lqeggnwhkg = 0;
            this.f8324nufgyqmvbu = 0;
            this.f8329vdvldrhtss = new Rect();
        }

        public gxszxtbevo(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8332zoijcleaow = false;
            this.f8327ppxfxbqfkf = 0;
            this.f8331wkgbmnqykc = 0;
            this.f8319eablkybsjg = -1;
            this.f8321gxszxtbevo = -1;
            this.f8323lqeggnwhkg = 0;
            this.f8324nufgyqmvbu = 0;
            this.f8329vdvldrhtss = new Rect();
        }

        public gxszxtbevo(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8332zoijcleaow = false;
            this.f8327ppxfxbqfkf = 0;
            this.f8331wkgbmnqykc = 0;
            this.f8319eablkybsjg = -1;
            this.f8321gxszxtbevo = -1;
            this.f8323lqeggnwhkg = 0;
            this.f8324nufgyqmvbu = 0;
            this.f8329vdvldrhtss = new Rect();
        }
    }
}
