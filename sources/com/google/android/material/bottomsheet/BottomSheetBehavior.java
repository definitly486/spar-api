package com.google.android.material.bottomsheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.ojitshcjhn;
import da.btonecajqb;
import da.draadjrbmk;
import da.gtknphoqwx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import v1.jhduphickx;
import v1.skhdrjzrfn;
import w1.iwizpuwonk;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.ppxfxbqfkf implements na.zoijcleaow {

    /* JADX INFO: renamed from: dvvnrvtcbc, reason: collision with root package name */
    private static final int f22157dvvnrvtcbc = gtknphoqwx.Widget_Design_BottomSheet_Modal;

    /* JADX INFO: renamed from: auzgnhcxok, reason: collision with root package name */
    final SparseIntArray f22158auzgnhcxok;

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    WeakReference f22159bfopjjpdmp;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private ColorStateList f22160cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f22161cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f22162cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    int f22163crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private boolean f22164czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private boolean f22165dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f22166esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f22167hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f22168hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    boolean f22169ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int f22170iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private ra.lqeggnwhkg f22171istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private float f22172iwizpuwonk;

    /* JADX INFO: renamed from: iwxlajgraz, reason: collision with root package name */
    private final b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf f22173iwxlajgraz;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    WeakReference f22174iyctptxqzt;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    float f22175jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    int f22176jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f22177jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f22178jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private boolean f22179jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f22180kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f22181lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private int f22182lmojexxdyd;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    private VelocityTracker f22183lrnfpwlwnk;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private boolean f22184mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    int f22185metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private final nufgyqmvbu f22186ntlheqmsrt;

    /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name */
    int f22187nuxfzjnpeb;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    int f22188oipsdeybqn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private boolean f22189okpsazkaxt;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    WeakReference f22190opjhrmiecq;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f22191pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f22192pmvmpeiblj;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    float f22193ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    b2.ppxfxbqfkf f22194rlfsiqarku;

    /* JADX INFO: renamed from: roivzttewh, reason: collision with root package name */
    boolean f22195roivzttewh;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private int f22196sflfametgt;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    int f22197sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private int f22198stevsuqkhv;

    /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name */
    private int f22199tbqsvytpvh;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private ra.gtknphoqwx f22200tzroggbefp;

    /* JADX INFO: renamed from: uawqvzlxes, reason: collision with root package name */
    private Map f22201uawqvzlxes;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private ValueAnimator f22202ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private int f22203uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    int f22204vipkmwdibw;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    private final ArrayList f22205weqkydbzbr;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f22206wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private int f22207wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    int f22208xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f22209yadqdtsiqt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private float f22210ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private boolean f22211yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f22212yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private boolean f22213ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f22214zdlpuopuiu;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    na.gxszxtbevo f22215zeieaojujs;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    int f22216zfvoamnweg;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f22217zynmafqrjb;

    class eablkybsjg extends b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private long f22223iobyxmoadg;

        eablkybsjg() {
        }

        private boolean agtfadlqog(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f22188oipsdeybqn + bottomSheetBehavior.lrnfpwlwnk()) / 2;
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void btonecajqb(int i13) {
            if (i13 == 1 && BottomSheetBehavior.this.f22179jztzpxfvev) {
                BottomSheetBehavior.this.d(1);
            }
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void draadjrbmk(View view, float f13, float f14) {
            int i13 = 6;
            if (f14 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f22169ikoacuggdj && bottomSheetBehavior.h(view, f14)) {
                    if ((Math.abs(f13) < Math.abs(f14) && f14 > BottomSheetBehavior.this.f22162cqumvgiudr) || agtfadlqog(view)) {
                        i13 = 5;
                    } else if (BottomSheetBehavior.this.f22212yggfygwlhe || Math.abs(view.getTop() - BottomSheetBehavior.this.lrnfpwlwnk()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f22176jlmebxxoox)) {
                        i13 = 3;
                    }
                } else if (f14 == 0.0f || Math.abs(f13) > Math.abs(f14)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f22212yggfygwlhe) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i14 = bottomSheetBehavior2.f22176jlmebxxoox;
                        if (top < i14) {
                            if (top < Math.abs(top - bottomSheetBehavior2.f22204vipkmwdibw)) {
                                i13 = 3;
                            } else if (BottomSheetBehavior.this.i()) {
                                i13 = 4;
                            }
                        } else if (Math.abs(top - i14) >= Math.abs(top - BottomSheetBehavior.this.f22204vipkmwdibw) || BottomSheetBehavior.this.i()) {
                            i13 = 4;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.f22163crxdokpmqz) < Math.abs(top - BottomSheetBehavior.this.f22204vipkmwdibw)) {
                        i13 = 3;
                    } else {
                        i13 = 4;
                    }
                } else if (BottomSheetBehavior.this.f22212yggfygwlhe) {
                    i13 = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.f22176jlmebxxoox) >= Math.abs(top2 - BottomSheetBehavior.this.f22204vipkmwdibw) || BottomSheetBehavior.this.i()) {
                        i13 = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.f22212yggfygwlhe) {
                i13 = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f22223iobyxmoadg;
                if (BottomSheetBehavior.this.i()) {
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.f(jCurrentTimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.f22188oipsdeybqn)) {
                        i13 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.f22176jlmebxxoox) {
                }
                i13 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.k(view, i13, bottomSheetBehavior4.j());
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int eablkybsjg(View view) {
            return BottomSheetBehavior.this.uwvvkdfqfp() ? BottomSheetBehavior.this.f22188oipsdeybqn : BottomSheetBehavior.this.f22204vipkmwdibw;
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void gtknphoqwx(View view, int i13, int i14, int i15, int i16) {
            BottomSheetBehavior.this.bfopjjpdmp(i14);
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int iobyxmoadg(View view, int i13, int i14) {
            return view.getLeft();
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public boolean wflxmlrfwp(View view, int i13) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i14 = bottomSheetBehavior.f22208xrmfcynszj;
            if (i14 == 1 || bottomSheetBehavior.f22195roivzttewh) {
                return false;
            }
            if (i14 == 3 && bottomSheetBehavior.f22187nuxfzjnpeb == i13) {
                WeakReference weakReference = bottomSheetBehavior.f22174iyctptxqzt;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f22223iobyxmoadg = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f22159bfopjjpdmp;
            return weakReference2 != null && weakReference2.get() == view;
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int zoijcleaow(View view, int i13, int i14) {
            return o1.iobyxmoadg.zoijcleaow(i13, BottomSheetBehavior.this.lrnfpwlwnk(), eablkybsjg(view));
        }
    }

    class gxszxtbevo implements iwizpuwonk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ int f22225iobyxmoadg;

        gxszxtbevo(int i13) {
            this.f22225iobyxmoadg = i13;
        }

        @Override // w1.iwizpuwonk
        public boolean iobyxmoadg(View view, iwizpuwonk.iobyxmoadg iobyxmoadgVar) {
            BottomSheetBehavior.this.c(this.f22225iobyxmoadg);
            return true;
        }
    }

    class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f22228yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ View f22229zdlpuopuiu;

        iobyxmoadg(View view, int i13) {
            this.f22229zdlpuopuiu = view;
            this.f22228yggfygwlhe = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.k(this.f22229zdlpuopuiu, this.f22228yggfygwlhe, false);
        }
    }

    public static abstract class lqeggnwhkg {
        void iobyxmoadg(View view) {
        }

        public abstract void ppxfxbqfkf(View view, int i13);

        public abstract void zoijcleaow(View view, float f13);
    }

    class ppxfxbqfkf implements ValueAnimator.AnimatorUpdateListener {
        ppxfxbqfkf() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f22171istkbnxepw != null) {
                BottomSheetBehavior.this.f22171istkbnxepw.jlmebxxoox(fFloatValue);
            }
        }
    }

    class wkgbmnqykc implements ojitshcjhn.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ boolean f22236iobyxmoadg;

        wkgbmnqykc(boolean z13) {
            this.f22236iobyxmoadg = z13;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.ojitshcjhn.ppxfxbqfkf
        public skhdrjzrfn iobyxmoadg(View view, skhdrjzrfn skhdrjzrfnVar, ojitshcjhn.wkgbmnqykc wkgbmnqykcVar) {
            boolean z13;
            j1.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = skhdrjzrfnVar.gxszxtbevo(skhdrjzrfn.draadjrbmk.dxjokdxxww());
            j1.wkgbmnqykc wkgbmnqykcVarGxszxtbevo2 = skhdrjzrfnVar.gxszxtbevo(skhdrjzrfn.draadjrbmk.gxszxtbevo());
            BottomSheetBehavior.this.f22198stevsuqkhv = wkgbmnqykcVarGxszxtbevo.f50508zoijcleaow;
            boolean zNufgyqmvbu = ojitshcjhn.nufgyqmvbu(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f22213ylkuphrtab) {
                BottomSheetBehavior.this.f22207wypolnanlu = skhdrjzrfnVar.btonecajqb();
                paddingBottom = wkgbmnqykcVar.f22999wkgbmnqykc + BottomSheetBehavior.this.f22207wypolnanlu;
            }
            if (BottomSheetBehavior.this.f22191pkzmftpjix) {
                paddingLeft = (zNufgyqmvbu ? wkgbmnqykcVar.f22998ppxfxbqfkf : wkgbmnqykcVar.f22997iobyxmoadg) + wkgbmnqykcVarGxszxtbevo.f50505iobyxmoadg;
            }
            if (BottomSheetBehavior.this.f22167hcddaimhww) {
                paddingRight = (zNufgyqmvbu ? wkgbmnqykcVar.f22997iobyxmoadg : wkgbmnqykcVar.f22998ppxfxbqfkf) + wkgbmnqykcVarGxszxtbevo.f50506ppxfxbqfkf;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z14 = true;
            if (BottomSheetBehavior.this.f22168hkdspvbjdz) {
                int i13 = marginLayoutParams.leftMargin;
                int i14 = wkgbmnqykcVarGxszxtbevo.f50505iobyxmoadg;
                if (i13 != i14) {
                    marginLayoutParams.leftMargin = i14;
                    z13 = true;
                } else {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
            if (BottomSheetBehavior.this.f22161cllcsxoeiz) {
                int i15 = marginLayoutParams.rightMargin;
                int i16 = wkgbmnqykcVarGxszxtbevo.f50506ppxfxbqfkf;
                if (i15 != i16) {
                    marginLayoutParams.rightMargin = i16;
                    z13 = true;
                }
            }
            if (BottomSheetBehavior.this.f22165dsvhmnatus) {
                int i17 = marginLayoutParams.topMargin;
                int i18 = wkgbmnqykcVarGxszxtbevo.f50508zoijcleaow;
                if (i17 != i18) {
                    marginLayoutParams.topMargin = i18;
                } else {
                    z14 = z13;
                }
            } else {
                z14 = z13;
            }
            if (z14) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f22236iobyxmoadg) {
                BottomSheetBehavior.this.f22182lmojexxdyd = wkgbmnqykcVarGxszxtbevo2.f50507wkgbmnqykc;
            }
            if (BottomSheetBehavior.this.f22213ylkuphrtab || this.f22236iobyxmoadg) {
                BottomSheetBehavior.this.p(false);
            }
            return skhdrjzrfnVar;
        }
    }

    class zoijcleaow extends AnimatorListenerAdapter {
        zoijcleaow() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.d(5);
            WeakReference weakReference = BottomSheetBehavior.this.f22159bfopjjpdmp;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ((View) BottomSheetBehavior.this.f22159bfopjjpdmp.get()).requestLayout();
        }
    }

    public BottomSheetBehavior() {
        this.f22214zdlpuopuiu = 0;
        this.f22212yggfygwlhe = true;
        this.f22178jyumaefscl = false;
        this.f22209yadqdtsiqt = -1;
        this.f22170iozdgvuglv = -1;
        this.f22186ntlheqmsrt = new nufgyqmvbu(this, null);
        this.f22193ribwqtqdhb = 0.5f;
        this.f22175jhduphickx = -1.0f;
        this.f22179jztzpxfvev = true;
        this.f22208xrmfcynszj = 4;
        this.f22185metgxyhuhe = 4;
        this.f22210ydmasvzmpa = 0.1f;
        this.f22205weqkydbzbr = new ArrayList();
        this.f22199tbqsvytpvh = -1;
        this.f22158auzgnhcxok = new SparseIntArray();
        this.f22173iwxlajgraz = new eablkybsjg();
    }

    private void ageimvtcrz(SavedState savedState) {
        int i13 = this.f22214zdlpuopuiu;
        if (i13 == 0) {
            return;
        }
        if (i13 == -1 || (i13 & 1) == 1) {
            this.f22166esjtqupxsv = savedState.f22220iwizpuwonk;
        }
        if (i13 == -1 || (i13 & 2) == 2) {
            this.f22212yggfygwlhe = savedState.f22218cqumvgiudr;
        }
        if (i13 == -1 || (i13 & 4) == 4) {
            this.f22169ikoacuggdj = savedState.f22219esjtqupxsv;
        }
        if (i13 == -1 || (i13 & 8) == 8) {
            this.f22189okpsazkaxt = savedState.f22222lereixgezr;
        }
    }

    private boolean auzgnhcxok() {
        return this.f22208xrmfcynszj == 3 && (this.f22180kegysxyocb || uawqvzlxes());
    }

    private float czzsidtyhn(int i13) {
        float f13;
        float fLrnfpwlwnk;
        int i14 = this.f22204vipkmwdibw;
        if (i13 > i14 || i14 == lrnfpwlwnk()) {
            int i15 = this.f22204vipkmwdibw;
            f13 = i15 - i13;
            fLrnfpwlwnk = this.f22188oipsdeybqn - i15;
        } else {
            int i16 = this.f22204vipkmwdibw;
            f13 = i16 - i13;
            fLrnfpwlwnk = i16 - lrnfpwlwnk();
        }
        return f13 / fLrnfpwlwnk;
    }

    private void e(View view) {
        boolean z13 = (Build.VERSION.SDK_INT < 29 || iwxlajgraz() || this.f22181lereixgezr) ? false : true;
        if (this.f22213ylkuphrtab || this.f22191pkzmftpjix || this.f22167hcddaimhww || this.f22168hkdspvbjdz || this.f22161cllcsxoeiz || this.f22165dsvhmnatus || z13) {
            ojitshcjhn.zoijcleaow(view, new wkgbmnqykc(z13));
        }
    }

    private void fiwbwshyhd() {
        this.f22187nuxfzjnpeb = -1;
        this.f22199tbqsvytpvh = -1;
        VelocityTracker velocityTracker = this.f22183lrnfpwlwnk;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f22183lrnfpwlwnk = null;
        }
    }

    private void fyldjkxazc(View view, Runnable runnable) {
        if (igdgnonuha(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean g() {
        return this.f22194rlfsiqarku != null && (this.f22179jztzpxfvev || this.f22208xrmfcynszj == 1);
    }

    private void hszhottldk(View view, zdlpuopuiu.iobyxmoadg iobyxmoadgVar, int i13) {
        jhduphickx.yfnezrywwk(view, iobyxmoadgVar, null, ydmasvzmpa(i13));
    }

    private boolean igdgnonuha(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && jhduphickx.kegysxyocb(view);
    }

    public static BottomSheetBehavior iyctptxqzt(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.gxszxtbevo)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = ((CoordinatorLayout.gxszxtbevo) layoutParams).gxszxtbevo();
        if (ppxfxbqfkfVarGxszxtbevo instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) ppxfxbqfkfVarGxszxtbevo;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int jhduphickx(View view, int i13, int i14) {
        return jhduphickx.ppxfxbqfkf(view, view.getResources().getString(i13), ydmasvzmpa(i14));
    }

    private float jztzpxfvev(float f13, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f13 > 0.0f) {
                return radius / f13;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(View view, int i13, boolean z13) {
        int iTbqsvytpvh = tbqsvytpvh(i13);
        b2.ppxfxbqfkf ppxfxbqfkfVar = this.f22194rlfsiqarku;
        if (ppxfxbqfkfVar == null || (!z13 ? ppxfxbqfkfVar.cllcsxoeiz(view, view.getLeft(), iTbqsvytpvh) : ppxfxbqfkfVar.jpowsppfya(view.getLeft(), iTbqsvytpvh))) {
            d(i13);
            return;
        }
        d(2);
        n(i13, true);
        this.f22186ntlheqmsrt.ppxfxbqfkf(i13);
    }

    private void l() {
        WeakReference weakReference = this.f22159bfopjjpdmp;
        if (weakReference != null) {
            m((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f22190opjhrmiecq;
        if (weakReference2 != null) {
            m((View) weakReference2.get(), 1);
        }
    }

    private void m(View view, int i13) {
        if (view == null) {
            return;
        }
        yfnezrywwk(view, i13);
        if (!this.f22212yggfygwlhe && this.f22208xrmfcynszj != 6) {
            this.f22158auzgnhcxok.put(i13, jhduphickx(view, btonecajqb.bottomsheet_action_expand_halfway, 6));
        }
        if (this.f22169ikoacuggdj && skhdrjzrfn() && this.f22208xrmfcynszj != 5) {
            hszhottldk(view, zdlpuopuiu.iobyxmoadg.f118519esjtqupxsv, 5);
        }
        int i14 = this.f22208xrmfcynszj;
        if (i14 == 3) {
            hszhottldk(view, zdlpuopuiu.iobyxmoadg.f118514cqumvgiudr, this.f22212yggfygwlhe ? 4 : 6);
            return;
        }
        if (i14 == 4) {
            hszhottldk(view, zdlpuopuiu.iobyxmoadg.f118526iwizpuwonk, this.f22212yggfygwlhe ? 3 : 6);
        } else {
            if (i14 != 6) {
                return;
            }
            hszhottldk(view, zdlpuopuiu.iobyxmoadg.f118514cqumvgiudr, 4);
            hszhottldk(view, zdlpuopuiu.iobyxmoadg.f118526iwizpuwonk, 3);
        }
    }

    private float metgxyhuhe() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f22171istkbnxepw == null || (weakReference = this.f22159bfopjjpdmp) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f22159bfopjjpdmp.get();
        if (!uawqvzlxes() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(jztzpxfvev(this.f22171istkbnxepw.iozdgvuglv(), rootWindowInsets.getRoundedCorner(0)), jztzpxfvev(this.f22171istkbnxepw.lmojexxdyd(), rootWindowInsets.getRoundedCorner(1)));
    }

    private void n(int i13, boolean z13) {
        boolean zAuzgnhcxok;
        ValueAnimator valueAnimator;
        if (i13 == 2 || this.f22184mbcevpiqjq == (zAuzgnhcxok = auzgnhcxok()) || this.f22171istkbnxepw == null) {
            return;
        }
        this.f22184mbcevpiqjq = zAuzgnhcxok;
        if (!z13 || (valueAnimator = this.f22202ulzqkzuiru) == null) {
            ValueAnimator valueAnimator2 = this.f22202ulzqkzuiru;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f22202ulzqkzuiru.cancel();
            }
            this.f22171istkbnxepw.jlmebxxoox(this.f22184mbcevpiqjq ? metgxyhuhe() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f22202ulzqkzuiru.reverse();
        } else {
            this.f22202ulzqkzuiru.setFloatValues(this.f22171istkbnxepw.esjtqupxsv(), zAuzgnhcxok ? metgxyhuhe() : 1.0f);
            this.f22202ulzqkzuiru.start();
        }
    }

    private void o(boolean z13) {
        Map map;
        WeakReference weakReference = this.f22159bfopjjpdmp;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z13) {
                if (this.f22201uawqvzlxes != null) {
                    return;
                } else {
                    this.f22201uawqvzlxes = new HashMap(childCount);
                }
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = coordinatorLayout.getChildAt(i13);
                if (childAt != this.f22159bfopjjpdmp.get()) {
                    if (z13) {
                        this.f22201uawqvzlxes.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f22178jyumaefscl) {
                            jhduphickx.uawqvzlxes(childAt, 4);
                        }
                    } else if (this.f22178jyumaefscl && (map = this.f22201uawqvzlxes) != null && map.containsKey(childAt)) {
                        jhduphickx.uawqvzlxes(childAt, ((Integer) this.f22201uawqvzlxes.get(childAt)).intValue());
                    }
                }
            }
            if (!z13) {
                this.f22201uawqvzlxes = null;
            } else if (this.f22178jyumaefscl) {
                ((View) this.f22159bfopjjpdmp.get()).sendAccessibilityEvent(8);
            }
        }
    }

    private void okpsazkaxt() {
        int iRlfsiqarku = rlfsiqarku();
        if (this.f22212yggfygwlhe) {
            this.f22204vipkmwdibw = Math.max(this.f22188oipsdeybqn - iRlfsiqarku, this.f22163crxdokpmqz);
        } else {
            this.f22204vipkmwdibw = this.f22188oipsdeybqn - iRlfsiqarku;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(boolean z13) {
        View view;
        if (this.f22159bfopjjpdmp != null) {
            okpsazkaxt();
            if (this.f22208xrmfcynszj != 4 || (view = (View) this.f22159bfopjjpdmp.get()) == null) {
                return;
            }
            if (z13) {
                c(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private int rlfsiqarku() {
        int i13;
        if (this.f22181lereixgezr) {
            return Math.min(Math.max(this.f22192pmvmpeiblj, this.f22188oipsdeybqn - ((this.f22216zfvoamnweg * 9) / 16)), this.f22196sflfametgt) + this.f22207wypolnanlu;
        }
        return (this.f22206wwaezpbzkn || this.f22213ylkuphrtab || (i13 = this.f22182lmojexxdyd) <= 0) ? this.f22166esjtqupxsv + this.f22207wypolnanlu : Math.max(this.f22166esjtqupxsv, i13 + this.f22217zynmafqrjb);
    }

    private float roivzttewh() {
        VelocityTracker velocityTracker = this.f22183lrnfpwlwnk;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f22172iwizpuwonk);
        return this.f22183lrnfpwlwnk.getYVelocity(this.f22187nuxfzjnpeb);
    }

    private void sflfametgt(Context context) {
        if (this.f22200tzroggbefp == null) {
            return;
        }
        ra.lqeggnwhkg lqeggnwhkgVar = new ra.lqeggnwhkg(this.f22200tzroggbefp);
        this.f22171istkbnxepw = lqeggnwhkgVar;
        lqeggnwhkgVar.hkdspvbjdz(context);
        ColorStateList colorStateList = this.f22160cdpycssgdh;
        if (colorStateList != null) {
            this.f22171istkbnxepw.crxdokpmqz(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f22171istkbnxepw.setTint(typedValue.data);
    }

    private int tbqsvytpvh(int i13) {
        if (i13 == 3) {
            return lrnfpwlwnk();
        }
        if (i13 == 4) {
            return this.f22204vipkmwdibw;
        }
        if (i13 == 5) {
            return this.f22188oipsdeybqn;
        }
        if (i13 == 6) {
            return this.f22176jlmebxxoox;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i13);
    }

    private boolean uawqvzlxes() {
        WeakReference weakReference = this.f22159bfopjjpdmp;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f22159bfopjjpdmp.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uwvvkdfqfp() {
        return dvvnrvtcbc() && skhdrjzrfn();
    }

    private int weqkydbzbr(int i13, int i14, int i15, int i16) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i14, i16);
        if (i15 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i15), 1073741824);
        }
        if (size != 0) {
            i15 = Math.min(size, i15);
        }
        return View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
    }

    private void xrmfcynszj() {
        this.f22176jlmebxxoox = (int) (this.f22188oipsdeybqn * (1.0f - this.f22193ribwqtqdhb));
    }

    private iwizpuwonk ydmasvzmpa(int i13) {
        return new gxszxtbevo(i13);
    }

    private void yfnezrywwk(View view, int i13) {
        if (view == null) {
            return;
        }
        jhduphickx.czzsidtyhn(view, 524288);
        jhduphickx.czzsidtyhn(view, 262144);
        jhduphickx.czzsidtyhn(view, 1048576);
        int i14 = this.f22158auzgnhcxok.get(i13, -1);
        if (i14 != -1) {
            jhduphickx.czzsidtyhn(view, i14);
            this.f22158auzgnhcxok.delete(i13);
        }
    }

    private void zfvoamnweg() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(metgxyhuhe(), 1.0f);
        this.f22202ulzqkzuiru = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f22202ulzqkzuiru.addUpdateListener(new ppxfxbqfkf());
    }

    public void a(int i13) {
        this.f22162cqumvgiudr = i13;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public void agtfadlqog() {
        super.agtfadlqog();
        this.f22159bfopjjpdmp = null;
        this.f22194rlfsiqarku = null;
        this.f22215zeieaojujs = null;
    }

    public void b(boolean z13) {
        this.f22189okpsazkaxt = z13;
    }

    void bfopjjpdmp(int i13) {
        View view = (View) this.f22159bfopjjpdmp.get();
        if (view == null || this.f22205weqkydbzbr.isEmpty()) {
            return;
        }
        float fCzzsidtyhn = czzsidtyhn(i13);
        for (int i14 = 0; i14 < this.f22205weqkydbzbr.size(); i14++) {
            ((lqeggnwhkg) this.f22205weqkydbzbr.get(i14)).zoijcleaow(view, fCzzsidtyhn);
        }
    }

    public void c(int i13) {
        if (i13 == 1 || i13 == 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("STATE_");
            sb3.append(i13 == 1 ? "DRAGGING" : "SETTLING");
            sb3.append(" should not be set externally.");
            throw new IllegalArgumentException(sb3.toString());
        }
        if (!this.f22169ikoacuggdj && i13 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i13);
            return;
        }
        int i14 = (i13 == 6 && this.f22212yggfygwlhe && tbqsvytpvh(i13) <= this.f22163crxdokpmqz) ? 3 : i13;
        WeakReference weakReference = this.f22159bfopjjpdmp;
        if (weakReference == null || weakReference.get() == null) {
            d(i13);
        } else {
            View view = (View) this.f22159bfopjjpdmp.get();
            fyldjkxazc(view, new iobyxmoadg(view, i14));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public void cqumvgiudr(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
    }

    void d(int i13) {
        View view;
        if (this.f22208xrmfcynszj == i13) {
            return;
        }
        this.f22208xrmfcynszj = i13;
        if (i13 == 4 || i13 == 3 || i13 == 6 || (this.f22169ikoacuggdj && i13 == 5)) {
            this.f22185metgxyhuhe = i13;
        }
        WeakReference weakReference = this.f22159bfopjjpdmp;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i13 == 3) {
            o(true);
        } else if (i13 == 6 || i13 == 5 || i13 == 4) {
            o(false);
        }
        n(i13, true);
        for (int i14 = 0; i14 < this.f22205weqkydbzbr.size(); i14++) {
            ((lqeggnwhkg) this.f22205weqkydbzbr.get(i14)).ppxfxbqfkf(view, i13);
        }
        l();
    }

    public boolean dvvnrvtcbc() {
        return this.f22169ikoacuggdj;
    }

    public final void eslsurpljm(int i13, boolean z13) {
        if (i13 == -1) {
            if (this.f22181lereixgezr) {
                return;
            } else {
                this.f22181lereixgezr = true;
            }
        } else {
            if (!this.f22181lereixgezr && this.f22166esjtqupxsv == i13) {
                return;
            }
            this.f22181lereixgezr = false;
            this.f22166esjtqupxsv = Math.max(0, i13);
        }
        p(z13);
    }

    public void ezmngbhpjk(int i13) {
        this.f22170iozdgvuglv = i13;
    }

    public boolean f(long j13, float f13) {
        return false;
    }

    public void fmlbqenlif(boolean z13) {
        if (this.f22169ikoacuggdj != z13) {
            this.f22169ikoacuggdj = z13;
            if (!z13 && this.f22208xrmfcynszj == 5) {
                c(4);
            }
            l();
        }
    }

    public void grlcpdaxtj(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f22197sopmlzcsov = i13;
        n(this.f22208xrmfcynszj, true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public void gtknphoqwx(CoordinatorLayout.gxszxtbevo gxszxtbevoVar) {
        super.gtknphoqwx(gxszxtbevoVar);
        this.f22159bfopjjpdmp = null;
        this.f22194rlfsiqarku = null;
        this.f22215zeieaojujs = null;
    }

    boolean h(View view, float f13) {
        if (this.f22189okpsazkaxt) {
            return true;
        }
        if (skhdrjzrfn() && view.getTop() >= this.f22204vipkmwdibw) {
            return Math.abs((((float) view.getTop()) + (f13 * this.f22210ydmasvzmpa)) - ((float) this.f22204vipkmwdibw)) / ((float) rlfsiqarku()) > 0.5f;
        }
        return false;
    }

    public boolean i() {
        return false;
    }

    public void ikoacuggdj(lqeggnwhkg lqeggnwhkgVar) {
        if (this.f22205weqkydbzbr.contains(lqeggnwhkgVar)) {
            return;
        }
        this.f22205weqkydbzbr.add(lqeggnwhkgVar);
    }

    @Override // na.zoijcleaow
    public void iobyxmoadg() {
        na.gxszxtbevo gxszxtbevoVar = this.f22215zeieaojujs;
        if (gxszxtbevoVar == null) {
            return;
        }
        gxszxtbevoVar.gxszxtbevo();
    }

    public void ipoelvxyzq(boolean z13) {
        this.f22179jztzpxfvev = z13;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public Parcelable istkbnxepw(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.istkbnxepw(coordinatorLayout, view), this);
    }

    public boolean iwxlajgraz() {
        return this.f22206wwaezpbzkn;
    }

    public void ixidwrxhsl(boolean z13) {
        this.f22206wwaezpbzkn = z13;
    }

    public boolean j() {
        return true;
    }

    public void jrbgnlbqoe(float f13) {
        if (f13 <= 0.0f || f13 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f22193ribwqtqdhb = f13;
        if (this.f22159bfopjjpdmp != null) {
            xrmfcynszj();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean kcexrzcfyt(CoordinatorLayout coordinatorLayout, View view, View view2, float f13, float f14) {
        WeakReference weakReference;
        if (lxfrhoxuzk() && (weakReference = this.f22174iyctptxqzt) != null && view2 == weakReference.get()) {
            return this.f22208xrmfcynszj != 3 || super.kcexrzcfyt(coordinatorLayout, view, view2, f13, f14);
        }
        return false;
    }

    public void krqnebusok(int i13) {
        this.f22214zdlpuopuiu = i13;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public void lmojexxdyd(CoordinatorLayout coordinatorLayout, View view, View view2, int i13) {
        WeakReference weakReference;
        int i14 = 3;
        if (view.getTop() == lrnfpwlwnk()) {
            d(3);
            return;
        }
        if (!lxfrhoxuzk() || ((weakReference = this.f22174iyctptxqzt) != null && view2 == weakReference.get() && this.f22211yfnezrywwk)) {
            if (this.f22203uwvvkdfqfp > 0) {
                if (!this.f22212yggfygwlhe && view.getTop() > this.f22176jlmebxxoox) {
                    i14 = 6;
                }
            } else if (this.f22169ikoacuggdj && h(view, roivzttewh())) {
                i14 = 5;
            } else if (this.f22203uwvvkdfqfp == 0) {
                int top = view.getTop();
                if (!this.f22212yggfygwlhe) {
                    int i15 = this.f22176jlmebxxoox;
                    if (top < i15) {
                        if (top >= Math.abs(top - this.f22204vipkmwdibw)) {
                            if (i()) {
                                i14 = 4;
                            } else {
                                i14 = 6;
                            }
                        }
                    } else if (Math.abs(top - i15) < Math.abs(top - this.f22204vipkmwdibw)) {
                        i14 = 6;
                    } else {
                        i14 = 4;
                    }
                } else if (Math.abs(top - this.f22163crxdokpmqz) >= Math.abs(top - this.f22204vipkmwdibw)) {
                    i14 = 4;
                }
            } else {
                if (!this.f22212yggfygwlhe) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f22176jlmebxxoox) < Math.abs(top2 - this.f22204vipkmwdibw)) {
                        i14 = 6;
                    }
                }
                i14 = 4;
            }
            k(view, i14, false);
            this.f22211yfnezrywwk = false;
        }
    }

    public int lrnfpwlwnk() {
        if (this.f22212yggfygwlhe) {
            return this.f22163crxdokpmqz;
        }
        return Math.max(this.f22197sopmlzcsov, this.f22177jpowsppfya ? 0 : this.f22198stevsuqkhv);
    }

    public boolean lxfrhoxuzk() {
        return true;
    }

    public void mhtqkkgtqm(boolean z13) {
        if (this.f22212yggfygwlhe == z13) {
            return;
        }
        this.f22212yggfygwlhe = z13;
        if (this.f22159bfopjjpdmp != null) {
            okpsazkaxt();
        }
        d((this.f22212yggfygwlhe && this.f22208xrmfcynszj == 6) ? 3 : this.f22208xrmfcynszj);
        n(this.f22208xrmfcynszj, true);
        l();
    }

    public int nuxfzjnpeb() {
        return this.f22208xrmfcynszj;
    }

    public void oipsdeybqn() {
        this.f22202ulzqkzuiru = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean ojitshcjhn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i13;
        b2.ppxfxbqfkf ppxfxbqfkfVar;
        if (!view.isShown() || !this.f22179jztzpxfvev) {
            this.f22164czzsidtyhn = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            fiwbwshyhd();
        }
        if (this.f22183lrnfpwlwnk == null) {
            this.f22183lrnfpwlwnk = VelocityTracker.obtain();
        }
        this.f22183lrnfpwlwnk.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x13 = (int) motionEvent.getX();
            this.f22199tbqsvytpvh = (int) motionEvent.getY();
            if (this.f22208xrmfcynszj != 2) {
                WeakReference weakReference = this.f22174iyctptxqzt;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.zynmafqrjb(view2, x13, this.f22199tbqsvytpvh)) {
                    this.f22187nuxfzjnpeb = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f22195roivzttewh = true;
                }
            }
            this.f22164czzsidtyhn = this.f22187nuxfzjnpeb == -1 && !coordinatorLayout.zynmafqrjb(view, x13, this.f22199tbqsvytpvh);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f22195roivzttewh = false;
            this.f22187nuxfzjnpeb = -1;
            if (this.f22164czzsidtyhn) {
                this.f22164czzsidtyhn = false;
                return false;
            }
        }
        if (!this.f22164czzsidtyhn && (ppxfxbqfkfVar = this.f22194rlfsiqarku) != null && ppxfxbqfkfVar.hkdspvbjdz(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f22174iyctptxqzt;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f22164czzsidtyhn || this.f22208xrmfcynszj == 1 || coordinatorLayout.zynmafqrjb(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f22194rlfsiqarku == null || (i13 = this.f22199tbqsvytpvh) == -1 || Math.abs(((float) i13) - motionEvent.getY()) <= ((float) this.f22194rlfsiqarku.iwizpuwonk())) ? false : true;
    }

    View opjhrmiecq(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (jhduphickx.mbcevpiqjq(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View viewOpjhrmiecq = opjhrmiecq(viewGroup.getChildAt(i13));
                if (viewOpjhrmiecq != null) {
                    return viewOpjhrmiecq;
                }
            }
        }
        return null;
    }

    @Override // na.zoijcleaow
    public void ppxfxbqfkf(androidx.activity.zoijcleaow zoijcleaowVar) {
        na.gxszxtbevo gxszxtbevoVar = this.f22215zeieaojujs;
        if (gxszxtbevoVar == null) {
            return;
        }
        gxszxtbevoVar.draadjrbmk(zoijcleaowVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, View view, int i13) {
        if (jhduphickx.iwizpuwonk(coordinatorLayout) && !jhduphickx.iwizpuwonk(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f22159bfopjjpdmp == null) {
            this.f22192pmvmpeiblj = coordinatorLayout.getResources().getDimensionPixelSize(da.wkgbmnqykc.design_bottom_sheet_peek_height_min);
            e(view);
            jhduphickx.grlcpdaxtj(view, new com.google.android.material.bottomsheet.wkgbmnqykc(view));
            this.f22159bfopjjpdmp = new WeakReference(view);
            this.f22215zeieaojujs = new na.gxszxtbevo(view);
            ra.lqeggnwhkg lqeggnwhkgVar = this.f22171istkbnxepw;
            if (lqeggnwhkgVar != null) {
                jhduphickx.weqkydbzbr(view, lqeggnwhkgVar);
                ra.lqeggnwhkg lqeggnwhkgVar2 = this.f22171istkbnxepw;
                float fYggfygwlhe = this.f22175jhduphickx;
                if (fYggfygwlhe == -1.0f) {
                    fYggfygwlhe = jhduphickx.yggfygwlhe(view);
                }
                lqeggnwhkgVar2.sopmlzcsov(fYggfygwlhe);
            } else {
                ColorStateList colorStateList = this.f22160cdpycssgdh;
                if (colorStateList != null) {
                    jhduphickx.lrnfpwlwnk(view, colorStateList);
                }
            }
            l();
            if (jhduphickx.cqumvgiudr(view) == 0) {
                jhduphickx.uawqvzlxes(view, 1);
            }
        }
        if (this.f22194rlfsiqarku == null) {
            this.f22194rlfsiqarku = b2.ppxfxbqfkf.agtfadlqog(coordinatorLayout, this.f22173iwxlajgraz);
        }
        int top = view.getTop();
        coordinatorLayout.ylkuphrtab(view, i13);
        this.f22216zfvoamnweg = coordinatorLayout.getWidth();
        this.f22188oipsdeybqn = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f22196sflfametgt = height;
        int iMin = this.f22188oipsdeybqn;
        int i14 = iMin - height;
        int i15 = this.f22198stevsuqkhv;
        if (i14 < i15) {
            if (this.f22177jpowsppfya) {
                int i16 = this.f22170iozdgvuglv;
                if (i16 != -1) {
                    iMin = Math.min(iMin, i16);
                }
                this.f22196sflfametgt = iMin;
            } else {
                int iMin2 = iMin - i15;
                int i17 = this.f22170iozdgvuglv;
                if (i17 != -1) {
                    iMin2 = Math.min(iMin2, i17);
                }
                this.f22196sflfametgt = iMin2;
            }
        }
        this.f22163crxdokpmqz = Math.max(0, this.f22188oipsdeybqn - this.f22196sflfametgt);
        xrmfcynszj();
        okpsazkaxt();
        int i18 = this.f22208xrmfcynszj;
        if (i18 == 3) {
            jhduphickx.ribwqtqdhb(view, lrnfpwlwnk());
        } else if (i18 == 6) {
            jhduphickx.ribwqtqdhb(view, this.f22176jlmebxxoox);
        } else if (this.f22169ikoacuggdj && i18 == 5) {
            jhduphickx.ribwqtqdhb(view, this.f22188oipsdeybqn);
        } else if (i18 == 4) {
            jhduphickx.ribwqtqdhb(view, this.f22204vipkmwdibw);
        } else if (i18 == 1 || i18 == 2) {
            jhduphickx.ribwqtqdhb(view, top - view.getTop());
        }
        n(this.f22208xrmfcynszj, false);
        this.f22174iyctptxqzt = new WeakReference(opjhrmiecq(view));
        for (int i19 = 0; i19 < this.f22205weqkydbzbr.size(); i19++) {
            ((lqeggnwhkg) this.f22205weqkydbzbr.get(i19)).iobyxmoadg(view);
        }
        return true;
    }

    public void rhgxfdycjh(int i13) {
        this.f22209yadqdtsiqt = i13;
    }

    public boolean skhdrjzrfn() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean vdvldrhtss(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15, int i16) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(weqkydbzbr(i13, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i14, this.f22209yadqdtsiqt, marginLayoutParams.width), weqkydbzbr(i15, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i16, this.f22170iozdgvuglv, marginLayoutParams.height));
        return true;
    }

    public void wizcaqwiak(lqeggnwhkg lqeggnwhkgVar) {
        this.f22205weqkydbzbr.remove(lqeggnwhkgVar);
    }

    @Override // na.zoijcleaow
    public void wkgbmnqykc() {
        na.gxszxtbevo gxszxtbevoVar = this.f22215zeieaojujs;
        if (gxszxtbevoVar == null) {
            return;
        }
        androidx.activity.zoijcleaow zoijcleaowVarPpxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf();
        if (zoijcleaowVarPpxfxbqfkf == null || Build.VERSION.SDK_INT < 34) {
            c(this.f22169ikoacuggdj ? 5 : 4);
        } else if (this.f22169ikoacuggdj) {
            this.f22215zeieaojujs.nufgyqmvbu(zoijcleaowVarPpxfxbqfkf, new zoijcleaow());
        } else {
            this.f22215zeieaojujs.dxjokdxxww(zoijcleaowVarPpxfxbqfkf, null);
            c(4);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean wwaezpbzkn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f22208xrmfcynszj == 1 && actionMasked == 0) {
            return true;
        }
        if (g()) {
            this.f22194rlfsiqarku.istkbnxepw(motionEvent);
        }
        if (actionMasked == 0) {
            fiwbwshyhd();
        }
        if (this.f22183lrnfpwlwnk == null) {
            this.f22183lrnfpwlwnk = VelocityTracker.obtain();
        }
        this.f22183lrnfpwlwnk.addMovement(motionEvent);
        if (g() && actionMasked == 2 && !this.f22164czzsidtyhn && Math.abs(this.f22199tbqsvytpvh - motionEvent.getY()) > this.f22194rlfsiqarku.iwizpuwonk()) {
            this.f22194rlfsiqarku.ppxfxbqfkf(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f22164czzsidtyhn;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean yadqdtsiqt(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
        this.f22203uwvvkdfqfp = 0;
        this.f22211yfnezrywwk = false;
        return (i13 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public void yggfygwlhe(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int[] iArr, int i15) {
        if (i15 == 1) {
            return;
        }
        WeakReference weakReference = this.f22174iyctptxqzt;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!lxfrhoxuzk() || view2 == view3) {
            int top = view.getTop();
            int i16 = top - i14;
            if (i14 > 0) {
                if (i16 < lrnfpwlwnk()) {
                    int iLrnfpwlwnk = top - lrnfpwlwnk();
                    iArr[1] = iLrnfpwlwnk;
                    jhduphickx.ribwqtqdhb(view, -iLrnfpwlwnk);
                    d(3);
                } else {
                    if (!this.f22179jztzpxfvev) {
                        return;
                    }
                    iArr[1] = i14;
                    jhduphickx.ribwqtqdhb(view, -i14);
                    d(1);
                }
            } else if (i14 < 0 && !view2.canScrollVertically(-1)) {
                if (i16 > this.f22204vipkmwdibw && !uwvvkdfqfp()) {
                    int i17 = top - this.f22204vipkmwdibw;
                    iArr[1] = i17;
                    jhduphickx.ribwqtqdhb(view, -i17);
                    d(4);
                } else {
                    if (!this.f22179jztzpxfvev) {
                        return;
                    }
                    iArr[1] = i14;
                    jhduphickx.ribwqtqdhb(view, -i14);
                    d(1);
                }
            }
            bfopjjpdmp(view.getTop());
            this.f22203uwvvkdfqfp = i14;
            this.f22211yfnezrywwk = true;
        }
    }

    public void yzdjzghtvl(int i13) {
        eslsurpljm(i13, false);
    }

    ra.lqeggnwhkg zeieaojujs() {
        return this.f22171istkbnxepw;
    }

    @Override // na.zoijcleaow
    public void zoijcleaow(androidx.activity.zoijcleaow zoijcleaowVar) {
        na.gxszxtbevo gxszxtbevoVar = this.f22215zeieaojujs;
        if (gxszxtbevoVar == null) {
            return;
        }
        gxszxtbevoVar.btonecajqb(zoijcleaowVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public void zynmafqrjb(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.zynmafqrjb(coordinatorLayout, view, savedState.zoijcleaow());
        ageimvtcrz(savedState);
        int i13 = savedState.f22221jyumaefscl;
        if (i13 == 1 || i13 == 2) {
            this.f22208xrmfcynszj = 4;
            this.f22185metgxyhuhe = 4;
        } else {
            this.f22208xrmfcynszj = i13;
            this.f22185metgxyhuhe = i13;
        }
    }

    private class nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f22230iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Runnable f22231ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f22233zoijcleaow;

        class iobyxmoadg implements Runnable {
            iobyxmoadg() {
            }

            @Override // java.lang.Runnable
            public void run() {
                nufgyqmvbu.this.f22233zoijcleaow = false;
                b2.ppxfxbqfkf ppxfxbqfkfVar = BottomSheetBehavior.this.f22194rlfsiqarku;
                if (ppxfxbqfkfVar != null && ppxfxbqfkfVar.draadjrbmk(true)) {
                    nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
                    nufgyqmvbuVar.ppxfxbqfkf(nufgyqmvbuVar.f22230iobyxmoadg);
                    return;
                }
                nufgyqmvbu nufgyqmvbuVar2 = nufgyqmvbu.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f22208xrmfcynszj == 2) {
                    bottomSheetBehavior.d(nufgyqmvbuVar2.f22230iobyxmoadg);
                }
            }
        }

        private nufgyqmvbu() {
            this.f22231ppxfxbqfkf = new iobyxmoadg();
        }

        void ppxfxbqfkf(int i13) {
            WeakReference weakReference = BottomSheetBehavior.this.f22159bfopjjpdmp;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f22230iobyxmoadg = i13;
            if (this.f22233zoijcleaow) {
                return;
            }
            jhduphickx.metgxyhuhe((View) BottomSheetBehavior.this.f22159bfopjjpdmp.get(), this.f22231ppxfxbqfkf);
            this.f22233zoijcleaow = true;
        }

        /* synthetic */ nufgyqmvbu(BottomSheetBehavior bottomSheetBehavior, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        boolean f22218cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        boolean f22219esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f22220iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final int f22221jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        boolean f22222lereixgezr;

        class iobyxmoadg implements Parcelable.ClassLoaderCreator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
            this.f22221jyumaefscl = parcel.readInt();
            this.f22220iwizpuwonk = parcel.readInt();
            this.f22218cqumvgiudr = parcel.readInt() == 1;
            this.f22219esjtqupxsv = parcel.readInt() == 1;
            this.f22222lereixgezr = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f22221jyumaefscl);
            parcel.writeInt(this.f22220iwizpuwonk);
            parcel.writeInt(this.f22218cqumvgiudr ? 1 : 0);
            parcel.writeInt(this.f22219esjtqupxsv ? 1 : 0);
            parcel.writeInt(this.f22222lereixgezr ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f22221jyumaefscl = bottomSheetBehavior.f22208xrmfcynszj;
            this.f22220iwizpuwonk = bottomSheetBehavior.f22166esjtqupxsv;
            this.f22218cqumvgiudr = bottomSheetBehavior.f22212yggfygwlhe;
            this.f22219esjtqupxsv = bottomSheetBehavior.f22169ikoacuggdj;
            this.f22222lereixgezr = bottomSheetBehavior.f22189okpsazkaxt;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i13;
        super(context, attributeSet);
        this.f22214zdlpuopuiu = 0;
        this.f22212yggfygwlhe = true;
        this.f22178jyumaefscl = false;
        this.f22209yadqdtsiqt = -1;
        this.f22170iozdgvuglv = -1;
        this.f22186ntlheqmsrt = new nufgyqmvbu(this, null);
        this.f22193ribwqtqdhb = 0.5f;
        this.f22175jhduphickx = -1.0f;
        this.f22179jztzpxfvev = true;
        this.f22208xrmfcynszj = 4;
        this.f22185metgxyhuhe = 4;
        this.f22210ydmasvzmpa = 0.1f;
        this.f22205weqkydbzbr = new ArrayList();
        this.f22199tbqsvytpvh = -1;
        this.f22158auzgnhcxok = new SparseIntArray();
        this.f22173iwxlajgraz = new eablkybsjg();
        this.f22217zynmafqrjb = context.getResources().getDimensionPixelSize(da.wkgbmnqykc.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, draadjrbmk.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(draadjrbmk.BottomSheetBehavior_Layout_backgroundTint)) {
            this.f22160cdpycssgdh = oa.ppxfxbqfkf.iobyxmoadg(context, typedArrayObtainStyledAttributes, draadjrbmk.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(draadjrbmk.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f22200tzroggbefp = ra.gtknphoqwx.eablkybsjg(context, attributeSet, da.zoijcleaow.bottomSheetStyle, f22157dvvnrvtcbc).wflxmlrfwp();
        }
        sflfametgt(context);
        zfvoamnweg();
        this.f22175jhduphickx = typedArrayObtainStyledAttributes.getDimension(draadjrbmk.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(draadjrbmk.BottomSheetBehavior_Layout_android_maxWidth)) {
            rhgxfdycjh(typedArrayObtainStyledAttributes.getDimensionPixelSize(draadjrbmk.BottomSheetBehavior_Layout_android_maxWidth, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(draadjrbmk.BottomSheetBehavior_Layout_android_maxHeight)) {
            ezmngbhpjk(typedArrayObtainStyledAttributes.getDimensionPixelSize(draadjrbmk.BottomSheetBehavior_Layout_android_maxHeight, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(draadjrbmk.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i13 = typedValuePeekValue.data) == -1) {
            yzdjzghtvl(i13);
        } else {
            yzdjzghtvl(typedArrayObtainStyledAttributes.getDimensionPixelSize(draadjrbmk.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        fmlbqenlif(typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.BottomSheetBehavior_Layout_behavior_hideable, false));
        ixidwrxhsl(typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        mhtqkkgtqm(typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        b(typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        ipoelvxyzq(typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.BottomSheetBehavior_Layout_behavior_draggable, true));
        krqnebusok(typedArrayObtainStyledAttributes.getInt(draadjrbmk.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        jrbgnlbqoe(typedArrayObtainStyledAttributes.getFloat(draadjrbmk.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(draadjrbmk.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            grlcpdaxtj(typedValuePeekValue2.data);
        } else {
            grlcpdaxtj(typedArrayObtainStyledAttributes.getDimensionPixelOffset(draadjrbmk.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        a(typedArrayObtainStyledAttributes.getInt(draadjrbmk.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.f22213ylkuphrtab = typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f22191pkzmftpjix = typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f22167hcddaimhww = typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f22177jpowsppfya = typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f22168hkdspvbjdz = typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f22161cllcsxoeiz = typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f22165dsvhmnatus = typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.f22180kegysxyocb = typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f22172iwizpuwonk = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
