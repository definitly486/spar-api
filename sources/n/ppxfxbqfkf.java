package n;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h.bfopjjpdmp;
import h.f;
import h.g;
import h.h;
import h.jrbgnlbqoe;
import h.jztzpxfvev;
import h.oipsdeybqn;
import h.xrmfcynszj;
import i1.gtknphoqwx;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import m.btonecajqb;
import m.ojitshcjhn;
import m.wkgbmnqykc;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int f68199iobyxmoadg = 0;

    public static final XmlPullParser btonecajqb(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static final void dxjokdxxww(iobyxmoadg iobyxmoadgVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, wkgbmnqykc.iobyxmoadg iobyxmoadgVar2) {
        zoijcleaow zoijcleaowVar = zoijcleaow.f68211iobyxmoadg;
        TypedArray typedArrayDraadjrbmk = iobyxmoadgVar.draadjrbmk(resources, theme, attributeSet, zoijcleaowVar.ojitshcjhn());
        if (!gtknphoqwx.rgvfuqvkyq(iobyxmoadgVar.gtknphoqwx(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strBtonecajqb = iobyxmoadgVar.btonecajqb(typedArrayDraadjrbmk, zoijcleaowVar.oxmwwwfdhm());
        if (strBtonecajqb == null) {
            strBtonecajqb = "";
        }
        String str = strBtonecajqb;
        String strBtonecajqb2 = iobyxmoadgVar.btonecajqb(typedArrayDraadjrbmk, zoijcleaowVar.kcexrzcfyt());
        List listWkgbmnqykc = strBtonecajqb2 == null ? ojitshcjhn.wkgbmnqykc() : btonecajqb.zoijcleaow(iobyxmoadgVar.f68197ppxfxbqfkf, strBtonecajqb2, null, 2, null);
        i1.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg(typedArrayDraadjrbmk, theme, "fillColor", zoijcleaowVar.vdvldrhtss(), 0);
        float fNufgyqmvbu = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "fillAlpha", zoijcleaowVar.rgvfuqvkyq(), 1.0f);
        int iZoijcleaow = zoijcleaow(iobyxmoadgVar.dxjokdxxww(typedArrayDraadjrbmk, "strokeLineCap", zoijcleaowVar.jyumaefscl(), -1), g.f38891iobyxmoadg.iobyxmoadg());
        int iPpxfxbqfkf = ppxfxbqfkf(iobyxmoadgVar.dxjokdxxww(typedArrayDraadjrbmk, "strokeLineJoin", zoijcleaowVar.iwizpuwonk(), -1), h.f38898iobyxmoadg.iobyxmoadg());
        float fNufgyqmvbu2 = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "strokeMiterLimit", zoijcleaowVar.cqumvgiudr(), 1.0f);
        i1.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg2 = iobyxmoadgVar.lqeggnwhkg(typedArrayDraadjrbmk, theme, "strokeColor", zoijcleaowVar.yggfygwlhe(), 0);
        float fNufgyqmvbu3 = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "strokeAlpha", zoijcleaowVar.zdlpuopuiu(), 1.0f);
        float fNufgyqmvbu4 = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "strokeWidth", zoijcleaowVar.esjtqupxsv(), 1.0f);
        float fNufgyqmvbu5 = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "trimPathEnd", zoijcleaowVar.lereixgezr(), 1.0f);
        float fNufgyqmvbu6 = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "trimPathOffset", zoijcleaowVar.zynmafqrjb(), 0.0f);
        float fNufgyqmvbu7 = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "trimPathStart", zoijcleaowVar.istkbnxepw(), 0.0f);
        int iDxjokdxxww = iobyxmoadgVar.dxjokdxxww(typedArrayDraadjrbmk, "fillType", zoijcleaowVar.pmvmpeiblj(), f68199iobyxmoadg);
        typedArrayDraadjrbmk.recycle();
        jztzpxfvev jztzpxfvevVarEablkybsjg = eablkybsjg(wkgbmnqykcVarLqeggnwhkg);
        jztzpxfvev jztzpxfvevVarEablkybsjg2 = eablkybsjg(wkgbmnqykcVarLqeggnwhkg2);
        jrbgnlbqoe.iobyxmoadg iobyxmoadgVar3 = jrbgnlbqoe.f38915iobyxmoadg;
        iobyxmoadgVar2.ppxfxbqfkf(listWkgbmnqykc, iDxjokdxxww == 0 ? iobyxmoadgVar3.zoijcleaow() : iobyxmoadgVar3.iobyxmoadg(), str, jztzpxfvevVarEablkybsjg, fNufgyqmvbu, jztzpxfvevVarEablkybsjg2, fNufgyqmvbu3, fNufgyqmvbu4, iZoijcleaow, iPpxfxbqfkf, fNufgyqmvbu2, fNufgyqmvbu7, fNufgyqmvbu5, fNufgyqmvbu6);
    }

    private static final jztzpxfvev eablkybsjg(i1.wkgbmnqykc wkgbmnqykcVar) {
        if (!wkgbmnqykcVar.draadjrbmk()) {
            return null;
        }
        Shader shaderGxszxtbevo = wkgbmnqykcVar.gxszxtbevo();
        return shaderGxszxtbevo != null ? xrmfcynszj.iobyxmoadg(shaderGxszxtbevo) : new f(bfopjjpdmp.zoijcleaow(wkgbmnqykcVar.eablkybsjg()), null);
    }

    public static final void gxszxtbevo(iobyxmoadg iobyxmoadgVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, wkgbmnqykc.iobyxmoadg iobyxmoadgVar2) {
        zoijcleaow zoijcleaowVar = zoijcleaow.f68211iobyxmoadg;
        TypedArray typedArrayDraadjrbmk = iobyxmoadgVar.draadjrbmk(resources, theme, attributeSet, zoijcleaowVar.zoijcleaow());
        String strBtonecajqb = iobyxmoadgVar.btonecajqb(typedArrayDraadjrbmk, zoijcleaowVar.ppxfxbqfkf());
        if (strBtonecajqb == null) {
            strBtonecajqb = "";
        }
        String str = strBtonecajqb;
        String strBtonecajqb2 = iobyxmoadgVar.btonecajqb(typedArrayDraadjrbmk, zoijcleaowVar.wkgbmnqykc());
        List listWkgbmnqykc = strBtonecajqb2 == null ? ojitshcjhn.wkgbmnqykc() : btonecajqb.zoijcleaow(iobyxmoadgVar.f68197ppxfxbqfkf, strBtonecajqb2, null, 2, null);
        typedArrayDraadjrbmk.recycle();
        iobyxmoadgVar2.iobyxmoadg((254 & 1) != 0 ? "" : str, (254 & 2) != 0 ? 0.0f : 0.0f, (254 & 4) != 0 ? 0.0f : 0.0f, (254 & 8) != 0 ? 0.0f : 0.0f, (254 & 16) != 0 ? 1.0f : 0.0f, (254 & 32) == 0 ? 0.0f : 1.0f, (254 & 64) != 0 ? 0.0f : 0.0f, (254 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? 0.0f : 0.0f, (254 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? ojitshcjhn.wkgbmnqykc() : listWkgbmnqykc);
    }

    public static final wkgbmnqykc.iobyxmoadg iobyxmoadg(iobyxmoadg iobyxmoadgVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long jLqeggnwhkg;
        int iLereixgezr;
        ColorStateList colorStateListGxszxtbevo;
        zoijcleaow zoijcleaowVar = zoijcleaow.f68211iobyxmoadg;
        TypedArray typedArrayDraadjrbmk = iobyxmoadgVar.draadjrbmk(resources, theme, attributeSet, zoijcleaowVar.iozdgvuglv());
        boolean zEablkybsjg = iobyxmoadgVar.eablkybsjg(typedArrayDraadjrbmk, "autoMirrored", zoijcleaowVar.iobyxmoadg(), false);
        float fNufgyqmvbu = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "viewportWidth", zoijcleaowVar.wwaezpbzkn(), 0.0f);
        float fNufgyqmvbu2 = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "viewportHeight", zoijcleaowVar.lmojexxdyd(), 0.0f);
        if (fNufgyqmvbu <= 0.0f) {
            throw new XmlPullParserException(typedArrayDraadjrbmk.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fNufgyqmvbu2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayDraadjrbmk.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float fZoijcleaow = iobyxmoadgVar.zoijcleaow(typedArrayDraadjrbmk, zoijcleaowVar.ylkuphrtab(), 0.0f);
        float fZoijcleaow2 = iobyxmoadgVar.zoijcleaow(typedArrayDraadjrbmk, zoijcleaowVar.agtfadlqog(), 0.0f);
        if (typedArrayDraadjrbmk.hasValue(zoijcleaowVar.cdpycssgdh())) {
            TypedValue typedValue = new TypedValue();
            typedArrayDraadjrbmk.getValue(zoijcleaowVar.cdpycssgdh(), typedValue);
            jLqeggnwhkg = (typedValue.type == 2 || (colorStateListGxszxtbevo = iobyxmoadgVar.gxszxtbevo(typedArrayDraadjrbmk, theme, "tint", zoijcleaowVar.cdpycssgdh())) == null) ? oipsdeybqn.f38945zoijcleaow.lqeggnwhkg() : bfopjjpdmp.zoijcleaow(colorStateListGxszxtbevo.getDefaultColor());
        } else {
            jLqeggnwhkg = oipsdeybqn.f38945zoijcleaow.lqeggnwhkg();
        }
        long j13 = jLqeggnwhkg;
        int iWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc(typedArrayDraadjrbmk, zoijcleaowVar.yadqdtsiqt(), -1);
        if (iWkgbmnqykc == -1) {
            iLereixgezr = androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.lereixgezr();
        } else if (iWkgbmnqykc == 3) {
            iLereixgezr = androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.zynmafqrjb();
        } else if (iWkgbmnqykc == 5) {
            iLereixgezr = androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.lereixgezr();
        } else if (iWkgbmnqykc != 9) {
            switch (iWkgbmnqykc) {
                case 14:
                    iLereixgezr = androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.vdvldrhtss();
                    break;
                case 15:
                    iLereixgezr = androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.jyumaefscl();
                    break;
                case 16:
                    iLereixgezr = androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.zdlpuopuiu();
                    break;
                default:
                    iLereixgezr = androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.lereixgezr();
                    break;
            }
        } else {
            iLereixgezr = androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.esjtqupxsv();
        }
        int i13 = iLereixgezr;
        float fLqeggnwhkg = nufgyqmvbu.lqeggnwhkg(fZoijcleaow / resources.getDisplayMetrics().density);
        float fLqeggnwhkg2 = nufgyqmvbu.lqeggnwhkg(fZoijcleaow2 / resources.getDisplayMetrics().density);
        typedArrayDraadjrbmk.recycle();
        return new wkgbmnqykc.iobyxmoadg(null, fLqeggnwhkg, fLqeggnwhkg2, fNufgyqmvbu, fNufgyqmvbu2, j13, i13, zEablkybsjg, 1, null);
    }

    public static final int lqeggnwhkg(iobyxmoadg iobyxmoadgVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, wkgbmnqykc.iobyxmoadg iobyxmoadgVar2, int i13) throws XmlPullParserException {
        int eventType = iobyxmoadgVar.gtknphoqwx().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !zdlpuopuiu.eablkybsjg("group", iobyxmoadgVar.gtknphoqwx().getName())) {
                return i13;
            }
            int i14 = i13 + 1;
            for (int i15 = 0; i15 < i14; i15++) {
                iobyxmoadgVar2.lqeggnwhkg();
            }
            return 0;
        }
        String name = iobyxmoadgVar.gtknphoqwx().getName();
        if (name == null) {
            return i13;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i13;
            }
            gxszxtbevo(iobyxmoadgVar, resources, theme, attributeSet, iobyxmoadgVar2);
            return i13 + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i13;
            }
            dxjokdxxww(iobyxmoadgVar, resources, theme, attributeSet, iobyxmoadgVar2);
            return i13;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i13;
        }
        nufgyqmvbu(iobyxmoadgVar, resources, theme, attributeSet, iobyxmoadgVar2);
        return i13;
    }

    public static final void nufgyqmvbu(iobyxmoadg iobyxmoadgVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, wkgbmnqykc.iobyxmoadg iobyxmoadgVar2) {
        zoijcleaow zoijcleaowVar = zoijcleaow.f68211iobyxmoadg;
        TypedArray typedArrayDraadjrbmk = iobyxmoadgVar.draadjrbmk(resources, theme, attributeSet, zoijcleaowVar.eablkybsjg());
        float fNufgyqmvbu = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "rotation", zoijcleaowVar.dxjokdxxww(), 0.0f);
        float fPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(typedArrayDraadjrbmk, zoijcleaowVar.lqeggnwhkg(), 0.0f);
        float fPpxfxbqfkf2 = iobyxmoadgVar.ppxfxbqfkf(typedArrayDraadjrbmk, zoijcleaowVar.nufgyqmvbu(), 0.0f);
        float fNufgyqmvbu2 = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "scaleX", zoijcleaowVar.btonecajqb(), 1.0f);
        float fNufgyqmvbu3 = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "scaleY", zoijcleaowVar.gtknphoqwx(), 1.0f);
        float fNufgyqmvbu4 = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "translateX", zoijcleaowVar.draadjrbmk(), 0.0f);
        float fNufgyqmvbu5 = iobyxmoadgVar.nufgyqmvbu(typedArrayDraadjrbmk, "translateY", zoijcleaowVar.wflxmlrfwp(), 0.0f);
        String strBtonecajqb = iobyxmoadgVar.btonecajqb(typedArrayDraadjrbmk, zoijcleaowVar.gxszxtbevo());
        if (strBtonecajqb == null) {
            strBtonecajqb = "";
        }
        typedArrayDraadjrbmk.recycle();
        iobyxmoadgVar2.iobyxmoadg(strBtonecajqb, fNufgyqmvbu, fPpxfxbqfkf, fPpxfxbqfkf2, fNufgyqmvbu2, fNufgyqmvbu3, fNufgyqmvbu4, fNufgyqmvbu5, ojitshcjhn.wkgbmnqykc());
    }

    private static final int ppxfxbqfkf(int i13, int i14) {
        if (i13 == 0) {
            return h.f38898iobyxmoadg.zoijcleaow();
        }
        if (i13 != 1) {
            return i13 != 2 ? i14 : h.f38898iobyxmoadg.iobyxmoadg();
        }
        return h.f38898iobyxmoadg.ppxfxbqfkf();
    }

    public static final boolean wkgbmnqykc(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    private static final int zoijcleaow(int i13, int i14) {
        if (i13 == 0) {
            return g.f38891iobyxmoadg.iobyxmoadg();
        }
        if (i13 != 1) {
            return i13 != 2 ? i14 : g.f38891iobyxmoadg.ppxfxbqfkf();
        }
        return g.f38891iobyxmoadg.zoijcleaow();
    }
}
