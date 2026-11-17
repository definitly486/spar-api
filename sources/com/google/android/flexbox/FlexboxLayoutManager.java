package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.rgvfuqvkyq;
import androidx.recyclerview.widget.yggfygwlhe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FlexboxLayoutManager extends RecyclerView.rgvfuqvkyq implements com.google.android.flexbox.iobyxmoadg, RecyclerView.pmvmpeiblj.zoijcleaow {

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private static final Rect f21850ydmasvzmpa = new Rect();

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private int f21851cllcsxoeiz;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private zoijcleaow f21852crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private View f21853czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private int f21854dsvhmnatus;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private int f21855hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private int f21856ikoacuggdj;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private int f21857jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private yggfygwlhe f21858jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private int f21859jpowsppfya;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private int f21860jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f21861kegysxyocb;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private final com.google.android.flexbox.ppxfxbqfkf f21862mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private SparseArray f21863metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private RecyclerView.iwizpuwonk f21864ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private int f21865okpsazkaxt;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private yggfygwlhe f21866ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private final Context f21867rlfsiqarku;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private ppxfxbqfkf f21868sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private boolean f21869stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private List f21870tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private RecyclerView.zynmafqrjb f21871ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private int f21872uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private SavedState f21873vipkmwdibw;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private int f21874wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private boolean f21875xrmfcynszj;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private com.google.android.flexbox.ppxfxbqfkf.zoijcleaow f21876yfnezrywwk;

    private static class ppxfxbqfkf {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private boolean f21888btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private int f21889dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f21890eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private int f21891gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f21892iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f21893lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f21894nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f21895ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f21896wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f21897zoijcleaow;

        private ppxfxbqfkf() {
            this.f21894nufgyqmvbu = 1;
            this.f21889dxjokdxxww = 1;
        }

        static /* synthetic */ int agtfadlqog(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
            int i14 = ppxfxbqfkfVar.f21895ppxfxbqfkf + i13;
            ppxfxbqfkfVar.f21895ppxfxbqfkf = i14;
            return i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean cdpycssgdh(RecyclerView.zynmafqrjb zynmafqrjbVar, List list) {
            int i13;
            int i14 = this.f21896wkgbmnqykc;
            return i14 >= 0 && i14 < zynmafqrjbVar.zoijcleaow() && (i13 = this.f21895ppxfxbqfkf) >= 0 && i13 < list.size();
        }

        static /* synthetic */ int draadjrbmk(ppxfxbqfkf ppxfxbqfkfVar) {
            int i13 = ppxfxbqfkfVar.f21895ppxfxbqfkf;
            ppxfxbqfkfVar.f21895ppxfxbqfkf = i13 + 1;
            return i13;
        }

        static /* synthetic */ int dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
            int i14 = ppxfxbqfkfVar.f21892iobyxmoadg - i13;
            ppxfxbqfkfVar.f21892iobyxmoadg = i14;
            return i14;
        }

        static /* synthetic */ int jyumaefscl(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
            int i14 = ppxfxbqfkfVar.f21896wkgbmnqykc - i13;
            ppxfxbqfkfVar.f21896wkgbmnqykc = i14;
            return i14;
        }

        static /* synthetic */ int ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
            int i14 = ppxfxbqfkfVar.f21890eablkybsjg + i13;
            ppxfxbqfkfVar.f21890eablkybsjg = i14;
            return i14;
        }

        static /* synthetic */ int vdvldrhtss(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
            int i14 = ppxfxbqfkfVar.f21891gxszxtbevo + i13;
            ppxfxbqfkfVar.f21891gxszxtbevo = i14;
            return i14;
        }

        static /* synthetic */ int wflxmlrfwp(ppxfxbqfkf ppxfxbqfkfVar) {
            int i13 = ppxfxbqfkfVar.f21895ppxfxbqfkf;
            ppxfxbqfkfVar.f21895ppxfxbqfkf = i13 - 1;
            return i13;
        }

        static /* synthetic */ int wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
            int i14 = ppxfxbqfkfVar.f21890eablkybsjg - i13;
            ppxfxbqfkfVar.f21890eablkybsjg = i14;
            return i14;
        }

        static /* synthetic */ int yggfygwlhe(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
            int i14 = ppxfxbqfkfVar.f21896wkgbmnqykc + i13;
            ppxfxbqfkfVar.f21896wkgbmnqykc = i14;
            return i14;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f21892iobyxmoadg + ", mFlexLinePosition=" + this.f21895ppxfxbqfkf + ", mPosition=" + this.f21896wkgbmnqykc + ", mOffset=" + this.f21890eablkybsjg + ", mScrollingOffset=" + this.f21891gxszxtbevo + ", mLastScrollDelta=" + this.f21893lqeggnwhkg + ", mItemDirection=" + this.f21894nufgyqmvbu + ", mLayoutDirection=" + this.f21889dxjokdxxww + '}';
        }
    }

    private class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f21898eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f21899gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f21900iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private boolean f21901lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f21903ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f21904wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f21905zoijcleaow;

        private zoijcleaow() {
            this.f21904wkgbmnqykc = 0;
        }

        static /* synthetic */ int draadjrbmk(zoijcleaow zoijcleaowVar, int i13) {
            int i14 = zoijcleaowVar.f21904wkgbmnqykc + i13;
            zoijcleaowVar.f21904wkgbmnqykc = i14;
            return i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kcexrzcfyt(View view) {
            yggfygwlhe yggfygwlheVar = FlexboxLayoutManager.this.f21855hkdspvbjdz == 0 ? FlexboxLayoutManager.this.f21866ribwqtqdhb : FlexboxLayoutManager.this.f21858jlmebxxoox;
            if (FlexboxLayoutManager.this.vdvldrhtss() || !FlexboxLayoutManager.this.f21869stevsuqkhv) {
                if (this.f21898eablkybsjg) {
                    this.f21903ppxfxbqfkf = yggfygwlheVar.wkgbmnqykc(view) + yggfygwlheVar.rgvfuqvkyq();
                } else {
                    this.f21903ppxfxbqfkf = yggfygwlheVar.lqeggnwhkg(view);
                }
            } else if (this.f21898eablkybsjg) {
                this.f21903ppxfxbqfkf = yggfygwlheVar.lqeggnwhkg(view) + yggfygwlheVar.rgvfuqvkyq();
            } else {
                this.f21903ppxfxbqfkf = yggfygwlheVar.wkgbmnqykc(view);
            }
            this.f21900iobyxmoadg = FlexboxLayoutManager.this.lrnfpwlwnk(view);
            this.f21901lqeggnwhkg = false;
            int[] iArr = FlexboxLayoutManager.this.f21862mbcevpiqjq.f21908ppxfxbqfkf;
            int i13 = this.f21900iobyxmoadg;
            if (i13 == -1) {
                i13 = 0;
            }
            int i14 = iArr[i13];
            this.f21905zoijcleaow = i14 != -1 ? i14 : 0;
            if (FlexboxLayoutManager.this.f21870tzroggbefp.size() > this.f21905zoijcleaow) {
                this.f21900iobyxmoadg = ((com.google.android.flexbox.zoijcleaow) FlexboxLayoutManager.this.f21870tzroggbefp.get(this.f21905zoijcleaow)).f21925ojitshcjhn;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void oxmwwwfdhm() {
            if (FlexboxLayoutManager.this.vdvldrhtss() || !FlexboxLayoutManager.this.f21869stevsuqkhv) {
                this.f21903ppxfxbqfkf = this.f21898eablkybsjg ? FlexboxLayoutManager.this.f21858jlmebxxoox.dxjokdxxww() : FlexboxLayoutManager.this.f21858jlmebxxoox.agtfadlqog();
            } else {
                this.f21903ppxfxbqfkf = this.f21898eablkybsjg ? FlexboxLayoutManager.this.f21858jlmebxxoox.dxjokdxxww() : FlexboxLayoutManager.this.iwxlajgraz() - FlexboxLayoutManager.this.f21858jlmebxxoox.agtfadlqog();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zdlpuopuiu() {
            this.f21900iobyxmoadg = -1;
            this.f21905zoijcleaow = -1;
            this.f21903ppxfxbqfkf = Integer.MIN_VALUE;
            this.f21899gxszxtbevo = false;
            this.f21901lqeggnwhkg = false;
            if (FlexboxLayoutManager.this.vdvldrhtss()) {
                if (FlexboxLayoutManager.this.f21855hkdspvbjdz == 0) {
                    this.f21898eablkybsjg = FlexboxLayoutManager.this.f21859jpowsppfya == 1;
                    return;
                } else {
                    this.f21898eablkybsjg = FlexboxLayoutManager.this.f21855hkdspvbjdz == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.f21855hkdspvbjdz == 0) {
                this.f21898eablkybsjg = FlexboxLayoutManager.this.f21859jpowsppfya == 3;
            } else {
                this.f21898eablkybsjg = FlexboxLayoutManager.this.f21855hkdspvbjdz == 2;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f21900iobyxmoadg + ", mFlexLinePosition=" + this.f21905zoijcleaow + ", mCoordinate=" + this.f21903ppxfxbqfkf + ", mPerpendicularCoordinate=" + this.f21904wkgbmnqykc + ", mLayoutFromEnd=" + this.f21898eablkybsjg + ", mValid=" + this.f21899gxszxtbevo + ", mAssignedFromSavedState=" + this.f21901lqeggnwhkg + '}';
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    private View B0(int i13, int i14, boolean z13) {
        int i15 = i14 > i13 ? 1 : -1;
        while (i13 != i14) {
            View viewRibwqtqdhb = ribwqtqdhb(i13);
            if (M0(viewRibwqtqdhb, z13)) {
                return viewRibwqtqdhb;
            }
            i13 += i15;
        }
        return null;
    }

    private View C0(int i13, int i14, int i15) {
        int iLrnfpwlwnk;
        t0();
        s0();
        int iAgtfadlqog = this.f21858jlmebxxoox.agtfadlqog();
        int iDxjokdxxww = this.f21858jlmebxxoox.dxjokdxxww();
        int i16 = i14 > i13 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i13 != i14) {
            View viewRibwqtqdhb = ribwqtqdhb(i13);
            if (viewRibwqtqdhb != null && (iLrnfpwlwnk = lrnfpwlwnk(viewRibwqtqdhb)) >= 0 && iLrnfpwlwnk < i15) {
                if (((RecyclerView.vdvldrhtss) viewRibwqtqdhb.getLayoutParams()).eablkybsjg()) {
                    if (view2 == null) {
                        view2 = viewRibwqtqdhb;
                    }
                } else {
                    if (this.f21858jlmebxxoox.lqeggnwhkg(viewRibwqtqdhb) >= iAgtfadlqog && this.f21858jlmebxxoox.wkgbmnqykc(viewRibwqtqdhb) <= iDxjokdxxww) {
                        return viewRibwqtqdhb;
                    }
                    if (view == null) {
                        view = viewRibwqtqdhb;
                    }
                }
            }
            i13 += i16;
        }
        return view != null ? view : view2;
    }

    private int D0(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, boolean z13) {
        int iK0;
        int iDxjokdxxww;
        if (vdvldrhtss() || !this.f21869stevsuqkhv) {
            int iDxjokdxxww2 = this.f21858jlmebxxoox.dxjokdxxww() - i13;
            if (iDxjokdxxww2 <= 0) {
                return 0;
            }
            iK0 = -K0(-iDxjokdxxww2, iwizpuwonkVar, zynmafqrjbVar);
        } else {
            int iAgtfadlqog = i13 - this.f21858jlmebxxoox.agtfadlqog();
            if (iAgtfadlqog <= 0) {
                return 0;
            }
            iK0 = K0(iAgtfadlqog, iwizpuwonkVar, zynmafqrjbVar);
        }
        int i14 = i13 + iK0;
        if (!z13 || (iDxjokdxxww = this.f21858jlmebxxoox.dxjokdxxww() - i14) <= 0) {
            return iK0;
        }
        this.f21858jlmebxxoox.kcexrzcfyt(iDxjokdxxww);
        return iDxjokdxxww + iK0;
    }

    private int E0(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, boolean z13) {
        int iK0;
        int iAgtfadlqog;
        if (vdvldrhtss() || !this.f21869stevsuqkhv) {
            int iAgtfadlqog2 = i13 - this.f21858jlmebxxoox.agtfadlqog();
            if (iAgtfadlqog2 <= 0) {
                return 0;
            }
            iK0 = -K0(iAgtfadlqog2, iwizpuwonkVar, zynmafqrjbVar);
        } else {
            int iDxjokdxxww = this.f21858jlmebxxoox.dxjokdxxww() - i13;
            if (iDxjokdxxww <= 0) {
                return 0;
            }
            iK0 = K0(-iDxjokdxxww, iwizpuwonkVar, zynmafqrjbVar);
        }
        int i14 = i13 + iK0;
        if (!z13 || (iAgtfadlqog = i14 - this.f21858jlmebxxoox.agtfadlqog()) <= 0) {
            return iK0;
        }
        this.f21858jlmebxxoox.kcexrzcfyt(-iAgtfadlqog);
        return iK0 - iAgtfadlqog;
    }

    private int F0(View view) {
        return xrmfcynszj(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.vdvldrhtss) view.getLayoutParams())).bottomMargin;
    }

    private View G0() {
        return ribwqtqdhb(0);
    }

    private int H0(View view) {
        return rlfsiqarku(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.vdvldrhtss) view.getLayoutParams())).leftMargin;
    }

    private int I0(View view) {
        return yfnezrywwk(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.vdvldrhtss) view.getLayoutParams())).rightMargin;
    }

    private int J0(View view) {
        return ydmasvzmpa(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.vdvldrhtss) view.getLayoutParams())).topMargin;
    }

    private int K0(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0 || i13 == 0) {
            return 0;
        }
        t0();
        int i14 = 1;
        this.f21868sopmlzcsov.f21888btonecajqb = true;
        boolean z13 = !vdvldrhtss() && this.f21869stevsuqkhv;
        if (!z13 ? i13 <= 0 : i13 >= 0) {
            i14 = -1;
        }
        int iAbs = Math.abs(i13);
        f1(i14, iAbs);
        int iU0 = this.f21868sopmlzcsov.f21891gxszxtbevo + u0(iwizpuwonkVar, zynmafqrjbVar, this.f21868sopmlzcsov);
        if (iU0 < 0) {
            return 0;
        }
        if (z13) {
            if (iAbs > iU0) {
                i13 = (-i14) * iU0;
            }
        } else if (iAbs > iU0) {
            i13 = i14 * iU0;
        }
        this.f21858jlmebxxoox.kcexrzcfyt(-i13);
        this.f21868sopmlzcsov.f21893lqeggnwhkg = i13;
        return i13;
    }

    private int L0(int i13) {
        int iMin;
        if (vipkmwdibw() == 0 || i13 == 0) {
            return 0;
        }
        t0();
        boolean zVdvldrhtss = vdvldrhtss();
        View view = this.f21853czzsidtyhn;
        int width = zVdvldrhtss ? view.getWidth() : view.getHeight();
        int iIwxlajgraz = zVdvldrhtss ? iwxlajgraz() : zfvoamnweg();
        if (bfopjjpdmp() == 1) {
            int iAbs = Math.abs(i13);
            if (i13 < 0) {
                iMin = Math.min((iIwxlajgraz + this.f21852crxdokpmqz.f21904wkgbmnqykc) - width, iAbs);
            } else {
                if (this.f21852crxdokpmqz.f21904wkgbmnqykc + i13 <= 0) {
                    return i13;
                }
                iMin = this.f21852crxdokpmqz.f21904wkgbmnqykc;
            }
        } else {
            if (i13 > 0) {
                return Math.min((iIwxlajgraz - this.f21852crxdokpmqz.f21904wkgbmnqykc) - width, i13);
            }
            if (this.f21852crxdokpmqz.f21904wkgbmnqykc + i13 >= 0) {
                return i13;
            }
            iMin = this.f21852crxdokpmqz.f21904wkgbmnqykc;
        }
        return -iMin;
    }

    private boolean M0(View view, boolean z13) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iIwxlajgraz = iwxlajgraz() - getPaddingRight();
        int iZfvoamnweg = zfvoamnweg() - getPaddingBottom();
        int iH0 = H0(view);
        int iJ0 = J0(view);
        int iI0 = I0(view);
        int iF0 = F0(view);
        boolean z14 = paddingLeft <= iH0 && iIwxlajgraz >= iI0;
        boolean z15 = iH0 >= iIwxlajgraz || iI0 >= paddingLeft;
        boolean z16 = paddingTop <= iJ0 && iZfvoamnweg >= iF0;
        boolean z17 = iJ0 >= iZfvoamnweg || iF0 >= paddingTop;
        if (z13) {
            return z14 && z16;
        }
        return z15 && z17;
    }

    private int N0(com.google.android.flexbox.zoijcleaow zoijcleaowVar, ppxfxbqfkf ppxfxbqfkfVar) {
        return vdvldrhtss() ? O0(zoijcleaowVar, ppxfxbqfkfVar) : P0(zoijcleaowVar, ppxfxbqfkfVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:53:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0195 A[SYNTHETIC] */
    private int O0(com.google.android.flexbox.zoijcleaow zoijcleaowVar, ppxfxbqfkf ppxfxbqfkfVar) {
        float f13;
        float f14;
        float f15;
        float measuredWidth;
        float measuredWidth2;
        float fMax;
        int iZoijcleaow;
        int i13;
        int i14;
        View viewDxjokdxxww;
        int iEsjtqupxsv;
        int iCqumvgiudr;
        LayoutParams layoutParams;
        float fOpjhrmiecq;
        float fNuxfzjnpeb;
        int iUawqvzlxes;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int iIwxlajgraz = iwxlajgraz();
        int i15 = ppxfxbqfkfVar.f21890eablkybsjg;
        if (ppxfxbqfkfVar.f21889dxjokdxxww == -1) {
            i15 -= zoijcleaowVar.f21923lqeggnwhkg;
        }
        int i16 = i15;
        int i17 = ppxfxbqfkfVar.f21896wkgbmnqykc;
        int i18 = this.f21851cllcsxoeiz;
        int i19 = 1;
        if (i18 != 0) {
            if (i18 == 1) {
                int i23 = zoijcleaowVar.f21919eablkybsjg;
                float f16 = (iIwxlajgraz - i23) + paddingRight;
                f15 = 0.0f;
                f14 = i23 - paddingLeft;
                f13 = f16;
            } else if (i18 == 2) {
                int i24 = zoijcleaowVar.f21919eablkybsjg;
                f13 = paddingLeft + ((iIwxlajgraz - i24) / 2.0f);
                f14 = (iIwxlajgraz - paddingRight) - ((iIwxlajgraz - i24) / 2.0f);
            } else if (i18 == 3) {
                f13 = paddingLeft;
                int i25 = zoijcleaowVar.f21924nufgyqmvbu;
                f15 = (iIwxlajgraz - zoijcleaowVar.f21919eablkybsjg) / (i25 != 1 ? i25 - 1 : 1.0f);
                f14 = iIwxlajgraz - paddingRight;
            } else if (i18 == 4) {
                int i26 = zoijcleaowVar.f21924nufgyqmvbu;
                f15 = i26 != 0 ? (iIwxlajgraz - zoijcleaowVar.f21919eablkybsjg) / i26 : 0.0f;
                float f17 = f15 / 2.0f;
                f13 = paddingLeft + f17;
                f14 = (iIwxlajgraz - paddingRight) - f17;
            } else {
                if (i18 != 5) {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.f21851cllcsxoeiz);
                }
                int i27 = zoijcleaowVar.f21924nufgyqmvbu;
                f15 = i27 != 0 ? (iIwxlajgraz - zoijcleaowVar.f21919eablkybsjg) / (i27 + 1) : 0.0f;
                f13 = paddingLeft + f15;
                f14 = (iIwxlajgraz - paddingRight) - f15;
            }
            measuredWidth = f13 - this.f21852crxdokpmqz.f21904wkgbmnqykc;
            measuredWidth2 = f14 - this.f21852crxdokpmqz.f21904wkgbmnqykc;
            fMax = Math.max(f15, 0.0f);
            iZoijcleaow = zoijcleaowVar.zoijcleaow();
            i13 = 0;
            i14 = i17;
            while (i14 < i17 + iZoijcleaow) {
                viewDxjokdxxww = dxjokdxxww(i14);
                if (viewDxjokdxxww != null) {
                    if (ppxfxbqfkfVar.f21889dxjokdxxww == i19) {
                        lereixgezr(viewDxjokdxxww, f21850ydmasvzmpa);
                        zdlpuopuiu(viewDxjokdxxww);
                    } else {
                        lereixgezr(viewDxjokdxxww, f21850ydmasvzmpa);
                        yggfygwlhe(viewDxjokdxxww, i13);
                        i13++;
                    }
                    int i28 = i13;
                    com.google.android.flexbox.ppxfxbqfkf ppxfxbqfkfVar2 = this.f21862mbcevpiqjq;
                    long j13 = ppxfxbqfkfVar2.f21909wkgbmnqykc[i14];
                    iEsjtqupxsv = ppxfxbqfkfVar2.esjtqupxsv(j13);
                    iCqumvgiudr = this.f21862mbcevpiqjq.cqumvgiudr(j13);
                    layoutParams = (LayoutParams) viewDxjokdxxww.getLayoutParams();
                    if (Y(viewDxjokdxxww, iEsjtqupxsv, iCqumvgiudr, layoutParams)) {
                        viewDxjokdxxww.measure(iEsjtqupxsv, iCqumvgiudr);
                    }
                    fOpjhrmiecq = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + opjhrmiecq(viewDxjokdxxww);
                    fNuxfzjnpeb = measuredWidth2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + nuxfzjnpeb(viewDxjokdxxww));
                    iUawqvzlxes = i16 + uawqvzlxes(viewDxjokdxxww);
                    if (this.f21869stevsuqkhv) {
                        this.f21862mbcevpiqjq.stevsuqkhv(viewDxjokdxxww, zoijcleaowVar, Math.round(fNuxfzjnpeb) - viewDxjokdxxww.getMeasuredWidth(), iUawqvzlxes, Math.round(fNuxfzjnpeb), iUawqvzlxes + viewDxjokdxxww.getMeasuredHeight());
                    } else {
                        this.f21862mbcevpiqjq.stevsuqkhv(viewDxjokdxxww, zoijcleaowVar, Math.round(fOpjhrmiecq), iUawqvzlxes, Math.round(fOpjhrmiecq) + viewDxjokdxxww.getMeasuredWidth(), iUawqvzlxes + viewDxjokdxxww.getMeasuredHeight());
                    }
                    i13 = i28;
                    measuredWidth = fOpjhrmiecq + viewDxjokdxxww.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + nuxfzjnpeb(viewDxjokdxxww) + fMax;
                    measuredWidth2 = fNuxfzjnpeb - (((viewDxjokdxxww.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + opjhrmiecq(viewDxjokdxxww)) + fMax);
                }
                i14++;
                i19 = 1;
            }
            ppxfxbqfkf.agtfadlqog(ppxfxbqfkfVar, this.f21868sopmlzcsov.f21889dxjokdxxww);
            return zoijcleaowVar.iobyxmoadg();
        }
        f13 = paddingLeft;
        f14 = iIwxlajgraz - paddingRight;
        f15 = 0.0f;
        measuredWidth = f13 - this.f21852crxdokpmqz.f21904wkgbmnqykc;
        measuredWidth2 = f14 - this.f21852crxdokpmqz.f21904wkgbmnqykc;
        fMax = Math.max(f15, 0.0f);
        iZoijcleaow = zoijcleaowVar.zoijcleaow();
        i13 = 0;
        i14 = i17;
        while (i14 < i17 + iZoijcleaow) {
            viewDxjokdxxww = dxjokdxxww(i14);
            if (viewDxjokdxxww != null) {
                if (ppxfxbqfkfVar.f21889dxjokdxxww == i19) {
                    lereixgezr(viewDxjokdxxww, f21850ydmasvzmpa);
                    zdlpuopuiu(viewDxjokdxxww);
                } else {
                    lereixgezr(viewDxjokdxxww, f21850ydmasvzmpa);
                    yggfygwlhe(viewDxjokdxxww, i13);
                    i13++;
                }
                int i29 = i13;
                com.google.android.flexbox.ppxfxbqfkf ppxfxbqfkfVar3 = this.f21862mbcevpiqjq;
                long j14 = ppxfxbqfkfVar3.f21909wkgbmnqykc[i14];
                iEsjtqupxsv = ppxfxbqfkfVar3.esjtqupxsv(j14);
                iCqumvgiudr = this.f21862mbcevpiqjq.cqumvgiudr(j14);
                layoutParams = (LayoutParams) viewDxjokdxxww.getLayoutParams();
                if (Y(viewDxjokdxxww, iEsjtqupxsv, iCqumvgiudr, layoutParams)) {
                    viewDxjokdxxww.measure(iEsjtqupxsv, iCqumvgiudr);
                }
                fOpjhrmiecq = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + opjhrmiecq(viewDxjokdxxww);
                fNuxfzjnpeb = measuredWidth2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + nuxfzjnpeb(viewDxjokdxxww));
                iUawqvzlxes = i16 + uawqvzlxes(viewDxjokdxxww);
                if (this.f21869stevsuqkhv) {
                    this.f21862mbcevpiqjq.stevsuqkhv(viewDxjokdxxww, zoijcleaowVar, Math.round(fNuxfzjnpeb) - viewDxjokdxxww.getMeasuredWidth(), iUawqvzlxes, Math.round(fNuxfzjnpeb), iUawqvzlxes + viewDxjokdxxww.getMeasuredHeight());
                } else {
                    this.f21862mbcevpiqjq.stevsuqkhv(viewDxjokdxxww, zoijcleaowVar, Math.round(fOpjhrmiecq), iUawqvzlxes, Math.round(fOpjhrmiecq) + viewDxjokdxxww.getMeasuredWidth(), iUawqvzlxes + viewDxjokdxxww.getMeasuredHeight());
                }
                i13 = i29;
                measuredWidth = fOpjhrmiecq + viewDxjokdxxww.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + nuxfzjnpeb(viewDxjokdxxww) + fMax;
                measuredWidth2 = fNuxfzjnpeb - (((viewDxjokdxxww.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + opjhrmiecq(viewDxjokdxxww)) + fMax);
            }
            i14++;
            i19 = 1;
        }
        ppxfxbqfkf.agtfadlqog(ppxfxbqfkfVar, this.f21868sopmlzcsov.f21889dxjokdxxww);
        return zoijcleaowVar.iobyxmoadg();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0147  */
    /* JADX WARN: Code duplicated, block: B:55:0x014b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0175  */
    /* JADX WARN: Code duplicated, block: B:57:0x019b  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c3  */
    private int P0(com.google.android.flexbox.zoijcleaow zoijcleaowVar, ppxfxbqfkf ppxfxbqfkfVar) {
        float f13;
        float f14;
        float f15;
        float measuredHeight;
        float measuredHeight2;
        float fMax;
        int iZoijcleaow;
        int i13;
        int i14;
        View viewDxjokdxxww;
        float f16;
        int iEsjtqupxsv;
        int iCqumvgiudr;
        LayoutParams layoutParams;
        float fUawqvzlxes;
        float fJlmebxxoox;
        int iOpjhrmiecq;
        int iNuxfzjnpeb;
        boolean z13;
        boolean z14;
        View view;
        int i15;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int iZfvoamnweg = zfvoamnweg();
        int i16 = ppxfxbqfkfVar.f21890eablkybsjg;
        int i17 = ppxfxbqfkfVar.f21890eablkybsjg;
        if (ppxfxbqfkfVar.f21889dxjokdxxww == -1) {
            int i18 = zoijcleaowVar.f21923lqeggnwhkg;
            i16 -= i18;
            i17 += i18;
        }
        int i19 = i16;
        int i23 = i17;
        int i24 = ppxfxbqfkfVar.f21896wkgbmnqykc;
        int i25 = this.f21851cllcsxoeiz;
        boolean z15 = true;
        if (i25 != 0) {
            if (i25 == 1) {
                int i26 = zoijcleaowVar.f21919eablkybsjg;
                float f17 = (iZfvoamnweg - i26) + paddingBottom;
                f15 = 0.0f;
                f14 = i26 - paddingTop;
                f13 = f17;
            } else if (i25 == 2) {
                int i27 = zoijcleaowVar.f21919eablkybsjg;
                f13 = paddingTop + ((iZfvoamnweg - i27) / 2.0f);
                f14 = (iZfvoamnweg - paddingBottom) - ((iZfvoamnweg - i27) / 2.0f);
            } else if (i25 == 3) {
                f13 = paddingTop;
                int i28 = zoijcleaowVar.f21924nufgyqmvbu;
                f15 = (iZfvoamnweg - zoijcleaowVar.f21919eablkybsjg) / (i28 != 1 ? i28 - 1 : 1.0f);
                f14 = iZfvoamnweg - paddingBottom;
            } else if (i25 == 4) {
                int i29 = zoijcleaowVar.f21924nufgyqmvbu;
                f15 = i29 != 0 ? (iZfvoamnweg - zoijcleaowVar.f21919eablkybsjg) / i29 : 0.0f;
                float f18 = f15 / 2.0f;
                f13 = paddingTop + f18;
                f14 = (iZfvoamnweg - paddingBottom) - f18;
            } else {
                if (i25 != 5) {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.f21851cllcsxoeiz);
                }
                int i33 = zoijcleaowVar.f21924nufgyqmvbu;
                f15 = i33 != 0 ? (iZfvoamnweg - zoijcleaowVar.f21919eablkybsjg) / (i33 + 1) : 0.0f;
                f13 = paddingTop + f15;
                f14 = (iZfvoamnweg - paddingBottom) - f15;
            }
            measuredHeight = f13 - this.f21852crxdokpmqz.f21904wkgbmnqykc;
            measuredHeight2 = f14 - this.f21852crxdokpmqz.f21904wkgbmnqykc;
            fMax = Math.max(f15, 0.0f);
            iZoijcleaow = zoijcleaowVar.zoijcleaow();
            i13 = 0;
            i14 = i24;
            while (i14 < i24 + iZoijcleaow) {
                viewDxjokdxxww = dxjokdxxww(i14);
                if (viewDxjokdxxww == null) {
                    i15 = i14;
                    z14 = z15;
                    f16 = fMax;
                } else {
                    com.google.android.flexbox.ppxfxbqfkf ppxfxbqfkfVar2 = this.f21862mbcevpiqjq;
                    f16 = fMax;
                    long j13 = ppxfxbqfkfVar2.f21909wkgbmnqykc[i14];
                    iEsjtqupxsv = ppxfxbqfkfVar2.esjtqupxsv(j13);
                    iCqumvgiudr = this.f21862mbcevpiqjq.cqumvgiudr(j13);
                    layoutParams = (LayoutParams) viewDxjokdxxww.getLayoutParams();
                    if (Y(viewDxjokdxxww, iEsjtqupxsv, iCqumvgiudr, layoutParams)) {
                        viewDxjokdxxww.measure(iEsjtqupxsv, iCqumvgiudr);
                    }
                    fUawqvzlxes = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + uawqvzlxes(viewDxjokdxxww);
                    fJlmebxxoox = measuredHeight2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + jlmebxxoox(viewDxjokdxxww));
                    if (ppxfxbqfkfVar.f21889dxjokdxxww == 1) {
                        lereixgezr(viewDxjokdxxww, f21850ydmasvzmpa);
                        zdlpuopuiu(viewDxjokdxxww);
                    } else {
                        lereixgezr(viewDxjokdxxww, f21850ydmasvzmpa);
                        yggfygwlhe(viewDxjokdxxww, i13);
                        i13++;
                    }
                    int i34 = i13;
                    iOpjhrmiecq = i19 + opjhrmiecq(viewDxjokdxxww);
                    iNuxfzjnpeb = i23 - nuxfzjnpeb(viewDxjokdxxww);
                    z13 = this.f21869stevsuqkhv;
                    if (z13) {
                        z14 = true;
                        view = viewDxjokdxxww;
                        i15 = i14;
                        if (this.f21861kegysxyocb) {
                            this.f21862mbcevpiqjq.kegysxyocb(view, zoijcleaowVar, z13, iOpjhrmiecq, Math.round(fJlmebxxoox) - view.getMeasuredHeight(), iOpjhrmiecq + view.getMeasuredWidth(), Math.round(fJlmebxxoox));
                        } else {
                            this.f21862mbcevpiqjq.kegysxyocb(view, zoijcleaowVar, z13, iOpjhrmiecq, Math.round(fUawqvzlxes), iOpjhrmiecq + view.getMeasuredWidth(), Math.round(fUawqvzlxes) + view.getMeasuredHeight());
                        }
                    } else if (this.f21861kegysxyocb) {
                        z14 = true;
                        view = viewDxjokdxxww;
                        i15 = i14;
                        this.f21862mbcevpiqjq.kegysxyocb(viewDxjokdxxww, zoijcleaowVar, z13, iNuxfzjnpeb - viewDxjokdxxww.getMeasuredWidth(), Math.round(fJlmebxxoox) - viewDxjokdxxww.getMeasuredHeight(), iNuxfzjnpeb, Math.round(fJlmebxxoox));
                    } else {
                        z14 = true;
                        view = viewDxjokdxxww;
                        i15 = i14;
                        this.f21862mbcevpiqjq.kegysxyocb(view, zoijcleaowVar, z13, iNuxfzjnpeb - view.getMeasuredWidth(), Math.round(fUawqvzlxes), iNuxfzjnpeb, Math.round(fUawqvzlxes) + view.getMeasuredHeight());
                    }
                    View view2 = view;
                    measuredHeight = fUawqvzlxes + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + jlmebxxoox(view2) + f16;
                    i13 = i34;
                    measuredHeight2 = fJlmebxxoox - (((view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + uawqvzlxes(view2)) + f16);
                }
                i14 = i15 + 1;
                fMax = f16;
                z15 = z14;
            }
            ppxfxbqfkf.agtfadlqog(ppxfxbqfkfVar, this.f21868sopmlzcsov.f21889dxjokdxxww);
            return zoijcleaowVar.iobyxmoadg();
        }
        f13 = paddingTop;
        f14 = iZfvoamnweg - paddingBottom;
        f15 = 0.0f;
        measuredHeight = f13 - this.f21852crxdokpmqz.f21904wkgbmnqykc;
        measuredHeight2 = f14 - this.f21852crxdokpmqz.f21904wkgbmnqykc;
        fMax = Math.max(f15, 0.0f);
        iZoijcleaow = zoijcleaowVar.zoijcleaow();
        i13 = 0;
        i14 = i24;
        while (i14 < i24 + iZoijcleaow) {
            viewDxjokdxxww = dxjokdxxww(i14);
            if (viewDxjokdxxww == null) {
                i15 = i14;
                z14 = z15;
                f16 = fMax;
            } else {
                com.google.android.flexbox.ppxfxbqfkf ppxfxbqfkfVar3 = this.f21862mbcevpiqjq;
                f16 = fMax;
                long j14 = ppxfxbqfkfVar3.f21909wkgbmnqykc[i14];
                iEsjtqupxsv = ppxfxbqfkfVar3.esjtqupxsv(j14);
                iCqumvgiudr = this.f21862mbcevpiqjq.cqumvgiudr(j14);
                layoutParams = (LayoutParams) viewDxjokdxxww.getLayoutParams();
                if (Y(viewDxjokdxxww, iEsjtqupxsv, iCqumvgiudr, layoutParams)) {
                    viewDxjokdxxww.measure(iEsjtqupxsv, iCqumvgiudr);
                }
                fUawqvzlxes = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + uawqvzlxes(viewDxjokdxxww);
                fJlmebxxoox = measuredHeight2 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + jlmebxxoox(viewDxjokdxxww));
                if (ppxfxbqfkfVar.f21889dxjokdxxww == 1) {
                    lereixgezr(viewDxjokdxxww, f21850ydmasvzmpa);
                    zdlpuopuiu(viewDxjokdxxww);
                } else {
                    lereixgezr(viewDxjokdxxww, f21850ydmasvzmpa);
                    yggfygwlhe(viewDxjokdxxww, i13);
                    i13++;
                }
                int i35 = i13;
                iOpjhrmiecq = i19 + opjhrmiecq(viewDxjokdxxww);
                iNuxfzjnpeb = i23 - nuxfzjnpeb(viewDxjokdxxww);
                z13 = this.f21869stevsuqkhv;
                if (z13) {
                    z14 = true;
                    view = viewDxjokdxxww;
                    i15 = i14;
                    if (this.f21861kegysxyocb) {
                        this.f21862mbcevpiqjq.kegysxyocb(view, zoijcleaowVar, z13, iOpjhrmiecq, Math.round(fJlmebxxoox) - view.getMeasuredHeight(), iOpjhrmiecq + view.getMeasuredWidth(), Math.round(fJlmebxxoox));
                    } else {
                        this.f21862mbcevpiqjq.kegysxyocb(view, zoijcleaowVar, z13, iOpjhrmiecq, Math.round(fUawqvzlxes), iOpjhrmiecq + view.getMeasuredWidth(), Math.round(fUawqvzlxes) + view.getMeasuredHeight());
                    }
                } else if (this.f21861kegysxyocb) {
                    z14 = true;
                    view = viewDxjokdxxww;
                    i15 = i14;
                    this.f21862mbcevpiqjq.kegysxyocb(viewDxjokdxxww, zoijcleaowVar, z13, iNuxfzjnpeb - viewDxjokdxxww.getMeasuredWidth(), Math.round(fJlmebxxoox) - viewDxjokdxxww.getMeasuredHeight(), iNuxfzjnpeb, Math.round(fJlmebxxoox));
                } else {
                    z14 = true;
                    view = viewDxjokdxxww;
                    i15 = i14;
                    this.f21862mbcevpiqjq.kegysxyocb(view, zoijcleaowVar, z13, iNuxfzjnpeb - view.getMeasuredWidth(), Math.round(fUawqvzlxes), iNuxfzjnpeb, Math.round(fUawqvzlxes) + view.getMeasuredHeight());
                }
                View view3 = view;
                measuredHeight = fUawqvzlxes + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + jlmebxxoox(view3) + f16;
                i13 = i35;
                measuredHeight2 = fJlmebxxoox - (((view3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + uawqvzlxes(view3)) + f16);
            }
            i14 = i15 + 1;
            fMax = f16;
            z15 = z14;
        }
        ppxfxbqfkf.agtfadlqog(ppxfxbqfkfVar, this.f21868sopmlzcsov.f21889dxjokdxxww);
        return zoijcleaowVar.iobyxmoadg();
    }

    private void Q0(RecyclerView.iwizpuwonk iwizpuwonkVar, ppxfxbqfkf ppxfxbqfkfVar) {
        if (ppxfxbqfkfVar.f21888btonecajqb) {
            if (ppxfxbqfkfVar.f21889dxjokdxxww == -1) {
                S0(iwizpuwonkVar, ppxfxbqfkfVar);
            } else {
                T0(iwizpuwonkVar, ppxfxbqfkfVar);
            }
        }
    }

    private void R0(RecyclerView.iwizpuwonk iwizpuwonkVar, int i13, int i14) {
        while (i14 >= i13) {
            G(i14, iwizpuwonkVar);
            i14--;
        }
    }

    private void S0(RecyclerView.iwizpuwonk iwizpuwonkVar, ppxfxbqfkf ppxfxbqfkfVar) {
        int iVipkmwdibw;
        int i13;
        View viewRibwqtqdhb;
        int i14;
        if (ppxfxbqfkfVar.f21891gxszxtbevo < 0 || (iVipkmwdibw = vipkmwdibw()) == 0 || (viewRibwqtqdhb = ribwqtqdhb((i13 = iVipkmwdibw - 1))) == null || (i14 = this.f21862mbcevpiqjq.f21908ppxfxbqfkf[lrnfpwlwnk(viewRibwqtqdhb)]) == -1) {
            return;
        }
        com.google.android.flexbox.zoijcleaow zoijcleaowVar = (com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(i14);
        for (int i15 = i13; i15 >= 0; i15--) {
            View viewRibwqtqdhb2 = ribwqtqdhb(i15);
            if (viewRibwqtqdhb2 != null) {
                if (!m0(viewRibwqtqdhb2, ppxfxbqfkfVar.f21891gxszxtbevo)) {
                    break;
                }
                if (zoijcleaowVar.f21925ojitshcjhn != lrnfpwlwnk(viewRibwqtqdhb2)) {
                    continue;
                } else if (i14 <= 0) {
                    iVipkmwdibw = i15;
                    break;
                } else {
                    i14 += ppxfxbqfkfVar.f21889dxjokdxxww;
                    zoijcleaowVar = (com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(i14);
                    iVipkmwdibw = i15;
                }
            }
        }
        R0(iwizpuwonkVar, iVipkmwdibw, i13);
    }

    private void T0(RecyclerView.iwizpuwonk iwizpuwonkVar, ppxfxbqfkf ppxfxbqfkfVar) {
        int iVipkmwdibw;
        View viewRibwqtqdhb;
        if (ppxfxbqfkfVar.f21891gxszxtbevo < 0 || (iVipkmwdibw = vipkmwdibw()) == 0 || (viewRibwqtqdhb = ribwqtqdhb(0)) == null) {
            return;
        }
        int i13 = this.f21862mbcevpiqjq.f21908ppxfxbqfkf[lrnfpwlwnk(viewRibwqtqdhb)];
        int i14 = -1;
        if (i13 == -1) {
            return;
        }
        com.google.android.flexbox.zoijcleaow zoijcleaowVar = (com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(i13);
        for (int i15 = 0; i15 < iVipkmwdibw; i15++) {
            View viewRibwqtqdhb2 = ribwqtqdhb(i15);
            if (viewRibwqtqdhb2 != null) {
                if (!n0(viewRibwqtqdhb2, ppxfxbqfkfVar.f21891gxszxtbevo)) {
                    break;
                }
                if (zoijcleaowVar.f21928rgvfuqvkyq != lrnfpwlwnk(viewRibwqtqdhb2)) {
                    continue;
                } else if (i13 >= this.f21870tzroggbefp.size() - 1) {
                    i14 = i15;
                    break;
                } else {
                    i13 += ppxfxbqfkfVar.f21889dxjokdxxww;
                    zoijcleaowVar = (com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(i13);
                    i14 = i15;
                }
            }
        }
        R0(iwizpuwonkVar, 0, i14);
    }

    private void U0() {
        int iOipsdeybqn = vdvldrhtss() ? oipsdeybqn() : dvvnrvtcbc();
        this.f21868sopmlzcsov.f21897zoijcleaow = iOipsdeybqn == 0 || iOipsdeybqn == Integer.MIN_VALUE;
    }

    private void V0() {
        int iBfopjjpdmp = bfopjjpdmp();
        int i13 = this.f21859jpowsppfya;
        if (i13 == 0) {
            this.f21869stevsuqkhv = iBfopjjpdmp == 1;
            this.f21861kegysxyocb = this.f21855hkdspvbjdz == 2;
            return;
        }
        if (i13 == 1) {
            this.f21869stevsuqkhv = iBfopjjpdmp != 1;
            this.f21861kegysxyocb = this.f21855hkdspvbjdz == 2;
            return;
        }
        if (i13 == 2) {
            boolean z13 = iBfopjjpdmp == 1;
            this.f21869stevsuqkhv = z13;
            if (this.f21855hkdspvbjdz == 2) {
                this.f21869stevsuqkhv = !z13;
            }
            this.f21861kegysxyocb = false;
            return;
        }
        if (i13 != 3) {
            this.f21869stevsuqkhv = false;
            this.f21861kegysxyocb = false;
            return;
        }
        boolean z14 = iBfopjjpdmp == 1;
        this.f21869stevsuqkhv = z14;
        if (this.f21855hkdspvbjdz == 2) {
            this.f21869stevsuqkhv = !z14;
        }
        this.f21861kegysxyocb = true;
    }

    private boolean Y(View view, int i13, int i14, RecyclerView.vdvldrhtss vdvldrhtssVar) {
        return (!view.isLayoutRequested() && ageimvtcrz() && fyldjkxazc(view.getWidth(), i13, ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).width) && fyldjkxazc(view.getHeight(), i14, ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).height)) ? false : true;
    }

    private boolean a1(RecyclerView.zynmafqrjb zynmafqrjbVar, zoijcleaow zoijcleaowVar) {
        if (vipkmwdibw() == 0) {
            return false;
        }
        View viewY0 = zoijcleaowVar.f21898eablkybsjg ? y0(zynmafqrjbVar.zoijcleaow()) : v0(zynmafqrjbVar.zoijcleaow());
        if (viewY0 == null) {
            return false;
        }
        zoijcleaowVar.kcexrzcfyt(viewY0);
        if (zynmafqrjbVar.eablkybsjg() || !e0()) {
            return true;
        }
        if (this.f21858jlmebxxoox.lqeggnwhkg(viewY0) < this.f21858jlmebxxoox.dxjokdxxww() && this.f21858jlmebxxoox.wkgbmnqykc(viewY0) >= this.f21858jlmebxxoox.agtfadlqog()) {
            return true;
        }
        zoijcleaowVar.f21903ppxfxbqfkf = zoijcleaowVar.f21898eablkybsjg ? this.f21858jlmebxxoox.dxjokdxxww() : this.f21858jlmebxxoox.agtfadlqog();
        return true;
    }

    private boolean b1(RecyclerView.zynmafqrjb zynmafqrjbVar, zoijcleaow zoijcleaowVar, SavedState savedState) {
        int i13;
        View viewRibwqtqdhb;
        if (!zynmafqrjbVar.eablkybsjg() && (i13 = this.f21857jhduphickx) != -1) {
            if (i13 >= 0 && i13 < zynmafqrjbVar.zoijcleaow()) {
                zoijcleaowVar.f21900iobyxmoadg = this.f21857jhduphickx;
                zoijcleaowVar.f21905zoijcleaow = this.f21862mbcevpiqjq.f21908ppxfxbqfkf[zoijcleaowVar.f21900iobyxmoadg];
                SavedState savedState2 = this.f21873vipkmwdibw;
                if (savedState2 != null && savedState2.dxjokdxxww(zynmafqrjbVar.zoijcleaow())) {
                    zoijcleaowVar.f21903ppxfxbqfkf = this.f21858jlmebxxoox.agtfadlqog() + savedState.f21886yggfygwlhe;
                    zoijcleaowVar.f21901lqeggnwhkg = true;
                    zoijcleaowVar.f21905zoijcleaow = -1;
                    return true;
                }
                if (this.f21856ikoacuggdj != Integer.MIN_VALUE) {
                    if (vdvldrhtss() || !this.f21869stevsuqkhv) {
                        zoijcleaowVar.f21903ppxfxbqfkf = this.f21858jlmebxxoox.agtfadlqog() + this.f21856ikoacuggdj;
                    } else {
                        zoijcleaowVar.f21903ppxfxbqfkf = this.f21856ikoacuggdj - this.f21858jlmebxxoox.btonecajqb();
                    }
                    return true;
                }
                View viewMbcevpiqjq = mbcevpiqjq(this.f21857jhduphickx);
                if (viewMbcevpiqjq == null) {
                    if (vipkmwdibw() > 0 && (viewRibwqtqdhb = ribwqtqdhb(0)) != null) {
                        zoijcleaowVar.f21898eablkybsjg = this.f21857jhduphickx < lrnfpwlwnk(viewRibwqtqdhb);
                    }
                    zoijcleaowVar.oxmwwwfdhm();
                } else {
                    if (this.f21858jlmebxxoox.eablkybsjg(viewMbcevpiqjq) > this.f21858jlmebxxoox.ojitshcjhn()) {
                        zoijcleaowVar.oxmwwwfdhm();
                        return true;
                    }
                    if (this.f21858jlmebxxoox.lqeggnwhkg(viewMbcevpiqjq) - this.f21858jlmebxxoox.agtfadlqog() < 0) {
                        zoijcleaowVar.f21903ppxfxbqfkf = this.f21858jlmebxxoox.agtfadlqog();
                        zoijcleaowVar.f21898eablkybsjg = false;
                        return true;
                    }
                    if (this.f21858jlmebxxoox.dxjokdxxww() - this.f21858jlmebxxoox.wkgbmnqykc(viewMbcevpiqjq) < 0) {
                        zoijcleaowVar.f21903ppxfxbqfkf = this.f21858jlmebxxoox.dxjokdxxww();
                        zoijcleaowVar.f21898eablkybsjg = true;
                        return true;
                    }
                    zoijcleaowVar.f21903ppxfxbqfkf = zoijcleaowVar.f21898eablkybsjg ? this.f21858jlmebxxoox.wkgbmnqykc(viewMbcevpiqjq) + this.f21858jlmebxxoox.rgvfuqvkyq() : this.f21858jlmebxxoox.lqeggnwhkg(viewMbcevpiqjq);
                }
                return true;
            }
            this.f21857jhduphickx = -1;
            this.f21856ikoacuggdj = Integer.MIN_VALUE;
        }
        return false;
    }

    private void c1(RecyclerView.zynmafqrjb zynmafqrjbVar, zoijcleaow zoijcleaowVar) {
        if (b1(zynmafqrjbVar, zoijcleaowVar, this.f21873vipkmwdibw) || a1(zynmafqrjbVar, zoijcleaowVar)) {
            return;
        }
        zoijcleaowVar.oxmwwwfdhm();
        zoijcleaowVar.f21900iobyxmoadg = 0;
        zoijcleaowVar.f21905zoijcleaow = 0;
    }

    private void d1(int i13) {
        if (i13 >= A0()) {
            return;
        }
        int iVipkmwdibw = vipkmwdibw();
        this.f21862mbcevpiqjq.zdlpuopuiu(iVipkmwdibw);
        this.f21862mbcevpiqjq.yggfygwlhe(iVipkmwdibw);
        this.f21862mbcevpiqjq.kcexrzcfyt(iVipkmwdibw);
        if (i13 >= this.f21862mbcevpiqjq.f21908ppxfxbqfkf.length) {
            return;
        }
        this.f21872uwvvkdfqfp = i13;
        View viewG0 = G0();
        if (viewG0 == null) {
            return;
        }
        this.f21857jhduphickx = lrnfpwlwnk(viewG0);
        if (vdvldrhtss() || !this.f21869stevsuqkhv) {
            this.f21856ikoacuggdj = this.f21858jlmebxxoox.lqeggnwhkg(viewG0) - this.f21858jlmebxxoox.agtfadlqog();
        } else {
            this.f21856ikoacuggdj = this.f21858jlmebxxoox.wkgbmnqykc(viewG0) + this.f21858jlmebxxoox.btonecajqb();
        }
    }

    private void e1(int i13) {
        int i14;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iwxlajgraz(), dvvnrvtcbc());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(zfvoamnweg(), oipsdeybqn());
        int iIwxlajgraz = iwxlajgraz();
        int iZfvoamnweg = zfvoamnweg();
        boolean z13 = false;
        if (vdvldrhtss()) {
            int i15 = this.f21865okpsazkaxt;
            if (i15 != Integer.MIN_VALUE && i15 != iIwxlajgraz) {
                z13 = true;
            }
            i14 = this.f21868sopmlzcsov.f21897zoijcleaow ? this.f21867rlfsiqarku.getResources().getDisplayMetrics().heightPixels : this.f21868sopmlzcsov.f21892iobyxmoadg;
        } else {
            int i16 = this.f21860jztzpxfvev;
            if (i16 != Integer.MIN_VALUE && i16 != iZfvoamnweg) {
                z13 = true;
            }
            i14 = this.f21868sopmlzcsov.f21897zoijcleaow ? this.f21867rlfsiqarku.getResources().getDisplayMetrics().widthPixels : this.f21868sopmlzcsov.f21892iobyxmoadg;
        }
        int i17 = i14;
        this.f21865okpsazkaxt = iIwxlajgraz;
        this.f21860jztzpxfvev = iZfvoamnweg;
        int i18 = this.f21872uwvvkdfqfp;
        if (i18 == -1 && (this.f21857jhduphickx != -1 || z13)) {
            if (this.f21852crxdokpmqz.f21898eablkybsjg) {
                return;
            }
            this.f21870tzroggbefp.clear();
            this.f21876yfnezrywwk.iobyxmoadg();
            if (vdvldrhtss()) {
                this.f21862mbcevpiqjq.eablkybsjg(this.f21876yfnezrywwk, iMakeMeasureSpec, iMakeMeasureSpec2, i17, this.f21852crxdokpmqz.f21900iobyxmoadg, this.f21870tzroggbefp);
            } else {
                this.f21862mbcevpiqjq.nufgyqmvbu(this.f21876yfnezrywwk, iMakeMeasureSpec, iMakeMeasureSpec2, i17, this.f21852crxdokpmqz.f21900iobyxmoadg, this.f21870tzroggbefp);
            }
            this.f21870tzroggbefp = this.f21876yfnezrywwk.f21913iobyxmoadg;
            this.f21862mbcevpiqjq.rgvfuqvkyq(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.f21862mbcevpiqjq.crxdokpmqz();
            zoijcleaow zoijcleaowVar = this.f21852crxdokpmqz;
            zoijcleaowVar.f21905zoijcleaow = this.f21862mbcevpiqjq.f21908ppxfxbqfkf[zoijcleaowVar.f21900iobyxmoadg];
            this.f21868sopmlzcsov.f21895ppxfxbqfkf = this.f21852crxdokpmqz.f21905zoijcleaow;
            return;
        }
        int iMin = i18 != -1 ? Math.min(i18, this.f21852crxdokpmqz.f21900iobyxmoadg) : this.f21852crxdokpmqz.f21900iobyxmoadg;
        this.f21876yfnezrywwk.iobyxmoadg();
        if (vdvldrhtss()) {
            if (this.f21870tzroggbefp.size() > 0) {
                this.f21862mbcevpiqjq.btonecajqb(this.f21870tzroggbefp, iMin);
                this.f21862mbcevpiqjq.zoijcleaow(this.f21876yfnezrywwk, iMakeMeasureSpec, iMakeMeasureSpec2, i17, iMin, this.f21852crxdokpmqz.f21900iobyxmoadg, this.f21870tzroggbefp);
            } else {
                this.f21862mbcevpiqjq.kcexrzcfyt(i13);
                this.f21862mbcevpiqjq.wkgbmnqykc(this.f21876yfnezrywwk, iMakeMeasureSpec, iMakeMeasureSpec2, i17, 0, this.f21870tzroggbefp);
            }
        } else if (this.f21870tzroggbefp.size() > 0) {
            this.f21862mbcevpiqjq.btonecajqb(this.f21870tzroggbefp, iMin);
            this.f21862mbcevpiqjq.zoijcleaow(this.f21876yfnezrywwk, iMakeMeasureSpec2, iMakeMeasureSpec, i17, iMin, this.f21852crxdokpmqz.f21900iobyxmoadg, this.f21870tzroggbefp);
        } else {
            this.f21862mbcevpiqjq.kcexrzcfyt(i13);
            this.f21862mbcevpiqjq.lqeggnwhkg(this.f21876yfnezrywwk, iMakeMeasureSpec, iMakeMeasureSpec2, i17, 0, this.f21870tzroggbefp);
        }
        this.f21870tzroggbefp = this.f21876yfnezrywwk.f21913iobyxmoadg;
        this.f21862mbcevpiqjq.vdvldrhtss(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
        this.f21862mbcevpiqjq.jlmebxxoox(iMin);
    }

    private void f1(int i13, int i14) {
        this.f21868sopmlzcsov.f21889dxjokdxxww = i13;
        boolean zVdvldrhtss = vdvldrhtss();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iwxlajgraz(), dvvnrvtcbc());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(zfvoamnweg(), oipsdeybqn());
        boolean z13 = !zVdvldrhtss && this.f21869stevsuqkhv;
        if (i13 == 1) {
            View viewRibwqtqdhb = ribwqtqdhb(vipkmwdibw() - 1);
            if (viewRibwqtqdhb == null) {
                return;
            }
            this.f21868sopmlzcsov.f21890eablkybsjg = this.f21858jlmebxxoox.wkgbmnqykc(viewRibwqtqdhb);
            int iLrnfpwlwnk = lrnfpwlwnk(viewRibwqtqdhb);
            View viewZ0 = z0(viewRibwqtqdhb, (com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(this.f21862mbcevpiqjq.f21908ppxfxbqfkf[iLrnfpwlwnk]));
            this.f21868sopmlzcsov.f21894nufgyqmvbu = 1;
            ppxfxbqfkf ppxfxbqfkfVar = this.f21868sopmlzcsov;
            ppxfxbqfkfVar.f21896wkgbmnqykc = iLrnfpwlwnk + ppxfxbqfkfVar.f21894nufgyqmvbu;
            if (this.f21862mbcevpiqjq.f21908ppxfxbqfkf.length <= this.f21868sopmlzcsov.f21896wkgbmnqykc) {
                this.f21868sopmlzcsov.f21895ppxfxbqfkf = -1;
            } else {
                ppxfxbqfkf ppxfxbqfkfVar2 = this.f21868sopmlzcsov;
                ppxfxbqfkfVar2.f21895ppxfxbqfkf = this.f21862mbcevpiqjq.f21908ppxfxbqfkf[ppxfxbqfkfVar2.f21896wkgbmnqykc];
            }
            if (z13) {
                this.f21868sopmlzcsov.f21890eablkybsjg = this.f21858jlmebxxoox.lqeggnwhkg(viewZ0);
                this.f21868sopmlzcsov.f21891gxszxtbevo = (-this.f21858jlmebxxoox.lqeggnwhkg(viewZ0)) + this.f21858jlmebxxoox.agtfadlqog();
                ppxfxbqfkf ppxfxbqfkfVar3 = this.f21868sopmlzcsov;
                ppxfxbqfkfVar3.f21891gxszxtbevo = Math.max(ppxfxbqfkfVar3.f21891gxszxtbevo, 0);
            } else {
                this.f21868sopmlzcsov.f21890eablkybsjg = this.f21858jlmebxxoox.wkgbmnqykc(viewZ0);
                this.f21868sopmlzcsov.f21891gxszxtbevo = this.f21858jlmebxxoox.wkgbmnqykc(viewZ0) - this.f21858jlmebxxoox.dxjokdxxww();
            }
            if ((this.f21868sopmlzcsov.f21895ppxfxbqfkf == -1 || this.f21868sopmlzcsov.f21895ppxfxbqfkf > this.f21870tzroggbefp.size() - 1) && this.f21868sopmlzcsov.f21896wkgbmnqykc <= getFlexItemCount()) {
                int i15 = i14 - this.f21868sopmlzcsov.f21891gxszxtbevo;
                this.f21876yfnezrywwk.iobyxmoadg();
                if (i15 > 0) {
                    if (zVdvldrhtss) {
                        this.f21862mbcevpiqjq.wkgbmnqykc(this.f21876yfnezrywwk, iMakeMeasureSpec, iMakeMeasureSpec2, i15, this.f21868sopmlzcsov.f21896wkgbmnqykc, this.f21870tzroggbefp);
                    } else {
                        this.f21862mbcevpiqjq.lqeggnwhkg(this.f21876yfnezrywwk, iMakeMeasureSpec, iMakeMeasureSpec2, i15, this.f21868sopmlzcsov.f21896wkgbmnqykc, this.f21870tzroggbefp);
                    }
                    this.f21862mbcevpiqjq.vdvldrhtss(iMakeMeasureSpec, iMakeMeasureSpec2, this.f21868sopmlzcsov.f21896wkgbmnqykc);
                    this.f21862mbcevpiqjq.jlmebxxoox(this.f21868sopmlzcsov.f21896wkgbmnqykc);
                }
            }
        } else {
            View viewRibwqtqdhb2 = ribwqtqdhb(0);
            if (viewRibwqtqdhb2 == null) {
                return;
            }
            this.f21868sopmlzcsov.f21890eablkybsjg = this.f21858jlmebxxoox.lqeggnwhkg(viewRibwqtqdhb2);
            int iLrnfpwlwnk2 = lrnfpwlwnk(viewRibwqtqdhb2);
            View viewW0 = w0(viewRibwqtqdhb2, (com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(this.f21862mbcevpiqjq.f21908ppxfxbqfkf[iLrnfpwlwnk2]));
            this.f21868sopmlzcsov.f21894nufgyqmvbu = 1;
            int i16 = this.f21862mbcevpiqjq.f21908ppxfxbqfkf[iLrnfpwlwnk2];
            if (i16 == -1) {
                i16 = 0;
            }
            if (i16 > 0) {
                this.f21868sopmlzcsov.f21896wkgbmnqykc = iLrnfpwlwnk2 - ((com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(i16 - 1)).zoijcleaow();
            } else {
                this.f21868sopmlzcsov.f21896wkgbmnqykc = -1;
            }
            this.f21868sopmlzcsov.f21895ppxfxbqfkf = i16 > 0 ? i16 - 1 : 0;
            if (z13) {
                this.f21868sopmlzcsov.f21890eablkybsjg = this.f21858jlmebxxoox.wkgbmnqykc(viewW0);
                this.f21868sopmlzcsov.f21891gxszxtbevo = this.f21858jlmebxxoox.wkgbmnqykc(viewW0) - this.f21858jlmebxxoox.dxjokdxxww();
                ppxfxbqfkf ppxfxbqfkfVar4 = this.f21868sopmlzcsov;
                ppxfxbqfkfVar4.f21891gxszxtbevo = Math.max(ppxfxbqfkfVar4.f21891gxszxtbevo, 0);
            } else {
                this.f21868sopmlzcsov.f21890eablkybsjg = this.f21858jlmebxxoox.lqeggnwhkg(viewW0);
                this.f21868sopmlzcsov.f21891gxszxtbevo = (-this.f21858jlmebxxoox.lqeggnwhkg(viewW0)) + this.f21858jlmebxxoox.agtfadlqog();
            }
        }
        ppxfxbqfkf ppxfxbqfkfVar5 = this.f21868sopmlzcsov;
        ppxfxbqfkfVar5.f21892iobyxmoadg = i14 - ppxfxbqfkfVar5.f21891gxszxtbevo;
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

    private void g1(zoijcleaow zoijcleaowVar, boolean z13, boolean z14) {
        if (z14) {
            U0();
        } else {
            this.f21868sopmlzcsov.f21897zoijcleaow = false;
        }
        if (vdvldrhtss() || !this.f21869stevsuqkhv) {
            this.f21868sopmlzcsov.f21892iobyxmoadg = this.f21858jlmebxxoox.dxjokdxxww() - zoijcleaowVar.f21903ppxfxbqfkf;
        } else {
            this.f21868sopmlzcsov.f21892iobyxmoadg = zoijcleaowVar.f21903ppxfxbqfkf - getPaddingRight();
        }
        this.f21868sopmlzcsov.f21896wkgbmnqykc = zoijcleaowVar.f21900iobyxmoadg;
        this.f21868sopmlzcsov.f21894nufgyqmvbu = 1;
        this.f21868sopmlzcsov.f21889dxjokdxxww = 1;
        this.f21868sopmlzcsov.f21890eablkybsjg = zoijcleaowVar.f21903ppxfxbqfkf;
        this.f21868sopmlzcsov.f21891gxszxtbevo = Integer.MIN_VALUE;
        this.f21868sopmlzcsov.f21895ppxfxbqfkf = zoijcleaowVar.f21905zoijcleaow;
        if (!z13 || this.f21870tzroggbefp.size() <= 1 || zoijcleaowVar.f21905zoijcleaow < 0 || zoijcleaowVar.f21905zoijcleaow >= this.f21870tzroggbefp.size() - 1) {
            return;
        }
        com.google.android.flexbox.zoijcleaow zoijcleaowVar2 = (com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(zoijcleaowVar.f21905zoijcleaow);
        ppxfxbqfkf.draadjrbmk(this.f21868sopmlzcsov);
        ppxfxbqfkf.yggfygwlhe(this.f21868sopmlzcsov, zoijcleaowVar2.zoijcleaow());
    }

    private void h1(zoijcleaow zoijcleaowVar, boolean z13, boolean z14) {
        if (z14) {
            U0();
        } else {
            this.f21868sopmlzcsov.f21897zoijcleaow = false;
        }
        if (vdvldrhtss() || !this.f21869stevsuqkhv) {
            this.f21868sopmlzcsov.f21892iobyxmoadg = zoijcleaowVar.f21903ppxfxbqfkf - this.f21858jlmebxxoox.agtfadlqog();
        } else {
            this.f21868sopmlzcsov.f21892iobyxmoadg = (this.f21853czzsidtyhn.getWidth() - zoijcleaowVar.f21903ppxfxbqfkf) - this.f21858jlmebxxoox.agtfadlqog();
        }
        this.f21868sopmlzcsov.f21896wkgbmnqykc = zoijcleaowVar.f21900iobyxmoadg;
        this.f21868sopmlzcsov.f21894nufgyqmvbu = 1;
        this.f21868sopmlzcsov.f21889dxjokdxxww = -1;
        this.f21868sopmlzcsov.f21890eablkybsjg = zoijcleaowVar.f21903ppxfxbqfkf;
        this.f21868sopmlzcsov.f21891gxszxtbevo = Integer.MIN_VALUE;
        this.f21868sopmlzcsov.f21895ppxfxbqfkf = zoijcleaowVar.f21905zoijcleaow;
        if (!z13 || zoijcleaowVar.f21905zoijcleaow <= 0 || this.f21870tzroggbefp.size() <= zoijcleaowVar.f21905zoijcleaow) {
            return;
        }
        com.google.android.flexbox.zoijcleaow zoijcleaowVar2 = (com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(zoijcleaowVar.f21905zoijcleaow);
        ppxfxbqfkf.wflxmlrfwp(this.f21868sopmlzcsov);
        ppxfxbqfkf.jyumaefscl(this.f21868sopmlzcsov, zoijcleaowVar2.zoijcleaow());
    }

    private boolean m0(View view, int i13) {
        if (vdvldrhtss() || !this.f21869stevsuqkhv) {
            return this.f21858jlmebxxoox.lqeggnwhkg(view) >= this.f21858jlmebxxoox.nufgyqmvbu() - i13;
        }
        return this.f21858jlmebxxoox.wkgbmnqykc(view) <= i13;
    }

    private boolean n0(View view, int i13) {
        if (vdvldrhtss() || !this.f21869stevsuqkhv) {
            return this.f21858jlmebxxoox.wkgbmnqykc(view) <= i13;
        }
        return this.f21858jlmebxxoox.nufgyqmvbu() - this.f21858jlmebxxoox.lqeggnwhkg(view) <= i13;
    }

    private void o0() {
        this.f21870tzroggbefp.clear();
        this.f21852crxdokpmqz.zdlpuopuiu();
        this.f21852crxdokpmqz.f21904wkgbmnqykc = 0;
    }

    private int p0(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0) {
            return 0;
        }
        int iZoijcleaow = zynmafqrjbVar.zoijcleaow();
        t0();
        View viewV0 = v0(iZoijcleaow);
        View viewY0 = y0(iZoijcleaow);
        if (zynmafqrjbVar.zoijcleaow() == 0 || viewV0 == null || viewY0 == null) {
            return 0;
        }
        return Math.min(this.f21858jlmebxxoox.ojitshcjhn(), this.f21858jlmebxxoox.wkgbmnqykc(viewY0) - this.f21858jlmebxxoox.lqeggnwhkg(viewV0));
    }

    private int q0(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0) {
            return 0;
        }
        int iZoijcleaow = zynmafqrjbVar.zoijcleaow();
        View viewV0 = v0(iZoijcleaow);
        View viewY0 = y0(iZoijcleaow);
        if (zynmafqrjbVar.zoijcleaow() != 0 && viewV0 != null && viewY0 != null) {
            int iLrnfpwlwnk = lrnfpwlwnk(viewV0);
            int iLrnfpwlwnk2 = lrnfpwlwnk(viewY0);
            int iAbs = Math.abs(this.f21858jlmebxxoox.wkgbmnqykc(viewY0) - this.f21858jlmebxxoox.lqeggnwhkg(viewV0));
            int[] iArr = this.f21862mbcevpiqjq.f21908ppxfxbqfkf;
            int i13 = iArr[iLrnfpwlwnk];
            if (i13 != 0 && i13 != -1) {
                return Math.round((i13 * (iAbs / ((iArr[iLrnfpwlwnk2] - i13) + 1))) + (this.f21858jlmebxxoox.agtfadlqog() - this.f21858jlmebxxoox.lqeggnwhkg(viewV0)));
            }
        }
        return 0;
    }

    private int r0(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0) {
            return 0;
        }
        int iZoijcleaow = zynmafqrjbVar.zoijcleaow();
        View viewV0 = v0(iZoijcleaow);
        View viewY0 = y0(iZoijcleaow);
        if (zynmafqrjbVar.zoijcleaow() == 0 || viewV0 == null || viewY0 == null) {
            return 0;
        }
        return (int) ((Math.abs(this.f21858jlmebxxoox.wkgbmnqykc(viewY0) - this.f21858jlmebxxoox.lqeggnwhkg(viewV0)) / ((A0() - x0()) + 1)) * zynmafqrjbVar.zoijcleaow());
    }

    private void s0() {
        if (this.f21868sopmlzcsov == null) {
            this.f21868sopmlzcsov = new ppxfxbqfkf();
        }
    }

    private void t0() {
        if (this.f21858jlmebxxoox != null) {
            return;
        }
        if (vdvldrhtss()) {
            if (this.f21855hkdspvbjdz == 0) {
                this.f21858jlmebxxoox = yggfygwlhe.iobyxmoadg(this);
                this.f21866ribwqtqdhb = yggfygwlhe.ppxfxbqfkf(this);
                return;
            } else {
                this.f21858jlmebxxoox = yggfygwlhe.ppxfxbqfkf(this);
                this.f21866ribwqtqdhb = yggfygwlhe.iobyxmoadg(this);
                return;
            }
        }
        if (this.f21855hkdspvbjdz == 0) {
            this.f21858jlmebxxoox = yggfygwlhe.ppxfxbqfkf(this);
            this.f21866ribwqtqdhb = yggfygwlhe.iobyxmoadg(this);
        } else {
            this.f21858jlmebxxoox = yggfygwlhe.iobyxmoadg(this);
            this.f21866ribwqtqdhb = yggfygwlhe.ppxfxbqfkf(this);
        }
    }

    private int u0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, ppxfxbqfkf ppxfxbqfkfVar) {
        if (ppxfxbqfkfVar.f21891gxszxtbevo != Integer.MIN_VALUE) {
            if (ppxfxbqfkfVar.f21892iobyxmoadg < 0) {
                ppxfxbqfkf.vdvldrhtss(ppxfxbqfkfVar, ppxfxbqfkfVar.f21892iobyxmoadg);
            }
            Q0(iwizpuwonkVar, ppxfxbqfkfVar);
        }
        int i13 = ppxfxbqfkfVar.f21892iobyxmoadg;
        int iIobyxmoadg = ppxfxbqfkfVar.f21892iobyxmoadg;
        boolean zVdvldrhtss = vdvldrhtss();
        int iN0 = 0;
        while (true) {
            if ((iIobyxmoadg <= 0 && !this.f21868sopmlzcsov.f21897zoijcleaow) || !ppxfxbqfkfVar.cdpycssgdh(zynmafqrjbVar, this.f21870tzroggbefp)) {
                break;
            }
            com.google.android.flexbox.zoijcleaow zoijcleaowVar = (com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(ppxfxbqfkfVar.f21895ppxfxbqfkf);
            ppxfxbqfkfVar.f21896wkgbmnqykc = zoijcleaowVar.f21925ojitshcjhn;
            iN0 += N0(zoijcleaowVar, ppxfxbqfkfVar);
            if (zVdvldrhtss || !this.f21869stevsuqkhv) {
                ppxfxbqfkf.ppxfxbqfkf(ppxfxbqfkfVar, zoijcleaowVar.iobyxmoadg() * ppxfxbqfkfVar.f21889dxjokdxxww);
            } else {
                ppxfxbqfkf.wkgbmnqykc(ppxfxbqfkfVar, zoijcleaowVar.iobyxmoadg() * ppxfxbqfkfVar.f21889dxjokdxxww);
            }
            iIobyxmoadg -= zoijcleaowVar.iobyxmoadg();
        }
        ppxfxbqfkf.dxjokdxxww(ppxfxbqfkfVar, iN0);
        if (ppxfxbqfkfVar.f21891gxszxtbevo != Integer.MIN_VALUE) {
            ppxfxbqfkf.vdvldrhtss(ppxfxbqfkfVar, iN0);
            if (ppxfxbqfkfVar.f21892iobyxmoadg < 0) {
                ppxfxbqfkf.vdvldrhtss(ppxfxbqfkfVar, ppxfxbqfkfVar.f21892iobyxmoadg);
            }
            Q0(iwizpuwonkVar, ppxfxbqfkfVar);
        }
        return i13 - ppxfxbqfkfVar.f21892iobyxmoadg;
    }

    private View v0(int i13) {
        View viewC0 = C0(0, vipkmwdibw(), i13);
        if (viewC0 == null) {
            return null;
        }
        int i14 = this.f21862mbcevpiqjq.f21908ppxfxbqfkf[lrnfpwlwnk(viewC0)];
        if (i14 == -1) {
            return null;
        }
        return w0(viewC0, (com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(i14));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    private View w0(View view, com.google.android.flexbox.zoijcleaow zoijcleaowVar) {
        boolean zVdvldrhtss = vdvldrhtss();
        int i13 = zoijcleaowVar.f21924nufgyqmvbu;
        for (int i14 = 1; i14 < i13; i14++) {
            View viewRibwqtqdhb = ribwqtqdhb(i14);
            if (viewRibwqtqdhb != null && viewRibwqtqdhb.getVisibility() != 8) {
                if (!this.f21869stevsuqkhv || zVdvldrhtss) {
                    if (this.f21858jlmebxxoox.lqeggnwhkg(view) > this.f21858jlmebxxoox.lqeggnwhkg(viewRibwqtqdhb)) {
                        view = viewRibwqtqdhb;
                    }
                } else if (this.f21858jlmebxxoox.wkgbmnqykc(view) < this.f21858jlmebxxoox.wkgbmnqykc(viewRibwqtqdhb)) {
                    view = viewRibwqtqdhb;
                }
            }
        }
        return view;
    }

    private View y0(int i13) {
        View viewC0 = C0(vipkmwdibw() - 1, -1, i13);
        if (viewC0 == null) {
            return null;
        }
        return z0(viewC0, (com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(this.f21862mbcevpiqjq.f21908ppxfxbqfkf[lrnfpwlwnk(viewC0)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    private View z0(View view, com.google.android.flexbox.zoijcleaow zoijcleaowVar) {
        boolean zVdvldrhtss = vdvldrhtss();
        int iVipkmwdibw = (vipkmwdibw() - zoijcleaowVar.f21924nufgyqmvbu) - 1;
        for (int iVipkmwdibw2 = vipkmwdibw() - 2; iVipkmwdibw2 > iVipkmwdibw; iVipkmwdibw2--) {
            View viewRibwqtqdhb = ribwqtqdhb(iVipkmwdibw2);
            if (viewRibwqtqdhb != null && viewRibwqtqdhb.getVisibility() != 8) {
                if (!this.f21869stevsuqkhv || zVdvldrhtss) {
                    if (this.f21858jlmebxxoox.wkgbmnqykc(view) < this.f21858jlmebxxoox.wkgbmnqykc(viewRibwqtqdhb)) {
                        view = viewRibwqtqdhb;
                    }
                } else if (this.f21858jlmebxxoox.lqeggnwhkg(view) > this.f21858jlmebxxoox.lqeggnwhkg(viewRibwqtqdhb)) {
                    view = viewRibwqtqdhb;
                }
            }
        }
        return view;
    }

    public int A0() {
        View viewB0 = B0(vipkmwdibw() - 1, -1, false);
        if (viewB0 == null) {
            return -1;
        }
        return lrnfpwlwnk(viewB0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int P(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (!vdvldrhtss() || this.f21855hkdspvbjdz == 0) {
            int iK0 = K0(i13, iwizpuwonkVar, zynmafqrjbVar);
            this.f21863metgxyhuhe.clear();
            return iK0;
        }
        int iL0 = L0(i13);
        zoijcleaow.draadjrbmk(this.f21852crxdokpmqz, iL0);
        this.f21866ribwqtqdhb.kcexrzcfyt(-iL0);
        return iL0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void Q(int i13) {
        this.f21857jhduphickx = i13;
        this.f21856ikoacuggdj = Integer.MIN_VALUE;
        SavedState savedState = this.f21873vipkmwdibw;
        if (savedState != null) {
            savedState.btonecajqb();
        }
        M();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int R(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vdvldrhtss() || (this.f21855hkdspvbjdz == 0 && !vdvldrhtss())) {
            int iK0 = K0(i13, iwizpuwonkVar, zynmafqrjbVar);
            this.f21863metgxyhuhe.clear();
            return iK0;
        }
        int iL0 = L0(i13);
        zoijcleaow.draadjrbmk(this.f21852crxdokpmqz, iL0);
        this.f21866ribwqtqdhb.kcexrzcfyt(-iL0);
        return iL0;
    }

    public void W0(int i13) {
        int i14 = this.f21854dsvhmnatus;
        if (i14 != i13) {
            if (i14 == 4 || i13 == 4) {
                C();
                o0();
            }
            this.f21854dsvhmnatus = i13;
            M();
        }
    }

    public void X0(int i13) {
        if (this.f21859jpowsppfya != i13) {
            C();
            this.f21859jpowsppfya = i13;
            this.f21858jlmebxxoox = null;
            this.f21866ribwqtqdhb = null;
            o0();
            M();
        }
    }

    public void Y0(int i13) {
        if (i13 == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i14 = this.f21855hkdspvbjdz;
        if (i14 != i13) {
            if (i14 == 0 || i13 == 0) {
                C();
                o0();
            }
            this.f21855hkdspvbjdz = i13;
            this.f21858jlmebxxoox = null;
            this.f21866ribwqtqdhb = null;
            M();
        }
    }

    public void Z0(int i13) {
        if (this.f21851cllcsxoeiz != i13) {
            this.f21851cllcsxoeiz = i13;
            M();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void a(RecyclerView recyclerView, RecyclerView.iwizpuwonk iwizpuwonkVar) {
        super.a(recyclerView, iwizpuwonkVar);
        if (this.f21875xrmfcynszj) {
            D(iwizpuwonkVar);
            iwizpuwonkVar.ppxfxbqfkf();
        }
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public View agtfadlqog(int i13) {
        return dxjokdxxww(i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void b0(RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar, int i13) {
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(recyclerView.getContext());
        rgvfuqvkyqVar.setTargetPosition(i13);
        c0(rgvfuqvkyqVar);
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int draadjrbmk(View view) {
        int iOpjhrmiecq;
        int iNuxfzjnpeb;
        if (vdvldrhtss()) {
            iOpjhrmiecq = uawqvzlxes(view);
            iNuxfzjnpeb = jlmebxxoox(view);
        } else {
            iOpjhrmiecq = opjhrmiecq(view);
            iNuxfzjnpeb = nuxfzjnpeb(view);
        }
        return iOpjhrmiecq + iNuxfzjnpeb;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public View dxjokdxxww(int i13) {
        View view = (View) this.f21863metgxyhuhe.get(i13);
        return view != null ? view : this.f21864ntlheqmsrt.ojitshcjhn(i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void eslsurpljm(RecyclerView recyclerView) {
        super.eslsurpljm(recyclerView);
        this.f21853czzsidtyhn = (View) recyclerView.getParent();
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getAlignItems() {
        return this.f21854dsvhmnatus;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getFlexDirection() {
        return this.f21859jpowsppfya;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getFlexItemCount() {
        return this.f21871ulzqkzuiru.zoijcleaow();
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public List getFlexLinesInternal() {
        return this.f21870tzroggbefp;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getFlexWrap() {
        return this.f21855hkdspvbjdz;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getLargestMainSize() {
        if (this.f21870tzroggbefp.size() == 0) {
            return 0;
        }
        int size = this.f21870tzroggbefp.size();
        int iMax = Integer.MIN_VALUE;
        for (int i13 = 0; i13 < size; i13++) {
            iMax = Math.max(iMax, ((com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(i13)).f21919eablkybsjg);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getMaxLine() {
        return this.f21874wypolnanlu;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getSumOfCrossSize() {
        int size = this.f21870tzroggbefp.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            i13 += ((com.google.android.flexbox.zoijcleaow) this.f21870tzroggbefp.get(i14)).f21923lqeggnwhkg;
        }
        return i13;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int gtknphoqwx(int i13, int i14, int i15) {
        return RecyclerView.rgvfuqvkyq.jhduphickx(zfvoamnweg(), oipsdeybqn(), i14, i15, zynmafqrjb());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int hcddaimhww(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return q0(zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean istkbnxepw(RecyclerView.vdvldrhtss vdvldrhtssVar) {
        return vdvldrhtssVar instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void j(RecyclerView recyclerView, int i13, int i14) {
        super.j(recyclerView, i13, i14);
        d1(i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int jpowsppfya(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return r0(zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void l(RecyclerView recyclerView, int i13, int i14, int i15) {
        super.l(recyclerView, i13, i14, i15);
        d1(Math.min(i13, i14));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int lmojexxdyd(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return p0(zynmafqrjbVar);
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int lqeggnwhkg(int i13, int i14, int i15) {
        return RecyclerView.rgvfuqvkyq.jhduphickx(iwxlajgraz(), dvvnrvtcbc(), i14, i15, pmvmpeiblj());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean lxfrhoxuzk() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void m(RecyclerView recyclerView, int i13, int i14) {
        super.m(recyclerView, i13, i14);
        d1(i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void n(RecyclerView recyclerView, int i13, int i14) {
        super.n(recyclerView, i13, i14);
        d1(i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public RecyclerView.vdvldrhtss ntlheqmsrt() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void o(RecyclerView recyclerView, int i13, int i14, Object obj) {
        super.o(recyclerView, i13, i14, obj);
        d1(i13);
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public void ojitshcjhn(int i13, View view) {
        this.f21863metgxyhuhe.put(i13, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void p(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        int i13;
        int i14;
        this.f21864ntlheqmsrt = iwizpuwonkVar;
        this.f21871ulzqkzuiru = zynmafqrjbVar;
        int iZoijcleaow = zynmafqrjbVar.zoijcleaow();
        if (iZoijcleaow == 0 && zynmafqrjbVar.eablkybsjg()) {
            return;
        }
        V0();
        t0();
        s0();
        this.f21862mbcevpiqjq.zdlpuopuiu(iZoijcleaow);
        this.f21862mbcevpiqjq.yggfygwlhe(iZoijcleaow);
        this.f21862mbcevpiqjq.kcexrzcfyt(iZoijcleaow);
        this.f21868sopmlzcsov.f21888btonecajqb = false;
        SavedState savedState = this.f21873vipkmwdibw;
        if (savedState != null && savedState.dxjokdxxww(iZoijcleaow)) {
            this.f21857jhduphickx = this.f21873vipkmwdibw.f21887zdlpuopuiu;
        }
        if (!this.f21852crxdokpmqz.f21899gxszxtbevo || this.f21857jhduphickx != -1 || this.f21873vipkmwdibw != null) {
            this.f21852crxdokpmqz.zdlpuopuiu();
            c1(zynmafqrjbVar, this.f21852crxdokpmqz);
            this.f21852crxdokpmqz.f21899gxszxtbevo = true;
        }
        hkdspvbjdz(iwizpuwonkVar);
        if (this.f21852crxdokpmqz.f21898eablkybsjg) {
            h1(this.f21852crxdokpmqz, false, true);
        } else {
            g1(this.f21852crxdokpmqz, false, true);
        }
        e1(iZoijcleaow);
        u0(iwizpuwonkVar, zynmafqrjbVar, this.f21868sopmlzcsov);
        if (this.f21852crxdokpmqz.f21898eablkybsjg) {
            i14 = this.f21868sopmlzcsov.f21890eablkybsjg;
            g1(this.f21852crxdokpmqz, true, false);
            u0(iwizpuwonkVar, zynmafqrjbVar, this.f21868sopmlzcsov);
            i13 = this.f21868sopmlzcsov.f21890eablkybsjg;
        } else {
            i13 = this.f21868sopmlzcsov.f21890eablkybsjg;
            h1(this.f21852crxdokpmqz, true, false);
            u0(iwizpuwonkVar, zynmafqrjbVar, this.f21868sopmlzcsov);
            i14 = this.f21868sopmlzcsov.f21890eablkybsjg;
        }
        if (vipkmwdibw() > 0) {
            if (this.f21852crxdokpmqz.f21898eablkybsjg) {
                E0(i14 + D0(i13, iwizpuwonkVar, zynmafqrjbVar, true), iwizpuwonkVar, zynmafqrjbVar, false);
            } else {
                D0(i13 + E0(i14, iwizpuwonkVar, zynmafqrjbVar, true), iwizpuwonkVar, zynmafqrjbVar, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int pkzmftpjix(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return p0(zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean pmvmpeiblj() {
        if (this.f21855hkdspvbjdz == 0) {
            return vdvldrhtss();
        }
        if (vdvldrhtss()) {
            int iIwxlajgraz = iwxlajgraz();
            View view = this.f21853czzsidtyhn;
            if (iIwxlajgraz <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public void ppxfxbqfkf(View view, int i13, int i14, com.google.android.flexbox.zoijcleaow zoijcleaowVar) {
        lereixgezr(view, f21850ydmasvzmpa);
        if (vdvldrhtss()) {
            int iOpjhrmiecq = opjhrmiecq(view) + nuxfzjnpeb(view);
            zoijcleaowVar.f21919eablkybsjg += iOpjhrmiecq;
            zoijcleaowVar.f21921gxszxtbevo += iOpjhrmiecq;
        } else {
            int iUawqvzlxes = uawqvzlxes(view) + jlmebxxoox(view);
            zoijcleaowVar.f21919eablkybsjg += iUawqvzlxes;
            zoijcleaowVar.f21921gxszxtbevo += iUawqvzlxes;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void q(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        super.q(zynmafqrjbVar);
        this.f21873vipkmwdibw = null;
        this.f21857jhduphickx = -1;
        this.f21856ikoacuggdj = Integer.MIN_VALUE;
        this.f21872uwvvkdfqfp = -1;
        this.f21852crxdokpmqz.zdlpuopuiu();
        this.f21863metgxyhuhe.clear();
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int rgvfuqvkyq(View view, int i13, int i14) {
        int iUawqvzlxes;
        int iJlmebxxoox;
        if (vdvldrhtss()) {
            iUawqvzlxes = opjhrmiecq(view);
            iJlmebxxoox = nuxfzjnpeb(view);
        } else {
            iUawqvzlxes = uawqvzlxes(view);
            iJlmebxxoox = jlmebxxoox(view);
        }
        return iUawqvzlxes + iJlmebxxoox;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void rhgxfdycjh(RecyclerView.nufgyqmvbu nufgyqmvbuVar, RecyclerView.nufgyqmvbu nufgyqmvbuVar2) {
        C();
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public void setFlexLines(List list) {
        this.f21870tzroggbefp = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void u(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f21873vipkmwdibw = (SavedState) parcelable;
            M();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public RecyclerView.vdvldrhtss ulzqkzuiru(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public Parcelable v() {
        if (this.f21873vipkmwdibw != null) {
            return new SavedState(this.f21873vipkmwdibw);
        }
        SavedState savedState = new SavedState();
        if (vipkmwdibw() > 0) {
            View viewG0 = G0();
            savedState.f21887zdlpuopuiu = lrnfpwlwnk(viewG0);
            savedState.f21886yggfygwlhe = this.f21858jlmebxxoox.lqeggnwhkg(viewG0) - this.f21858jlmebxxoox.agtfadlqog();
        } else {
            savedState.btonecajqb();
        }
        return savedState;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public boolean vdvldrhtss() {
        int i13 = this.f21859jpowsppfya;
        return i13 == 0 || i13 == 1;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public void wflxmlrfwp(com.google.android.flexbox.zoijcleaow zoijcleaowVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int wwaezpbzkn(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return q0(zynmafqrjbVar);
    }

    public int x0() {
        View viewB0 = B0(0, vipkmwdibw(), false);
        if (viewB0 == null) {
            return -1;
        }
        return lrnfpwlwnk(viewB0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int ylkuphrtab(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return r0(zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.pmvmpeiblj.zoijcleaow
    public PointF zoijcleaow(int i13) {
        View viewRibwqtqdhb;
        if (vipkmwdibw() == 0 || (viewRibwqtqdhb = ribwqtqdhb(0)) == null) {
            return null;
        }
        int i14 = i13 < lrnfpwlwnk(viewRibwqtqdhb) ? -1 : 1;
        return vdvldrhtss() ? new PointF(0.0f, i14) : new PointF(i14, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean zynmafqrjb() {
        if (this.f21855hkdspvbjdz == 0) {
            return !vdvldrhtss();
        }
        if (vdvldrhtss()) {
            return true;
        }
        int iZfvoamnweg = zfvoamnweg();
        View view = this.f21853czzsidtyhn;
        return iZfvoamnweg > (view != null ? view.getHeight() : 0);
    }

    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f21886yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f21887zdlpuopuiu;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void btonecajqb() {
            this.f21887zdlpuopuiu = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean dxjokdxxww(int i13) {
            int i14 = this.f21887zdlpuopuiu;
            return i14 >= 0 && i14 < i13;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f21887zdlpuopuiu + ", mAnchorOffset=" + this.f21886yggfygwlhe + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            parcel.writeInt(this.f21887zdlpuopuiu);
            parcel.writeInt(this.f21886yggfygwlhe);
        }

        SavedState() {
        }

        private SavedState(Parcel parcel) {
            this.f21887zdlpuopuiu = parcel.readInt();
            this.f21886yggfygwlhe = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.f21887zdlpuopuiu = savedState.f21887zdlpuopuiu;
            this.f21886yggfygwlhe = savedState.f21886yggfygwlhe;
        }
    }

    public FlexboxLayoutManager(Context context, int i13, int i14) {
        this.f21874wypolnanlu = -1;
        this.f21870tzroggbefp = new ArrayList();
        this.f21862mbcevpiqjq = new com.google.android.flexbox.ppxfxbqfkf(this);
        this.f21852crxdokpmqz = new zoijcleaow();
        this.f21857jhduphickx = -1;
        this.f21856ikoacuggdj = Integer.MIN_VALUE;
        this.f21865okpsazkaxt = Integer.MIN_VALUE;
        this.f21860jztzpxfvev = Integer.MIN_VALUE;
        this.f21863metgxyhuhe = new SparseArray();
        this.f21872uwvvkdfqfp = -1;
        this.f21876yfnezrywwk = new com.google.android.flexbox.ppxfxbqfkf.zoijcleaow();
        X0(i13);
        Y0(i14);
        W0(4);
        this.f21867rlfsiqarku = context;
    }

    public static class LayoutParams extends RecyclerView.vdvldrhtss implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private int f21877cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private float f21878cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private float f21879esjtqupxsv;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private boolean f21880iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private int f21881istkbnxepw;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private int f21882lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private float f21883pmvmpeiblj;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private int f21884yadqdtsiqt;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private int f21885zynmafqrjb;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i13) {
                return new LayoutParams[i13];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f21878cqumvgiudr = 0.0f;
            this.f21879esjtqupxsv = 1.0f;
            this.f21882lereixgezr = -1;
            this.f21883pmvmpeiblj = -1.0f;
            this.f21877cdpycssgdh = 16777215;
            this.f21884yadqdtsiqt = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int Y() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int a0() {
            return this.f21881istkbnxepw;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int czzsidtyhn() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float dsvhmnatus() {
            return this.f21879esjtqupxsv;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int ezmngbhpjk() {
            return this.f21877cdpycssgdh;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int g0() {
            return this.f21884yadqdtsiqt;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int hkdspvbjdz() {
            return this.f21882lereixgezr;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean hszhottldk() {
            return this.f21880iozdgvuglv;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float iyctptxqzt() {
            return this.f21878cqumvgiudr;
        }

        public void lqeggnwhkg(float f13) {
            this.f21878cqumvgiudr = f13;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float tbqsvytpvh() {
            return this.f21883pmvmpeiblj;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int ulzqkzuiru() {
            return this.f21885zynmafqrjb;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void v(int i13) {
            this.f21885zynmafqrjb = i13;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int w() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            parcel.writeFloat(this.f21878cqumvgiudr);
            parcel.writeFloat(this.f21879esjtqupxsv);
            parcel.writeInt(this.f21882lereixgezr);
            parcel.writeFloat(this.f21883pmvmpeiblj);
            parcel.writeInt(this.f21885zynmafqrjb);
            parcel.writeInt(this.f21881istkbnxepw);
            parcel.writeInt(this.f21877cdpycssgdh);
            parcel.writeInt(this.f21884yadqdtsiqt);
            parcel.writeByte(this.f21880iozdgvuglv ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public int z() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void zfvoamnweg(int i13) {
            this.f21881istkbnxepw = i13;
        }

        public LayoutParams(int i13, int i14) {
            super(i13, i14);
            this.f21878cqumvgiudr = 0.0f;
            this.f21879esjtqupxsv = 1.0f;
            this.f21882lereixgezr = -1;
            this.f21883pmvmpeiblj = -1.0f;
            this.f21877cdpycssgdh = 16777215;
            this.f21884yadqdtsiqt = 16777215;
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f21878cqumvgiudr = 0.0f;
            this.f21879esjtqupxsv = 1.0f;
            this.f21882lereixgezr = -1;
            this.f21883pmvmpeiblj = -1.0f;
            this.f21877cdpycssgdh = 16777215;
            this.f21884yadqdtsiqt = 16777215;
            this.f21878cqumvgiudr = parcel.readFloat();
            this.f21879esjtqupxsv = parcel.readFloat();
            this.f21882lereixgezr = parcel.readInt();
            this.f21883pmvmpeiblj = parcel.readFloat();
            this.f21885zynmafqrjb = parcel.readInt();
            this.f21881istkbnxepw = parcel.readInt();
            this.f21877cdpycssgdh = parcel.readInt();
            this.f21884yadqdtsiqt = parcel.readInt();
            this.f21880iozdgvuglv = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        this.f21874wypolnanlu = -1;
        this.f21870tzroggbefp = new ArrayList();
        this.f21862mbcevpiqjq = new com.google.android.flexbox.ppxfxbqfkf(this);
        this.f21852crxdokpmqz = new zoijcleaow();
        this.f21857jhduphickx = -1;
        this.f21856ikoacuggdj = Integer.MIN_VALUE;
        this.f21865okpsazkaxt = Integer.MIN_VALUE;
        this.f21860jztzpxfvev = Integer.MIN_VALUE;
        this.f21863metgxyhuhe = new SparseArray();
        this.f21872uwvvkdfqfp = -1;
        this.f21876yfnezrywwk = new com.google.android.flexbox.ppxfxbqfkf.zoijcleaow();
        RecyclerView.rgvfuqvkyq.wkgbmnqykc wkgbmnqykcVarZeieaojujs = RecyclerView.rgvfuqvkyq.zeieaojujs(context, attributeSet, i13, i14);
        int i15 = wkgbmnqykcVarZeieaojujs.f12779iobyxmoadg;
        if (i15 != 0) {
            if (i15 == 1) {
                if (wkgbmnqykcVarZeieaojujs.f12780ppxfxbqfkf) {
                    X0(3);
                } else {
                    X0(2);
                }
            }
        } else if (wkgbmnqykcVarZeieaojujs.f12780ppxfxbqfkf) {
            X0(1);
        } else {
            X0(0);
        }
        Y0(1);
        W0(4);
        this.f21867rlfsiqarku = context;
    }
}
