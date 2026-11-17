package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import da.btonecajqb;
import da.draadjrbmk;
import da.dxjokdxxww;
import da.gtknphoqwx;
import da.wkgbmnqykc;
import java.util.Locale;
import kotlin.KotlinVersion;
import oa.ppxfxbqfkf;

/* JADX INFO: loaded from: classes2.dex */
public final class BadgeState {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    final int f22057btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    final int f22058dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final float f22059eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    int f22060gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    final float f22061gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final State f22062iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    final float f22063lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    final float f22064nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final float f22065ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final float f22066wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final State f22067zoijcleaow;

    BadgeState(Context context, int i13, int i14, int i15, State state) {
        State state2 = new State();
        this.f22067zoijcleaow = state2;
        state = state == null ? new State() : state;
        if (i13 != 0) {
            state.f22096zdlpuopuiu = i13;
        }
        TypedArray typedArrayIobyxmoadg = iobyxmoadg(context, state.f22096zdlpuopuiu, i14, i15);
        Resources resources = context.getResources();
        this.f22065ppxfxbqfkf = typedArrayIobyxmoadg.getDimensionPixelSize(draadjrbmk.Badge_badgeRadius, -1);
        this.f22058dxjokdxxww = context.getResources().getDimensionPixelSize(wkgbmnqykc.mtrl_badge_horizontal_edge_offset);
        this.f22057btonecajqb = context.getResources().getDimensionPixelSize(wkgbmnqykc.mtrl_badge_text_horizontal_edge_offset);
        this.f22066wkgbmnqykc = typedArrayIobyxmoadg.getDimensionPixelSize(draadjrbmk.Badge_badgeWithTextRadius, -1);
        this.f22059eablkybsjg = typedArrayIobyxmoadg.getDimension(draadjrbmk.Badge_badgeWidth, resources.getDimension(wkgbmnqykc.m3_badge_size));
        this.f22063lqeggnwhkg = typedArrayIobyxmoadg.getDimension(draadjrbmk.Badge_badgeWithTextWidth, resources.getDimension(wkgbmnqykc.m3_badge_with_text_size));
        this.f22061gxszxtbevo = typedArrayIobyxmoadg.getDimension(draadjrbmk.Badge_badgeHeight, resources.getDimension(wkgbmnqykc.m3_badge_size));
        this.f22064nufgyqmvbu = typedArrayIobyxmoadg.getDimension(draadjrbmk.Badge_badgeWithTextHeight, resources.getDimension(wkgbmnqykc.m3_badge_with_text_size));
        boolean z13 = true;
        this.f22060gtknphoqwx = typedArrayIobyxmoadg.getInt(draadjrbmk.Badge_offsetAlignmentMode, 1);
        state2.f22097zynmafqrjb = state.f22097zynmafqrjb == -2 ? KotlinVersion.MAX_COMPONENT_VALUE : state.f22097zynmafqrjb;
        if (state.f22068cdpycssgdh != -2) {
            state2.f22068cdpycssgdh = state.f22068cdpycssgdh;
        } else if (typedArrayIobyxmoadg.hasValue(draadjrbmk.Badge_number)) {
            state2.f22068cdpycssgdh = typedArrayIobyxmoadg.getInt(draadjrbmk.Badge_number, 0);
        } else {
            state2.f22068cdpycssgdh = -1;
        }
        if (state.f22076istkbnxepw != null) {
            state2.f22076istkbnxepw = state.f22076istkbnxepw;
        } else if (typedArrayIobyxmoadg.hasValue(draadjrbmk.Badge_badgeText)) {
            state2.f22076istkbnxepw = typedArrayIobyxmoadg.getString(draadjrbmk.Badge_badgeText);
        }
        state2.f22091wwaezpbzkn = state.f22091wwaezpbzkn;
        state2.f22095ylkuphrtab = state.f22095ylkuphrtab == null ? context.getString(btonecajqb.mtrl_badge_numberless_content_description) : state.f22095ylkuphrtab;
        state2.f22085pkzmftpjix = state.f22085pkzmftpjix == 0 ? dxjokdxxww.mtrl_badge_content_description : state.f22085pkzmftpjix;
        state2.f22073hcddaimhww = state.f22073hcddaimhww == 0 ? btonecajqb.mtrl_exceed_max_badge_number_content_description : state.f22073hcddaimhww;
        if (state.f22074hkdspvbjdz != null && !state.f22074hkdspvbjdz.booleanValue()) {
            z13 = false;
        }
        state2.f22074hkdspvbjdz = Boolean.valueOf(z13);
        state2.f22093yadqdtsiqt = state.f22093yadqdtsiqt == -2 ? typedArrayIobyxmoadg.getInt(draadjrbmk.Badge_maxCharacterCount, -2) : state.f22093yadqdtsiqt;
        state2.f22075iozdgvuglv = state.f22075iozdgvuglv == -2 ? typedArrayIobyxmoadg.getInt(draadjrbmk.Badge_maxNumber, -2) : state.f22075iozdgvuglv;
        state2.f22070cqumvgiudr = Integer.valueOf(state.f22070cqumvgiudr == null ? typedArrayIobyxmoadg.getResourceId(draadjrbmk.Badge_badgeShapeAppearance, gtknphoqwx.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.f22070cqumvgiudr.intValue());
        state2.f22072esjtqupxsv = Integer.valueOf(state.f22072esjtqupxsv == null ? typedArrayIobyxmoadg.getResourceId(draadjrbmk.Badge_badgeShapeAppearanceOverlay, 0) : state.f22072esjtqupxsv.intValue());
        state2.f22081lereixgezr = Integer.valueOf(state.f22081lereixgezr == null ? typedArrayIobyxmoadg.getResourceId(draadjrbmk.Badge_badgeWithTextShapeAppearance, gtknphoqwx.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.f22081lereixgezr.intValue());
        state2.f22086pmvmpeiblj = Integer.valueOf(state.f22086pmvmpeiblj == null ? typedArrayIobyxmoadg.getResourceId(draadjrbmk.Badge_badgeWithTextShapeAppearanceOverlay, 0) : state.f22086pmvmpeiblj.intValue());
        state2.f22094yggfygwlhe = Integer.valueOf(state.f22094yggfygwlhe == null ? lmojexxdyd(context, typedArrayIobyxmoadg, draadjrbmk.Badge_backgroundColor) : state.f22094yggfygwlhe.intValue());
        state2.f22077iwizpuwonk = Integer.valueOf(state.f22077iwizpuwonk == null ? typedArrayIobyxmoadg.getResourceId(draadjrbmk.Badge_badgeTextAppearance, gtknphoqwx.TextAppearance_MaterialComponents_Badge) : state.f22077iwizpuwonk.intValue());
        if (state.f22079jyumaefscl != null) {
            state2.f22079jyumaefscl = state.f22079jyumaefscl;
        } else if (typedArrayIobyxmoadg.hasValue(draadjrbmk.Badge_badgeTextColor)) {
            state2.f22079jyumaefscl = Integer.valueOf(lmojexxdyd(context, typedArrayIobyxmoadg, draadjrbmk.Badge_badgeTextColor));
        } else {
            state2.f22079jyumaefscl = Integer.valueOf(new oa.wkgbmnqykc(context, state2.f22077iwizpuwonk.intValue()).dxjokdxxww().getDefaultColor());
        }
        state2.f22078jpowsppfya = Integer.valueOf(state.f22078jpowsppfya == null ? typedArrayIobyxmoadg.getInt(draadjrbmk.Badge_badgeGravity, 8388661) : state.f22078jpowsppfya.intValue());
        state2.f22069cllcsxoeiz = Integer.valueOf(state.f22069cllcsxoeiz == null ? typedArrayIobyxmoadg.getDimensionPixelSize(draadjrbmk.Badge_badgeWidePadding, resources.getDimensionPixelSize(wkgbmnqykc.mtrl_badge_long_text_horizontal_padding)) : state.f22069cllcsxoeiz.intValue());
        state2.f22071dsvhmnatus = Integer.valueOf(state.f22071dsvhmnatus == null ? typedArrayIobyxmoadg.getDimensionPixelSize(draadjrbmk.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(wkgbmnqykc.m3_badge_with_text_vertical_padding)) : state.f22071dsvhmnatus.intValue());
        state2.f22092wypolnanlu = Integer.valueOf(state.f22092wypolnanlu == null ? typedArrayIobyxmoadg.getDimensionPixelOffset(draadjrbmk.Badge_horizontalOffset, 0) : state.f22092wypolnanlu.intValue());
        state2.f22088stevsuqkhv = Integer.valueOf(state.f22088stevsuqkhv == null ? typedArrayIobyxmoadg.getDimensionPixelOffset(draadjrbmk.Badge_verticalOffset, 0) : state.f22088stevsuqkhv.intValue());
        state2.f22080kegysxyocb = Integer.valueOf(state.f22080kegysxyocb == null ? typedArrayIobyxmoadg.getDimensionPixelOffset(draadjrbmk.Badge_horizontalOffsetWithText, state2.f22092wypolnanlu.intValue()) : state.f22080kegysxyocb.intValue());
        state2.f22089tzroggbefp = Integer.valueOf(state.f22089tzroggbefp == null ? typedArrayIobyxmoadg.getDimensionPixelOffset(draadjrbmk.Badge_verticalOffsetWithText, state2.f22088stevsuqkhv.intValue()) : state.f22089tzroggbefp.intValue());
        state2.f22090ulzqkzuiru = Integer.valueOf(state.f22090ulzqkzuiru == null ? typedArrayIobyxmoadg.getDimensionPixelOffset(draadjrbmk.Badge_largeFontVerticalOffsetAdjustment, 0) : state.f22090ulzqkzuiru.intValue());
        state2.f22083mbcevpiqjq = Integer.valueOf(state.f22083mbcevpiqjq == null ? 0 : state.f22083mbcevpiqjq.intValue());
        state2.f22084ntlheqmsrt = Integer.valueOf(state.f22084ntlheqmsrt == null ? 0 : state.f22084ntlheqmsrt.intValue());
        state2.f22087sopmlzcsov = Boolean.valueOf(state.f22087sopmlzcsov == null ? typedArrayIobyxmoadg.getBoolean(draadjrbmk.Badge_autoAdjustToWithinGrandparentBounds, false) : state.f22087sopmlzcsov.booleanValue());
        typedArrayIobyxmoadg.recycle();
        if (state.f22082lmojexxdyd == null) {
            state2.f22082lmojexxdyd = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.f22082lmojexxdyd = state.f22082lmojexxdyd;
        }
        this.f22062iobyxmoadg = state;
    }

    private TypedArray iobyxmoadg(Context context, int i13, int i14, int i15) {
        AttributeSet attributeSet;
        int styleAttribute;
        if (i13 != 0) {
            AttributeSet attributeSetDxjokdxxww = com.google.android.material.drawable.wkgbmnqykc.dxjokdxxww(context, i13, "badge");
            styleAttribute = attributeSetDxjokdxxww.getStyleAttribute();
            attributeSet = attributeSetDxjokdxxww;
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        return com.google.android.material.internal.draadjrbmk.dxjokdxxww(context, attributeSet, draadjrbmk.Badge, i14, styleAttribute == 0 ? i15 : styleAttribute, new int[0]);
    }

    private static int lmojexxdyd(Context context, TypedArray typedArray, int i13) {
        return ppxfxbqfkf.iobyxmoadg(context, typedArray, i13).getDefaultColor();
    }

    int agtfadlqog() {
        return this.f22067zoijcleaow.f22073hcddaimhww;
    }

    int btonecajqb() {
        return this.f22067zoijcleaow.f22079jyumaefscl.intValue();
    }

    boolean cdpycssgdh() {
        return this.f22067zoijcleaow.f22076istkbnxepw != null;
    }

    Locale cqumvgiudr() {
        return this.f22067zoijcleaow.f22082lmojexxdyd;
    }

    int draadjrbmk() {
        return this.f22067zoijcleaow.f22086pmvmpeiblj.intValue();
    }

    int dxjokdxxww() {
        return this.f22067zoijcleaow.f22070cqumvgiudr.intValue();
    }

    int eablkybsjg() {
        return this.f22067zoijcleaow.f22094yggfygwlhe.intValue();
    }

    String esjtqupxsv() {
        return this.f22067zoijcleaow.f22076istkbnxepw;
    }

    int gtknphoqwx() {
        return this.f22067zoijcleaow.f22071dsvhmnatus.intValue();
    }

    int gxszxtbevo() {
        return this.f22067zoijcleaow.f22078jpowsppfya.intValue();
    }

    boolean iozdgvuglv() {
        return this.f22067zoijcleaow.f22074hkdspvbjdz.booleanValue();
    }

    boolean istkbnxepw() {
        return this.f22067zoijcleaow.f22068cdpycssgdh != -1;
    }

    int iwizpuwonk() {
        return this.f22067zoijcleaow.f22068cdpycssgdh;
    }

    int jyumaefscl() {
        return this.f22067zoijcleaow.f22075iozdgvuglv;
    }

    int kcexrzcfyt() {
        return this.f22067zoijcleaow.f22092wypolnanlu.intValue();
    }

    int lereixgezr() {
        return this.f22067zoijcleaow.f22077iwizpuwonk.intValue();
    }

    int lqeggnwhkg() {
        return this.f22067zoijcleaow.f22069cllcsxoeiz.intValue();
    }

    int nufgyqmvbu() {
        return this.f22067zoijcleaow.f22072esjtqupxsv.intValue();
    }

    CharSequence ojitshcjhn() {
        return this.f22067zoijcleaow.f22091wwaezpbzkn;
    }

    int oxmwwwfdhm() {
        return this.f22067zoijcleaow.f22080kegysxyocb.intValue();
    }

    int pmvmpeiblj() {
        return this.f22067zoijcleaow.f22089tzroggbefp.intValue();
    }

    int ppxfxbqfkf() {
        return this.f22067zoijcleaow.f22084ntlheqmsrt.intValue();
    }

    CharSequence rgvfuqvkyq() {
        return this.f22067zoijcleaow.f22095ylkuphrtab;
    }

    int vdvldrhtss() {
        return this.f22067zoijcleaow.f22085pkzmftpjix;
    }

    int wflxmlrfwp() {
        return this.f22067zoijcleaow.f22081lereixgezr.intValue();
    }

    int wkgbmnqykc() {
        return this.f22067zoijcleaow.f22097zynmafqrjb;
    }

    void wwaezpbzkn(int i13) {
        this.f22062iobyxmoadg.f22097zynmafqrjb = i13;
        this.f22067zoijcleaow.f22097zynmafqrjb = i13;
    }

    boolean yadqdtsiqt() {
        return this.f22067zoijcleaow.f22087sopmlzcsov.booleanValue();
    }

    int yggfygwlhe() {
        return this.f22067zoijcleaow.f22093yadqdtsiqt;
    }

    int zdlpuopuiu() {
        return this.f22067zoijcleaow.f22090ulzqkzuiru.intValue();
    }

    int zoijcleaow() {
        return this.f22067zoijcleaow.f22083mbcevpiqjq.intValue();
    }

    int zynmafqrjb() {
        return this.f22067zoijcleaow.f22088stevsuqkhv.intValue();
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private int f22068cdpycssgdh;

        /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
        private Integer f22069cllcsxoeiz;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private Integer f22070cqumvgiudr;

        /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
        private Integer f22071dsvhmnatus;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private Integer f22072esjtqupxsv;

        /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
        private int f22073hcddaimhww;

        /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
        private Boolean f22074hkdspvbjdz;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private int f22075iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private String f22076istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private Integer f22077iwizpuwonk;

        /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
        private Integer f22078jpowsppfya;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private Integer f22079jyumaefscl;

        /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
        private Integer f22080kegysxyocb;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private Integer f22081lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        private Locale f22082lmojexxdyd;

        /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
        private Integer f22083mbcevpiqjq;

        /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
        private Integer f22084ntlheqmsrt;

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        private int f22085pkzmftpjix;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private Integer f22086pmvmpeiblj;

        /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
        private Boolean f22087sopmlzcsov;

        /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
        private Integer f22088stevsuqkhv;

        /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
        private Integer f22089tzroggbefp;

        /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
        private Integer f22090ulzqkzuiru;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        private CharSequence f22091wwaezpbzkn;

        /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
        private Integer f22092wypolnanlu;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private int f22093yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private Integer f22094yggfygwlhe;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        private CharSequence f22095ylkuphrtab;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f22096zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private int f22097zynmafqrjb;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public State[] newArray(int i13) {
                return new State[i13];
            }
        }

        public State() {
            this.f22097zynmafqrjb = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f22068cdpycssgdh = -2;
            this.f22093yadqdtsiqt = -2;
            this.f22075iozdgvuglv = -2;
            this.f22074hkdspvbjdz = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            parcel.writeInt(this.f22096zdlpuopuiu);
            parcel.writeSerializable(this.f22094yggfygwlhe);
            parcel.writeSerializable(this.f22079jyumaefscl);
            parcel.writeSerializable(this.f22077iwizpuwonk);
            parcel.writeSerializable(this.f22070cqumvgiudr);
            parcel.writeSerializable(this.f22072esjtqupxsv);
            parcel.writeSerializable(this.f22081lereixgezr);
            parcel.writeSerializable(this.f22086pmvmpeiblj);
            parcel.writeInt(this.f22097zynmafqrjb);
            parcel.writeString(this.f22076istkbnxepw);
            parcel.writeInt(this.f22068cdpycssgdh);
            parcel.writeInt(this.f22093yadqdtsiqt);
            parcel.writeInt(this.f22075iozdgvuglv);
            CharSequence charSequence = this.f22091wwaezpbzkn;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f22095ylkuphrtab;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f22085pkzmftpjix);
            parcel.writeSerializable(this.f22078jpowsppfya);
            parcel.writeSerializable(this.f22069cllcsxoeiz);
            parcel.writeSerializable(this.f22071dsvhmnatus);
            parcel.writeSerializable(this.f22092wypolnanlu);
            parcel.writeSerializable(this.f22088stevsuqkhv);
            parcel.writeSerializable(this.f22080kegysxyocb);
            parcel.writeSerializable(this.f22089tzroggbefp);
            parcel.writeSerializable(this.f22090ulzqkzuiru);
            parcel.writeSerializable(this.f22083mbcevpiqjq);
            parcel.writeSerializable(this.f22084ntlheqmsrt);
            parcel.writeSerializable(this.f22074hkdspvbjdz);
            parcel.writeSerializable(this.f22082lmojexxdyd);
            parcel.writeSerializable(this.f22087sopmlzcsov);
        }

        State(Parcel parcel) {
            this.f22097zynmafqrjb = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f22068cdpycssgdh = -2;
            this.f22093yadqdtsiqt = -2;
            this.f22075iozdgvuglv = -2;
            this.f22074hkdspvbjdz = Boolean.TRUE;
            this.f22096zdlpuopuiu = parcel.readInt();
            this.f22094yggfygwlhe = (Integer) parcel.readSerializable();
            this.f22079jyumaefscl = (Integer) parcel.readSerializable();
            this.f22077iwizpuwonk = (Integer) parcel.readSerializable();
            this.f22070cqumvgiudr = (Integer) parcel.readSerializable();
            this.f22072esjtqupxsv = (Integer) parcel.readSerializable();
            this.f22081lereixgezr = (Integer) parcel.readSerializable();
            this.f22086pmvmpeiblj = (Integer) parcel.readSerializable();
            this.f22097zynmafqrjb = parcel.readInt();
            this.f22076istkbnxepw = parcel.readString();
            this.f22068cdpycssgdh = parcel.readInt();
            this.f22093yadqdtsiqt = parcel.readInt();
            this.f22075iozdgvuglv = parcel.readInt();
            this.f22091wwaezpbzkn = parcel.readString();
            this.f22095ylkuphrtab = parcel.readString();
            this.f22085pkzmftpjix = parcel.readInt();
            this.f22078jpowsppfya = (Integer) parcel.readSerializable();
            this.f22069cllcsxoeiz = (Integer) parcel.readSerializable();
            this.f22071dsvhmnatus = (Integer) parcel.readSerializable();
            this.f22092wypolnanlu = (Integer) parcel.readSerializable();
            this.f22088stevsuqkhv = (Integer) parcel.readSerializable();
            this.f22080kegysxyocb = (Integer) parcel.readSerializable();
            this.f22089tzroggbefp = (Integer) parcel.readSerializable();
            this.f22090ulzqkzuiru = (Integer) parcel.readSerializable();
            this.f22083mbcevpiqjq = (Integer) parcel.readSerializable();
            this.f22084ntlheqmsrt = (Integer) parcel.readSerializable();
            this.f22074hkdspvbjdz = (Boolean) parcel.readSerializable();
            this.f22082lmojexxdyd = (Locale) parcel.readSerializable();
            this.f22087sopmlzcsov = (Boolean) parcel.readSerializable();
        }
    }
}
