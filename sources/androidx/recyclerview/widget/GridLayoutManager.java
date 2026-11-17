package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    final Rect f12581czzsidtyhn;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    int f12582ikoacuggdj;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    boolean f12583jhduphickx;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    View[] f12584jztzpxfvev;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    final SparseIntArray f12585metgxyhuhe;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    int[] f12586okpsazkaxt;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    ppxfxbqfkf f12587rlfsiqarku;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private boolean f12588uwvvkdfqfp;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    final SparseIntArray f12589xrmfcynszj;

    public static final class iobyxmoadg extends ppxfxbqfkf {
        @Override // androidx.recyclerview.widget.GridLayoutManager.ppxfxbqfkf
        public int eablkybsjg(int i13, int i14) {
            return i13 % i14;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.ppxfxbqfkf
        public int gxszxtbevo(int i13) {
            return 1;
        }
    }

    public static abstract class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final SparseIntArray f12590iobyxmoadg = new SparseIntArray();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final SparseIntArray f12593zoijcleaow = new SparseIntArray();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f12591ppxfxbqfkf = false;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f12592wkgbmnqykc = false;

        static int iobyxmoadg(SparseIntArray sparseIntArray, int i13) {
            int size = sparseIntArray.size() - 1;
            int i14 = 0;
            while (i14 <= size) {
                int i15 = (i14 + size) >>> 1;
                if (sparseIntArray.keyAt(i15) < i13) {
                    i14 = i15 + 1;
                } else {
                    size = i15 - 1;
                }
            }
            int i16 = i14 - 1;
            if (i16 < 0 || i16 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i16);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0024  */
        /* JADX WARN: Code duplicated, block: B:14:0x002b  */
        /* JADX WARN: Code duplicated, block: B:15:0x002d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public int eablkybsjg(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.gxszxtbevo(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f12591ppxfxbqfkf
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f12590iobyxmoadg
                int r2 = iobyxmoadg(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f12590iobyxmoadg
                int r3 = r3.get(r2)
                int r4 = r5.gxszxtbevo(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.gxszxtbevo(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.ppxfxbqfkf.eablkybsjg(int, int):int");
        }

        public abstract int gxszxtbevo(int i13);

        public void lqeggnwhkg() {
            this.f12593zoijcleaow.clear();
        }

        public void nufgyqmvbu() {
            this.f12590iobyxmoadg.clear();
        }

        int ppxfxbqfkf(int i13, int i14) {
            if (!this.f12591ppxfxbqfkf) {
                return eablkybsjg(i13, i14);
            }
            int i15 = this.f12590iobyxmoadg.get(i13, -1);
            if (i15 != -1) {
                return i15;
            }
            int iEablkybsjg = eablkybsjg(i13, i14);
            this.f12590iobyxmoadg.put(i13, iEablkybsjg);
            return iEablkybsjg;
        }

        public int wkgbmnqykc(int i13, int i14) {
            int i15;
            int i16;
            int iPpxfxbqfkf;
            int iIobyxmoadg;
            if (!this.f12592wkgbmnqykc || (iIobyxmoadg = iobyxmoadg(this.f12593zoijcleaow, i13)) == -1) {
                i15 = 0;
                i16 = 0;
                iPpxfxbqfkf = 0;
            } else {
                i15 = this.f12593zoijcleaow.get(iIobyxmoadg);
                i16 = iIobyxmoadg + 1;
                iPpxfxbqfkf = ppxfxbqfkf(iIobyxmoadg, i14) + gxszxtbevo(iIobyxmoadg);
                if (iPpxfxbqfkf == i14) {
                    i15++;
                    iPpxfxbqfkf = 0;
                }
            }
            int iGxszxtbevo = gxszxtbevo(i13);
            while (i16 < i13) {
                int iGxszxtbevo2 = gxszxtbevo(i16);
                iPpxfxbqfkf += iGxszxtbevo2;
                if (iPpxfxbqfkf == i14) {
                    i15++;
                    iPpxfxbqfkf = 0;
                } else if (iPpxfxbqfkf > i14) {
                    i15++;
                    iPpxfxbqfkf = iGxszxtbevo2;
                }
                i16++;
            }
            return iPpxfxbqfkf + iGxszxtbevo > i14 ? i15 + 1 : i15;
        }

        int zoijcleaow(int i13, int i14) {
            if (!this.f12592wkgbmnqykc) {
                return wkgbmnqykc(i13, i14);
            }
            int i15 = this.f12593zoijcleaow.get(i13, -1);
            if (i15 != -1) {
                return i15;
            }
            int iWkgbmnqykc = wkgbmnqykc(i13, i14);
            this.f12593zoijcleaow.put(i13, iWkgbmnqykc);
            return iWkgbmnqykc;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.f12583jhduphickx = false;
        this.f12582ikoacuggdj = -1;
        this.f12589xrmfcynszj = new SparseIntArray();
        this.f12585metgxyhuhe = new SparseIntArray();
        this.f12587rlfsiqarku = new iobyxmoadg();
        this.f12581czzsidtyhn = new Rect();
        x1(RecyclerView.rgvfuqvkyq.zeieaojujs(context, attributeSet, i13, i14).f12782zoijcleaow);
    }

    private void g1(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, int i13, boolean z13) {
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        if (z13) {
            i16 = 1;
            i15 = i13;
            i14 = 0;
        } else {
            i14 = i13 - 1;
            i15 = -1;
            i16 = -1;
        }
        while (i14 != i15) {
            View view = this.f12584jztzpxfvev[i14];
            zoijcleaow zoijcleaowVar = (zoijcleaow) view.getLayoutParams();
            int iT1 = t1(iwizpuwonkVar, zynmafqrjbVar, lrnfpwlwnk(view));
            zoijcleaowVar.f12595esjtqupxsv = iT1;
            zoijcleaowVar.f12594cqumvgiudr = i17;
            i17 += iT1;
            i14 += i16;
        }
    }

    private void h1() {
        int iVipkmwdibw = vipkmwdibw();
        for (int i13 = 0; i13 < iVipkmwdibw; i13++) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) ribwqtqdhb(i13).getLayoutParams();
            int iZoijcleaow = zoijcleaowVar.zoijcleaow();
            this.f12589xrmfcynszj.put(iZoijcleaow, zoijcleaowVar.nufgyqmvbu());
            this.f12585metgxyhuhe.put(iZoijcleaow, zoijcleaowVar.lqeggnwhkg());
        }
    }

    private void i1(int i13) {
        this.f12586okpsazkaxt = j1(this.f12586okpsazkaxt, this.f12582ikoacuggdj, i13);
    }

    static int[] j1(int[] iArr, int i13, int i14) {
        int i15;
        if (iArr == null || iArr.length != i13 + 1 || iArr[iArr.length - 1] != i14) {
            iArr = new int[i13 + 1];
        }
        int i16 = 0;
        iArr[0] = 0;
        int i17 = i14 / i13;
        int i18 = i14 % i13;
        int i19 = 0;
        for (int i23 = 1; i23 <= i13; i23++) {
            i16 += i18;
            if (i16 <= 0 || i13 - i16 >= i18) {
                i15 = i17;
            } else {
                i15 = i17 + 1;
                i16 -= i13;
            }
            i19 += i15;
            iArr[i23] = i19;
        }
        return iArr;
    }

    private void k1() {
        this.f12589xrmfcynszj.clear();
        this.f12585metgxyhuhe.clear();
    }

    private int l1(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() != 0 && zynmafqrjbVar.zoijcleaow() != 0) {
            m0();
            boolean zJ0 = J0();
            View viewR0 = r0(!zJ0, true);
            View viewQ0 = q0(!zJ0, true);
            if (viewR0 != null && viewQ0 != null) {
                int iZoijcleaow = this.f12587rlfsiqarku.zoijcleaow(lrnfpwlwnk(viewR0), this.f12582ikoacuggdj);
                int iZoijcleaow2 = this.f12587rlfsiqarku.zoijcleaow(lrnfpwlwnk(viewQ0), this.f12582ikoacuggdj);
                int iMax = this.f12607stevsuqkhv ? Math.max(0, ((this.f12587rlfsiqarku.zoijcleaow(zynmafqrjbVar.zoijcleaow() - 1, this.f12582ikoacuggdj) + 1) - Math.max(iZoijcleaow, iZoijcleaow2)) - 1) : Math.max(0, Math.min(iZoijcleaow, iZoijcleaow2));
                if (zJ0) {
                    return Math.round((iMax * (Math.abs(this.f12596cllcsxoeiz.wkgbmnqykc(viewQ0) - this.f12596cllcsxoeiz.lqeggnwhkg(viewR0)) / ((this.f12587rlfsiqarku.zoijcleaow(lrnfpwlwnk(viewQ0), this.f12582ikoacuggdj) - this.f12587rlfsiqarku.zoijcleaow(lrnfpwlwnk(viewR0), this.f12582ikoacuggdj)) + 1))) + (this.f12596cllcsxoeiz.agtfadlqog() - this.f12596cllcsxoeiz.lqeggnwhkg(viewR0)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int m1(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() != 0 && zynmafqrjbVar.zoijcleaow() != 0) {
            m0();
            View viewR0 = r0(!J0(), true);
            View viewQ0 = q0(!J0(), true);
            if (viewR0 != null && viewQ0 != null) {
                if (!J0()) {
                    return this.f12587rlfsiqarku.zoijcleaow(zynmafqrjbVar.zoijcleaow() - 1, this.f12582ikoacuggdj) + 1;
                }
                return (int) (((this.f12596cllcsxoeiz.wkgbmnqykc(viewQ0) - this.f12596cllcsxoeiz.lqeggnwhkg(viewR0)) / ((this.f12587rlfsiqarku.zoijcleaow(lrnfpwlwnk(viewQ0), this.f12582ikoacuggdj) - this.f12587rlfsiqarku.zoijcleaow(lrnfpwlwnk(viewR0), this.f12582ikoacuggdj)) + 1)) * (this.f12587rlfsiqarku.zoijcleaow(zynmafqrjbVar.zoijcleaow() - 1, this.f12582ikoacuggdj) + 1));
            }
        }
        return 0;
    }

    private void n1(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, LinearLayoutManager.iobyxmoadg iobyxmoadgVar, int i13) {
        boolean z13 = i13 == 1;
        int iS1 = s1(iwizpuwonkVar, zynmafqrjbVar, iobyxmoadgVar.f12619zoijcleaow);
        if (z13) {
            while (iS1 > 0) {
                int i14 = iobyxmoadgVar.f12619zoijcleaow;
                if (i14 <= 0) {
                    return;
                }
                int i15 = i14 - 1;
                iobyxmoadgVar.f12619zoijcleaow = i15;
                iS1 = s1(iwizpuwonkVar, zynmafqrjbVar, i15);
            }
            return;
        }
        int iZoijcleaow = zynmafqrjbVar.zoijcleaow() - 1;
        int i16 = iobyxmoadgVar.f12619zoijcleaow;
        while (i16 < iZoijcleaow) {
            int i17 = i16 + 1;
            int iS2 = s1(iwizpuwonkVar, zynmafqrjbVar, i17);
            if (iS2 <= iS1) {
                break;
            }
            i16 = i17;
            iS1 = iS2;
        }
        iobyxmoadgVar.f12619zoijcleaow = i16;
    }

    private void o1() {
        View[] viewArr = this.f12584jztzpxfvev;
        if (viewArr == null || viewArr.length != this.f12582ikoacuggdj) {
            this.f12584jztzpxfvev = new View[this.f12582ikoacuggdj];
        }
    }

    private int r1(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, int i13) {
        if (!zynmafqrjbVar.eablkybsjg()) {
            return this.f12587rlfsiqarku.zoijcleaow(i13, this.f12582ikoacuggdj);
        }
        int iGxszxtbevo = iwizpuwonkVar.gxszxtbevo(i13);
        if (iGxszxtbevo != -1) {
            return this.f12587rlfsiqarku.zoijcleaow(iGxszxtbevo, this.f12582ikoacuggdj);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i13);
        return 0;
    }

    private int s1(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, int i13) {
        if (!zynmafqrjbVar.eablkybsjg()) {
            return this.f12587rlfsiqarku.ppxfxbqfkf(i13, this.f12582ikoacuggdj);
        }
        int i14 = this.f12585metgxyhuhe.get(i13, -1);
        if (i14 != -1) {
            return i14;
        }
        int iGxszxtbevo = iwizpuwonkVar.gxszxtbevo(i13);
        if (iGxszxtbevo != -1) {
            return this.f12587rlfsiqarku.ppxfxbqfkf(iGxszxtbevo, this.f12582ikoacuggdj);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i13);
        return 0;
    }

    private int t1(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, int i13) {
        if (!zynmafqrjbVar.eablkybsjg()) {
            return this.f12587rlfsiqarku.gxszxtbevo(i13);
        }
        int i14 = this.f12589xrmfcynszj.get(i13, -1);
        if (i14 != -1) {
            return i14;
        }
        int iGxszxtbevo = iwizpuwonkVar.gxszxtbevo(i13);
        if (iGxszxtbevo != -1) {
            return this.f12587rlfsiqarku.gxszxtbevo(iGxszxtbevo);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i13);
        return 1;
    }

    private void u1(float f13, int i13) {
        i1(Math.max(Math.round(f13 * this.f12582ikoacuggdj), i13));
    }

    private void v1(View view, int i13, boolean z13) {
        int iJhduphickx;
        int iJhduphickx2;
        zoijcleaow zoijcleaowVar = (zoijcleaow) view.getLayoutParams();
        Rect rect = zoijcleaowVar.f12786yggfygwlhe;
        int i14 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) zoijcleaowVar).topMargin + ((ViewGroup.MarginLayoutParams) zoijcleaowVar).bottomMargin;
        int i15 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) zoijcleaowVar).leftMargin + ((ViewGroup.MarginLayoutParams) zoijcleaowVar).rightMargin;
        int iP1 = p1(zoijcleaowVar.f12594cqumvgiudr, zoijcleaowVar.f12595esjtqupxsv);
        if (this.f12601jpowsppfya == 1) {
            iJhduphickx2 = RecyclerView.rgvfuqvkyq.jhduphickx(iP1, i13, i15, ((ViewGroup.MarginLayoutParams) zoijcleaowVar).width, false);
            iJhduphickx = RecyclerView.rgvfuqvkyq.jhduphickx(this.f12596cllcsxoeiz.ojitshcjhn(), oipsdeybqn(), i14, ((ViewGroup.MarginLayoutParams) zoijcleaowVar).height, true);
        } else {
            int iJhduphickx3 = RecyclerView.rgvfuqvkyq.jhduphickx(iP1, i13, i14, ((ViewGroup.MarginLayoutParams) zoijcleaowVar).height, false);
            int iJhduphickx4 = RecyclerView.rgvfuqvkyq.jhduphickx(this.f12596cllcsxoeiz.ojitshcjhn(), dvvnrvtcbc(), i15, ((ViewGroup.MarginLayoutParams) zoijcleaowVar).width, true);
            iJhduphickx = iJhduphickx3;
            iJhduphickx2 = iJhduphickx4;
        }
        w1(view, iJhduphickx2, iJhduphickx, z13);
    }

    private void w1(View view, int i13, int i14, boolean z13) {
        RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view.getLayoutParams();
        if (z13 ? a0(view, i13, i14, vdvldrhtssVar) : Y(view, i13, i14, vdvldrhtssVar)) {
            view.measure(i13, i14);
        }
    }

    private void z1() {
        int iZfvoamnweg;
        int paddingTop;
        if (G0() == 1) {
            iZfvoamnweg = iwxlajgraz() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            iZfvoamnweg = zfvoamnweg() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        i1(iZfvoamnweg - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View A0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, boolean z13, boolean z14) {
        int i13;
        int iVipkmwdibw;
        int iVipkmwdibw2 = vipkmwdibw();
        int i14 = 1;
        if (z14) {
            iVipkmwdibw = vipkmwdibw() - 1;
            i13 = -1;
            i14 = -1;
        } else {
            i13 = iVipkmwdibw2;
            iVipkmwdibw = 0;
        }
        int iZoijcleaow = zynmafqrjbVar.zoijcleaow();
        m0();
        int iAgtfadlqog = this.f12596cllcsxoeiz.agtfadlqog();
        int iDxjokdxxww = this.f12596cllcsxoeiz.dxjokdxxww();
        View view = null;
        View view2 = null;
        while (iVipkmwdibw != i13) {
            View viewRibwqtqdhb = ribwqtqdhb(iVipkmwdibw);
            int iLrnfpwlwnk = lrnfpwlwnk(viewRibwqtqdhb);
            if (iLrnfpwlwnk >= 0 && iLrnfpwlwnk < iZoijcleaow && s1(iwizpuwonkVar, zynmafqrjbVar, iLrnfpwlwnk) == 0) {
                if (((RecyclerView.vdvldrhtss) viewRibwqtqdhb.getLayoutParams()).eablkybsjg()) {
                    if (view2 == null) {
                        view2 = viewRibwqtqdhb;
                    }
                } else {
                    if (this.f12596cllcsxoeiz.lqeggnwhkg(viewRibwqtqdhb) < iDxjokdxxww && this.f12596cllcsxoeiz.wkgbmnqykc(viewRibwqtqdhb) >= iAgtfadlqog) {
                        return viewRibwqtqdhb;
                    }
                    if (view == null) {
                        view = viewRibwqtqdhb;
                    }
                }
            }
            iVipkmwdibw += i14;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void K0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, LinearLayoutManager.ppxfxbqfkf ppxfxbqfkfVar, LinearLayoutManager.zoijcleaow zoijcleaowVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iGxszxtbevo;
        int i18;
        int iGxszxtbevo2;
        int iGxszxtbevo3;
        int i19;
        int iJhduphickx;
        int iJhduphickx2;
        View viewWkgbmnqykc;
        int iWflxmlrfwp = this.f12596cllcsxoeiz.wflxmlrfwp();
        boolean z13 = iWflxmlrfwp != 1073741824;
        int i23 = vipkmwdibw() > 0 ? this.f12586okpsazkaxt[this.f12582ikoacuggdj] : 0;
        if (z13) {
            z1();
        }
        boolean z14 = ppxfxbqfkfVar.f12623eablkybsjg == 1;
        int iS1 = this.f12582ikoacuggdj;
        if (!z14) {
            iS1 = s1(iwizpuwonkVar, zynmafqrjbVar, ppxfxbqfkfVar.f12631wkgbmnqykc) + t1(iwizpuwonkVar, zynmafqrjbVar, ppxfxbqfkfVar.f12631wkgbmnqykc);
        }
        int i24 = 0;
        while (i24 < this.f12582ikoacuggdj && ppxfxbqfkfVar.ppxfxbqfkf(zynmafqrjbVar) && iS1 > 0) {
            int i25 = ppxfxbqfkfVar.f12631wkgbmnqykc;
            int iT1 = t1(iwizpuwonkVar, zynmafqrjbVar, i25);
            if (iT1 > this.f12582ikoacuggdj) {
                throw new IllegalArgumentException("Item at position " + i25 + " requires " + iT1 + " spans but GridLayoutManager has only " + this.f12582ikoacuggdj + " spans.");
            }
            iS1 -= iT1;
            if (iS1 < 0 || (viewWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc(iwizpuwonkVar)) == null) {
                break;
            }
            this.f12584jztzpxfvev[i24] = viewWkgbmnqykc;
            i24++;
        }
        if (i24 == 0) {
            zoijcleaowVar.f12636zoijcleaow = true;
            return;
        }
        g1(iwizpuwonkVar, zynmafqrjbVar, i24, z14);
        float f13 = 0.0f;
        int i26 = 0;
        for (int i27 = 0; i27 < i24; i27++) {
            View view = this.f12584jztzpxfvev[i27];
            if (ppxfxbqfkfVar.f12621draadjrbmk == null) {
                if (z14) {
                    zdlpuopuiu(view);
                } else {
                    yggfygwlhe(view, 0);
                }
            } else if (z14) {
                oxmwwwfdhm(view);
            } else {
                kcexrzcfyt(view, 0);
            }
            lereixgezr(view, this.f12581czzsidtyhn);
            v1(view, iWflxmlrfwp, false);
            int iEablkybsjg = this.f12596cllcsxoeiz.eablkybsjg(view);
            if (iEablkybsjg > i26) {
                i26 = iEablkybsjg;
            }
            float fGxszxtbevo = (this.f12596cllcsxoeiz.gxszxtbevo(view) * 1.0f) / ((zoijcleaow) view.getLayoutParams()).f12595esjtqupxsv;
            if (fGxszxtbevo > f13) {
                f13 = fGxszxtbevo;
            }
        }
        if (z13) {
            u1(f13, i23);
            i26 = 0;
            for (int i28 = 0; i28 < i24; i28++) {
                View view2 = this.f12584jztzpxfvev[i28];
                v1(view2, 1073741824, true);
                int iEablkybsjg2 = this.f12596cllcsxoeiz.eablkybsjg(view2);
                if (iEablkybsjg2 > i26) {
                    i26 = iEablkybsjg2;
                }
            }
        }
        for (int i29 = 0; i29 < i24; i29++) {
            View view3 = this.f12584jztzpxfvev[i29];
            if (this.f12596cllcsxoeiz.eablkybsjg(view3) != i26) {
                zoijcleaow zoijcleaowVar2 = (zoijcleaow) view3.getLayoutParams();
                Rect rect = zoijcleaowVar2.f12786yggfygwlhe;
                int i33 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) zoijcleaowVar2).topMargin + ((ViewGroup.MarginLayoutParams) zoijcleaowVar2).bottomMargin;
                int i34 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) zoijcleaowVar2).leftMargin + ((ViewGroup.MarginLayoutParams) zoijcleaowVar2).rightMargin;
                int iP1 = p1(zoijcleaowVar2.f12594cqumvgiudr, zoijcleaowVar2.f12595esjtqupxsv);
                if (this.f12601jpowsppfya == 1) {
                    iJhduphickx2 = RecyclerView.rgvfuqvkyq.jhduphickx(iP1, 1073741824, i34, ((ViewGroup.MarginLayoutParams) zoijcleaowVar2).width, false);
                    iJhduphickx = View.MeasureSpec.makeMeasureSpec(i26 - i33, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i26 - i34, 1073741824);
                    iJhduphickx = RecyclerView.rgvfuqvkyq.jhduphickx(iP1, 1073741824, i33, ((ViewGroup.MarginLayoutParams) zoijcleaowVar2).height, false);
                    iJhduphickx2 = iMakeMeasureSpec;
                }
                w1(view3, iJhduphickx2, iJhduphickx, true);
            }
        }
        zoijcleaowVar.f12633iobyxmoadg = i26;
        if (this.f12601jpowsppfya == 1) {
            if (ppxfxbqfkfVar.f12625gxszxtbevo == -1) {
                iGxszxtbevo = ppxfxbqfkfVar.f12632zoijcleaow;
                i19 = iGxszxtbevo - i26;
            } else {
                i19 = ppxfxbqfkfVar.f12632zoijcleaow;
                iGxszxtbevo = i19 + i26;
            }
            i16 = i19;
            i17 = 0;
            i15 = 0;
        } else {
            if (ppxfxbqfkfVar.f12625gxszxtbevo == -1) {
                i14 = ppxfxbqfkfVar.f12632zoijcleaow;
                i13 = i14 - i26;
            } else {
                i13 = ppxfxbqfkfVar.f12632zoijcleaow;
                i14 = i13 + i26;
            }
            i15 = i13;
            i16 = 0;
            i17 = i14;
            iGxszxtbevo = 0;
        }
        int i35 = 0;
        while (i35 < i24) {
            View view4 = this.f12584jztzpxfvev[i35];
            zoijcleaow zoijcleaowVar3 = (zoijcleaow) view4.getLayoutParams();
            if (this.f12601jpowsppfya == 1) {
                if (I0()) {
                    int paddingLeft = getPaddingLeft() + this.f12586okpsazkaxt[this.f12582ikoacuggdj - zoijcleaowVar3.f12594cqumvgiudr];
                    iGxszxtbevo2 = paddingLeft;
                    iGxszxtbevo3 = paddingLeft - this.f12596cllcsxoeiz.gxszxtbevo(view4);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.f12586okpsazkaxt[zoijcleaowVar3.f12594cqumvgiudr];
                    iGxszxtbevo3 = paddingLeft2;
                    iGxszxtbevo2 = this.f12596cllcsxoeiz.gxszxtbevo(view4) + paddingLeft2;
                }
                i18 = i16;
            } else {
                int paddingTop = getPaddingTop() + this.f12586okpsazkaxt[zoijcleaowVar3.f12594cqumvgiudr];
                i18 = paddingTop;
                iGxszxtbevo2 = i17;
                iGxszxtbevo3 = i15;
                iGxszxtbevo = this.f12596cllcsxoeiz.gxszxtbevo(view4) + paddingTop;
            }
            mhtqkkgtqm(view4, iGxszxtbevo3, i18, iGxszxtbevo2, iGxszxtbevo);
            if (zoijcleaowVar3.eablkybsjg() || zoijcleaowVar3.ppxfxbqfkf()) {
                zoijcleaowVar.f12634ppxfxbqfkf = true;
            }
            zoijcleaowVar.f12635wkgbmnqykc |= view4.hasFocusable();
            i35++;
            iGxszxtbevo = iGxszxtbevo;
            i17 = iGxszxtbevo2;
            i15 = iGxszxtbevo3;
            i16 = i18;
        }
        Arrays.fill(this.f12584jztzpxfvev, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void M0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, LinearLayoutManager.iobyxmoadg iobyxmoadgVar, int i13) {
        super.M0(iwizpuwonkVar, zynmafqrjbVar, iobyxmoadgVar, i13);
        z1();
        if (zynmafqrjbVar.zoijcleaow() > 0 && !zynmafqrjbVar.eablkybsjg()) {
            n1(iwizpuwonkVar, zynmafqrjbVar, iobyxmoadgVar, i13);
        }
        o1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int P(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        z1();
        o1();
        return super.P(i13, iwizpuwonkVar, zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int R(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        z1();
        o1();
        return super.R(i13, iwizpuwonkVar, zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void V(Rect rect, int i13, int i14) {
        int iCdpycssgdh;
        int iCdpycssgdh2;
        if (this.f12586okpsazkaxt == null) {
            super.V(rect, i13, i14);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f12601jpowsppfya == 1) {
            iCdpycssgdh2 = RecyclerView.rgvfuqvkyq.cdpycssgdh(i14, rect.height() + paddingTop, iyctptxqzt());
            int[] iArr = this.f12586okpsazkaxt;
            iCdpycssgdh = RecyclerView.rgvfuqvkyq.cdpycssgdh(i13, iArr[iArr.length - 1] + paddingLeft, weqkydbzbr());
        } else {
            iCdpycssgdh = RecyclerView.rgvfuqvkyq.cdpycssgdh(i13, rect.width() + paddingLeft, weqkydbzbr());
            int[] iArr2 = this.f12586okpsazkaxt;
            iCdpycssgdh2 = RecyclerView.rgvfuqvkyq.cdpycssgdh(i14, iArr2[iArr2.length - 1] + paddingTop, iyctptxqzt());
        }
        U(iCdpycssgdh, iCdpycssgdh2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void X0(boolean z13) {
        if (z13) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.X0(false);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View b(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.iwizpuwonk r26, androidx.recyclerview.widget.RecyclerView.zynmafqrjb r27) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.b(android.view.View, int, androidx.recyclerview.widget.RecyclerView$iwizpuwonk, androidx.recyclerview.widget.RecyclerView$zynmafqrjb):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void e(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, w1.zdlpuopuiu zdlpuopuiuVar) {
        super.e(iwizpuwonkVar, zynmafqrjbVar, zdlpuopuiuVar);
        zdlpuopuiuVar.uwvvkdfqfp(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean e0() {
        return this.f12606sopmlzcsov == null && !this.f12583jhduphickx;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void g0(RecyclerView.zynmafqrjb zynmafqrjbVar, LinearLayoutManager.ppxfxbqfkf ppxfxbqfkfVar, RecyclerView.rgvfuqvkyq.ppxfxbqfkf ppxfxbqfkfVar2) {
        int iGxszxtbevo = this.f12582ikoacuggdj;
        for (int i13 = 0; i13 < this.f12582ikoacuggdj && ppxfxbqfkfVar.ppxfxbqfkf(zynmafqrjbVar) && iGxszxtbevo > 0; i13++) {
            int i14 = ppxfxbqfkfVar.f12631wkgbmnqykc;
            ppxfxbqfkfVar2.iobyxmoadg(i14, Math.max(0, ppxfxbqfkfVar.f12627lqeggnwhkg));
            iGxszxtbevo -= this.f12587rlfsiqarku.gxszxtbevo(i14);
            ppxfxbqfkfVar.f12631wkgbmnqykc += ppxfxbqfkfVar.f12623eablkybsjg;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void h(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, View view, w1.zdlpuopuiu zdlpuopuiuVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof zoijcleaow)) {
            super.g(view, zdlpuopuiuVar);
            return;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) layoutParams;
        int iR1 = r1(iwizpuwonkVar, zynmafqrjbVar, zoijcleaowVar.zoijcleaow());
        if (this.f12601jpowsppfya == 0) {
            zdlpuopuiuVar.sflfametgt(w1.zdlpuopuiu.gxszxtbevo.iobyxmoadg(zoijcleaowVar.lqeggnwhkg(), zoijcleaowVar.nufgyqmvbu(), iR1, 1, false, false));
        } else {
            zdlpuopuiuVar.sflfametgt(w1.zdlpuopuiu.gxszxtbevo.iobyxmoadg(iR1, 1, zoijcleaowVar.lqeggnwhkg(), zoijcleaowVar.nufgyqmvbu(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int hcddaimhww(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return this.f12588uwvvkdfqfp ? l1(zynmafqrjbVar) : super.hcddaimhww(zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean istkbnxepw(RecyclerView.vdvldrhtss vdvldrhtssVar) {
        return vdvldrhtssVar instanceof zoijcleaow;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void j(RecyclerView recyclerView, int i13, int i14) {
        this.f12587rlfsiqarku.nufgyqmvbu();
        this.f12587rlfsiqarku.lqeggnwhkg();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int jpowsppfya(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return this.f12588uwvvkdfqfp ? m1(zynmafqrjbVar) : super.jpowsppfya(zynmafqrjbVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int jztzpxfvev(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (this.f12601jpowsppfya == 1) {
            return this.f12582ikoacuggdj;
        }
        if (zynmafqrjbVar.zoijcleaow() < 1) {
            return 0;
        }
        return r1(iwizpuwonkVar, zynmafqrjbVar, zynmafqrjbVar.zoijcleaow() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void k(RecyclerView recyclerView) {
        this.f12587rlfsiqarku.nufgyqmvbu();
        this.f12587rlfsiqarku.lqeggnwhkg();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void l(RecyclerView recyclerView, int i13, int i14, int i15) {
        this.f12587rlfsiqarku.nufgyqmvbu();
        this.f12587rlfsiqarku.lqeggnwhkg();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void m(RecyclerView recyclerView, int i13, int i14) {
        this.f12587rlfsiqarku.nufgyqmvbu();
        this.f12587rlfsiqarku.lqeggnwhkg();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public RecyclerView.vdvldrhtss ntlheqmsrt() {
        return this.f12601jpowsppfya == 0 ? new zoijcleaow(-2, -1) : new zoijcleaow(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void o(RecyclerView recyclerView, int i13, int i14, Object obj) {
        this.f12587rlfsiqarku.nufgyqmvbu();
        this.f12587rlfsiqarku.lqeggnwhkg();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void p(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (zynmafqrjbVar.eablkybsjg()) {
            h1();
        }
        super.p(iwizpuwonkVar, zynmafqrjbVar);
        k1();
    }

    int p1(int i13, int i14) {
        if (this.f12601jpowsppfya != 1 || !I0()) {
            int[] iArr = this.f12586okpsazkaxt;
            return iArr[i14 + i13] - iArr[i13];
        }
        int[] iArr2 = this.f12586okpsazkaxt;
        int i15 = this.f12582ikoacuggdj;
        return iArr2[i15 - i13] - iArr2[(i15 - i13) - i14];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void q(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        super.q(zynmafqrjbVar);
        this.f12583jhduphickx = false;
    }

    public int q1() {
        return this.f12582ikoacuggdj;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public RecyclerView.vdvldrhtss sopmlzcsov(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new zoijcleaow((ViewGroup.MarginLayoutParams) layoutParams) : new zoijcleaow(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int tbqsvytpvh(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (this.f12601jpowsppfya == 0) {
            return this.f12582ikoacuggdj;
        }
        if (zynmafqrjbVar.zoijcleaow() < 1) {
            return 0;
        }
        return r1(iwizpuwonkVar, zynmafqrjbVar, zynmafqrjbVar.zoijcleaow() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public RecyclerView.vdvldrhtss ulzqkzuiru(Context context, AttributeSet attributeSet) {
        return new zoijcleaow(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int wwaezpbzkn(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return this.f12588uwvvkdfqfp ? l1(zynmafqrjbVar) : super.wwaezpbzkn(zynmafqrjbVar);
    }

    public void x1(int i13) {
        if (i13 == this.f12582ikoacuggdj) {
            return;
        }
        this.f12583jhduphickx = true;
        if (i13 >= 1) {
            this.f12582ikoacuggdj = i13;
            this.f12587rlfsiqarku.nufgyqmvbu();
            M();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i13);
        }
    }

    public void y1(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f12587rlfsiqarku = ppxfxbqfkfVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int ylkuphrtab(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return this.f12588uwvvkdfqfp ? m1(zynmafqrjbVar) : super.ylkuphrtab(zynmafqrjbVar);
    }

    public static class zoijcleaow extends RecyclerView.vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f12594cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f12595esjtqupxsv;

        public zoijcleaow(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12594cqumvgiudr = -1;
            this.f12595esjtqupxsv = 0;
        }

        public int lqeggnwhkg() {
            return this.f12594cqumvgiudr;
        }

        public int nufgyqmvbu() {
            return this.f12595esjtqupxsv;
        }

        public zoijcleaow(int i13, int i14) {
            super(i13, i14);
            this.f12594cqumvgiudr = -1;
            this.f12595esjtqupxsv = 0;
        }

        public zoijcleaow(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12594cqumvgiudr = -1;
            this.f12595esjtqupxsv = 0;
        }

        public zoijcleaow(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12594cqumvgiudr = -1;
            this.f12595esjtqupxsv = 0;
        }
    }

    public GridLayoutManager(Context context, int i13) {
        super(context);
        this.f12583jhduphickx = false;
        this.f12582ikoacuggdj = -1;
        this.f12589xrmfcynszj = new SparseIntArray();
        this.f12585metgxyhuhe = new SparseIntArray();
        this.f12587rlfsiqarku = new iobyxmoadg();
        this.f12581czzsidtyhn = new Rect();
        x1(i13);
    }

    public GridLayoutManager(Context context, int i13, int i14, boolean z13) {
        super(context, i14, z13);
        this.f12583jhduphickx = false;
        this.f12582ikoacuggdj = -1;
        this.f12589xrmfcynszj = new SparseIntArray();
        this.f12585metgxyhuhe = new SparseIntArray();
        this.f12587rlfsiqarku = new iobyxmoadg();
        this.f12581czzsidtyhn = new Rect();
        x1(i13);
    }
}
