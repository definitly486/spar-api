package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class FlexboxLayout extends ViewGroup implements iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f21823cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f21824cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f21825esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int[] f21826iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f21827istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f21828iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f21829jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Drawable f21830lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private SparseIntArray f21831lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private ppxfxbqfkf.zoijcleaow f21832pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private Drawable f21833pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private ppxfxbqfkf f21834wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f21835yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f21836yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private List f21837ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f21838zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f21839zynmafqrjb;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void cqumvgiudr(int i13, int i14) {
        this.f21837ylkuphrtab.clear();
        this.f21832pkzmftpjix.iobyxmoadg();
        this.f21834wwaezpbzkn.ppxfxbqfkf(this.f21832pkzmftpjix, i13, i14);
        this.f21837ylkuphrtab = this.f21832pkzmftpjix.f21913iobyxmoadg;
        this.f21834wwaezpbzkn.rgvfuqvkyq(i13, i14);
        if (this.f21828iwizpuwonk == 3) {
            for (zoijcleaow zoijcleaowVar : this.f21837ylkuphrtab) {
                int iMax = Integer.MIN_VALUE;
                for (int i15 = 0; i15 < zoijcleaowVar.f21924nufgyqmvbu; i15++) {
                    View viewOxmwwwfdhm = oxmwwwfdhm(zoijcleaowVar.f21925ojitshcjhn + i15);
                    if (viewOxmwwwfdhm != null && viewOxmwwwfdhm.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewOxmwwwfdhm.getLayoutParams();
                        iMax = this.f21836yggfygwlhe != 2 ? Math.max(iMax, viewOxmwwwfdhm.getMeasuredHeight() + Math.max(zoijcleaowVar.f21917draadjrbmk - viewOxmwwwfdhm.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewOxmwwwfdhm.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((zoijcleaowVar.f21917draadjrbmk - viewOxmwwwfdhm.getMeasuredHeight()) + viewOxmwwwfdhm.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                zoijcleaowVar.f21923lqeggnwhkg = iMax;
            }
        }
        this.f21834wwaezpbzkn.ojitshcjhn(i13, i14, getPaddingTop() + getPaddingBottom());
        this.f21834wwaezpbzkn.crxdokpmqz();
        lereixgezr(this.f21838zdlpuopuiu, i13, i14, this.f21832pkzmftpjix.f21914zoijcleaow);
    }

    private void eablkybsjg(Canvas canvas, boolean z13, boolean z14) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f21837ylkuphrtab.size();
        for (int i13 = 0; i13 < size; i13++) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f21837ylkuphrtab.get(i13);
            for (int i14 = 0; i14 < zoijcleaowVar.f21924nufgyqmvbu; i14++) {
                int i15 = zoijcleaowVar.f21925ojitshcjhn + i14;
                View viewOxmwwwfdhm = oxmwwwfdhm(i15);
                if (viewOxmwwwfdhm != null && viewOxmwwwfdhm.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewOxmwwwfdhm.getLayoutParams();
                    if (kcexrzcfyt(i15, i14)) {
                        gxszxtbevo(canvas, zoijcleaowVar.f21922iobyxmoadg, z14 ? viewOxmwwwfdhm.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewOxmwwwfdhm.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f21823cdpycssgdh, zoijcleaowVar.f21923lqeggnwhkg);
                    }
                    if (i14 == zoijcleaowVar.f21924nufgyqmvbu - 1 && (this.f21839zynmafqrjb & 4) > 0) {
                        gxszxtbevo(canvas, zoijcleaowVar.f21922iobyxmoadg, z14 ? (viewOxmwwwfdhm.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f21823cdpycssgdh : viewOxmwwwfdhm.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, zoijcleaowVar.f21923lqeggnwhkg);
                    }
                }
            }
            if (zdlpuopuiu(i13)) {
                nufgyqmvbu(canvas, z13 ? zoijcleaowVar.f21927ppxfxbqfkf : zoijcleaowVar.f21922iobyxmoadg - this.f21835yadqdtsiqt, paddingTop, iMax);
            }
            if (yggfygwlhe(i13) && (this.f21827istkbnxepw & 4) > 0) {
                nufgyqmvbu(canvas, z13 ? zoijcleaowVar.f21922iobyxmoadg - this.f21835yadqdtsiqt : zoijcleaowVar.f21927ppxfxbqfkf, paddingTop, iMax);
            }
        }
    }

    private void esjtqupxsv(int i13, int i14) {
        this.f21837ylkuphrtab.clear();
        this.f21832pkzmftpjix.iobyxmoadg();
        this.f21834wwaezpbzkn.gxszxtbevo(this.f21832pkzmftpjix, i13, i14);
        this.f21837ylkuphrtab = this.f21832pkzmftpjix.f21913iobyxmoadg;
        this.f21834wwaezpbzkn.rgvfuqvkyq(i13, i14);
        this.f21834wwaezpbzkn.ojitshcjhn(i13, i14, getPaddingLeft() + getPaddingRight());
        this.f21834wwaezpbzkn.crxdokpmqz();
        lereixgezr(this.f21838zdlpuopuiu, i13, i14, this.f21832pkzmftpjix.f21914zoijcleaow);
    }

    private void gxszxtbevo(Canvas canvas, int i13, int i14, int i15) {
        Drawable drawable = this.f21830lereixgezr;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i13, i14, i15 + i13, this.f21823cdpycssgdh + i14);
        this.f21830lereixgezr.draw(canvas);
    }

    private boolean iobyxmoadg(int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (((zoijcleaow) this.f21837ylkuphrtab.get(i14)).ppxfxbqfkf() > 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:50:0x010e  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x012f  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0186  */
    /* JADX WARN: Code duplicated, block: B:64:0x0190  */
    /* JADX WARN: Code duplicated, block: B:65:0x01af  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:71:0x0207  */
    private void iwizpuwonk(boolean z13, boolean z14, int i13, int i14, int i15, int i16) {
        float f13;
        int i17;
        float f14;
        float f15;
        float fMax;
        int i18;
        int i19;
        View viewOxmwwwfdhm;
        int i23;
        boolean z15;
        char c13;
        LayoutParams layoutParams;
        float f16;
        float f17;
        float f18;
        float f19;
        int i24;
        char c14;
        int i25;
        LayoutParams layoutParams2;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i26 = i16 - i14;
        int i27 = (i15 - i13) - paddingRight;
        int size = this.f21837ylkuphrtab.size();
        for (int i28 = 0; i28 < size; i28++) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f21837ylkuphrtab.get(i28);
            if (zdlpuopuiu(i28)) {
                int i29 = this.f21835yadqdtsiqt;
                paddingLeft += i29;
                i27 -= i29;
            }
            int i33 = this.f21829jyumaefscl;
            char c15 = 4;
            boolean z16 = true;
            if (i33 != 0) {
                if (i33 == 1) {
                    int i34 = zoijcleaowVar.f21919eablkybsjg;
                    f13 = (i26 - i34) + paddingBottom;
                    i17 = i34 - paddingTop;
                } else if (i33 == 2) {
                    int i35 = zoijcleaowVar.f21919eablkybsjg;
                    f14 = (i26 - paddingBottom) - ((i26 - i35) / 2.0f);
                    f13 = paddingTop + ((i26 - i35) / 2.0f);
                    f15 = 0.0f;
                } else if (i33 == 3) {
                    f13 = paddingTop;
                    int iPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
                    f15 = (i26 - zoijcleaowVar.f21919eablkybsjg) / (iPpxfxbqfkf != 1 ? iPpxfxbqfkf - 1 : 1.0f);
                    f14 = i26 - paddingBottom;
                } else if (i33 == 4) {
                    int iPpxfxbqfkf2 = zoijcleaowVar.ppxfxbqfkf();
                    f15 = iPpxfxbqfkf2 != 0 ? (i26 - zoijcleaowVar.f21919eablkybsjg) / iPpxfxbqfkf2 : 0.0f;
                    float f23 = f15 / 2.0f;
                    f13 = paddingTop + f23;
                    f14 = (i26 - paddingBottom) - f23;
                } else {
                    if (i33 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f21829jyumaefscl);
                    }
                    int iPpxfxbqfkf3 = zoijcleaowVar.ppxfxbqfkf();
                    f15 = iPpxfxbqfkf3 != 0 ? (i26 - zoijcleaowVar.f21919eablkybsjg) / (iPpxfxbqfkf3 + 1) : 0.0f;
                    f13 = paddingTop + f15;
                    f14 = (i26 - paddingBottom) - f15;
                }
                fMax = Math.max(f15, 0.0f);
                i18 = 0;
                while (i18 < zoijcleaowVar.f21924nufgyqmvbu) {
                    i19 = zoijcleaowVar.f21925ojitshcjhn + i18;
                    viewOxmwwwfdhm = oxmwwwfdhm(i19);
                    if (viewOxmwwwfdhm != null) {
                        i23 = i18;
                        z15 = z16;
                        c13 = c15;
                    } else if (viewOxmwwwfdhm.getVisibility() == 8) {
                        i23 = i18;
                        z15 = true;
                        c13 = 4;
                    } else {
                        layoutParams = (LayoutParams) viewOxmwwwfdhm.getLayoutParams();
                        f16 = f13 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        f17 = f14 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        if (kcexrzcfyt(i19, i18)) {
                            int i36 = this.f21823cdpycssgdh;
                            float f24 = i36;
                            f18 = f16 + f24;
                            i24 = i36;
                            f19 = f17 - f24;
                        } else {
                            f18 = f16;
                            f19 = f17;
                            i24 = 0;
                        }
                        if (i18 == zoijcleaowVar.f21924nufgyqmvbu - 1) {
                            c14 = 4;
                            i25 = (this.f21839zynmafqrjb & 4) > 0 ? this.f21823cdpycssgdh : 0;
                            if (z13) {
                                i23 = i18;
                                z15 = true;
                                layoutParams2 = layoutParams;
                                c13 = c14;
                                if (z14) {
                                    this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, false, paddingLeft, Math.round(f19) - viewOxmwwwfdhm.getMeasuredHeight(), paddingLeft + viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f19));
                                } else {
                                    this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, false, paddingLeft, Math.round(f18), paddingLeft + viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f18) + viewOxmwwwfdhm.getMeasuredHeight());
                                }
                            } else if (z14) {
                                i23 = i18;
                                z15 = true;
                                layoutParams2 = layoutParams;
                                c13 = c14;
                                this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, true, i27 - viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f19) - viewOxmwwwfdhm.getMeasuredHeight(), i27, Math.round(f19));
                            } else {
                                i23 = i18;
                                z15 = true;
                                layoutParams2 = layoutParams;
                                c13 = c14;
                                this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, true, i27 - viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f18), i27, Math.round(f18) + viewOxmwwwfdhm.getMeasuredHeight());
                            }
                            LayoutParams layoutParams3 = layoutParams2;
                            float measuredHeight = f18 + viewOxmwwwfdhm.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                            float measuredHeight2 = f19 - ((viewOxmwwwfdhm.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin);
                            if (z14) {
                                zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, 0, i25, 0, i24);
                            } else {
                                zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, 0, i24, 0, i25);
                            }
                            f13 = measuredHeight;
                            f14 = measuredHeight2;
                        } else {
                            c14 = 4;
                        }
                        if (z13) {
                            i23 = i18;
                            z15 = true;
                            layoutParams2 = layoutParams;
                            c13 = c14;
                            if (z14) {
                                this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, false, paddingLeft, Math.round(f19) - viewOxmwwwfdhm.getMeasuredHeight(), paddingLeft + viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f19));
                            } else {
                                this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, false, paddingLeft, Math.round(f18), paddingLeft + viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f18) + viewOxmwwwfdhm.getMeasuredHeight());
                            }
                        } else if (z14) {
                            i23 = i18;
                            z15 = true;
                            layoutParams2 = layoutParams;
                            c13 = c14;
                            this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, true, i27 - viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f19) - viewOxmwwwfdhm.getMeasuredHeight(), i27, Math.round(f19));
                        } else {
                            i23 = i18;
                            z15 = true;
                            layoutParams2 = layoutParams;
                            c13 = c14;
                            this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, true, i27 - viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f18), i27, Math.round(f18) + viewOxmwwwfdhm.getMeasuredHeight());
                        }
                        LayoutParams layoutParams4 = layoutParams2;
                        float measuredHeight3 = f18 + viewOxmwwwfdhm.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
                        float measuredHeight4 = f19 - ((viewOxmwwwfdhm.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin);
                        if (z14) {
                            zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, 0, i25, 0, i24);
                        } else {
                            zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, 0, i24, 0, i25);
                        }
                        f13 = measuredHeight3;
                        f14 = measuredHeight4;
                    }
                    i18 = i23 + 1;
                    z16 = z15;
                    c15 = c13;
                }
                int i37 = zoijcleaowVar.f21923lqeggnwhkg;
                paddingLeft += i37;
                i27 -= i37;
            } else {
                f13 = paddingTop;
                i17 = i26 - paddingBottom;
            }
            f14 = i17;
            f15 = 0.0f;
            fMax = Math.max(f15, 0.0f);
            i18 = 0;
            while (i18 < zoijcleaowVar.f21924nufgyqmvbu) {
                i19 = zoijcleaowVar.f21925ojitshcjhn + i18;
                viewOxmwwwfdhm = oxmwwwfdhm(i19);
                if (viewOxmwwwfdhm != null) {
                    i23 = i18;
                    z15 = z16;
                    c13 = c15;
                } else if (viewOxmwwwfdhm.getVisibility() == 8) {
                    i23 = i18;
                    z15 = true;
                    c13 = 4;
                } else {
                    layoutParams = (LayoutParams) viewOxmwwwfdhm.getLayoutParams();
                    f16 = f13 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    f17 = f14 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if (kcexrzcfyt(i19, i18)) {
                        int i38 = this.f21823cdpycssgdh;
                        float f25 = i38;
                        f18 = f16 + f25;
                        i24 = i38;
                        f19 = f17 - f25;
                    } else {
                        f18 = f16;
                        f19 = f17;
                        i24 = 0;
                    }
                    if (i18 == zoijcleaowVar.f21924nufgyqmvbu - 1) {
                        c14 = 4;
                        if ((this.f21839zynmafqrjb & 4) > 0) {
                        }
                        if (z13) {
                            i23 = i18;
                            z15 = true;
                            layoutParams2 = layoutParams;
                            c13 = c14;
                            if (z14) {
                                this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, false, paddingLeft, Math.round(f19) - viewOxmwwwfdhm.getMeasuredHeight(), paddingLeft + viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f19));
                            } else {
                                this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, false, paddingLeft, Math.round(f18), paddingLeft + viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f18) + viewOxmwwwfdhm.getMeasuredHeight());
                            }
                        } else if (z14) {
                            i23 = i18;
                            z15 = true;
                            layoutParams2 = layoutParams;
                            c13 = c14;
                            this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, true, i27 - viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f19) - viewOxmwwwfdhm.getMeasuredHeight(), i27, Math.round(f19));
                        } else {
                            i23 = i18;
                            z15 = true;
                            layoutParams2 = layoutParams;
                            c13 = c14;
                            this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, true, i27 - viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f18), i27, Math.round(f18) + viewOxmwwwfdhm.getMeasuredHeight());
                        }
                        LayoutParams layoutParams5 = layoutParams2;
                        float measuredHeight5 = f18 + viewOxmwwwfdhm.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                        float measuredHeight6 = f19 - ((viewOxmwwwfdhm.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin);
                        if (z14) {
                            zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, 0, i25, 0, i24);
                        } else {
                            zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, 0, i24, 0, i25);
                        }
                        f13 = measuredHeight5;
                        f14 = measuredHeight6;
                    } else {
                        c14 = 4;
                    }
                    if (z13) {
                        i23 = i18;
                        z15 = true;
                        layoutParams2 = layoutParams;
                        c13 = c14;
                        if (z14) {
                            this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, false, paddingLeft, Math.round(f19) - viewOxmwwwfdhm.getMeasuredHeight(), paddingLeft + viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f19));
                        } else {
                            this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, false, paddingLeft, Math.round(f18), paddingLeft + viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f18) + viewOxmwwwfdhm.getMeasuredHeight());
                        }
                    } else if (z14) {
                        i23 = i18;
                        z15 = true;
                        layoutParams2 = layoutParams;
                        c13 = c14;
                        this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, true, i27 - viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f19) - viewOxmwwwfdhm.getMeasuredHeight(), i27, Math.round(f19));
                    } else {
                        i23 = i18;
                        z15 = true;
                        layoutParams2 = layoutParams;
                        c13 = c14;
                        this.f21834wwaezpbzkn.kegysxyocb(viewOxmwwwfdhm, zoijcleaowVar, true, i27 - viewOxmwwwfdhm.getMeasuredWidth(), Math.round(f18), i27, Math.round(f18) + viewOxmwwwfdhm.getMeasuredHeight());
                    }
                    LayoutParams layoutParams6 = layoutParams2;
                    float measuredHeight7 = f18 + viewOxmwwwfdhm.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    float measuredHeight8 = f19 - ((viewOxmwwwfdhm.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin);
                    if (z14) {
                        zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, 0, i25, 0, i24);
                    } else {
                        zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, 0, i24, 0, i25);
                    }
                    f13 = measuredHeight7;
                    f14 = measuredHeight8;
                }
                i18 = i23 + 1;
                z16 = z15;
                c15 = c13;
            }
            int i39 = zoijcleaowVar.f21923lqeggnwhkg;
            paddingLeft += i39;
            i27 -= i39;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x0108  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x011b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0166  */
    /* JADX WARN: Code duplicated, block: B:62:0x0190  */
    /* JADX WARN: Code duplicated, block: B:64:0x019d  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:69:0x0200  */
    /* JADX WARN: Code duplicated, block: B:71:0x020f  */
    private void jyumaefscl(boolean z13, int i13, int i14, int i15, int i16) {
        float measuredWidth;
        float f13;
        float f14;
        float fMax;
        int i17;
        int i18;
        View viewOxmwwwfdhm;
        int i19;
        int i23;
        int i24;
        char c13;
        LayoutParams layoutParams;
        float f15;
        float f16;
        float f17;
        int i25;
        char c14;
        int i26;
        LayoutParams layoutParams2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i27 = i15 - i13;
        int paddingBottom = (i16 - i14) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.f21837ylkuphrtab.size();
        int i28 = 0;
        while (i28 < size) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f21837ylkuphrtab.get(i28);
            if (zdlpuopuiu(i28)) {
                int i29 = this.f21823cdpycssgdh;
                paddingBottom -= i29;
                paddingTop += i29;
            }
            int i33 = this.f21829jyumaefscl;
            char c15 = 4;
            int i34 = 1;
            if (i33 == 0) {
                measuredWidth = paddingLeft;
                f13 = i27 - paddingRight;
            } else if (i33 != 1) {
                if (i33 == 2) {
                    int i35 = zoijcleaowVar.f21919eablkybsjg;
                    measuredWidth = paddingLeft + ((i27 - i35) / 2.0f);
                    f13 = (i27 - paddingRight) - ((i27 - i35) / 2.0f);
                } else if (i33 == 3) {
                    measuredWidth = paddingLeft;
                    int iPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
                    f14 = (i27 - zoijcleaowVar.f21919eablkybsjg) / (iPpxfxbqfkf != 1 ? iPpxfxbqfkf - 1 : 1.0f);
                    f13 = i27 - paddingRight;
                } else if (i33 == 4) {
                    int iPpxfxbqfkf2 = zoijcleaowVar.ppxfxbqfkf();
                    f14 = iPpxfxbqfkf2 != 0 ? (i27 - zoijcleaowVar.f21919eablkybsjg) / iPpxfxbqfkf2 : 0.0f;
                    float f18 = f14 / 2.0f;
                    measuredWidth = paddingLeft + f18;
                    f13 = (i27 - paddingRight) - f18;
                } else {
                    if (i33 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f21829jyumaefscl);
                    }
                    int iPpxfxbqfkf3 = zoijcleaowVar.ppxfxbqfkf();
                    f14 = iPpxfxbqfkf3 != 0 ? (i27 - zoijcleaowVar.f21919eablkybsjg) / (iPpxfxbqfkf3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f14;
                    f13 = (i27 - paddingRight) - f14;
                }
                fMax = Math.max(f14, 0.0f);
                i17 = 0;
                while (i17 < zoijcleaowVar.f21924nufgyqmvbu) {
                    i18 = zoijcleaowVar.f21925ojitshcjhn + i17;
                    viewOxmwwwfdhm = oxmwwwfdhm(i18);
                    if (viewOxmwwwfdhm != null) {
                        i19 = paddingLeft;
                        i23 = i34;
                        i24 = i17;
                        c13 = c15;
                    } else if (viewOxmwwwfdhm.getVisibility() == 8) {
                        i19 = paddingLeft;
                        i23 = i34;
                        i24 = i17;
                        c13 = 4;
                    } else {
                        layoutParams = (LayoutParams) viewOxmwwwfdhm.getLayoutParams();
                        f15 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        f16 = f13 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        if (kcexrzcfyt(i18, i17)) {
                            int i36 = this.f21835yadqdtsiqt;
                            float f19 = i36;
                            f15 += f19;
                            i25 = i36;
                            f17 = f16 - f19;
                        } else {
                            f17 = f16;
                            i25 = 0;
                        }
                        if (i17 == zoijcleaowVar.f21924nufgyqmvbu - i34) {
                            c14 = 4;
                            i26 = (this.f21827istkbnxepw & 4) > 0 ? this.f21835yadqdtsiqt : 0;
                            if (this.f21836yggfygwlhe == 2) {
                                i19 = paddingLeft;
                                i23 = i34;
                                i24 = i17;
                                layoutParams2 = layoutParams;
                                c13 = c14;
                                if (z13) {
                                    this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f17) - viewOxmwwwfdhm.getMeasuredWidth(), paddingTop, Math.round(f17), paddingTop + viewOxmwwwfdhm.getMeasuredHeight());
                                } else {
                                    this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f15), paddingTop, Math.round(f15) + viewOxmwwwfdhm.getMeasuredWidth(), paddingTop + viewOxmwwwfdhm.getMeasuredHeight());
                                }
                            } else if (z13) {
                                i23 = i34;
                                i24 = i17;
                                i19 = paddingLeft;
                                layoutParams2 = layoutParams;
                                c13 = c14;
                                this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f17) - viewOxmwwwfdhm.getMeasuredWidth(), paddingBottom - viewOxmwwwfdhm.getMeasuredHeight(), Math.round(f17), paddingBottom);
                            } else {
                                i19 = paddingLeft;
                                i23 = i34;
                                i24 = i17;
                                layoutParams2 = layoutParams;
                                c13 = c14;
                                this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f15), paddingBottom - viewOxmwwwfdhm.getMeasuredHeight(), Math.round(f15) + viewOxmwwwfdhm.getMeasuredWidth(), paddingBottom);
                            }
                            measuredWidth = f15 + viewOxmwwwfdhm.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                            float measuredWidth2 = f17 - ((viewOxmwwwfdhm.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                            if (z13) {
                                zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, i26, 0, i25, 0);
                            } else {
                                zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, i25, 0, i26, 0);
                            }
                            f13 = measuredWidth2;
                        } else {
                            c14 = 4;
                        }
                        if (this.f21836yggfygwlhe == 2) {
                            i19 = paddingLeft;
                            i23 = i34;
                            i24 = i17;
                            layoutParams2 = layoutParams;
                            c13 = c14;
                            if (z13) {
                                this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f17) - viewOxmwwwfdhm.getMeasuredWidth(), paddingTop, Math.round(f17), paddingTop + viewOxmwwwfdhm.getMeasuredHeight());
                            } else {
                                this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f15), paddingTop, Math.round(f15) + viewOxmwwwfdhm.getMeasuredWidth(), paddingTop + viewOxmwwwfdhm.getMeasuredHeight());
                            }
                        } else if (z13) {
                            i23 = i34;
                            i24 = i17;
                            i19 = paddingLeft;
                            layoutParams2 = layoutParams;
                            c13 = c14;
                            this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f17) - viewOxmwwwfdhm.getMeasuredWidth(), paddingBottom - viewOxmwwwfdhm.getMeasuredHeight(), Math.round(f17), paddingBottom);
                        } else {
                            i19 = paddingLeft;
                            i23 = i34;
                            i24 = i17;
                            layoutParams2 = layoutParams;
                            c13 = c14;
                            this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f15), paddingBottom - viewOxmwwwfdhm.getMeasuredHeight(), Math.round(f15) + viewOxmwwwfdhm.getMeasuredWidth(), paddingBottom);
                        }
                        measuredWidth = f15 + viewOxmwwwfdhm.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = f17 - ((viewOxmwwwfdhm.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z13) {
                            zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, i26, 0, i25, 0);
                        } else {
                            zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, i25, 0, i26, 0);
                        }
                        f13 = measuredWidth3;
                    }
                    i17 = i24 + 1;
                    c15 = c13;
                    i34 = i23;
                    paddingLeft = i19;
                }
                int i37 = paddingLeft;
                int i38 = zoijcleaowVar.f21923lqeggnwhkg;
                paddingTop += i38;
                paddingBottom -= i38;
                i28++;
                paddingLeft = i37;
            } else {
                int i39 = zoijcleaowVar.f21919eablkybsjg;
                f13 = i39 - paddingLeft;
                measuredWidth = (i27 - i39) + paddingRight;
            }
            f14 = 0.0f;
            fMax = Math.max(f14, 0.0f);
            i17 = 0;
            while (i17 < zoijcleaowVar.f21924nufgyqmvbu) {
                i18 = zoijcleaowVar.f21925ojitshcjhn + i17;
                viewOxmwwwfdhm = oxmwwwfdhm(i18);
                if (viewOxmwwwfdhm != null) {
                    i19 = paddingLeft;
                    i23 = i34;
                    i24 = i17;
                    c13 = c15;
                } else if (viewOxmwwwfdhm.getVisibility() == 8) {
                    i19 = paddingLeft;
                    i23 = i34;
                    i24 = i17;
                    c13 = 4;
                } else {
                    layoutParams = (LayoutParams) viewOxmwwwfdhm.getLayoutParams();
                    f15 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    f16 = f13 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    if (kcexrzcfyt(i18, i17)) {
                        int i310 = this.f21835yadqdtsiqt;
                        float f110 = i310;
                        f15 += f110;
                        i25 = i310;
                        f17 = f16 - f110;
                    } else {
                        f17 = f16;
                        i25 = 0;
                    }
                    if (i17 == zoijcleaowVar.f21924nufgyqmvbu - i34) {
                        c14 = 4;
                        if ((this.f21827istkbnxepw & 4) > 0) {
                        }
                        if (this.f21836yggfygwlhe == 2) {
                            i19 = paddingLeft;
                            i23 = i34;
                            i24 = i17;
                            layoutParams2 = layoutParams;
                            c13 = c14;
                            if (z13) {
                                this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f17) - viewOxmwwwfdhm.getMeasuredWidth(), paddingTop, Math.round(f17), paddingTop + viewOxmwwwfdhm.getMeasuredHeight());
                            } else {
                                this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f15), paddingTop, Math.round(f15) + viewOxmwwwfdhm.getMeasuredWidth(), paddingTop + viewOxmwwwfdhm.getMeasuredHeight());
                            }
                        } else if (z13) {
                            i23 = i34;
                            i24 = i17;
                            i19 = paddingLeft;
                            layoutParams2 = layoutParams;
                            c13 = c14;
                            this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f17) - viewOxmwwwfdhm.getMeasuredWidth(), paddingBottom - viewOxmwwwfdhm.getMeasuredHeight(), Math.round(f17), paddingBottom);
                        } else {
                            i19 = paddingLeft;
                            i23 = i34;
                            i24 = i17;
                            layoutParams2 = layoutParams;
                            c13 = c14;
                            this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f15), paddingBottom - viewOxmwwwfdhm.getMeasuredHeight(), Math.round(f15) + viewOxmwwwfdhm.getMeasuredWidth(), paddingBottom);
                        }
                        measuredWidth = f15 + viewOxmwwwfdhm.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth4 = f17 - ((viewOxmwwwfdhm.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z13) {
                            zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, i26, 0, i25, 0);
                        } else {
                            zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, i25, 0, i26, 0);
                        }
                        f13 = measuredWidth4;
                    } else {
                        c14 = 4;
                    }
                    if (this.f21836yggfygwlhe == 2) {
                        i19 = paddingLeft;
                        i23 = i34;
                        i24 = i17;
                        layoutParams2 = layoutParams;
                        c13 = c14;
                        if (z13) {
                            this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f17) - viewOxmwwwfdhm.getMeasuredWidth(), paddingTop, Math.round(f17), paddingTop + viewOxmwwwfdhm.getMeasuredHeight());
                        } else {
                            this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f15), paddingTop, Math.round(f15) + viewOxmwwwfdhm.getMeasuredWidth(), paddingTop + viewOxmwwwfdhm.getMeasuredHeight());
                        }
                    } else if (z13) {
                        i23 = i34;
                        i24 = i17;
                        i19 = paddingLeft;
                        layoutParams2 = layoutParams;
                        c13 = c14;
                        this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f17) - viewOxmwwwfdhm.getMeasuredWidth(), paddingBottom - viewOxmwwwfdhm.getMeasuredHeight(), Math.round(f17), paddingBottom);
                    } else {
                        i19 = paddingLeft;
                        i23 = i34;
                        i24 = i17;
                        layoutParams2 = layoutParams;
                        c13 = c14;
                        this.f21834wwaezpbzkn.stevsuqkhv(viewOxmwwwfdhm, zoijcleaowVar, Math.round(f15), paddingBottom - viewOxmwwwfdhm.getMeasuredHeight(), Math.round(f15) + viewOxmwwwfdhm.getMeasuredWidth(), paddingBottom);
                    }
                    measuredWidth = f15 + viewOxmwwwfdhm.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    float measuredWidth5 = f17 - ((viewOxmwwwfdhm.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                    if (z13) {
                        zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, i26, 0, i25, 0);
                    } else {
                        zoijcleaowVar.wkgbmnqykc(viewOxmwwwfdhm, i25, 0, i26, 0);
                    }
                    f13 = measuredWidth5;
                }
                i17 = i24 + 1;
                c15 = c13;
                i34 = i23;
                paddingLeft = i19;
            }
            int i311 = paddingLeft;
            int i312 = zoijcleaowVar.f21923lqeggnwhkg;
            paddingTop += i312;
            paddingBottom -= i312;
            i28++;
            paddingLeft = i311;
        }
    }

    private boolean kcexrzcfyt(int i13, int i14) {
        if (zoijcleaow(i13, i14)) {
            if (vdvldrhtss()) {
                return (this.f21827istkbnxepw & 1) != 0;
            }
            return (this.f21839zynmafqrjb & 1) != 0;
        }
        if (vdvldrhtss()) {
            return (this.f21827istkbnxepw & 2) != 0;
        }
        return (this.f21839zynmafqrjb & 2) != 0;
    }

    private void lereixgezr(int i13, int i14, int i15, int i16) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int mode2 = View.MeasureSpec.getMode(i15);
        int size2 = View.MeasureSpec.getSize(i15);
        if (i13 == 0 || i13 == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i13 != 2 && i13 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i13);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i16 = View.combineMeasuredStates(i16, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i14, i16);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i14, i16);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unknown width mode is set: " + mode);
            }
            if (size < largestMainSize) {
                i16 = View.combineMeasuredStates(i16, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i14, i16);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i16 = View.combineMeasuredStates(i16, UserVerificationMethods.USER_VERIFY_HANDPRINT);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i15, i16);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i15, i16);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException("Unknown height mode is set: " + mode2);
            }
            if (size2 < sumOfCrossSize) {
                i16 = View.combineMeasuredStates(i16, UserVerificationMethods.USER_VERIFY_HANDPRINT);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i15, i16);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void nufgyqmvbu(Canvas canvas, int i13, int i14, int i15) {
        Drawable drawable = this.f21833pmvmpeiblj;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i13, i14, this.f21835yadqdtsiqt + i13, i15 + i14);
        this.f21833pmvmpeiblj.draw(canvas);
    }

    private void pmvmpeiblj() {
        if (this.f21830lereixgezr == null && this.f21833pmvmpeiblj == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private void wkgbmnqykc(Canvas canvas, boolean z13, boolean z14) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f21837ylkuphrtab.size();
        for (int i13 = 0; i13 < size; i13++) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f21837ylkuphrtab.get(i13);
            for (int i14 = 0; i14 < zoijcleaowVar.f21924nufgyqmvbu; i14++) {
                int i15 = zoijcleaowVar.f21925ojitshcjhn + i14;
                View viewOxmwwwfdhm = oxmwwwfdhm(i15);
                if (viewOxmwwwfdhm != null && viewOxmwwwfdhm.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewOxmwwwfdhm.getLayoutParams();
                    if (kcexrzcfyt(i15, i14)) {
                        nufgyqmvbu(canvas, z13 ? viewOxmwwwfdhm.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewOxmwwwfdhm.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f21835yadqdtsiqt, zoijcleaowVar.f21932zoijcleaow, zoijcleaowVar.f21923lqeggnwhkg);
                    }
                    if (i14 == zoijcleaowVar.f21924nufgyqmvbu - 1 && (this.f21827istkbnxepw & 4) > 0) {
                        nufgyqmvbu(canvas, z13 ? (viewOxmwwwfdhm.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f21835yadqdtsiqt : viewOxmwwwfdhm.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, zoijcleaowVar.f21932zoijcleaow, zoijcleaowVar.f21923lqeggnwhkg);
                    }
                }
            }
            if (zdlpuopuiu(i13)) {
                gxszxtbevo(canvas, paddingLeft, z14 ? zoijcleaowVar.f21931wkgbmnqykc : zoijcleaowVar.f21932zoijcleaow - this.f21823cdpycssgdh, iMax);
            }
            if (yggfygwlhe(i13) && (this.f21839zynmafqrjb & 4) > 0) {
                gxszxtbevo(canvas, paddingLeft, z14 ? zoijcleaowVar.f21932zoijcleaow - this.f21823cdpycssgdh : zoijcleaowVar.f21931wkgbmnqykc, iMax);
            }
        }
    }

    private boolean yggfygwlhe(int i13) {
        if (i13 < 0 || i13 >= this.f21837ylkuphrtab.size()) {
            return false;
        }
        for (int i14 = i13 + 1; i14 < this.f21837ylkuphrtab.size(); i14++) {
            if (((zoijcleaow) this.f21837ylkuphrtab.get(i14)).ppxfxbqfkf() > 0) {
                return false;
            }
        }
        if (vdvldrhtss()) {
            return (this.f21839zynmafqrjb & 4) != 0;
        }
        return (this.f21827istkbnxepw & 4) != 0;
    }

    private boolean zdlpuopuiu(int i13) {
        if (i13 < 0 || i13 >= this.f21837ylkuphrtab.size()) {
            return false;
        }
        if (iobyxmoadg(i13)) {
            if (vdvldrhtss()) {
                return (this.f21839zynmafqrjb & 1) != 0;
            }
            return (this.f21827istkbnxepw & 1) != 0;
        }
        if (vdvldrhtss()) {
            return (this.f21839zynmafqrjb & 2) != 0;
        }
        return (this.f21827istkbnxepw & 2) != 0;
    }

    private boolean zoijcleaow(int i13, int i14) {
        for (int i15 = 1; i15 <= i14; i15++) {
            View viewOxmwwwfdhm = oxmwwwfdhm(i13 - i15);
            if (viewOxmwwwfdhm != null && viewOxmwwwfdhm.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (this.f21831lmojexxdyd == null) {
            this.f21831lmojexxdyd = new SparseIntArray(getChildCount());
        }
        this.f21826iozdgvuglv = this.f21834wwaezpbzkn.agtfadlqog(view, i13, layoutParams, this.f21831lmojexxdyd);
        super.addView(view, i13, layoutParams);
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public View agtfadlqog(int i13) {
        return oxmwwwfdhm(i13);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int draadjrbmk(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public View dxjokdxxww(int i13) {
        return getChildAt(i13);
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getAlignContent() {
        return this.f21824cqumvgiudr;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getAlignItems() {
        return this.f21828iwizpuwonk;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f21830lereixgezr;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f21833pmvmpeiblj;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getFlexDirection() {
        return this.f21838zdlpuopuiu;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<zoijcleaow> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f21837ylkuphrtab.size());
        for (zoijcleaow zoijcleaowVar : this.f21837ylkuphrtab) {
            if (zoijcleaowVar.ppxfxbqfkf() != 0) {
                arrayList.add(zoijcleaowVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public List<zoijcleaow> getFlexLinesInternal() {
        return this.f21837ylkuphrtab;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getFlexWrap() {
        return this.f21836yggfygwlhe;
    }

    public int getJustifyContent() {
        return this.f21829jyumaefscl;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getLargestMainSize() {
        Iterator it = this.f21837ylkuphrtab.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((zoijcleaow) it.next()).f21919eablkybsjg);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getMaxLine() {
        return this.f21825esjtqupxsv;
    }

    public int getShowDividerHorizontal() {
        return this.f21839zynmafqrjb;
    }

    public int getShowDividerVertical() {
        return this.f21827istkbnxepw;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int getSumOfCrossSize() {
        int size = this.f21837ylkuphrtab.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f21837ylkuphrtab.get(i14);
            if (zdlpuopuiu(i14)) {
                i13 += vdvldrhtss() ? this.f21823cdpycssgdh : this.f21835yadqdtsiqt;
            }
            if (yggfygwlhe(i14)) {
                i13 += vdvldrhtss() ? this.f21823cdpycssgdh : this.f21835yadqdtsiqt;
            }
            i13 += zoijcleaowVar.f21923lqeggnwhkg;
        }
        return i13;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int gtknphoqwx(int i13, int i14, int i15) {
        return ViewGroup.getChildMeasureSpec(i13, i14, i15);
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int lqeggnwhkg(int i13, int i14, int i15) {
        return ViewGroup.getChildMeasureSpec(i13, i14, i15);
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public void ojitshcjhn(int i13, View view) {
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f21833pmvmpeiblj == null && this.f21830lereixgezr == null) {
            return;
        }
        if (this.f21839zynmafqrjb == 0 && this.f21827istkbnxepw == 0) {
            return;
        }
        int iLereixgezr = jhduphickx.lereixgezr(this);
        int i13 = this.f21838zdlpuopuiu;
        if (i13 == 0) {
            wkgbmnqykc(canvas, iLereixgezr == 1, this.f21836yggfygwlhe == 2);
            return;
        }
        if (i13 == 1) {
            wkgbmnqykc(canvas, iLereixgezr != 1, this.f21836yggfygwlhe == 2);
            return;
        }
        if (i13 == 2) {
            boolean z13 = iLereixgezr == 1;
            if (this.f21836yggfygwlhe == 2) {
                z13 = !z13;
            }
            eablkybsjg(canvas, z13, false);
            return;
        }
        if (i13 != 3) {
            return;
        }
        boolean z14 = iLereixgezr == 1;
        if (this.f21836yggfygwlhe == 2) {
            z14 = !z14;
        }
        eablkybsjg(canvas, z14, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        boolean z14;
        int iLereixgezr = jhduphickx.lereixgezr(this);
        int i17 = this.f21838zdlpuopuiu;
        if (i17 == 0) {
            jyumaefscl(iLereixgezr == 1, i13, i14, i15, i16);
            return;
        }
        if (i17 == 1) {
            jyumaefscl(iLereixgezr != 1, i13, i14, i15, i16);
            return;
        }
        if (i17 == 2) {
            z14 = iLereixgezr == 1;
            iwizpuwonk(this.f21836yggfygwlhe == 2 ? !z14 : z14, false, i13, i14, i15, i16);
        } else if (i17 == 3) {
            z14 = iLereixgezr == 1;
            iwizpuwonk(this.f21836yggfygwlhe == 2 ? !z14 : z14, true, i13, i14, i15, i16);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f21838zdlpuopuiu);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        if (this.f21831lmojexxdyd == null) {
            this.f21831lmojexxdyd = new SparseIntArray(getChildCount());
        }
        if (this.f21834wwaezpbzkn.dsvhmnatus(this.f21831lmojexxdyd)) {
            this.f21826iozdgvuglv = this.f21834wwaezpbzkn.wflxmlrfwp(this.f21831lmojexxdyd);
        }
        int i15 = this.f21838zdlpuopuiu;
        if (i15 == 0 || i15 == 1) {
            cqumvgiudr(i13, i14);
            return;
        }
        if (i15 == 2 || i15 == 3) {
            esjtqupxsv(i13, i14);
            return;
        }
        throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f21838zdlpuopuiu);
    }

    public View oxmwwwfdhm(int i13) {
        if (i13 < 0) {
            return null;
        }
        int[] iArr = this.f21826iozdgvuglv;
        if (i13 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i13]);
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public void ppxfxbqfkf(View view, int i13, int i14, zoijcleaow zoijcleaowVar) {
        if (kcexrzcfyt(i13, i14)) {
            if (vdvldrhtss()) {
                int i15 = zoijcleaowVar.f21919eablkybsjg;
                int i16 = this.f21835yadqdtsiqt;
                zoijcleaowVar.f21919eablkybsjg = i15 + i16;
                zoijcleaowVar.f21921gxszxtbevo += i16;
                return;
            }
            int i17 = zoijcleaowVar.f21919eablkybsjg;
            int i18 = this.f21823cdpycssgdh;
            zoijcleaowVar.f21919eablkybsjg = i17 + i18;
            zoijcleaowVar.f21921gxszxtbevo += i18;
        }
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public int rgvfuqvkyq(View view, int i13, int i14) {
        int i15;
        int i16;
        if (vdvldrhtss()) {
            i15 = kcexrzcfyt(i13, i14) ? this.f21835yadqdtsiqt : 0;
            if ((this.f21827istkbnxepw & 4) <= 0) {
                return i15;
            }
            i16 = this.f21835yadqdtsiqt;
        } else {
            i15 = kcexrzcfyt(i13, i14) ? this.f21823cdpycssgdh : 0;
            if ((this.f21839zynmafqrjb & 4) <= 0) {
                return i15;
            }
            i16 = this.f21823cdpycssgdh;
        }
        return i15 + i16;
    }

    public void setAlignContent(int i13) {
        if (this.f21824cqumvgiudr != i13) {
            this.f21824cqumvgiudr = i13;
            requestLayout();
        }
    }

    public void setAlignItems(int i13) {
        if (this.f21828iwizpuwonk != i13) {
            this.f21828iwizpuwonk = i13;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f21830lereixgezr) {
            return;
        }
        this.f21830lereixgezr = drawable;
        if (drawable != null) {
            this.f21823cdpycssgdh = drawable.getIntrinsicHeight();
        } else {
            this.f21823cdpycssgdh = 0;
        }
        pmvmpeiblj();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f21833pmvmpeiblj) {
            return;
        }
        this.f21833pmvmpeiblj = drawable;
        if (drawable != null) {
            this.f21835yadqdtsiqt = drawable.getIntrinsicWidth();
        } else {
            this.f21835yadqdtsiqt = 0;
        }
        pmvmpeiblj();
        requestLayout();
    }

    public void setFlexDirection(int i13) {
        if (this.f21838zdlpuopuiu != i13) {
            this.f21838zdlpuopuiu = i13;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public void setFlexLines(List<zoijcleaow> list) {
        this.f21837ylkuphrtab = list;
    }

    public void setFlexWrap(int i13) {
        if (this.f21836yggfygwlhe != i13) {
            this.f21836yggfygwlhe = i13;
            requestLayout();
        }
    }

    public void setJustifyContent(int i13) {
        if (this.f21829jyumaefscl != i13) {
            this.f21829jyumaefscl = i13;
            requestLayout();
        }
    }

    public void setMaxLine(int i13) {
        if (this.f21825esjtqupxsv != i13) {
            this.f21825esjtqupxsv = i13;
            requestLayout();
        }
    }

    public void setShowDivider(int i13) {
        setShowDividerVertical(i13);
        setShowDividerHorizontal(i13);
    }

    public void setShowDividerHorizontal(int i13) {
        if (i13 != this.f21839zynmafqrjb) {
            this.f21839zynmafqrjb = i13;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i13) {
        if (i13 != this.f21827istkbnxepw) {
            this.f21827istkbnxepw = i13;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public boolean vdvldrhtss() {
        int i13 = this.f21838zdlpuopuiu;
        return i13 == 0 || i13 == 1;
    }

    @Override // com.google.android.flexbox.iobyxmoadg
    public void wflxmlrfwp(zoijcleaow zoijcleaowVar) {
        if (vdvldrhtss()) {
            if ((this.f21827istkbnxepw & 4) > 0) {
                int i13 = zoijcleaowVar.f21919eablkybsjg;
                int i14 = this.f21835yadqdtsiqt;
                zoijcleaowVar.f21919eablkybsjg = i13 + i14;
                zoijcleaowVar.f21921gxszxtbevo += i14;
                return;
            }
            return;
        }
        if ((this.f21839zynmafqrjb & 4) > 0) {
            int i15 = zoijcleaowVar.f21919eablkybsjg;
            int i16 = this.f21823cdpycssgdh;
            zoijcleaowVar.f21919eablkybsjg = i15 + i16;
            zoijcleaowVar.f21921gxszxtbevo += i16;
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f21825esjtqupxsv = -1;
        this.f21834wwaezpbzkn = new ppxfxbqfkf(this);
        this.f21837ylkuphrtab = new ArrayList();
        this.f21832pkzmftpjix = new ppxfxbqfkf.zoijcleaow();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wkgbmnqykc.FlexboxLayout, i13, 0);
        this.f21838zdlpuopuiu = typedArrayObtainStyledAttributes.getInt(wkgbmnqykc.FlexboxLayout_flexDirection, 0);
        this.f21836yggfygwlhe = typedArrayObtainStyledAttributes.getInt(wkgbmnqykc.FlexboxLayout_flexWrap, 0);
        this.f21829jyumaefscl = typedArrayObtainStyledAttributes.getInt(wkgbmnqykc.FlexboxLayout_justifyContent, 0);
        this.f21828iwizpuwonk = typedArrayObtainStyledAttributes.getInt(wkgbmnqykc.FlexboxLayout_alignItems, 0);
        this.f21824cqumvgiudr = typedArrayObtainStyledAttributes.getInt(wkgbmnqykc.FlexboxLayout_alignContent, 0);
        this.f21825esjtqupxsv = typedArrayObtainStyledAttributes.getInt(wkgbmnqykc.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(wkgbmnqykc.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(wkgbmnqykc.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(wkgbmnqykc.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i14 = typedArrayObtainStyledAttributes.getInt(wkgbmnqykc.FlexboxLayout_showDivider, 0);
        if (i14 != 0) {
            this.f21827istkbnxepw = i14;
            this.f21839zynmafqrjb = i14;
        }
        int i15 = typedArrayObtainStyledAttributes.getInt(wkgbmnqykc.FlexboxLayout_showDividerVertical, 0);
        if (i15 != 0) {
            this.f21827istkbnxepw = i15;
        }
        int i16 = typedArrayObtainStyledAttributes.getInt(wkgbmnqykc.FlexboxLayout_showDividerHorizontal, 0);
        if (i16 != 0) {
            this.f21839zynmafqrjb = i16;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private float f21840cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private int f21841esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private boolean f21842istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f21843iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private float f21844jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private int f21845lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private int f21846pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private float f21847yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f21848zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private int f21849zynmafqrjb;

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
            this.f21848zdlpuopuiu = 1;
            this.f21847yggfygwlhe = 0.0f;
            this.f21844jyumaefscl = 1.0f;
            this.f21843iwizpuwonk = -1;
            this.f21840cqumvgiudr = -1.0f;
            this.f21841esjtqupxsv = -1;
            this.f21845lereixgezr = -1;
            this.f21846pmvmpeiblj = 16777215;
            this.f21849zynmafqrjb = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wkgbmnqykc.FlexboxLayout_Layout);
            this.f21848zdlpuopuiu = typedArrayObtainStyledAttributes.getInt(wkgbmnqykc.FlexboxLayout_Layout_layout_order, 1);
            this.f21847yggfygwlhe = typedArrayObtainStyledAttributes.getFloat(wkgbmnqykc.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.f21844jyumaefscl = typedArrayObtainStyledAttributes.getFloat(wkgbmnqykc.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f21843iwizpuwonk = typedArrayObtainStyledAttributes.getInt(wkgbmnqykc.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f21840cqumvgiudr = typedArrayObtainStyledAttributes.getFraction(wkgbmnqykc.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f21841esjtqupxsv = typedArrayObtainStyledAttributes.getDimensionPixelSize(wkgbmnqykc.FlexboxLayout_Layout_layout_minWidth, -1);
            this.f21845lereixgezr = typedArrayObtainStyledAttributes.getDimensionPixelSize(wkgbmnqykc.FlexboxLayout_Layout_layout_minHeight, -1);
            this.f21846pmvmpeiblj = typedArrayObtainStyledAttributes.getDimensionPixelSize(wkgbmnqykc.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f21849zynmafqrjb = typedArrayObtainStyledAttributes.getDimensionPixelSize(wkgbmnqykc.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f21842istkbnxepw = typedArrayObtainStyledAttributes.getBoolean(wkgbmnqykc.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public int Y() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int a0() {
            return this.f21845lereixgezr;
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
            return this.f21844jyumaefscl;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int ezmngbhpjk() {
            return this.f21846pmvmpeiblj;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int g0() {
            return this.f21849zynmafqrjb;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.f21848zdlpuopuiu;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int hkdspvbjdz() {
            return this.f21843iwizpuwonk;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean hszhottldk() {
            return this.f21842istkbnxepw;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float iyctptxqzt() {
            return this.f21847yggfygwlhe;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float tbqsvytpvh() {
            return this.f21840cqumvgiudr;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int ulzqkzuiru() {
            return this.f21841esjtqupxsv;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void v(int i13) {
            this.f21841esjtqupxsv = i13;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int w() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            parcel.writeInt(this.f21848zdlpuopuiu);
            parcel.writeFloat(this.f21847yggfygwlhe);
            parcel.writeFloat(this.f21844jyumaefscl);
            parcel.writeInt(this.f21843iwizpuwonk);
            parcel.writeFloat(this.f21840cqumvgiudr);
            parcel.writeInt(this.f21841esjtqupxsv);
            parcel.writeInt(this.f21845lereixgezr);
            parcel.writeInt(this.f21846pmvmpeiblj);
            parcel.writeInt(this.f21849zynmafqrjb);
            parcel.writeByte(this.f21842istkbnxepw ? (byte) 1 : (byte) 0);
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
            this.f21845lereixgezr = i13;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f21848zdlpuopuiu = 1;
            this.f21847yggfygwlhe = 0.0f;
            this.f21844jyumaefscl = 1.0f;
            this.f21843iwizpuwonk = -1;
            this.f21840cqumvgiudr = -1.0f;
            this.f21841esjtqupxsv = -1;
            this.f21845lereixgezr = -1;
            this.f21846pmvmpeiblj = 16777215;
            this.f21849zynmafqrjb = 16777215;
            this.f21848zdlpuopuiu = layoutParams.f21848zdlpuopuiu;
            this.f21847yggfygwlhe = layoutParams.f21847yggfygwlhe;
            this.f21844jyumaefscl = layoutParams.f21844jyumaefscl;
            this.f21843iwizpuwonk = layoutParams.f21843iwizpuwonk;
            this.f21840cqumvgiudr = layoutParams.f21840cqumvgiudr;
            this.f21841esjtqupxsv = layoutParams.f21841esjtqupxsv;
            this.f21845lereixgezr = layoutParams.f21845lereixgezr;
            this.f21846pmvmpeiblj = layoutParams.f21846pmvmpeiblj;
            this.f21849zynmafqrjb = layoutParams.f21849zynmafqrjb;
            this.f21842istkbnxepw = layoutParams.f21842istkbnxepw;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f21848zdlpuopuiu = 1;
            this.f21847yggfygwlhe = 0.0f;
            this.f21844jyumaefscl = 1.0f;
            this.f21843iwizpuwonk = -1;
            this.f21840cqumvgiudr = -1.0f;
            this.f21841esjtqupxsv = -1;
            this.f21845lereixgezr = -1;
            this.f21846pmvmpeiblj = 16777215;
            this.f21849zynmafqrjb = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f21848zdlpuopuiu = 1;
            this.f21847yggfygwlhe = 0.0f;
            this.f21844jyumaefscl = 1.0f;
            this.f21843iwizpuwonk = -1;
            this.f21840cqumvgiudr = -1.0f;
            this.f21841esjtqupxsv = -1;
            this.f21845lereixgezr = -1;
            this.f21846pmvmpeiblj = 16777215;
            this.f21849zynmafqrjb = 16777215;
        }

        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            this.f21848zdlpuopuiu = 1;
            this.f21847yggfygwlhe = 0.0f;
            this.f21844jyumaefscl = 1.0f;
            this.f21843iwizpuwonk = -1;
            this.f21840cqumvgiudr = -1.0f;
            this.f21841esjtqupxsv = -1;
            this.f21845lereixgezr = -1;
            this.f21846pmvmpeiblj = 16777215;
            this.f21849zynmafqrjb = 16777215;
            this.f21848zdlpuopuiu = parcel.readInt();
            this.f21847yggfygwlhe = parcel.readFloat();
            this.f21844jyumaefscl = parcel.readFloat();
            this.f21843iwizpuwonk = parcel.readInt();
            this.f21840cqumvgiudr = parcel.readFloat();
            this.f21841esjtqupxsv = parcel.readInt();
            this.f21845lereixgezr = parcel.readInt();
            this.f21846pmvmpeiblj = parcel.readInt();
            this.f21849zynmafqrjb = parcel.readInt();
            this.f21842istkbnxepw = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
