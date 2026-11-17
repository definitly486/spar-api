package e0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import h.dvvnrvtcbc;
import kotlin.jvm.internal.zdlpuopuiu;
import m.oxmwwwfdhm;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {
    private static final dvvnrvtcbc iobyxmoadg(CharSequence charSequence, Resources resources, int i13) {
        try {
            return zoijcleaow.iobyxmoadg(dvvnrvtcbc.f38881iobyxmoadg, resources, i13);
        } catch (Exception e13) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e13);
        }
    }

    public static final l.ppxfxbqfkf ppxfxbqfkf(int i13, draadjrbmk draadjrbmkVar, int i14) {
        l.ppxfxbqfkf iobyxmoadgVar;
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(473971343, i14, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
        Resources resources = (Resources) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.btonecajqb());
        TypedValue typedValueZoijcleaow = ((eablkybsjg) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.dxjokdxxww())).zoijcleaow(resources, i13);
        CharSequence charSequence = typedValueZoijcleaow.string;
        boolean z13 = true;
        if (charSequence == null || !kcexrzcfyt.ikoacuggdj(charSequence, ".xml", false, 2, null)) {
            draadjrbmkVar.sopmlzcsov(-1771631096);
            Object theme = context.getTheme();
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(charSequence);
            if ((((i14 & 14) ^ 6) <= 4 || !draadjrbmkVar.ppxfxbqfkf(i13)) && (i14 & 6) != 4) {
                z13 = false;
            }
            boolean zUlzqkzuiru2 = zUlzqkzuiru | z13 | draadjrbmkVar.ulzqkzuiru(theme);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru2 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = iobyxmoadg(charSequence, resources, i13);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            iobyxmoadgVar = new l.iobyxmoadg((dvvnrvtcbc) objYadqdtsiqt, 0L, 0L, 6, null);
            draadjrbmkVar.stevsuqkhv();
        } else {
            draadjrbmkVar.sopmlzcsov(-1771786530);
            iobyxmoadgVar = oxmwwwfdhm.lqeggnwhkg(zoijcleaow(context.getTheme(), resources, i13, typedValueZoijcleaow.changingConfigurations, draadjrbmkVar, (i14 << 6) & 896), draadjrbmkVar, 0);
            draadjrbmkVar.stevsuqkhv();
        }
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return iobyxmoadgVar;
    }

    private static final m.wkgbmnqykc zoijcleaow(Resources.Theme theme, Resources resources, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(21855625, i15, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:87)");
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.nufgyqmvbu());
        ppxfxbqfkf.zoijcleaow zoijcleaowVar = new ppxfxbqfkf.zoijcleaow(theme, i13);
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVarZoijcleaow = ppxfxbqfkfVar.zoijcleaow(zoijcleaowVar);
        if (iobyxmoadgVarZoijcleaow == null) {
            XmlResourceParser xml = resources.getXml(i13);
            if (!zdlpuopuiu.eablkybsjg(n.ppxfxbqfkf.btonecajqb(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            iobyxmoadgVarZoijcleaow = lqeggnwhkg.iobyxmoadg(theme, resources, xml, i14);
            ppxfxbqfkfVar.wkgbmnqykc(zoijcleaowVar, iobyxmoadgVarZoijcleaow);
        }
        m.wkgbmnqykc wkgbmnqykcVarZoijcleaow = iobyxmoadgVarZoijcleaow.zoijcleaow();
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return wkgbmnqykcVarZoijcleaow;
    }
}
