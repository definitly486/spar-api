package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v1.iwizpuwonk;

/* JADX INFO: loaded from: classes2.dex */
class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long[] f21906eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final com.google.android.flexbox.iobyxmoadg f21907iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int[] f21908ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    long[] f21909wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean[] f21910zoijcleaow;

    /* JADX INFO: renamed from: com.google.android.flexbox.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private static class C0394ppxfxbqfkf implements Comparable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f21911yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f21912zdlpuopuiu;

        private C0394ppxfxbqfkf() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0394ppxfxbqfkf c0394ppxfxbqfkf) {
            int i13 = this.f21911yggfygwlhe;
            int i14 = c0394ppxfxbqfkf.f21911yggfygwlhe;
            return i13 != i14 ? i13 - i14 : this.f21912zdlpuopuiu - c0394ppxfxbqfkf.f21912zdlpuopuiu;
        }

        public String toString() {
            return "Order{order=" + this.f21911yggfygwlhe + ", index=" + this.f21912zdlpuopuiu + '}';
        }
    }

    static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        List f21913iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f21914zoijcleaow;

        zoijcleaow() {
        }

        void iobyxmoadg() {
            this.f21913iobyxmoadg = null;
            this.f21914zoijcleaow = 0;
        }
    }

    ppxfxbqfkf(com.google.android.flexbox.iobyxmoadg iobyxmoadgVar) {
        this.f21907iobyxmoadg = iobyxmoadgVar;
    }

    private int cdpycssgdh(FlexItem flexItem, boolean z13) {
        return z13 ? flexItem.czzsidtyhn() : flexItem.z();
    }

    private boolean cllcsxoeiz(int i13, int i14, com.google.android.flexbox.zoijcleaow zoijcleaowVar) {
        return i13 == i14 - 1 && zoijcleaowVar.ppxfxbqfkf() != 0;
    }

    private List draadjrbmk(int i13) {
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            FlexItem flexItem = (FlexItem) this.f21907iobyxmoadg.dxjokdxxww(i14).getLayoutParams();
            C0394ppxfxbqfkf c0394ppxfxbqfkf = new C0394ppxfxbqfkf();
            c0394ppxfxbqfkf.f21911yggfygwlhe = flexItem.getOrder();
            c0394ppxfxbqfkf.f21912zdlpuopuiu = i14;
            arrayList.add(c0394ppxfxbqfkf);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void dxjokdxxww(View view, int i13) {
        boolean z13;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z14 = true;
        if (measuredWidth >= flexItem.ulzqkzuiru()) {
            if (measuredWidth > flexItem.ezmngbhpjk()) {
                measuredWidth = flexItem.ezmngbhpjk();
            } else {
                z13 = false;
            }
            if (measuredHeight < flexItem.a0()) {
                measuredHeight = flexItem.a0();
            } else if (measuredHeight > flexItem.g0()) {
                measuredHeight = flexItem.g0();
            } else {
                z14 = z13;
            }
            if (z14) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                ribwqtqdhb(i13, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.f21907iobyxmoadg.ojitshcjhn(i13, view);
            }
        }
        measuredWidth = flexItem.ulzqkzuiru();
        z13 = true;
        if (measuredHeight < flexItem.a0()) {
            measuredHeight = flexItem.a0();
        } else if (measuredHeight > flexItem.g0()) {
            measuredHeight = flexItem.g0();
        } else {
            z14 = z13;
        }
        if (z14) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            ribwqtqdhb(i13, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.f21907iobyxmoadg.ojitshcjhn(i13, view);
        }
    }

    private List gtknphoqwx(List list, int i13, int i14) {
        int i15 = (i13 - i14) / 2;
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.zoijcleaow zoijcleaowVar = new com.google.android.flexbox.zoijcleaow();
        zoijcleaowVar.f21923lqeggnwhkg = i15;
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            if (i16 == 0) {
                arrayList.add(zoijcleaowVar);
            }
            arrayList.add((com.google.android.flexbox.zoijcleaow) list.get(i16));
            if (i16 == list.size() - 1) {
                arrayList.add(zoijcleaowVar);
            }
        }
        return arrayList;
    }

    private int hcddaimhww(boolean z13) {
        return z13 ? this.f21907iobyxmoadg.getPaddingStart() : this.f21907iobyxmoadg.getPaddingTop();
    }

    private int hkdspvbjdz(View view, boolean z13) {
        return z13 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private void iobyxmoadg(List list, com.google.android.flexbox.zoijcleaow zoijcleaowVar, int i13, int i14) {
        zoijcleaowVar.f21930wflxmlrfwp = i14;
        this.f21907iobyxmoadg.wflxmlrfwp(zoijcleaowVar);
        zoijcleaowVar.f21928rgvfuqvkyq = i13;
        list.add(zoijcleaowVar);
    }

    private int iozdgvuglv(FlexItem flexItem, boolean z13) {
        return z13 ? flexItem.getHeight() : flexItem.getWidth();
    }

    private int istkbnxepw(FlexItem flexItem, boolean z13) {
        return z13 ? flexItem.Y() : flexItem.w();
    }

    private void iwizpuwonk(int i13, int i14, com.google.android.flexbox.zoijcleaow zoijcleaowVar, int i15, int i16, boolean z13) {
        int i17;
        int i18;
        int iMax;
        double d13;
        int i19;
        double d14;
        float f13 = zoijcleaowVar.f21916btonecajqb;
        float f14 = 0.0f;
        if (f13 <= 0.0f || i15 < (i17 = zoijcleaowVar.f21919eablkybsjg)) {
            return;
        }
        float f15 = (i15 - i17) / f13;
        zoijcleaowVar.f21919eablkybsjg = i16 + zoijcleaowVar.f21921gxszxtbevo;
        if (!z13) {
            zoijcleaowVar.f21923lqeggnwhkg = Integer.MIN_VALUE;
        }
        int i23 = 0;
        boolean z14 = false;
        int i24 = 0;
        float f16 = 0.0f;
        while (i23 < zoijcleaowVar.f21924nufgyqmvbu) {
            int i25 = zoijcleaowVar.f21925ojitshcjhn + i23;
            View viewAgtfadlqog = this.f21907iobyxmoadg.agtfadlqog(i25);
            if (viewAgtfadlqog == null || viewAgtfadlqog.getVisibility() == 8) {
                i18 = i17;
            } else {
                FlexItem flexItem = (FlexItem) viewAgtfadlqog.getLayoutParams();
                int flexDirection = this.f21907iobyxmoadg.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int i26 = i17;
                    int measuredWidth = viewAgtfadlqog.getMeasuredWidth();
                    long[] jArr = this.f21906eablkybsjg;
                    if (jArr != null) {
                        measuredWidth = esjtqupxsv(jArr[i25]);
                    }
                    int measuredHeight = viewAgtfadlqog.getMeasuredHeight();
                    long[] jArr2 = this.f21906eablkybsjg;
                    i18 = i26;
                    if (jArr2 != null) {
                        measuredHeight = cqumvgiudr(jArr2[i25]);
                    }
                    if (!this.f21910zoijcleaow[i25] && flexItem.iyctptxqzt() > 0.0f) {
                        float fIyctptxqzt = measuredWidth + (flexItem.iyctptxqzt() * f15);
                        if (i23 == zoijcleaowVar.f21924nufgyqmvbu - 1) {
                            fIyctptxqzt += f16;
                            f16 = 0.0f;
                        }
                        int iRound = Math.round(fIyctptxqzt);
                        if (iRound > flexItem.ezmngbhpjk()) {
                            iRound = flexItem.ezmngbhpjk();
                            this.f21910zoijcleaow[i25] = true;
                            zoijcleaowVar.f21916btonecajqb -= flexItem.iyctptxqzt();
                            z14 = true;
                        } else {
                            f16 += fIyctptxqzt - iRound;
                            double d15 = f16;
                            if (d15 > 1.0d) {
                                iRound++;
                                d13 = d15 - 1.0d;
                            } else if (d15 < -1.0d) {
                                iRound--;
                                d13 = d15 + 1.0d;
                            }
                            f16 = (float) d13;
                        }
                        int iLereixgezr = lereixgezr(i14, flexItem, zoijcleaowVar.f21930wflxmlrfwp);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewAgtfadlqog.measure(iMakeMeasureSpec, iLereixgezr);
                        int measuredWidth2 = viewAgtfadlqog.getMeasuredWidth();
                        int measuredHeight2 = viewAgtfadlqog.getMeasuredHeight();
                        ribwqtqdhb(i25, iMakeMeasureSpec, iLereixgezr, viewAgtfadlqog);
                        this.f21907iobyxmoadg.ojitshcjhn(i25, viewAgtfadlqog);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i24, measuredHeight + flexItem.czzsidtyhn() + flexItem.w() + this.f21907iobyxmoadg.draadjrbmk(viewAgtfadlqog));
                    zoijcleaowVar.f21919eablkybsjg += measuredWidth + flexItem.z() + flexItem.Y();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewAgtfadlqog.getMeasuredHeight();
                    long[] jArr3 = this.f21906eablkybsjg;
                    if (jArr3 != null) {
                        measuredHeight3 = cqumvgiudr(jArr3[i25]);
                    }
                    int measuredWidth3 = viewAgtfadlqog.getMeasuredWidth();
                    long[] jArr4 = this.f21906eablkybsjg;
                    if (jArr4 != null) {
                        measuredWidth3 = esjtqupxsv(jArr4[i25]);
                    }
                    if (this.f21910zoijcleaow[i25] || flexItem.iyctptxqzt() <= f14) {
                        i19 = i17;
                    } else {
                        float fIyctptxqzt2 = measuredHeight3 + (flexItem.iyctptxqzt() * f15);
                        if (i23 == zoijcleaowVar.f21924nufgyqmvbu - 1) {
                            fIyctptxqzt2 += f16;
                            f16 = f14;
                        }
                        int iRound2 = Math.round(fIyctptxqzt2);
                        if (iRound2 > flexItem.g0()) {
                            iRound2 = flexItem.g0();
                            this.f21910zoijcleaow[i25] = true;
                            zoijcleaowVar.f21916btonecajqb -= flexItem.iyctptxqzt();
                            i19 = i17;
                            z14 = true;
                        } else {
                            f16 += fIyctptxqzt2 - iRound2;
                            i19 = i17;
                            double d16 = f16;
                            if (d16 > 1.0d) {
                                iRound2++;
                                d14 = d16 - 1.0d;
                            } else if (d16 < -1.0d) {
                                iRound2--;
                                d14 = d16 + 1.0d;
                            }
                            f16 = (float) d14;
                        }
                        int iPmvmpeiblj = pmvmpeiblj(i13, flexItem, zoijcleaowVar.f21930wflxmlrfwp);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewAgtfadlqog.measure(iPmvmpeiblj, iMakeMeasureSpec2);
                        measuredWidth3 = viewAgtfadlqog.getMeasuredWidth();
                        int measuredHeight4 = viewAgtfadlqog.getMeasuredHeight();
                        ribwqtqdhb(i25, iPmvmpeiblj, iMakeMeasureSpec2, viewAgtfadlqog);
                        this.f21907iobyxmoadg.ojitshcjhn(i25, viewAgtfadlqog);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i24, measuredWidth3 + flexItem.z() + flexItem.Y() + this.f21907iobyxmoadg.draadjrbmk(viewAgtfadlqog));
                    zoijcleaowVar.f21919eablkybsjg += measuredHeight3 + flexItem.czzsidtyhn() + flexItem.w();
                    i18 = i19;
                }
                zoijcleaowVar.f21923lqeggnwhkg = Math.max(zoijcleaowVar.f21923lqeggnwhkg, iMax);
                i24 = iMax;
            }
            i23++;
            i17 = i18;
            f14 = 0.0f;
        }
        int i27 = i17;
        if (!z14 || i27 == zoijcleaowVar.f21919eablkybsjg) {
            return;
        }
        iwizpuwonk(i13, i14, zoijcleaowVar, i15, i16, true);
    }

    private int jpowsppfya(View view, boolean z13) {
        return z13 ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private void jyumaefscl(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int iUlzqkzuiru = flexItem.ulzqkzuiru();
        int iA0 = flexItem.a0();
        Drawable drawableIobyxmoadg = androidx.core.widget.ppxfxbqfkf.iobyxmoadg(compoundButton);
        int minimumWidth = drawableIobyxmoadg == null ? 0 : drawableIobyxmoadg.getMinimumWidth();
        int minimumHeight = drawableIobyxmoadg != null ? drawableIobyxmoadg.getMinimumHeight() : 0;
        if (iUlzqkzuiru == -1) {
            iUlzqkzuiru = minimumWidth;
        }
        flexItem.v(iUlzqkzuiru);
        if (iA0 == -1) {
            iA0 = minimumHeight;
        }
        flexItem.zfvoamnweg(iA0);
    }

    private int lereixgezr(int i13, FlexItem flexItem, int i14) {
        com.google.android.flexbox.iobyxmoadg iobyxmoadgVar = this.f21907iobyxmoadg;
        int iGtknphoqwx = iobyxmoadgVar.gtknphoqwx(i13, iobyxmoadgVar.getPaddingTop() + this.f21907iobyxmoadg.getPaddingBottom() + flexItem.czzsidtyhn() + flexItem.w() + i14, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(iGtknphoqwx);
        if (size > flexItem.g0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.g0(), View.MeasureSpec.getMode(iGtknphoqwx));
        }
        return size < flexItem.a0() ? View.MeasureSpec.makeMeasureSpec(flexItem.a0(), View.MeasureSpec.getMode(iGtknphoqwx)) : iGtknphoqwx;
    }

    private int lmojexxdyd(FlexItem flexItem, boolean z13) {
        return z13 ? flexItem.getWidth() : flexItem.getHeight();
    }

    private void mbcevpiqjq(int i13, int i14, com.google.android.flexbox.zoijcleaow zoijcleaowVar, int i15, int i16, boolean z13) {
        int i17;
        int i18;
        int iMax;
        int i19 = zoijcleaowVar.f21919eablkybsjg;
        float f13 = zoijcleaowVar.f21920gtknphoqwx;
        float f14 = 0.0f;
        if (f13 <= 0.0f || i15 > i19) {
            return;
        }
        float f15 = (i19 - i15) / f13;
        zoijcleaowVar.f21919eablkybsjg = i16 + zoijcleaowVar.f21921gxszxtbevo;
        if (!z13) {
            zoijcleaowVar.f21923lqeggnwhkg = Integer.MIN_VALUE;
        }
        int i23 = 0;
        boolean z14 = false;
        int i24 = 0;
        float f16 = 0.0f;
        while (i23 < zoijcleaowVar.f21924nufgyqmvbu) {
            int i25 = zoijcleaowVar.f21925ojitshcjhn + i23;
            View viewAgtfadlqog = this.f21907iobyxmoadg.agtfadlqog(i25);
            if (viewAgtfadlqog == null || viewAgtfadlqog.getVisibility() == 8) {
                i17 = i19;
                i18 = i23;
            } else {
                FlexItem flexItem = (FlexItem) viewAgtfadlqog.getLayoutParams();
                int flexDirection = this.f21907iobyxmoadg.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i17 = i19;
                    int i26 = i23;
                    int measuredWidth = viewAgtfadlqog.getMeasuredWidth();
                    long[] jArr = this.f21906eablkybsjg;
                    if (jArr != null) {
                        measuredWidth = esjtqupxsv(jArr[i25]);
                    }
                    int measuredHeight = viewAgtfadlqog.getMeasuredHeight();
                    long[] jArr2 = this.f21906eablkybsjg;
                    if (jArr2 != null) {
                        measuredHeight = cqumvgiudr(jArr2[i25]);
                    }
                    if (this.f21910zoijcleaow[i25] || flexItem.dsvhmnatus() <= 0.0f) {
                        i18 = i26;
                    } else {
                        float fDsvhmnatus = measuredWidth - (flexItem.dsvhmnatus() * f15);
                        if (i18 == zoijcleaowVar.f21924nufgyqmvbu - 1) {
                            i18 = i26;
                            fDsvhmnatus += f16;
                            f16 = 0.0f;
                        }
                        i18 = i26;
                        int iRound = Math.round(fDsvhmnatus);
                        if (iRound < flexItem.ulzqkzuiru()) {
                            iRound = flexItem.ulzqkzuiru();
                            this.f21910zoijcleaow[i25] = true;
                            zoijcleaowVar.f21920gtknphoqwx -= flexItem.dsvhmnatus();
                            z14 = true;
                        } else {
                            f16 += fDsvhmnatus - iRound;
                            double d13 = f16;
                            if (d13 > 1.0d) {
                                iRound++;
                                f16 -= 1.0f;
                            } else if (d13 < -1.0d) {
                                iRound--;
                                f16 += 1.0f;
                            }
                        }
                        int iLereixgezr = lereixgezr(i14, flexItem, zoijcleaowVar.f21930wflxmlrfwp);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewAgtfadlqog.measure(iMakeMeasureSpec, iLereixgezr);
                        int measuredWidth2 = viewAgtfadlqog.getMeasuredWidth();
                        int measuredHeight2 = viewAgtfadlqog.getMeasuredHeight();
                        ribwqtqdhb(i25, iMakeMeasureSpec, iLereixgezr, viewAgtfadlqog);
                        this.f21907iobyxmoadg.ojitshcjhn(i25, viewAgtfadlqog);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i24, measuredHeight + flexItem.czzsidtyhn() + flexItem.w() + this.f21907iobyxmoadg.draadjrbmk(viewAgtfadlqog));
                    zoijcleaowVar.f21919eablkybsjg += measuredWidth + flexItem.z() + flexItem.Y();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewAgtfadlqog.getMeasuredHeight();
                    long[] jArr3 = this.f21906eablkybsjg;
                    if (jArr3 != null) {
                        measuredHeight3 = cqumvgiudr(jArr3[i25]);
                    }
                    int measuredWidth3 = viewAgtfadlqog.getMeasuredWidth();
                    long[] jArr4 = this.f21906eablkybsjg;
                    if (jArr4 != null) {
                        measuredWidth3 = esjtqupxsv(jArr4[i25]);
                    }
                    if (this.f21910zoijcleaow[i25] || flexItem.dsvhmnatus() <= f14) {
                        i17 = i19;
                        i18 = i23;
                    } else {
                        float fDsvhmnatus2 = measuredHeight3 - (flexItem.dsvhmnatus() * f15);
                        if (i23 == zoijcleaowVar.f21924nufgyqmvbu - 1) {
                            fDsvhmnatus2 += f16;
                            f16 = f14;
                        }
                        int iRound2 = Math.round(fDsvhmnatus2);
                        if (iRound2 < flexItem.a0()) {
                            iRound2 = flexItem.a0();
                            this.f21910zoijcleaow[i25] = true;
                            zoijcleaowVar.f21920gtknphoqwx -= flexItem.dsvhmnatus();
                            i17 = i19;
                            i18 = i23;
                            z14 = true;
                        } else {
                            f16 += fDsvhmnatus2 - iRound2;
                            i17 = i19;
                            i18 = i23;
                            double d14 = f16;
                            if (d14 > 1.0d) {
                                iRound2++;
                                f16 -= 1.0f;
                            } else if (d14 < -1.0d) {
                                iRound2--;
                                f16 += 1.0f;
                            }
                        }
                        int iPmvmpeiblj = pmvmpeiblj(i13, flexItem, zoijcleaowVar.f21930wflxmlrfwp);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewAgtfadlqog.measure(iPmvmpeiblj, iMakeMeasureSpec2);
                        measuredWidth3 = viewAgtfadlqog.getMeasuredWidth();
                        int measuredHeight4 = viewAgtfadlqog.getMeasuredHeight();
                        ribwqtqdhb(i25, iPmvmpeiblj, iMakeMeasureSpec2, viewAgtfadlqog);
                        this.f21907iobyxmoadg.ojitshcjhn(i25, viewAgtfadlqog);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i24, measuredWidth3 + flexItem.z() + flexItem.Y() + this.f21907iobyxmoadg.draadjrbmk(viewAgtfadlqog));
                    zoijcleaowVar.f21919eablkybsjg += measuredHeight3 + flexItem.czzsidtyhn() + flexItem.w();
                }
                zoijcleaowVar.f21923lqeggnwhkg = Math.max(zoijcleaowVar.f21923lqeggnwhkg, iMax);
                i24 = iMax;
            }
            i23 = i18 + 1;
            i19 = i17;
            f14 = 0.0f;
        }
        int i27 = i19;
        if (!z14 || i27 == zoijcleaowVar.f21919eablkybsjg) {
            return;
        }
        mbcevpiqjq(i13, i14, zoijcleaowVar, i15, i16, true);
    }

    private int[] ntlheqmsrt(int i13, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i13];
        Iterator it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            C0394ppxfxbqfkf c0394ppxfxbqfkf = (C0394ppxfxbqfkf) it.next();
            int i15 = c0394ppxfxbqfkf.f21912zdlpuopuiu;
            iArr[i14] = i15;
            sparseIntArray.append(i15, c0394ppxfxbqfkf.f21911yggfygwlhe);
            i14++;
        }
        return iArr;
    }

    private void oxmwwwfdhm(int i13) {
        boolean[] zArr = this.f21910zoijcleaow;
        if (zArr == null) {
            this.f21910zoijcleaow = new boolean[Math.max(i13, 10)];
        } else if (zArr.length < i13) {
            this.f21910zoijcleaow = new boolean[Math.max(zArr.length * 2, i13)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private int pkzmftpjix(boolean z13) {
        return z13 ? this.f21907iobyxmoadg.getPaddingTop() : this.f21907iobyxmoadg.getPaddingStart();
    }

    private int pmvmpeiblj(int i13, FlexItem flexItem, int i14) {
        com.google.android.flexbox.iobyxmoadg iobyxmoadgVar = this.f21907iobyxmoadg;
        int iLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg(i13, iobyxmoadgVar.getPaddingLeft() + this.f21907iobyxmoadg.getPaddingRight() + flexItem.z() + flexItem.Y() + i14, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(iLqeggnwhkg);
        if (size > flexItem.ezmngbhpjk()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.ezmngbhpjk(), View.MeasureSpec.getMode(iLqeggnwhkg));
        }
        return size < flexItem.ulzqkzuiru() ? View.MeasureSpec.makeMeasureSpec(flexItem.ulzqkzuiru(), View.MeasureSpec.getMode(iLqeggnwhkg)) : iLqeggnwhkg;
    }

    private void ribwqtqdhb(int i13, int i14, int i15, View view) {
        long[] jArr = this.f21909wkgbmnqykc;
        if (jArr != null) {
            jArr[i13] = tzroggbefp(i14, i15);
        }
        long[] jArr2 = this.f21906eablkybsjg;
        if (jArr2 != null) {
            jArr2[i13] = tzroggbefp(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void sopmlzcsov(View view, int i13, int i14) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i13 - flexItem.czzsidtyhn()) - flexItem.w()) - this.f21907iobyxmoadg.draadjrbmk(view), flexItem.a0()), flexItem.g0());
        long[] jArr = this.f21906eablkybsjg;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? esjtqupxsv(jArr[i14]) : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        ribwqtqdhb(i14, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.f21907iobyxmoadg.ojitshcjhn(i14, view);
    }

    private void ulzqkzuiru(View view, int i13, int i14) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i13 - flexItem.z()) - flexItem.Y()) - this.f21907iobyxmoadg.draadjrbmk(view), flexItem.ulzqkzuiru()), flexItem.ezmngbhpjk());
        long[] jArr = this.f21906eablkybsjg;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? cqumvgiudr(jArr[i14]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        ribwqtqdhb(i14, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.f21907iobyxmoadg.ojitshcjhn(i14, view);
    }

    private int wwaezpbzkn(boolean z13) {
        return z13 ? this.f21907iobyxmoadg.getPaddingBottom() : this.f21907iobyxmoadg.getPaddingEnd();
    }

    private boolean wypolnanlu(View view, int i13, int i14, int i15, int i16, FlexItem flexItem, int i17, int i18, int i19) {
        if (this.f21907iobyxmoadg.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.hszhottldk()) {
            return true;
        }
        if (i13 == 0) {
            return false;
        }
        int maxLine = this.f21907iobyxmoadg.getMaxLine();
        if (maxLine != -1 && maxLine <= i19 + 1) {
            return false;
        }
        int iRgvfuqvkyq = this.f21907iobyxmoadg.rgvfuqvkyq(view, i17, i18);
        if (iRgvfuqvkyq > 0) {
            i16 += iRgvfuqvkyq;
        }
        return i14 < i15 + i16;
    }

    private int yadqdtsiqt(FlexItem flexItem, boolean z13) {
        return z13 ? flexItem.z() : flexItem.czzsidtyhn();
    }

    private int ylkuphrtab(boolean z13) {
        return z13 ? this.f21907iobyxmoadg.getPaddingEnd() : this.f21907iobyxmoadg.getPaddingBottom();
    }

    private int zynmafqrjb(FlexItem flexItem, boolean z13) {
        return z13 ? flexItem.w() : flexItem.Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] agtfadlqog(View view, int i13, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f21907iobyxmoadg.getFlexItemCount();
        List listDraadjrbmk = draadjrbmk(flexItemCount);
        C0394ppxfxbqfkf c0394ppxfxbqfkf = new C0394ppxfxbqfkf();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            c0394ppxfxbqfkf.f21911yggfygwlhe = 1;
        } else {
            c0394ppxfxbqfkf.f21911yggfygwlhe = ((FlexItem) layoutParams).getOrder();
        }
        if (i13 == -1 || i13 == flexItemCount || i13 >= this.f21907iobyxmoadg.getFlexItemCount()) {
            c0394ppxfxbqfkf.f21912zdlpuopuiu = flexItemCount;
        } else {
            c0394ppxfxbqfkf.f21912zdlpuopuiu = i13;
            while (i13 < flexItemCount) {
                ((C0394ppxfxbqfkf) listDraadjrbmk.get(i13)).f21912zdlpuopuiu++;
                i13++;
            }
        }
        listDraadjrbmk.add(c0394ppxfxbqfkf);
        return ntlheqmsrt(flexItemCount + 1, listDraadjrbmk, sparseIntArray);
    }

    void btonecajqb(List list, int i13) {
        int i14 = this.f21908ppxfxbqfkf[i13];
        if (i14 == -1) {
            i14 = 0;
        }
        if (list.size() > i14) {
            list.subList(i14, list.size()).clear();
        }
        int[] iArr = this.f21908ppxfxbqfkf;
        int length = iArr.length - 1;
        if (i13 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i13, length, -1);
        }
        long[] jArr = this.f21909wkgbmnqykc;
        int length2 = jArr.length - 1;
        if (i13 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i13, length2, 0L);
        }
    }

    int cqumvgiudr(long j13) {
        return (int) (j13 >> 32);
    }

    void crxdokpmqz() {
        jlmebxxoox(0);
    }

    boolean dsvhmnatus(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f21907iobyxmoadg.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i13 = 0; i13 < flexItemCount; i13++) {
            View viewDxjokdxxww = this.f21907iobyxmoadg.dxjokdxxww(i13);
            if (viewDxjokdxxww != null && ((FlexItem) viewDxjokdxxww.getLayoutParams()).getOrder() != sparseIntArray.get(i13)) {
                return true;
            }
        }
        return false;
    }

    void eablkybsjg(zoijcleaow zoijcleaowVar, int i13, int i14, int i15, int i16, List list) {
        zoijcleaow(zoijcleaowVar, i13, i14, i15, 0, i16, list);
    }

    int esjtqupxsv(long j13) {
        return (int) j13;
    }

    void gxszxtbevo(zoijcleaow zoijcleaowVar, int i13, int i14) {
        zoijcleaow(zoijcleaowVar, i14, i13, Integer.MAX_VALUE, 0, -1, null);
    }

    void jlmebxxoox(int i13) {
        View viewAgtfadlqog;
        if (i13 >= this.f21907iobyxmoadg.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f21907iobyxmoadg.getFlexDirection();
        if (this.f21907iobyxmoadg.getAlignItems() != 4) {
            for (com.google.android.flexbox.zoijcleaow zoijcleaowVar : this.f21907iobyxmoadg.getFlexLinesInternal()) {
                for (Integer num : zoijcleaowVar.f21915agtfadlqog) {
                    View viewAgtfadlqog2 = this.f21907iobyxmoadg.agtfadlqog(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        sopmlzcsov(viewAgtfadlqog2, zoijcleaowVar.f21923lqeggnwhkg, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                        ulzqkzuiru(viewAgtfadlqog2, zoijcleaowVar.f21923lqeggnwhkg, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f21908ppxfxbqfkf;
        List flexLinesInternal = this.f21907iobyxmoadg.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i14 = iArr != null ? iArr[i13] : 0; i14 < size; i14++) {
            com.google.android.flexbox.zoijcleaow zoijcleaowVar2 = (com.google.android.flexbox.zoijcleaow) flexLinesInternal.get(i14);
            int i15 = zoijcleaowVar2.f21924nufgyqmvbu;
            for (int i16 = 0; i16 < i15; i16++) {
                int i17 = zoijcleaowVar2.f21925ojitshcjhn + i16;
                if (i16 < this.f21907iobyxmoadg.getFlexItemCount() && (viewAgtfadlqog = this.f21907iobyxmoadg.agtfadlqog(i17)) != null && viewAgtfadlqog.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewAgtfadlqog.getLayoutParams();
                    if (flexItem.hkdspvbjdz() == -1 || flexItem.hkdspvbjdz() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            sopmlzcsov(viewAgtfadlqog, zoijcleaowVar2.f21923lqeggnwhkg, i17);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            }
                            ulzqkzuiru(viewAgtfadlqog, zoijcleaowVar2.f21923lqeggnwhkg, i17);
                        }
                    }
                }
            }
        }
    }

    void kcexrzcfyt(int i13) {
        int[] iArr = this.f21908ppxfxbqfkf;
        if (iArr == null) {
            this.f21908ppxfxbqfkf = new int[Math.max(i13, 10)];
        } else if (iArr.length < i13) {
            this.f21908ppxfxbqfkf = Arrays.copyOf(this.f21908ppxfxbqfkf, Math.max(iArr.length * 2, i13));
        }
    }

    void kegysxyocb(View view, com.google.android.flexbox.zoijcleaow zoijcleaowVar, boolean z13, int i13, int i14, int i15, int i16) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f21907iobyxmoadg.getAlignItems();
        if (flexItem.hkdspvbjdz() != -1) {
            alignItems = flexItem.hkdspvbjdz();
        }
        int i17 = zoijcleaowVar.f21923lqeggnwhkg;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z13) {
                    view.layout((i13 - i17) + view.getMeasuredWidth() + flexItem.z(), i14, (i15 - i17) + view.getMeasuredWidth() + flexItem.z(), i16);
                    return;
                } else {
                    view.layout(((i13 + i17) - view.getMeasuredWidth()) - flexItem.Y(), i14, ((i15 + i17) - view.getMeasuredWidth()) - flexItem.Y(), i16);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i17 - view.getMeasuredWidth()) + iwizpuwonk.zoijcleaow(marginLayoutParams)) - iwizpuwonk.iobyxmoadg(marginLayoutParams)) / 2;
                if (z13) {
                    view.layout(i13 - measuredWidth, i14, i15 - measuredWidth, i16);
                    return;
                } else {
                    view.layout(i13 + measuredWidth, i14, i15 + measuredWidth, i16);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z13) {
            view.layout(i13 - flexItem.Y(), i14, i15 - flexItem.Y(), i16);
        } else {
            view.layout(i13 + flexItem.z(), i14, i15 + flexItem.z(), i16);
        }
    }

    void lqeggnwhkg(zoijcleaow zoijcleaowVar, int i13, int i14, int i15, int i16, List list) {
        zoijcleaow(zoijcleaowVar, i14, i13, i15, i16, -1, list);
    }

    void nufgyqmvbu(zoijcleaow zoijcleaowVar, int i13, int i14, int i15, int i16, List list) {
        zoijcleaow(zoijcleaowVar, i14, i13, i15, 0, i16, list);
    }

    void ojitshcjhn(int i13, int i14, int i15) {
        int mode;
        int size;
        int flexDirection = this.f21907iobyxmoadg.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i14);
            int size2 = View.MeasureSpec.getSize(i14);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            mode = View.MeasureSpec.getMode(i13);
            size = View.MeasureSpec.getSize(i13);
        }
        List<com.google.android.flexbox.zoijcleaow> flexLinesInternal = this.f21907iobyxmoadg.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.f21907iobyxmoadg.getSumOfCrossSize() + i15;
            int i16 = 0;
            if (flexLinesInternal.size() == 1) {
                ((com.google.android.flexbox.zoijcleaow) flexLinesInternal.get(0)).f21923lqeggnwhkg = size - i15;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f21907iobyxmoadg.getAlignContent();
                if (alignContent == 1) {
                    int i17 = size - sumOfCrossSize;
                    com.google.android.flexbox.zoijcleaow zoijcleaowVar = new com.google.android.flexbox.zoijcleaow();
                    zoijcleaowVar.f21923lqeggnwhkg = i17;
                    flexLinesInternal.add(0, zoijcleaowVar);
                    return;
                }
                if (alignContent == 2) {
                    this.f21907iobyxmoadg.setFlexLines(gtknphoqwx(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f13 = 0.0f;
                    while (i16 < size4) {
                        arrayList.add((com.google.android.flexbox.zoijcleaow) flexLinesInternal.get(i16));
                        if (i16 != flexLinesInternal.size() - 1) {
                            com.google.android.flexbox.zoijcleaow zoijcleaowVar2 = new com.google.android.flexbox.zoijcleaow();
                            if (i16 == flexLinesInternal.size() - 2) {
                                zoijcleaowVar2.f21923lqeggnwhkg = Math.round(f13 + size3);
                                f13 = 0.0f;
                            } else {
                                zoijcleaowVar2.f21923lqeggnwhkg = Math.round(size3);
                            }
                            int i18 = zoijcleaowVar2.f21923lqeggnwhkg;
                            f13 += size3 - i18;
                            if (f13 > 1.0f) {
                                zoijcleaowVar2.f21923lqeggnwhkg = i18 + 1;
                                f13 -= 1.0f;
                            } else if (f13 < -1.0f) {
                                zoijcleaowVar2.f21923lqeggnwhkg = i18 - 1;
                                f13 += 1.0f;
                            }
                            arrayList.add(zoijcleaowVar2);
                        }
                        i16++;
                    }
                    this.f21907iobyxmoadg.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.f21907iobyxmoadg.setFlexLines(gtknphoqwx(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.google.android.flexbox.zoijcleaow zoijcleaowVar3 = new com.google.android.flexbox.zoijcleaow();
                    zoijcleaowVar3.f21923lqeggnwhkg = size5;
                    for (com.google.android.flexbox.zoijcleaow zoijcleaowVar4 : flexLinesInternal) {
                        arrayList2.add(zoijcleaowVar3);
                        arrayList2.add(zoijcleaowVar4);
                        arrayList2.add(zoijcleaowVar3);
                    }
                    this.f21907iobyxmoadg.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f14 = 0.0f;
                    while (i16 < size7) {
                        com.google.android.flexbox.zoijcleaow zoijcleaowVar5 = (com.google.android.flexbox.zoijcleaow) flexLinesInternal.get(i16);
                        float f15 = zoijcleaowVar5.f21923lqeggnwhkg + size6;
                        if (i16 == flexLinesInternal.size() - 1) {
                            f15 += f14;
                            f14 = 0.0f;
                        }
                        int iRound = Math.round(f15);
                        f14 += f15 - iRound;
                        if (f14 > 1.0f) {
                            iRound++;
                            f14 -= 1.0f;
                        } else if (f14 < -1.0f) {
                            iRound--;
                            f14 += 1.0f;
                        }
                        zoijcleaowVar5.f21923lqeggnwhkg = iRound;
                        i16++;
                    }
                }
            }
        }
    }

    void ppxfxbqfkf(zoijcleaow zoijcleaowVar, int i13, int i14) {
        zoijcleaow(zoijcleaowVar, i13, i14, Integer.MAX_VALUE, 0, -1, null);
    }

    void rgvfuqvkyq(int i13, int i14) {
        vdvldrhtss(i13, i14, 0);
    }

    void stevsuqkhv(View view, com.google.android.flexbox.zoijcleaow zoijcleaowVar, int i13, int i14, int i15, int i16) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f21907iobyxmoadg.getAlignItems();
        if (flexItem.hkdspvbjdz() != -1) {
            alignItems = flexItem.hkdspvbjdz();
        }
        int i17 = zoijcleaowVar.f21923lqeggnwhkg;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.f21907iobyxmoadg.getFlexWrap() == 2) {
                    view.layout(i13, (i14 - i17) + view.getMeasuredHeight() + flexItem.czzsidtyhn(), i15, (i16 - i17) + view.getMeasuredHeight() + flexItem.czzsidtyhn());
                    return;
                } else {
                    int i18 = i14 + i17;
                    view.layout(i13, (i18 - view.getMeasuredHeight()) - flexItem.w(), i15, i18 - flexItem.w());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i17 - view.getMeasuredHeight()) + flexItem.czzsidtyhn()) - flexItem.w()) / 2;
                if (this.f21907iobyxmoadg.getFlexWrap() != 2) {
                    int i19 = i14 + measuredHeight;
                    view.layout(i13, i19, i15, view.getMeasuredHeight() + i19);
                    return;
                } else {
                    int i23 = i14 - measuredHeight;
                    view.layout(i13, i23, i15, view.getMeasuredHeight() + i23);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.f21907iobyxmoadg.getFlexWrap() != 2) {
                    int iMax = Math.max(zoijcleaowVar.f21917draadjrbmk - view.getBaseline(), flexItem.czzsidtyhn());
                    view.layout(i13, i14 + iMax, i15, i16 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((zoijcleaowVar.f21917draadjrbmk - view.getMeasuredHeight()) + view.getBaseline(), flexItem.w());
                    view.layout(i13, i14 - iMax2, i15, i16 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.f21907iobyxmoadg.getFlexWrap() != 2) {
            view.layout(i13, i14 + flexItem.czzsidtyhn(), i15, i16 + flexItem.czzsidtyhn());
        } else {
            view.layout(i13, i14 - flexItem.w(), i15, i16 - flexItem.w());
        }
    }

    long tzroggbefp(int i13, int i14) {
        return (((long) i13) & 4294967295L) | (((long) i14) << 32);
    }

    void vdvldrhtss(int i13, int i14, int i15) {
        int size;
        int paddingLeft;
        int paddingRight;
        oxmwwwfdhm(this.f21907iobyxmoadg.getFlexItemCount());
        if (i15 >= this.f21907iobyxmoadg.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f21907iobyxmoadg.getFlexDirection();
        int flexDirection2 = this.f21907iobyxmoadg.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i13);
            size = View.MeasureSpec.getSize(i13);
            int largestMainSize = this.f21907iobyxmoadg.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.f21907iobyxmoadg.getPaddingLeft();
            paddingRight = this.f21907iobyxmoadg.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode2 = View.MeasureSpec.getMode(i14);
            size = View.MeasureSpec.getSize(i14);
            if (mode2 != 1073741824) {
                size = this.f21907iobyxmoadg.getLargestMainSize();
            }
            paddingLeft = this.f21907iobyxmoadg.getPaddingTop();
            paddingRight = this.f21907iobyxmoadg.getPaddingBottom();
        }
        int i16 = paddingLeft + paddingRight;
        int[] iArr = this.f21908ppxfxbqfkf;
        List flexLinesInternal = this.f21907iobyxmoadg.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i17 = iArr != null ? iArr[i15] : 0; i17 < size2; i17++) {
            com.google.android.flexbox.zoijcleaow zoijcleaowVar = (com.google.android.flexbox.zoijcleaow) flexLinesInternal.get(i17);
            int i18 = zoijcleaowVar.f21919eablkybsjg;
            if (i18 < size && zoijcleaowVar.f21929vdvldrhtss) {
                iwizpuwonk(i13, i14, zoijcleaowVar, size, i16, false);
            } else if (i18 > size && zoijcleaowVar.f21926oxmwwwfdhm) {
                mbcevpiqjq(i13, i14, zoijcleaowVar, size, i16, false);
            }
        }
    }

    int[] wflxmlrfwp(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f21907iobyxmoadg.getFlexItemCount();
        return ntlheqmsrt(flexItemCount, draadjrbmk(flexItemCount), sparseIntArray);
    }

    void wkgbmnqykc(zoijcleaow zoijcleaowVar, int i13, int i14, int i15, int i16, List list) {
        zoijcleaow(zoijcleaowVar, i13, i14, i15, i16, -1, list);
    }

    void yggfygwlhe(int i13) {
        long[] jArr = this.f21906eablkybsjg;
        if (jArr == null) {
            this.f21906eablkybsjg = new long[Math.max(i13, 10)];
        } else if (jArr.length < i13) {
            this.f21906eablkybsjg = Arrays.copyOf(this.f21906eablkybsjg, Math.max(jArr.length * 2, i13));
        }
    }

    void zdlpuopuiu(int i13) {
        long[] jArr = this.f21909wkgbmnqykc;
        if (jArr == null) {
            this.f21909wkgbmnqykc = new long[Math.max(i13, 10)];
        } else if (jArr.length < i13) {
            this.f21909wkgbmnqykc = Arrays.copyOf(this.f21909wkgbmnqykc, Math.max(jArr.length * 2, i13));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void zoijcleaow(zoijcleaow zoijcleaowVar, int i13, int i14, int i15, int i16, int i17, List list) {
        int i18;
        int i19;
        List list2;
        int i23;
        int i24;
        View view;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i33;
        int i34;
        int i35 = i14;
        int i36 = i17;
        boolean zVdvldrhtss = this.f21907iobyxmoadg.vdvldrhtss();
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        List arrayList = list == null ? new ArrayList() : list;
        zoijcleaowVar.f21913iobyxmoadg = arrayList;
        int i37 = i36 == -1 ? 1 : 0;
        int iHcddaimhww = hcddaimhww(zVdvldrhtss);
        int iYlkuphrtab = ylkuphrtab(zVdvldrhtss);
        int iPkzmftpjix = pkzmftpjix(zVdvldrhtss);
        int iWwaezpbzkn = wwaezpbzkn(zVdvldrhtss);
        com.google.android.flexbox.zoijcleaow zoijcleaowVar2 = new com.google.android.flexbox.zoijcleaow();
        int i38 = i16;
        zoijcleaowVar2.f21925ojitshcjhn = i38;
        int i39 = iYlkuphrtab + iHcddaimhww;
        zoijcleaowVar2.f21919eablkybsjg = i39;
        int flexItemCount = this.f21907iobyxmoadg.getFlexItemCount();
        int i43 = i37;
        int i44 = Integer.MIN_VALUE;
        int i45 = 0;
        int iCombineMeasuredStates = 0;
        int i46 = 0;
        while (i38 < flexItemCount) {
            View viewAgtfadlqog = this.f21907iobyxmoadg.agtfadlqog(i38);
            if (viewAgtfadlqog != null) {
                if (viewAgtfadlqog.getVisibility() == 8) {
                    zoijcleaowVar2.f21918dxjokdxxww++;
                    zoijcleaowVar2.f21924nufgyqmvbu++;
                    if (cllcsxoeiz(i38, flexItemCount, zoijcleaowVar2)) {
                        iobyxmoadg(arrayList, zoijcleaowVar2, i38, i45);
                    }
                } else {
                    if (viewAgtfadlqog instanceof CompoundButton) {
                        jyumaefscl((CompoundButton) viewAgtfadlqog);
                    }
                    FlexItem flexItem = (FlexItem) viewAgtfadlqog.getLayoutParams();
                    int i47 = flexItemCount;
                    if (flexItem.hkdspvbjdz() == 4) {
                        zoijcleaowVar2.f21915agtfadlqog.add(Integer.valueOf(i38));
                    }
                    int iLmojexxdyd = lmojexxdyd(flexItem, zVdvldrhtss);
                    if (flexItem.tbqsvytpvh() != -1.0f && mode == 1073741824) {
                        iLmojexxdyd = Math.round(size * flexItem.tbqsvytpvh());
                    }
                    if (zVdvldrhtss) {
                        int iLqeggnwhkg = this.f21907iobyxmoadg.lqeggnwhkg(i13, i39 + yadqdtsiqt(flexItem, true) + istkbnxepw(flexItem, true), iLmojexxdyd);
                        int iGtknphoqwx = this.f21907iobyxmoadg.gtknphoqwx(i35, iPkzmftpjix + iWwaezpbzkn + cdpycssgdh(flexItem, true) + zynmafqrjb(flexItem, true) + i45, iozdgvuglv(flexItem, true));
                        viewAgtfadlqog.measure(iLqeggnwhkg, iGtknphoqwx);
                        ribwqtqdhb(i38, iLqeggnwhkg, iGtknphoqwx, viewAgtfadlqog);
                        i19 = iLqeggnwhkg;
                    } else {
                        int iLqeggnwhkg2 = this.f21907iobyxmoadg.lqeggnwhkg(i35, iPkzmftpjix + iWwaezpbzkn + cdpycssgdh(flexItem, false) + zynmafqrjb(flexItem, false) + i45, iozdgvuglv(flexItem, false));
                        int iGtknphoqwx2 = this.f21907iobyxmoadg.gtknphoqwx(i13, yadqdtsiqt(flexItem, false) + i39 + istkbnxepw(flexItem, false), iLmojexxdyd);
                        viewAgtfadlqog.measure(iLqeggnwhkg2, iGtknphoqwx2);
                        ribwqtqdhb(i38, iLqeggnwhkg2, iGtknphoqwx2, viewAgtfadlqog);
                        i19 = iGtknphoqwx2;
                    }
                    this.f21907iobyxmoadg.ojitshcjhn(i38, viewAgtfadlqog);
                    dxjokdxxww(viewAgtfadlqog, i38);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewAgtfadlqog.getMeasuredState());
                    int i48 = i45;
                    int i49 = i39;
                    com.google.android.flexbox.zoijcleaow zoijcleaowVar3 = zoijcleaowVar2;
                    int i53 = i38;
                    list2 = arrayList;
                    int i54 = i19;
                    if (wypolnanlu(viewAgtfadlqog, mode, size, zoijcleaowVar2.f21919eablkybsjg, istkbnxepw(flexItem, zVdvldrhtss) + hkdspvbjdz(viewAgtfadlqog, zVdvldrhtss) + yadqdtsiqt(flexItem, zVdvldrhtss), flexItem, i53, i46, arrayList.size())) {
                        if (zoijcleaowVar3.ppxfxbqfkf() > 0) {
                            iobyxmoadg(list2, zoijcleaowVar3, i53 > 0 ? i53 - 1 : 0, i48);
                            i45 = zoijcleaowVar3.f21923lqeggnwhkg + i48;
                        } else {
                            i45 = i48;
                        }
                        if (!zVdvldrhtss) {
                            i23 = i14;
                            i24 = i53;
                            view = viewAgtfadlqog;
                            i25 = -1;
                            if (flexItem.getWidth() == -1) {
                                com.google.android.flexbox.iobyxmoadg iobyxmoadgVar = this.f21907iobyxmoadg;
                                view.measure(iobyxmoadgVar.lqeggnwhkg(i23, iobyxmoadgVar.getPaddingLeft() + this.f21907iobyxmoadg.getPaddingRight() + flexItem.z() + flexItem.Y() + i45, flexItem.getWidth()), i54);
                                dxjokdxxww(view, i24);
                            }
                        } else if (flexItem.getHeight() == -1) {
                            com.google.android.flexbox.iobyxmoadg iobyxmoadgVar2 = this.f21907iobyxmoadg;
                            i23 = i14;
                            i25 = -1;
                            view = viewAgtfadlqog;
                            view.measure(i54, iobyxmoadgVar2.gtknphoqwx(i23, iobyxmoadgVar2.getPaddingTop() + this.f21907iobyxmoadg.getPaddingBottom() + flexItem.czzsidtyhn() + flexItem.w() + i45, flexItem.getHeight()));
                            i24 = i53;
                            dxjokdxxww(view, i24);
                        } else {
                            i23 = i14;
                            i24 = i53;
                            view = viewAgtfadlqog;
                            i25 = -1;
                        }
                        zoijcleaowVar2 = new com.google.android.flexbox.zoijcleaow();
                        i27 = 1;
                        zoijcleaowVar2.f21924nufgyqmvbu = 1;
                        i26 = i49;
                        zoijcleaowVar2.f21919eablkybsjg = i26;
                        zoijcleaowVar2.f21925ojitshcjhn = i24;
                        i29 = Integer.MIN_VALUE;
                        i28 = 0;
                    } else {
                        i23 = i14;
                        i24 = i53;
                        view = viewAgtfadlqog;
                        i25 = -1;
                        zoijcleaowVar2 = zoijcleaowVar3;
                        i26 = i49;
                        i27 = 1;
                        zoijcleaowVar2.f21924nufgyqmvbu++;
                        i28 = i46 + 1;
                        i45 = i48;
                        i29 = i44;
                    }
                    zoijcleaowVar2.f21929vdvldrhtss = (zoijcleaowVar2.f21929vdvldrhtss ? 1 : 0) | (flexItem.iyctptxqzt() != 0.0f ? i27 : 0);
                    zoijcleaowVar2.f21926oxmwwwfdhm = (zoijcleaowVar2.f21926oxmwwwfdhm ? 1 : 0) | (flexItem.dsvhmnatus() != 0.0f ? i27 : 0);
                    int[] iArr = this.f21908ppxfxbqfkf;
                    if (iArr != null) {
                        iArr[i24] = list2.size();
                    }
                    zoijcleaowVar2.f21919eablkybsjg += hkdspvbjdz(view, zVdvldrhtss) + yadqdtsiqt(flexItem, zVdvldrhtss) + istkbnxepw(flexItem, zVdvldrhtss);
                    zoijcleaowVar2.f21916btonecajqb += flexItem.iyctptxqzt();
                    zoijcleaowVar2.f21920gtknphoqwx += flexItem.dsvhmnatus();
                    this.f21907iobyxmoadg.ppxfxbqfkf(view, i24, i28, zoijcleaowVar2);
                    int iMax = Math.max(i29, jpowsppfya(view, zVdvldrhtss) + cdpycssgdh(flexItem, zVdvldrhtss) + zynmafqrjb(flexItem, zVdvldrhtss) + this.f21907iobyxmoadg.draadjrbmk(view));
                    zoijcleaowVar2.f21923lqeggnwhkg = Math.max(zoijcleaowVar2.f21923lqeggnwhkg, iMax);
                    if (zVdvldrhtss) {
                        if (this.f21907iobyxmoadg.getFlexWrap() != 2) {
                            zoijcleaowVar2.f21917draadjrbmk = Math.max(zoijcleaowVar2.f21917draadjrbmk, view.getBaseline() + flexItem.czzsidtyhn());
                        } else {
                            zoijcleaowVar2.f21917draadjrbmk = Math.max(zoijcleaowVar2.f21917draadjrbmk, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.w());
                        }
                    }
                    i33 = i47;
                    if (cllcsxoeiz(i24, i33, zoijcleaowVar2)) {
                        iobyxmoadg(list2, zoijcleaowVar2, i24, i45);
                        i45 += zoijcleaowVar2.f21923lqeggnwhkg;
                    }
                    i34 = i17;
                    if (i34 != i25 && list2.size() > 0 && ((com.google.android.flexbox.zoijcleaow) list2.get(list2.size() - i27)).f21928rgvfuqvkyq >= i34 && i24 >= i34 && i43 == 0) {
                        i45 = -zoijcleaowVar2.iobyxmoadg();
                        i43 = i27;
                    }
                    if (i45 > i15 && i43 != 0) {
                        i18 = iCombineMeasuredStates;
                        zoijcleaowVar.f21914zoijcleaow = i18;
                    } else {
                        i46 = i28;
                        i44 = iMax;
                    }
                }
                i38 = i24 + 1;
                flexItemCount = i33;
                i35 = i23;
                i39 = i26;
                arrayList = list2;
                size = size;
                mode = mode;
                i36 = i34;
            } else if (cllcsxoeiz(i38, flexItemCount, zoijcleaowVar2)) {
                iobyxmoadg(arrayList, zoijcleaowVar2, i38, i45);
            }
            size = size;
            mode = mode;
            i23 = i35;
            i34 = i36;
            i26 = i39;
            list2 = arrayList;
            i33 = flexItemCount;
            i24 = i38;
            i38 = i24 + 1;
            flexItemCount = i33;
            i35 = i23;
            i39 = i26;
            arrayList = list2;
            size = size;
            mode = mode;
            i36 = i34;
        }
        i18 = iCombineMeasuredStates;
        zoijcleaowVar.f21914zoijcleaow = i18;
    }
}
