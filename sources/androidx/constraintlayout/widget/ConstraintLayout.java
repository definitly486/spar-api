package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.yggfygwlhe;
import c1.wflxmlrfwp;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static dxjokdxxww sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.zoijcleaow> mConstraintHelpers;
    protected androidx.constraintlayout.widget.ppxfxbqfkf mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.wkgbmnqykc mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected c1.gxszxtbevo mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    ppxfxbqfkf mMeasurer;
    private z0.eablkybsjg mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<wkgbmnqykc> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<c1.eablkybsjg> mTempMapIdToWidget;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f7993iobyxmoadg;

        static {
            int[] iArr = new int[c1.eablkybsjg.zoijcleaow.values().length];
            f7993iobyxmoadg = iArr;
            try {
                iArr[c1.eablkybsjg.zoijcleaow.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7993iobyxmoadg[c1.eablkybsjg.zoijcleaow.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7993iobyxmoadg[c1.eablkybsjg.zoijcleaow.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7993iobyxmoadg[c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class ppxfxbqfkf implements d1.zoijcleaow.InterfaceC0476zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f7994eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        int f7995gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        ConstraintLayout f7996iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        int f7997lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f7999ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f8000wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f8001zoijcleaow;

        ppxfxbqfkf(ConstraintLayout constraintLayout) {
            this.f7996iobyxmoadg = constraintLayout;
        }

        private boolean wkgbmnqykc(int i13, int i14, int i15) {
            if (i13 == i14) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i13);
            return View.MeasureSpec.getMode(i14) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i15 == View.MeasureSpec.getSize(i14);
        }

        @Override // d1.zoijcleaow.InterfaceC0476zoijcleaow
        public final void iobyxmoadg() {
            int childCount = this.f7996iobyxmoadg.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                this.f7996iobyxmoadg.getChildAt(i13);
            }
            int size = this.f7996iobyxmoadg.mConstraintHelpers.size();
            if (size > 0) {
                for (int i14 = 0; i14 < size; i14++) {
                    ((androidx.constraintlayout.widget.zoijcleaow) this.f7996iobyxmoadg.mConstraintHelpers.get(i14)).agtfadlqog(this.f7996iobyxmoadg);
                }
            }
        }

        public void ppxfxbqfkf(int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f8001zoijcleaow = i15;
            this.f7999ppxfxbqfkf = i16;
            this.f8000wkgbmnqykc = i17;
            this.f7994eablkybsjg = i18;
            this.f7995gxszxtbevo = i13;
            this.f7997lqeggnwhkg = i14;
        }

        @Override // d1.zoijcleaow.InterfaceC0476zoijcleaow
        public final void zoijcleaow(c1.eablkybsjg eablkybsjgVar, d1.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int iMakeMeasureSpec3;
            int iMakeMeasureSpec4;
            int i13;
            if (eablkybsjgVar == null) {
                return;
            }
            if (eablkybsjgVar.crxdokpmqz() == 8 && !eablkybsjgVar.ydmasvzmpa()) {
                iobyxmoadgVar.f26673eablkybsjg = 0;
                iobyxmoadgVar.f26674gxszxtbevo = 0;
                iobyxmoadgVar.f26676lqeggnwhkg = 0;
                return;
            }
            if (eablkybsjgVar.hkdspvbjdz() == null) {
                return;
            }
            ConstraintLayout.access$000(ConstraintLayout.this);
            c1.eablkybsjg.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f26675iobyxmoadg;
            c1.eablkybsjg.zoijcleaow zoijcleaowVar2 = iobyxmoadgVar.f26680zoijcleaow;
            int i14 = iobyxmoadgVar.f26678ppxfxbqfkf;
            int i15 = iobyxmoadgVar.f26679wkgbmnqykc;
            int i16 = this.f8001zoijcleaow + this.f7999ppxfxbqfkf;
            int i17 = this.f8000wkgbmnqykc;
            View view = (View) eablkybsjgVar.yggfygwlhe();
            int[] iArr = iobyxmoadg.f7993iobyxmoadg;
            int i18 = iArr[zoijcleaowVar.ordinal()];
            if (i18 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            } else if (i18 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f7995gxszxtbevo, i17, -2);
            } else if (i18 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f7995gxszxtbevo, i17 + eablkybsjgVar.cdpycssgdh(), -1);
            } else if (i18 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f7995gxszxtbevo, i17, -2);
                boolean z13 = eablkybsjgVar.f18264iwizpuwonk == 1;
                int i19 = iobyxmoadgVar.f26671btonecajqb;
                if (i19 == d1.zoijcleaow.iobyxmoadg.f26668draadjrbmk || i19 == d1.zoijcleaow.iobyxmoadg.f26670wflxmlrfwp) {
                    boolean z14 = view.getMeasuredHeight() == eablkybsjgVar.lereixgezr();
                    if (iobyxmoadgVar.f26671btonecajqb == d1.zoijcleaow.iobyxmoadg.f26670wflxmlrfwp || !z13 || ((z13 && z14) || eablkybsjgVar.bfopjjpdmp())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eablkybsjgVar.jlmebxxoox(), 1073741824);
                    }
                }
            }
            int i23 = iArr[zoijcleaowVar2.ordinal()];
            if (i23 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            } else if (i23 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7997lqeggnwhkg, i16, -2);
            } else if (i23 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7997lqeggnwhkg, i16 + eablkybsjgVar.sopmlzcsov(), -1);
            } else if (i23 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7997lqeggnwhkg, i16, -2);
                boolean z15 = eablkybsjgVar.f18238cqumvgiudr == 1;
                int i24 = iobyxmoadgVar.f26671btonecajqb;
                if (i24 == d1.zoijcleaow.iobyxmoadg.f26668draadjrbmk || i24 == d1.zoijcleaow.iobyxmoadg.f26670wflxmlrfwp) {
                    boolean z16 = view.getMeasuredWidth() == eablkybsjgVar.jlmebxxoox();
                    if (iobyxmoadgVar.f26671btonecajqb == d1.zoijcleaow.iobyxmoadg.f26670wflxmlrfwp || !z15 || ((z15 && z16) || eablkybsjgVar.opjhrmiecq())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eablkybsjgVar.lereixgezr(), 1073741824);
                    }
                }
            }
            c1.gxszxtbevo gxszxtbevoVar = (c1.gxszxtbevo) eablkybsjgVar.hkdspvbjdz();
            if (gxszxtbevoVar != null && c1.gtknphoqwx.zoijcleaow(ConstraintLayout.this.mOptimizationLevel, UserVerificationMethods.USER_VERIFY_HANDPRINT) && view.getMeasuredWidth() == eablkybsjgVar.jlmebxxoox() && view.getMeasuredWidth() < gxszxtbevoVar.jlmebxxoox() && view.getMeasuredHeight() == eablkybsjgVar.lereixgezr() && view.getMeasuredHeight() < gxszxtbevoVar.lereixgezr() && view.getBaseline() == eablkybsjgVar.oxmwwwfdhm() && !eablkybsjgVar.oipsdeybqn() && wkgbmnqykc(eablkybsjgVar.yadqdtsiqt(), iMakeMeasureSpec, eablkybsjgVar.jlmebxxoox()) && wkgbmnqykc(eablkybsjgVar.iozdgvuglv(), iMakeMeasureSpec2, eablkybsjgVar.lereixgezr())) {
                iobyxmoadgVar.f26673eablkybsjg = eablkybsjgVar.jlmebxxoox();
                iobyxmoadgVar.f26674gxszxtbevo = eablkybsjgVar.lereixgezr();
                iobyxmoadgVar.f26676lqeggnwhkg = eablkybsjgVar.oxmwwwfdhm();
                return;
            }
            c1.eablkybsjg.zoijcleaow zoijcleaowVar3 = c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT;
            boolean z17 = zoijcleaowVar == zoijcleaowVar3;
            boolean z18 = zoijcleaowVar2 == zoijcleaowVar3;
            c1.eablkybsjg.zoijcleaow zoijcleaowVar4 = c1.eablkybsjg.zoijcleaow.MATCH_PARENT;
            boolean z19 = zoijcleaowVar2 == zoijcleaowVar4 || zoijcleaowVar2 == c1.eablkybsjg.zoijcleaow.FIXED;
            boolean z23 = zoijcleaowVar == zoijcleaowVar4 || zoijcleaowVar == c1.eablkybsjg.zoijcleaow.FIXED;
            boolean z24 = z17 && eablkybsjgVar.f18317xrmfcynszj > 0.0f;
            boolean z25 = z18 && eablkybsjgVar.f18317xrmfcynszj > 0.0f;
            if (view == null) {
                return;
            }
            zoijcleaow zoijcleaowVar5 = (zoijcleaow) view.getLayoutParams();
            int i25 = iobyxmoadgVar.f26671btonecajqb;
            if (i25 != d1.zoijcleaow.iobyxmoadg.f26668draadjrbmk && i25 != d1.zoijcleaow.iobyxmoadg.f26670wflxmlrfwp && z17 && eablkybsjgVar.f18264iwizpuwonk == 0 && z18 && eablkybsjgVar.f18238cqumvgiudr == 0) {
                i13 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof gtknphoqwx) && (eablkybsjgVar instanceof wflxmlrfwp)) {
                    ((gtknphoqwx) view).kcexrzcfyt((wflxmlrfwp) eablkybsjgVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eablkybsjgVar.f(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i26 = eablkybsjgVar.f18276lereixgezr;
                iMax = i26 > 0 ? Math.max(i26, measuredWidth) : measuredWidth;
                int i27 = eablkybsjgVar.f18293pmvmpeiblj;
                if (i27 > 0) {
                    iMax = Math.min(i27, iMax);
                }
                int i28 = eablkybsjgVar.f18263istkbnxepw;
                iMax2 = i28 > 0 ? Math.max(i28, measuredHeight) : measuredHeight;
                int i29 = eablkybsjgVar.f18236cdpycssgdh;
                if (i29 > 0) {
                    iMax2 = Math.min(i29, iMax2);
                }
                int i33 = iMakeMeasureSpec2;
                if (!c1.gtknphoqwx.zoijcleaow(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (z24 && z19) {
                        iMax = (int) ((iMax2 * eablkybsjgVar.f18317xrmfcynszj) + 0.5f);
                    } else if (z25 && z23) {
                        iMax2 = (int) ((iMax / eablkybsjgVar.f18317xrmfcynszj) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec3 = iMakeMeasureSpec;
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = iMakeMeasureSpec;
                        iMakeMeasureSpec4 = i33;
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    eablkybsjgVar.f(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i13 = -1;
            }
            boolean z26 = baseline != i13;
            iobyxmoadgVar.f26672dxjokdxxww = (iMax == iobyxmoadgVar.f26678ppxfxbqfkf && iMax2 == iobyxmoadgVar.f26679wkgbmnqykc) ? false : true;
            if (zoijcleaowVar5.f8037metgxyhuhe) {
                z26 = true;
            }
            if (z26 && baseline != -1 && eablkybsjgVar.oxmwwwfdhm() != baseline) {
                iobyxmoadgVar.f26672dxjokdxxww = true;
            }
            iobyxmoadgVar.f26673eablkybsjg = iMax;
            iobyxmoadgVar.f26674gxszxtbevo = iMax2;
            iobyxmoadgVar.f26677nufgyqmvbu = z26;
            iobyxmoadgVar.f26676lqeggnwhkg = baseline;
            ConstraintLayout.access$000(ConstraintLayout.this);
        }
    }

    public interface wkgbmnqykc {
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new c1.gxszxtbevo();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new ppxfxbqfkf(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        zoijcleaow(attributeSet, 0, 0);
    }

    static /* synthetic */ z0.eablkybsjg access$000(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private void eablkybsjg(c1.eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, SparseArray sparseArray, int i13, c1.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        View view = this.mChildrenByIds.get(i13);
        c1.eablkybsjg eablkybsjgVar2 = (c1.eablkybsjg) sparseArray.get(i13);
        if (eablkybsjgVar2 == null || view == null || !(view.getLayoutParams() instanceof zoijcleaow)) {
            return;
        }
        zoijcleaowVar.f8037metgxyhuhe = true;
        c1.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = c1.wkgbmnqykc.iobyxmoadg.BASELINE;
        if (iobyxmoadgVar == iobyxmoadgVar2) {
            zoijcleaow zoijcleaowVar2 = (zoijcleaow) view.getLayoutParams();
            zoijcleaowVar2.f8037metgxyhuhe = true;
            zoijcleaowVar2.f8040nuxfzjnpeb.fmlbqenlif(true);
        }
        eablkybsjgVar.vdvldrhtss(iobyxmoadgVar2).zoijcleaow(eablkybsjgVar2.vdvldrhtss(iobyxmoadgVar), zoijcleaowVar.f8005cdpycssgdh, zoijcleaowVar.f8022istkbnxepw, true);
        eablkybsjgVar.fmlbqenlif(true);
        eablkybsjgVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.TOP).vdvldrhtss();
        eablkybsjgVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.BOTTOM).vdvldrhtss();
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static dxjokdxxww getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new dxjokdxxww();
        }
        return sSharedValues;
    }

    private c1.eablkybsjg iobyxmoadg(int i13) {
        if (i13 == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i13);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i13)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((zoijcleaow) viewFindViewById.getLayoutParams()).f8040nuxfzjnpeb;
    }

    private boolean lqeggnwhkg() {
        int childCount = getChildCount();
        boolean z13 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            if (getChildAt(i13).isLayoutRequested()) {
                z13 = true;
                break;
            }
        }
        if (z13) {
            wkgbmnqykc();
        }
        return z13;
    }

    private void ppxfxbqfkf() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void wkgbmnqykc() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            c1.eablkybsjg viewWidget = getViewWidget(getChildAt(i13));
            if (viewWidget != null) {
                viewWidget.nuxfzjnpeb();
            }
        }
        if (zIsInEditMode) {
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    iobyxmoadg(childAt.getId()).fiwbwshyhd(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i15 = 0; i15 < childCount; i15++) {
                getChildAt(i15).getId();
            }
        }
        androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar = this.mConstraintSet;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.gtknphoqwx(this, true);
        }
        this.mLayoutWidget.E();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i16 = 0; i16 < size; i16++) {
                this.mConstraintHelpers.get(i16).rgvfuqvkyq(this);
            }
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            getChildAt(i17);
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            this.mTempMapIdToWidget.put(childAt2.getId(), getViewWidget(childAt2));
        }
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt3 = getChildAt(i19);
            c1.eablkybsjg viewWidget2 = getViewWidget(childAt3);
            if (viewWidget2 != null) {
                zoijcleaow zoijcleaowVar = (zoijcleaow) childAt3.getLayoutParams();
                this.mLayoutWidget.iobyxmoadg(viewWidget2);
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt3, viewWidget2, zoijcleaowVar, this.mTempMapIdToWidget);
            }
        }
    }

    private void zoijcleaow(AttributeSet attributeSet, int i13, int i14) {
        this.mLayoutWidget.hszhottldk(this);
        this.mLayoutWidget.g0(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nufgyqmvbu.ConstraintLayout_Layout, i13, i14);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index == nufgyqmvbu.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == nufgyqmvbu.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar = new androidx.constraintlayout.widget.wkgbmnqykc();
                        this.mConstraintSet = wkgbmnqykcVar;
                        wkgbmnqykcVar.zynmafqrjb(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.h0(this.mOptimizationLevel);
    }

    public void addValueModifier(wkgbmnqykc wkgbmnqykcVar) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(wkgbmnqykcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void applyConstraintsFromLayoutParams(boolean z13, View view, c1.eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, SparseArray<c1.eablkybsjg> sparseArray) {
        c1.eablkybsjg eablkybsjgVar2;
        c1.eablkybsjg eablkybsjgVar3;
        c1.eablkybsjg eablkybsjgVar4;
        c1.eablkybsjg eablkybsjgVar5;
        int i13;
        zoijcleaowVar.zoijcleaow();
        zoijcleaowVar.f8055tbqsvytpvh = false;
        eablkybsjgVar.t(view.getVisibility());
        if (zoijcleaowVar.f8058uwvvkdfqfp) {
            eablkybsjgVar.d(true);
            eablkybsjgVar.t(8);
        }
        eablkybsjgVar.hszhottldk(view);
        if (view instanceof androidx.constraintlayout.widget.zoijcleaow) {
            ((androidx.constraintlayout.widget.zoijcleaow) view).draadjrbmk(eablkybsjgVar, this.mLayoutWidget.a0());
        }
        if (zoijcleaowVar.f8051rlfsiqarku) {
            c1.nufgyqmvbu nufgyqmvbuVar = (c1.nufgyqmvbu) eablkybsjgVar;
            int i14 = zoijcleaowVar.f8061weqkydbzbr;
            int i15 = zoijcleaowVar.f8035lrnfpwlwnk;
            float f13 = zoijcleaowVar.f8073zeieaojujs;
            if (f13 != -1.0f) {
                nufgyqmvbuVar.J(f13);
                return;
            } else if (i14 != -1) {
                nufgyqmvbuVar.H(i14);
                return;
            } else {
                if (i15 != -1) {
                    nufgyqmvbuVar.I(i15);
                    return;
                }
                return;
            }
        }
        int i16 = zoijcleaowVar.f8068ydmasvzmpa;
        int i17 = zoijcleaowVar.f8052sflfametgt;
        int i18 = zoijcleaowVar.f8074zfvoamnweg;
        int i19 = zoijcleaowVar.f8041oipsdeybqn;
        int i23 = zoijcleaowVar.f8003bfopjjpdmp;
        int i24 = zoijcleaowVar.f8044opjhrmiecq;
        float f14 = zoijcleaowVar.f8024iyctptxqzt;
        int i25 = zoijcleaowVar.f8049rgvfuqvkyq;
        if (i25 != -1) {
            c1.eablkybsjg eablkybsjgVar6 = sparseArray.get(i25);
            if (eablkybsjgVar6 != null) {
                eablkybsjgVar.wflxmlrfwp(eablkybsjgVar6, zoijcleaowVar.f8045oxmwwwfdhm, zoijcleaowVar.f8059vdvldrhtss);
            }
        } else {
            if (i16 != -1) {
                c1.eablkybsjg eablkybsjgVar7 = sparseArray.get(i16);
                if (eablkybsjgVar7 != null) {
                    c1.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = c1.wkgbmnqykc.iobyxmoadg.LEFT;
                    eablkybsjgVar.metgxyhuhe(iobyxmoadgVar, eablkybsjgVar7, iobyxmoadgVar, ((ViewGroup.MarginLayoutParams) zoijcleaowVar).leftMargin, i23);
                }
            } else if (i17 != -1 && (eablkybsjgVar2 = sparseArray.get(i17)) != null) {
                eablkybsjgVar.metgxyhuhe(c1.wkgbmnqykc.iobyxmoadg.LEFT, eablkybsjgVar2, c1.wkgbmnqykc.iobyxmoadg.RIGHT, ((ViewGroup.MarginLayoutParams) zoijcleaowVar).leftMargin, i23);
            }
            if (i18 != -1) {
                c1.eablkybsjg eablkybsjgVar8 = sparseArray.get(i18);
                if (eablkybsjgVar8 != null) {
                    eablkybsjgVar.metgxyhuhe(c1.wkgbmnqykc.iobyxmoadg.RIGHT, eablkybsjgVar8, c1.wkgbmnqykc.iobyxmoadg.LEFT, ((ViewGroup.MarginLayoutParams) zoijcleaowVar).rightMargin, i24);
                }
            } else if (i19 != -1 && (eablkybsjgVar3 = sparseArray.get(i19)) != null) {
                c1.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = c1.wkgbmnqykc.iobyxmoadg.RIGHT;
                eablkybsjgVar.metgxyhuhe(iobyxmoadgVar2, eablkybsjgVar3, iobyxmoadgVar2, ((ViewGroup.MarginLayoutParams) zoijcleaowVar).rightMargin, i24);
            }
            int i26 = zoijcleaowVar.f8012dxjokdxxww;
            if (i26 != -1) {
                c1.eablkybsjg eablkybsjgVar9 = sparseArray.get(i26);
                if (eablkybsjgVar9 != null) {
                    c1.wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = c1.wkgbmnqykc.iobyxmoadg.TOP;
                    eablkybsjgVar.metgxyhuhe(iobyxmoadgVar3, eablkybsjgVar9, iobyxmoadgVar3, ((ViewGroup.MarginLayoutParams) zoijcleaowVar).topMargin, zoijcleaowVar.f8007cqumvgiudr);
                }
            } else {
                int i27 = zoijcleaowVar.f8004btonecajqb;
                if (i27 != -1 && (eablkybsjgVar4 = sparseArray.get(i27)) != null) {
                    eablkybsjgVar.metgxyhuhe(c1.wkgbmnqykc.iobyxmoadg.TOP, eablkybsjgVar4, c1.wkgbmnqykc.iobyxmoadg.BOTTOM, ((ViewGroup.MarginLayoutParams) zoijcleaowVar).topMargin, zoijcleaowVar.f8007cqumvgiudr);
                }
            }
            int i28 = zoijcleaowVar.f8015gtknphoqwx;
            if (i28 != -1) {
                c1.eablkybsjg eablkybsjgVar10 = sparseArray.get(i28);
                if (eablkybsjgVar10 != null) {
                    eablkybsjgVar.metgxyhuhe(c1.wkgbmnqykc.iobyxmoadg.BOTTOM, eablkybsjgVar10, c1.wkgbmnqykc.iobyxmoadg.TOP, ((ViewGroup.MarginLayoutParams) zoijcleaowVar).bottomMargin, zoijcleaowVar.f8032lereixgezr);
                }
            } else {
                int i29 = zoijcleaowVar.f8010draadjrbmk;
                if (i29 != -1 && (eablkybsjgVar5 = sparseArray.get(i29)) != null) {
                    c1.wkgbmnqykc.iobyxmoadg iobyxmoadgVar4 = c1.wkgbmnqykc.iobyxmoadg.BOTTOM;
                    eablkybsjgVar.metgxyhuhe(iobyxmoadgVar4, eablkybsjgVar5, iobyxmoadgVar4, ((ViewGroup.MarginLayoutParams) zoijcleaowVar).bottomMargin, zoijcleaowVar.f8032lereixgezr);
                }
            }
            int i33 = zoijcleaowVar.f8062wflxmlrfwp;
            if (i33 != -1) {
                eablkybsjg(eablkybsjgVar, zoijcleaowVar, sparseArray, i33, c1.wkgbmnqykc.iobyxmoadg.BASELINE);
            } else {
                int i34 = zoijcleaowVar.f8002agtfadlqog;
                if (i34 != -1) {
                    eablkybsjg(eablkybsjgVar, zoijcleaowVar, sparseArray, i34, c1.wkgbmnqykc.iobyxmoadg.TOP);
                } else {
                    int i35 = zoijcleaowVar.f8042ojitshcjhn;
                    if (i35 != -1) {
                        eablkybsjg(eablkybsjgVar, zoijcleaowVar, sparseArray, i35, c1.wkgbmnqykc.iobyxmoadg.BOTTOM);
                    }
                }
            }
            if (f14 >= 0.0f) {
                eablkybsjgVar.rhgxfdycjh(f14);
            }
            float f15 = zoijcleaowVar.f8064wwaezpbzkn;
            if (f15 >= 0.0f) {
                eablkybsjgVar.n(f15);
            }
        }
        if (z13 && ((i13 = zoijcleaowVar.f8008crxdokpmqz) != -1 || zoijcleaowVar.f8026jlmebxxoox != -1)) {
            eablkybsjgVar.l(i13, zoijcleaowVar.f8026jlmebxxoox);
        }
        if (zoijcleaowVar.f8029jztzpxfvev) {
            eablkybsjgVar.krqnebusok(c1.eablkybsjg.zoijcleaow.FIXED);
            eablkybsjgVar.u(((ViewGroup.MarginLayoutParams) zoijcleaowVar).width);
            if (((ViewGroup.MarginLayoutParams) zoijcleaowVar).width == -2) {
                eablkybsjgVar.krqnebusok(c1.eablkybsjg.zoijcleaow.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) zoijcleaowVar).width == -1) {
            if (zoijcleaowVar.f8060vipkmwdibw) {
                eablkybsjgVar.krqnebusok(c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT);
            } else {
                eablkybsjgVar.krqnebusok(c1.eablkybsjg.zoijcleaow.MATCH_PARENT);
            }
            eablkybsjgVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.LEFT).f18442lqeggnwhkg = ((ViewGroup.MarginLayoutParams) zoijcleaowVar).leftMargin;
            eablkybsjgVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.RIGHT).f18442lqeggnwhkg = ((ViewGroup.MarginLayoutParams) zoijcleaowVar).rightMargin;
        } else {
            eablkybsjgVar.krqnebusok(c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT);
            eablkybsjgVar.u(0);
        }
        if (zoijcleaowVar.f8066xrmfcynszj) {
            eablkybsjgVar.q(c1.eablkybsjg.zoijcleaow.FIXED);
            eablkybsjgVar.ezmngbhpjk(((ViewGroup.MarginLayoutParams) zoijcleaowVar).height);
            if (((ViewGroup.MarginLayoutParams) zoijcleaowVar).height == -2) {
                eablkybsjgVar.q(c1.eablkybsjg.zoijcleaow.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) zoijcleaowVar).height == -1) {
            if (zoijcleaowVar.f8025jhduphickx) {
                eablkybsjgVar.q(c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT);
            } else {
                eablkybsjgVar.q(c1.eablkybsjg.zoijcleaow.MATCH_PARENT);
            }
            eablkybsjgVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.TOP).f18442lqeggnwhkg = ((ViewGroup.MarginLayoutParams) zoijcleaowVar).topMargin;
            eablkybsjgVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.BOTTOM).f18442lqeggnwhkg = ((ViewGroup.MarginLayoutParams) zoijcleaowVar).bottomMargin;
        } else {
            eablkybsjgVar.q(c1.eablkybsjg.zoijcleaow.MATCH_CONSTRAINT);
            eablkybsjgVar.ezmngbhpjk(0);
        }
        eablkybsjgVar.ageimvtcrz(zoijcleaowVar.f8071ylkuphrtab);
        eablkybsjgVar.b(zoijcleaowVar.f8027jpowsppfya);
        eablkybsjgVar.s(zoijcleaowVar.f8018hkdspvbjdz);
        eablkybsjgVar.yzdjzghtvl(zoijcleaowVar.f8006cllcsxoeiz);
        eablkybsjgVar.o(zoijcleaowVar.f8011dsvhmnatus);
        eablkybsjgVar.v(zoijcleaowVar.f8043okpsazkaxt);
        eablkybsjgVar.a(zoijcleaowVar.f8065wypolnanlu, zoijcleaowVar.f8031kegysxyocb, zoijcleaowVar.f8036mbcevpiqjq, zoijcleaowVar.f8057ulzqkzuiru);
        eablkybsjgVar.r(zoijcleaowVar.f8054stevsuqkhv, zoijcleaowVar.f8056tzroggbefp, zoijcleaowVar.f8038ntlheqmsrt, zoijcleaowVar.f8053sopmlzcsov);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof zoijcleaow;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.zoijcleaow> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.mConstraintHelpers.get(i13).ojitshcjhn(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(StringUtils.COMMA);
                    if (strArrSplit.length == 4) {
                        int i15 = Integer.parseInt(strArrSplit[0]);
                        int i16 = Integer.parseInt(strArrSplit[1]);
                        int i17 = Integer.parseInt(strArrSplit[2]);
                        int i18 = (int) ((i15 / 1080.0f) * width);
                        int i19 = (int) ((i16 / 1920.0f) * height);
                        int i23 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f13 = i18;
                        float f14 = i19;
                        float f15 = i18 + ((int) ((i17 / 1080.0f) * width));
                        canvas.drawLine(f13, f14, f15, f14, paint);
                        float f16 = i19 + i23;
                        canvas.drawLine(f15, f14, f15, f16, paint);
                        canvas.drawLine(f15, f16, f13, f16, paint);
                        canvas.drawLine(f13, f16, f13, f14, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f13, f14, f15, f16, paint);
                        canvas.drawLine(f13, f16, f15, f14, paint);
                    }
                }
            }
        }
    }

    protected boolean dynamicUpdateConstraints(int i13, int i14) {
        if (this.mModifiers == null) {
            return false;
        }
        View.MeasureSpec.getSize(i13);
        View.MeasureSpec.getSize(i14);
        Iterator<wkgbmnqykc> it = this.mModifiers.iterator();
        while (it.hasNext()) {
            yggfygwlhe.iobyxmoadg(it.next());
            Iterator it2 = this.mLayoutWidget.B().iterator();
            if (it2.hasNext()) {
                View view = (View) ((c1.eablkybsjg) it2.next()).yggfygwlhe();
                view.getId();
                throw null;
            }
        }
        return false;
    }

    public void fillMetrics(z0.eablkybsjg eablkybsjgVar) {
        this.mLayoutWidget.S(eablkybsjgVar);
    }

    @Override // android.view.View
    public void forceLayout() {
        ppxfxbqfkf();
        super.forceLayout();
    }

    public Object getDesignInformation(int i13, Object obj) {
        if (i13 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.U();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb3 = new StringBuilder();
        if (this.mLayoutWidget.f18288ojitshcjhn == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.f18288ojitshcjhn = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.f18288ojitshcjhn = "parent";
            }
        }
        if (this.mLayoutWidget.jyumaefscl() == null) {
            c1.gxszxtbevo gxszxtbevoVar = this.mLayoutWidget;
            gxszxtbevoVar.fiwbwshyhd(gxszxtbevoVar.f18288ojitshcjhn);
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.jyumaefscl());
        }
        for (c1.eablkybsjg eablkybsjgVar : this.mLayoutWidget.B()) {
            View view = (View) eablkybsjgVar.yggfygwlhe();
            if (view != null) {
                if (eablkybsjgVar.f18288ojitshcjhn == null && (id2 = view.getId()) != -1) {
                    eablkybsjgVar.f18288ojitshcjhn = getContext().getResources().getResourceEntryName(id2);
                }
                if (eablkybsjgVar.jyumaefscl() == null) {
                    eablkybsjgVar.fiwbwshyhd(eablkybsjgVar.f18288ojitshcjhn);
                    Log.v(TAG, " setDebugName " + eablkybsjgVar.jyumaefscl());
                }
            }
        }
        this.mLayoutWidget.stevsuqkhv(sb3);
        return sb3.toString();
    }

    public View getViewById(int i13) {
        return this.mChildrenByIds.get(i13);
    }

    public final c1.eablkybsjg getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof zoijcleaow) {
            return ((zoijcleaow) view.getLayoutParams()).f8040nuxfzjnpeb;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof zoijcleaow) {
            return ((zoijcleaow) view.getLayoutParams()).f8040nuxfzjnpeb;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i13) {
        if (i13 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.ppxfxbqfkf(getContext(), this, i13);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            zoijcleaow zoijcleaowVar = (zoijcleaow) childAt.getLayoutParams();
            c1.eablkybsjg eablkybsjgVar = zoijcleaowVar.f8040nuxfzjnpeb;
            if ((childAt.getVisibility() != 8 || zoijcleaowVar.f8051rlfsiqarku || zoijcleaowVar.f8009czzsidtyhn || zoijcleaowVar.f8069yfnezrywwk || zIsInEditMode) && !zoijcleaowVar.f8058uwvvkdfqfp) {
                int iRibwqtqdhb = eablkybsjgVar.ribwqtqdhb();
                int iVipkmwdibw = eablkybsjgVar.vipkmwdibw();
                childAt.layout(iRibwqtqdhb, iVipkmwdibw, eablkybsjgVar.jlmebxxoox() + iRibwqtqdhb, eablkybsjgVar.lereixgezr() + iVipkmwdibw);
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i18 = 0; i18 < size; i18++) {
                this.mConstraintHelpers.get(i18).wflxmlrfwp(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        boolean zDynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i13, i14);
        this.mDirtyHierarchy = zDynamicUpdateConstraints;
        if (!zDynamicUpdateConstraints) {
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                if (getChildAt(i15).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = i13;
        this.mOnMeasureHeightMeasureSpec = i14;
        this.mLayoutWidget.j0(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (lqeggnwhkg()) {
                this.mLayoutWidget.l0();
            }
        }
        this.mLayoutWidget.S(null);
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i13, i14);
        resolveMeasuredDimension(i13, i14, this.mLayoutWidget.jlmebxxoox(), this.mLayoutWidget.lereixgezr(), this.mLayoutWidget.b0(), this.mLayoutWidget.Z());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        c1.eablkybsjg viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof c1.nufgyqmvbu)) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) view.getLayoutParams();
            c1.nufgyqmvbu nufgyqmvbuVar = new c1.nufgyqmvbu();
            zoijcleaowVar.f8040nuxfzjnpeb = nufgyqmvbuVar;
            zoijcleaowVar.f8051rlfsiqarku = true;
            nufgyqmvbuVar.K(zoijcleaowVar.f8050ribwqtqdhb);
        }
        if (view instanceof androidx.constraintlayout.widget.zoijcleaow) {
            androidx.constraintlayout.widget.zoijcleaow zoijcleaowVar2 = (androidx.constraintlayout.widget.zoijcleaow) view;
            zoijcleaowVar2.oxmwwwfdhm();
            ((zoijcleaow) view.getLayoutParams()).f8009czzsidtyhn = true;
            if (!this.mConstraintHelpers.contains(zoijcleaowVar2)) {
                this.mConstraintHelpers.add(zoijcleaowVar2);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.D(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    protected void parseLayoutDescription(int i13) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.ppxfxbqfkf(getContext(), this, i13);
    }

    void removeValueModifier(wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar == null) {
            return;
        }
        this.mModifiers.remove(wkgbmnqykcVar);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        ppxfxbqfkf();
        super.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resolveMeasuredDimension(int i13, int i14, int i15, int i16, boolean z13, boolean z14) {
        ppxfxbqfkf ppxfxbqfkfVar = this.mMeasurer;
        int i17 = ppxfxbqfkfVar.f7994eablkybsjg;
        int iResolveSizeAndState = View.resolveSizeAndState(i15 + ppxfxbqfkfVar.f8000wkgbmnqykc, i13, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i16 + i17, i14, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z13) {
            iMin |= 16777216;
        }
        if (z14) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resolveSystem(c1.gxszxtbevo gxszxtbevoVar, int i13, int i14, int i15) {
        int iMax;
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int mode2 = View.MeasureSpec.getMode(i15);
        int size2 = View.MeasureSpec.getSize(i15);
        int iMax2 = Math.max(0, getPaddingTop());
        int iMax3 = Math.max(0, getPaddingBottom());
        int i16 = iMax2 + iMax3;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.ppxfxbqfkf(i14, i15, iMax2, iMax3, paddingWidth, i16);
        int iMax4 = Math.max(0, getPaddingStart());
        int iMax5 = Math.max(0, getPaddingEnd());
        if (iMax4 > 0 || iMax5 > 0) {
            iMax = isRtl() ? iMax5 : iMax4;
        } else {
            iMax = Math.max(0, getPaddingLeft());
        }
        int i17 = size - paddingWidth;
        int i18 = size2 - i16;
        setSelfDimensionBehaviour(gxszxtbevoVar, mode, i17, mode2, i18);
        gxszxtbevoVar.c0(i13, mode, i17, mode2, i18, this.mLastMeasureWidth, this.mLastMeasureHeight, iMax, iMax2);
    }

    public void setConstraintSet(androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar) {
        this.mConstraintSet = wkgbmnqykcVar;
    }

    public void setDesignInformation(int i13, Object obj, Object obj2) {
        if (i13 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf(CardDateFormatTextWatcher.DIVIDER_CHARACTER);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(strSubstring, num);
        }
    }

    @Override // android.view.View
    public void setId(int i13) {
        this.mChildrenByIds.remove(getId());
        super.setId(i13);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i13) {
        if (i13 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i13;
        requestLayout();
    }

    public void setMaxWidth(int i13) {
        if (i13 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i13;
        requestLayout();
    }

    public void setMinHeight(int i13) {
        if (i13 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i13;
        requestLayout();
    }

    public void setMinWidth(int i13) {
        if (i13 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i13;
        requestLayout();
    }

    public void setOnConstraintsChanged(gxszxtbevo gxszxtbevoVar) {
        androidx.constraintlayout.widget.ppxfxbqfkf ppxfxbqfkfVar = this.mConstraintLayoutSpec;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.ppxfxbqfkf(gxszxtbevoVar);
        }
    }

    public void setOptimizationLevel(int i13) {
        this.mOptimizationLevel = i13;
        this.mLayoutWidget.h0(i13);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 c1.eablkybsjg$zoijcleaow) = (r2v3 c1.eablkybsjg$zoijcleaow), (r2v0 c1.eablkybsjg$zoijcleaow) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    protected void setSelfDimensionBehaviour(c1.gxszxtbevo gxszxtbevoVar, int i13, int i14, int i15, int i16) {
        c1.eablkybsjg.zoijcleaow zoijcleaowVar;
        ppxfxbqfkf ppxfxbqfkfVar = this.mMeasurer;
        int i17 = ppxfxbqfkfVar.f7994eablkybsjg;
        int i18 = ppxfxbqfkfVar.f8000wkgbmnqykc;
        c1.eablkybsjg.zoijcleaow zoijcleaowVar2 = c1.eablkybsjg.zoijcleaow.FIXED;
        int childCount = getChildCount();
        if (i13 == Integer.MIN_VALUE) {
            zoijcleaowVar = c1.eablkybsjg.zoijcleaow.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.mMinWidth);
            }
        } else if (i13 == 0) {
            zoijcleaowVar = c1.eablkybsjg.zoijcleaow.WRAP_CONTENT;
            i14 = childCount == 0 ? Math.max(0, this.mMinWidth) : 0;
        } else if (i13 != 1073741824) {
            zoijcleaowVar = zoijcleaowVar2;
        } else {
            i14 = Math.min(this.mMaxWidth - i18, i14);
            zoijcleaowVar = zoijcleaowVar2;
        }
        if (i15 == Integer.MIN_VALUE) {
            zoijcleaowVar2 = c1.eablkybsjg.zoijcleaow.WRAP_CONTENT;
            if (childCount == 0) {
                i16 = Math.max(0, this.mMinHeight);
            }
        } else if (i15 == 0) {
            zoijcleaowVar2 = c1.eablkybsjg.zoijcleaow.WRAP_CONTENT;
            if (childCount == 0) {
                i16 = Math.max(0, this.mMinHeight);
            } else {
                i16 = 0;
            }
        } else if (i15 != 1073741824) {
            i16 = 0;
        } else {
            i16 = Math.min(this.mMaxHeight - i17, i16);
        }
        if (i14 != gxszxtbevoVar.jlmebxxoox() || i16 != gxszxtbevoVar.lereixgezr()) {
            gxszxtbevoVar.Y();
        }
        gxszxtbevoVar.w(0);
        gxszxtbevoVar.x(0);
        gxszxtbevoVar.h(this.mMaxWidth - i18);
        gxszxtbevoVar.g(this.mMaxHeight - i17);
        gxszxtbevoVar.k(0);
        gxszxtbevoVar.j(0);
        gxszxtbevoVar.krqnebusok(zoijcleaowVar);
        gxszxtbevoVar.u(i14);
        gxszxtbevoVar.q(zoijcleaowVar2);
        gxszxtbevoVar.ezmngbhpjk(i16);
        gxszxtbevoVar.k(this.mMinWidth - i18);
        gxszxtbevoVar.j(this.mMinHeight - i17);
    }

    public void setState(int i13, int i14, int i15) {
        androidx.constraintlayout.widget.ppxfxbqfkf ppxfxbqfkfVar = this.mConstraintLayoutSpec;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.wkgbmnqykc(i13, i14, i15);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public zoijcleaow generateDefaultLayoutParams() {
        return new zoijcleaow(-2, -2);
    }

    @Override // android.view.ViewGroup
    public zoijcleaow generateLayoutParams(AttributeSet attributeSet) {
        return new zoijcleaow(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new zoijcleaow(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new c1.gxszxtbevo();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new ppxfxbqfkf(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        zoijcleaow(attributeSet, i13, 0);
    }

    public static class zoijcleaow extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        public int f8002agtfadlqog;

        /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
        int f8003bfopjjpdmp;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public int f8004btonecajqb;

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        public int f8005cdpycssgdh;

        /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
        public int f8006cllcsxoeiz;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        public int f8007cqumvgiudr;

        /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
        public int f8008crxdokpmqz;

        /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
        boolean f8009czzsidtyhn;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        public int f8010draadjrbmk;

        /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
        public int f8011dsvhmnatus;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public int f8012dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public int f8013eablkybsjg;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        public int f8014esjtqupxsv;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        public int f8015gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public int f8016gxszxtbevo;

        /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
        int f8017hcddaimhww;

        /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
        public float f8018hkdspvbjdz;

        /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
        public String f8019ikoacuggdj;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public int f8020iobyxmoadg;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        boolean f8021iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        public int f8022istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public int f8023iwizpuwonk;

        /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
        float f8024iyctptxqzt;

        /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
        public boolean f8025jhduphickx;

        /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
        public int f8026jlmebxxoox;

        /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
        public float f8027jpowsppfya;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public int f8028jyumaefscl;

        /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
        boolean f8029jztzpxfvev;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        public int f8030kcexrzcfyt;

        /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
        public int f8031kegysxyocb;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        public int f8032lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        public float f8033lmojexxdyd;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public int f8034lqeggnwhkg;

        /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
        int f8035lrnfpwlwnk;

        /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
        public int f8036mbcevpiqjq;

        /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
        boolean f8037metgxyhuhe;

        /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
        public int f8038ntlheqmsrt;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public int f8039nufgyqmvbu;

        /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name */
        c1.eablkybsjg f8040nuxfzjnpeb;

        /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
        int f8041oipsdeybqn;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        public int f8042ojitshcjhn;

        /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
        public int f8043okpsazkaxt;

        /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
        int f8044opjhrmiecq;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        public float f8045oxmwwwfdhm;

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        float f8046pkzmftpjix;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        public int f8047pmvmpeiblj;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public float f8048ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        public int f8049rgvfuqvkyq;

        /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
        public int f8050ribwqtqdhb;

        /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
        boolean f8051rlfsiqarku;

        /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
        int f8052sflfametgt;

        /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
        public float f8053sopmlzcsov;

        /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
        public int f8054stevsuqkhv;

        /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name */
        public boolean f8055tbqsvytpvh;

        /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
        public int f8056tzroggbefp;

        /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
        public float f8057ulzqkzuiru;

        /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
        boolean f8058uwvvkdfqfp;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        public int f8059vdvldrhtss;

        /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
        public boolean f8060vipkmwdibw;

        /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
        int f8061weqkydbzbr;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        public int f8062wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public boolean f8063wkgbmnqykc;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        public float f8064wwaezpbzkn;

        /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
        public int f8065wypolnanlu;

        /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
        boolean f8066xrmfcynszj;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        boolean f8067yadqdtsiqt;

        /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
        int f8068ydmasvzmpa;

        /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
        boolean f8069yfnezrywwk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public int f8070yggfygwlhe;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        public String f8071ylkuphrtab;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public int f8072zdlpuopuiu;

        /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
        float f8073zeieaojujs;

        /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
        int f8074zfvoamnweg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f8075zoijcleaow;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        public int f8076zynmafqrjb;

        private static class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final SparseIntArray f8077iobyxmoadg;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f8077iobyxmoadg = sparseIntArray;
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(nufgyqmvbu.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public zoijcleaow(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8020iobyxmoadg = -1;
            this.f8075zoijcleaow = -1;
            this.f8048ppxfxbqfkf = -1.0f;
            this.f8063wkgbmnqykc = true;
            this.f8013eablkybsjg = -1;
            this.f8016gxszxtbevo = -1;
            this.f8034lqeggnwhkg = -1;
            this.f8039nufgyqmvbu = -1;
            this.f8012dxjokdxxww = -1;
            this.f8004btonecajqb = -1;
            this.f8015gtknphoqwx = -1;
            this.f8010draadjrbmk = -1;
            this.f8062wflxmlrfwp = -1;
            this.f8002agtfadlqog = -1;
            this.f8042ojitshcjhn = -1;
            this.f8049rgvfuqvkyq = -1;
            this.f8059vdvldrhtss = 0;
            this.f8045oxmwwwfdhm = 0.0f;
            this.f8030kcexrzcfyt = -1;
            this.f8072zdlpuopuiu = -1;
            this.f8070yggfygwlhe = -1;
            this.f8028jyumaefscl = -1;
            this.f8023iwizpuwonk = Integer.MIN_VALUE;
            this.f8007cqumvgiudr = Integer.MIN_VALUE;
            this.f8014esjtqupxsv = Integer.MIN_VALUE;
            this.f8032lereixgezr = Integer.MIN_VALUE;
            this.f8047pmvmpeiblj = Integer.MIN_VALUE;
            this.f8076zynmafqrjb = Integer.MIN_VALUE;
            this.f8022istkbnxepw = Integer.MIN_VALUE;
            this.f8005cdpycssgdh = 0;
            this.f8067yadqdtsiqt = true;
            this.f8021iozdgvuglv = true;
            this.f8033lmojexxdyd = 0.5f;
            this.f8064wwaezpbzkn = 0.5f;
            this.f8071ylkuphrtab = null;
            this.f8046pkzmftpjix = 0.0f;
            this.f8017hcddaimhww = 1;
            this.f8027jpowsppfya = -1.0f;
            this.f8018hkdspvbjdz = -1.0f;
            this.f8006cllcsxoeiz = 0;
            this.f8011dsvhmnatus = 0;
            this.f8065wypolnanlu = 0;
            this.f8054stevsuqkhv = 0;
            this.f8031kegysxyocb = 0;
            this.f8056tzroggbefp = 0;
            this.f8036mbcevpiqjq = 0;
            this.f8038ntlheqmsrt = 0;
            this.f8057ulzqkzuiru = 1.0f;
            this.f8053sopmlzcsov = 1.0f;
            this.f8008crxdokpmqz = -1;
            this.f8026jlmebxxoox = -1;
            this.f8050ribwqtqdhb = -1;
            this.f8060vipkmwdibw = false;
            this.f8025jhduphickx = false;
            this.f8019ikoacuggdj = null;
            this.f8043okpsazkaxt = 0;
            this.f8029jztzpxfvev = true;
            this.f8066xrmfcynszj = true;
            this.f8037metgxyhuhe = false;
            this.f8051rlfsiqarku = false;
            this.f8009czzsidtyhn = false;
            this.f8058uwvvkdfqfp = false;
            this.f8069yfnezrywwk = false;
            this.f8068ydmasvzmpa = -1;
            this.f8052sflfametgt = -1;
            this.f8074zfvoamnweg = -1;
            this.f8041oipsdeybqn = -1;
            this.f8003bfopjjpdmp = Integer.MIN_VALUE;
            this.f8044opjhrmiecq = Integer.MIN_VALUE;
            this.f8024iyctptxqzt = 0.5f;
            this.f8040nuxfzjnpeb = new c1.eablkybsjg();
            this.f8055tbqsvytpvh = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof zoijcleaow) {
                zoijcleaow zoijcleaowVar = (zoijcleaow) layoutParams;
                this.f8020iobyxmoadg = zoijcleaowVar.f8020iobyxmoadg;
                this.f8075zoijcleaow = zoijcleaowVar.f8075zoijcleaow;
                this.f8048ppxfxbqfkf = zoijcleaowVar.f8048ppxfxbqfkf;
                this.f8063wkgbmnqykc = zoijcleaowVar.f8063wkgbmnqykc;
                this.f8013eablkybsjg = zoijcleaowVar.f8013eablkybsjg;
                this.f8016gxszxtbevo = zoijcleaowVar.f8016gxszxtbevo;
                this.f8034lqeggnwhkg = zoijcleaowVar.f8034lqeggnwhkg;
                this.f8039nufgyqmvbu = zoijcleaowVar.f8039nufgyqmvbu;
                this.f8012dxjokdxxww = zoijcleaowVar.f8012dxjokdxxww;
                this.f8004btonecajqb = zoijcleaowVar.f8004btonecajqb;
                this.f8015gtknphoqwx = zoijcleaowVar.f8015gtknphoqwx;
                this.f8010draadjrbmk = zoijcleaowVar.f8010draadjrbmk;
                this.f8062wflxmlrfwp = zoijcleaowVar.f8062wflxmlrfwp;
                this.f8002agtfadlqog = zoijcleaowVar.f8002agtfadlqog;
                this.f8042ojitshcjhn = zoijcleaowVar.f8042ojitshcjhn;
                this.f8049rgvfuqvkyq = zoijcleaowVar.f8049rgvfuqvkyq;
                this.f8059vdvldrhtss = zoijcleaowVar.f8059vdvldrhtss;
                this.f8045oxmwwwfdhm = zoijcleaowVar.f8045oxmwwwfdhm;
                this.f8030kcexrzcfyt = zoijcleaowVar.f8030kcexrzcfyt;
                this.f8072zdlpuopuiu = zoijcleaowVar.f8072zdlpuopuiu;
                this.f8070yggfygwlhe = zoijcleaowVar.f8070yggfygwlhe;
                this.f8028jyumaefscl = zoijcleaowVar.f8028jyumaefscl;
                this.f8023iwizpuwonk = zoijcleaowVar.f8023iwizpuwonk;
                this.f8007cqumvgiudr = zoijcleaowVar.f8007cqumvgiudr;
                this.f8014esjtqupxsv = zoijcleaowVar.f8014esjtqupxsv;
                this.f8032lereixgezr = zoijcleaowVar.f8032lereixgezr;
                this.f8047pmvmpeiblj = zoijcleaowVar.f8047pmvmpeiblj;
                this.f8076zynmafqrjb = zoijcleaowVar.f8076zynmafqrjb;
                this.f8022istkbnxepw = zoijcleaowVar.f8022istkbnxepw;
                this.f8005cdpycssgdh = zoijcleaowVar.f8005cdpycssgdh;
                this.f8033lmojexxdyd = zoijcleaowVar.f8033lmojexxdyd;
                this.f8064wwaezpbzkn = zoijcleaowVar.f8064wwaezpbzkn;
                this.f8071ylkuphrtab = zoijcleaowVar.f8071ylkuphrtab;
                this.f8046pkzmftpjix = zoijcleaowVar.f8046pkzmftpjix;
                this.f8017hcddaimhww = zoijcleaowVar.f8017hcddaimhww;
                this.f8027jpowsppfya = zoijcleaowVar.f8027jpowsppfya;
                this.f8018hkdspvbjdz = zoijcleaowVar.f8018hkdspvbjdz;
                this.f8006cllcsxoeiz = zoijcleaowVar.f8006cllcsxoeiz;
                this.f8011dsvhmnatus = zoijcleaowVar.f8011dsvhmnatus;
                this.f8060vipkmwdibw = zoijcleaowVar.f8060vipkmwdibw;
                this.f8025jhduphickx = zoijcleaowVar.f8025jhduphickx;
                this.f8065wypolnanlu = zoijcleaowVar.f8065wypolnanlu;
                this.f8054stevsuqkhv = zoijcleaowVar.f8054stevsuqkhv;
                this.f8031kegysxyocb = zoijcleaowVar.f8031kegysxyocb;
                this.f8036mbcevpiqjq = zoijcleaowVar.f8036mbcevpiqjq;
                this.f8056tzroggbefp = zoijcleaowVar.f8056tzroggbefp;
                this.f8038ntlheqmsrt = zoijcleaowVar.f8038ntlheqmsrt;
                this.f8057ulzqkzuiru = zoijcleaowVar.f8057ulzqkzuiru;
                this.f8053sopmlzcsov = zoijcleaowVar.f8053sopmlzcsov;
                this.f8008crxdokpmqz = zoijcleaowVar.f8008crxdokpmqz;
                this.f8026jlmebxxoox = zoijcleaowVar.f8026jlmebxxoox;
                this.f8050ribwqtqdhb = zoijcleaowVar.f8050ribwqtqdhb;
                this.f8029jztzpxfvev = zoijcleaowVar.f8029jztzpxfvev;
                this.f8066xrmfcynszj = zoijcleaowVar.f8066xrmfcynszj;
                this.f8037metgxyhuhe = zoijcleaowVar.f8037metgxyhuhe;
                this.f8051rlfsiqarku = zoijcleaowVar.f8051rlfsiqarku;
                this.f8068ydmasvzmpa = zoijcleaowVar.f8068ydmasvzmpa;
                this.f8052sflfametgt = zoijcleaowVar.f8052sflfametgt;
                this.f8074zfvoamnweg = zoijcleaowVar.f8074zfvoamnweg;
                this.f8041oipsdeybqn = zoijcleaowVar.f8041oipsdeybqn;
                this.f8003bfopjjpdmp = zoijcleaowVar.f8003bfopjjpdmp;
                this.f8044opjhrmiecq = zoijcleaowVar.f8044opjhrmiecq;
                this.f8024iyctptxqzt = zoijcleaowVar.f8024iyctptxqzt;
                this.f8019ikoacuggdj = zoijcleaowVar.f8019ikoacuggdj;
                this.f8043okpsazkaxt = zoijcleaowVar.f8043okpsazkaxt;
                this.f8040nuxfzjnpeb = zoijcleaowVar.f8040nuxfzjnpeb;
                this.f8067yadqdtsiqt = zoijcleaowVar.f8067yadqdtsiqt;
                this.f8021iozdgvuglv = zoijcleaowVar.f8021iozdgvuglv;
            }
        }

        public String iobyxmoadg() {
            return this.f8019ikoacuggdj;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i13) {
            int i14;
            int i15;
            int i16;
            int i17;
            int i18 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i19 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i13);
            boolean z13 = false;
            boolean z14 = 1 == getLayoutDirection();
            this.f8074zfvoamnweg = -1;
            this.f8041oipsdeybqn = -1;
            this.f8068ydmasvzmpa = -1;
            this.f8052sflfametgt = -1;
            this.f8003bfopjjpdmp = this.f8023iwizpuwonk;
            this.f8044opjhrmiecq = this.f8014esjtqupxsv;
            float f13 = this.f8033lmojexxdyd;
            this.f8024iyctptxqzt = f13;
            int i23 = this.f8020iobyxmoadg;
            this.f8061weqkydbzbr = i23;
            int i24 = this.f8075zoijcleaow;
            this.f8035lrnfpwlwnk = i24;
            float f14 = this.f8048ppxfxbqfkf;
            this.f8073zeieaojujs = f14;
            if (z14) {
                int i25 = this.f8030kcexrzcfyt;
                if (i25 != -1) {
                    this.f8074zfvoamnweg = i25;
                } else {
                    int i26 = this.f8072zdlpuopuiu;
                    if (i26 != -1) {
                        this.f8041oipsdeybqn = i26;
                    } else {
                        i14 = this.f8070yggfygwlhe;
                        if (i14 != -1) {
                            this.f8052sflfametgt = i14;
                            z13 = true;
                        }
                        i15 = this.f8028jyumaefscl;
                        if (i15 != -1) {
                            this.f8068ydmasvzmpa = i15;
                            z13 = true;
                        }
                        i16 = this.f8047pmvmpeiblj;
                        if (i16 != Integer.MIN_VALUE) {
                            this.f8044opjhrmiecq = i16;
                        }
                        i17 = this.f8076zynmafqrjb;
                        if (i17 != Integer.MIN_VALUE) {
                            this.f8003bfopjjpdmp = i17;
                        }
                        if (z13) {
                            this.f8024iyctptxqzt = 1.0f - f13;
                        }
                        if (this.f8051rlfsiqarku && this.f8050ribwqtqdhb == 1 && this.f8063wkgbmnqykc) {
                            if (f14 != -1.0f) {
                                this.f8073zeieaojujs = 1.0f - f14;
                                this.f8061weqkydbzbr = -1;
                                this.f8035lrnfpwlwnk = -1;
                            } else if (i23 != -1) {
                                this.f8035lrnfpwlwnk = i23;
                                this.f8061weqkydbzbr = -1;
                                this.f8073zeieaojujs = -1.0f;
                            } else if (i24 != -1) {
                                this.f8061weqkydbzbr = i24;
                                this.f8035lrnfpwlwnk = -1;
                                this.f8073zeieaojujs = -1.0f;
                            }
                        }
                    }
                }
                z13 = true;
                i14 = this.f8070yggfygwlhe;
                if (i14 != -1) {
                    this.f8052sflfametgt = i14;
                    z13 = true;
                }
                i15 = this.f8028jyumaefscl;
                if (i15 != -1) {
                    this.f8068ydmasvzmpa = i15;
                    z13 = true;
                }
                i16 = this.f8047pmvmpeiblj;
                if (i16 != Integer.MIN_VALUE) {
                    this.f8044opjhrmiecq = i16;
                }
                i17 = this.f8076zynmafqrjb;
                if (i17 != Integer.MIN_VALUE) {
                    this.f8003bfopjjpdmp = i17;
                }
                if (z13) {
                    this.f8024iyctptxqzt = 1.0f - f13;
                }
                if (this.f8051rlfsiqarku) {
                    if (f14 != -1.0f) {
                        this.f8073zeieaojujs = 1.0f - f14;
                        this.f8061weqkydbzbr = -1;
                        this.f8035lrnfpwlwnk = -1;
                    } else if (i23 != -1) {
                        this.f8035lrnfpwlwnk = i23;
                        this.f8061weqkydbzbr = -1;
                        this.f8073zeieaojujs = -1.0f;
                    } else if (i24 != -1) {
                        this.f8061weqkydbzbr = i24;
                        this.f8035lrnfpwlwnk = -1;
                        this.f8073zeieaojujs = -1.0f;
                    }
                }
            } else {
                int i27 = this.f8030kcexrzcfyt;
                if (i27 != -1) {
                    this.f8052sflfametgt = i27;
                }
                int i28 = this.f8072zdlpuopuiu;
                if (i28 != -1) {
                    this.f8068ydmasvzmpa = i28;
                }
                int i29 = this.f8070yggfygwlhe;
                if (i29 != -1) {
                    this.f8074zfvoamnweg = i29;
                }
                int i33 = this.f8028jyumaefscl;
                if (i33 != -1) {
                    this.f8041oipsdeybqn = i33;
                }
                int i34 = this.f8047pmvmpeiblj;
                if (i34 != Integer.MIN_VALUE) {
                    this.f8003bfopjjpdmp = i34;
                }
                int i35 = this.f8076zynmafqrjb;
                if (i35 != Integer.MIN_VALUE) {
                    this.f8044opjhrmiecq = i35;
                }
            }
            if (this.f8070yggfygwlhe == -1 && this.f8028jyumaefscl == -1 && this.f8072zdlpuopuiu == -1 && this.f8030kcexrzcfyt == -1) {
                int i36 = this.f8034lqeggnwhkg;
                if (i36 != -1) {
                    this.f8074zfvoamnweg = i36;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i19 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i19;
                    }
                } else {
                    int i37 = this.f8039nufgyqmvbu;
                    if (i37 != -1) {
                        this.f8041oipsdeybqn = i37;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i19 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i19;
                        }
                    }
                }
                int i38 = this.f8013eablkybsjg;
                if (i38 != -1) {
                    this.f8068ydmasvzmpa = i38;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i18 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i18;
                    return;
                }
                int i39 = this.f8016gxszxtbevo;
                if (i39 != -1) {
                    this.f8052sflfametgt = i39;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i18 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i18;
                }
            }
        }

        public void zoijcleaow() {
            this.f8051rlfsiqarku = false;
            this.f8029jztzpxfvev = true;
            this.f8066xrmfcynszj = true;
            int i13 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i13 == -2 && this.f8060vipkmwdibw) {
                this.f8029jztzpxfvev = false;
                if (this.f8065wypolnanlu == 0) {
                    this.f8065wypolnanlu = 1;
                }
            }
            int i14 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i14 == -2 && this.f8025jhduphickx) {
                this.f8066xrmfcynszj = false;
                if (this.f8054stevsuqkhv == 0) {
                    this.f8054stevsuqkhv = 1;
                }
            }
            if (i13 == 0 || i13 == -1) {
                this.f8029jztzpxfvev = false;
                if (i13 == 0 && this.f8065wypolnanlu == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f8060vipkmwdibw = true;
                }
            }
            if (i14 == 0 || i14 == -1) {
                this.f8066xrmfcynszj = false;
                if (i14 == 0 && this.f8054stevsuqkhv == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f8025jhduphickx = true;
                }
            }
            if (this.f8048ppxfxbqfkf == -1.0f && this.f8020iobyxmoadg == -1 && this.f8075zoijcleaow == -1) {
                return;
            }
            this.f8051rlfsiqarku = true;
            this.f8029jztzpxfvev = true;
            this.f8066xrmfcynszj = true;
            if (!(this.f8040nuxfzjnpeb instanceof c1.nufgyqmvbu)) {
                this.f8040nuxfzjnpeb = new c1.nufgyqmvbu();
            }
            ((c1.nufgyqmvbu) this.f8040nuxfzjnpeb).K(this.f8050ribwqtqdhb);
        }

        public zoijcleaow(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8020iobyxmoadg = -1;
            this.f8075zoijcleaow = -1;
            this.f8048ppxfxbqfkf = -1.0f;
            this.f8063wkgbmnqykc = true;
            this.f8013eablkybsjg = -1;
            this.f8016gxszxtbevo = -1;
            this.f8034lqeggnwhkg = -1;
            this.f8039nufgyqmvbu = -1;
            this.f8012dxjokdxxww = -1;
            this.f8004btonecajqb = -1;
            this.f8015gtknphoqwx = -1;
            this.f8010draadjrbmk = -1;
            this.f8062wflxmlrfwp = -1;
            this.f8002agtfadlqog = -1;
            this.f8042ojitshcjhn = -1;
            this.f8049rgvfuqvkyq = -1;
            this.f8059vdvldrhtss = 0;
            this.f8045oxmwwwfdhm = 0.0f;
            this.f8030kcexrzcfyt = -1;
            this.f8072zdlpuopuiu = -1;
            this.f8070yggfygwlhe = -1;
            this.f8028jyumaefscl = -1;
            this.f8023iwizpuwonk = Integer.MIN_VALUE;
            this.f8007cqumvgiudr = Integer.MIN_VALUE;
            this.f8014esjtqupxsv = Integer.MIN_VALUE;
            this.f8032lereixgezr = Integer.MIN_VALUE;
            this.f8047pmvmpeiblj = Integer.MIN_VALUE;
            this.f8076zynmafqrjb = Integer.MIN_VALUE;
            this.f8022istkbnxepw = Integer.MIN_VALUE;
            this.f8005cdpycssgdh = 0;
            this.f8067yadqdtsiqt = true;
            this.f8021iozdgvuglv = true;
            this.f8033lmojexxdyd = 0.5f;
            this.f8064wwaezpbzkn = 0.5f;
            this.f8071ylkuphrtab = null;
            this.f8046pkzmftpjix = 0.0f;
            this.f8017hcddaimhww = 1;
            this.f8027jpowsppfya = -1.0f;
            this.f8018hkdspvbjdz = -1.0f;
            this.f8006cllcsxoeiz = 0;
            this.f8011dsvhmnatus = 0;
            this.f8065wypolnanlu = 0;
            this.f8054stevsuqkhv = 0;
            this.f8031kegysxyocb = 0;
            this.f8056tzroggbefp = 0;
            this.f8036mbcevpiqjq = 0;
            this.f8038ntlheqmsrt = 0;
            this.f8057ulzqkzuiru = 1.0f;
            this.f8053sopmlzcsov = 1.0f;
            this.f8008crxdokpmqz = -1;
            this.f8026jlmebxxoox = -1;
            this.f8050ribwqtqdhb = -1;
            this.f8060vipkmwdibw = false;
            this.f8025jhduphickx = false;
            this.f8019ikoacuggdj = null;
            this.f8043okpsazkaxt = 0;
            this.f8029jztzpxfvev = true;
            this.f8066xrmfcynszj = true;
            this.f8037metgxyhuhe = false;
            this.f8051rlfsiqarku = false;
            this.f8009czzsidtyhn = false;
            this.f8058uwvvkdfqfp = false;
            this.f8069yfnezrywwk = false;
            this.f8068ydmasvzmpa = -1;
            this.f8052sflfametgt = -1;
            this.f8074zfvoamnweg = -1;
            this.f8041oipsdeybqn = -1;
            this.f8003bfopjjpdmp = Integer.MIN_VALUE;
            this.f8044opjhrmiecq = Integer.MIN_VALUE;
            this.f8024iyctptxqzt = 0.5f;
            this.f8040nuxfzjnpeb = new c1.eablkybsjg();
            this.f8055tbqsvytpvh = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nufgyqmvbu.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                int i14 = iobyxmoadg.f8077iobyxmoadg.get(index);
                switch (i14) {
                    case 1:
                        this.f8050ribwqtqdhb = typedArrayObtainStyledAttributes.getInt(index, this.f8050ribwqtqdhb);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f8049rgvfuqvkyq);
                        this.f8049rgvfuqvkyq = resourceId;
                        if (resourceId == -1) {
                            this.f8049rgvfuqvkyq = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f8059vdvldrhtss = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8059vdvldrhtss);
                        break;
                    case 4:
                        float f13 = typedArrayObtainStyledAttributes.getFloat(index, this.f8045oxmwwwfdhm) % 360.0f;
                        this.f8045oxmwwwfdhm = f13;
                        if (f13 < 0.0f) {
                            this.f8045oxmwwwfdhm = (360.0f - f13) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f8020iobyxmoadg = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8020iobyxmoadg);
                        break;
                    case 6:
                        this.f8075zoijcleaow = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8075zoijcleaow);
                        break;
                    case 7:
                        this.f8048ppxfxbqfkf = typedArrayObtainStyledAttributes.getFloat(index, this.f8048ppxfxbqfkf);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8013eablkybsjg);
                        this.f8013eablkybsjg = resourceId2;
                        if (resourceId2 == -1) {
                            this.f8013eablkybsjg = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8016gxszxtbevo);
                        this.f8016gxszxtbevo = resourceId3;
                        if (resourceId3 == -1) {
                            this.f8016gxszxtbevo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8034lqeggnwhkg);
                        this.f8034lqeggnwhkg = resourceId4;
                        if (resourceId4 == -1) {
                            this.f8034lqeggnwhkg = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8039nufgyqmvbu);
                        this.f8039nufgyqmvbu = resourceId5;
                        if (resourceId5 == -1) {
                            this.f8039nufgyqmvbu = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8012dxjokdxxww);
                        this.f8012dxjokdxxww = resourceId6;
                        if (resourceId6 == -1) {
                            this.f8012dxjokdxxww = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8004btonecajqb);
                        this.f8004btonecajqb = resourceId7;
                        if (resourceId7 == -1) {
                            this.f8004btonecajqb = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8015gtknphoqwx);
                        this.f8015gtknphoqwx = resourceId8;
                        if (resourceId8 == -1) {
                            this.f8015gtknphoqwx = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8010draadjrbmk);
                        this.f8010draadjrbmk = resourceId9;
                        if (resourceId9 == -1) {
                            this.f8010draadjrbmk = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8062wflxmlrfwp);
                        this.f8062wflxmlrfwp = resourceId10;
                        if (resourceId10 == -1) {
                            this.f8062wflxmlrfwp = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8030kcexrzcfyt);
                        this.f8030kcexrzcfyt = resourceId11;
                        if (resourceId11 == -1) {
                            this.f8030kcexrzcfyt = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8072zdlpuopuiu);
                        this.f8072zdlpuopuiu = resourceId12;
                        if (resourceId12 == -1) {
                            this.f8072zdlpuopuiu = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8070yggfygwlhe);
                        this.f8070yggfygwlhe = resourceId13;
                        if (resourceId13 == -1) {
                            this.f8070yggfygwlhe = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8028jyumaefscl);
                        this.f8028jyumaefscl = resourceId14;
                        if (resourceId14 == -1) {
                            this.f8028jyumaefscl = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f8023iwizpuwonk = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8023iwizpuwonk);
                        break;
                    case 22:
                        this.f8007cqumvgiudr = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8007cqumvgiudr);
                        break;
                    case 23:
                        this.f8014esjtqupxsv = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8014esjtqupxsv);
                        break;
                    case 24:
                        this.f8032lereixgezr = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8032lereixgezr);
                        break;
                    case C4007z9.F /* 25 */:
                        this.f8047pmvmpeiblj = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8047pmvmpeiblj);
                        break;
                    case C4007z9.G /* 26 */:
                        this.f8076zynmafqrjb = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8076zynmafqrjb);
                        break;
                    case 27:
                        this.f8060vipkmwdibw = typedArrayObtainStyledAttributes.getBoolean(index, this.f8060vipkmwdibw);
                        break;
                    case 28:
                        this.f8025jhduphickx = typedArrayObtainStyledAttributes.getBoolean(index, this.f8025jhduphickx);
                        break;
                    case C4007z9.I /* 29 */:
                        this.f8033lmojexxdyd = typedArrayObtainStyledAttributes.getFloat(index, this.f8033lmojexxdyd);
                        break;
                    case 30:
                        this.f8064wwaezpbzkn = typedArrayObtainStyledAttributes.getFloat(index, this.f8064wwaezpbzkn);
                        break;
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        int i15 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f8065wypolnanlu = i15;
                        if (i15 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i16 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f8054stevsuqkhv = i16;
                        if (i16 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f8031kegysxyocb = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8031kegysxyocb);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f8031kegysxyocb) == -2) {
                                this.f8031kegysxyocb = -2;
                            }
                        }
                        break;
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        try {
                            this.f8036mbcevpiqjq = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8036mbcevpiqjq);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f8036mbcevpiqjq) == -2) {
                                this.f8036mbcevpiqjq = -2;
                            }
                        }
                        break;
                    case C4007z9.J /* 35 */:
                        this.f8057ulzqkzuiru = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f8057ulzqkzuiru));
                        this.f8065wypolnanlu = 2;
                        break;
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        try {
                            this.f8056tzroggbefp = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8056tzroggbefp);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f8056tzroggbefp) == -2) {
                                this.f8056tzroggbefp = -2;
                            }
                        }
                        break;
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        try {
                            this.f8038ntlheqmsrt = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8038ntlheqmsrt);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f8038ntlheqmsrt) == -2) {
                                this.f8038ntlheqmsrt = -2;
                            }
                        }
                        break;
                    case C4007z9.K /* 38 */:
                        this.f8053sopmlzcsov = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f8053sopmlzcsov));
                        this.f8054stevsuqkhv = 2;
                        break;
                    default:
                        switch (i14) {
                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                androidx.constraintlayout.widget.wkgbmnqykc.lmojexxdyd(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                this.f8027jpowsppfya = typedArrayObtainStyledAttributes.getFloat(index, this.f8027jpowsppfya);
                                break;
                            case 46:
                                this.f8018hkdspvbjdz = typedArrayObtainStyledAttributes.getFloat(index, this.f8018hkdspvbjdz);
                                break;
                            case 47:
                                this.f8006cllcsxoeiz = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f8011dsvhmnatus = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f8008crxdokpmqz = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8008crxdokpmqz);
                                break;
                            case 50:
                                this.f8026jlmebxxoox = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8026jlmebxxoox);
                                break;
                            case 51:
                                this.f8019ikoacuggdj = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8002agtfadlqog);
                                this.f8002agtfadlqog = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f8002agtfadlqog = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8042ojitshcjhn);
                                this.f8042ojitshcjhn = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f8042ojitshcjhn = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f8005cdpycssgdh = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8005cdpycssgdh);
                                break;
                            case 55:
                                this.f8022istkbnxepw = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8022istkbnxepw);
                                break;
                            default:
                                switch (i14) {
                                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                        androidx.constraintlayout.widget.wkgbmnqykc.yadqdtsiqt(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.f8067yadqdtsiqt = true;
                                        break;
                                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                        androidx.constraintlayout.widget.wkgbmnqykc.yadqdtsiqt(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.f8021iozdgvuglv = true;
                                        break;
                                    case 66:
                                        this.f8043okpsazkaxt = typedArrayObtainStyledAttributes.getInt(index, this.f8043okpsazkaxt);
                                        break;
                                    case 67:
                                        this.f8063wkgbmnqykc = typedArrayObtainStyledAttributes.getBoolean(index, this.f8063wkgbmnqykc);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            zoijcleaow();
        }

        public zoijcleaow(int i13, int i14) {
            super(i13, i14);
            this.f8020iobyxmoadg = -1;
            this.f8075zoijcleaow = -1;
            this.f8048ppxfxbqfkf = -1.0f;
            this.f8063wkgbmnqykc = true;
            this.f8013eablkybsjg = -1;
            this.f8016gxszxtbevo = -1;
            this.f8034lqeggnwhkg = -1;
            this.f8039nufgyqmvbu = -1;
            this.f8012dxjokdxxww = -1;
            this.f8004btonecajqb = -1;
            this.f8015gtknphoqwx = -1;
            this.f8010draadjrbmk = -1;
            this.f8062wflxmlrfwp = -1;
            this.f8002agtfadlqog = -1;
            this.f8042ojitshcjhn = -1;
            this.f8049rgvfuqvkyq = -1;
            this.f8059vdvldrhtss = 0;
            this.f8045oxmwwwfdhm = 0.0f;
            this.f8030kcexrzcfyt = -1;
            this.f8072zdlpuopuiu = -1;
            this.f8070yggfygwlhe = -1;
            this.f8028jyumaefscl = -1;
            this.f8023iwizpuwonk = Integer.MIN_VALUE;
            this.f8007cqumvgiudr = Integer.MIN_VALUE;
            this.f8014esjtqupxsv = Integer.MIN_VALUE;
            this.f8032lereixgezr = Integer.MIN_VALUE;
            this.f8047pmvmpeiblj = Integer.MIN_VALUE;
            this.f8076zynmafqrjb = Integer.MIN_VALUE;
            this.f8022istkbnxepw = Integer.MIN_VALUE;
            this.f8005cdpycssgdh = 0;
            this.f8067yadqdtsiqt = true;
            this.f8021iozdgvuglv = true;
            this.f8033lmojexxdyd = 0.5f;
            this.f8064wwaezpbzkn = 0.5f;
            this.f8071ylkuphrtab = null;
            this.f8046pkzmftpjix = 0.0f;
            this.f8017hcddaimhww = 1;
            this.f8027jpowsppfya = -1.0f;
            this.f8018hkdspvbjdz = -1.0f;
            this.f8006cllcsxoeiz = 0;
            this.f8011dsvhmnatus = 0;
            this.f8065wypolnanlu = 0;
            this.f8054stevsuqkhv = 0;
            this.f8031kegysxyocb = 0;
            this.f8056tzroggbefp = 0;
            this.f8036mbcevpiqjq = 0;
            this.f8038ntlheqmsrt = 0;
            this.f8057ulzqkzuiru = 1.0f;
            this.f8053sopmlzcsov = 1.0f;
            this.f8008crxdokpmqz = -1;
            this.f8026jlmebxxoox = -1;
            this.f8050ribwqtqdhb = -1;
            this.f8060vipkmwdibw = false;
            this.f8025jhduphickx = false;
            this.f8019ikoacuggdj = null;
            this.f8043okpsazkaxt = 0;
            this.f8029jztzpxfvev = true;
            this.f8066xrmfcynszj = true;
            this.f8037metgxyhuhe = false;
            this.f8051rlfsiqarku = false;
            this.f8009czzsidtyhn = false;
            this.f8058uwvvkdfqfp = false;
            this.f8069yfnezrywwk = false;
            this.f8068ydmasvzmpa = -1;
            this.f8052sflfametgt = -1;
            this.f8074zfvoamnweg = -1;
            this.f8041oipsdeybqn = -1;
            this.f8003bfopjjpdmp = Integer.MIN_VALUE;
            this.f8044opjhrmiecq = Integer.MIN_VALUE;
            this.f8024iyctptxqzt = 0.5f;
            this.f8040nuxfzjnpeb = new c1.eablkybsjg();
            this.f8055tbqsvytpvh = false;
        }
    }
}
