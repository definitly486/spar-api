package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.internal.btonecajqb;
import com.google.android.material.internal.draadjrbmk;
import com.google.android.material.internal.ojitshcjhn;
import ea.gxszxtbevo;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.KotlinVersion;
import oa.ppxfxbqfkf;
import oa.wkgbmnqykc;
import pa.zoijcleaow;
import ra.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg extends lqeggnwhkg implements Drawable.Callback, btonecajqb.zoijcleaow {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f22464h = {R.attr.state_enabled};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ShapeDrawable f22465i = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22466a;

    /* JADX INFO: renamed from: ageimvtcrz, reason: collision with root package name */
    private int f22467ageimvtcrz;

    /* JADX INFO: renamed from: auzgnhcxok, reason: collision with root package name */
    private final Context f22468auzgnhcxok;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f22469b;

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private gxszxtbevo f22470bfopjjpdmp;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f22471c;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private float f22472crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private ColorStateList f22473czzsidtyhn;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextUtils.TruncateAt f22474d;

    /* JADX INFO: renamed from: dvvnrvtcbc, reason: collision with root package name */
    private final Paint f22475dvvnrvtcbc;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22476e;

    /* JADX INFO: renamed from: eslsurpljm, reason: collision with root package name */
    private PorterDuff.Mode f22477eslsurpljm;

    /* JADX INFO: renamed from: ezmngbhpjk, reason: collision with root package name */
    private ColorFilter f22478ezmngbhpjk;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22479f;

    /* JADX INFO: renamed from: fiwbwshyhd, reason: collision with root package name */
    private int f22480fiwbwshyhd;

    /* JADX INFO: renamed from: fmlbqenlif, reason: collision with root package name */
    private int f22481fmlbqenlif;

    /* JADX INFO: renamed from: fyldjkxazc, reason: collision with root package name */
    private int f22482fyldjkxazc;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22483g;

    /* JADX INFO: renamed from: grlcpdaxtj, reason: collision with root package name */
    private int f22484grlcpdaxtj;

    /* JADX INFO: renamed from: hszhottldk, reason: collision with root package name */
    private final btonecajqb f22485hszhottldk;

    /* JADX INFO: renamed from: igdgnonuha, reason: collision with root package name */
    private final RectF f22486igdgnonuha;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private ColorStateList f22487ikoacuggdj;

    /* JADX INFO: renamed from: ipoelvxyzq, reason: collision with root package name */
    private int f22488ipoelvxyzq;

    /* JADX INFO: renamed from: iwxlajgraz, reason: collision with root package name */
    private final Paint f22489iwxlajgraz;

    /* JADX INFO: renamed from: ixidwrxhsl, reason: collision with root package name */
    private boolean f22490ixidwrxhsl;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private float f22491iyctptxqzt;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private Drawable f22492jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private ColorStateList f22493jlmebxxoox;

    /* JADX INFO: renamed from: jrbgnlbqoe, reason: collision with root package name */
    private int f22494jrbgnlbqoe;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private boolean f22495jztzpxfvev;

    /* JADX INFO: renamed from: krqnebusok, reason: collision with root package name */
    private int[] f22496krqnebusok;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    private float f22497lrnfpwlwnk;

    /* JADX INFO: renamed from: lxfrhoxuzk, reason: collision with root package name */
    private final PointF f22498lxfrhoxuzk;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private ColorStateList f22499mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private Drawable f22500metgxyhuhe;

    /* JADX INFO: renamed from: mhtqkkgtqm, reason: collision with root package name */
    private int f22501mhtqkkgtqm;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private float f22502ntlheqmsrt;

    /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name */
    private float f22503nuxfzjnpeb;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private ColorStateList f22504oipsdeybqn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private float f22505okpsazkaxt;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private gxszxtbevo f22506opjhrmiecq;

    /* JADX INFO: renamed from: rhgxfdycjh, reason: collision with root package name */
    private PorterDuffColorFilter f22507rhgxfdycjh;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private CharSequence f22508ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private Drawable f22509rlfsiqarku;

    /* JADX INFO: renamed from: roivzttewh, reason: collision with root package name */
    private float f22510roivzttewh;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private boolean f22511sflfametgt;

    /* JADX INFO: renamed from: skhdrjzrfn, reason: collision with root package name */
    private final Paint.FontMetrics f22512skhdrjzrfn;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private ColorStateList f22513sopmlzcsov;

    /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name */
    private float f22514tbqsvytpvh;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private ColorStateList f22515tzroggbefp;

    /* JADX INFO: renamed from: uawqvzlxes, reason: collision with root package name */
    private float f22516uawqvzlxes;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private float f22517ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private float f22518uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private boolean f22519vipkmwdibw;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    private float f22520weqkydbzbr;

    /* JADX INFO: renamed from: wizcaqwiak, reason: collision with root package name */
    private final Path f22521wizcaqwiak;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private boolean f22522xrmfcynszj;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private boolean f22523ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private CharSequence f22524yfnezrywwk;

    /* JADX INFO: renamed from: yzdjzghtvl, reason: collision with root package name */
    private ColorStateList f22525yzdjzghtvl;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    private float f22526zeieaojujs;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private Drawable f22527zfvoamnweg;

    /* JADX INFO: renamed from: com.google.android.material.chip.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC0397iobyxmoadg {
        void iobyxmoadg();
    }

    private iobyxmoadg(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.f22517ulzqkzuiru = -1.0f;
        this.f22489iwxlajgraz = new Paint(1);
        this.f22512skhdrjzrfn = new Paint.FontMetrics();
        this.f22486igdgnonuha = new RectF();
        this.f22498lxfrhoxuzk = new PointF();
        this.f22521wizcaqwiak = new Path();
        this.f22481fmlbqenlif = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f22477eslsurpljm = PorterDuff.Mode.SRC_IN;
        this.f22471c = new WeakReference(null);
        hkdspvbjdz(context);
        this.f22468auzgnhcxok = context;
        btonecajqb btonecajqbVar = new btonecajqb(this);
        this.f22485hszhottldk = btonecajqbVar;
        this.f22508ribwqtqdhb = "";
        btonecajqbVar.lqeggnwhkg().density = context.getResources().getDisplayMetrics().density;
        this.f22475dvvnrvtcbc = null;
        int[] iArr = f22464h;
        setState(iArr);
        r0(iArr);
        this.f22476e = true;
        if (zoijcleaow.f76259iobyxmoadg) {
            f22465i.setTint(-1);
        }
    }

    private void A(AttributeSet attributeSet, int i13, int i14) {
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(this.f22468auzgnhcxok, attributeSet, da.draadjrbmk.Chip, i13, i14, new int[0]);
        this.f22483g = typedArrayDxjokdxxww.hasValue(da.draadjrbmk.Chip_shapeAppearance);
        h0(ppxfxbqfkf.iobyxmoadg(this.f22468auzgnhcxok, typedArrayDxjokdxxww, da.draadjrbmk.Chip_chipSurfaceColor));
        L(ppxfxbqfkf.iobyxmoadg(this.f22468auzgnhcxok, typedArrayDxjokdxxww, da.draadjrbmk.Chip_chipBackgroundColor));
        Z(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_chipMinHeight, 0.0f));
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.Chip_chipCornerRadius)) {
            N(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_chipCornerRadius, 0.0f));
        }
        d0(ppxfxbqfkf.iobyxmoadg(this.f22468auzgnhcxok, typedArrayDxjokdxxww, da.draadjrbmk.Chip_chipStrokeColor));
        f0(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_chipStrokeWidth, 0.0f));
        E0(ppxfxbqfkf.iobyxmoadg(this.f22468auzgnhcxok, typedArrayDxjokdxxww, da.draadjrbmk.Chip_rippleColor));
        J0(typedArrayDxjokdxxww.getText(da.draadjrbmk.Chip_android_text));
        wkgbmnqykc wkgbmnqykcVarLqeggnwhkg = ppxfxbqfkf.lqeggnwhkg(this.f22468auzgnhcxok, typedArrayDxjokdxxww, da.draadjrbmk.Chip_android_textAppearance);
        wkgbmnqykcVarLqeggnwhkg.draadjrbmk(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_android_textSize, wkgbmnqykcVarLqeggnwhkg.btonecajqb()));
        K0(wkgbmnqykcVarLqeggnwhkg);
        int i15 = typedArrayDxjokdxxww.getInt(da.draadjrbmk.Chip_android_ellipsize, 0);
        if (i15 == 1) {
            w0(TextUtils.TruncateAt.START);
        } else if (i15 == 2) {
            w0(TextUtils.TruncateAt.MIDDLE);
        } else if (i15 == 3) {
            w0(TextUtils.TruncateAt.END);
        }
        Y(typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            Y(typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.Chip_chipIconEnabled, false));
        }
        R(ppxfxbqfkf.wkgbmnqykc(this.f22468auzgnhcxok, typedArrayDxjokdxxww, da.draadjrbmk.Chip_chipIcon));
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.Chip_chipIconTint)) {
            V(ppxfxbqfkf.iobyxmoadg(this.f22468auzgnhcxok, typedArrayDxjokdxxww, da.draadjrbmk.Chip_chipIconTint));
        }
        T(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_chipIconSize, -1.0f));
        u0(typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            u0(typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.Chip_closeIconEnabled, false));
        }
        i0(ppxfxbqfkf.wkgbmnqykc(this.f22468auzgnhcxok, typedArrayDxjokdxxww, da.draadjrbmk.Chip_closeIcon));
        s0(ppxfxbqfkf.iobyxmoadg(this.f22468auzgnhcxok, typedArrayDxjokdxxww, da.draadjrbmk.Chip_closeIconTint));
        n0(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_closeIconSize, 0.0f));
        D(typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.Chip_android_checkable, false));
        K(typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            K(typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.Chip_checkedIconEnabled, false));
        }
        F(ppxfxbqfkf.wkgbmnqykc(this.f22468auzgnhcxok, typedArrayDxjokdxxww, da.draadjrbmk.Chip_checkedIcon));
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.Chip_checkedIconTint)) {
            H(ppxfxbqfkf.iobyxmoadg(this.f22468auzgnhcxok, typedArrayDxjokdxxww, da.draadjrbmk.Chip_checkedIconTint));
        }
        H0(gxszxtbevo.zoijcleaow(this.f22468auzgnhcxok, typedArrayDxjokdxxww, da.draadjrbmk.Chip_showMotionSpec));
        x0(gxszxtbevo.zoijcleaow(this.f22468auzgnhcxok, typedArrayDxjokdxxww, da.draadjrbmk.Chip_hideMotionSpec));
        b0(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_chipStartPadding, 0.0f));
        B0(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_iconStartPadding, 0.0f));
        z0(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_iconEndPadding, 0.0f));
        P0(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_textStartPadding, 0.0f));
        M0(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_textEndPadding, 0.0f));
        p0(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_closeIconStartPadding, 0.0f));
        k0(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_closeIconEndPadding, 0.0f));
        P(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_chipEndPadding, 0.0f));
        D0(typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.Chip_android_maxWidth, Integer.MAX_VALUE));
        typedArrayDxjokdxxww.recycle();
    }

    private boolean C(int[] iArr, int[] iArr2) {
        boolean z13;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f22515tzroggbefp;
        int iDraadjrbmk = draadjrbmk(colorStateList != null ? colorStateList.getColorForState(iArr, this.f22480fiwbwshyhd) : 0);
        boolean state = true;
        if (this.f22480fiwbwshyhd != iDraadjrbmk) {
            this.f22480fiwbwshyhd = iDraadjrbmk;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f22499mbcevpiqjq;
        int iDraadjrbmk2 = draadjrbmk(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f22467ageimvtcrz) : 0);
        if (this.f22467ageimvtcrz != iDraadjrbmk2) {
            this.f22467ageimvtcrz = iDraadjrbmk2;
            zOnStateChange = true;
        }
        int iDxjokdxxww = ia.iobyxmoadg.dxjokdxxww(iDraadjrbmk, iDraadjrbmk2);
        if ((this.f22482fyldjkxazc != iDxjokdxxww) | (cqumvgiudr() == null)) {
            this.f22482fyldjkxazc = iDxjokdxxww;
            crxdokpmqz(ColorStateList.valueOf(iDxjokdxxww));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f22513sopmlzcsov;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f22488ipoelvxyzq) : 0;
        if (this.f22488ipoelvxyzq != colorForState) {
            this.f22488ipoelvxyzq = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f22469b == null || !zoijcleaow.eablkybsjg(iArr)) ? 0 : this.f22469b.getColorForState(iArr, this.f22484grlcpdaxtj);
        if (this.f22484grlcpdaxtj != colorForState2) {
            this.f22484grlcpdaxtj = colorForState2;
            if (this.f22466a) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f22485hszhottldk.eablkybsjg() == null || this.f22485hszhottldk.eablkybsjg().dxjokdxxww() == null) ? 0 : this.f22485hszhottldk.eablkybsjg().dxjokdxxww().getColorForState(iArr, this.f22501mhtqkkgtqm);
        if (this.f22501mhtqkkgtqm != colorForState3) {
            this.f22501mhtqkkgtqm = colorForState3;
            zOnStateChange = true;
        }
        boolean z14 = t(getState(), R.attr.state_checked) && this.f22523ydmasvzmpa;
        if (this.f22490ixidwrxhsl == z14 || this.f22527zfvoamnweg == null) {
            z13 = false;
        } else {
            float fZfvoamnweg = zfvoamnweg();
            this.f22490ixidwrxhsl = z14;
            if (fZfvoamnweg != zfvoamnweg()) {
                zOnStateChange = true;
                z13 = true;
            } else {
                z13 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f22525yzdjzghtvl;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f22494jrbgnlbqoe) : 0;
        if (this.f22494jrbgnlbqoe != colorForState4) {
            this.f22494jrbgnlbqoe = colorForState4;
            this.f22507rhgxfdycjh = com.google.android.material.drawable.wkgbmnqykc.draadjrbmk(this, this.f22525yzdjzghtvl, this.f22477eslsurpljm);
        } else {
            state = zOnStateChange;
        }
        if (y(this.f22492jhduphickx)) {
            state |= this.f22492jhduphickx.setState(iArr);
        }
        if (y(this.f22527zfvoamnweg)) {
            state |= this.f22527zfvoamnweg.setState(iArr);
        }
        if (y(this.f22500metgxyhuhe)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f22500metgxyhuhe.setState(iArr3);
        }
        if (zoijcleaow.f76259iobyxmoadg && y(this.f22509rlfsiqarku)) {
            state |= this.f22509rlfsiqarku.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z13) {
            B();
        }
        return state;
    }

    private boolean T0() {
        return this.f22511sflfametgt && this.f22527zfvoamnweg != null && this.f22490ixidwrxhsl;
    }

    private boolean U0() {
        return this.f22519vipkmwdibw && this.f22492jhduphickx != null;
    }

    private boolean V0() {
        return this.f22522xrmfcynszj && this.f22500metgxyhuhe != null;
    }

    private void W0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void X0() {
        this.f22469b = this.f22466a ? zoijcleaow.wkgbmnqykc(this.f22493jlmebxxoox) : null;
    }

    private void Y0() {
        this.f22509rlfsiqarku = new RippleDrawable(zoijcleaow.wkgbmnqykc(l()), this.f22500metgxyhuhe, f22465i);
    }

    private void auzgnhcxok(Canvas canvas, Rect rect) {
        if (U0()) {
            sflfametgt(rect, this.f22486igdgnonuha);
            RectF rectF = this.f22486igdgnonuha;
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas.translate(f13, f14);
            this.f22492jhduphickx.setBounds(0, 0, (int) this.f22486igdgnonuha.width(), (int) this.f22486igdgnonuha.height());
            this.f22492jhduphickx.draw(canvas);
            canvas.translate(-f13, -f14);
        }
    }

    private void bfopjjpdmp(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (V0()) {
            float f13 = this.f22516uawqvzlxes + this.f22510roivzttewh;
            if (k1.iobyxmoadg.gxszxtbevo(this) == 0) {
                float f14 = rect.right - f13;
                rectF.right = f14;
                rectF.left = f14 - this.f22518uwvvkdfqfp;
            } else {
                float f15 = rect.left + f13;
                rectF.left = f15;
                rectF.right = f15 + this.f22518uwvvkdfqfp;
            }
            float fExactCenterY = rect.exactCenterY();
            float f16 = this.f22518uwvvkdfqfp;
            float f17 = fExactCenterY - (f16 / 2.0f);
            rectF.top = f17;
            rectF.bottom = f17 + f16;
        }
    }

    private void dvvnrvtcbc(Canvas canvas, Rect rect) {
        if (this.f22483g) {
            return;
        }
        this.f22489iwxlajgraz.setColor(this.f22480fiwbwshyhd);
        this.f22489iwxlajgraz.setStyle(Paint.Style.FILL);
        this.f22486igdgnonuha.set(rect);
        canvas.drawRoundRect(this.f22486igdgnonuha, fyldjkxazc(), fyldjkxazc(), this.f22489iwxlajgraz);
    }

    private float f() {
        Drawable drawable = this.f22490ixidwrxhsl ? this.f22527zfvoamnweg : this.f22492jhduphickx;
        float fCeil = this.f22505okpsazkaxt;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(ojitshcjhn.ppxfxbqfkf(this.f22468auzgnhcxok, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float g() {
        Drawable drawable = this.f22490ixidwrxhsl ? this.f22527zfvoamnweg : this.f22492jhduphickx;
        float f13 = this.f22505okpsazkaxt;
        return (f13 > 0.0f || drawable == null) ? f13 : drawable.getIntrinsicWidth();
    }

    private void h0(ColorStateList colorStateList) {
        if (this.f22515tzroggbefp != colorStateList) {
            this.f22515tzroggbefp = colorStateList;
            onStateChange(getState());
        }
    }

    private void igdgnonuha(Canvas canvas, Rect rect) {
        this.f22489iwxlajgraz.setColor(this.f22484grlcpdaxtj);
        this.f22489iwxlajgraz.setStyle(Paint.Style.FILL);
        this.f22486igdgnonuha.set(rect);
        if (!this.f22483g) {
            canvas.drawRoundRect(this.f22486igdgnonuha, fyldjkxazc(), fyldjkxazc(), this.f22489iwxlajgraz);
        } else {
            nufgyqmvbu(new RectF(rect), this.f22521wizcaqwiak);
            super.rgvfuqvkyq(canvas, this.f22489iwxlajgraz, this.f22521wizcaqwiak, yggfygwlhe());
        }
    }

    private void iwxlajgraz(Canvas canvas, Rect rect) {
        if (this.f22472crxdokpmqz <= 0.0f || this.f22483g) {
            return;
        }
        this.f22489iwxlajgraz.setColor(this.f22488ipoelvxyzq);
        this.f22489iwxlajgraz.setStyle(Paint.Style.STROKE);
        if (!this.f22483g) {
            this.f22489iwxlajgraz.setColorFilter(r());
        }
        RectF rectF = this.f22486igdgnonuha;
        float f13 = rect.left;
        float f14 = this.f22472crxdokpmqz;
        rectF.set(f13 + (f14 / 2.0f), rect.top + (f14 / 2.0f), rect.right - (f14 / 2.0f), rect.bottom - (f14 / 2.0f));
        float f15 = this.f22517ulzqkzuiru - (this.f22472crxdokpmqz / 2.0f);
        canvas.drawRoundRect(this.f22486igdgnonuha, f15, f15, this.f22489iwxlajgraz);
    }

    private float lrnfpwlwnk() {
        this.f22485hszhottldk.lqeggnwhkg().getFontMetrics(this.f22512skhdrjzrfn);
        Paint.FontMetrics fontMetrics = this.f22512skhdrjzrfn;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private void lxfrhoxuzk(Canvas canvas, Rect rect) {
        Paint paint = this.f22475dvvnrvtcbc;
        if (paint != null) {
            paint.setColor(j1.ppxfxbqfkf.gtknphoqwx(-16777216, 127));
            canvas.drawRect(rect, this.f22475dvvnrvtcbc);
            if (U0() || T0()) {
                sflfametgt(rect, this.f22486igdgnonuha);
                canvas.drawRect(this.f22486igdgnonuha, this.f22475dvvnrvtcbc);
            }
            if (this.f22508ribwqtqdhb != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f22475dvvnrvtcbc);
            }
            if (V0()) {
                bfopjjpdmp(rect, this.f22486igdgnonuha);
                canvas.drawRect(this.f22486igdgnonuha, this.f22475dvvnrvtcbc);
            }
            this.f22475dvvnrvtcbc.setColor(j1.ppxfxbqfkf.gtknphoqwx(-65536, 127));
            oipsdeybqn(rect, this.f22486igdgnonuha);
            canvas.drawRect(this.f22486igdgnonuha, this.f22475dvvnrvtcbc);
            this.f22475dvvnrvtcbc.setColor(j1.ppxfxbqfkf.gtknphoqwx(-16711936, 127));
            opjhrmiecq(rect, this.f22486igdgnonuha);
            canvas.drawRect(this.f22486igdgnonuha, this.f22475dvvnrvtcbc);
        }
    }

    private boolean nuxfzjnpeb() {
        return this.f22511sflfametgt && this.f22527zfvoamnweg != null && this.f22523ydmasvzmpa;
    }

    private void oipsdeybqn(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (V0()) {
            float f13 = this.f22516uawqvzlxes + this.f22510roivzttewh + this.f22518uwvvkdfqfp + this.f22514tbqsvytpvh + this.f22503nuxfzjnpeb;
            if (k1.iobyxmoadg.gxszxtbevo(this) == 0) {
                rectF.right = rect.right - f13;
            } else {
                rectF.left = rect.left + f13;
            }
        }
    }

    private void opjhrmiecq(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (V0()) {
            float f13 = this.f22516uawqvzlxes + this.f22510roivzttewh + this.f22518uwvvkdfqfp + this.f22514tbqsvytpvh + this.f22503nuxfzjnpeb;
            if (k1.iobyxmoadg.gxszxtbevo(this) == 0) {
                float f14 = rect.right;
                rectF.right = f14;
                rectF.left = f14 - f13;
            } else {
                int i13 = rect.left;
                rectF.left = i13;
                rectF.right = i13 + f13;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private ColorFilter r() {
        ColorFilter colorFilter = this.f22478ezmngbhpjk;
        return colorFilter != null ? colorFilter : this.f22507rhgxfdycjh;
    }

    private void roivzttewh(Canvas canvas, Rect rect) {
        if (T0()) {
            sflfametgt(rect, this.f22486igdgnonuha);
            RectF rectF = this.f22486igdgnonuha;
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas.translate(f13, f14);
            this.f22527zfvoamnweg.setBounds(0, 0, (int) this.f22486igdgnonuha.width(), (int) this.f22486igdgnonuha.height());
            this.f22527zfvoamnweg.draw(canvas);
            canvas.translate(-f13, -f14);
        }
    }

    private void sflfametgt(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (U0() || T0()) {
            float f13 = this.f22491iyctptxqzt + this.f22520weqkydbzbr;
            float fG = g();
            if (k1.iobyxmoadg.gxszxtbevo(this) == 0) {
                float f14 = rect.left + f13;
                rectF.left = f14;
                rectF.right = f14 + fG;
            } else {
                float f15 = rect.right - f13;
                rectF.right = f15;
                rectF.left = f15 - fG;
            }
            float f16 = f();
            float fExactCenterY = rect.exactCenterY() - (f16 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + f16;
        }
    }

    private void skhdrjzrfn(Canvas canvas, Rect rect) {
        if (V0()) {
            bfopjjpdmp(rect, this.f22486igdgnonuha);
            RectF rectF = this.f22486igdgnonuha;
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas.translate(f13, f14);
            this.f22500metgxyhuhe.setBounds(0, 0, (int) this.f22486igdgnonuha.width(), (int) this.f22486igdgnonuha.height());
            if (zoijcleaow.f76259iobyxmoadg) {
                this.f22509rlfsiqarku.setBounds(this.f22500metgxyhuhe.getBounds());
                this.f22509rlfsiqarku.jumpToCurrentState();
                this.f22509rlfsiqarku.draw(canvas);
            } else {
                this.f22500metgxyhuhe.draw(canvas);
            }
            canvas.translate(-f13, -f14);
        }
    }

    private static boolean t(int[] iArr, int i13) {
        if (iArr == null) {
            return false;
        }
        for (int i14 : iArr) {
            if (i14 == i13) {
                return true;
            }
        }
        return false;
    }

    public static iobyxmoadg tbqsvytpvh(Context context, AttributeSet attributeSet, int i13, int i14) {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(context, attributeSet, i13, i14);
        iobyxmoadgVar.A(attributeSet, i13, i14);
        return iobyxmoadgVar;
    }

    private void uawqvzlxes(Canvas canvas, Rect rect) {
        if (this.f22483g) {
            return;
        }
        this.f22489iwxlajgraz.setColor(this.f22467ageimvtcrz);
        this.f22489iwxlajgraz.setStyle(Paint.Style.FILL);
        this.f22489iwxlajgraz.setColorFilter(r());
        this.f22486igdgnonuha.set(rect);
        canvas.drawRoundRect(this.f22486igdgnonuha, fyldjkxazc(), fyldjkxazc(), this.f22489iwxlajgraz);
    }

    private void weqkydbzbr(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f22508ribwqtqdhb != null) {
            float fZfvoamnweg = this.f22491iyctptxqzt + zfvoamnweg() + this.f22526zeieaojujs;
            float fIyctptxqzt = this.f22516uawqvzlxes + iyctptxqzt() + this.f22503nuxfzjnpeb;
            if (k1.iobyxmoadg.gxszxtbevo(this) == 0) {
                rectF.left = rect.left + fZfvoamnweg;
                rectF.right = rect.right - fIyctptxqzt;
            } else {
                rectF.left = rect.left + fIyctptxqzt;
                rectF.right = rect.right - fZfvoamnweg;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void wizcaqwiak(Canvas canvas, Rect rect) {
        if (this.f22508ribwqtqdhb != null) {
            Paint.Align alignZeieaojujs = zeieaojujs(rect, this.f22498lxfrhoxuzk);
            weqkydbzbr(rect, this.f22486igdgnonuha);
            if (this.f22485hszhottldk.eablkybsjg() != null) {
                this.f22485hszhottldk.lqeggnwhkg().drawableState = getState();
                this.f22485hszhottldk.agtfadlqog(this.f22468auzgnhcxok);
            }
            this.f22485hszhottldk.lqeggnwhkg().setTextAlign(alignZeieaojujs);
            int iSave = 0;
            boolean z13 = Math.round(this.f22485hszhottldk.nufgyqmvbu(n().toString())) > Math.round(this.f22486igdgnonuha.width());
            if (z13) {
                iSave = canvas.save();
                canvas.clipRect(this.f22486igdgnonuha);
            }
            CharSequence charSequenceEllipsize = this.f22508ribwqtqdhb;
            if (z13 && this.f22474d != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f22485hszhottldk.lqeggnwhkg(), this.f22486igdgnonuha.width(), this.f22474d);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f22498lxfrhoxuzk;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f22485hszhottldk.lqeggnwhkg());
            if (z13) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private static boolean x(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean y(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private void ydmasvzmpa(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        k1.iobyxmoadg.wflxmlrfwp(drawable, k1.iobyxmoadg.gxszxtbevo(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f22500metgxyhuhe) {
            if (drawable.isStateful()) {
                drawable.setState(c());
            }
            k1.iobyxmoadg.ojitshcjhn(drawable, this.f22473czzsidtyhn);
            return;
        }
        Drawable drawable2 = this.f22492jhduphickx;
        if (drawable == drawable2 && this.f22495jztzpxfvev) {
            k1.iobyxmoadg.ojitshcjhn(drawable2, this.f22487ikoacuggdj);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private static boolean z(wkgbmnqykc wkgbmnqykcVar) {
        return (wkgbmnqykcVar == null || wkgbmnqykcVar.dxjokdxxww() == null || !wkgbmnqykcVar.dxjokdxxww().isStateful()) ? false : true;
    }

    public void A0(int i13) {
        z0(this.f22468auzgnhcxok.getResources().getDimension(i13));
    }

    protected void B() {
        InterfaceC0397iobyxmoadg interfaceC0397iobyxmoadg = (InterfaceC0397iobyxmoadg) this.f22471c.get();
        if (interfaceC0397iobyxmoadg != null) {
            interfaceC0397iobyxmoadg.iobyxmoadg();
        }
    }

    public void B0(float f13) {
        if (this.f22520weqkydbzbr != f13) {
            float fZfvoamnweg = zfvoamnweg();
            this.f22520weqkydbzbr = f13;
            float fZfvoamnweg2 = zfvoamnweg();
            invalidateSelf();
            if (fZfvoamnweg != fZfvoamnweg2) {
                B();
            }
        }
    }

    public void C0(int i13) {
        B0(this.f22468auzgnhcxok.getResources().getDimension(i13));
    }

    public void D(boolean z13) {
        if (this.f22523ydmasvzmpa != z13) {
            this.f22523ydmasvzmpa = z13;
            float fZfvoamnweg = zfvoamnweg();
            if (!z13 && this.f22490ixidwrxhsl) {
                this.f22490ixidwrxhsl = false;
            }
            float fZfvoamnweg2 = zfvoamnweg();
            invalidateSelf();
            if (fZfvoamnweg != fZfvoamnweg2) {
                B();
            }
        }
    }

    public void D0(int i13) {
        this.f22479f = i13;
    }

    public void E(int i13) {
        D(this.f22468auzgnhcxok.getResources().getBoolean(i13));
    }

    public void E0(ColorStateList colorStateList) {
        if (this.f22493jlmebxxoox != colorStateList) {
            this.f22493jlmebxxoox = colorStateList;
            X0();
            onStateChange(getState());
        }
    }

    public void F(Drawable drawable) {
        if (this.f22527zfvoamnweg != drawable) {
            float fZfvoamnweg = zfvoamnweg();
            this.f22527zfvoamnweg = drawable;
            float fZfvoamnweg2 = zfvoamnweg();
            W0(this.f22527zfvoamnweg);
            ydmasvzmpa(this.f22527zfvoamnweg);
            invalidateSelf();
            if (fZfvoamnweg != fZfvoamnweg2) {
                B();
            }
        }
    }

    public void F0(int i13) {
        E0(nufgyqmvbu.iobyxmoadg.iobyxmoadg(this.f22468auzgnhcxok, i13));
    }

    public void G(int i13) {
        F(nufgyqmvbu.iobyxmoadg.zoijcleaow(this.f22468auzgnhcxok, i13));
    }

    void G0(boolean z13) {
        this.f22476e = z13;
    }

    public void H(ColorStateList colorStateList) {
        if (this.f22504oipsdeybqn != colorStateList) {
            this.f22504oipsdeybqn = colorStateList;
            if (nuxfzjnpeb()) {
                k1.iobyxmoadg.ojitshcjhn(this.f22527zfvoamnweg, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void H0(gxszxtbevo gxszxtbevoVar) {
        this.f22470bfopjjpdmp = gxszxtbevoVar;
    }

    public void I(int i13) {
        H(nufgyqmvbu.iobyxmoadg.iobyxmoadg(this.f22468auzgnhcxok, i13));
    }

    public void I0(int i13) {
        H0(gxszxtbevo.ppxfxbqfkf(this.f22468auzgnhcxok, i13));
    }

    public void J(int i13) {
        K(this.f22468auzgnhcxok.getResources().getBoolean(i13));
    }

    public void J0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f22508ribwqtqdhb, charSequence)) {
            return;
        }
        this.f22508ribwqtqdhb = charSequence;
        this.f22485hszhottldk.wflxmlrfwp(true);
        invalidateSelf();
        B();
    }

    public void K(boolean z13) {
        if (this.f22511sflfametgt != z13) {
            boolean zT0 = T0();
            this.f22511sflfametgt = z13;
            boolean zT1 = T0();
            if (zT0 != zT1) {
                if (zT1) {
                    ydmasvzmpa(this.f22527zfvoamnweg);
                } else {
                    W0(this.f22527zfvoamnweg);
                }
                invalidateSelf();
                B();
            }
        }
    }

    public void K0(wkgbmnqykc wkgbmnqykcVar) {
        this.f22485hszhottldk.gtknphoqwx(wkgbmnqykcVar, this.f22468auzgnhcxok);
    }

    public void L(ColorStateList colorStateList) {
        if (this.f22499mbcevpiqjq != colorStateList) {
            this.f22499mbcevpiqjq = colorStateList;
            onStateChange(getState());
        }
    }

    public void L0(int i13) {
        K0(new wkgbmnqykc(this.f22468auzgnhcxok, i13));
    }

    public void M(int i13) {
        L(nufgyqmvbu.iobyxmoadg.iobyxmoadg(this.f22468auzgnhcxok, i13));
    }

    public void M0(float f13) {
        if (this.f22503nuxfzjnpeb != f13) {
            this.f22503nuxfzjnpeb = f13;
            invalidateSelf();
            B();
        }
    }

    public void N(float f13) {
        if (this.f22517ulzqkzuiru != f13) {
            this.f22517ulzqkzuiru = f13;
            setShapeAppearanceModel(cdpycssgdh().iwizpuwonk(f13));
        }
    }

    public void N0(int i13) {
        M0(this.f22468auzgnhcxok.getResources().getDimension(i13));
    }

    public void O(int i13) {
        N(this.f22468auzgnhcxok.getResources().getDimension(i13));
    }

    public void O0(float f13) {
        wkgbmnqykc wkgbmnqykcVarO = o();
        if (wkgbmnqykcVarO != null) {
            wkgbmnqykcVarO.draadjrbmk(f13);
            this.f22485hszhottldk.lqeggnwhkg().setTextSize(f13);
            iobyxmoadg();
        }
    }

    public void P(float f13) {
        if (this.f22516uawqvzlxes != f13) {
            this.f22516uawqvzlxes = f13;
            invalidateSelf();
            B();
        }
    }

    public void P0(float f13) {
        if (this.f22526zeieaojujs != f13) {
            this.f22526zeieaojujs = f13;
            invalidateSelf();
            B();
        }
    }

    public void Q(int i13) {
        P(this.f22468auzgnhcxok.getResources().getDimension(i13));
    }

    public void Q0(int i13) {
        P0(this.f22468auzgnhcxok.getResources().getDimension(i13));
    }

    public void R(Drawable drawable) {
        Drawable drawableGrlcpdaxtj = grlcpdaxtj();
        if (drawableGrlcpdaxtj != drawable) {
            float fZfvoamnweg = zfvoamnweg();
            this.f22492jhduphickx = drawable != null ? k1.iobyxmoadg.oxmwwwfdhm(drawable).mutate() : null;
            float fZfvoamnweg2 = zfvoamnweg();
            W0(drawableGrlcpdaxtj);
            if (U0()) {
                ydmasvzmpa(this.f22492jhduphickx);
            }
            invalidateSelf();
            if (fZfvoamnweg != fZfvoamnweg2) {
                B();
            }
        }
    }

    public void R0(boolean z13) {
        if (this.f22466a != z13) {
            this.f22466a = z13;
            X0();
            onStateChange(getState());
        }
    }

    public void S(int i13) {
        R(nufgyqmvbu.iobyxmoadg.zoijcleaow(this.f22468auzgnhcxok, i13));
    }

    boolean S0() {
        return this.f22476e;
    }

    public void T(float f13) {
        if (this.f22505okpsazkaxt != f13) {
            float fZfvoamnweg = zfvoamnweg();
            this.f22505okpsazkaxt = f13;
            float fZfvoamnweg2 = zfvoamnweg();
            invalidateSelf();
            if (fZfvoamnweg != fZfvoamnweg2) {
                B();
            }
        }
    }

    public void U(int i13) {
        T(this.f22468auzgnhcxok.getResources().getDimension(i13));
    }

    public void V(ColorStateList colorStateList) {
        this.f22495jztzpxfvev = true;
        if (this.f22487ikoacuggdj != colorStateList) {
            this.f22487ikoacuggdj = colorStateList;
            if (U0()) {
                k1.iobyxmoadg.ojitshcjhn(this.f22492jhduphickx, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void W(int i13) {
        V(nufgyqmvbu.iobyxmoadg.iobyxmoadg(this.f22468auzgnhcxok, i13));
    }

    public void X(int i13) {
        Y(this.f22468auzgnhcxok.getResources().getBoolean(i13));
    }

    public void Y(boolean z13) {
        if (this.f22519vipkmwdibw != z13) {
            boolean zU0 = U0();
            this.f22519vipkmwdibw = z13;
            boolean zU1 = U0();
            if (zU0 != zU1) {
                if (zU1) {
                    ydmasvzmpa(this.f22492jhduphickx);
                } else {
                    W0(this.f22492jhduphickx);
                }
                invalidateSelf();
                B();
            }
        }
    }

    public void Z(float f13) {
        if (this.f22502ntlheqmsrt != f13) {
            this.f22502ntlheqmsrt = f13;
            invalidateSelf();
            B();
        }
    }

    public float a() {
        return this.f22518uwvvkdfqfp;
    }

    public void a0(int i13) {
        Z(this.f22468auzgnhcxok.getResources().getDimension(i13));
    }

    public ColorStateList ageimvtcrz() {
        return this.f22499mbcevpiqjq;
    }

    public float b() {
        return this.f22514tbqsvytpvh;
    }

    public void b0(float f13) {
        if (this.f22491iyctptxqzt != f13) {
            this.f22491iyctptxqzt = f13;
            invalidateSelf();
            B();
        }
    }

    public int[] c() {
        return this.f22496krqnebusok;
    }

    public void c0(int i13) {
        b0(this.f22468auzgnhcxok.getResources().getDimension(i13));
    }

    public ColorStateList d() {
        return this.f22473czzsidtyhn;
    }

    public void d0(ColorStateList colorStateList) {
        if (this.f22513sopmlzcsov != colorStateList) {
            this.f22513sopmlzcsov = colorStateList;
            if (this.f22483g) {
                metgxyhuhe(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // ra.lqeggnwhkg, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i13 = this.f22481fmlbqenlif;
        int iIobyxmoadg = i13 < 255 ? fa.iobyxmoadg.iobyxmoadg(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i13) : 0;
        dvvnrvtcbc(canvas, bounds);
        uawqvzlxes(canvas, bounds);
        if (this.f22483g) {
            super.draw(canvas);
        }
        iwxlajgraz(canvas, bounds);
        igdgnonuha(canvas, bounds);
        auzgnhcxok(canvas, bounds);
        roivzttewh(canvas, bounds);
        if (this.f22476e) {
            wizcaqwiak(canvas, bounds);
        }
        skhdrjzrfn(canvas, bounds);
        lxfrhoxuzk(canvas, bounds);
        if (this.f22481fmlbqenlif < 255) {
            canvas.restoreToCount(iIobyxmoadg);
        }
    }

    public void e(RectF rectF) {
        opjhrmiecq(getBounds(), rectF);
    }

    public void e0(int i13) {
        d0(nufgyqmvbu.iobyxmoadg.iobyxmoadg(this.f22468auzgnhcxok, i13));
    }

    public CharSequence eslsurpljm() {
        return this.f22524yfnezrywwk;
    }

    public ColorStateList ezmngbhpjk() {
        return this.f22513sopmlzcsov;
    }

    public void f0(float f13) {
        if (this.f22472crxdokpmqz != f13) {
            this.f22472crxdokpmqz = f13;
            this.f22489iwxlajgraz.setStrokeWidth(f13);
            if (this.f22483g) {
                super.rlfsiqarku(f13);
            }
            invalidateSelf();
        }
    }

    public ColorStateList fiwbwshyhd() {
        return this.f22504oipsdeybqn;
    }

    public float fmlbqenlif() {
        return this.f22491iyctptxqzt;
    }

    public float fyldjkxazc() {
        return this.f22483g ? iozdgvuglv() : this.f22517ulzqkzuiru;
    }

    public void g0(int i13) {
        f0(this.f22468auzgnhcxok.getResources().getDimension(i13));
    }

    @Override // ra.lqeggnwhkg, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f22481fmlbqenlif;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f22478ezmngbhpjk;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f22502ntlheqmsrt;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f22491iyctptxqzt + zfvoamnweg() + this.f22526zeieaojujs + this.f22485hszhottldk.nufgyqmvbu(n().toString()) + this.f22503nuxfzjnpeb + iyctptxqzt() + this.f22516uawqvzlxes), this.f22479f);
    }

    @Override // ra.lqeggnwhkg, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // ra.lqeggnwhkg, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f22483g) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f22517ulzqkzuiru);
        } else {
            outline.setRoundRect(bounds, this.f22517ulzqkzuiru);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public Drawable grlcpdaxtj() {
        Drawable drawable = this.f22492jhduphickx;
        if (drawable != null) {
            return k1.iobyxmoadg.vdvldrhtss(drawable);
        }
        return null;
    }

    public TextUtils.TruncateAt h() {
        return this.f22474d;
    }

    public Drawable hszhottldk() {
        return this.f22527zfvoamnweg;
    }

    public gxszxtbevo i() {
        return this.f22506opjhrmiecq;
    }

    public void i0(Drawable drawable) {
        Drawable drawableYzdjzghtvl = yzdjzghtvl();
        if (drawableYzdjzghtvl != drawable) {
            float fIyctptxqzt = iyctptxqzt();
            this.f22500metgxyhuhe = drawable != null ? k1.iobyxmoadg.oxmwwwfdhm(drawable).mutate() : null;
            if (zoijcleaow.f76259iobyxmoadg) {
                Y0();
            }
            float fIyctptxqzt2 = iyctptxqzt();
            W0(drawableYzdjzghtvl);
            if (V0()) {
                ydmasvzmpa(this.f22500metgxyhuhe);
            }
            invalidateSelf();
            if (fIyctptxqzt != fIyctptxqzt2) {
                B();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.internal.btonecajqb.zoijcleaow
    public void iobyxmoadg() {
        B();
        invalidateSelf();
    }

    public float ipoelvxyzq() {
        return this.f22516uawqvzlxes;
    }

    @Override // ra.lqeggnwhkg, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return x(this.f22515tzroggbefp) || x(this.f22499mbcevpiqjq) || x(this.f22513sopmlzcsov) || (this.f22466a && x(this.f22469b)) || z(this.f22485hszhottldk.eablkybsjg()) || nuxfzjnpeb() || y(this.f22492jhduphickx) || y(this.f22527zfvoamnweg) || x(this.f22525yzdjzghtvl);
    }

    public ColorStateList ixidwrxhsl() {
        return this.f22487ikoacuggdj;
    }

    float iyctptxqzt() {
        if (V0()) {
            return this.f22514tbqsvytpvh + this.f22518uwvvkdfqfp + this.f22510roivzttewh;
        }
        return 0.0f;
    }

    public float j() {
        return this.f22497lrnfpwlwnk;
    }

    public void j0(CharSequence charSequence) {
        if (this.f22524yfnezrywwk != charSequence) {
            this.f22524yfnezrywwk = t1.iobyxmoadg.ppxfxbqfkf().nufgyqmvbu(charSequence);
            invalidateSelf();
        }
    }

    public float jrbgnlbqoe() {
        return this.f22502ntlheqmsrt;
    }

    public float k() {
        return this.f22520weqkydbzbr;
    }

    public void k0(float f13) {
        if (this.f22510roivzttewh != f13) {
            this.f22510roivzttewh = f13;
            invalidateSelf();
            if (V0()) {
                B();
            }
        }
    }

    public float krqnebusok() {
        return this.f22510roivzttewh;
    }

    public ColorStateList l() {
        return this.f22493jlmebxxoox;
    }

    public void l0(int i13) {
        k0(this.f22468auzgnhcxok.getResources().getDimension(i13));
    }

    public gxszxtbevo m() {
        return this.f22470bfopjjpdmp;
    }

    public void m0(int i13) {
        i0(nufgyqmvbu.iobyxmoadg.zoijcleaow(this.f22468auzgnhcxok, i13));
    }

    public float mhtqkkgtqm() {
        return this.f22505okpsazkaxt;
    }

    public CharSequence n() {
        return this.f22508ribwqtqdhb;
    }

    public void n0(float f13) {
        if (this.f22518uwvvkdfqfp != f13) {
            this.f22518uwvvkdfqfp = f13;
            invalidateSelf();
            if (V0()) {
                B();
            }
        }
    }

    public wkgbmnqykc o() {
        return this.f22485hszhottldk.eablkybsjg();
    }

    public void o0(int i13) {
        n0(this.f22468auzgnhcxok.getResources().getDimension(i13));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i13) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i13);
        if (U0()) {
            zOnLayoutDirectionChanged |= k1.iobyxmoadg.wflxmlrfwp(this.f22492jhduphickx, i13);
        }
        if (T0()) {
            zOnLayoutDirectionChanged |= k1.iobyxmoadg.wflxmlrfwp(this.f22527zfvoamnweg, i13);
        }
        if (V0()) {
            zOnLayoutDirectionChanged |= k1.iobyxmoadg.wflxmlrfwp(this.f22500metgxyhuhe, i13);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i13) {
        boolean zOnLevelChange = super.onLevelChange(i13);
        if (U0()) {
            zOnLevelChange |= this.f22492jhduphickx.setLevel(i13);
        }
        if (T0()) {
            zOnLevelChange |= this.f22527zfvoamnweg.setLevel(i13);
        }
        if (V0()) {
            zOnLevelChange |= this.f22500metgxyhuhe.setLevel(i13);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // ra.lqeggnwhkg, android.graphics.drawable.Drawable, com.google.android.material.internal.btonecajqb.zoijcleaow
    public boolean onStateChange(int[] iArr) {
        if (this.f22483g) {
            super.onStateChange(iArr);
        }
        return C(iArr, c());
    }

    public float p() {
        return this.f22503nuxfzjnpeb;
    }

    public void p0(float f13) {
        if (this.f22514tbqsvytpvh != f13) {
            this.f22514tbqsvytpvh = f13;
            invalidateSelf();
            if (V0()) {
                B();
            }
        }
    }

    public float q() {
        return this.f22526zeieaojujs;
    }

    public void q0(int i13) {
        p0(this.f22468auzgnhcxok.getResources().getDimension(i13));
    }

    public boolean r0(int[] iArr) {
        if (Arrays.equals(this.f22496krqnebusok, iArr)) {
            return false;
        }
        this.f22496krqnebusok = iArr;
        if (V0()) {
            return C(getState(), iArr);
        }
        return false;
    }

    public float rhgxfdycjh() {
        return this.f22472crxdokpmqz;
    }

    public boolean s() {
        return this.f22466a;
    }

    public void s0(ColorStateList colorStateList) {
        if (this.f22473czzsidtyhn != colorStateList) {
            this.f22473czzsidtyhn = colorStateList;
            if (V0()) {
                k1.iobyxmoadg.ojitshcjhn(this.f22500metgxyhuhe, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j13) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j13);
        }
    }

    @Override // ra.lqeggnwhkg, android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        if (this.f22481fmlbqenlif != i13) {
            this.f22481fmlbqenlif = i13;
            invalidateSelf();
        }
    }

    @Override // ra.lqeggnwhkg, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f22478ezmngbhpjk != colorFilter) {
            this.f22478ezmngbhpjk = colorFilter;
            invalidateSelf();
        }
    }

    @Override // ra.lqeggnwhkg, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f22525yzdjzghtvl != colorStateList) {
            this.f22525yzdjzghtvl = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // ra.lqeggnwhkg, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f22477eslsurpljm != mode) {
            this.f22477eslsurpljm = mode;
            this.f22507rhgxfdycjh = com.google.android.material.drawable.wkgbmnqykc.draadjrbmk(this, this.f22525yzdjzghtvl, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z13, boolean z14) {
        boolean visible = super.setVisible(z13, z14);
        if (U0()) {
            visible |= this.f22492jhduphickx.setVisible(z13, z14);
        }
        if (T0()) {
            visible |= this.f22527zfvoamnweg.setVisible(z13, z14);
        }
        if (V0()) {
            visible |= this.f22500metgxyhuhe.setVisible(z13, z14);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t0(int i13) {
        s0(nufgyqmvbu.iobyxmoadg.iobyxmoadg(this.f22468auzgnhcxok, i13));
    }

    public boolean u() {
        return this.f22523ydmasvzmpa;
    }

    public void u0(boolean z13) {
        if (this.f22522xrmfcynszj != z13) {
            boolean zV0 = V0();
            this.f22522xrmfcynszj = z13;
            boolean zV1 = V0();
            if (zV0 != zV1) {
                if (zV1) {
                    ydmasvzmpa(this.f22500metgxyhuhe);
                } else {
                    W0(this.f22500metgxyhuhe);
                }
                invalidateSelf();
                B();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public boolean v() {
        return y(this.f22500metgxyhuhe);
    }

    public void v0(InterfaceC0397iobyxmoadg interfaceC0397iobyxmoadg) {
        this.f22471c = new WeakReference(interfaceC0397iobyxmoadg);
    }

    public boolean w() {
        return this.f22522xrmfcynszj;
    }

    public void w0(TextUtils.TruncateAt truncateAt) {
        this.f22474d = truncateAt;
    }

    public void x0(gxszxtbevo gxszxtbevoVar) {
        this.f22506opjhrmiecq = gxszxtbevoVar;
    }

    public void y0(int i13) {
        x0(gxszxtbevo.ppxfxbqfkf(this.f22468auzgnhcxok, i13));
    }

    public Drawable yzdjzghtvl() {
        Drawable drawable = this.f22500metgxyhuhe;
        if (drawable != null) {
            return k1.iobyxmoadg.vdvldrhtss(drawable);
        }
        return null;
    }

    public void z0(float f13) {
        if (this.f22497lrnfpwlwnk != f13) {
            float fZfvoamnweg = zfvoamnweg();
            this.f22497lrnfpwlwnk = f13;
            float fZfvoamnweg2 = zfvoamnweg();
            invalidateSelf();
            if (fZfvoamnweg != fZfvoamnweg2) {
                B();
            }
        }
    }

    Paint.Align zeieaojujs(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f22508ribwqtqdhb != null) {
            float fZfvoamnweg = this.f22491iyctptxqzt + zfvoamnweg() + this.f22526zeieaojujs;
            if (k1.iobyxmoadg.gxszxtbevo(this) == 0) {
                pointF.x = rect.left + fZfvoamnweg;
            } else {
                pointF.x = rect.right - fZfvoamnweg;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - lrnfpwlwnk();
        }
        return align;
    }

    float zfvoamnweg() {
        if (U0() || T0()) {
            return this.f22520weqkydbzbr + g() + this.f22497lrnfpwlwnk;
        }
        return 0.0f;
    }
}
