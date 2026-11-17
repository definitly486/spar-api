package e0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import gg.wwaezpbzkn;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {
    public static final ppxfxbqfkf.iobyxmoadg iobyxmoadg(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i13) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        n.iobyxmoadg iobyxmoadgVar = new n.iobyxmoadg(xmlResourceParser, 0, 2, null);
        m.wkgbmnqykc.iobyxmoadg iobyxmoadgVarIobyxmoadg = n.ppxfxbqfkf.iobyxmoadg(iobyxmoadgVar, resources, theme, attributeSetAsAttributeSet);
        int iLqeggnwhkg = 0;
        while (!n.ppxfxbqfkf.wkgbmnqykc(xmlResourceParser)) {
            iLqeggnwhkg = n.ppxfxbqfkf.lqeggnwhkg(iobyxmoadgVar, resources, attributeSetAsAttributeSet, theme, iobyxmoadgVarIobyxmoadg, iLqeggnwhkg);
            xmlResourceParser.next();
        }
        return new ppxfxbqfkf.iobyxmoadg(iobyxmoadgVarIobyxmoadg.gxszxtbevo(), iobyxmoadgVar.iobyxmoadg() | i13);
    }

    public static final m.wkgbmnqykc ppxfxbqfkf(m.wkgbmnqykc.zoijcleaow zoijcleaowVar, Resources.Theme theme, Resources resources, int i13) throws XmlPullParserException, IOException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i13, typedValue, true);
        XmlResourceParser xml = resources.getXml(i13);
        n.ppxfxbqfkf.btonecajqb(xml);
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        return iobyxmoadg(theme, resources, xml, typedValue.changingConfigurations).zoijcleaow();
    }

    public static final m.wkgbmnqykc zoijcleaow(m.wkgbmnqykc.zoijcleaow zoijcleaowVar, int i13, draadjrbmk draadjrbmkVar, int i14) throws XmlPullParserException, IOException {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(44534090, i14, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:48)");
        }
        Context context = (Context) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
        Resources resources = (Resources) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.btonecajqb());
        Resources.Theme theme = context.getTheme();
        boolean zUlzqkzuiru = ((((i14 & 112) ^ 48) > 32 && draadjrbmkVar.ppxfxbqfkf(i13)) || (i14 & 48) == 32) | draadjrbmkVar.ulzqkzuiru(resources) | draadjrbmkVar.ulzqkzuiru(theme) | draadjrbmkVar.ulzqkzuiru(resources.getConfiguration());
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = ppxfxbqfkf(zoijcleaowVar, theme, resources, i13);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        m.wkgbmnqykc wkgbmnqykcVar = (m.wkgbmnqykc) objYadqdtsiqt;
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return wkgbmnqykcVar;
    }
}
