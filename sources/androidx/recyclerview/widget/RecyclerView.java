package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import modern.payments.ecomAndroid.util.analytics.EcomMetricKey;
import v1.jhduphickx;
import v1.jztzpxfvev;

/* JADX INFO: loaded from: classes2.dex */
public class RecyclerView extends ViewGroup implements v1.yadqdtsiqt {

    /* JADX INFO: renamed from: eslsurpljm, reason: collision with root package name */
    static boolean f12642eslsurpljm = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Class[] f12645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Interpolator f12646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final istkbnxepw f12647j;

    /* JADX INFO: renamed from: yzdjzghtvl, reason: collision with root package name */
    static boolean f12649yzdjzghtvl = false;

    /* JADX INFO: renamed from: ageimvtcrz, reason: collision with root package name */
    private v1.iozdgvuglv f12650ageimvtcrz;

    /* JADX INFO: renamed from: auzgnhcxok, reason: collision with root package name */
    private yggfygwlhe f12651auzgnhcxok;

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private kcexrzcfyt f12652bfopjjpdmp;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Rect f12653cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    boolean f12654cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    androidx.recyclerview.widget.iobyxmoadg f12655cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    boolean f12656crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private int f12657czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    boolean f12658dsvhmnatus;

    /* JADX INFO: renamed from: dvvnrvtcbc, reason: collision with root package name */
    boolean f12659dvvnrvtcbc;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    androidx.recyclerview.widget.gxszxtbevo f12660esjtqupxsv;

    /* JADX INFO: renamed from: ezmngbhpjk, reason: collision with root package name */
    private int f12661ezmngbhpjk;

    /* JADX INFO: renamed from: fiwbwshyhd, reason: collision with root package name */
    private final int[] f12662fiwbwshyhd;

    /* JADX INFO: renamed from: fmlbqenlif, reason: collision with root package name */
    private int f12663fmlbqenlif;

    /* JADX INFO: renamed from: fyldjkxazc, reason: collision with root package name */
    private final int[] f12664fyldjkxazc;

    /* JADX INFO: renamed from: grlcpdaxtj, reason: collision with root package name */
    final int[] f12665grlcpdaxtj;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private zdlpuopuiu f12666hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    boolean f12667hkdspvbjdz;

    /* JADX INFO: renamed from: hszhottldk, reason: collision with root package name */
    private gtknphoqwx f12668hszhottldk;

    /* JADX INFO: renamed from: igdgnonuha, reason: collision with root package name */
    private wflxmlrfwp.zoijcleaow f12669igdgnonuha;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private EdgeEffect f12670ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    nufgyqmvbu f12671iozdgvuglv;

    /* JADX INFO: renamed from: ipoelvxyzq, reason: collision with root package name */
    private final int[] f12672ipoelvxyzq;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    final Rect f12673istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    SavedState f12674iwizpuwonk;

    /* JADX INFO: renamed from: iwxlajgraz, reason: collision with root package name */
    private List f12675iwxlajgraz;

    /* JADX INFO: renamed from: ixidwrxhsl, reason: collision with root package name */
    private Runnable f12676ixidwrxhsl;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private final int f12677iyctptxqzt;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private draadjrbmk f12678jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    boolean f12679jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    boolean f12680jpowsppfya;

    /* JADX INFO: renamed from: jrbgnlbqoe, reason: collision with root package name */
    private boolean f12681jrbgnlbqoe;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final iwizpuwonk f12682jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private EdgeEffect f12683jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    boolean f12684kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    final androidx.recyclerview.widget.zynmafqrjb f12685lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    rgvfuqvkyq f12686lmojexxdyd;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    private float f12687lrnfpwlwnk;

    /* JADX INFO: renamed from: lxfrhoxuzk, reason: collision with root package name */
    boolean f12688lxfrhoxuzk;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private int f12689mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    wflxmlrfwp f12690metgxyhuhe;

    /* JADX INFO: renamed from: mhtqkkgtqm, reason: collision with root package name */
    final List f12691mhtqkkgtqm;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    boolean f12692ntlheqmsrt;

    /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name */
    final yadqdtsiqt f12693nuxfzjnpeb;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private int f12694oipsdeybqn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private EdgeEffect f12695okpsazkaxt;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private final int f12696opjhrmiecq;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final ArrayList f12697pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    boolean f12698pmvmpeiblj;

    /* JADX INFO: renamed from: rhgxfdycjh, reason: collision with root package name */
    private final androidx.recyclerview.widget.zynmafqrjb.zoijcleaow f12699rhgxfdycjh;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private int f12700ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private int f12701rlfsiqarku;

    /* JADX INFO: renamed from: roivzttewh, reason: collision with root package name */
    androidx.recyclerview.widget.gtknphoqwx.zoijcleaow f12702roivzttewh;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private int f12703sflfametgt;

    /* JADX INFO: renamed from: skhdrjzrfn, reason: collision with root package name */
    boolean f12704skhdrjzrfn;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private List f12705sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    boolean f12706stevsuqkhv;

    /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name */
    androidx.recyclerview.widget.gtknphoqwx f12707tbqsvytpvh;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private boolean f12708tzroggbefp;

    /* JADX INFO: renamed from: uawqvzlxes, reason: collision with root package name */
    final zynmafqrjb f12709uawqvzlxes;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private final AccessibilityManager f12710ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private VelocityTracker f12711uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private int f12712vipkmwdibw;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    private float f12713weqkydbzbr;

    /* JADX INFO: renamed from: wizcaqwiak, reason: collision with root package name */
    androidx.recyclerview.widget.iwizpuwonk f12714wizcaqwiak;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    final List f12715wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private int f12716wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private EdgeEffect f12717xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    final RectF f12718yadqdtsiqt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private int f12719ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private int f12720yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final esjtqupxsv f12721yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    final ArrayList f12722ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final float f12723zdlpuopuiu;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    private boolean f12724zeieaojujs;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private int f12725zfvoamnweg;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    final Runnable f12726zynmafqrjb;

    /* JADX INFO: renamed from: krqnebusok, reason: collision with root package name */
    private static final int[] f12648krqnebusok = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f12637a = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final boolean f12638b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final boolean f12639c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f12640d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final boolean f12641e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f12643f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f12644g = false;

    private class agtfadlqog implements wflxmlrfwp.zoijcleaow {
        agtfadlqog() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.wflxmlrfwp.zoijcleaow
        public void iobyxmoadg(iozdgvuglv iozdgvuglvVar) {
            iozdgvuglvVar.setIsRecyclable(true);
            if (iozdgvuglvVar.mShadowedHolder != null && iozdgvuglvVar.mShadowingHolder == null) {
                iozdgvuglvVar.mShadowedHolder = null;
            }
            iozdgvuglvVar.mShadowingHolder = null;
            if (iozdgvuglvVar.shouldBeKeptAsChild() || RecyclerView.this.n(iozdgvuglvVar.itemView) || !iozdgvuglvVar.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(iozdgvuglvVar.itemView, false);
        }
    }

    public static abstract class btonecajqb {
        public abstract void eablkybsjg(int i13, int i14);

        public void gxszxtbevo() {
        }

        public abstract void iobyxmoadg();

        public abstract void ppxfxbqfkf(int i13, int i14);

        public abstract void wkgbmnqykc(int i13, int i14, int i15);

        public abstract void zoijcleaow(int i13, int i14, Object obj);
    }

    public static abstract class cdpycssgdh {
    }

    public interface cqumvgiudr {
    }

    public static class draadjrbmk {
        protected abstract EdgeEffect iobyxmoadg(RecyclerView recyclerView, int i13);
    }

    static class dxjokdxxww extends Observable {
        dxjokdxxww() {
        }

        public void eablkybsjg(int i13, int i14, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((btonecajqb) ((Observable) this).mObservers.get(size)).zoijcleaow(i13, i14, obj);
            }
        }

        public void gxszxtbevo(int i13, int i14) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((btonecajqb) ((Observable) this).mObservers.get(size)).ppxfxbqfkf(i13, i14);
            }
        }

        public boolean iobyxmoadg() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void lqeggnwhkg(int i13, int i14) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((btonecajqb) ((Observable) this).mObservers.get(size)).eablkybsjg(i13, i14);
            }
        }

        public void nufgyqmvbu() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((btonecajqb) ((Observable) this).mObservers.get(size)).gxszxtbevo();
            }
        }

        public void ppxfxbqfkf(int i13, int i14) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((btonecajqb) ((Observable) this).mObservers.get(size)).wkgbmnqykc(i13, i14, 1);
            }
        }

        public void wkgbmnqykc(int i13, int i14) {
            eablkybsjg(i13, i14, null);
        }

        public void zoijcleaow() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((btonecajqb) ((Observable) this).mObservers.get(size)).iobyxmoadg();
            }
        }
    }

    class eablkybsjg implements androidx.recyclerview.widget.gxszxtbevo.zoijcleaow {
        eablkybsjg() {
        }

        @Override // androidx.recyclerview.widget.gxszxtbevo.zoijcleaow
        public void btonecajqb(int i13) {
            View childAt = RecyclerView.this.getChildAt(i13);
            if (childAt != null) {
                RecyclerView.this.iozdgvuglv(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i13);
        }

        @Override // androidx.recyclerview.widget.gxszxtbevo.zoijcleaow
        public void dxjokdxxww(View view) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(view);
            if (iozdgvuglvVarZfvoamnweg != null) {
                iozdgvuglvVarZfvoamnweg.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.gxszxtbevo.zoijcleaow
        public void eablkybsjg(int i13) {
            View viewIobyxmoadg = iobyxmoadg(i13);
            if (viewIobyxmoadg != null) {
                iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(viewIobyxmoadg);
                if (iozdgvuglvVarZfvoamnweg != null) {
                    if (iozdgvuglvVarZfvoamnweg.isTmpDetached() && !iozdgvuglvVarZfvoamnweg.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + iozdgvuglvVarZfvoamnweg + RecyclerView.this.ulzqkzuiru());
                    }
                    if (RecyclerView.f12642eslsurpljm) {
                        Log.d("RecyclerView", "tmpDetach " + iozdgvuglvVarZfvoamnweg);
                    }
                    iozdgvuglvVarZfvoamnweg.addFlags(UserVerificationMethods.USER_VERIFY_HANDPRINT);
                }
            } else if (RecyclerView.f12649yzdjzghtvl) {
                throw new IllegalArgumentException("No view at offset " + i13 + RecyclerView.this.ulzqkzuiru());
            }
            RecyclerView.this.detachViewFromParent(i13);
        }

        @Override // androidx.recyclerview.widget.gxszxtbevo.zoijcleaow
        public void gtknphoqwx(View view, int i13, ViewGroup.LayoutParams layoutParams) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(view);
            if (iozdgvuglvVarZfvoamnweg != null) {
                if (!iozdgvuglvVarZfvoamnweg.isTmpDetached() && !iozdgvuglvVarZfvoamnweg.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + iozdgvuglvVarZfvoamnweg + RecyclerView.this.ulzqkzuiru());
                }
                if (RecyclerView.f12642eslsurpljm) {
                    Log.d("RecyclerView", "reAttach " + iozdgvuglvVarZfvoamnweg);
                }
                iozdgvuglvVarZfvoamnweg.clearTmpDetachFlag();
            } else if (RecyclerView.f12649yzdjzghtvl) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i13 + RecyclerView.this.ulzqkzuiru());
            }
            RecyclerView.this.attachViewToParent(view, i13, layoutParams);
        }

        @Override // androidx.recyclerview.widget.gxszxtbevo.zoijcleaow
        public void gxszxtbevo(View view, int i13) {
            RecyclerView.this.addView(view, i13);
            RecyclerView.this.yadqdtsiqt(view);
        }

        @Override // androidx.recyclerview.widget.gxszxtbevo.zoijcleaow
        public View iobyxmoadg(int i13) {
            return RecyclerView.this.getChildAt(i13);
        }

        @Override // androidx.recyclerview.widget.gxszxtbevo.zoijcleaow
        public void lqeggnwhkg() {
            int iPpxfxbqfkf = ppxfxbqfkf();
            for (int i13 = 0; i13 < iPpxfxbqfkf; i13++) {
                View viewIobyxmoadg = iobyxmoadg(i13);
                RecyclerView.this.iozdgvuglv(viewIobyxmoadg);
                viewIobyxmoadg.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.gxszxtbevo.zoijcleaow
        public int nufgyqmvbu(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.gxszxtbevo.zoijcleaow
        public int ppxfxbqfkf() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.gxszxtbevo.zoijcleaow
        public iozdgvuglv wkgbmnqykc(View view) {
            return RecyclerView.zfvoamnweg(view);
        }

        @Override // androidx.recyclerview.widget.gxszxtbevo.zoijcleaow
        public void zoijcleaow(View view) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(view);
            if (iozdgvuglvVarZfvoamnweg != null) {
                iozdgvuglvVarZfvoamnweg.onEnteredHiddenState(RecyclerView.this);
            }
        }
    }

    private class esjtqupxsv extends btonecajqb {
        esjtqupxsv() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public void eablkybsjg(int i13, int i14) {
            RecyclerView.this.oxmwwwfdhm(null);
            if (RecyclerView.this.f12655cqumvgiudr.yggfygwlhe(i13, i14)) {
                lqeggnwhkg();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public void gxszxtbevo() {
            nufgyqmvbu nufgyqmvbuVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f12674iwizpuwonk == null || (nufgyqmvbuVar = recyclerView.f12671iozdgvuglv) == null || !nufgyqmvbuVar.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public void iobyxmoadg() {
            RecyclerView.this.oxmwwwfdhm(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f12709uawqvzlxes.f12815lqeggnwhkg = true;
            recyclerView.f(true);
            if (RecyclerView.this.f12655cqumvgiudr.rgvfuqvkyq()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        void lqeggnwhkg() {
            if (RecyclerView.f12640d) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f12667hkdspvbjdz && recyclerView.f12680jpowsppfya) {
                    jhduphickx.metgxyhuhe(recyclerView, recyclerView.f12726zynmafqrjb);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f12692ntlheqmsrt = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public void ppxfxbqfkf(int i13, int i14) {
            RecyclerView.this.oxmwwwfdhm(null);
            if (RecyclerView.this.f12655cqumvgiudr.kcexrzcfyt(i13, i14)) {
                lqeggnwhkg();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public void wkgbmnqykc(int i13, int i14, int i15) {
            RecyclerView.this.oxmwwwfdhm(null);
            if (RecyclerView.this.f12655cqumvgiudr.zdlpuopuiu(i13, i14, i15)) {
                lqeggnwhkg();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public void zoijcleaow(int i13, int i14, Object obj) {
            RecyclerView.this.oxmwwwfdhm(null);
            if (RecyclerView.this.f12655cqumvgiudr.oxmwwwfdhm(i13, i14, obj)) {
                lqeggnwhkg();
            }
        }
    }

    public interface gtknphoqwx {
        int iobyxmoadg(int i13, int i14);
    }

    class gxszxtbevo implements androidx.recyclerview.widget.iobyxmoadg.InterfaceC0181iobyxmoadg {
        gxszxtbevo() {
        }

        void dxjokdxxww(androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVar) {
            int i13 = zoijcleaowVar.f13017iobyxmoadg;
            if (i13 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f12686lmojexxdyd.j(recyclerView, zoijcleaowVar.f13020zoijcleaow, zoijcleaowVar.f13019wkgbmnqykc);
                return;
            }
            if (i13 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f12686lmojexxdyd.m(recyclerView2, zoijcleaowVar.f13020zoijcleaow, zoijcleaowVar.f13019wkgbmnqykc);
            } else if (i13 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f12686lmojexxdyd.o(recyclerView3, zoijcleaowVar.f13020zoijcleaow, zoijcleaowVar.f13019wkgbmnqykc, zoijcleaowVar.f13018ppxfxbqfkf);
            } else {
                if (i13 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f12686lmojexxdyd.l(recyclerView4, zoijcleaowVar.f13020zoijcleaow, zoijcleaowVar.f13019wkgbmnqykc, 1);
            }
        }

        @Override // androidx.recyclerview.widget.iobyxmoadg.InterfaceC0181iobyxmoadg
        public void eablkybsjg(int i13, int i14, Object obj) {
            RecyclerView.this.R(i13, i14, obj);
            RecyclerView.this.f12704skhdrjzrfn = true;
        }

        @Override // androidx.recyclerview.widget.iobyxmoadg.InterfaceC0181iobyxmoadg
        public iozdgvuglv gxszxtbevo(int i13) {
            iozdgvuglv iozdgvuglvVarMetgxyhuhe = RecyclerView.this.metgxyhuhe(i13, true);
            if (iozdgvuglvVarMetgxyhuhe == null) {
                return null;
            }
            if (!RecyclerView.this.f12660esjtqupxsv.agtfadlqog(iozdgvuglvVarMetgxyhuhe.itemView)) {
                return iozdgvuglvVarMetgxyhuhe;
            }
            if (RecyclerView.f12642eslsurpljm) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.iobyxmoadg.InterfaceC0181iobyxmoadg
        public void iobyxmoadg(int i13, int i14) {
            RecyclerView.this.ixidwrxhsl(i13, i14);
            RecyclerView.this.f12659dvvnrvtcbc = true;
        }

        @Override // androidx.recyclerview.widget.iobyxmoadg.InterfaceC0181iobyxmoadg
        public void lqeggnwhkg(int i13, int i14) {
            RecyclerView.this.mhtqkkgtqm(i13, i14);
            RecyclerView.this.f12659dvvnrvtcbc = true;
        }

        @Override // androidx.recyclerview.widget.iobyxmoadg.InterfaceC0181iobyxmoadg
        public void nufgyqmvbu(int i13, int i14) {
            RecyclerView.this.jrbgnlbqoe(i13, i14, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f12659dvvnrvtcbc = true;
            recyclerView.f12709uawqvzlxes.f12822wkgbmnqykc += i14;
        }

        @Override // androidx.recyclerview.widget.iobyxmoadg.InterfaceC0181iobyxmoadg
        public void ppxfxbqfkf(androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVar) {
            dxjokdxxww(zoijcleaowVar);
        }

        @Override // androidx.recyclerview.widget.iobyxmoadg.InterfaceC0181iobyxmoadg
        public void wkgbmnqykc(int i13, int i14) {
            RecyclerView.this.jrbgnlbqoe(i13, i14, false);
            RecyclerView.this.f12659dvvnrvtcbc = true;
        }

        @Override // androidx.recyclerview.widget.iobyxmoadg.InterfaceC0181iobyxmoadg
        public void zoijcleaow(androidx.recyclerview.widget.iobyxmoadg.zoijcleaow zoijcleaowVar) {
            dxjokdxxww(zoijcleaowVar);
        }
    }

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f12658dsvhmnatus || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f12680jpowsppfya) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f12684kegysxyocb) {
                recyclerView2.f12706stevsuqkhv = true;
            } else {
                recyclerView2.pmvmpeiblj();
            }
        }
    }

    public static abstract class iozdgvuglv {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        nufgyqmvbu mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        iozdgvuglv mShadowedHolder = null;
        iozdgvuglv mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        iwizpuwonk mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public iozdgvuglv(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void iobyxmoadg() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                iobyxmoadg();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i13) {
            this.mFlags = i13 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && jhduphickx.wypolnanlu(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i13, int i14, boolean z13) {
            addFlags(8);
            offsetPosition(i14, z13);
            this.mPosition = i13;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.czzsidtyhn(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final nufgyqmvbu getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            nufgyqmvbu adapter;
            int iCzzsidtyhn;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iCzzsidtyhn = this.mOwnerRecyclerView.czzsidtyhn(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iCzzsidtyhn);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i13 = this.mPreLayoutPosition;
            return i13 == -1 ? this.mPosition : i13;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i13 = this.mPreLayoutPosition;
            return i13 == -1 ? this.mPosition : i13;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i13) {
            return (i13 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !jhduphickx.wypolnanlu(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i13, boolean z13) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z13) {
                this.mPreLayoutPosition += i13;
            }
            this.mPosition += i13;
            if (this.itemView.getLayoutParams() != null) {
                ((vdvldrhtss) this.itemView.getLayoutParams()).f12785jyumaefscl = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i13 = this.mPendingAccessibilityState;
            if (i13 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i13;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = jhduphickx.cqumvgiudr(this.itemView);
            }
            recyclerView.C(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.C(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            if (RecyclerView.f12649yzdjzghtvl && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.yggfygwlhe(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i13, int i14) {
            this.mFlags = (i13 & i14) | (this.mFlags & (~i14));
        }

        public final void setIsRecyclable(boolean z13) {
            int i13 = this.mIsRecyclableCount;
            int i14 = z13 ? i13 - 1 : i13 + 1;
            this.mIsRecyclableCount = i14;
            if (i14 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.f12649yzdjzghtvl) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e(EcomMetricKey.VIEW, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z13 && i14 == 1) {
                this.mFlags |= 16;
            } else if (z13 && i14 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.f12642eslsurpljm) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z13 + StringUtils.PROCESS_POSTFIX_DELIMITER + this);
            }
        }

        void setScrapContainer(iwizpuwonk iwizpuwonkVar, boolean z13) {
            this.mScrapContainer = iwizpuwonkVar;
            this.mInChangeScrap = z13;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb3.append(" scrap ");
                sb3.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb3.append(" invalid");
            }
            if (!isBound()) {
                sb3.append(" unbound");
            }
            if (needsUpdate()) {
                sb3.append(" update");
            }
            if (isRemoved()) {
                sb3.append(" removed");
            }
            if (shouldIgnore()) {
                sb3.append(" ignored");
            }
            if (isTmpDetached()) {
                sb3.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb3.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb3.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb3.append(" no parent");
            }
            sb3.append("}");
            return sb3.toString();
        }

        void unScrap() {
            this.mScrapContainer.dsvhmnatus(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    static class istkbnxepw extends draadjrbmk {
        istkbnxepw() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.draadjrbmk
        protected EdgeEffect iobyxmoadg(RecyclerView recyclerView, int i13) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public final class iwizpuwonk {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f12733eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        int f12734gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final ArrayList f12735iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        jyumaefscl f12736lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final ArrayList f12738ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f12739wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        ArrayList f12740zoijcleaow;

        public iwizpuwonk() {
            ArrayList arrayList = new ArrayList();
            this.f12735iobyxmoadg = arrayList;
            this.f12740zoijcleaow = null;
            this.f12738ppxfxbqfkf = new ArrayList();
            this.f12739wkgbmnqykc = Collections.unmodifiableList(arrayList);
            this.f12733eablkybsjg = 2;
            this.f12734gxszxtbevo = 2;
        }

        private boolean hkdspvbjdz(iozdgvuglv iozdgvuglvVar, int i13, int i14, long j13) {
            iozdgvuglvVar.mBindingAdapter = null;
            iozdgvuglvVar.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = iozdgvuglvVar.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z13 = false;
            if (j13 != Long.MAX_VALUE && !this.f12736lqeggnwhkg.wflxmlrfwp(itemViewType, nanoTime, j13)) {
                return false;
            }
            if (iozdgvuglvVar.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(iozdgvuglvVar.itemView, recyclerView.getChildCount(), iozdgvuglvVar.itemView.getLayoutParams());
                z13 = true;
            }
            RecyclerView.this.f12671iozdgvuglv.bindViewHolder(iozdgvuglvVar, i13);
            if (z13) {
                RecyclerView.this.detachViewFromParent(iozdgvuglvVar.itemView);
            }
            this.f12736lqeggnwhkg.gxszxtbevo(iozdgvuglvVar.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            zoijcleaow(iozdgvuglvVar);
            if (RecyclerView.this.f12709uawqvzlxes.eablkybsjg()) {
                iozdgvuglvVar.mPreLayoutPosition = i14;
            }
            return true;
        }

        private void istkbnxepw(nufgyqmvbu nufgyqmvbuVar, boolean z13) {
            jyumaefscl jyumaefsclVar = this.f12736lqeggnwhkg;
            if (jyumaefsclVar != null) {
                jyumaefsclVar.eablkybsjg(nufgyqmvbuVar, z13);
            }
        }

        private void oxmwwwfdhm(iozdgvuglv iozdgvuglvVar) {
            View view = iozdgvuglvVar.itemView;
            if (view instanceof ViewGroup) {
                vdvldrhtss((ViewGroup) view, false);
            }
        }

        private void vdvldrhtss(ViewGroup viewGroup, boolean z13) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    vdvldrhtss((ViewGroup) childAt, true);
                }
            }
            if (z13) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void yggfygwlhe() {
            if (this.f12736lqeggnwhkg != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f12671iozdgvuglv == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f12736lqeggnwhkg.zoijcleaow(RecyclerView.this.f12671iozdgvuglv);
            }
        }

        private void zoijcleaow(iozdgvuglv iozdgvuglvVar) {
            if (RecyclerView.this.igdgnonuha()) {
                View view = iozdgvuglvVar.itemView;
                if (jhduphickx.cqumvgiudr(view) == 0) {
                    jhduphickx.uawqvzlxes(view, 1);
                }
                androidx.recyclerview.widget.iwizpuwonk iwizpuwonkVar = RecyclerView.this.f12714wizcaqwiak;
                if (iwizpuwonkVar == null) {
                    return;
                }
                v1.iobyxmoadg iobyxmoadgVarAgtfadlqog = iwizpuwonkVar.agtfadlqog();
                if (iobyxmoadgVarAgtfadlqog instanceof androidx.recyclerview.widget.iwizpuwonk.iobyxmoadg) {
                    ((androidx.recyclerview.widget.iwizpuwonk.iobyxmoadg) iobyxmoadgVarAgtfadlqog).ojitshcjhn(view);
                }
                jhduphickx.oipsdeybqn(view, iobyxmoadgVarAgtfadlqog);
            }
        }

        private void zynmafqrjb(nufgyqmvbu nufgyqmvbuVar) {
            istkbnxepw(nufgyqmvbuVar, false);
        }

        View agtfadlqog(int i13) {
            return ((iozdgvuglv) this.f12735iobyxmoadg.get(i13)).itemView;
        }

        int btonecajqb() {
            return this.f12735iobyxmoadg.size();
        }

        void cdpycssgdh(View view) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(view);
            iozdgvuglvVarZfvoamnweg.mScrapContainer = null;
            iozdgvuglvVarZfvoamnweg.mInChangeScrap = false;
            iozdgvuglvVarZfvoamnweg.clearReturnedFromScrapFlag();
            wwaezpbzkn(iozdgvuglvVarZfvoamnweg);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0220  */
        /* JADX WARN: Code duplicated, block: B:103:0x0226 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:105:0x0229  */
        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:72:0x0175  */
        /* JADX WARN: Code duplicated, block: B:78:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:80:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:88:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:96:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:97:0x020a  */
        /* JADX WARN: Code duplicated, block: B:99:0x0212  */
        iozdgvuglv cllcsxoeiz(int i13, boolean z13, long j13) {
            iozdgvuglv iozdgvuglvVarCreateViewHolder;
            boolean z14;
            iozdgvuglv iozdgvuglvVar;
            boolean z15;
            boolean zHkdspvbjdz;
            ViewGroup.LayoutParams layoutParams;
            vdvldrhtss vdvldrhtssVar;
            int iWflxmlrfwp;
            RecyclerView recyclerViewIkoacuggdj;
            if (i13 < 0 || i13 >= RecyclerView.this.f12709uawqvzlxes.zoijcleaow()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i13 + "(" + i13 + "). Item count:" + RecyclerView.this.f12709uawqvzlxes.zoijcleaow() + RecyclerView.this.ulzqkzuiru());
            }
            if (RecyclerView.this.f12709uawqvzlxes.eablkybsjg()) {
                iozdgvuglvVarCreateViewHolder = nufgyqmvbu(i13);
                if (iozdgvuglvVarCreateViewHolder != null) {
                    z14 = true;
                }
                if (iozdgvuglvVarCreateViewHolder == null && (iozdgvuglvVarCreateViewHolder = wflxmlrfwp(i13, z13)) != null) {
                    if (stevsuqkhv(iozdgvuglvVarCreateViewHolder)) {
                        z14 = true;
                    } else {
                        if (!z13) {
                            iozdgvuglvVarCreateViewHolder.addFlags(4);
                            if (iozdgvuglvVarCreateViewHolder.isScrap()) {
                                RecyclerView.this.removeDetachedView(iozdgvuglvVarCreateViewHolder.itemView, false);
                                iozdgvuglvVarCreateViewHolder.unScrap();
                            } else if (iozdgvuglvVarCreateViewHolder.wasReturnedFromScrap()) {
                                iozdgvuglvVarCreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            wwaezpbzkn(iozdgvuglvVarCreateViewHolder);
                        }
                        iozdgvuglvVarCreateViewHolder = null;
                    }
                }
                if (iozdgvuglvVarCreateViewHolder == null) {
                    iWflxmlrfwp = RecyclerView.this.f12655cqumvgiudr.wflxmlrfwp(i13);
                    if (iWflxmlrfwp >= 0 || iWflxmlrfwp >= RecyclerView.this.f12671iozdgvuglv.getItemCount()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i13 + "(offset:" + iWflxmlrfwp + ").state:" + RecyclerView.this.f12709uawqvzlxes.zoijcleaow() + RecyclerView.this.ulzqkzuiru());
                    }
                    int itemViewType = RecyclerView.this.f12671iozdgvuglv.getItemViewType(iWflxmlrfwp);
                    if (RecyclerView.this.f12671iozdgvuglv.hasStableIds() && (iozdgvuglvVarCreateViewHolder = draadjrbmk(RecyclerView.this.f12671iozdgvuglv.getItemId(iWflxmlrfwp), itemViewType, z13)) != null) {
                        iozdgvuglvVarCreateViewHolder.mPosition = iWflxmlrfwp;
                        z14 = true;
                    }
                    if (iozdgvuglvVarCreateViewHolder == null) {
                        if (RecyclerView.f12642eslsurpljm) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i13 + ") fetching from shared pool");
                        }
                        iozdgvuglvVarCreateViewHolder = dxjokdxxww().nufgyqmvbu(itemViewType);
                        if (iozdgvuglvVarCreateViewHolder != null) {
                            iozdgvuglvVarCreateViewHolder.resetInternal();
                            if (RecyclerView.f12638b) {
                                oxmwwwfdhm(iozdgvuglvVarCreateViewHolder);
                            }
                        }
                    }
                    if (iozdgvuglvVarCreateViewHolder == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j13 != Long.MAX_VALUE && !this.f12736lqeggnwhkg.agtfadlqog(itemViewType, nanoTime, j13)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        iozdgvuglvVarCreateViewHolder = recyclerView.f12671iozdgvuglv.createViewHolder(recyclerView, itemViewType);
                        if (RecyclerView.f12641e && (recyclerViewIkoacuggdj = RecyclerView.ikoacuggdj(iozdgvuglvVarCreateViewHolder.itemView)) != null) {
                            iozdgvuglvVarCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewIkoacuggdj);
                        }
                        this.f12736lqeggnwhkg.lqeggnwhkg(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                        if (RecyclerView.f12642eslsurpljm) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    }
                }
                iozdgvuglvVar = iozdgvuglvVarCreateViewHolder;
                z15 = z14;
                if (z15 && !RecyclerView.this.f12709uawqvzlxes.eablkybsjg() && iozdgvuglvVar.hasAnyOfTheFlags(8192)) {
                    iozdgvuglvVar.setFlags(0, 8192);
                    if (RecyclerView.this.f12709uawqvzlxes.f12812gtknphoqwx) {
                        int iEablkybsjg = wflxmlrfwp.eablkybsjg(iozdgvuglvVar) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.h(iozdgvuglvVar, recyclerView2.f12690metgxyhuhe.yggfygwlhe(recyclerView2.f12709uawqvzlxes, iozdgvuglvVar, iEablkybsjg, iozdgvuglvVar.getUnmodifiedPayloads()));
                    }
                }
                if (RecyclerView.this.f12709uawqvzlxes.eablkybsjg() || !iozdgvuglvVar.isBound()) {
                    if (iozdgvuglvVar.isBound() || iozdgvuglvVar.needsUpdate() || iozdgvuglvVar.isInvalid()) {
                        if (!RecyclerView.f12649yzdjzghtvl && iozdgvuglvVar.isRemoved()) {
                            throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + iozdgvuglvVar + RecyclerView.this.ulzqkzuiru());
                        }
                        zHkdspvbjdz = hkdspvbjdz(iozdgvuglvVar, RecyclerView.this.f12655cqumvgiudr.wflxmlrfwp(i13), i13, j13);
                    }
                    layoutParams = iozdgvuglvVar.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        vdvldrhtssVar = (vdvldrhtss) RecyclerView.this.generateDefaultLayoutParams();
                        iozdgvuglvVar.itemView.setLayoutParams(vdvldrhtssVar);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        vdvldrhtssVar = (vdvldrhtss) layoutParams;
                    } else {
                        vdvldrhtssVar = (vdvldrhtss) RecyclerView.this.generateLayoutParams(layoutParams);
                        iozdgvuglvVar.itemView.setLayoutParams(vdvldrhtssVar);
                    }
                    vdvldrhtssVar.f12787zdlpuopuiu = iozdgvuglvVar;
                    vdvldrhtssVar.f12784iwizpuwonk = !z15 && zHkdspvbjdz;
                    return iozdgvuglvVar;
                }
                iozdgvuglvVar.mPreLayoutPosition = i13;
                zHkdspvbjdz = false;
                layoutParams = iozdgvuglvVar.itemView.getLayoutParams();
                if (layoutParams == null) {
                    vdvldrhtssVar = (vdvldrhtss) RecyclerView.this.generateDefaultLayoutParams();
                    iozdgvuglvVar.itemView.setLayoutParams(vdvldrhtssVar);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    vdvldrhtssVar = (vdvldrhtss) RecyclerView.this.generateLayoutParams(layoutParams);
                    iozdgvuglvVar.itemView.setLayoutParams(vdvldrhtssVar);
                } else {
                    vdvldrhtssVar = (vdvldrhtss) layoutParams;
                }
                vdvldrhtssVar.f12787zdlpuopuiu = iozdgvuglvVar;
                vdvldrhtssVar.f12784iwizpuwonk = !z15 && zHkdspvbjdz;
                return iozdgvuglvVar;
            }
            iozdgvuglvVarCreateViewHolder = null;
            z14 = false;
            if (iozdgvuglvVarCreateViewHolder == null) {
                if (stevsuqkhv(iozdgvuglvVarCreateViewHolder)) {
                    if (!z13) {
                        iozdgvuglvVarCreateViewHolder.addFlags(4);
                        if (iozdgvuglvVarCreateViewHolder.isScrap()) {
                            RecyclerView.this.removeDetachedView(iozdgvuglvVarCreateViewHolder.itemView, false);
                            iozdgvuglvVarCreateViewHolder.unScrap();
                        } else if (iozdgvuglvVarCreateViewHolder.wasReturnedFromScrap()) {
                            iozdgvuglvVarCreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        wwaezpbzkn(iozdgvuglvVarCreateViewHolder);
                    }
                    iozdgvuglvVarCreateViewHolder = null;
                } else {
                    z14 = true;
                }
            }
            if (iozdgvuglvVarCreateViewHolder == null) {
                iWflxmlrfwp = RecyclerView.this.f12655cqumvgiudr.wflxmlrfwp(i13);
                if (iWflxmlrfwp >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i13 + "(offset:" + iWflxmlrfwp + ").state:" + RecyclerView.this.f12709uawqvzlxes.zoijcleaow() + RecyclerView.this.ulzqkzuiru());
            }
            iozdgvuglvVar = iozdgvuglvVarCreateViewHolder;
            z15 = z14;
            if (z15) {
                iozdgvuglvVar.setFlags(0, 8192);
                if (RecyclerView.this.f12709uawqvzlxes.f12812gtknphoqwx) {
                    int iEablkybsjg2 = wflxmlrfwp.eablkybsjg(iozdgvuglvVar) | 4096;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.h(iozdgvuglvVar, recyclerView3.f12690metgxyhuhe.yggfygwlhe(recyclerView3.f12709uawqvzlxes, iozdgvuglvVar, iEablkybsjg2, iozdgvuglvVar.getUnmodifiedPayloads()));
                }
            }
            if (RecyclerView.this.f12709uawqvzlxes.eablkybsjg()) {
                if (iozdgvuglvVar.isBound()) {
                }
                if (!RecyclerView.f12649yzdjzghtvl) {
                }
                zHkdspvbjdz = hkdspvbjdz(iozdgvuglvVar, RecyclerView.this.f12655cqumvgiudr.wflxmlrfwp(i13), i13, j13);
            } else {
                if (iozdgvuglvVar.isBound()) {
                }
                if (!RecyclerView.f12649yzdjzghtvl) {
                }
                zHkdspvbjdz = hkdspvbjdz(iozdgvuglvVar, RecyclerView.this.f12655cqumvgiudr.wflxmlrfwp(i13), i13, j13);
            }
            layoutParams = iozdgvuglvVar.itemView.getLayoutParams();
            if (layoutParams == null) {
                vdvldrhtssVar = (vdvldrhtss) RecyclerView.this.generateDefaultLayoutParams();
                iozdgvuglvVar.itemView.setLayoutParams(vdvldrhtssVar);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                vdvldrhtssVar = (vdvldrhtss) RecyclerView.this.generateLayoutParams(layoutParams);
                iozdgvuglvVar.itemView.setLayoutParams(vdvldrhtssVar);
            } else {
                vdvldrhtssVar = (vdvldrhtss) layoutParams;
            }
            vdvldrhtssVar.f12787zdlpuopuiu = iozdgvuglvVar;
            vdvldrhtssVar.f12784iwizpuwonk = !z15 && zHkdspvbjdz;
            return iozdgvuglvVar;
        }

        void cqumvgiudr(int i13, int i14, boolean z13) {
            int i15 = i13 + i14;
            for (int size = this.f12738ppxfxbqfkf.size() - 1; size >= 0; size--) {
                iozdgvuglv iozdgvuglvVar = (iozdgvuglv) this.f12738ppxfxbqfkf.get(size);
                if (iozdgvuglvVar != null) {
                    int i16 = iozdgvuglvVar.mPosition;
                    if (i16 >= i15) {
                        if (RecyclerView.f12642eslsurpljm) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + iozdgvuglvVar + " now at position " + (iozdgvuglvVar.mPosition - i14));
                        }
                        iozdgvuglvVar.offsetPosition(-i14, z13);
                    } else if (i16 >= i13) {
                        iozdgvuglvVar.addFlags(8);
                        iozdgvuglv(size);
                    }
                }
            }
        }

        iozdgvuglv draadjrbmk(long j13, int i13, boolean z13) {
            for (int size = this.f12735iobyxmoadg.size() - 1; size >= 0; size--) {
                iozdgvuglv iozdgvuglvVar = (iozdgvuglv) this.f12735iobyxmoadg.get(size);
                if (iozdgvuglvVar.getItemId() == j13 && !iozdgvuglvVar.wasReturnedFromScrap()) {
                    if (i13 == iozdgvuglvVar.getItemViewType()) {
                        iozdgvuglvVar.addFlags(32);
                        if (iozdgvuglvVar.isRemoved() && !RecyclerView.this.f12709uawqvzlxes.eablkybsjg()) {
                            iozdgvuglvVar.setFlags(2, 14);
                        }
                        return iozdgvuglvVar;
                    }
                    if (!z13) {
                        this.f12735iobyxmoadg.remove(size);
                        RecyclerView.this.removeDetachedView(iozdgvuglvVar.itemView, false);
                        cdpycssgdh(iozdgvuglvVar.itemView);
                    }
                }
            }
            int size2 = this.f12738ppxfxbqfkf.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                iozdgvuglv iozdgvuglvVar2 = (iozdgvuglv) this.f12738ppxfxbqfkf.get(size2);
                if (iozdgvuglvVar2.getItemId() == j13 && !iozdgvuglvVar2.isAttachedToTransitionOverlay()) {
                    if (i13 == iozdgvuglvVar2.getItemViewType()) {
                        if (!z13) {
                            this.f12738ppxfxbqfkf.remove(size2);
                        }
                        return iozdgvuglvVar2;
                    }
                    if (!z13) {
                        iozdgvuglv(size2);
                        return null;
                    }
                }
            }
        }

        void dsvhmnatus(iozdgvuglv iozdgvuglvVar) {
            if (iozdgvuglvVar.mInChangeScrap) {
                this.f12740zoijcleaow.remove(iozdgvuglvVar);
            } else {
                this.f12735iobyxmoadg.remove(iozdgvuglvVar);
            }
            iozdgvuglvVar.mScrapContainer = null;
            iozdgvuglvVar.mInChangeScrap = false;
            iozdgvuglvVar.clearReturnedFromScrapFlag();
        }

        jyumaefscl dxjokdxxww() {
            if (this.f12736lqeggnwhkg == null) {
                this.f12736lqeggnwhkg = new jyumaefscl();
                yggfygwlhe();
            }
            return this.f12736lqeggnwhkg;
        }

        void eablkybsjg() {
            this.f12735iobyxmoadg.clear();
            ArrayList arrayList = this.f12740zoijcleaow;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        void esjtqupxsv(nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu nufgyqmvbuVar2, boolean z13) {
            ppxfxbqfkf();
            istkbnxepw(nufgyqmvbuVar, true);
            dxjokdxxww().btonecajqb(nufgyqmvbuVar, nufgyqmvbuVar2, z13);
            yggfygwlhe();
        }

        public List gtknphoqwx() {
            return this.f12739wkgbmnqykc;
        }

        public int gxszxtbevo(int i13) {
            if (i13 >= 0 && i13 < RecyclerView.this.f12709uawqvzlxes.zoijcleaow()) {
                return !RecyclerView.this.f12709uawqvzlxes.eablkybsjg() ? i13 : RecyclerView.this.f12655cqumvgiudr.wflxmlrfwp(i13);
            }
            throw new IndexOutOfBoundsException("invalid position " + i13 + ". State item count is " + RecyclerView.this.f12709uawqvzlxes.zoijcleaow() + RecyclerView.this.ulzqkzuiru());
        }

        void hcddaimhww(cdpycssgdh cdpycssgdhVar) {
        }

        void iobyxmoadg(iozdgvuglv iozdgvuglvVar, boolean z13) {
            RecyclerView.yggfygwlhe(iozdgvuglvVar);
            View view = iozdgvuglvVar.itemView;
            androidx.recyclerview.widget.iwizpuwonk iwizpuwonkVar = RecyclerView.this.f12714wizcaqwiak;
            if (iwizpuwonkVar != null) {
                v1.iobyxmoadg iobyxmoadgVarAgtfadlqog = iwizpuwonkVar.agtfadlqog();
                jhduphickx.oipsdeybqn(view, iobyxmoadgVarAgtfadlqog instanceof androidx.recyclerview.widget.iwizpuwonk.iobyxmoadg ? ((androidx.recyclerview.widget.iwizpuwonk.iobyxmoadg) iobyxmoadgVarAgtfadlqog).agtfadlqog(view) : null);
            }
            if (z13) {
                lqeggnwhkg(iozdgvuglvVar);
            }
            iozdgvuglvVar.mBindingAdapter = null;
            iozdgvuglvVar.mOwnerRecyclerView = null;
            dxjokdxxww().gtknphoqwx(iozdgvuglvVar);
        }

        void iozdgvuglv(int i13) {
            if (RecyclerView.f12642eslsurpljm) {
                Log.d("RecyclerView", "Recycling cached view at index " + i13);
            }
            iozdgvuglv iozdgvuglvVar = (iozdgvuglv) this.f12738ppxfxbqfkf.get(i13);
            if (RecyclerView.f12642eslsurpljm) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + iozdgvuglvVar);
            }
            iobyxmoadg(iozdgvuglvVar, true);
            this.f12738ppxfxbqfkf.remove(i13);
        }

        void iwizpuwonk(int i13, int i14) {
            int i15;
            int i16;
            int i17;
            int i18;
            if (i13 < i14) {
                i15 = -1;
                i17 = i13;
                i16 = i14;
            } else {
                i15 = 1;
                i16 = i13;
                i17 = i14;
            }
            int size = this.f12738ppxfxbqfkf.size();
            for (int i19 = 0; i19 < size; i19++) {
                iozdgvuglv iozdgvuglvVar = (iozdgvuglv) this.f12738ppxfxbqfkf.get(i19);
                if (iozdgvuglvVar != null && (i18 = iozdgvuglvVar.mPosition) >= i17 && i18 <= i16) {
                    if (i18 == i13) {
                        iozdgvuglvVar.offsetPosition(i14 - i13, false);
                    } else {
                        iozdgvuglvVar.offsetPosition(i15, false);
                    }
                    if (RecyclerView.f12642eslsurpljm) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i19 + " holder " + iozdgvuglvVar);
                    }
                }
            }
        }

        public void jpowsppfya(int i13) {
            this.f12733eablkybsjg = i13;
            wypolnanlu();
        }

        void jyumaefscl(int i13, int i14) {
            int size = this.f12738ppxfxbqfkf.size();
            for (int i15 = 0; i15 < size; i15++) {
                iozdgvuglv iozdgvuglvVar = (iozdgvuglv) this.f12738ppxfxbqfkf.get(i15);
                if (iozdgvuglvVar != null && iozdgvuglvVar.mPosition >= i13) {
                    if (RecyclerView.f12642eslsurpljm) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i15 + " holder " + iozdgvuglvVar + " now at position " + (iozdgvuglvVar.mPosition + i14));
                    }
                    iozdgvuglvVar.offsetPosition(i14, false);
                }
            }
        }

        void kcexrzcfyt() {
            int size = this.f12738ppxfxbqfkf.size();
            for (int i13 = 0; i13 < size; i13++) {
                vdvldrhtss vdvldrhtssVar = (vdvldrhtss) ((iozdgvuglv) this.f12738ppxfxbqfkf.get(i13)).itemView.getLayoutParams();
                if (vdvldrhtssVar != null) {
                    vdvldrhtssVar.f12785jyumaefscl = true;
                }
            }
        }

        void kegysxyocb(int i13, int i14) {
            int i15;
            int i16 = i14 + i13;
            for (int size = this.f12738ppxfxbqfkf.size() - 1; size >= 0; size--) {
                iozdgvuglv iozdgvuglvVar = (iozdgvuglv) this.f12738ppxfxbqfkf.get(size);
                if (iozdgvuglvVar != null && (i15 = iozdgvuglvVar.mPosition) >= i13 && i15 < i16) {
                    iozdgvuglvVar.addFlags(2);
                    iozdgvuglv(size);
                }
            }
        }

        void lereixgezr() {
            yggfygwlhe();
        }

        public void lmojexxdyd(View view) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(view);
            if (iozdgvuglvVarZfvoamnweg.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (iozdgvuglvVarZfvoamnweg.isScrap()) {
                iozdgvuglvVarZfvoamnweg.unScrap();
            } else if (iozdgvuglvVarZfvoamnweg.wasReturnedFromScrap()) {
                iozdgvuglvVarZfvoamnweg.clearReturnedFromScrapFlag();
            }
            wwaezpbzkn(iozdgvuglvVarZfvoamnweg);
            if (RecyclerView.this.f12690metgxyhuhe == null || iozdgvuglvVarZfvoamnweg.isRecyclable()) {
                return;
            }
            RecyclerView.this.f12690metgxyhuhe.btonecajqb(iozdgvuglvVarZfvoamnweg);
        }

        void lqeggnwhkg(iozdgvuglv iozdgvuglvVar) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f12715wwaezpbzkn.size() > 0) {
                androidx.appcompat.app.yggfygwlhe.iobyxmoadg(RecyclerView.this.f12715wwaezpbzkn.get(0));
                throw null;
            }
            nufgyqmvbu nufgyqmvbuVar = RecyclerView.this.f12671iozdgvuglv;
            if (nufgyqmvbuVar != null) {
                nufgyqmvbuVar.onViewRecycled(iozdgvuglvVar);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f12709uawqvzlxes != null) {
                recyclerView.f12685lereixgezr.vdvldrhtss(iozdgvuglvVar);
            }
            if (RecyclerView.f12642eslsurpljm) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + iozdgvuglvVar);
            }
        }

        iozdgvuglv nufgyqmvbu(int i13) {
            int size;
            int iWflxmlrfwp;
            ArrayList arrayList = this.f12740zoijcleaow;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i14 = 0; i14 < size; i14++) {
                    iozdgvuglv iozdgvuglvVar = (iozdgvuglv) this.f12740zoijcleaow.get(i14);
                    if (!iozdgvuglvVar.wasReturnedFromScrap() && iozdgvuglvVar.getLayoutPosition() == i13) {
                        iozdgvuglvVar.addFlags(32);
                        return iozdgvuglvVar;
                    }
                }
                if (RecyclerView.this.f12671iozdgvuglv.hasStableIds() && (iWflxmlrfwp = RecyclerView.this.f12655cqumvgiudr.wflxmlrfwp(i13)) > 0 && iWflxmlrfwp < RecyclerView.this.f12671iozdgvuglv.getItemCount()) {
                    long itemId = RecyclerView.this.f12671iozdgvuglv.getItemId(iWflxmlrfwp);
                    for (int i15 = 0; i15 < size; i15++) {
                        iozdgvuglv iozdgvuglvVar2 = (iozdgvuglv) this.f12740zoijcleaow.get(i15);
                        if (!iozdgvuglvVar2.wasReturnedFromScrap() && iozdgvuglvVar2.getItemId() == itemId) {
                            iozdgvuglvVar2.addFlags(32);
                            return iozdgvuglvVar2;
                        }
                    }
                }
            }
            return null;
        }

        public View ojitshcjhn(int i13) {
            return rgvfuqvkyq(i13, false);
        }

        void pkzmftpjix(jyumaefscl jyumaefsclVar) {
            zynmafqrjb(RecyclerView.this.f12671iozdgvuglv);
            jyumaefscl jyumaefsclVar2 = this.f12736lqeggnwhkg;
            if (jyumaefsclVar2 != null) {
                jyumaefsclVar2.wkgbmnqykc();
            }
            this.f12736lqeggnwhkg = jyumaefsclVar;
            if (jyumaefsclVar != null && RecyclerView.this.getAdapter() != null) {
                this.f12736lqeggnwhkg.iobyxmoadg();
            }
            yggfygwlhe();
        }

        void pmvmpeiblj() {
            for (int i13 = 0; i13 < this.f12738ppxfxbqfkf.size(); i13++) {
                a2.iobyxmoadg.zoijcleaow(((iozdgvuglv) this.f12738ppxfxbqfkf.get(i13)).itemView);
            }
            zynmafqrjb(RecyclerView.this.f12671iozdgvuglv);
        }

        public void ppxfxbqfkf() {
            this.f12735iobyxmoadg.clear();
            yadqdtsiqt();
        }

        View rgvfuqvkyq(int i13, boolean z13) {
            return cllcsxoeiz(i13, z13, Long.MAX_VALUE).itemView;
        }

        boolean stevsuqkhv(iozdgvuglv iozdgvuglvVar) {
            if (iozdgvuglvVar.isRemoved()) {
                if (!RecyclerView.f12649yzdjzghtvl || RecyclerView.this.f12709uawqvzlxes.eablkybsjg()) {
                    return RecyclerView.this.f12709uawqvzlxes.eablkybsjg();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.ulzqkzuiru());
            }
            int i13 = iozdgvuglvVar.mPosition;
            if (i13 >= 0 && i13 < RecyclerView.this.f12671iozdgvuglv.getItemCount()) {
                if (RecyclerView.this.f12709uawqvzlxes.eablkybsjg() || RecyclerView.this.f12671iozdgvuglv.getItemViewType(iozdgvuglvVar.mPosition) == iozdgvuglvVar.getItemViewType()) {
                    return !RecyclerView.this.f12671iozdgvuglv.hasStableIds() || iozdgvuglvVar.getItemId() == RecyclerView.this.f12671iozdgvuglv.getItemId(iozdgvuglvVar.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + iozdgvuglvVar + RecyclerView.this.ulzqkzuiru());
        }

        iozdgvuglv wflxmlrfwp(int i13, boolean z13) {
            View viewEablkybsjg;
            int size = this.f12735iobyxmoadg.size();
            for (int i14 = 0; i14 < size; i14++) {
                iozdgvuglv iozdgvuglvVar = (iozdgvuglv) this.f12735iobyxmoadg.get(i14);
                if (!iozdgvuglvVar.wasReturnedFromScrap() && iozdgvuglvVar.getLayoutPosition() == i13 && !iozdgvuglvVar.isInvalid() && (RecyclerView.this.f12709uawqvzlxes.f12816nufgyqmvbu || !iozdgvuglvVar.isRemoved())) {
                    iozdgvuglvVar.addFlags(32);
                    return iozdgvuglvVar;
                }
            }
            if (!z13 && (viewEablkybsjg = RecyclerView.this.f12660esjtqupxsv.eablkybsjg(i13)) != null) {
                iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(viewEablkybsjg);
                RecyclerView.this.f12660esjtqupxsv.kcexrzcfyt(viewEablkybsjg);
                int iWflxmlrfwp = RecyclerView.this.f12660esjtqupxsv.wflxmlrfwp(viewEablkybsjg);
                if (iWflxmlrfwp != -1) {
                    RecyclerView.this.f12660esjtqupxsv.wkgbmnqykc(iWflxmlrfwp);
                    ylkuphrtab(viewEablkybsjg);
                    iozdgvuglvVarZfvoamnweg.addFlags(8224);
                    return iozdgvuglvVarZfvoamnweg;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + iozdgvuglvVarZfvoamnweg + RecyclerView.this.ulzqkzuiru());
            }
            int size2 = this.f12738ppxfxbqfkf.size();
            for (int i15 = 0; i15 < size2; i15++) {
                iozdgvuglv iozdgvuglvVar2 = (iozdgvuglv) this.f12738ppxfxbqfkf.get(i15);
                if (!iozdgvuglvVar2.isInvalid() && iozdgvuglvVar2.getLayoutPosition() == i13 && !iozdgvuglvVar2.isAttachedToTransitionOverlay()) {
                    if (!z13) {
                        this.f12738ppxfxbqfkf.remove(i15);
                    }
                    if (RecyclerView.f12642eslsurpljm) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i13 + ") found match in cache: " + iozdgvuglvVar2);
                    }
                    return iozdgvuglvVar2;
                }
            }
            return null;
        }

        void wkgbmnqykc() {
            int size = this.f12738ppxfxbqfkf.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((iozdgvuglv) this.f12738ppxfxbqfkf.get(i13)).clearOldPosition();
            }
            int size2 = this.f12735iobyxmoadg.size();
            for (int i14 = 0; i14 < size2; i14++) {
                ((iozdgvuglv) this.f12735iobyxmoadg.get(i14)).clearOldPosition();
            }
            ArrayList arrayList = this.f12740zoijcleaow;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    ((iozdgvuglv) this.f12740zoijcleaow.get(i15)).clearOldPosition();
                }
            }
        }

        void wwaezpbzkn(iozdgvuglv iozdgvuglvVar) {
            boolean z13;
            boolean z14 = false;
            boolean z15 = true;
            if (iozdgvuglvVar.isScrap() || iozdgvuglvVar.itemView.getParent() != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Scrapped or attached views may not be recycled. isScrap:");
                sb3.append(iozdgvuglvVar.isScrap());
                sb3.append(" isAttached:");
                sb3.append(iozdgvuglvVar.itemView.getParent() != null);
                sb3.append(RecyclerView.this.ulzqkzuiru());
                throw new IllegalArgumentException(sb3.toString());
            }
            if (iozdgvuglvVar.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + iozdgvuglvVar + RecyclerView.this.ulzqkzuiru());
            }
            if (iozdgvuglvVar.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.ulzqkzuiru());
            }
            boolean zDoesTransientStatePreventRecycling = iozdgvuglvVar.doesTransientStatePreventRecycling();
            nufgyqmvbu nufgyqmvbuVar = RecyclerView.this.f12671iozdgvuglv;
            boolean z16 = nufgyqmvbuVar != null && zDoesTransientStatePreventRecycling && nufgyqmvbuVar.onFailedToRecycleView(iozdgvuglvVar);
            if (RecyclerView.f12649yzdjzghtvl && this.f12738ppxfxbqfkf.contains(iozdgvuglvVar)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + iozdgvuglvVar + RecyclerView.this.ulzqkzuiru());
            }
            if (z16 || iozdgvuglvVar.isRecyclable()) {
                if (this.f12734gxszxtbevo <= 0 || iozdgvuglvVar.hasAnyOfTheFlags(526)) {
                    z13 = false;
                } else {
                    int size = this.f12738ppxfxbqfkf.size();
                    if (size >= this.f12734gxszxtbevo && size > 0) {
                        iozdgvuglv(0);
                        size--;
                    }
                    if (RecyclerView.f12641e && size > 0 && !RecyclerView.this.f12702roivzttewh.wkgbmnqykc(iozdgvuglvVar.mPosition)) {
                        int i13 = size - 1;
                        while (i13 >= 0) {
                            if (!RecyclerView.this.f12702roivzttewh.wkgbmnqykc(((iozdgvuglv) this.f12738ppxfxbqfkf.get(i13)).mPosition)) {
                                break;
                            } else {
                                i13--;
                            }
                        }
                        size = i13 + 1;
                    }
                    this.f12738ppxfxbqfkf.add(size, iozdgvuglvVar);
                    z13 = true;
                }
                if (z13) {
                    z15 = false;
                } else {
                    iobyxmoadg(iozdgvuglvVar, true);
                }
                z14 = z13;
            } else {
                if (RecyclerView.f12642eslsurpljm) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.ulzqkzuiru());
                }
                z15 = false;
            }
            RecyclerView.this.f12685lereixgezr.vdvldrhtss(iozdgvuglvVar);
            if (z14 || z15 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            a2.iobyxmoadg.zoijcleaow(iozdgvuglvVar.itemView);
            iozdgvuglvVar.mBindingAdapter = null;
            iozdgvuglvVar.mOwnerRecyclerView = null;
        }

        void wypolnanlu() {
            rgvfuqvkyq rgvfuqvkyqVar = RecyclerView.this.f12686lmojexxdyd;
            this.f12734gxszxtbevo = this.f12733eablkybsjg + (rgvfuqvkyqVar != null ? rgvfuqvkyqVar.f12764iozdgvuglv : 0);
            for (int size = this.f12738ppxfxbqfkf.size() - 1; size >= 0 && this.f12738ppxfxbqfkf.size() > this.f12734gxszxtbevo; size--) {
                iozdgvuglv(size);
            }
        }

        void yadqdtsiqt() {
            for (int size = this.f12738ppxfxbqfkf.size() - 1; size >= 0; size--) {
                iozdgvuglv(size);
            }
            this.f12738ppxfxbqfkf.clear();
            if (RecyclerView.f12641e) {
                RecyclerView.this.f12702roivzttewh.zoijcleaow();
            }
        }

        void ylkuphrtab(View view) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(view);
            if (!iozdgvuglvVarZfvoamnweg.hasAnyOfTheFlags(12) && iozdgvuglvVarZfvoamnweg.isUpdated() && !RecyclerView.this.kcexrzcfyt(iozdgvuglvVarZfvoamnweg)) {
                if (this.f12740zoijcleaow == null) {
                    this.f12740zoijcleaow = new ArrayList();
                }
                iozdgvuglvVarZfvoamnweg.setScrapContainer(this, true);
                this.f12740zoijcleaow.add(iozdgvuglvVarZfvoamnweg);
                return;
            }
            if (!iozdgvuglvVarZfvoamnweg.isInvalid() || iozdgvuglvVarZfvoamnweg.isRemoved() || RecyclerView.this.f12671iozdgvuglv.hasStableIds()) {
                iozdgvuglvVarZfvoamnweg.setScrapContainer(this, false);
                this.f12735iobyxmoadg.add(iozdgvuglvVarZfvoamnweg);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.ulzqkzuiru());
            }
        }

        void zdlpuopuiu() {
            int size = this.f12738ppxfxbqfkf.size();
            for (int i13 = 0; i13 < size; i13++) {
                iozdgvuglv iozdgvuglvVar = (iozdgvuglv) this.f12738ppxfxbqfkf.get(i13);
                if (iozdgvuglvVar != null) {
                    iozdgvuglvVar.addFlags(6);
                    iozdgvuglvVar.addChangePayload(null);
                }
            }
            nufgyqmvbu nufgyqmvbuVar = RecyclerView.this.f12671iozdgvuglv;
            if (nufgyqmvbuVar == null || !nufgyqmvbuVar.hasStableIds()) {
                yadqdtsiqt();
            }
        }
    }

    public static class jyumaefscl {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        SparseArray f12741iobyxmoadg = new SparseArray();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f12743zoijcleaow = 0;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        Set f12742ppxfxbqfkf = Collections.newSetFromMap(new IdentityHashMap());

        static class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final ArrayList f12744iobyxmoadg = new ArrayList();

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            int f12747zoijcleaow = 5;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            long f12745ppxfxbqfkf = 0;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            long f12746wkgbmnqykc = 0;

            iobyxmoadg() {
            }
        }

        private iobyxmoadg dxjokdxxww(int i13) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f12741iobyxmoadg.get(i13);
            if (iobyxmoadgVar != null) {
                return iobyxmoadgVar;
            }
            iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg();
            this.f12741iobyxmoadg.put(i13, iobyxmoadgVar2);
            return iobyxmoadgVar2;
        }

        boolean agtfadlqog(int i13, long j13, long j14) {
            long j15 = dxjokdxxww(i13).f12745ppxfxbqfkf;
            return j15 == 0 || j13 + j15 < j14;
        }

        void btonecajqb(nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu nufgyqmvbuVar2, boolean z13) {
            if (nufgyqmvbuVar != null) {
                wkgbmnqykc();
            }
            if (!z13 && this.f12743zoijcleaow == 0) {
                ppxfxbqfkf();
            }
            if (nufgyqmvbuVar2 != null) {
                iobyxmoadg();
            }
        }

        long draadjrbmk(long j13, long j14) {
            return j13 == 0 ? j14 : ((j13 / 4) * 3) + (j14 / 4);
        }

        void eablkybsjg(nufgyqmvbu nufgyqmvbuVar, boolean z13) {
            this.f12742ppxfxbqfkf.remove(nufgyqmvbuVar);
            if (this.f12742ppxfxbqfkf.size() != 0 || z13) {
                return;
            }
            for (int i13 = 0; i13 < this.f12741iobyxmoadg.size(); i13++) {
                SparseArray sparseArray = this.f12741iobyxmoadg;
                ArrayList arrayList = ((iobyxmoadg) sparseArray.get(sparseArray.keyAt(i13))).f12744iobyxmoadg;
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    a2.iobyxmoadg.zoijcleaow(((iozdgvuglv) arrayList.get(i14)).itemView);
                }
            }
        }

        public void gtknphoqwx(iozdgvuglv iozdgvuglvVar) {
            int itemViewType = iozdgvuglvVar.getItemViewType();
            ArrayList arrayList = dxjokdxxww(itemViewType).f12744iobyxmoadg;
            if (((iobyxmoadg) this.f12741iobyxmoadg.get(itemViewType)).f12747zoijcleaow <= arrayList.size()) {
                a2.iobyxmoadg.zoijcleaow(iozdgvuglvVar.itemView);
            } else {
                if (RecyclerView.f12649yzdjzghtvl && arrayList.contains(iozdgvuglvVar)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                iozdgvuglvVar.resetInternal();
                arrayList.add(iozdgvuglvVar);
            }
        }

        void gxszxtbevo(int i13, long j13) {
            iobyxmoadg iobyxmoadgVarDxjokdxxww = dxjokdxxww(i13);
            iobyxmoadgVarDxjokdxxww.f12746wkgbmnqykc = draadjrbmk(iobyxmoadgVarDxjokdxxww.f12746wkgbmnqykc, j13);
        }

        void iobyxmoadg() {
            this.f12743zoijcleaow++;
        }

        void lqeggnwhkg(int i13, long j13) {
            iobyxmoadg iobyxmoadgVarDxjokdxxww = dxjokdxxww(i13);
            iobyxmoadgVarDxjokdxxww.f12745ppxfxbqfkf = draadjrbmk(iobyxmoadgVarDxjokdxxww.f12745ppxfxbqfkf, j13);
        }

        public iozdgvuglv nufgyqmvbu(int i13) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f12741iobyxmoadg.get(i13);
            if (iobyxmoadgVar == null || iobyxmoadgVar.f12744iobyxmoadg.isEmpty()) {
                return null;
            }
            ArrayList arrayList = iobyxmoadgVar.f12744iobyxmoadg;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((iozdgvuglv) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                    return (iozdgvuglv) arrayList.remove(size);
                }
            }
            return null;
        }

        public void ppxfxbqfkf() {
            for (int i13 = 0; i13 < this.f12741iobyxmoadg.size(); i13++) {
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f12741iobyxmoadg.valueAt(i13);
                Iterator it = iobyxmoadgVar.f12744iobyxmoadg.iterator();
                while (it.hasNext()) {
                    a2.iobyxmoadg.zoijcleaow(((iozdgvuglv) it.next()).itemView);
                }
                iobyxmoadgVar.f12744iobyxmoadg.clear();
            }
        }

        boolean wflxmlrfwp(int i13, long j13, long j14) {
            long j15 = dxjokdxxww(i13).f12746wkgbmnqykc;
            return j15 == 0 || j13 + j15 < j14;
        }

        void wkgbmnqykc() {
            this.f12743zoijcleaow--;
        }

        void zoijcleaow(nufgyqmvbu nufgyqmvbuVar) {
            this.f12742ppxfxbqfkf.add(nufgyqmvbuVar);
        }
    }

    public static abstract class kcexrzcfyt {
        public abstract boolean onFling(int i13, int i14);
    }

    public static class lereixgezr implements zdlpuopuiu {
        @Override // androidx.recyclerview.widget.RecyclerView.zdlpuopuiu
        public void eablkybsjg(boolean z13) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.zdlpuopuiu
        public void iobyxmoadg(RecyclerView recyclerView, MotionEvent motionEvent) {
        }
    }

    static /* synthetic */ class lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f12748iobyxmoadg;

        static {
            int[] iArr = new int[nufgyqmvbu.iobyxmoadg.values().length];
            f12748iobyxmoadg = iArr;
            try {
                iArr[nufgyqmvbu.iobyxmoadg.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12748iobyxmoadg[nufgyqmvbu.iobyxmoadg.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class nufgyqmvbu {
        private final dxjokdxxww mObservable = new dxjokdxxww();
        private boolean mHasStableIds = false;
        private iobyxmoadg mStateRestorationPolicy = iobyxmoadg.ALLOW;

        public enum iobyxmoadg {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(iozdgvuglv iozdgvuglvVar, int i13) {
            boolean z13 = iozdgvuglvVar.mBindingAdapter == null;
            if (z13) {
                iozdgvuglvVar.mPosition = i13;
                if (hasStableIds()) {
                    iozdgvuglvVar.mItemId = getItemId(i13);
                }
                iozdgvuglvVar.setFlags(1, 519);
                q1.gtknphoqwx.iobyxmoadg("RV OnBindView");
            }
            iozdgvuglvVar.mBindingAdapter = this;
            if (RecyclerView.f12649yzdjzghtvl) {
                if (iozdgvuglvVar.itemView.getParent() == null && jhduphickx.kegysxyocb(iozdgvuglvVar.itemView) != iozdgvuglvVar.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + iozdgvuglvVar.isTmpDetached() + ", attached to window: " + jhduphickx.kegysxyocb(iozdgvuglvVar.itemView) + ", holder: " + iozdgvuglvVar);
                }
                if (iozdgvuglvVar.itemView.getParent() == null && jhduphickx.kegysxyocb(iozdgvuglvVar.itemView)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + iozdgvuglvVar);
                }
            }
            onBindViewHolder(iozdgvuglvVar, i13, iozdgvuglvVar.getUnmodifiedPayloads());
            if (z13) {
                iozdgvuglvVar.clearPayload();
                ViewGroup.LayoutParams layoutParams = iozdgvuglvVar.itemView.getLayoutParams();
                if (layoutParams instanceof vdvldrhtss) {
                    ((vdvldrhtss) layoutParams).f12785jyumaefscl = true;
                }
                q1.gtknphoqwx.zoijcleaow();
            }
        }

        boolean canRestoreState() {
            int i13 = lqeggnwhkg.f12748iobyxmoadg[this.mStateRestorationPolicy.ordinal()];
            if (i13 != 1) {
                return i13 != 2 || getItemCount() > 0;
            }
            return false;
        }

        public final iozdgvuglv createViewHolder(ViewGroup viewGroup, int i13) {
            try {
                q1.gtknphoqwx.iobyxmoadg("RV CreateView");
                iozdgvuglv iozdgvuglvVarOnCreateViewHolder = onCreateViewHolder(viewGroup, i13);
                if (iozdgvuglvVarOnCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                iozdgvuglvVarOnCreateViewHolder.mItemViewType = i13;
                q1.gtknphoqwx.zoijcleaow();
                return iozdgvuglvVarOnCreateViewHolder;
            } catch (Throwable th2) {
                q1.gtknphoqwx.zoijcleaow();
                throw th2;
            }
        }

        public int findRelativeAdapterPositionIn(nufgyqmvbu nufgyqmvbuVar, iozdgvuglv iozdgvuglvVar, int i13) {
            if (nufgyqmvbuVar == this) {
                return i13;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i13) {
            return -1L;
        }

        public int getItemViewType(int i13) {
            return 0;
        }

        public final iobyxmoadg getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.iobyxmoadg();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.zoijcleaow();
        }

        public final void notifyItemChanged(int i13) {
            this.mObservable.wkgbmnqykc(i13, 1);
        }

        public final void notifyItemInserted(int i13) {
            this.mObservable.gxszxtbevo(i13, 1);
        }

        public final void notifyItemMoved(int i13, int i14) {
            this.mObservable.ppxfxbqfkf(i13, i14);
        }

        public final void notifyItemRangeChanged(int i13, int i14) {
            this.mObservable.wkgbmnqykc(i13, i14);
        }

        public final void notifyItemRangeInserted(int i13, int i14) {
            this.mObservable.gxszxtbevo(i13, i14);
        }

        public final void notifyItemRangeRemoved(int i13, int i14) {
            this.mObservable.lqeggnwhkg(i13, i14);
        }

        public final void notifyItemRemoved(int i13) {
            this.mObservable.lqeggnwhkg(i13, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(iozdgvuglv iozdgvuglvVar, int i13);

        public void onBindViewHolder(iozdgvuglv iozdgvuglvVar, int i13, List<Object> list) {
            onBindViewHolder(iozdgvuglvVar, i13);
        }

        public abstract iozdgvuglv onCreateViewHolder(ViewGroup viewGroup, int i13);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(iozdgvuglv iozdgvuglvVar) {
            return false;
        }

        public void onViewAttachedToWindow(iozdgvuglv iozdgvuglvVar) {
        }

        public void onViewDetachedFromWindow(iozdgvuglv iozdgvuglvVar) {
        }

        public void onViewRecycled(iozdgvuglv iozdgvuglvVar) {
        }

        public void registerAdapterDataObserver(btonecajqb btonecajqbVar) {
            this.mObservable.registerObserver(btonecajqbVar);
        }

        public void setHasStableIds(boolean z13) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z13;
        }

        public void setStateRestorationPolicy(iobyxmoadg iobyxmoadgVar) {
            this.mStateRestorationPolicy = iobyxmoadgVar;
            this.mObservable.nufgyqmvbu();
        }

        public void unregisterAdapterDataObserver(btonecajqb btonecajqbVar) {
            this.mObservable.unregisterObserver(btonecajqbVar);
        }

        public final void notifyItemChanged(int i13, Object obj) {
            this.mObservable.eablkybsjg(i13, 1, obj);
        }

        public final void notifyItemRangeChanged(int i13, int i14, Object obj) {
            this.mObservable.eablkybsjg(i13, i14, obj);
        }
    }

    public static abstract class ojitshcjhn {
        @Deprecated
        public void getItemOffsets(Rect rect, int i13, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, zynmafqrjb zynmafqrjbVar) {
            getItemOffsets(rect, ((vdvldrhtss) view.getLayoutParams()).zoijcleaow(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, zynmafqrjb zynmafqrjbVar) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, zynmafqrjb zynmafqrjbVar) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public interface oxmwwwfdhm {
        void wkgbmnqykc(View view);

        void zoijcleaow(View view);
    }

    public static abstract class pmvmpeiblj {
        private rgvfuqvkyq mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final iobyxmoadg mRecyclingAction = new iobyxmoadg(0, 0);

        public static class iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private Interpolator f12753eablkybsjg;

            /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
            private boolean f12754gxszxtbevo;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private int f12755iobyxmoadg;

            /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
            private int f12756lqeggnwhkg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private int f12757ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private int f12758wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private int f12759zoijcleaow;

            public iobyxmoadg(int i13, int i14) {
                this(i13, i14, Integer.MIN_VALUE, null);
            }

            private void eablkybsjg() {
                if (this.f12753eablkybsjg != null && this.f12757ppxfxbqfkf < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f12757ppxfxbqfkf < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean iobyxmoadg() {
                return this.f12758wkgbmnqykc >= 0;
            }

            void ppxfxbqfkf(RecyclerView recyclerView) {
                int i13 = this.f12758wkgbmnqykc;
                if (i13 >= 0) {
                    this.f12758wkgbmnqykc = -1;
                    recyclerView.hszhottldk(i13);
                    this.f12754gxszxtbevo = false;
                } else {
                    if (!this.f12754gxszxtbevo) {
                        this.f12756lqeggnwhkg = 0;
                        return;
                    }
                    eablkybsjg();
                    recyclerView.f12693nuxfzjnpeb.eablkybsjg(this.f12755iobyxmoadg, this.f12759zoijcleaow, this.f12757ppxfxbqfkf, this.f12753eablkybsjg);
                    int i14 = this.f12756lqeggnwhkg + 1;
                    this.f12756lqeggnwhkg = i14;
                    if (i14 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f12754gxszxtbevo = false;
                }
            }

            public void wkgbmnqykc(int i13, int i14, int i15, Interpolator interpolator) {
                this.f12755iobyxmoadg = i13;
                this.f12759zoijcleaow = i14;
                this.f12757ppxfxbqfkf = i15;
                this.f12753eablkybsjg = interpolator;
                this.f12754gxszxtbevo = true;
            }

            public void zoijcleaow(int i13) {
                this.f12758wkgbmnqykc = i13;
            }

            public iobyxmoadg(int i13, int i14, int i15, Interpolator interpolator) {
                this.f12758wkgbmnqykc = -1;
                this.f12754gxszxtbevo = false;
                this.f12756lqeggnwhkg = 0;
                this.f12755iobyxmoadg = i13;
                this.f12759zoijcleaow = i14;
                this.f12757ppxfxbqfkf = i15;
                this.f12753eablkybsjg = interpolator;
            }
        }

        public interface zoijcleaow {
            PointF zoijcleaow(int i13);
        }

        public PointF computeScrollVectorForPosition(int i13) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof zoijcleaow) {
                return ((zoijcleaow) layoutManager).zoijcleaow(i13);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + zoijcleaow.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i13) {
            return this.mRecyclerView.f12686lmojexxdyd.mbcevpiqjq(i13);
        }

        public int getChildCount() {
            return this.mRecyclerView.f12686lmojexxdyd.vipkmwdibw();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.ydmasvzmpa(view);
        }

        public rgvfuqvkyq getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i13) {
            this.mRecyclerView.A(i13);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        protected void normalize(PointF pointF) {
            float f13 = pointF.x;
            float f14 = pointF.y;
            float fSqrt = (float) Math.sqrt((f13 * f13) + (f14 * f14));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void onAnimation(int i13, int i14) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f13 = pointFComputeScrollVectorForPosition.x;
                if (f13 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.z((int) Math.signum(f13), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.f12709uawqvzlxes, this.mRecyclingAction);
                    this.mRecyclingAction.ppxfxbqfkf(recyclerView);
                    stop();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i13, i14, recyclerView.f12709uawqvzlxes, this.mRecyclingAction);
                boolean zIobyxmoadg = this.mRecyclingAction.iobyxmoadg();
                this.mRecyclingAction.ppxfxbqfkf(recyclerView);
                if (zIobyxmoadg && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.f12693nuxfzjnpeb.wkgbmnqykc();
                }
            }
        }

        protected void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
                if (RecyclerView.f12642eslsurpljm) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        protected abstract void onSeekTargetStep(int i13, int i14, zynmafqrjb zynmafqrjbVar, iobyxmoadg iobyxmoadgVar);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, zynmafqrjb zynmafqrjbVar, iobyxmoadg iobyxmoadgVar);

        public void setTargetPosition(int i13) {
            this.mTargetPosition = i13;
        }

        void start(RecyclerView recyclerView, rgvfuqvkyq rgvfuqvkyqVar) {
            recyclerView.f12693nuxfzjnpeb.gxszxtbevo();
            if (this.mStarted) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = rgvfuqvkyqVar;
            int i13 = this.mTargetPosition;
            if (i13 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f12709uawqvzlxes.f12814iobyxmoadg = i13;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.f12693nuxfzjnpeb.wkgbmnqykc();
            this.mStarted = true;
        }

        protected final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.f12709uawqvzlxes.f12814iobyxmoadg = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.x(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    class ppxfxbqfkf implements Interpolator {
        ppxfxbqfkf() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f13) {
            float f14 = f13 - 1.0f;
            return (f14 * f14 * f14 * f14 * f14) + 1.0f;
        }
    }

    public static abstract class rgvfuqvkyq {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private boolean f12760cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        androidx.recyclerview.widget.pmvmpeiblj f12761cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        androidx.recyclerview.widget.pmvmpeiblj f12762esjtqupxsv;

        /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
        private int f12763hcddaimhww;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        int f12764iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        boolean f12765istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow f12766iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow f12767jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        pmvmpeiblj f12768lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        boolean f12769lmojexxdyd;

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        private int f12770pkzmftpjix;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        boolean f12771pmvmpeiblj;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        private int f12772wwaezpbzkn;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private boolean f12773yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        RecyclerView f12774yggfygwlhe;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        private int f12775ylkuphrtab;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        androidx.recyclerview.widget.gxszxtbevo f12776zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        boolean f12777zynmafqrjb;

        class iobyxmoadg implements androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow {
            iobyxmoadg() {
            }

            @Override // androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow
            public int eablkybsjg(View view) {
                return rgvfuqvkyq.this.yfnezrywwk(view) + ((ViewGroup.MarginLayoutParams) ((vdvldrhtss) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow
            public View iobyxmoadg(int i13) {
                return rgvfuqvkyq.this.ribwqtqdhb(i13);
            }

            @Override // androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow
            public int ppxfxbqfkf() {
                return rgvfuqvkyq.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow
            public int wkgbmnqykc() {
                return rgvfuqvkyq.this.iwxlajgraz() - rgvfuqvkyq.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow
            public int zoijcleaow(View view) {
                return rgvfuqvkyq.this.rlfsiqarku(view) - ((ViewGroup.MarginLayoutParams) ((vdvldrhtss) view.getLayoutParams())).leftMargin;
            }
        }

        public interface ppxfxbqfkf {
            void iobyxmoadg(int i13, int i14);
        }

        public static class wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public int f12779iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            public boolean f12780ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            public boolean f12781wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            public int f12782zoijcleaow;
        }

        class zoijcleaow implements androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow {
            zoijcleaow() {
            }

            @Override // androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow
            public int eablkybsjg(View view) {
                return rgvfuqvkyq.this.xrmfcynszj(view) + ((ViewGroup.MarginLayoutParams) ((vdvldrhtss) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow
            public View iobyxmoadg(int i13) {
                return rgvfuqvkyq.this.ribwqtqdhb(i13);
            }

            @Override // androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow
            public int ppxfxbqfkf() {
                return rgvfuqvkyq.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow
            public int wkgbmnqykc() {
                return rgvfuqvkyq.this.zfvoamnweg() - rgvfuqvkyq.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.pmvmpeiblj.zoijcleaow
            public int zoijcleaow(View view) {
                return rgvfuqvkyq.this.ydmasvzmpa(view) - ((ViewGroup.MarginLayoutParams) ((vdvldrhtss) view.getLayoutParams())).topMargin;
            }
        }

        public rgvfuqvkyq() {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            this.f12767jyumaefscl = iobyxmoadgVar;
            zoijcleaow zoijcleaowVar = new zoijcleaow();
            this.f12766iwizpuwonk = zoijcleaowVar;
            this.f12761cqumvgiudr = new androidx.recyclerview.widget.pmvmpeiblj(iobyxmoadgVar);
            this.f12762esjtqupxsv = new androidx.recyclerview.widget.pmvmpeiblj(zoijcleaowVar);
            this.f12771pmvmpeiblj = false;
            this.f12777zynmafqrjb = false;
            this.f12765istkbnxepw = false;
            this.f12760cdpycssgdh = true;
            this.f12773yadqdtsiqt = true;
        }

        private void O(iwizpuwonk iwizpuwonkVar, int i13, View view) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(view);
            if (iozdgvuglvVarZfvoamnweg.shouldIgnore()) {
                if (RecyclerView.f12642eslsurpljm) {
                    Log.d("RecyclerView", "ignoring view " + iozdgvuglvVarZfvoamnweg);
                    return;
                }
                return;
            }
            if (iozdgvuglvVarZfvoamnweg.isInvalid() && !iozdgvuglvVarZfvoamnweg.isRemoved() && !this.f12774yggfygwlhe.f12671iozdgvuglv.hasStableIds()) {
                J(i13);
                iwizpuwonkVar.wwaezpbzkn(iozdgvuglvVarZfvoamnweg);
            } else {
                dsvhmnatus(i13);
                iwizpuwonkVar.ylkuphrtab(view);
                this.f12774yggfygwlhe.f12685lereixgezr.gtknphoqwx(iozdgvuglvVarZfvoamnweg);
            }
        }

        public static int cdpycssgdh(int i13, int i14, int i15) {
            int mode = View.MeasureSpec.getMode(i13);
            int size = View.MeasureSpec.getSize(i13);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i14, i15) : size;
            }
            return Math.min(size, Math.max(i14, i15));
        }

        private static boolean fyldjkxazc(int i13, int i14, int i15) {
            int mode = View.MeasureSpec.getMode(i14);
            int size = View.MeasureSpec.getSize(i14);
            if (i15 > 0 && i13 != i15) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i13;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i13;
            }
            return true;
        }

        private int[] ikoacuggdj(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int iIwxlajgraz = iwxlajgraz() - getPaddingRight();
            int iZfvoamnweg = zfvoamnweg() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i13 = left - paddingLeft;
            int iMin = Math.min(0, i13);
            int i14 = top - paddingTop;
            int iMin2 = Math.min(0, i14);
            int i15 = iWidth - iIwxlajgraz;
            int iMax = Math.max(0, i15);
            int iMax2 = Math.max(0, iHeight - iZfvoamnweg);
            if (bfopjjpdmp() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i13, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i15);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i14, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int jhduphickx(int i13, int i14, int i15, int i16, boolean z13) {
            int iMax = Math.max(0, i13 - i15);
            if (z13) {
                if (i16 >= 0) {
                    i14 = 1073741824;
                } else if (i16 != -1 || (i14 != Integer.MIN_VALUE && (i14 == 0 || i14 != 1073741824))) {
                    i14 = 0;
                    i16 = 0;
                } else {
                    i16 = iMax;
                }
            } else if (i16 >= 0) {
                i14 = 1073741824;
            } else if (i16 == -1) {
                i16 = iMax;
            } else if (i16 != -2) {
                i14 = 0;
                i16 = 0;
            } else if (i14 == Integer.MIN_VALUE || i14 == 1073741824) {
                i16 = iMax;
                i14 = Integer.MIN_VALUE;
            } else {
                i16 = iMax;
                i14 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i16, i14);
        }

        private void jyumaefscl(View view, int i13, boolean z13) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(view);
            if (z13 || iozdgvuglvVarZfvoamnweg.isRemoved()) {
                this.f12774yggfygwlhe.f12685lereixgezr.zoijcleaow(iozdgvuglvVarZfvoamnweg);
            } else {
                this.f12774yggfygwlhe.f12685lereixgezr.rgvfuqvkyq(iozdgvuglvVarZfvoamnweg);
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) view.getLayoutParams();
            if (iozdgvuglvVarZfvoamnweg.wasReturnedFromScrap() || iozdgvuglvVarZfvoamnweg.isScrap()) {
                if (iozdgvuglvVarZfvoamnweg.isScrap()) {
                    iozdgvuglvVarZfvoamnweg.unScrap();
                } else {
                    iozdgvuglvVarZfvoamnweg.clearReturnedFromScrapFlag();
                }
                this.f12776zdlpuopuiu.ppxfxbqfkf(view, i13, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f12774yggfygwlhe) {
                int iWflxmlrfwp = this.f12776zdlpuopuiu.wflxmlrfwp(view);
                if (i13 == -1) {
                    i13 = this.f12776zdlpuopuiu.lqeggnwhkg();
                }
                if (iWflxmlrfwp == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f12774yggfygwlhe.indexOfChild(view) + this.f12774yggfygwlhe.ulzqkzuiru());
                }
                if (iWflxmlrfwp != i13) {
                    this.f12774yggfygwlhe.f12686lmojexxdyd.jrbgnlbqoe(iWflxmlrfwp, i13);
                }
            } else {
                this.f12776zdlpuopuiu.iobyxmoadg(view, i13, false);
                vdvldrhtssVar.f12785jyumaefscl = true;
                pmvmpeiblj pmvmpeibljVar = this.f12768lereixgezr;
                if (pmvmpeibljVar != null && pmvmpeibljVar.isRunning()) {
                    this.f12768lereixgezr.onChildAttachedToWindow(view);
                }
            }
            if (vdvldrhtssVar.f12784iwizpuwonk) {
                if (RecyclerView.f12642eslsurpljm) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + vdvldrhtssVar.f12787zdlpuopuiu);
                }
                iozdgvuglvVarZfvoamnweg.itemView.invalidate();
                vdvldrhtssVar.f12784iwizpuwonk = false;
            }
        }

        private boolean wizcaqwiak(RecyclerView recyclerView, int i13, int i14) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int iIwxlajgraz = iwxlajgraz() - getPaddingRight();
            int iZfvoamnweg = zfvoamnweg() - getPaddingBottom();
            Rect rect = this.f12774yggfygwlhe.f12673istkbnxepw;
            metgxyhuhe(focusedChild, rect);
            return rect.left - i13 < iIwxlajgraz && rect.right - i13 > paddingLeft && rect.top - i14 < iZfvoamnweg && rect.bottom - i14 > paddingTop;
        }

        private void wypolnanlu(int i13, View view) {
            this.f12776zdlpuopuiu.wkgbmnqykc(i13);
        }

        public static wkgbmnqykc zeieaojujs(Context context, AttributeSet attributeSet, int i13, int i14) {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m5.wkgbmnqykc.RecyclerView, i13, i14);
            wkgbmnqykcVar.f12779iobyxmoadg = typedArrayObtainStyledAttributes.getInt(m5.wkgbmnqykc.RecyclerView_android_orientation, 1);
            wkgbmnqykcVar.f12782zoijcleaow = typedArrayObtainStyledAttributes.getInt(m5.wkgbmnqykc.RecyclerView_spanCount, 1);
            wkgbmnqykcVar.f12780ppxfxbqfkf = typedArrayObtainStyledAttributes.getBoolean(m5.wkgbmnqykc.RecyclerView_reverseLayout, false);
            wkgbmnqykcVar.f12781wkgbmnqykc = typedArrayObtainStyledAttributes.getBoolean(m5.wkgbmnqykc.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return wkgbmnqykcVar;
        }

        boolean A(View view, int i13, Bundle bundle) {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            return B(recyclerView.f12682jyumaefscl, recyclerView.f12709uawqvzlxes, view, i13, bundle);
        }

        public boolean B(iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar, View view, int i13, Bundle bundle) {
            return false;
        }

        public void C() {
            for (int iVipkmwdibw = vipkmwdibw() - 1; iVipkmwdibw >= 0; iVipkmwdibw--) {
                this.f12776zdlpuopuiu.vdvldrhtss(iVipkmwdibw);
            }
        }

        public void D(iwizpuwonk iwizpuwonkVar) {
            for (int iVipkmwdibw = vipkmwdibw() - 1; iVipkmwdibw >= 0; iVipkmwdibw--) {
                if (!RecyclerView.zfvoamnweg(ribwqtqdhb(iVipkmwdibw)).shouldIgnore()) {
                    G(iVipkmwdibw, iwizpuwonkVar);
                }
            }
        }

        void E(iwizpuwonk iwizpuwonkVar) {
            int iBtonecajqb = iwizpuwonkVar.btonecajqb();
            for (int i13 = iBtonecajqb - 1; i13 >= 0; i13--) {
                View viewAgtfadlqog = iwizpuwonkVar.agtfadlqog(i13);
                iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(viewAgtfadlqog);
                if (!iozdgvuglvVarZfvoamnweg.shouldIgnore()) {
                    iozdgvuglvVarZfvoamnweg.setIsRecyclable(false);
                    if (iozdgvuglvVarZfvoamnweg.isTmpDetached()) {
                        this.f12774yggfygwlhe.removeDetachedView(viewAgtfadlqog, false);
                    }
                    wflxmlrfwp wflxmlrfwpVar = this.f12774yggfygwlhe.f12690metgxyhuhe;
                    if (wflxmlrfwpVar != null) {
                        wflxmlrfwpVar.btonecajqb(iozdgvuglvVarZfvoamnweg);
                    }
                    iozdgvuglvVarZfvoamnweg.setIsRecyclable(true);
                    iwizpuwonkVar.cdpycssgdh(viewAgtfadlqog);
                }
            }
            iwizpuwonkVar.eablkybsjg();
            if (iBtonecajqb > 0) {
                this.f12774yggfygwlhe.invalidate();
            }
        }

        public void F(View view, iwizpuwonk iwizpuwonkVar) {
            I(view);
            iwizpuwonkVar.lmojexxdyd(view);
        }

        public void G(int i13, iwizpuwonk iwizpuwonkVar) {
            View viewRibwqtqdhb = ribwqtqdhb(i13);
            J(i13);
            iwizpuwonkVar.lmojexxdyd(viewRibwqtqdhb);
        }

        public boolean H(Runnable runnable) {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void I(View view) {
            this.f12776zdlpuopuiu.rgvfuqvkyq(view);
        }

        public void J(int i13) {
            if (ribwqtqdhb(i13) != null) {
                this.f12776zdlpuopuiu.vdvldrhtss(i13);
            }
        }

        public boolean K(RecyclerView recyclerView, View view, Rect rect, boolean z13) {
            return L(recyclerView, view, rect, z13, false);
        }

        public boolean L(RecyclerView recyclerView, View view, Rect rect, boolean z13, boolean z14) {
            int[] iArrIkoacuggdj = ikoacuggdj(view, rect);
            int i13 = iArrIkoacuggdj[0];
            int i14 = iArrIkoacuggdj[1];
            if ((z14 && !wizcaqwiak(recyclerView, i13, i14)) || (i13 == 0 && i14 == 0)) {
                return false;
            }
            if (z13) {
                recyclerView.scrollBy(i13, i14);
            } else {
                recyclerView.F(i13, i14);
            }
            return true;
        }

        public void M() {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void N() {
            this.f12771pmvmpeiblj = true;
        }

        public abstract int P(int i13, iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar);

        public abstract void Q(int i13);

        public abstract int R(int i13, iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar);

        void S(RecyclerView recyclerView) {
            T(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void T(int i13, int i14) {
            this.f12770pkzmftpjix = View.MeasureSpec.getSize(i13);
            int mode = View.MeasureSpec.getMode(i13);
            this.f12772wwaezpbzkn = mode;
            if (mode == 0 && !RecyclerView.f12639c) {
                this.f12770pkzmftpjix = 0;
            }
            this.f12763hcddaimhww = View.MeasureSpec.getSize(i14);
            int mode2 = View.MeasureSpec.getMode(i14);
            this.f12775ylkuphrtab = mode2;
            if (mode2 != 0 || RecyclerView.f12639c) {
                return;
            }
            this.f12763hcddaimhww = 0;
        }

        public void U(int i13, int i14) {
            this.f12774yggfygwlhe.setMeasuredDimension(i13, i14);
        }

        public void V(Rect rect, int i13, int i14) {
            U(cdpycssgdh(i13, rect.width() + getPaddingLeft() + getPaddingRight(), weqkydbzbr()), cdpycssgdh(i14, rect.height() + getPaddingTop() + getPaddingBottom(), iyctptxqzt()));
        }

        void W(int i13, int i14) {
            int iVipkmwdibw = vipkmwdibw();
            if (iVipkmwdibw == 0) {
                this.f12774yggfygwlhe.istkbnxepw(i13, i14);
                return;
            }
            int i15 = Integer.MIN_VALUE;
            int i16 = Integer.MAX_VALUE;
            int i17 = Integer.MIN_VALUE;
            int i18 = Integer.MAX_VALUE;
            for (int i19 = 0; i19 < iVipkmwdibw; i19++) {
                View viewRibwqtqdhb = ribwqtqdhb(i19);
                Rect rect = this.f12774yggfygwlhe.f12673istkbnxepw;
                metgxyhuhe(viewRibwqtqdhb, rect);
                int i23 = rect.left;
                if (i23 < i18) {
                    i18 = i23;
                }
                int i24 = rect.right;
                if (i24 > i15) {
                    i15 = i24;
                }
                int i25 = rect.top;
                if (i25 < i16) {
                    i16 = i25;
                }
                int i26 = rect.bottom;
                if (i26 > i17) {
                    i17 = i26;
                }
            }
            this.f12774yggfygwlhe.f12673istkbnxepw.set(i18, i16, i15, i17);
            V(this.f12774yggfygwlhe.f12673istkbnxepw, i13, i14);
        }

        void X(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f12774yggfygwlhe = null;
                this.f12776zdlpuopuiu = null;
                this.f12770pkzmftpjix = 0;
                this.f12763hcddaimhww = 0;
            } else {
                this.f12774yggfygwlhe = recyclerView;
                this.f12776zdlpuopuiu = recyclerView.f12660esjtqupxsv;
                this.f12770pkzmftpjix = recyclerView.getWidth();
                this.f12763hcddaimhww = recyclerView.getHeight();
            }
            this.f12772wwaezpbzkn = 1073741824;
            this.f12775ylkuphrtab = 1073741824;
        }

        boolean Y(View view, int i13, int i14, vdvldrhtss vdvldrhtssVar) {
            return (!view.isLayoutRequested() && this.f12760cdpycssgdh && fyldjkxazc(view.getWidth(), i13, ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).width) && fyldjkxazc(view.getHeight(), i14, ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).height)) ? false : true;
        }

        boolean Z() {
            return false;
        }

        public void a(RecyclerView recyclerView, iwizpuwonk iwizpuwonkVar) {
            krqnebusok(recyclerView);
        }

        boolean a0(View view, int i13, int i14, vdvldrhtss vdvldrhtssVar) {
            return (this.f12760cdpycssgdh && fyldjkxazc(view.getMeasuredWidth(), i13, ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).width) && fyldjkxazc(view.getMeasuredHeight(), i14, ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).height)) ? false : true;
        }

        public boolean ageimvtcrz() {
            return this.f12760cdpycssgdh;
        }

        public void auzgnhcxok(View view, boolean z13, Rect rect) {
            Matrix matrix;
            if (z13) {
                Rect rect2 = ((vdvldrhtss) view.getLayoutParams()).f12786yggfygwlhe;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f12774yggfygwlhe != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f12774yggfygwlhe.f12718yadqdtsiqt;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public View b(View view, int i13, iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar) {
            return null;
        }

        public abstract void b0(RecyclerView recyclerView, zynmafqrjb zynmafqrjbVar, int i13);

        public int bfopjjpdmp() {
            return jhduphickx.lereixgezr(this.f12774yggfygwlhe);
        }

        public void c(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            d(recyclerView.f12682jyumaefscl, recyclerView.f12709uawqvzlxes, accessibilityEvent);
        }

        public void c0(pmvmpeiblj pmvmpeibljVar) {
            pmvmpeiblj pmvmpeibljVar2 = this.f12768lereixgezr;
            if (pmvmpeibljVar2 != null && pmvmpeibljVar != pmvmpeibljVar2 && pmvmpeibljVar2.isRunning()) {
                this.f12768lereixgezr.stop();
            }
            this.f12768lereixgezr = pmvmpeibljVar;
            pmvmpeibljVar.start(this.f12774yggfygwlhe, this);
        }

        public void cllcsxoeiz(View view, iwizpuwonk iwizpuwonkVar) {
            O(iwizpuwonkVar, this.f12776zdlpuopuiu.wflxmlrfwp(view), view);
        }

        public void cqumvgiudr(View view, int i13) {
            esjtqupxsv(view, i13, (vdvldrhtss) view.getLayoutParams());
        }

        public int crxdokpmqz() {
            return -1;
        }

        public int czzsidtyhn(View view) {
            Rect rect = ((vdvldrhtss) view.getLayoutParams()).f12786yggfygwlhe;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void d(iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z13 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f12774yggfygwlhe.canScrollVertically(-1) && !this.f12774yggfygwlhe.canScrollHorizontally(-1) && !this.f12774yggfygwlhe.canScrollHorizontally(1)) {
                z13 = false;
            }
            accessibilityEvent.setScrollable(z13);
            nufgyqmvbu nufgyqmvbuVar = this.f12774yggfygwlhe.f12671iozdgvuglv;
            if (nufgyqmvbuVar != null) {
                accessibilityEvent.setItemCount(nufgyqmvbuVar.getItemCount());
            }
        }

        void d0() {
            pmvmpeiblj pmvmpeibljVar = this.f12768lereixgezr;
            if (pmvmpeibljVar != null) {
                pmvmpeibljVar.stop();
            }
        }

        public void dsvhmnatus(int i13) {
            wypolnanlu(i13, ribwqtqdhb(i13));
        }

        public int dvvnrvtcbc() {
            return this.f12772wwaezpbzkn;
        }

        public void e(iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar, w1.zdlpuopuiu zdlpuopuiuVar) {
            if (this.f12774yggfygwlhe.canScrollVertically(-1) || this.f12774yggfygwlhe.canScrollHorizontally(-1)) {
                zdlpuopuiuVar.iobyxmoadg(8192);
                zdlpuopuiuVar.mhtqkkgtqm(true);
            }
            if (this.f12774yggfygwlhe.canScrollVertically(1) || this.f12774yggfygwlhe.canScrollHorizontally(1)) {
                zdlpuopuiuVar.iobyxmoadg(4096);
                zdlpuopuiuVar.mhtqkkgtqm(true);
            }
            zdlpuopuiuVar.ydmasvzmpa(w1.zdlpuopuiu.eablkybsjg.iobyxmoadg(tbqsvytpvh(iwizpuwonkVar, zynmafqrjbVar), jztzpxfvev(iwizpuwonkVar, zynmafqrjbVar), fiwbwshyhd(iwizpuwonkVar, zynmafqrjbVar), roivzttewh(iwizpuwonkVar, zynmafqrjbVar)));
        }

        public boolean e0() {
            return false;
        }

        public void esjtqupxsv(View view, int i13, vdvldrhtss vdvldrhtssVar) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(view);
            if (iozdgvuglvVarZfvoamnweg.isRemoved()) {
                this.f12774yggfygwlhe.f12685lereixgezr.zoijcleaow(iozdgvuglvVarZfvoamnweg);
            } else {
                this.f12774yggfygwlhe.f12685lereixgezr.rgvfuqvkyq(iozdgvuglvVarZfvoamnweg);
            }
            this.f12776zdlpuopuiu.ppxfxbqfkf(view, i13, vdvldrhtssVar, iozdgvuglvVarZfvoamnweg.isRemoved());
        }

        public void eslsurpljm(RecyclerView recyclerView) {
        }

        public void ezmngbhpjk(int i13) {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView != null) {
                recyclerView.grlcpdaxtj(i13);
            }
        }

        void f(w1.zdlpuopuiu zdlpuopuiuVar) {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            e(recyclerView.f12682jyumaefscl, recyclerView.f12709uawqvzlxes, zdlpuopuiuVar);
        }

        public boolean fiwbwshyhd(iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar) {
            return false;
        }

        public void fmlbqenlif(int i13) {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView != null) {
                recyclerView.ipoelvxyzq(i13);
            }
        }

        void g(View view, w1.zdlpuopuiu zdlpuopuiuVar) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(view);
            if (iozdgvuglvVarZfvoamnweg == null || iozdgvuglvVarZfvoamnweg.isRemoved() || this.f12776zdlpuopuiu.agtfadlqog(iozdgvuglvVarZfvoamnweg.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            h(recyclerView.f12682jyumaefscl, recyclerView.f12709uawqvzlxes, view, zdlpuopuiuVar);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView != null) {
                return jhduphickx.cdpycssgdh(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView != null) {
                return jhduphickx.yadqdtsiqt(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean grlcpdaxtj(View view, boolean z13, boolean z14) {
            boolean z15 = this.f12761cqumvgiudr.zoijcleaow(view, 24579) && this.f12762esjtqupxsv.zoijcleaow(view, 24579);
            return z13 ? z15 : !z15;
        }

        public void h(iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar, View view, w1.zdlpuopuiu zdlpuopuiuVar) {
        }

        public abstract int hcddaimhww(zynmafqrjb zynmafqrjbVar);

        public void hkdspvbjdz(iwizpuwonk iwizpuwonkVar) {
            for (int iVipkmwdibw = vipkmwdibw() - 1; iVipkmwdibw >= 0; iVipkmwdibw--) {
                O(iwizpuwonkVar, iVipkmwdibw, ribwqtqdhb(iVipkmwdibw));
            }
        }

        public final boolean hszhottldk() {
            return this.f12773yadqdtsiqt;
        }

        public View i(View view, int i13) {
            return null;
        }

        public boolean igdgnonuha() {
            return this.f12777zynmafqrjb;
        }

        public int iobyxmoadg() {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            nufgyqmvbu adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public void iozdgvuglv(int i13, ppxfxbqfkf ppxfxbqfkfVar) {
        }

        public boolean ipoelvxyzq() {
            pmvmpeiblj pmvmpeibljVar = this.f12768lereixgezr;
            return pmvmpeibljVar != null && pmvmpeibljVar.isRunning();
        }

        public boolean istkbnxepw(vdvldrhtss vdvldrhtssVar) {
            return vdvldrhtssVar != null;
        }

        public void iwizpuwonk(String str) {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView != null) {
                recyclerView.oxmwwwfdhm(str);
            }
        }

        public int iwxlajgraz() {
            return this.f12770pkzmftpjix;
        }

        public void ixidwrxhsl(View view, int i13, int i14) {
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) view.getLayoutParams();
            Rect rectWeqkydbzbr = this.f12774yggfygwlhe.weqkydbzbr(view);
            int i15 = i13 + rectWeqkydbzbr.left + rectWeqkydbzbr.right;
            int i16 = i14 + rectWeqkydbzbr.top + rectWeqkydbzbr.bottom;
            int iJhduphickx = jhduphickx(iwxlajgraz(), dvvnrvtcbc(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).leftMargin + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).rightMargin + i15, ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).width, pmvmpeiblj());
            int iJhduphickx2 = jhduphickx(zfvoamnweg(), oipsdeybqn(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).topMargin + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).bottomMargin + i16, ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).height, zynmafqrjb());
            if (Y(view, iJhduphickx, iJhduphickx2, vdvldrhtssVar)) {
                view.measure(iJhduphickx, iJhduphickx2);
            }
        }

        public int iyctptxqzt() {
            return jhduphickx.pmvmpeiblj(this.f12774yggfygwlhe);
        }

        public void j(RecyclerView recyclerView, int i13, int i14) {
        }

        public int jlmebxxoox(View view) {
            return ((vdvldrhtss) view.getLayoutParams()).f12786yggfygwlhe.bottom;
        }

        public abstract int jpowsppfya(zynmafqrjb zynmafqrjbVar);

        public void jrbgnlbqoe(int i13, int i14) {
            View viewRibwqtqdhb = ribwqtqdhb(i13);
            if (viewRibwqtqdhb != null) {
                dsvhmnatus(i13);
                cqumvgiudr(viewRibwqtqdhb, i14);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i13 + this.f12774yggfygwlhe.toString());
            }
        }

        public int jztzpxfvev(iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar) {
            return -1;
        }

        public void k(RecyclerView recyclerView) {
        }

        public void kcexrzcfyt(View view, int i13) {
            jyumaefscl(view, i13, true);
        }

        void kegysxyocb(RecyclerView recyclerView, iwizpuwonk iwizpuwonkVar) {
            this.f12777zynmafqrjb = false;
            a(recyclerView, iwizpuwonkVar);
        }

        public void krqnebusok(RecyclerView recyclerView) {
        }

        public void l(RecyclerView recyclerView, int i13, int i14, int i15) {
        }

        public void lereixgezr(View view, Rect rect) {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.weqkydbzbr(view));
            }
        }

        public abstract int lmojexxdyd(zynmafqrjb zynmafqrjbVar);

        public int lrnfpwlwnk(View view) {
            return ((vdvldrhtss) view.getLayoutParams()).zoijcleaow();
        }

        public abstract boolean lxfrhoxuzk();

        public void m(RecyclerView recyclerView, int i13, int i14) {
        }

        public View mbcevpiqjq(int i13) {
            int iVipkmwdibw = vipkmwdibw();
            for (int i14 = 0; i14 < iVipkmwdibw; i14++) {
                View viewRibwqtqdhb = ribwqtqdhb(i14);
                iozdgvuglv iozdgvuglvVarZfvoamnweg = RecyclerView.zfvoamnweg(viewRibwqtqdhb);
                if (iozdgvuglvVarZfvoamnweg != null && iozdgvuglvVarZfvoamnweg.getLayoutPosition() == i13 && !iozdgvuglvVarZfvoamnweg.shouldIgnore() && (this.f12774yggfygwlhe.f12709uawqvzlxes.eablkybsjg() || !iozdgvuglvVarZfvoamnweg.isRemoved())) {
                    return viewRibwqtqdhb;
                }
            }
            return null;
        }

        public void metgxyhuhe(View view, Rect rect) {
            RecyclerView.bfopjjpdmp(view, rect);
        }

        public void mhtqkkgtqm(View view, int i13, int i14, int i15, int i16) {
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) view.getLayoutParams();
            Rect rect = vdvldrhtssVar.f12786yggfygwlhe;
            view.layout(i13 + rect.left + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).leftMargin, i14 + rect.top + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).topMargin, (i15 - rect.right) - ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).rightMargin, (i16 - rect.bottom) - ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).bottomMargin);
        }

        public void n(RecyclerView recyclerView, int i13, int i14) {
        }

        public abstract vdvldrhtss ntlheqmsrt();

        public int nuxfzjnpeb(View view) {
            return ((vdvldrhtss) view.getLayoutParams()).f12786yggfygwlhe.right;
        }

        public void o(RecyclerView recyclerView, int i13, int i14, Object obj) {
            n(recyclerView, i13, i14);
        }

        public int oipsdeybqn() {
            return this.f12775ylkuphrtab;
        }

        public boolean okpsazkaxt() {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            return recyclerView != null && recyclerView.f12698pmvmpeiblj;
        }

        public int opjhrmiecq(View view) {
            return ((vdvldrhtss) view.getLayoutParams()).f12786yggfygwlhe.left;
        }

        public void oxmwwwfdhm(View view) {
            kcexrzcfyt(view, -1);
        }

        public abstract void p(iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar);

        public abstract int pkzmftpjix(zynmafqrjb zynmafqrjbVar);

        public abstract boolean pmvmpeiblj();

        public void q(zynmafqrjb zynmafqrjbVar) {
        }

        public void r(iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar, int i13, int i14) {
            this.f12774yggfygwlhe.istkbnxepw(i13, i14);
        }

        public void rhgxfdycjh(nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu nufgyqmvbuVar2) {
        }

        public View ribwqtqdhb(int i13) {
            androidx.recyclerview.widget.gxszxtbevo gxszxtbevoVar = this.f12776zdlpuopuiu;
            if (gxszxtbevoVar != null) {
                return gxszxtbevoVar.gxszxtbevo(i13);
            }
            return null;
        }

        public int rlfsiqarku(View view) {
            return view.getLeft() - opjhrmiecq(view);
        }

        public int roivzttewh(iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar) {
            return 0;
        }

        public boolean s(RecyclerView recyclerView, View view, View view2) {
            return ipoelvxyzq() || recyclerView.lxfrhoxuzk();
        }

        public View sflfametgt() {
            View focusedChild;
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f12776zdlpuopuiu.agtfadlqog(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        boolean skhdrjzrfn() {
            int iVipkmwdibw = vipkmwdibw();
            for (int i13 = 0; i13 < iVipkmwdibw; i13++) {
                ViewGroup.LayoutParams layoutParams = ribwqtqdhb(i13).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public vdvldrhtss sopmlzcsov(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof vdvldrhtss) {
                return new vdvldrhtss((vdvldrhtss) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new vdvldrhtss((ViewGroup.MarginLayoutParams) layoutParams) : new vdvldrhtss(layoutParams);
        }

        void stevsuqkhv(RecyclerView recyclerView) {
            this.f12777zynmafqrjb = true;
            eslsurpljm(recyclerView);
        }

        public boolean t(RecyclerView recyclerView, zynmafqrjb zynmafqrjbVar, View view, View view2) {
            return s(recyclerView, view, view2);
        }

        public int tbqsvytpvh(iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar) {
            return -1;
        }

        public View tzroggbefp(View view) {
            View viewJlmebxxoox;
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            if (recyclerView == null || (viewJlmebxxoox = recyclerView.jlmebxxoox(view)) == null || this.f12776zdlpuopuiu.agtfadlqog(viewJlmebxxoox)) {
                return null;
            }
            return viewJlmebxxoox;
        }

        public void u(Parcelable parcelable) {
        }

        public int uawqvzlxes(View view) {
            return ((vdvldrhtss) view.getLayoutParams()).f12786yggfygwlhe.top;
        }

        public vdvldrhtss ulzqkzuiru(Context context, AttributeSet attributeSet) {
            return new vdvldrhtss(context, attributeSet);
        }

        public int uwvvkdfqfp(View view) {
            Rect rect = ((vdvldrhtss) view.getLayoutParams()).f12786yggfygwlhe;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public Parcelable v() {
            return null;
        }

        public int vipkmwdibw() {
            androidx.recyclerview.widget.gxszxtbevo gxszxtbevoVar = this.f12776zdlpuopuiu;
            if (gxszxtbevoVar != null) {
                return gxszxtbevoVar.lqeggnwhkg();
            }
            return 0;
        }

        public void w(int i13) {
        }

        public int weqkydbzbr() {
            return jhduphickx.zynmafqrjb(this.f12774yggfygwlhe);
        }

        public abstract int wwaezpbzkn(zynmafqrjb zynmafqrjbVar);

        void x(pmvmpeiblj pmvmpeibljVar) {
            if (this.f12768lereixgezr == pmvmpeibljVar) {
                this.f12768lereixgezr = null;
            }
        }

        public int xrmfcynszj(View view) {
            return view.getBottom() + jlmebxxoox(view);
        }

        boolean y(int i13, Bundle bundle) {
            RecyclerView recyclerView = this.f12774yggfygwlhe;
            return z(recyclerView.f12682jyumaefscl, recyclerView.f12709uawqvzlxes, i13, bundle);
        }

        public void yadqdtsiqt(int i13, int i14, zynmafqrjb zynmafqrjbVar, ppxfxbqfkf ppxfxbqfkfVar) {
        }

        public int ydmasvzmpa(View view) {
            return view.getTop() - uawqvzlxes(view);
        }

        public int yfnezrywwk(View view) {
            return view.getRight() + nuxfzjnpeb(view);
        }

        public void yggfygwlhe(View view, int i13) {
            jyumaefscl(view, i13, false);
        }

        public abstract int ylkuphrtab(zynmafqrjb zynmafqrjbVar);

        public boolean yzdjzghtvl(RecyclerView recyclerView, ArrayList arrayList, int i13, int i14) {
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0067 A[PHI: r9
          0x0067: PHI (r9v8 int) = (r9v5 int), (r9v11 int) binds: [B:29:0x0084, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean z(iwizpuwonk iwizpuwonkVar, zynmafqrjb zynmafqrjbVar, int i13, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i14;
            int i15;
            if (this.f12774yggfygwlhe == null) {
                return false;
            }
            int iZfvoamnweg = zfvoamnweg();
            int iIwxlajgraz = iwxlajgraz();
            Rect rect = new Rect();
            if (this.f12774yggfygwlhe.getMatrix().isIdentity() && this.f12774yggfygwlhe.getGlobalVisibleRect(rect)) {
                iZfvoamnweg = rect.height();
                iIwxlajgraz = rect.width();
            }
            if (i13 == 4096) {
                paddingTop = this.f12774yggfygwlhe.canScrollVertically(1) ? (iZfvoamnweg - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.f12774yggfygwlhe.canScrollHorizontally(1)) {
                    paddingLeft = (iIwxlajgraz - getPaddingLeft()) - getPaddingRight();
                    i14 = paddingTop;
                    i15 = paddingLeft;
                } else {
                    i14 = paddingTop;
                    i15 = 0;
                }
            } else if (i13 != 8192) {
                i15 = 0;
                i14 = 0;
            } else {
                paddingTop = this.f12774yggfygwlhe.canScrollVertically(-1) ? -((iZfvoamnweg - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.f12774yggfygwlhe.canScrollHorizontally(-1)) {
                    paddingLeft = -((iIwxlajgraz - getPaddingLeft()) - getPaddingRight());
                    i14 = paddingTop;
                    i15 = paddingLeft;
                } else {
                    i14 = paddingTop;
                    i15 = 0;
                }
            }
            if (i14 == 0 && i15 == 0) {
                return false;
            }
            this.f12774yggfygwlhe.I(i15, i14, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void zdlpuopuiu(View view) {
            yggfygwlhe(view, -1);
        }

        public int zfvoamnweg() {
            return this.f12763hcddaimhww;
        }

        public abstract boolean zynmafqrjb();
    }

    public static abstract class wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private zoijcleaow f12790iobyxmoadg = null;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private ArrayList f12793zoijcleaow = new ArrayList();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private long f12791ppxfxbqfkf = 120;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private long f12792wkgbmnqykc = 120;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f12788eablkybsjg = 250;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private long f12789gxszxtbevo = 250;

        public interface iobyxmoadg {
            void iobyxmoadg();
        }

        public static class ppxfxbqfkf {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public int f12794iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            public int f12795ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            public int f12796wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            public int f12797zoijcleaow;

            public ppxfxbqfkf iobyxmoadg(iozdgvuglv iozdgvuglvVar) {
                return zoijcleaow(iozdgvuglvVar, 0);
            }

            public ppxfxbqfkf zoijcleaow(iozdgvuglv iozdgvuglvVar, int i13) {
                View view = iozdgvuglvVar.itemView;
                this.f12794iobyxmoadg = view.getLeft();
                this.f12797zoijcleaow = view.getTop();
                this.f12795ppxfxbqfkf = view.getRight();
                this.f12796wkgbmnqykc = view.getBottom();
                return this;
            }
        }

        interface zoijcleaow {
            void iobyxmoadg(iozdgvuglv iozdgvuglvVar);
        }

        static int eablkybsjg(iozdgvuglv iozdgvuglvVar) {
            int i13 = iozdgvuglvVar.mFlags;
            int i14 = i13 & 14;
            if (iozdgvuglvVar.isInvalid()) {
                return 4;
            }
            if ((i13 & 4) != 0) {
                return i14;
            }
            int oldPosition = iozdgvuglvVar.getOldPosition();
            int absoluteAdapterPosition = iozdgvuglvVar.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i14 : i14 | 2048;
        }

        public long agtfadlqog() {
            return this.f12788eablkybsjg;
        }

        public abstract void btonecajqb(iozdgvuglv iozdgvuglvVar);

        public void cqumvgiudr(long j13) {
            this.f12788eablkybsjg = j13;
        }

        public long draadjrbmk() {
            return this.f12791ppxfxbqfkf;
        }

        public final void dxjokdxxww() {
            if (this.f12793zoijcleaow.size() <= 0) {
                this.f12793zoijcleaow.clear();
            } else {
                androidx.appcompat.app.yggfygwlhe.iobyxmoadg(this.f12793zoijcleaow.get(0));
                throw null;
            }
        }

        public abstract void gtknphoqwx();

        public abstract boolean gxszxtbevo(iozdgvuglv iozdgvuglvVar);

        public abstract boolean iobyxmoadg(iozdgvuglv iozdgvuglvVar, ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2);

        void iwizpuwonk(zoijcleaow zoijcleaowVar) {
            this.f12790iobyxmoadg = zoijcleaowVar;
        }

        public abstract void jyumaefscl();

        public void kcexrzcfyt(iozdgvuglv iozdgvuglvVar) {
        }

        public boolean lqeggnwhkg(iozdgvuglv iozdgvuglvVar, List list) {
            return gxszxtbevo(iozdgvuglvVar);
        }

        public final void nufgyqmvbu(iozdgvuglv iozdgvuglvVar) {
            kcexrzcfyt(iozdgvuglvVar);
            zoijcleaow zoijcleaowVar = this.f12790iobyxmoadg;
            if (zoijcleaowVar != null) {
                zoijcleaowVar.iobyxmoadg(iozdgvuglvVar);
            }
        }

        public long ojitshcjhn() {
            return this.f12792wkgbmnqykc;
        }

        public ppxfxbqfkf oxmwwwfdhm() {
            return new ppxfxbqfkf();
        }

        public abstract boolean ppxfxbqfkf(iozdgvuglv iozdgvuglvVar, ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2);

        public abstract boolean rgvfuqvkyq();

        public final boolean vdvldrhtss(iobyxmoadg iobyxmoadgVar) {
            boolean zRgvfuqvkyq = rgvfuqvkyq();
            if (iobyxmoadgVar != null) {
                if (zRgvfuqvkyq) {
                    this.f12793zoijcleaow.add(iobyxmoadgVar);
                } else {
                    iobyxmoadgVar.iobyxmoadg();
                }
            }
            return zRgvfuqvkyq;
        }

        public long wflxmlrfwp() {
            return this.f12789gxszxtbevo;
        }

        public abstract boolean wkgbmnqykc(iozdgvuglv iozdgvuglvVar, ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2);

        public ppxfxbqfkf yggfygwlhe(zynmafqrjb zynmafqrjbVar, iozdgvuglv iozdgvuglvVar, int i13, List list) {
            return oxmwwwfdhm().iobyxmoadg(iozdgvuglvVar);
        }

        public ppxfxbqfkf zdlpuopuiu(zynmafqrjb zynmafqrjbVar, iozdgvuglv iozdgvuglvVar) {
            return oxmwwwfdhm().iobyxmoadg(iozdgvuglvVar);
        }

        public abstract boolean zoijcleaow(iozdgvuglv iozdgvuglvVar, iozdgvuglv iozdgvuglvVar2, ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2);
    }

    class wkgbmnqykc implements androidx.recyclerview.widget.zynmafqrjb.zoijcleaow {
        wkgbmnqykc() {
        }

        @Override // androidx.recyclerview.widget.zynmafqrjb.zoijcleaow
        public void iobyxmoadg(iozdgvuglv iozdgvuglvVar, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar2) {
            RecyclerView.this.ojitshcjhn(iozdgvuglvVar, ppxfxbqfkfVar, ppxfxbqfkfVar2);
        }

        @Override // androidx.recyclerview.widget.zynmafqrjb.zoijcleaow
        public void ppxfxbqfkf(iozdgvuglv iozdgvuglvVar, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar2) {
            RecyclerView.this.f12682jyumaefscl.dsvhmnatus(iozdgvuglvVar);
            RecyclerView.this.vdvldrhtss(iozdgvuglvVar, ppxfxbqfkfVar, ppxfxbqfkfVar2);
        }

        @Override // androidx.recyclerview.widget.zynmafqrjb.zoijcleaow
        public void wkgbmnqykc(iozdgvuglv iozdgvuglvVar, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar2) {
            iozdgvuglvVar.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f12656crxdokpmqz) {
                if (recyclerView.f12690metgxyhuhe.zoijcleaow(iozdgvuglvVar, iozdgvuglvVar, ppxfxbqfkfVar, ppxfxbqfkfVar2)) {
                    RecyclerView.this.c();
                }
            } else if (recyclerView.f12690metgxyhuhe.wkgbmnqykc(iozdgvuglvVar, ppxfxbqfkfVar, ppxfxbqfkfVar2)) {
                RecyclerView.this.c();
            }
        }

        @Override // androidx.recyclerview.widget.zynmafqrjb.zoijcleaow
        public void zoijcleaow(iozdgvuglv iozdgvuglvVar) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f12686lmojexxdyd.F(iozdgvuglvVar.itemView, recyclerView.f12682jyumaefscl);
        }
    }

    class yadqdtsiqt implements Runnable {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private boolean f12799cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private boolean f12800esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Interpolator f12801iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        OverScroller f12802jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f12804yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f12805zdlpuopuiu;

        yadqdtsiqt() {
            Interpolator interpolator = RecyclerView.f12646i;
            this.f12801iwizpuwonk = interpolator;
            this.f12799cqumvgiudr = false;
            this.f12800esjtqupxsv = false;
            this.f12802jyumaefscl = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int iobyxmoadg(int i13, int i14) {
            int iAbs = Math.abs(i13);
            int iAbs2 = Math.abs(i14);
            boolean z13 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z13 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z13) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void ppxfxbqfkf() {
            RecyclerView.this.removeCallbacks(this);
            jhduphickx.metgxyhuhe(RecyclerView.this, this);
        }

        public void eablkybsjg(int i13, int i14, int i15, Interpolator interpolator) {
            if (i15 == Integer.MIN_VALUE) {
                i15 = iobyxmoadg(i13, i14);
            }
            int i16 = i15;
            if (interpolator == null) {
                interpolator = RecyclerView.f12646i;
            }
            if (this.f12801iwizpuwonk != interpolator) {
                this.f12801iwizpuwonk = interpolator;
                this.f12802jyumaefscl = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f12804yggfygwlhe = 0;
            this.f12805zdlpuopuiu = 0;
            RecyclerView.this.setScrollState(2);
            this.f12802jyumaefscl.startScroll(0, 0, i13, i14, i16);
            wkgbmnqykc();
        }

        public void gxszxtbevo() {
            RecyclerView.this.removeCallbacks(this);
            this.f12802jyumaefscl.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i13;
            int i14;
            int i15;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f12686lmojexxdyd == null) {
                gxszxtbevo();
                return;
            }
            this.f12800esjtqupxsv = false;
            this.f12799cqumvgiudr = true;
            recyclerView.pmvmpeiblj();
            OverScroller overScroller = this.f12802jyumaefscl;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i16 = currX - this.f12805zdlpuopuiu;
                int i17 = currY - this.f12804yggfygwlhe;
                this.f12805zdlpuopuiu = currX;
                this.f12804yggfygwlhe = currY;
                int iCqumvgiudr = RecyclerView.this.cqumvgiudr(i16);
                int iLereixgezr = RecyclerView.this.lereixgezr(i17);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f12665grlcpdaxtj;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.jpowsppfya(iCqumvgiudr, iLereixgezr, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f12665grlcpdaxtj;
                    iCqumvgiudr -= iArr2[0];
                    iLereixgezr -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.iwizpuwonk(iCqumvgiudr, iLereixgezr);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f12671iozdgvuglv != null) {
                    int[] iArr3 = recyclerView3.f12665grlcpdaxtj;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.z(iCqumvgiudr, iLereixgezr, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f12665grlcpdaxtj;
                    i14 = iArr4[0];
                    i13 = iArr4[1];
                    iCqumvgiudr -= i14;
                    iLereixgezr -= i13;
                    pmvmpeiblj pmvmpeibljVar = recyclerView4.f12686lmojexxdyd.f12768lereixgezr;
                    if (pmvmpeibljVar != null && !pmvmpeibljVar.isPendingInitialRun() && pmvmpeibljVar.isRunning()) {
                        int iZoijcleaow = RecyclerView.this.f12709uawqvzlxes.zoijcleaow();
                        if (iZoijcleaow == 0) {
                            pmvmpeibljVar.stop();
                        } else if (pmvmpeibljVar.getTargetPosition() >= iZoijcleaow) {
                            pmvmpeibljVar.setTargetPosition(iZoijcleaow - 1);
                            pmvmpeibljVar.onAnimation(i14, i13);
                        } else {
                            pmvmpeibljVar.onAnimation(i14, i13);
                        }
                    }
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                if (!RecyclerView.this.f12722ylkuphrtab.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f12665grlcpdaxtj;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.hkdspvbjdz(i14, i13, iCqumvgiudr, iLereixgezr, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f12665grlcpdaxtj;
                int i18 = iCqumvgiudr - iArr6[0];
                int i19 = iLereixgezr - iArr6[1];
                if (i14 != 0 || i13 != 0) {
                    recyclerView6.dsvhmnatus(i14, i13);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z13 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
                pmvmpeiblj pmvmpeibljVar2 = RecyclerView.this.f12686lmojexxdyd.f12768lereixgezr;
                if ((pmvmpeibljVar2 == null || !pmvmpeibljVar2.isPendingInitialRun()) && z13) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i18 < 0) {
                            i15 = -currVelocity;
                        } else {
                            i15 = i18 > 0 ? currVelocity : 0;
                        }
                        if (i19 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i19 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.zoijcleaow(i15, currVelocity);
                    }
                    if (RecyclerView.f12641e) {
                        RecyclerView.this.f12702roivzttewh.zoijcleaow();
                    }
                } else {
                    wkgbmnqykc();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.gtknphoqwx gtknphoqwxVar = recyclerView7.f12707tbqsvytpvh;
                    if (gtknphoqwxVar != null) {
                        gtknphoqwxVar.gxszxtbevo(recyclerView7, i14, i13);
                    }
                }
            }
            pmvmpeiblj pmvmpeibljVar3 = RecyclerView.this.f12686lmojexxdyd.f12768lereixgezr;
            if (pmvmpeibljVar3 != null && pmvmpeibljVar3.isPendingInitialRun()) {
                pmvmpeibljVar3.onAnimation(0, 0);
            }
            this.f12799cqumvgiudr = false;
            if (this.f12800esjtqupxsv) {
                ppxfxbqfkf();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.O(1);
            }
        }

        void wkgbmnqykc() {
            if (this.f12799cqumvgiudr) {
                this.f12800esjtqupxsv = true;
            } else {
                ppxfxbqfkf();
            }
        }

        public void zoijcleaow(int i13, int i14) {
            RecyclerView.this.setScrollState(2);
            this.f12804yggfygwlhe = 0;
            this.f12805zdlpuopuiu = 0;
            Interpolator interpolator = this.f12801iwizpuwonk;
            Interpolator interpolator2 = RecyclerView.f12646i;
            if (interpolator != interpolator2) {
                this.f12801iwizpuwonk = interpolator2;
                this.f12802jyumaefscl = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f12802jyumaefscl.fling(0, 0, i13, i14, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            wkgbmnqykc();
        }
    }

    public static abstract class yggfygwlhe {
        public void onScrollStateChanged(RecyclerView recyclerView, int i13) {
        }

        public void onScrolled(RecyclerView recyclerView, int i13, int i14) {
        }
    }

    public interface zdlpuopuiu {
        void eablkybsjg(boolean z13);

        void iobyxmoadg(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean ppxfxbqfkf(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    class zoijcleaow implements Runnable {
        zoijcleaow() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wflxmlrfwp wflxmlrfwpVar = RecyclerView.this.f12690metgxyhuhe;
            if (wflxmlrfwpVar != null) {
                wflxmlrfwpVar.jyumaefscl();
            }
            RecyclerView.this.f12688lxfrhoxuzk = false;
        }
    }

    public static class zynmafqrjb {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        long f12807agtfadlqog;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        int f12817ojitshcjhn;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        int f12819rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        int f12820vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        int f12821wflxmlrfwp;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private SparseArray f12823zoijcleaow;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f12814iobyxmoadg = -1;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f12818ppxfxbqfkf = 0;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f12822wkgbmnqykc = 0;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f12811eablkybsjg = 1;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        int f12813gxszxtbevo = 0;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        boolean f12815lqeggnwhkg = false;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        boolean f12816nufgyqmvbu = false;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        boolean f12810dxjokdxxww = false;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        boolean f12808btonecajqb = false;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        boolean f12812gtknphoqwx = false;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        boolean f12809draadjrbmk = false;

        public boolean eablkybsjg() {
            return this.f12816nufgyqmvbu;
        }

        void gxszxtbevo(nufgyqmvbu nufgyqmvbuVar) {
            this.f12811eablkybsjg = 1;
            this.f12813gxszxtbevo = nufgyqmvbuVar.getItemCount();
            this.f12816nufgyqmvbu = false;
            this.f12810dxjokdxxww = false;
            this.f12808btonecajqb = false;
        }

        void iobyxmoadg(int i13) {
            if ((this.f12811eablkybsjg & i13) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i13) + " but it is " + Integer.toBinaryString(this.f12811eablkybsjg));
        }

        public boolean lqeggnwhkg() {
            return this.f12809draadjrbmk;
        }

        public int ppxfxbqfkf() {
            return this.f12814iobyxmoadg;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f12814iobyxmoadg + ", mData=" + this.f12823zoijcleaow + ", mItemCount=" + this.f12813gxszxtbevo + ", mIsMeasuring=" + this.f12808btonecajqb + ", mPreviousLayoutItemCount=" + this.f12818ppxfxbqfkf + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f12822wkgbmnqykc + ", mStructureChanged=" + this.f12815lqeggnwhkg + ", mInPreLayout=" + this.f12816nufgyqmvbu + ", mRunSimpleAnimations=" + this.f12812gtknphoqwx + ", mRunPredictiveAnimations=" + this.f12809draadjrbmk + '}';
        }

        public boolean wkgbmnqykc() {
            return this.f12814iobyxmoadg != -1;
        }

        public int zoijcleaow() {
            return this.f12816nufgyqmvbu ? this.f12818ppxfxbqfkf - this.f12822wkgbmnqykc : this.f12813gxszxtbevo;
        }
    }

    static {
        Class cls = Integer.TYPE;
        f12645h = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f12646i = new ppxfxbqfkf();
        f12647j = new istkbnxepw();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void B(nufgyqmvbu nufgyqmvbuVar, boolean z13, boolean z14) {
        nufgyqmvbu nufgyqmvbuVar2 = this.f12671iozdgvuglv;
        if (nufgyqmvbuVar2 != null) {
            nufgyqmvbuVar2.unregisterAdapterDataObserver(this.f12721yggfygwlhe);
            this.f12671iozdgvuglv.onDetachedFromRecyclerView(this);
        }
        if (!z13 || z14) {
            m();
        }
        this.f12655cqumvgiudr.esjtqupxsv();
        nufgyqmvbu nufgyqmvbuVar3 = this.f12671iozdgvuglv;
        this.f12671iozdgvuglv = nufgyqmvbuVar;
        if (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.registerAdapterDataObserver(this.f12721yggfygwlhe);
            nufgyqmvbuVar.onAttachedToRecyclerView(this);
        }
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.rhgxfdycjh(nufgyqmvbuVar3, this.f12671iozdgvuglv);
        }
        this.f12682jyumaefscl.esjtqupxsv(nufgyqmvbuVar3, this.f12671iozdgvuglv, z13);
        this.f12709uawqvzlxes.f12815lqeggnwhkg = true;
    }

    private boolean D(EdgeEffect edgeEffect, int i13, int i14) {
        if (i13 > 0) {
            return true;
        }
        return lrnfpwlwnk(-i13) < androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect) * ((float) i14);
    }

    private boolean M(MotionEvent motionEvent) {
        boolean z13;
        EdgeEffect edgeEffect = this.f12670ikoacuggdj;
        if (edgeEffect == null || androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z13 = false;
        } else {
            androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12670ikoacuggdj, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z13 = true;
        }
        EdgeEffect edgeEffect2 = this.f12683jztzpxfvev;
        if (edgeEffect2 != null && androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12683jztzpxfvev, 0.0f, motionEvent.getY() / getHeight());
            z13 = true;
        }
        EdgeEffect edgeEffect3 = this.f12695okpsazkaxt;
        if (edgeEffect3 != null && androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12695okpsazkaxt, 0.0f, motionEvent.getX() / getWidth());
            z13 = true;
        }
        EdgeEffect edgeEffect4 = this.f12717xrmfcynszj;
        if (edgeEffect4 == null || androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z13;
        }
        androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12717xrmfcynszj, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void Q() {
        this.f12693nuxfzjnpeb.gxszxtbevo();
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.d0();
        }
    }

    private void auzgnhcxok() {
        this.f12660esjtqupxsv = new androidx.recyclerview.widget.gxszxtbevo(new eablkybsjg());
    }

    static void bfopjjpdmp(View view, Rect rect) {
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) view.getLayoutParams();
        Rect rect2 = vdvldrhtssVar.f12786yggfygwlhe;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).bottomMargin);
    }

    private boolean cdpycssgdh(int i13, int i14) {
        jhduphickx(this.f12662fiwbwshyhd);
        int[] iArr = this.f12662fiwbwshyhd;
        return (iArr[0] == i13 && iArr[1] == i14) ? false : true;
    }

    private boolean d() {
        return this.f12690metgxyhuhe != null && this.f12686lmojexxdyd.e0();
    }

    private void dxjokdxxww(iozdgvuglv iozdgvuglvVar) {
        View view = iozdgvuglvVar.itemView;
        boolean z13 = view.getParent() == this;
        this.f12682jyumaefscl.dsvhmnatus(sflfametgt(view));
        if (iozdgvuglvVar.isTmpDetached()) {
            this.f12660esjtqupxsv.ppxfxbqfkf(view, -1, view.getLayoutParams(), true);
        } else if (z13) {
            this.f12660esjtqupxsv.gtknphoqwx(view);
        } else {
            this.f12660esjtqupxsv.zoijcleaow(view, true);
        }
    }

    private void e() {
        boolean z13;
        if (this.f12656crxdokpmqz) {
            this.f12655cqumvgiudr.esjtqupxsv();
            if (this.f12679jlmebxxoox) {
                this.f12686lmojexxdyd.k(this);
            }
        }
        if (d()) {
            this.f12655cqumvgiudr.iwizpuwonk();
        } else {
            this.f12655cqumvgiudr.btonecajqb();
        }
        boolean z14 = this.f12659dvvnrvtcbc || this.f12704skhdrjzrfn;
        this.f12709uawqvzlxes.f12812gtknphoqwx = this.f12658dsvhmnatus && this.f12690metgxyhuhe != null && ((z13 = this.f12656crxdokpmqz) || z14 || this.f12686lmojexxdyd.f12771pmvmpeiblj) && (!z13 || this.f12671iozdgvuglv.hasStableIds());
        zynmafqrjb zynmafqrjbVar = this.f12709uawqvzlxes;
        zynmafqrjbVar.f12809draadjrbmk = zynmafqrjbVar.f12812gtknphoqwx && z14 && !this.f12656crxdokpmqz && d();
    }

    private int esjtqupxsv(int i13, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i14) {
        if (i13 > 0 && edgeEffect != null && androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i14) / 4.0f) * androidx.core.widget.wkgbmnqykc.wkgbmnqykc(edgeEffect, ((-i13) * 4.0f) / i14, 0.5f));
            if (iRound != i13) {
                edgeEffect.finish();
            }
            return i13 - iRound;
        }
        if (i13 >= 0 || edgeEffect2 == null || androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect2) == 0.0f) {
            return i13;
        }
        float f13 = i14;
        int iRound2 = Math.round((f13 / 4.0f) * androidx.core.widget.wkgbmnqykc.wkgbmnqykc(edgeEffect2, (i13 * 4.0f) / f13, 0.5f));
        if (iRound2 != i13) {
            edgeEffect2.finish();
        }
        return i13 - iRound2;
    }

    private void fyldjkxazc(int i13, int i14, MotionEvent motionEvent, int i15) {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f12684kegysxyocb) {
            return;
        }
        int[] iArr = this.f12665grlcpdaxtj;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zPmvmpeiblj = rgvfuqvkyqVar.pmvmpeiblj();
        boolean zZynmafqrjb = this.f12686lmojexxdyd.zynmafqrjb();
        int i16 = zZynmafqrjb ? (zPmvmpeiblj ? 1 : 0) | 2 : zPmvmpeiblj ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iK = i13 - k(i13, height);
        int iL = i14 - l(i14, width);
        L(i16, i15);
        if (jpowsppfya(zPmvmpeiblj ? iK : 0, zZynmafqrjb ? iL : 0, this.f12665grlcpdaxtj, this.f12664fyldjkxazc, i15)) {
            int[] iArr2 = this.f12665grlcpdaxtj;
            iK -= iArr2[0];
            iL -= iArr2[1];
        }
        y(zPmvmpeiblj ? iK : 0, zZynmafqrjb ? iL : 0, motionEvent, i15);
        androidx.recyclerview.widget.gtknphoqwx gtknphoqwxVar = this.f12707tbqsvytpvh;
        if (gtknphoqwxVar != null && (iK != 0 || iL != 0)) {
            gtknphoqwxVar.gxszxtbevo(this, iK, iL);
        }
        O(i15);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void g(float f13, float f14, float f15, float f16) {
        boolean z13;
        boolean z14 = true;
        if (f14 >= 0.0f) {
            if (f14 > 0.0f) {
                mbcevpiqjq();
                androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12683jztzpxfvev, f14 / getWidth(), f15 / getHeight());
            } else {
                z13 = false;
            }
            if (f16 < 0.0f) {
                ntlheqmsrt();
                androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12695okpsazkaxt, (-f16) / getHeight(), f13 / getWidth());
            } else if (f16 > 0.0f) {
                kegysxyocb();
                androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12717xrmfcynszj, f16 / getHeight(), 1.0f - (f13 / getWidth()));
            } else {
                z14 = z13;
            }
            if (z14 && f14 == 0.0f && f16 == 0.0f) {
                return;
            }
            jhduphickx.xrmfcynszj(this);
        }
        tzroggbefp();
        androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12670ikoacuggdj, (-f14) / getWidth(), 1.0f - (f15 / getHeight()));
        z13 = true;
        if (f16 < 0.0f) {
            ntlheqmsrt();
            androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12695okpsazkaxt, (-f16) / getHeight(), f13 / getWidth());
        } else if (f16 > 0.0f) {
            kegysxyocb();
            androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12717xrmfcynszj, f16 / getHeight(), 1.0f - (f13 / getWidth()));
        } else {
            z14 = z13;
        }
        if (z14) {
        }
        jhduphickx.xrmfcynszj(this);
    }

    private v1.iozdgvuglv getScrollingChildHelper() {
        if (this.f12650ageimvtcrz == null) {
            this.f12650ageimvtcrz = new v1.iozdgvuglv(this);
        }
        return this.f12650ageimvtcrz;
    }

    private void hcddaimhww() {
        this.f12709uawqvzlxes.iobyxmoadg(4);
        K();
        rhgxfdycjh();
        zynmafqrjb zynmafqrjbVar = this.f12709uawqvzlxes;
        zynmafqrjbVar.f12811eablkybsjg = 1;
        if (zynmafqrjbVar.f12812gtknphoqwx) {
            for (int iLqeggnwhkg = this.f12660esjtqupxsv.lqeggnwhkg() - 1; iLqeggnwhkg >= 0; iLqeggnwhkg--) {
                iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.gxszxtbevo(iLqeggnwhkg));
                if (!iozdgvuglvVarZfvoamnweg.shouldIgnore()) {
                    long jUwvvkdfqfp = uwvvkdfqfp(iozdgvuglvVarZfvoamnweg);
                    wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVarZdlpuopuiu = this.f12690metgxyhuhe.zdlpuopuiu(this.f12709uawqvzlxes, iozdgvuglvVarZfvoamnweg);
                    iozdgvuglv iozdgvuglvVarLqeggnwhkg = this.f12685lereixgezr.lqeggnwhkg(jUwvvkdfqfp);
                    if (iozdgvuglvVarLqeggnwhkg == null || iozdgvuglvVarLqeggnwhkg.shouldIgnore()) {
                        this.f12685lereixgezr.wkgbmnqykc(iozdgvuglvVarZfvoamnweg, ppxfxbqfkfVarZdlpuopuiu);
                    } else {
                        boolean zNufgyqmvbu = this.f12685lereixgezr.nufgyqmvbu(iozdgvuglvVarLqeggnwhkg);
                        boolean zNufgyqmvbu2 = this.f12685lereixgezr.nufgyqmvbu(iozdgvuglvVarZfvoamnweg);
                        if (zNufgyqmvbu && iozdgvuglvVarLqeggnwhkg == iozdgvuglvVarZfvoamnweg) {
                            this.f12685lereixgezr.wkgbmnqykc(iozdgvuglvVarZfvoamnweg, ppxfxbqfkfVarZdlpuopuiu);
                        } else {
                            wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVarAgtfadlqog = this.f12685lereixgezr.agtfadlqog(iozdgvuglvVarLqeggnwhkg);
                            this.f12685lereixgezr.wkgbmnqykc(iozdgvuglvVarZfvoamnweg, ppxfxbqfkfVarZdlpuopuiu);
                            wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = this.f12685lereixgezr.wflxmlrfwp(iozdgvuglvVarZfvoamnweg);
                            if (ppxfxbqfkfVarAgtfadlqog == null) {
                                zeieaojujs(jUwvvkdfqfp, iozdgvuglvVarZfvoamnweg, iozdgvuglvVarLqeggnwhkg);
                            } else {
                                rgvfuqvkyq(iozdgvuglvVarLqeggnwhkg, iozdgvuglvVarZfvoamnweg, ppxfxbqfkfVarAgtfadlqog, ppxfxbqfkfVarWflxmlrfwp, zNufgyqmvbu, zNufgyqmvbu2);
                            }
                        }
                    }
                }
            }
            this.f12685lereixgezr.ojitshcjhn(this.f12699rhgxfdycjh);
        }
        this.f12686lmojexxdyd.E(this.f12682jyumaefscl);
        zynmafqrjb zynmafqrjbVar2 = this.f12709uawqvzlxes;
        zynmafqrjbVar2.f12818ppxfxbqfkf = zynmafqrjbVar2.f12813gxszxtbevo;
        this.f12656crxdokpmqz = false;
        this.f12679jlmebxxoox = false;
        zynmafqrjbVar2.f12812gtknphoqwx = false;
        zynmafqrjbVar2.f12809draadjrbmk = false;
        this.f12686lmojexxdyd.f12771pmvmpeiblj = false;
        ArrayList arrayList = this.f12682jyumaefscl.f12740zoijcleaow;
        if (arrayList != null) {
            arrayList.clear();
        }
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar.f12769lmojexxdyd) {
            rgvfuqvkyqVar.f12764iozdgvuglv = 0;
            rgvfuqvkyqVar.f12769lmojexxdyd = false;
            this.f12682jyumaefscl.wypolnanlu();
        }
        this.f12686lmojexxdyd.q(this.f12709uawqvzlxes);
        yzdjzghtvl();
        N(false);
        this.f12685lereixgezr.gxszxtbevo();
        int[] iArr = this.f12662fiwbwshyhd;
        if (cdpycssgdh(iArr[0], iArr[1])) {
            dsvhmnatus(0, 0);
        }
        i();
        u();
    }

    private void i() {
        View viewFindViewById;
        if (!this.f12724zeieaojujs || this.f12671iozdgvuglv == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f12644g || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f12660esjtqupxsv.agtfadlqog(focusedChild)) {
                    return;
                }
            } else if (this.f12660esjtqupxsv.lqeggnwhkg() == 0) {
                requestFocus();
                return;
            }
        }
        View viewOkpsazkaxt = null;
        iozdgvuglv iozdgvuglvVarXrmfcynszj = (this.f12709uawqvzlxes.f12807agtfadlqog == -1 || !this.f12671iozdgvuglv.hasStableIds()) ? null : xrmfcynszj(this.f12709uawqvzlxes.f12807agtfadlqog);
        if (iozdgvuglvVarXrmfcynszj != null && !this.f12660esjtqupxsv.agtfadlqog(iozdgvuglvVarXrmfcynszj.itemView) && iozdgvuglvVarXrmfcynszj.itemView.hasFocusable()) {
            viewOkpsazkaxt = iozdgvuglvVarXrmfcynszj.itemView;
        } else if (this.f12660esjtqupxsv.lqeggnwhkg() > 0) {
            viewOkpsazkaxt = okpsazkaxt();
        }
        if (viewOkpsazkaxt != null) {
            int i13 = this.f12709uawqvzlxes.f12817ojitshcjhn;
            if (i13 != -1 && (viewFindViewById = viewOkpsazkaxt.findViewById(i13)) != null && viewFindViewById.isFocusable()) {
                viewOkpsazkaxt = viewFindViewById;
            }
            viewOkpsazkaxt.requestFocus();
        }
    }

    static RecyclerView ikoacuggdj(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            RecyclerView recyclerViewIkoacuggdj = ikoacuggdj(viewGroup.getChildAt(i13));
            if (recyclerViewIkoacuggdj != null) {
                return recyclerViewIkoacuggdj;
            }
        }
        return null;
    }

    private String iyctptxqzt(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void j() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f12670ikoacuggdj;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f12670ikoacuggdj.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f12695okpsazkaxt;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f12695okpsazkaxt.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f12683jztzpxfvev;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f12683jztzpxfvev.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f12717xrmfcynszj;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f12717xrmfcynszj.isFinished();
        }
        if (zIsFinished) {
            jhduphickx.xrmfcynszj(this);
        }
    }

    private void jhduphickx(int[] iArr) {
        int iLqeggnwhkg = this.f12660esjtqupxsv.lqeggnwhkg();
        if (iLqeggnwhkg == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        for (int i15 = 0; i15 < iLqeggnwhkg; i15++) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.gxszxtbevo(i15));
            if (!iozdgvuglvVarZfvoamnweg.shouldIgnore()) {
                int layoutPosition = iozdgvuglvVarZfvoamnweg.getLayoutPosition();
                if (layoutPosition < i13) {
                    i13 = layoutPosition;
                }
                if (layoutPosition > i14) {
                    i14 = layoutPosition;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
    }

    private int k(int i13, float f13) {
        float height = f13 / getHeight();
        float width = i13 / getWidth();
        EdgeEffect edgeEffect = this.f12670ikoacuggdj;
        float f14 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f12683jztzpxfvev;
            if (edgeEffect2 != null && androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f12683jztzpxfvev.onRelease();
                } else {
                    float fWkgbmnqykc = androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12683jztzpxfvev, width, height);
                    if (androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f12683jztzpxfvev) == 0.0f) {
                        this.f12683jztzpxfvev.onRelease();
                    }
                    f14 = fWkgbmnqykc;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f12670ikoacuggdj.onRelease();
            } else {
                float f15 = -androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12670ikoacuggdj, -width, 1.0f - height);
                if (androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f12670ikoacuggdj) == 0.0f) {
                    this.f12670ikoacuggdj.onRelease();
                }
                f14 = f15;
            }
            invalidate();
        }
        return Math.round(f14 * getWidth());
    }

    private void krqnebusok(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f12657czzsidtyhn) {
            int i13 = actionIndex == 0 ? 1 : 0;
            this.f12657czzsidtyhn = motionEvent.getPointerId(i13);
            int x13 = (int) (motionEvent.getX(i13) + 0.5f);
            this.f12703sflfametgt = x13;
            this.f12720yfnezrywwk = x13;
            int y13 = (int) (motionEvent.getY(i13) + 0.5f);
            this.f12725zfvoamnweg = y13;
            this.f12719ydmasvzmpa = y13;
        }
    }

    private int l(int i13, float f13) {
        float width = f13 / getWidth();
        float height = i13 / getHeight();
        EdgeEffect edgeEffect = this.f12695okpsazkaxt;
        float f14 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f12717xrmfcynszj;
            if (edgeEffect2 != null && androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f12717xrmfcynszj.onRelease();
                } else {
                    float fWkgbmnqykc = androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12717xrmfcynszj, height, 1.0f - width);
                    if (androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f12717xrmfcynszj) == 0.0f) {
                        this.f12717xrmfcynszj.onRelease();
                    }
                    f14 = fWkgbmnqykc;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f12695okpsazkaxt.onRelease();
            } else {
                float f15 = -androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f12695okpsazkaxt, -height, width);
                if (androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f12695okpsazkaxt) == 0.0f) {
                    this.f12695okpsazkaxt.onRelease();
                }
                f14 = f15;
            }
            invalidate();
        }
        return Math.round(f14 * getHeight());
    }

    private void lmojexxdyd() {
        int i13 = this.f12689mbcevpiqjq;
        this.f12689mbcevpiqjq = 0;
        if (i13 == 0 || !igdgnonuha()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        w1.zoijcleaow.ppxfxbqfkf(accessibilityEventObtain, i13);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private float lrnfpwlwnk(int i13) {
        double dLog = Math.log((Math.abs(i13) * 0.35f) / (this.f12723zdlpuopuiu * 0.015f));
        float f13 = f12637a;
        return (float) (((double) (this.f12723zdlpuopuiu * 0.015f)) * Math.exp((((double) f13) / (((double) f13) - 1.0d)) * dLog));
    }

    private View okpsazkaxt() {
        iozdgvuglv iozdgvuglvVarJztzpxfvev;
        zynmafqrjb zynmafqrjbVar = this.f12709uawqvzlxes;
        int i13 = zynmafqrjbVar.f12821wflxmlrfwp;
        if (i13 == -1) {
            i13 = 0;
        }
        int iZoijcleaow = zynmafqrjbVar.zoijcleaow();
        for (int i14 = i13; i14 < iZoijcleaow; i14++) {
            iozdgvuglv iozdgvuglvVarJztzpxfvev2 = jztzpxfvev(i14);
            if (iozdgvuglvVarJztzpxfvev2 == null) {
                break;
            }
            if (iozdgvuglvVarJztzpxfvev2.itemView.hasFocusable()) {
                return iozdgvuglvVarJztzpxfvev2.itemView;
            }
        }
        int iMin = Math.min(iZoijcleaow, i13);
        do {
            iMin--;
            if (iMin < 0 || (iozdgvuglvVarJztzpxfvev = jztzpxfvev(iMin)) == null) {
                return null;
            }
        } while (!iozdgvuglvVarJztzpxfvev.itemView.hasFocusable());
        return iozdgvuglvVarJztzpxfvev.itemView;
    }

    private int opjhrmiecq(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private void pkzmftpjix() {
        K();
        rhgxfdycjh();
        this.f12709uawqvzlxes.iobyxmoadg(6);
        this.f12655cqumvgiudr.btonecajqb();
        this.f12709uawqvzlxes.f12813gxszxtbevo = this.f12671iozdgvuglv.getItemCount();
        this.f12709uawqvzlxes.f12822wkgbmnqykc = 0;
        if (this.f12674iwizpuwonk != null && this.f12671iozdgvuglv.canRestoreState()) {
            Parcelable parcelable = this.f12674iwizpuwonk.f12727jyumaefscl;
            if (parcelable != null) {
                this.f12686lmojexxdyd.u(parcelable);
            }
            this.f12674iwizpuwonk = null;
        }
        zynmafqrjb zynmafqrjbVar = this.f12709uawqvzlxes;
        zynmafqrjbVar.f12816nufgyqmvbu = false;
        this.f12686lmojexxdyd.p(this.f12682jyumaefscl, zynmafqrjbVar);
        zynmafqrjb zynmafqrjbVar2 = this.f12709uawqvzlxes;
        zynmafqrjbVar2.f12815lqeggnwhkg = false;
        zynmafqrjbVar2.f12812gtknphoqwx = zynmafqrjbVar2.f12812gtknphoqwx && this.f12690metgxyhuhe != null;
        zynmafqrjbVar2.f12811eablkybsjg = 4;
        yzdjzghtvl();
        N(false);
    }

    private void rgvfuqvkyq(iozdgvuglv iozdgvuglvVar, iozdgvuglv iozdgvuglvVar2, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar2, boolean z13, boolean z14) {
        iozdgvuglvVar.setIsRecyclable(false);
        if (z13) {
            dxjokdxxww(iozdgvuglvVar);
        }
        if (iozdgvuglvVar != iozdgvuglvVar2) {
            if (z14) {
                dxjokdxxww(iozdgvuglvVar2);
            }
            iozdgvuglvVar.mShadowedHolder = iozdgvuglvVar2;
            dxjokdxxww(iozdgvuglvVar);
            this.f12682jyumaefscl.dsvhmnatus(iozdgvuglvVar);
            iozdgvuglvVar2.setIsRecyclable(false);
            iozdgvuglvVar2.mShadowingHolder = iozdgvuglvVar;
        }
        if (this.f12690metgxyhuhe.zoijcleaow(iozdgvuglvVar, iozdgvuglvVar2, ppxfxbqfkfVar, ppxfxbqfkfVar2)) {
            c();
        }
    }

    public static void setDebugAssertionsEnabled(boolean z13) {
        f12649yzdjzghtvl = z13;
    }

    public static void setVerboseLoggingEnabled(boolean z13) {
        f12642eslsurpljm = z13;
    }

    private boolean stevsuqkhv(MotionEvent motionEvent) {
        zdlpuopuiu zdlpuopuiuVar = this.f12666hcddaimhww;
        if (zdlpuopuiuVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return vipkmwdibw(motionEvent);
        }
        zdlpuopuiuVar.iobyxmoadg(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f12666hcddaimhww = null;
        }
        return true;
    }

    private void t(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f12673istkbnxepw.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof vdvldrhtss) {
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) layoutParams;
            if (!vdvldrhtssVar.f12785jyumaefscl) {
                Rect rect = vdvldrhtssVar.f12786yggfygwlhe;
                Rect rect2 = this.f12673istkbnxepw;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f12673istkbnxepw);
            offsetRectIntoDescendantCoords(view, this.f12673istkbnxepw);
        }
        this.f12686lmojexxdyd.L(this, view, this.f12673istkbnxepw, !this.f12658dsvhmnatus, view2 == null);
    }

    private boolean tbqsvytpvh() {
        int iLqeggnwhkg = this.f12660esjtqupxsv.lqeggnwhkg();
        for (int i13 = 0; i13 < iLqeggnwhkg; i13++) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.gxszxtbevo(i13));
            if (iozdgvuglvVarZfvoamnweg != null && !iozdgvuglvVarZfvoamnweg.shouldIgnore() && iozdgvuglvVarZfvoamnweg.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void u() {
        zynmafqrjb zynmafqrjbVar = this.f12709uawqvzlxes;
        zynmafqrjbVar.f12807agtfadlqog = -1L;
        zynmafqrjbVar.f12821wflxmlrfwp = -1;
        zynmafqrjbVar.f12817ojitshcjhn = -1;
    }

    private void uawqvzlxes() {
        if (jhduphickx.esjtqupxsv(this) == 0) {
            jhduphickx.iwxlajgraz(this, 8);
        }
    }

    private void v() {
        VelocityTracker velocityTracker = this.f12711uwvvkdfqfp;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        O(0);
        j();
    }

    private boolean vipkmwdibw(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f12697pkzmftpjix.size();
        for (int i13 = 0; i13 < size; i13++) {
            zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) this.f12697pkzmftpjix.get(i13);
            if (zdlpuopuiuVar.ppxfxbqfkf(this, motionEvent) && action != 3) {
                this.f12666hcddaimhww = zdlpuopuiuVar;
                return true;
            }
        }
        return false;
    }

    private void w() {
        int absoluteAdapterPosition;
        View focusedChild = (this.f12724zeieaojujs && hasFocus() && this.f12671iozdgvuglv != null) ? getFocusedChild() : null;
        iozdgvuglv iozdgvuglvVarRibwqtqdhb = focusedChild != null ? ribwqtqdhb(focusedChild) : null;
        if (iozdgvuglvVarRibwqtqdhb == null) {
            u();
            return;
        }
        this.f12709uawqvzlxes.f12807agtfadlqog = this.f12671iozdgvuglv.hasStableIds() ? iozdgvuglvVarRibwqtqdhb.getItemId() : -1L;
        zynmafqrjb zynmafqrjbVar = this.f12709uawqvzlxes;
        if (this.f12656crxdokpmqz) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = iozdgvuglvVarRibwqtqdhb.isRemoved() ? iozdgvuglvVarRibwqtqdhb.mOldPosition : iozdgvuglvVarRibwqtqdhb.getAbsoluteAdapterPosition();
        }
        zynmafqrjbVar.f12821wflxmlrfwp = absoluteAdapterPosition;
        this.f12709uawqvzlxes.f12817ojitshcjhn = opjhrmiecq(iozdgvuglvVarRibwqtqdhb.itemView);
    }

    private boolean wizcaqwiak(View view, View view2, int i13) {
        int i14;
        if (view2 == null || view2 == this || view2 == view || jlmebxxoox(view2) == null) {
            return false;
        }
        if (view == null || jlmebxxoox(view) == null) {
            return true;
        }
        this.f12673istkbnxepw.set(0, 0, view.getWidth(), view.getHeight());
        this.f12653cdpycssgdh.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f12673istkbnxepw);
        offsetDescendantRectToMyCoords(view2, this.f12653cdpycssgdh);
        byte b13 = -1;
        int i15 = this.f12686lmojexxdyd.bfopjjpdmp() == 1 ? -1 : 1;
        Rect rect = this.f12673istkbnxepw;
        int i16 = rect.left;
        Rect rect2 = this.f12653cdpycssgdh;
        int i17 = rect2.left;
        if ((i16 < i17 || rect.right <= i17) && rect.right < rect2.right) {
            i14 = 1;
        } else {
            int i18 = rect.right;
            int i19 = rect2.right;
            i14 = ((i18 > i19 || i16 >= i19) && i16 > i17) ? -1 : 0;
        }
        int i23 = rect.top;
        int i24 = rect2.top;
        if ((i23 < i24 || rect.bottom <= i24) && rect.bottom < rect2.bottom) {
            b13 = 1;
        } else {
            int i25 = rect.bottom;
            int i26 = rect2.bottom;
            if ((i25 <= i26 && i23 < i26) || i23 <= i24) {
                b13 = 0;
            }
        }
        if (i13 == 1) {
            return b13 < 0 || (b13 == 0 && i14 * i15 < 0);
        }
        if (i13 == 2) {
            return b13 > 0 || (b13 == 0 && i14 * i15 > 0);
        }
        if (i13 == 17) {
            return i14 < 0;
        }
        if (i13 == 33) {
            return b13 < 0;
        }
        if (i13 == 66) {
            return i14 > 0;
        }
        if (i13 == 130) {
            return b13 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i13 + ulzqkzuiru());
    }

    static void yggfygwlhe(iozdgvuglv iozdgvuglvVar) {
        WeakReference<RecyclerView> weakReference = iozdgvuglvVar.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == iozdgvuglvVar.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            iozdgvuglvVar.mNestedRecyclerView = null;
        }
    }

    private void ylkuphrtab() {
        this.f12709uawqvzlxes.iobyxmoadg(1);
        sopmlzcsov(this.f12709uawqvzlxes);
        this.f12709uawqvzlxes.f12808btonecajqb = false;
        K();
        this.f12685lereixgezr.gxszxtbevo();
        rhgxfdycjh();
        e();
        w();
        zynmafqrjb zynmafqrjbVar = this.f12709uawqvzlxes;
        zynmafqrjbVar.f12810dxjokdxxww = zynmafqrjbVar.f12812gtknphoqwx && this.f12704skhdrjzrfn;
        this.f12704skhdrjzrfn = false;
        this.f12659dvvnrvtcbc = false;
        zynmafqrjbVar.f12816nufgyqmvbu = zynmafqrjbVar.f12809draadjrbmk;
        zynmafqrjbVar.f12813gxszxtbevo = this.f12671iozdgvuglv.getItemCount();
        jhduphickx(this.f12662fiwbwshyhd);
        if (this.f12709uawqvzlxes.f12812gtknphoqwx) {
            int iLqeggnwhkg = this.f12660esjtqupxsv.lqeggnwhkg();
            for (int i13 = 0; i13 < iLqeggnwhkg; i13++) {
                iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.gxszxtbevo(i13));
                if (!iozdgvuglvVarZfvoamnweg.shouldIgnore() && (!iozdgvuglvVarZfvoamnweg.isInvalid() || this.f12671iozdgvuglv.hasStableIds())) {
                    this.f12685lereixgezr.eablkybsjg(iozdgvuglvVarZfvoamnweg, this.f12690metgxyhuhe.yggfygwlhe(this.f12709uawqvzlxes, iozdgvuglvVarZfvoamnweg, wflxmlrfwp.eablkybsjg(iozdgvuglvVarZfvoamnweg), iozdgvuglvVarZfvoamnweg.getUnmodifiedPayloads()));
                    if (this.f12709uawqvzlxes.f12810dxjokdxxww && iozdgvuglvVarZfvoamnweg.isUpdated() && !iozdgvuglvVarZfvoamnweg.isRemoved() && !iozdgvuglvVarZfvoamnweg.shouldIgnore() && !iozdgvuglvVarZfvoamnweg.isInvalid()) {
                        this.f12685lereixgezr.ppxfxbqfkf(uwvvkdfqfp(iozdgvuglvVarZfvoamnweg), iozdgvuglvVarZfvoamnweg);
                    }
                }
            }
        }
        if (this.f12709uawqvzlxes.f12809draadjrbmk) {
            x();
            zynmafqrjb zynmafqrjbVar2 = this.f12709uawqvzlxes;
            boolean z13 = zynmafqrjbVar2.f12815lqeggnwhkg;
            zynmafqrjbVar2.f12815lqeggnwhkg = false;
            this.f12686lmojexxdyd.p(this.f12682jyumaefscl, zynmafqrjbVar2);
            this.f12709uawqvzlxes.f12815lqeggnwhkg = z13;
            for (int i14 = 0; i14 < this.f12660esjtqupxsv.lqeggnwhkg(); i14++) {
                iozdgvuglv iozdgvuglvVarZfvoamnweg2 = zfvoamnweg(this.f12660esjtqupxsv.gxszxtbevo(i14));
                if (!iozdgvuglvVarZfvoamnweg2.shouldIgnore() && !this.f12685lereixgezr.dxjokdxxww(iozdgvuglvVarZfvoamnweg2)) {
                    int iEablkybsjg = wflxmlrfwp.eablkybsjg(iozdgvuglvVarZfvoamnweg2);
                    boolean zHasAnyOfTheFlags = iozdgvuglvVarZfvoamnweg2.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iEablkybsjg |= 4096;
                    }
                    wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVarYggfygwlhe = this.f12690metgxyhuhe.yggfygwlhe(this.f12709uawqvzlxes, iozdgvuglvVarZfvoamnweg2, iEablkybsjg, iozdgvuglvVarZfvoamnweg2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        h(iozdgvuglvVarZfvoamnweg2, ppxfxbqfkfVarYggfygwlhe);
                    } else {
                        this.f12685lereixgezr.iobyxmoadg(iozdgvuglvVarZfvoamnweg2, ppxfxbqfkfVarYggfygwlhe);
                    }
                }
            }
            jyumaefscl();
        } else {
            jyumaefscl();
        }
        yzdjzghtvl();
        N(false);
        this.f12709uawqvzlxes.f12811eablkybsjg = 2;
    }

    private void zdlpuopuiu() {
        v();
        setScrollState(0);
    }

    private void zeieaojujs(long j13, iozdgvuglv iozdgvuglvVar, iozdgvuglv iozdgvuglvVar2) {
        int iLqeggnwhkg = this.f12660esjtqupxsv.lqeggnwhkg();
        for (int i13 = 0; i13 < iLqeggnwhkg; i13++) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.gxszxtbevo(i13));
            if (iozdgvuglvVarZfvoamnweg != iozdgvuglvVar && uwvvkdfqfp(iozdgvuglvVarZfvoamnweg) == j13) {
                nufgyqmvbu nufgyqmvbuVar = this.f12671iozdgvuglv;
                if (nufgyqmvbuVar == null || !nufgyqmvbuVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + iozdgvuglvVarZfvoamnweg + " \n View Holder 2:" + iozdgvuglvVar + ulzqkzuiru());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + iozdgvuglvVarZfvoamnweg + " \n View Holder 2:" + iozdgvuglvVar + ulzqkzuiru());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + iozdgvuglvVar2 + " cannot be found but it is necessary for " + iozdgvuglvVar + ulzqkzuiru());
    }

    static iozdgvuglv zfvoamnweg(View view) {
        if (view == null) {
            return null;
        }
        return ((vdvldrhtss) view.getLayoutParams()).f12787zdlpuopuiu;
    }

    private void zynmafqrjb(Context context, String str, AttributeSet attributeSet, int i13, int i14) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strIyctptxqzt = iyctptxqzt(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strIyctptxqzt, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(rgvfuqvkyq.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f12645h);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i13), Integer.valueOf(i14)};
                } catch (NoSuchMethodException e13) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e14) {
                        e14.initCause(e13);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strIyctptxqzt, e14);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((rgvfuqvkyq) constructor.newInstance(objArr));
            } catch (ClassCastException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strIyctptxqzt, e15);
            } catch (ClassNotFoundException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strIyctptxqzt, e16);
            } catch (IllegalAccessException e17) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strIyctptxqzt, e17);
            } catch (InstantiationException e18) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strIyctptxqzt, e18);
            } catch (InvocationTargetException e19) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strIyctptxqzt, e19);
            }
        }
    }

    public void A(int i13) {
        if (this.f12684kegysxyocb) {
            return;
        }
        P();
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            rgvfuqvkyqVar.Q(i13);
            awakenScrollBars();
        }
    }

    boolean C(iozdgvuglv iozdgvuglvVar, int i13) {
        if (!lxfrhoxuzk()) {
            jhduphickx.uawqvzlxes(iozdgvuglvVar.itemView, i13);
            return true;
        }
        iozdgvuglvVar.mPendingAccessibilityState = i13;
        this.f12691mhtqkkgtqm.add(iozdgvuglvVar);
        return false;
    }

    boolean E(AccessibilityEvent accessibilityEvent) {
        if (!lxfrhoxuzk()) {
            return false;
        }
        int iIobyxmoadg = accessibilityEvent != null ? w1.zoijcleaow.iobyxmoadg(accessibilityEvent) : 0;
        this.f12689mbcevpiqjq |= iIobyxmoadg != 0 ? iIobyxmoadg : 0;
        return true;
    }

    public void F(int i13, int i14) {
        G(i13, i14, null);
    }

    public void G(int i13, int i14, Interpolator interpolator) {
        H(i13, i14, interpolator, Integer.MIN_VALUE);
    }

    public void H(int i13, int i14, Interpolator interpolator, int i15) {
        I(i13, i14, interpolator, i15, false);
    }

    void I(int i13, int i14, Interpolator interpolator, int i15, boolean z13) {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f12684kegysxyocb) {
            return;
        }
        if (!rgvfuqvkyqVar.pmvmpeiblj()) {
            i13 = 0;
        }
        if (!this.f12686lmojexxdyd.zynmafqrjb()) {
            i14 = 0;
        }
        if (i13 == 0 && i14 == 0) {
            return;
        }
        if (i15 != Integer.MIN_VALUE && i15 <= 0) {
            scrollBy(i13, i14);
            return;
        }
        if (z13) {
            int i16 = i13 != 0 ? 1 : 0;
            if (i14 != 0) {
                i16 |= 2;
            }
            L(i16, 1);
        }
        this.f12693nuxfzjnpeb.eablkybsjg(i13, i14, i15, interpolator);
    }

    public void J(int i13) {
        if (this.f12684kegysxyocb) {
            return;
        }
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            rgvfuqvkyqVar.b0(this, this.f12709uawqvzlxes, i13);
        }
    }

    void K() {
        int i13 = this.f12716wypolnanlu + 1;
        this.f12716wypolnanlu = i13;
        if (i13 != 1 || this.f12684kegysxyocb) {
            return;
        }
        this.f12706stevsuqkhv = false;
    }

    public boolean L(int i13, int i14) {
        return getScrollingChildHelper().rgvfuqvkyq(i13, i14);
    }

    void N(boolean z13) {
        if (this.f12716wypolnanlu < 1) {
            if (f12649yzdjzghtvl) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + ulzqkzuiru());
            }
            this.f12716wypolnanlu = 1;
        }
        if (!z13 && !this.f12684kegysxyocb) {
            this.f12706stevsuqkhv = false;
        }
        if (this.f12716wypolnanlu == 1) {
            if (z13 && this.f12706stevsuqkhv && !this.f12684kegysxyocb && this.f12686lmojexxdyd != null && this.f12671iozdgvuglv != null) {
                wwaezpbzkn();
            }
            if (!this.f12684kegysxyocb) {
                this.f12706stevsuqkhv = false;
            }
        }
        this.f12716wypolnanlu--;
    }

    public void O(int i13) {
        getScrollingChildHelper().oxmwwwfdhm(i13);
    }

    public void P() {
        setScrollState(0);
        Q();
    }

    void R(int i13, int i14, Object obj) {
        int i15;
        int iBtonecajqb = this.f12660esjtqupxsv.btonecajqb();
        int i16 = i13 + i14;
        for (int i17 = 0; i17 < iBtonecajqb; i17++) {
            View viewDxjokdxxww = this.f12660esjtqupxsv.dxjokdxxww(i17);
            iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(viewDxjokdxxww);
            if (iozdgvuglvVarZfvoamnweg != null && !iozdgvuglvVarZfvoamnweg.shouldIgnore() && (i15 = iozdgvuglvVarZfvoamnweg.mPosition) >= i13 && i15 < i16) {
                iozdgvuglvVarZfvoamnweg.addFlags(2);
                iozdgvuglvVarZfvoamnweg.addChangePayload(obj);
                ((vdvldrhtss) viewDxjokdxxww.getLayoutParams()).f12785jyumaefscl = true;
            }
        }
        this.f12682jyumaefscl.kegysxyocb(i13, i14);
    }

    public void a(int i13) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i13, int i14) {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar == null || !rgvfuqvkyqVar.yzdjzghtvl(this, arrayList, i13, i14)) {
            super.addFocusables(arrayList, i13, i14);
        }
    }

    void ageimvtcrz() {
        int iBtonecajqb = this.f12660esjtqupxsv.btonecajqb();
        for (int i13 = 0; i13 < iBtonecajqb; i13++) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.dxjokdxxww(i13));
            if (iozdgvuglvVarZfvoamnweg != null && !iozdgvuglvVarZfvoamnweg.shouldIgnore()) {
                iozdgvuglvVarZfvoamnweg.addFlags(6);
            }
        }
        fiwbwshyhd();
        this.f12682jyumaefscl.zdlpuopuiu();
    }

    public void agtfadlqog(yggfygwlhe yggfygwlheVar) {
        if (this.f12675iwxlajgraz == null) {
            this.f12675iwxlajgraz = new ArrayList();
        }
        this.f12675iwxlajgraz.add(yggfygwlheVar);
    }

    public void b(int i13, int i14) {
    }

    public void btonecajqb(ojitshcjhn ojitshcjhnVar) {
        gtknphoqwx(ojitshcjhnVar, -1);
    }

    void c() {
        if (this.f12688lxfrhoxuzk || !this.f12680jpowsppfya) {
            return;
        }
        jhduphickx.metgxyhuhe(this, this.f12676ixidwrxhsl);
        this.f12688lxfrhoxuzk = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof vdvldrhtss) && this.f12686lmojexxdyd.istkbnxepw((vdvldrhtss) layoutParams);
    }

    void cllcsxoeiz(int i13) {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.w(i13);
        }
        a(i13);
        yggfygwlhe yggfygwlheVar = this.f12651auzgnhcxok;
        if (yggfygwlheVar != null) {
            yggfygwlheVar.onScrollStateChanged(this, i13);
        }
        List list = this.f12675iwxlajgraz;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((yggfygwlhe) this.f12675iwxlajgraz.get(size)).onScrollStateChanged(this, i13);
            }
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null && rgvfuqvkyqVar.pmvmpeiblj()) {
            return this.f12686lmojexxdyd.lmojexxdyd(this.f12709uawqvzlxes);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null && rgvfuqvkyqVar.pmvmpeiblj()) {
            return this.f12686lmojexxdyd.wwaezpbzkn(this.f12709uawqvzlxes);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null && rgvfuqvkyqVar.pmvmpeiblj()) {
            return this.f12686lmojexxdyd.ylkuphrtab(this.f12709uawqvzlxes);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null && rgvfuqvkyqVar.zynmafqrjb()) {
            return this.f12686lmojexxdyd.pkzmftpjix(this.f12709uawqvzlxes);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null && rgvfuqvkyqVar.zynmafqrjb()) {
            return this.f12686lmojexxdyd.hcddaimhww(this.f12709uawqvzlxes);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null && rgvfuqvkyqVar.zynmafqrjb()) {
            return this.f12686lmojexxdyd.jpowsppfya(this.f12709uawqvzlxes);
        }
        return 0;
    }

    int cqumvgiudr(int i13) {
        return esjtqupxsv(i13, this.f12670ikoacuggdj, this.f12683jztzpxfvev, getWidth());
    }

    public View crxdokpmqz(float f13, float f14) {
        for (int iLqeggnwhkg = this.f12660esjtqupxsv.lqeggnwhkg() - 1; iLqeggnwhkg >= 0; iLqeggnwhkg--) {
            View viewGxszxtbevo = this.f12660esjtqupxsv.gxszxtbevo(iLqeggnwhkg);
            float translationX = viewGxszxtbevo.getTranslationX();
            float translationY = viewGxszxtbevo.getTranslationY();
            if (f13 >= viewGxszxtbevo.getLeft() + translationX && f13 <= viewGxszxtbevo.getRight() + translationX && f14 >= viewGxszxtbevo.getTop() + translationY && f14 <= viewGxszxtbevo.getBottom() + translationY) {
                return viewGxszxtbevo;
            }
        }
        return null;
    }

    int czzsidtyhn(iozdgvuglv iozdgvuglvVar) {
        if (iozdgvuglvVar.hasAnyOfTheFlags(524) || !iozdgvuglvVar.isBound()) {
            return -1;
        }
        return this.f12655cqumvgiudr.eablkybsjg(iozdgvuglvVar.mPosition);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f13, float f14, boolean z13) {
        return getScrollingChildHelper().iobyxmoadg(f13, f14, z13);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f13, float f14) {
        return getScrollingChildHelper().zoijcleaow(f13, f14);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i13, int i14, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().ppxfxbqfkf(i13, i14, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i13, int i14, int i15, int i16, int[] iArr) {
        return getScrollingChildHelper().gxszxtbevo(i13, i14, i15, i16, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draadjrbmk(oxmwwwfdhm oxmwwwfdhmVar) {
        if (this.f12705sopmlzcsov == null) {
            this.f12705sopmlzcsov = new ArrayList();
        }
        this.f12705sopmlzcsov.add(oxmwwwfdhmVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z13;
        super.draw(canvas);
        int size = this.f12722ylkuphrtab.size();
        boolean z14 = false;
        for (int i13 = 0; i13 < size; i13++) {
            ((ojitshcjhn) this.f12722ylkuphrtab.get(i13)).onDrawOver(canvas, this, this.f12709uawqvzlxes);
        }
        EdgeEffect edgeEffect = this.f12670ikoacuggdj;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z13 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f12698pmvmpeiblj ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f12670ikoacuggdj;
            z13 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f12695okpsazkaxt;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f12698pmvmpeiblj) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f12695okpsazkaxt;
            z13 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f12683jztzpxfvev;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f12698pmvmpeiblj ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f12683jztzpxfvev;
            z13 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f12717xrmfcynszj;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f12698pmvmpeiblj) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f12717xrmfcynszj;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z14 = true;
            }
            z13 |= z14;
            canvas.restoreToCount(iSave4);
        }
        if ((z13 || this.f12690metgxyhuhe == null || this.f12722ylkuphrtab.size() <= 0 || !this.f12690metgxyhuhe.rgvfuqvkyq()) ? z13 : true) {
            jhduphickx.xrmfcynszj(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j13) {
        return super.drawChild(canvas, view, j13);
    }

    void dsvhmnatus(int i13, int i14) {
        this.f12712vipkmwdibw++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i13, scrollY - i14);
        b(i13, i14);
        yggfygwlhe yggfygwlheVar = this.f12651auzgnhcxok;
        if (yggfygwlheVar != null) {
            yggfygwlheVar.onScrolled(this, i13, i14);
        }
        List list = this.f12675iwxlajgraz;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((yggfygwlhe) this.f12675iwxlajgraz.get(size)).onScrolled(this, i13, i14);
            }
        }
        this.f12712vipkmwdibw--;
    }

    void dvvnrvtcbc() {
        this.f12717xrmfcynszj = null;
        this.f12695okpsazkaxt = null;
        this.f12683jztzpxfvev = null;
        this.f12670ikoacuggdj = null;
    }

    void eslsurpljm(boolean z13) {
        int i13 = this.f12700ribwqtqdhb - 1;
        this.f12700ribwqtqdhb = i13;
        if (i13 < 1) {
            if (f12649yzdjzghtvl && i13 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + ulzqkzuiru());
            }
            this.f12700ribwqtqdhb = 0;
            if (z13) {
                lmojexxdyd();
                wypolnanlu();
            }
        }
    }

    public void ezmngbhpjk(View view) {
    }

    void f(boolean z13) {
        this.f12679jlmebxxoox = z13 | this.f12679jlmebxxoox;
        this.f12656crxdokpmqz = true;
        ageimvtcrz();
    }

    void fiwbwshyhd() {
        int iBtonecajqb = this.f12660esjtqupxsv.btonecajqb();
        for (int i13 = 0; i13 < iBtonecajqb; i13++) {
            ((vdvldrhtss) this.f12660esjtqupxsv.dxjokdxxww(i13).getLayoutParams()).f12785jyumaefscl = true;
        }
        this.f12682jyumaefscl.kcexrzcfyt();
    }

    public void fmlbqenlif(View view) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i13) {
        View viewB;
        boolean z13;
        View viewI = this.f12686lmojexxdyd.i(view, i13);
        if (viewI != null) {
            return viewI;
        }
        boolean z14 = (this.f12671iozdgvuglv == null || this.f12686lmojexxdyd == null || lxfrhoxuzk() || this.f12684kegysxyocb) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z14 && (i13 == 2 || i13 == 1)) {
            if (this.f12686lmojexxdyd.zynmafqrjb()) {
                int i14 = i13 == 2 ? 130 : 33;
                z13 = focusFinder.findNextFocus(this, view, i14) == null;
                if (f12643f) {
                    i13 = i14;
                }
            } else {
                z13 = false;
            }
            if (!z13 && this.f12686lmojexxdyd.pmvmpeiblj()) {
                int i15 = (this.f12686lmojexxdyd.bfopjjpdmp() == 1) ^ (i13 == 2) ? 66 : 17;
                boolean z15 = focusFinder.findNextFocus(this, view, i15) == null;
                if (f12643f) {
                    i13 = i15;
                }
                z13 = z15;
            }
            if (z13) {
                pmvmpeiblj();
                if (jlmebxxoox(view) == null) {
                    return null;
                }
                K();
                this.f12686lmojexxdyd.b(view, i13, this.f12682jyumaefscl, this.f12709uawqvzlxes);
                N(false);
            }
            viewB = focusFinder.findNextFocus(this, view, i13);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i13);
            if (viewFindNextFocus == null && z14) {
                pmvmpeiblj();
                if (jlmebxxoox(view) == null) {
                    return null;
                }
                K();
                viewB = this.f12686lmojexxdyd.b(view, i13, this.f12682jyumaefscl, this.f12709uawqvzlxes);
                N(false);
            } else {
                viewB = viewFindNextFocus;
            }
        }
        if (viewB == null || viewB.hasFocusable()) {
            return wizcaqwiak(view, viewB, i13) ? viewB : super.focusSearch(view, i13);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i13);
        }
        t(viewB, null);
        return view;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null) {
            return rgvfuqvkyqVar.ntlheqmsrt();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + ulzqkzuiru());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null) {
            return rgvfuqvkyqVar.ulzqkzuiru(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + ulzqkzuiru());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public nufgyqmvbu getAdapter() {
        return this.f12671iozdgvuglv;
    }

    @Override // android.view.View
    public int getBaseline() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        return rgvfuqvkyqVar != null ? rgvfuqvkyqVar.crxdokpmqz() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i13, int i14) {
        gtknphoqwx gtknphoqwxVar = this.f12668hszhottldk;
        return gtknphoqwxVar == null ? super.getChildDrawingOrder(i13, i14) : gtknphoqwxVar.iobyxmoadg(i13, i14);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f12698pmvmpeiblj;
    }

    public androidx.recyclerview.widget.iwizpuwonk getCompatAccessibilityDelegate() {
        return this.f12714wizcaqwiak;
    }

    public draadjrbmk getEdgeEffectFactory() {
        return this.f12678jhduphickx;
    }

    public wflxmlrfwp getItemAnimator() {
        return this.f12690metgxyhuhe;
    }

    public int getItemDecorationCount() {
        return this.f12722ylkuphrtab.size();
    }

    public rgvfuqvkyq getLayoutManager() {
        return this.f12686lmojexxdyd;
    }

    public int getMaxFlingVelocity() {
        return this.f12677iyctptxqzt;
    }

    public int getMinFlingVelocity() {
        return this.f12696opjhrmiecq;
    }

    long getNanoTime() {
        if (f12641e) {
            return System.nanoTime();
        }
        return 0L;
    }

    public kcexrzcfyt getOnFlingListener() {
        return this.f12652bfopjjpdmp;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f12724zeieaojujs;
    }

    public jyumaefscl getRecycledViewPool() {
        return this.f12682jyumaefscl.dxjokdxxww();
    }

    public int getScrollState() {
        return this.f12701rlfsiqarku;
    }

    public void grlcpdaxtj(int i13) {
        int iLqeggnwhkg = this.f12660esjtqupxsv.lqeggnwhkg();
        for (int i14 = 0; i14 < iLqeggnwhkg; i14++) {
            this.f12660esjtqupxsv.gxszxtbevo(i14).offsetTopAndBottom(i13);
        }
    }

    public void gtknphoqwx(ojitshcjhn ojitshcjhnVar, int i13) {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.iwizpuwonk("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f12722ylkuphrtab.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i13 < 0) {
            this.f12722ylkuphrtab.add(ojitshcjhnVar);
        } else {
            this.f12722ylkuphrtab.add(i13, ojitshcjhnVar);
        }
        fiwbwshyhd();
        requestLayout();
    }

    void h(iozdgvuglv iozdgvuglvVar, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar) {
        iozdgvuglvVar.setFlags(0, 8192);
        if (this.f12709uawqvzlxes.f12810dxjokdxxww && iozdgvuglvVar.isUpdated() && !iozdgvuglvVar.isRemoved() && !iozdgvuglvVar.shouldIgnore()) {
            this.f12685lereixgezr.ppxfxbqfkf(uwvvkdfqfp(iozdgvuglvVar), iozdgvuglvVar);
        }
        this.f12685lereixgezr.eablkybsjg(iozdgvuglvVar, ppxfxbqfkfVar);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().btonecajqb();
    }

    public final void hkdspvbjdz(int i13, int i14, int i15, int i16, int[] iArr, int i17, int[] iArr2) {
        getScrollingChildHelper().eablkybsjg(i13, i14, i15, i16, iArr, i17, iArr2);
    }

    void hszhottldk(int i13) {
        if (this.f12686lmojexxdyd == null) {
            return;
        }
        setScrollState(2);
        this.f12686lmojexxdyd.Q(i13);
        awakenScrollBars();
    }

    boolean igdgnonuha() {
        AccessibilityManager accessibilityManager = this.f12710ulzqkzuiru;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    void iozdgvuglv(View view) {
        iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(view);
        ezmngbhpjk(view);
        nufgyqmvbu nufgyqmvbuVar = this.f12671iozdgvuglv;
        if (nufgyqmvbuVar != null && iozdgvuglvVarZfvoamnweg != null) {
            nufgyqmvbuVar.onViewDetachedFromWindow(iozdgvuglvVarZfvoamnweg);
        }
        List list = this.f12705sopmlzcsov;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((oxmwwwfdhm) this.f12705sopmlzcsov.get(size)).zoijcleaow(view);
            }
        }
    }

    public void ipoelvxyzq(int i13) {
        int iLqeggnwhkg = this.f12660esjtqupxsv.lqeggnwhkg();
        for (int i14 = 0; i14 < iLqeggnwhkg; i14++) {
            this.f12660esjtqupxsv.gxszxtbevo(i14).offsetLeftAndRight(i13);
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f12680jpowsppfya;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f12684kegysxyocb;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().draadjrbmk();
    }

    void istkbnxepw(int i13, int i14) {
        setMeasuredDimension(rgvfuqvkyq.cdpycssgdh(i13, getPaddingLeft() + getPaddingRight(), jhduphickx.zynmafqrjb(this)), rgvfuqvkyq.cdpycssgdh(i14, getPaddingTop() + getPaddingBottom(), jhduphickx.pmvmpeiblj(this)));
    }

    void iwizpuwonk(int i13, int i14) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f12670ikoacuggdj;
        if (edgeEffect == null || edgeEffect.isFinished() || i13 <= 0) {
            zIsFinished = false;
        } else {
            this.f12670ikoacuggdj.onRelease();
            zIsFinished = this.f12670ikoacuggdj.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f12683jztzpxfvev;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i13 < 0) {
            this.f12683jztzpxfvev.onRelease();
            zIsFinished |= this.f12683jztzpxfvev.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f12695okpsazkaxt;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i14 > 0) {
            this.f12695okpsazkaxt.onRelease();
            zIsFinished |= this.f12695okpsazkaxt.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f12717xrmfcynszj;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i14 < 0) {
            this.f12717xrmfcynszj.onRelease();
            zIsFinished |= this.f12717xrmfcynszj.isFinished();
        }
        if (zIsFinished) {
            jhduphickx.xrmfcynszj(this);
        }
    }

    void iwxlajgraz(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.btonecajqb(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(m5.zoijcleaow.fastscroll_default_thickness), resources.getDimensionPixelSize(m5.zoijcleaow.fastscroll_minimum_range), resources.getDimensionPixelOffset(m5.zoijcleaow.fastscroll_margin));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + ulzqkzuiru());
        }
    }

    void ixidwrxhsl(int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int iBtonecajqb = this.f12660esjtqupxsv.btonecajqb();
        if (i13 < i14) {
            i17 = -1;
            i16 = i13;
            i15 = i14;
        } else {
            i15 = i13;
            i16 = i14;
            i17 = 1;
        }
        for (int i19 = 0; i19 < iBtonecajqb; i19++) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.dxjokdxxww(i19));
            if (iozdgvuglvVarZfvoamnweg != null && (i18 = iozdgvuglvVarZfvoamnweg.mPosition) >= i16 && i18 <= i15) {
                if (f12642eslsurpljm) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i19 + " holder " + iozdgvuglvVarZfvoamnweg);
                }
                if (iozdgvuglvVarZfvoamnweg.mPosition == i13) {
                    iozdgvuglvVarZfvoamnweg.offsetPosition(i14 - i13, false);
                } else {
                    iozdgvuglvVarZfvoamnweg.offsetPosition(i17, false);
                }
                this.f12709uawqvzlxes.f12815lqeggnwhkg = true;
            }
        }
        this.f12682jyumaefscl.iwizpuwonk(i13, i14);
        requestLayout();
    }

    public View jlmebxxoox(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public boolean jpowsppfya(int i13, int i14, int[] iArr, int[] iArr2, int i15) {
        return getScrollingChildHelper().wkgbmnqykc(i13, i14, iArr, iArr2, i15);
    }

    void jrbgnlbqoe(int i13, int i14, boolean z13) {
        int i15 = i13 + i14;
        int iBtonecajqb = this.f12660esjtqupxsv.btonecajqb();
        for (int i16 = 0; i16 < iBtonecajqb; i16++) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.dxjokdxxww(i16));
            if (iozdgvuglvVarZfvoamnweg != null && !iozdgvuglvVarZfvoamnweg.shouldIgnore()) {
                int i17 = iozdgvuglvVarZfvoamnweg.mPosition;
                if (i17 >= i15) {
                    if (f12642eslsurpljm) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i16 + " holder " + iozdgvuglvVarZfvoamnweg + " now at position " + (iozdgvuglvVarZfvoamnweg.mPosition - i14));
                    }
                    iozdgvuglvVarZfvoamnweg.offsetPosition(-i14, z13);
                    this.f12709uawqvzlxes.f12815lqeggnwhkg = true;
                } else if (i17 >= i13) {
                    if (f12642eslsurpljm) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i16 + " holder " + iozdgvuglvVarZfvoamnweg + " now REMOVED");
                    }
                    iozdgvuglvVarZfvoamnweg.flagRemovedAndOffsetPosition(i13 - 1, -i14, z13);
                    this.f12709uawqvzlxes.f12815lqeggnwhkg = true;
                }
            }
        }
        this.f12682jyumaefscl.cqumvgiudr(i13, i14, z13);
        requestLayout();
    }

    void jyumaefscl() {
        int iBtonecajqb = this.f12660esjtqupxsv.btonecajqb();
        for (int i13 = 0; i13 < iBtonecajqb; i13++) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.dxjokdxxww(i13));
            if (!iozdgvuglvVarZfvoamnweg.shouldIgnore()) {
                iozdgvuglvVarZfvoamnweg.clearOldPosition();
            }
        }
        this.f12682jyumaefscl.wkgbmnqykc();
    }

    public iozdgvuglv jztzpxfvev(int i13) {
        iozdgvuglv iozdgvuglvVar = null;
        if (this.f12656crxdokpmqz) {
            return null;
        }
        int iBtonecajqb = this.f12660esjtqupxsv.btonecajqb();
        for (int i14 = 0; i14 < iBtonecajqb; i14++) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.dxjokdxxww(i14));
            if (iozdgvuglvVarZfvoamnweg != null && !iozdgvuglvVarZfvoamnweg.isRemoved() && czzsidtyhn(iozdgvuglvVarZfvoamnweg) == i13) {
                if (!this.f12660esjtqupxsv.agtfadlqog(iozdgvuglvVarZfvoamnweg.itemView)) {
                    return iozdgvuglvVarZfvoamnweg;
                }
                iozdgvuglvVar = iozdgvuglvVarZfvoamnweg;
            }
        }
        return iozdgvuglvVar;
    }

    boolean kcexrzcfyt(iozdgvuglv iozdgvuglvVar) {
        wflxmlrfwp wflxmlrfwpVar = this.f12690metgxyhuhe;
        return wflxmlrfwpVar == null || wflxmlrfwpVar.lqeggnwhkg(iozdgvuglvVar, iozdgvuglvVar.getUnmodifiedPayloads());
    }

    void kegysxyocb() {
        if (this.f12717xrmfcynszj != null) {
            return;
        }
        EdgeEffect edgeEffectIobyxmoadg = this.f12678jhduphickx.iobyxmoadg(this, 3);
        this.f12717xrmfcynszj = edgeEffectIobyxmoadg;
        if (this.f12698pmvmpeiblj) {
            edgeEffectIobyxmoadg.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectIobyxmoadg.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    int lereixgezr(int i13) {
        return esjtqupxsv(i13, this.f12695okpsazkaxt, this.f12717xrmfcynszj, getHeight());
    }

    public boolean lxfrhoxuzk() {
        return this.f12700ribwqtqdhb > 0;
    }

    void m() {
        wflxmlrfwp wflxmlrfwpVar = this.f12690metgxyhuhe;
        if (wflxmlrfwpVar != null) {
            wflxmlrfwpVar.gtknphoqwx();
        }
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.D(this.f12682jyumaefscl);
            this.f12686lmojexxdyd.E(this.f12682jyumaefscl);
        }
        this.f12682jyumaefscl.ppxfxbqfkf();
    }

    void mbcevpiqjq() {
        if (this.f12683jztzpxfvev != null) {
            return;
        }
        EdgeEffect edgeEffectIobyxmoadg = this.f12678jhduphickx.iobyxmoadg(this, 2);
        this.f12683jztzpxfvev = edgeEffectIobyxmoadg;
        if (this.f12698pmvmpeiblj) {
            edgeEffectIobyxmoadg.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectIobyxmoadg.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    iozdgvuglv metgxyhuhe(int i13, boolean z13) {
        int iBtonecajqb = this.f12660esjtqupxsv.btonecajqb();
        iozdgvuglv iozdgvuglvVar = null;
        for (int i14 = 0; i14 < iBtonecajqb; i14++) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.dxjokdxxww(i14));
            if (iozdgvuglvVarZfvoamnweg != null && !iozdgvuglvVarZfvoamnweg.isRemoved()) {
                if (z13) {
                    if (iozdgvuglvVarZfvoamnweg.mPosition != i13) {
                        continue;
                    } else {
                        if (this.f12660esjtqupxsv.agtfadlqog(iozdgvuglvVarZfvoamnweg.itemView)) {
                            return iozdgvuglvVarZfvoamnweg;
                        }
                        iozdgvuglvVar = iozdgvuglvVarZfvoamnweg;
                    }
                } else if (iozdgvuglvVarZfvoamnweg.getLayoutPosition() != i13) {
                    continue;
                } else {
                    if (this.f12660esjtqupxsv.agtfadlqog(iozdgvuglvVarZfvoamnweg.itemView)) {
                        return iozdgvuglvVarZfvoamnweg;
                    }
                    iozdgvuglvVar = iozdgvuglvVarZfvoamnweg;
                }
            }
        }
        return iozdgvuglvVar;
    }

    void mhtqkkgtqm(int i13, int i14) {
        int iBtonecajqb = this.f12660esjtqupxsv.btonecajqb();
        for (int i15 = 0; i15 < iBtonecajqb; i15++) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.dxjokdxxww(i15));
            if (iozdgvuglvVarZfvoamnweg != null && !iozdgvuglvVarZfvoamnweg.shouldIgnore() && iozdgvuglvVarZfvoamnweg.mPosition >= i13) {
                if (f12642eslsurpljm) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i15 + " holder " + iozdgvuglvVarZfvoamnweg + " now at position " + (iozdgvuglvVarZfvoamnweg.mPosition + i14));
                }
                iozdgvuglvVarZfvoamnweg.offsetPosition(i14, false);
                this.f12709uawqvzlxes.f12815lqeggnwhkg = true;
            }
        }
        this.f12682jyumaefscl.jyumaefscl(i13, i14);
        requestLayout();
    }

    boolean n(View view) {
        K();
        boolean zOxmwwwfdhm = this.f12660esjtqupxsv.oxmwwwfdhm(view);
        if (zOxmwwwfdhm) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(view);
            this.f12682jyumaefscl.dsvhmnatus(iozdgvuglvVarZfvoamnweg);
            this.f12682jyumaefscl.wwaezpbzkn(iozdgvuglvVarZfvoamnweg);
            if (f12642eslsurpljm) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        N(!zOxmwwwfdhm);
        return zOxmwwwfdhm;
    }

    void ntlheqmsrt() {
        if (this.f12695okpsazkaxt != null) {
            return;
        }
        EdgeEffect edgeEffectIobyxmoadg = this.f12678jhduphickx.iobyxmoadg(this, 1);
        this.f12695okpsazkaxt = edgeEffectIobyxmoadg;
        if (this.f12698pmvmpeiblj) {
            edgeEffectIobyxmoadg.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectIobyxmoadg.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public boolean nuxfzjnpeb() {
        return !this.f12658dsvhmnatus || this.f12656crxdokpmqz || this.f12655cqumvgiudr.rgvfuqvkyq();
    }

    public void o(ojitshcjhn ojitshcjhnVar) {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.iwizpuwonk("Cannot remove item decoration during a scroll  or layout");
        }
        this.f12722ylkuphrtab.remove(ojitshcjhnVar);
        if (this.f12722ylkuphrtab.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        fiwbwshyhd();
        requestLayout();
    }

    public void oipsdeybqn(View view, Rect rect) {
        bfopjjpdmp(view, rect);
    }

    void ojitshcjhn(iozdgvuglv iozdgvuglvVar, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar2) {
        iozdgvuglvVar.setIsRecyclable(false);
        if (this.f12690metgxyhuhe.iobyxmoadg(iozdgvuglvVar, ppxfxbqfkfVar, ppxfxbqfkfVar2)) {
            c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f12700ribwqtqdhb = 0;
        this.f12680jpowsppfya = true;
        this.f12658dsvhmnatus = this.f12658dsvhmnatus && !isLayoutRequested();
        this.f12682jyumaefscl.lereixgezr();
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.stevsuqkhv(this);
        }
        this.f12688lxfrhoxuzk = false;
        if (f12641e) {
            ThreadLocal threadLocal = androidx.recyclerview.widget.gtknphoqwx.f12987cqumvgiudr;
            androidx.recyclerview.widget.gtknphoqwx gtknphoqwxVar = (androidx.recyclerview.widget.gtknphoqwx) threadLocal.get();
            this.f12707tbqsvytpvh = gtknphoqwxVar;
            if (gtknphoqwxVar == null) {
                this.f12707tbqsvytpvh = new androidx.recyclerview.widget.gtknphoqwx();
                Display displayZdlpuopuiu = jhduphickx.zdlpuopuiu(this);
                if (isInEditMode() || displayZdlpuopuiu == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayZdlpuopuiu.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.gtknphoqwx gtknphoqwxVar2 = this.f12707tbqsvytpvh;
                gtknphoqwxVar2.f12990jyumaefscl = (long) (1.0E9f / refreshRate);
                threadLocal.set(gtknphoqwxVar2);
            }
            this.f12707tbqsvytpvh.iobyxmoadg(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.gtknphoqwx gtknphoqwxVar;
        super.onDetachedFromWindow();
        wflxmlrfwp wflxmlrfwpVar = this.f12690metgxyhuhe;
        if (wflxmlrfwpVar != null) {
            wflxmlrfwpVar.gtknphoqwx();
        }
        P();
        this.f12680jpowsppfya = false;
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.kegysxyocb(this, this.f12682jyumaefscl);
        }
        this.f12691mhtqkkgtqm.clear();
        removeCallbacks(this.f12676ixidwrxhsl);
        this.f12685lereixgezr.btonecajqb();
        this.f12682jyumaefscl.pmvmpeiblj();
        a2.iobyxmoadg.ppxfxbqfkf(this);
        if (!f12641e || (gtknphoqwxVar = this.f12707tbqsvytpvh) == null) {
            return;
        }
        gtknphoqwxVar.btonecajqb(this);
        this.f12707tbqsvytpvh = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f12722ylkuphrtab.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((ojitshcjhn) this.f12722ylkuphrtab.get(i13)).onDraw(canvas, this, this.f12709uawqvzlxes);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f13;
        float axisValue;
        if (this.f12686lmojexxdyd != null && !this.f12684kegysxyocb && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f13 = this.f12686lmojexxdyd.zynmafqrjb() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f12686lmojexxdyd.pmvmpeiblj() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f12686lmojexxdyd.zynmafqrjb()) {
                    f13 = -axisValue2;
                } else if (this.f12686lmojexxdyd.pmvmpeiblj()) {
                    axisValue = axisValue2;
                    f13 = 0.0f;
                } else {
                    f13 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f13 = 0.0f;
                axisValue = 0.0f;
            }
            if (f13 != 0.0f || axisValue != 0.0f) {
                fyldjkxazc((int) (axisValue * this.f12713weqkydbzbr), (int) (f13 * this.f12687lrnfpwlwnk), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z13;
        if (this.f12684kegysxyocb) {
            return false;
        }
        this.f12666hcddaimhww = null;
        if (vipkmwdibw(motionEvent)) {
            zdlpuopuiu();
            return true;
        }
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar == null) {
            return false;
        }
        boolean zPmvmpeiblj = rgvfuqvkyqVar.pmvmpeiblj();
        boolean zZynmafqrjb = this.f12686lmojexxdyd.zynmafqrjb();
        if (this.f12711uwvvkdfqfp == null) {
            this.f12711uwvvkdfqfp = VelocityTracker.obtain();
        }
        this.f12711uwvvkdfqfp.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f12708tzroggbefp) {
                this.f12708tzroggbefp = false;
            }
            this.f12657czzsidtyhn = motionEvent.getPointerId(0);
            int x13 = (int) (motionEvent.getX() + 0.5f);
            this.f12703sflfametgt = x13;
            this.f12720yfnezrywwk = x13;
            int y13 = (int) (motionEvent.getY() + 0.5f);
            this.f12725zfvoamnweg = y13;
            this.f12719ydmasvzmpa = y13;
            if (M(motionEvent) || this.f12701rlfsiqarku == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                O(1);
            }
            int[] iArr = this.f12672ipoelvxyzq;
            iArr[1] = 0;
            iArr[0] = 0;
            int i13 = zPmvmpeiblj;
            if (zZynmafqrjb) {
                i13 = (zPmvmpeiblj ? 1 : 0) | 2;
            }
            L(i13, 0);
        } else if (actionMasked == 1) {
            this.f12711uwvvkdfqfp.clear();
            O(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f12657czzsidtyhn);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f12657czzsidtyhn + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x14 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y14 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f12701rlfsiqarku != 1) {
                int i14 = x14 - this.f12720yfnezrywwk;
                int i15 = y14 - this.f12719ydmasvzmpa;
                if (!zPmvmpeiblj || Math.abs(i14) <= this.f12694oipsdeybqn) {
                    z13 = false;
                } else {
                    this.f12703sflfametgt = x14;
                    z13 = true;
                }
                if (zZynmafqrjb && Math.abs(i15) > this.f12694oipsdeybqn) {
                    this.f12725zfvoamnweg = y14;
                    z13 = true;
                }
                if (z13) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            zdlpuopuiu();
        } else if (actionMasked == 5) {
            this.f12657czzsidtyhn = motionEvent.getPointerId(actionIndex);
            int x15 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f12703sflfametgt = x15;
            this.f12720yfnezrywwk = x15;
            int y15 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f12725zfvoamnweg = y15;
            this.f12719ydmasvzmpa = y15;
        } else if (actionMasked == 6) {
            krqnebusok(motionEvent);
        }
        return this.f12701rlfsiqarku == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        q1.gtknphoqwx.iobyxmoadg("RV OnLayout");
        wwaezpbzkn();
        q1.gtknphoqwx.zoijcleaow();
        this.f12658dsvhmnatus = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar == null) {
            istkbnxepw(i13, i14);
            return;
        }
        boolean z13 = false;
        if (rgvfuqvkyqVar.lxfrhoxuzk()) {
            int mode = View.MeasureSpec.getMode(i13);
            int mode2 = View.MeasureSpec.getMode(i14);
            this.f12686lmojexxdyd.r(this.f12682jyumaefscl, this.f12709uawqvzlxes, i13, i14);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z13 = true;
            }
            this.f12681jrbgnlbqoe = z13;
            if (z13 || this.f12671iozdgvuglv == null) {
                return;
            }
            if (this.f12709uawqvzlxes.f12811eablkybsjg == 1) {
                ylkuphrtab();
            }
            this.f12686lmojexxdyd.T(i13, i14);
            this.f12709uawqvzlxes.f12808btonecajqb = true;
            pkzmftpjix();
            this.f12686lmojexxdyd.W(i13, i14);
            if (this.f12686lmojexxdyd.Z()) {
                this.f12686lmojexxdyd.T(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f12709uawqvzlxes.f12808btonecajqb = true;
                pkzmftpjix();
                this.f12686lmojexxdyd.W(i13, i14);
            }
            this.f12663fmlbqenlif = getMeasuredWidth();
            this.f12661ezmngbhpjk = getMeasuredHeight();
            return;
        }
        if (this.f12667hkdspvbjdz) {
            this.f12686lmojexxdyd.r(this.f12682jyumaefscl, this.f12709uawqvzlxes, i13, i14);
            return;
        }
        if (this.f12692ntlheqmsrt) {
            K();
            rhgxfdycjh();
            e();
            yzdjzghtvl();
            zynmafqrjb zynmafqrjbVar = this.f12709uawqvzlxes;
            if (zynmafqrjbVar.f12809draadjrbmk) {
                zynmafqrjbVar.f12816nufgyqmvbu = true;
            } else {
                this.f12655cqumvgiudr.btonecajqb();
                this.f12709uawqvzlxes.f12816nufgyqmvbu = false;
            }
            this.f12692ntlheqmsrt = false;
            N(false);
        } else if (this.f12709uawqvzlxes.f12809draadjrbmk) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        nufgyqmvbu nufgyqmvbuVar = this.f12671iozdgvuglv;
        if (nufgyqmvbuVar != null) {
            this.f12709uawqvzlxes.f12813gxszxtbevo = nufgyqmvbuVar.getItemCount();
        } else {
            this.f12709uawqvzlxes.f12813gxszxtbevo = 0;
        }
        K();
        this.f12686lmojexxdyd.r(this.f12682jyumaefscl, this.f12709uawqvzlxes, i13, i14);
        N(false);
        this.f12709uawqvzlxes.f12816nufgyqmvbu = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i13, Rect rect) {
        if (lxfrhoxuzk()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i13, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f12674iwizpuwonk = savedState;
        super.onRestoreInstanceState(savedState.zoijcleaow());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f12674iwizpuwonk;
        if (savedState2 != null) {
            savedState.ppxfxbqfkf(savedState2);
        } else {
            rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
            if (rgvfuqvkyqVar != null) {
                savedState.f12727jyumaefscl = rgvfuqvkyqVar.v();
            } else {
                savedState.f12727jyumaefscl = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        if (i13 == i15 && i14 == i16) {
            return;
        }
        dvvnrvtcbc();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df A[PHI: r0
      0x00df: PHI (r0v37 int) = (r0v26 int), (r0v41 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i13;
        boolean z13;
        if (this.f12684kegysxyocb || this.f12708tzroggbefp) {
            return false;
        }
        if (stevsuqkhv(motionEvent)) {
            zdlpuopuiu();
            return true;
        }
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar == null) {
            return false;
        }
        boolean zPmvmpeiblj = rgvfuqvkyqVar.pmvmpeiblj();
        boolean zZynmafqrjb = this.f12686lmojexxdyd.zynmafqrjb();
        if (this.f12711uwvvkdfqfp == null) {
            this.f12711uwvvkdfqfp = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f12672ipoelvxyzq;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f12672ipoelvxyzq;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f12711uwvvkdfqfp.addMovement(motionEventObtain);
                this.f12711uwvvkdfqfp.computeCurrentVelocity(1000, this.f12677iyctptxqzt);
                float f13 = zPmvmpeiblj ? -this.f12711uwvvkdfqfp.getXVelocity(this.f12657czzsidtyhn) : 0.0f;
                float f14 = zZynmafqrjb ? -this.f12711uwvvkdfqfp.getYVelocity(this.f12657czzsidtyhn) : 0.0f;
                if ((f13 == 0.0f && f14 == 0.0f) || !rlfsiqarku((int) f13, (int) f14)) {
                    setScrollState(0);
                }
                v();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f12657czzsidtyhn);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f12657czzsidtyhn + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x13 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y13 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.f12703sflfametgt - x13;
                int iMax2 = this.f12725zfvoamnweg - y13;
                if (this.f12701rlfsiqarku != 1) {
                    if (zPmvmpeiblj) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.f12694oipsdeybqn) : Math.min(0, iMax + this.f12694oipsdeybqn);
                        if (iMax != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = false;
                    }
                    if (zZynmafqrjb) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f12694oipsdeybqn) : Math.min(0, iMax2 + this.f12694oipsdeybqn);
                        if (iMax2 != 0) {
                            z13 = true;
                        }
                    }
                    if (z13) {
                        setScrollState(1);
                    }
                }
                if (this.f12701rlfsiqarku == 1) {
                    int[] iArr3 = this.f12665grlcpdaxtj;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iK = iMax - k(iMax, motionEvent.getY());
                    int iL = iMax2 - l(iMax2, motionEvent.getX());
                    if (jpowsppfya(zPmvmpeiblj ? iK : 0, zZynmafqrjb ? iL : 0, this.f12665grlcpdaxtj, this.f12664fyldjkxazc, 0)) {
                        int[] iArr4 = this.f12665grlcpdaxtj;
                        iK -= iArr4[0];
                        iL -= iArr4[1];
                        int[] iArr5 = this.f12672ipoelvxyzq;
                        int i14 = iArr5[0];
                        int[] iArr6 = this.f12664fyldjkxazc;
                        iArr5[0] = i14 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i15 = iL;
                    int[] iArr7 = this.f12664fyldjkxazc;
                    this.f12703sflfametgt = x13 - iArr7[0];
                    this.f12725zfvoamnweg = y13 - iArr7[1];
                    if (y(zPmvmpeiblj ? iK : 0, zZynmafqrjb ? i15 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.gtknphoqwx gtknphoqwxVar = this.f12707tbqsvytpvh;
                    if (gtknphoqwxVar != null && (iK != 0 || i15 != 0)) {
                        gtknphoqwxVar.gxszxtbevo(this, iK, i15);
                    }
                }
            } else if (actionMasked == 3) {
                zdlpuopuiu();
            } else if (actionMasked == 5) {
                this.f12657czzsidtyhn = motionEvent.getPointerId(actionIndex);
                int x14 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f12703sflfametgt = x14;
                this.f12720yfnezrywwk = x14;
                int y14 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f12725zfvoamnweg = y14;
                this.f12719ydmasvzmpa = y14;
            } else if (actionMasked == 6) {
                krqnebusok(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.f12657czzsidtyhn = motionEvent.getPointerId(0);
        int x15 = (int) (motionEvent.getX() + 0.5f);
        this.f12703sflfametgt = x15;
        this.f12720yfnezrywwk = x15;
        int y15 = (int) (motionEvent.getY() + 0.5f);
        this.f12725zfvoamnweg = y15;
        this.f12719ydmasvzmpa = y15;
        if (zZynmafqrjb) {
            i13 = zPmvmpeiblj;
            i13 = (zPmvmpeiblj ? 1 : 0) | 2;
        }
        i13 = zPmvmpeiblj;
        L(i13, 0);
        this.f12711uwvvkdfqfp.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    void oxmwwwfdhm(String str) {
        if (lxfrhoxuzk()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + ulzqkzuiru());
        }
        if (this.f12712vipkmwdibw > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + ulzqkzuiru()));
        }
    }

    public void p(oxmwwwfdhm oxmwwwfdhmVar) {
        List list = this.f12705sopmlzcsov;
        if (list == null) {
            return;
        }
        list.remove(oxmwwwfdhmVar);
    }

    void pmvmpeiblj() {
        if (!this.f12658dsvhmnatus || this.f12656crxdokpmqz) {
            q1.gtknphoqwx.iobyxmoadg("RV FullInvalidate");
            wwaezpbzkn();
            q1.gtknphoqwx.zoijcleaow();
            return;
        }
        if (this.f12655cqumvgiudr.rgvfuqvkyq()) {
            if (!this.f12655cqumvgiudr.ojitshcjhn(4) || this.f12655cqumvgiudr.ojitshcjhn(11)) {
                if (this.f12655cqumvgiudr.rgvfuqvkyq()) {
                    q1.gtknphoqwx.iobyxmoadg("RV FullInvalidate");
                    wwaezpbzkn();
                    q1.gtknphoqwx.zoijcleaow();
                    return;
                }
                return;
            }
            q1.gtknphoqwx.iobyxmoadg("RV PartialInvalidate");
            K();
            rhgxfdycjh();
            this.f12655cqumvgiudr.iwizpuwonk();
            if (!this.f12706stevsuqkhv) {
                if (tbqsvytpvh()) {
                    wwaezpbzkn();
                } else {
                    this.f12655cqumvgiudr.dxjokdxxww();
                }
            }
            N(true);
            yzdjzghtvl();
            q1.gtknphoqwx.zoijcleaow();
        }
    }

    public void q(zdlpuopuiu zdlpuopuiuVar) {
        this.f12697pkzmftpjix.remove(zdlpuopuiuVar);
        if (this.f12666hcddaimhww == zdlpuopuiuVar) {
            this.f12666hcddaimhww = null;
        }
    }

    public void r(yggfygwlhe yggfygwlheVar) {
        List list = this.f12675iwxlajgraz;
        if (list != null) {
            list.remove(yggfygwlheVar);
        }
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z13) {
        iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(view);
        if (iozdgvuglvVarZfvoamnweg != null) {
            if (iozdgvuglvVarZfvoamnweg.isTmpDetached()) {
                iozdgvuglvVarZfvoamnweg.clearTmpDetachFlag();
            } else if (!iozdgvuglvVarZfvoamnweg.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + iozdgvuglvVarZfvoamnweg + ulzqkzuiru());
            }
        } else if (f12649yzdjzghtvl) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + ulzqkzuiru());
        }
        view.clearAnimation();
        iozdgvuglv(view);
        super.removeDetachedView(view, z13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f12686lmojexxdyd.t(this, this.f12709uawqvzlxes, view, view2) && view2 != null) {
            t(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z13) {
        return this.f12686lmojexxdyd.K(this, view, rect, z13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z13) {
        int size = this.f12697pkzmftpjix.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((zdlpuopuiu) this.f12697pkzmftpjix.get(i13)).eablkybsjg(z13);
        }
        super.requestDisallowInterceptTouchEvent(z13);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f12716wypolnanlu != 0 || this.f12684kegysxyocb) {
            this.f12706stevsuqkhv = true;
        } else {
            super.requestLayout();
        }
    }

    void rhgxfdycjh() {
        this.f12700ribwqtqdhb++;
    }

    public iozdgvuglv ribwqtqdhb(View view) {
        View viewJlmebxxoox = jlmebxxoox(view);
        if (viewJlmebxxoox == null) {
            return null;
        }
        return sflfametgt(viewJlmebxxoox);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean rlfsiqarku(int i13, int i14) {
        int iMax;
        int i15;
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f12684kegysxyocb) {
            return false;
        }
        int iPmvmpeiblj = rgvfuqvkyqVar.pmvmpeiblj();
        boolean zZynmafqrjb = this.f12686lmojexxdyd.zynmafqrjb();
        if (iPmvmpeiblj == 0 || Math.abs(i13) < this.f12696opjhrmiecq) {
            i13 = 0;
        }
        if (!zZynmafqrjb || Math.abs(i14) < this.f12696opjhrmiecq) {
            i14 = 0;
        }
        if (i13 == 0 && i14 == 0) {
            return false;
        }
        if (i13 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.f12670ikoacuggdj;
            if (edgeEffect == null || androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.f12683jztzpxfvev;
                if (edgeEffect2 == null || androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (D(this.f12683jztzpxfvev, i13, getWidth())) {
                    this.f12683jztzpxfvev.onAbsorb(i13);
                    i13 = 0;
                }
            } else {
                int i16 = -i13;
                if (D(this.f12670ikoacuggdj, i16, getWidth())) {
                    this.f12670ikoacuggdj.onAbsorb(i16);
                    i13 = 0;
                }
            }
            iMax = i13;
            i13 = 0;
        }
        if (i14 == 0) {
            i15 = i14;
            i14 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.f12695okpsazkaxt;
            if (edgeEffect3 == null || androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.f12717xrmfcynszj;
                if (edgeEffect4 == null || androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect4) == 0.0f) {
                    i15 = i14;
                    i14 = 0;
                } else if (D(this.f12717xrmfcynszj, i14, getHeight())) {
                    this.f12717xrmfcynszj.onAbsorb(i14);
                    i14 = 0;
                }
            } else {
                int i17 = -i14;
                if (D(this.f12695okpsazkaxt, i17, getHeight())) {
                    this.f12695okpsazkaxt.onAbsorb(i17);
                    i14 = 0;
                }
            }
            i15 = 0;
        }
        if (iMax != 0 || i14 != 0) {
            int i18 = this.f12677iyctptxqzt;
            iMax = Math.max(-i18, Math.min(iMax, i18));
            int i19 = this.f12677iyctptxqzt;
            i14 = Math.max(-i19, Math.min(i14, i19));
            this.f12693nuxfzjnpeb.zoijcleaow(iMax, i14);
        }
        if (i13 == 0 && i15 == 0) {
            return (iMax == 0 && i14 == 0) ? false : true;
        }
        float f13 = i13;
        float f14 = i15;
        if (!dispatchNestedPreFling(f13, f14)) {
            boolean z13 = iPmvmpeiblj != 0 || zZynmafqrjb;
            dispatchNestedFling(f13, f14, z13);
            kcexrzcfyt kcexrzcfytVar = this.f12652bfopjjpdmp;
            if (kcexrzcfytVar != null && kcexrzcfytVar.onFling(i13, i15)) {
                return true;
            }
            if (z13) {
                if (zZynmafqrjb) {
                    iPmvmpeiblj = (iPmvmpeiblj == true ? 1 : 0) | 2;
                }
                L(iPmvmpeiblj, 1);
                int i23 = this.f12677iyctptxqzt;
                int iMax2 = Math.max(-i23, Math.min(i13, i23));
                int i24 = this.f12677iyctptxqzt;
                this.f12693nuxfzjnpeb.zoijcleaow(iMax2, Math.max(-i24, Math.min(i15, i24)));
                return true;
            }
        }
        return false;
    }

    void roivzttewh() {
        this.f12655cqumvgiudr = new androidx.recyclerview.widget.iobyxmoadg(new gxszxtbevo());
    }

    void s() {
        iozdgvuglv iozdgvuglvVar;
        int iLqeggnwhkg = this.f12660esjtqupxsv.lqeggnwhkg();
        for (int i13 = 0; i13 < iLqeggnwhkg; i13++) {
            View viewGxszxtbevo = this.f12660esjtqupxsv.gxszxtbevo(i13);
            iozdgvuglv iozdgvuglvVarSflfametgt = sflfametgt(viewGxszxtbevo);
            if (iozdgvuglvVarSflfametgt != null && (iozdgvuglvVar = iozdgvuglvVarSflfametgt.mShadowingHolder) != null) {
                View view = iozdgvuglvVar.itemView;
                int left = viewGxszxtbevo.getLeft();
                int top = viewGxszxtbevo.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i13, int i14) {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f12684kegysxyocb) {
            return;
        }
        boolean zPmvmpeiblj = rgvfuqvkyqVar.pmvmpeiblj();
        boolean zZynmafqrjb = this.f12686lmojexxdyd.zynmafqrjb();
        if (zPmvmpeiblj || zZynmafqrjb) {
            if (!zPmvmpeiblj) {
                i13 = 0;
            }
            if (!zZynmafqrjb) {
                i14 = 0;
            }
            y(i13, i14, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i13, int i14) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (E(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.iwizpuwonk iwizpuwonkVar) {
        this.f12714wizcaqwiak = iwizpuwonkVar;
        jhduphickx.oipsdeybqn(this, iwizpuwonkVar);
    }

    public void setAdapter(nufgyqmvbu nufgyqmvbuVar) {
        setLayoutFrozen(false);
        B(nufgyqmvbuVar, false, true);
        f(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(gtknphoqwx gtknphoqwxVar) {
        if (gtknphoqwxVar == this.f12668hszhottldk) {
            return;
        }
        setChildrenDrawingOrderEnabled(gtknphoqwxVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z13) {
        if (z13 != this.f12698pmvmpeiblj) {
            dvvnrvtcbc();
        }
        this.f12698pmvmpeiblj = z13;
        super.setClipToPadding(z13);
        if (this.f12658dsvhmnatus) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(draadjrbmk draadjrbmkVar) {
        u1.nufgyqmvbu.gxszxtbevo(draadjrbmkVar);
        this.f12678jhduphickx = draadjrbmkVar;
        dvvnrvtcbc();
    }

    public void setHasFixedSize(boolean z13) {
        this.f12667hkdspvbjdz = z13;
    }

    public void setItemAnimator(wflxmlrfwp wflxmlrfwpVar) {
        wflxmlrfwp wflxmlrfwpVar2 = this.f12690metgxyhuhe;
        if (wflxmlrfwpVar2 != null) {
            wflxmlrfwpVar2.gtknphoqwx();
            this.f12690metgxyhuhe.iwizpuwonk(null);
        }
        this.f12690metgxyhuhe = wflxmlrfwpVar;
        if (wflxmlrfwpVar != null) {
            wflxmlrfwpVar.iwizpuwonk(this.f12669igdgnonuha);
        }
    }

    public void setItemViewCacheSize(int i13) {
        this.f12682jyumaefscl.jpowsppfya(i13);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z13) {
        suppressLayout(z13);
    }

    public void setLayoutManager(rgvfuqvkyq rgvfuqvkyqVar) {
        if (rgvfuqvkyqVar == this.f12686lmojexxdyd) {
            return;
        }
        P();
        if (this.f12686lmojexxdyd != null) {
            wflxmlrfwp wflxmlrfwpVar = this.f12690metgxyhuhe;
            if (wflxmlrfwpVar != null) {
                wflxmlrfwpVar.gtknphoqwx();
            }
            this.f12686lmojexxdyd.D(this.f12682jyumaefscl);
            this.f12686lmojexxdyd.E(this.f12682jyumaefscl);
            this.f12682jyumaefscl.ppxfxbqfkf();
            if (this.f12680jpowsppfya) {
                this.f12686lmojexxdyd.kegysxyocb(this, this.f12682jyumaefscl);
            }
            this.f12686lmojexxdyd.X(null);
            this.f12686lmojexxdyd = null;
        } else {
            this.f12682jyumaefscl.ppxfxbqfkf();
        }
        this.f12660esjtqupxsv.ojitshcjhn();
        this.f12686lmojexxdyd = rgvfuqvkyqVar;
        if (rgvfuqvkyqVar != null) {
            if (rgvfuqvkyqVar.f12774yggfygwlhe != null) {
                throw new IllegalArgumentException("LayoutManager " + rgvfuqvkyqVar + " is already attached to a RecyclerView:" + rgvfuqvkyqVar.f12774yggfygwlhe.ulzqkzuiru());
            }
            rgvfuqvkyqVar.X(this);
            if (this.f12680jpowsppfya) {
                this.f12686lmojexxdyd.stevsuqkhv(this);
            }
        }
        this.f12682jyumaefscl.wypolnanlu();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z13) {
        getScrollingChildHelper().wflxmlrfwp(z13);
    }

    public void setOnFlingListener(kcexrzcfyt kcexrzcfytVar) {
        this.f12652bfopjjpdmp = kcexrzcfytVar;
    }

    @Deprecated
    public void setOnScrollListener(yggfygwlhe yggfygwlheVar) {
        this.f12651auzgnhcxok = yggfygwlheVar;
    }

    public void setPreserveFocusAfterLayout(boolean z13) {
        this.f12724zeieaojujs = z13;
    }

    public void setRecycledViewPool(jyumaefscl jyumaefsclVar) {
        this.f12682jyumaefscl.pkzmftpjix(jyumaefsclVar);
    }

    @Deprecated
    public void setRecyclerListener(cqumvgiudr cqumvgiudrVar) {
    }

    void setScrollState(int i13) {
        if (i13 == this.f12701rlfsiqarku) {
            return;
        }
        if (f12642eslsurpljm) {
            Log.d("RecyclerView", "setting scroll state to " + i13 + " from " + this.f12701rlfsiqarku, new Exception());
        }
        this.f12701rlfsiqarku = i13;
        if (i13 != 2) {
            Q();
        }
        cllcsxoeiz(i13);
    }

    public void setScrollingTouchSlop(int i13) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i13 != 0) {
            if (i13 == 1) {
                this.f12694oipsdeybqn = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i13 + "; using default value");
        }
        this.f12694oipsdeybqn = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(cdpycssgdh cdpycssgdhVar) {
        this.f12682jyumaefscl.hcddaimhww(cdpycssgdhVar);
    }

    public iozdgvuglv sflfametgt(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return zfvoamnweg(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void skhdrjzrfn() {
        if (this.f12722ylkuphrtab.size() == 0) {
            return;
        }
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.iwizpuwonk("Cannot invalidate item decorations during a scroll or layout");
        }
        fiwbwshyhd();
        requestLayout();
    }

    final void sopmlzcsov(zynmafqrjb zynmafqrjbVar) {
        if (getScrollState() != 2) {
            zynmafqrjbVar.f12819rgvfuqvkyq = 0;
            zynmafqrjbVar.f12820vdvldrhtss = 0;
        } else {
            OverScroller overScroller = this.f12693nuxfzjnpeb.f12802jyumaefscl;
            zynmafqrjbVar.f12819rgvfuqvkyq = overScroller.getFinalX() - overScroller.getCurrX();
            zynmafqrjbVar.f12820vdvldrhtss = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i13) {
        return getScrollingChildHelper().ojitshcjhn(i13);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().vdvldrhtss();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z13) {
        if (z13 != this.f12684kegysxyocb) {
            oxmwwwfdhm("Do not suppressLayout in layout or scroll");
            if (z13) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f12684kegysxyocb = true;
                this.f12708tzroggbefp = true;
                P();
                return;
            }
            this.f12684kegysxyocb = false;
            if (this.f12706stevsuqkhv && this.f12686lmojexxdyd != null && this.f12671iozdgvuglv != null) {
                requestLayout();
            }
            this.f12706stevsuqkhv = false;
        }
    }

    void tzroggbefp() {
        if (this.f12670ikoacuggdj != null) {
            return;
        }
        EdgeEffect edgeEffectIobyxmoadg = this.f12678jhduphickx.iobyxmoadg(this, 0);
        this.f12670ikoacuggdj = edgeEffectIobyxmoadg;
        if (this.f12698pmvmpeiblj) {
            edgeEffectIobyxmoadg.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectIobyxmoadg.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    String ulzqkzuiru() {
        return " " + super.toString() + ", adapter:" + this.f12671iozdgvuglv + ", layout:" + this.f12686lmojexxdyd + ", context:" + getContext();
    }

    long uwvvkdfqfp(iozdgvuglv iozdgvuglvVar) {
        return this.f12671iozdgvuglv.hasStableIds() ? iozdgvuglvVar.getItemId() : iozdgvuglvVar.mPosition;
    }

    void vdvldrhtss(iozdgvuglv iozdgvuglvVar, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar2) {
        dxjokdxxww(iozdgvuglvVar);
        iozdgvuglvVar.setIsRecyclable(false);
        if (this.f12690metgxyhuhe.ppxfxbqfkf(iozdgvuglvVar, ppxfxbqfkfVar, ppxfxbqfkfVar2)) {
            c();
        }
    }

    Rect weqkydbzbr(View view) {
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) view.getLayoutParams();
        if (!vdvldrhtssVar.f12785jyumaefscl) {
            return vdvldrhtssVar.f12786yggfygwlhe;
        }
        if (this.f12709uawqvzlxes.eablkybsjg() && (vdvldrhtssVar.ppxfxbqfkf() || vdvldrhtssVar.gxszxtbevo())) {
            return vdvldrhtssVar.f12786yggfygwlhe;
        }
        Rect rect = vdvldrhtssVar.f12786yggfygwlhe;
        rect.set(0, 0, 0, 0);
        int size = this.f12722ylkuphrtab.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.f12673istkbnxepw.set(0, 0, 0, 0);
            ((ojitshcjhn) this.f12722ylkuphrtab.get(i13)).getItemOffsets(this.f12673istkbnxepw, view, this, this.f12709uawqvzlxes);
            int i14 = rect.left;
            Rect rect2 = this.f12673istkbnxepw;
            rect.left = i14 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        vdvldrhtssVar.f12785jyumaefscl = false;
        return rect;
    }

    public void wflxmlrfwp(zdlpuopuiu zdlpuopuiuVar) {
        this.f12697pkzmftpjix.add(zdlpuopuiuVar);
    }

    void wwaezpbzkn() {
        if (this.f12671iozdgvuglv == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f12686lmojexxdyd == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f12709uawqvzlxes.f12808btonecajqb = false;
        boolean z13 = this.f12681jrbgnlbqoe && !(this.f12663fmlbqenlif == getWidth() && this.f12661ezmngbhpjk == getHeight());
        this.f12663fmlbqenlif = 0;
        this.f12661ezmngbhpjk = 0;
        this.f12681jrbgnlbqoe = false;
        if (this.f12709uawqvzlxes.f12811eablkybsjg == 1) {
            ylkuphrtab();
            this.f12686lmojexxdyd.S(this);
            pkzmftpjix();
        } else if (this.f12655cqumvgiudr.vdvldrhtss() || z13 || this.f12686lmojexxdyd.iwxlajgraz() != getWidth() || this.f12686lmojexxdyd.zfvoamnweg() != getHeight()) {
            this.f12686lmojexxdyd.S(this);
            pkzmftpjix();
        } else {
            this.f12686lmojexxdyd.S(this);
        }
        hcddaimhww();
    }

    void wypolnanlu() {
        int i13;
        for (int size = this.f12691mhtqkkgtqm.size() - 1; size >= 0; size--) {
            iozdgvuglv iozdgvuglvVar = (iozdgvuglv) this.f12691mhtqkkgtqm.get(size);
            if (iozdgvuglvVar.itemView.getParent() == this && !iozdgvuglvVar.shouldIgnore() && (i13 = iozdgvuglvVar.mPendingAccessibilityState) != -1) {
                jhduphickx.uawqvzlxes(iozdgvuglvVar.itemView, i13);
                iozdgvuglvVar.mPendingAccessibilityState = -1;
            }
        }
        this.f12691mhtqkkgtqm.clear();
    }

    void x() {
        int iBtonecajqb = this.f12660esjtqupxsv.btonecajqb();
        for (int i13 = 0; i13 < iBtonecajqb; i13++) {
            iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.dxjokdxxww(i13));
            if (f12649yzdjzghtvl && iozdgvuglvVarZfvoamnweg.mPosition == -1 && !iozdgvuglvVarZfvoamnweg.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + ulzqkzuiru());
            }
            if (!iozdgvuglvVarZfvoamnweg.shouldIgnore()) {
                iozdgvuglvVarZfvoamnweg.saveOldPosition();
            }
        }
    }

    public iozdgvuglv xrmfcynszj(long j13) {
        nufgyqmvbu nufgyqmvbuVar = this.f12671iozdgvuglv;
        iozdgvuglv iozdgvuglvVar = null;
        if (nufgyqmvbuVar != null && nufgyqmvbuVar.hasStableIds()) {
            int iBtonecajqb = this.f12660esjtqupxsv.btonecajqb();
            for (int i13 = 0; i13 < iBtonecajqb; i13++) {
                iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(this.f12660esjtqupxsv.dxjokdxxww(i13));
                if (iozdgvuglvVarZfvoamnweg != null && !iozdgvuglvVarZfvoamnweg.isRemoved() && iozdgvuglvVarZfvoamnweg.getItemId() == j13) {
                    if (!this.f12660esjtqupxsv.agtfadlqog(iozdgvuglvVarZfvoamnweg.itemView)) {
                        return iozdgvuglvVarZfvoamnweg;
                    }
                    iozdgvuglvVar = iozdgvuglvVarZfvoamnweg;
                }
            }
        }
        return iozdgvuglvVar;
    }

    boolean y(int i13, int i14, MotionEvent motionEvent, int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        pmvmpeiblj();
        if (this.f12671iozdgvuglv != null) {
            int[] iArr = this.f12665grlcpdaxtj;
            iArr[0] = 0;
            iArr[1] = 0;
            z(i13, i14, iArr);
            int[] iArr2 = this.f12665grlcpdaxtj;
            int i23 = iArr2[0];
            int i24 = iArr2[1];
            i16 = i24;
            i17 = i23;
            i18 = i13 - i23;
            i19 = i14 - i24;
        } else {
            i16 = 0;
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        if (!this.f12722ylkuphrtab.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f12665grlcpdaxtj;
        iArr3[0] = 0;
        iArr3[1] = 0;
        hkdspvbjdz(i17, i16, i18, i19, this.f12664fyldjkxazc, i15, iArr3);
        int[] iArr4 = this.f12665grlcpdaxtj;
        int i25 = iArr4[0];
        int i26 = i18 - i25;
        int i27 = iArr4[1];
        int i28 = i19 - i27;
        boolean z13 = (i25 == 0 && i27 == 0) ? false : true;
        int i29 = this.f12703sflfametgt;
        int[] iArr5 = this.f12664fyldjkxazc;
        int i33 = iArr5[0];
        this.f12703sflfametgt = i29 - i33;
        int i34 = this.f12725zfvoamnweg;
        int i35 = iArr5[1];
        this.f12725zfvoamnweg = i34 - i35;
        int[] iArr6 = this.f12672ipoelvxyzq;
        iArr6[0] = iArr6[0] + i33;
        iArr6[1] = iArr6[1] + i35;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !v1.cdpycssgdh.iobyxmoadg(motionEvent, 8194)) {
                g(motionEvent.getX(), i26, motionEvent.getY(), i28);
            }
            iwizpuwonk(i13, i14);
        }
        if (i17 != 0 || i16 != 0) {
            dsvhmnatus(i17, i16);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z13 && i17 == 0 && i16 == 0) ? false : true;
    }

    void yadqdtsiqt(View view) {
        iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(view);
        fmlbqenlif(view);
        nufgyqmvbu nufgyqmvbuVar = this.f12671iozdgvuglv;
        if (nufgyqmvbuVar != null && iozdgvuglvVarZfvoamnweg != null) {
            nufgyqmvbuVar.onViewAttachedToWindow(iozdgvuglvVarZfvoamnweg);
        }
        List list = this.f12705sopmlzcsov;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((oxmwwwfdhm) this.f12705sopmlzcsov.get(size)).wkgbmnqykc(view);
            }
        }
    }

    public int ydmasvzmpa(View view) {
        iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(view);
        if (iozdgvuglvVarZfvoamnweg != null) {
            return iozdgvuglvVarZfvoamnweg.getLayoutPosition();
        }
        return -1;
    }

    public int yfnezrywwk(View view) {
        iozdgvuglv iozdgvuglvVarZfvoamnweg = zfvoamnweg(view);
        if (iozdgvuglvVarZfvoamnweg != null) {
            return iozdgvuglvVarZfvoamnweg.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    void yzdjzghtvl() {
        eslsurpljm(true);
    }

    void z(int i13, int i14, int[] iArr) {
        K();
        rhgxfdycjh();
        q1.gtknphoqwx.iobyxmoadg("RV Scroll");
        sopmlzcsov(this.f12709uawqvzlxes);
        int iP = i13 != 0 ? this.f12686lmojexxdyd.P(i13, this.f12682jyumaefscl, this.f12709uawqvzlxes) : 0;
        int iR = i14 != 0 ? this.f12686lmojexxdyd.R(i14, this.f12682jyumaefscl, this.f12709uawqvzlxes) : 0;
        q1.gtknphoqwx.zoijcleaow();
        s();
        yzdjzghtvl();
        N(false);
        if (iArr != null) {
            iArr[0] = iP;
            iArr[1] = iR;
        }
    }

    void zoijcleaow(int i13, int i14) {
        if (i13 < 0) {
            tzroggbefp();
            if (this.f12670ikoacuggdj.isFinished()) {
                this.f12670ikoacuggdj.onAbsorb(-i13);
            }
        } else if (i13 > 0) {
            mbcevpiqjq();
            if (this.f12683jztzpxfvev.isFinished()) {
                this.f12683jztzpxfvev.onAbsorb(i13);
            }
        }
        if (i14 < 0) {
            ntlheqmsrt();
            if (this.f12695okpsazkaxt.isFinished()) {
                this.f12695okpsazkaxt.onAbsorb(-i14);
            }
        } else if (i14 > 0) {
            kegysxyocb();
            if (this.f12717xrmfcynszj.isFinished()) {
                this.f12717xrmfcynszj.onAbsorb(i14);
            }
        }
        if (i13 == 0 && i14 == 0) {
            return;
        }
        jhduphickx.xrmfcynszj(this);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m5.iobyxmoadg.recyclerViewStyle);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Parcelable f12727jyumaefscl;

        class iobyxmoadg implements Parcelable.ClassLoaderCreator {
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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12727jyumaefscl = parcel.readParcelable(classLoader == null ? rgvfuqvkyq.class.getClassLoader() : classLoader);
        }

        void ppxfxbqfkf(SavedState savedState) {
            this.f12727jyumaefscl = savedState.f12727jyumaefscl;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeParcelable(this.f12727jyumaefscl, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f12721yggfygwlhe = new esjtqupxsv();
        this.f12682jyumaefscl = new iwizpuwonk();
        this.f12685lereixgezr = new androidx.recyclerview.widget.zynmafqrjb();
        this.f12726zynmafqrjb = new iobyxmoadg();
        this.f12673istkbnxepw = new Rect();
        this.f12653cdpycssgdh = new Rect();
        this.f12718yadqdtsiqt = new RectF();
        this.f12715wwaezpbzkn = new ArrayList();
        this.f12722ylkuphrtab = new ArrayList();
        this.f12697pkzmftpjix = new ArrayList();
        this.f12716wypolnanlu = 0;
        this.f12656crxdokpmqz = false;
        this.f12679jlmebxxoox = false;
        this.f12700ribwqtqdhb = 0;
        this.f12712vipkmwdibw = 0;
        this.f12678jhduphickx = f12647j;
        this.f12690metgxyhuhe = new androidx.recyclerview.widget.lqeggnwhkg();
        this.f12701rlfsiqarku = 0;
        this.f12657czzsidtyhn = -1;
        this.f12713weqkydbzbr = Float.MIN_VALUE;
        this.f12687lrnfpwlwnk = Float.MIN_VALUE;
        this.f12724zeieaojujs = true;
        this.f12693nuxfzjnpeb = new yadqdtsiqt();
        this.f12702roivzttewh = f12641e ? new androidx.recyclerview.widget.gtknphoqwx.zoijcleaow() : null;
        this.f12709uawqvzlxes = new zynmafqrjb();
        this.f12659dvvnrvtcbc = false;
        this.f12704skhdrjzrfn = false;
        this.f12669igdgnonuha = new agtfadlqog();
        this.f12688lxfrhoxuzk = false;
        this.f12662fiwbwshyhd = new int[2];
        this.f12664fyldjkxazc = new int[2];
        this.f12672ipoelvxyzq = new int[2];
        this.f12665grlcpdaxtj = new int[2];
        this.f12691mhtqkkgtqm = new ArrayList();
        this.f12676ixidwrxhsl = new zoijcleaow();
        this.f12663fmlbqenlif = 0;
        this.f12661ezmngbhpjk = 0;
        this.f12699rhgxfdycjh = new wkgbmnqykc();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f12694oipsdeybqn = viewConfiguration.getScaledTouchSlop();
        this.f12713weqkydbzbr = jztzpxfvev.eablkybsjg(viewConfiguration, context);
        this.f12687lrnfpwlwnk = jztzpxfvev.nufgyqmvbu(viewConfiguration, context);
        this.f12696opjhrmiecq = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12677iyctptxqzt = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f12723zdlpuopuiu = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f12690metgxyhuhe.iwizpuwonk(this.f12669igdgnonuha);
        roivzttewh();
        auzgnhcxok();
        uawqvzlxes();
        if (jhduphickx.cqumvgiudr(this) == 0) {
            jhduphickx.uawqvzlxes(this, 1);
        }
        this.f12710ulzqkzuiru = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.iwizpuwonk(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m5.wkgbmnqykc.RecyclerView, i13, 0);
        jhduphickx.sflfametgt(this, context, m5.wkgbmnqykc.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i13, 0);
        String string = typedArrayObtainStyledAttributes.getString(m5.wkgbmnqykc.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(m5.wkgbmnqykc.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f12698pmvmpeiblj = typedArrayObtainStyledAttributes.getBoolean(m5.wkgbmnqykc.RecyclerView_android_clipToPadding, true);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(m5.wkgbmnqykc.RecyclerView_fastScrollEnabled, false);
        this.f12654cllcsxoeiz = z13;
        if (z13) {
            iwxlajgraz((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(m5.wkgbmnqykc.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(m5.wkgbmnqykc.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(m5.wkgbmnqykc.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(m5.wkgbmnqykc.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        zynmafqrjb(context, string, attributeSet, i13, 0);
        int[] iArr = f12648krqnebusok;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i13, 0);
        jhduphickx.sflfametgt(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i13, 0);
        boolean z14 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z14);
        a2.iobyxmoadg.nufgyqmvbu(this, true);
    }

    public static class vdvldrhtss extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f12784iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f12785jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final Rect f12786yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        iozdgvuglv f12787zdlpuopuiu;

        public vdvldrhtss(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12786yggfygwlhe = new Rect();
            this.f12785jyumaefscl = true;
            this.f12784iwizpuwonk = false;
        }

        public boolean eablkybsjg() {
            return this.f12787zdlpuopuiu.isRemoved();
        }

        public boolean gxszxtbevo() {
            return this.f12787zdlpuopuiu.isInvalid();
        }

        public boolean ppxfxbqfkf() {
            return this.f12787zdlpuopuiu.isUpdated();
        }

        public int zoijcleaow() {
            return this.f12787zdlpuopuiu.getLayoutPosition();
        }

        public vdvldrhtss(int i13, int i14) {
            super(i13, i14);
            this.f12786yggfygwlhe = new Rect();
            this.f12785jyumaefscl = true;
            this.f12784iwizpuwonk = false;
        }

        public vdvldrhtss(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12786yggfygwlhe = new Rect();
            this.f12785jyumaefscl = true;
            this.f12784iwizpuwonk = false;
        }

        public vdvldrhtss(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12786yggfygwlhe = new Rect();
            this.f12785jyumaefscl = true;
            this.f12784iwizpuwonk = false;
        }

        public vdvldrhtss(vdvldrhtss vdvldrhtssVar) {
            super((ViewGroup.LayoutParams) vdvldrhtssVar);
            this.f12786yggfygwlhe = new Rect();
            this.f12785jyumaefscl = true;
            this.f12784iwizpuwonk = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        rgvfuqvkyq rgvfuqvkyqVar = this.f12686lmojexxdyd;
        if (rgvfuqvkyqVar != null) {
            return rgvfuqvkyqVar.sopmlzcsov(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + ulzqkzuiru());
    }
}
