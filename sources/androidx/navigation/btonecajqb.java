package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import gg.wwaezpbzkn;
import h5.rgvfuqvkyq;
import java.io.IOException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f12061ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final ThreadLocal f12062wkgbmnqykc = new ThreadLocal();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f12063iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f12064zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final wflxmlrfwp iobyxmoadg(TypedValue value, wflxmlrfwp wflxmlrfwpVar, wflxmlrfwp expectedNavType, String str, String foundType) throws XmlPullParserException {
            zdlpuopuiu.btonecajqb(value, "value");
            zdlpuopuiu.btonecajqb(expectedNavType, "expectedNavType");
            zdlpuopuiu.btonecajqb(foundType, "foundType");
            if (wflxmlrfwpVar == null || wflxmlrfwpVar == expectedNavType) {
                return wflxmlrfwpVar == null ? expectedNavType : wflxmlrfwpVar;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + foundType + ": " + value.data);
        }

        private iobyxmoadg() {
        }
    }

    public btonecajqb(Context context, ojitshcjhn navigatorProvider) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(navigatorProvider, "navigatorProvider");
        this.f12063iobyxmoadg = context;
        this.f12064zoijcleaow = navigatorProvider;
    }

    private final void eablkybsjg(Resources resources, Bundle bundle, AttributeSet attributeSet, int i13) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, i5.iobyxmoadg.NavArgument);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(i5.iobyxmoadg.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        zdlpuopuiu.dxjokdxxww(string, "array.getString(R.stylea…uments must have a name\")");
        zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(typedArrayObtainAttributes, resources, i13);
        if (zoijcleaowVarWkgbmnqykc.zoijcleaow()) {
            zoijcleaowVarWkgbmnqykc.eablkybsjg(string, bundle);
        }
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        typedArrayObtainAttributes.recycle();
    }

    private final void gxszxtbevo(Resources resources, lqeggnwhkg lqeggnwhkgVar, AttributeSet attributeSet, int i13) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, i5.iobyxmoadg.NavArgument);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(i5.iobyxmoadg.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        zdlpuopuiu.dxjokdxxww(string, "array.getString(R.stylea…uments must have a name\")");
        lqeggnwhkgVar.zoijcleaow(string, wkgbmnqykc(typedArrayObtainAttributes, resources, i13));
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        typedArrayObtainAttributes.recycle();
    }

    private final lqeggnwhkg iobyxmoadg(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i13) throws XmlPullParserException, IOException {
        int depth;
        ojitshcjhn ojitshcjhnVar = this.f12064zoijcleaow;
        String name = xmlResourceParser.getName();
        zdlpuopuiu.dxjokdxxww(name, "parser.name");
        lqeggnwhkg lqeggnwhkgVarIobyxmoadg = ojitshcjhnVar.wkgbmnqykc(name).iobyxmoadg();
        lqeggnwhkgVarIobyxmoadg.kcexrzcfyt(this.f12063iobyxmoadg, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (zdlpuopuiu.eablkybsjg("argument", name2)) {
                    gxszxtbevo(resources, lqeggnwhkgVarIobyxmoadg, attributeSet, i13);
                } else if (zdlpuopuiu.eablkybsjg("deepLink", name2)) {
                    lqeggnwhkg(resources, lqeggnwhkgVarIobyxmoadg, attributeSet);
                } else if (zdlpuopuiu.eablkybsjg("action", name2)) {
                    ppxfxbqfkf(resources, lqeggnwhkgVarIobyxmoadg, attributeSet, xmlResourceParser, i13);
                } else if (zdlpuopuiu.eablkybsjg("include", name2) && (lqeggnwhkgVarIobyxmoadg instanceof nufgyqmvbu)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, rgvfuqvkyq.NavInclude);
                    zdlpuopuiu.dxjokdxxww(typedArrayObtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((nufgyqmvbu) lqeggnwhkgVarIobyxmoadg).lereixgezr(zoijcleaow(typedArrayObtainAttributes.getResourceId(rgvfuqvkyq.NavInclude_graph, 0)));
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    typedArrayObtainAttributes.recycle();
                } else if (lqeggnwhkgVarIobyxmoadg instanceof nufgyqmvbu) {
                    ((nufgyqmvbu) lqeggnwhkgVarIobyxmoadg).lereixgezr(iobyxmoadg(resources, xmlResourceParser, attributeSet, i13));
                }
            }
        }
        return lqeggnwhkgVarIobyxmoadg;
    }

    private final void lqeggnwhkg(Resources resources, lqeggnwhkg lqeggnwhkgVar, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, i5.iobyxmoadg.NavDeepLink);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = typedArrayObtainAttributes.getString(i5.iobyxmoadg.NavDeepLink_uri);
        String string2 = typedArrayObtainAttributes.getString(i5.iobyxmoadg.NavDeepLink_action);
        String string3 = typedArrayObtainAttributes.getString(i5.iobyxmoadg.NavDeepLink_mimeType);
        if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        gxszxtbevo.iobyxmoadg iobyxmoadgVar = new gxszxtbevo.iobyxmoadg();
        if (string != null) {
            String packageName = this.f12063iobyxmoadg.getPackageName();
            zdlpuopuiu.dxjokdxxww(packageName, "context.packageName");
            iobyxmoadgVar.wkgbmnqykc(kcexrzcfyt.hcddaimhww(string, "${applicationId}", packageName, false, 4, null));
        }
        if (string2 != null && string2.length() != 0) {
            String packageName2 = this.f12063iobyxmoadg.getPackageName();
            zdlpuopuiu.dxjokdxxww(packageName2, "context.packageName");
            iobyxmoadgVar.zoijcleaow(kcexrzcfyt.hcddaimhww(string2, "${applicationId}", packageName2, false, 4, null));
        }
        if (string3 != null) {
            String packageName3 = this.f12063iobyxmoadg.getPackageName();
            zdlpuopuiu.dxjokdxxww(packageName3, "context.packageName");
            iobyxmoadgVar.ppxfxbqfkf(kcexrzcfyt.hcddaimhww(string3, "${applicationId}", packageName3, false, 4, null));
        }
        lqeggnwhkgVar.ppxfxbqfkf(iobyxmoadgVar.iobyxmoadg());
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        typedArrayObtainAttributes.recycle();
    }

    private final void ppxfxbqfkf(Resources resources, lqeggnwhkg lqeggnwhkgVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i13) throws XmlPullParserException, IOException {
        int depth;
        Context context = this.f12063iobyxmoadg;
        int[] NavAction = i5.iobyxmoadg.NavAction;
        zdlpuopuiu.dxjokdxxww(NavAction, "NavAction");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(i5.iobyxmoadg.NavAction_android_id, 0);
        h5.wkgbmnqykc wkgbmnqykcVar = new h5.wkgbmnqykc(typedArrayObtainStyledAttributes.getResourceId(i5.iobyxmoadg.NavAction_destination, 0), null, null, 6, null);
        gtknphoqwx.iobyxmoadg iobyxmoadgVar = new gtknphoqwx.iobyxmoadg();
        iobyxmoadgVar.wkgbmnqykc(typedArrayObtainStyledAttributes.getBoolean(i5.iobyxmoadg.NavAction_launchSingleTop, false));
        iobyxmoadgVar.draadjrbmk(typedArrayObtainStyledAttributes.getBoolean(i5.iobyxmoadg.NavAction_restoreState, false));
        iobyxmoadgVar.lqeggnwhkg(typedArrayObtainStyledAttributes.getResourceId(i5.iobyxmoadg.NavAction_popUpTo, -1), typedArrayObtainStyledAttributes.getBoolean(i5.iobyxmoadg.NavAction_popUpToInclusive, false), typedArrayObtainStyledAttributes.getBoolean(i5.iobyxmoadg.NavAction_popUpToSaveState, false));
        iobyxmoadgVar.zoijcleaow(typedArrayObtainStyledAttributes.getResourceId(i5.iobyxmoadg.NavAction_enterAnim, -1));
        iobyxmoadgVar.ppxfxbqfkf(typedArrayObtainStyledAttributes.getResourceId(i5.iobyxmoadg.NavAction_exitAnim, -1));
        iobyxmoadgVar.eablkybsjg(typedArrayObtainStyledAttributes.getResourceId(i5.iobyxmoadg.NavAction_popEnterAnim, -1));
        iobyxmoadgVar.gxszxtbevo(typedArrayObtainStyledAttributes.getResourceId(i5.iobyxmoadg.NavAction_popExitAnim, -1));
        wkgbmnqykcVar.eablkybsjg(iobyxmoadgVar.iobyxmoadg());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && zdlpuopuiu.eablkybsjg("argument", xmlResourceParser.getName())) {
                eablkybsjg(resources, bundle, attributeSet, i13);
            }
        }
        if (!bundle.isEmpty()) {
            wkgbmnqykcVar.wkgbmnqykc(bundle);
        }
        lqeggnwhkgVar.zdlpuopuiu(resourceId, wkgbmnqykcVar);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final zoijcleaow wkgbmnqykc(TypedArray typedArray, Resources resources, int i13) throws XmlPullParserException {
        zoijcleaow.iobyxmoadg iobyxmoadgVar = new zoijcleaow.iobyxmoadg();
        int i14 = 0;
        iobyxmoadgVar.ppxfxbqfkf(typedArray.getBoolean(i5.iobyxmoadg.NavArgument_nullable, false));
        ThreadLocal threadLocal = f12062wkgbmnqykc;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(i5.iobyxmoadg.NavArgument_argType);
        Object objGxszxtbevo = null;
        wflxmlrfwp wflxmlrfwpVarIobyxmoadg = string != null ? h5.dxjokdxxww.iobyxmoadg(wflxmlrfwp.f12250ppxfxbqfkf, string, resources.getResourcePackageName(i13)) : null;
        if (typedArray.getValue(i5.iobyxmoadg.NavArgument_android_defaultValue, typedValue)) {
            wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f12242eablkybsjg;
            if (wflxmlrfwpVarIobyxmoadg == wflxmlrfwpVar) {
                int i15 = typedValue.resourceId;
                if (i15 != 0) {
                    i14 = i15;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + wflxmlrfwpVarIobyxmoadg.zoijcleaow() + ". Must be a reference to a resource.");
                }
                objGxszxtbevo = Integer.valueOf(i14);
            } else {
                int i16 = typedValue.resourceId;
                if (i16 != 0) {
                    if (wflxmlrfwpVarIobyxmoadg != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + wflxmlrfwpVarIobyxmoadg.zoijcleaow() + ". You must use a \"" + wflxmlrfwpVar.zoijcleaow() + "\" type to reference other resources.");
                    }
                    objGxszxtbevo = Integer.valueOf(i16);
                    wflxmlrfwpVarIobyxmoadg = wflxmlrfwpVar;
                } else if (wflxmlrfwpVarIobyxmoadg == wflxmlrfwp.f12252vdvldrhtss) {
                    objGxszxtbevo = typedArray.getString(i5.iobyxmoadg.NavArgument_android_defaultValue);
                } else {
                    int i17 = typedValue.type;
                    if (i17 == 3) {
                        String string2 = typedValue.string.toString();
                        if (wflxmlrfwpVarIobyxmoadg == null) {
                            wflxmlrfwpVarIobyxmoadg = wflxmlrfwp.f12250ppxfxbqfkf.zoijcleaow(string2);
                        }
                        objGxszxtbevo = wflxmlrfwpVarIobyxmoadg.gxszxtbevo(string2);
                    } else if (i17 == 4) {
                        wflxmlrfwpVarIobyxmoadg = f12061ppxfxbqfkf.iobyxmoadg(typedValue, wflxmlrfwpVarIobyxmoadg, wflxmlrfwp.f12243gtknphoqwx, string, "float");
                        objGxszxtbevo = Float.valueOf(typedValue.getFloat());
                    } else if (i17 == 5) {
                        wflxmlrfwpVarIobyxmoadg = f12061ppxfxbqfkf.iobyxmoadg(typedValue, wflxmlrfwpVarIobyxmoadg, wflxmlrfwp.f12254wkgbmnqykc, string, "dimension");
                        objGxszxtbevo = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i17 == 18) {
                        wflxmlrfwpVarIobyxmoadg = f12061ppxfxbqfkf.iobyxmoadg(typedValue, wflxmlrfwpVarIobyxmoadg, wflxmlrfwp.f12238agtfadlqog, string, "boolean");
                        objGxszxtbevo = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i17 < 16 || i17 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        wflxmlrfwp wflxmlrfwpVar2 = wflxmlrfwp.f12243gtknphoqwx;
                        if (wflxmlrfwpVarIobyxmoadg == wflxmlrfwpVar2) {
                            wflxmlrfwpVarIobyxmoadg = f12061ppxfxbqfkf.iobyxmoadg(typedValue, wflxmlrfwpVarIobyxmoadg, wflxmlrfwpVar2, string, "float");
                            objGxszxtbevo = Float.valueOf(typedValue.data);
                        } else {
                            wflxmlrfwpVarIobyxmoadg = f12061ppxfxbqfkf.iobyxmoadg(typedValue, wflxmlrfwpVarIobyxmoadg, wflxmlrfwp.f12254wkgbmnqykc, string, "integer");
                            objGxszxtbevo = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        }
        if (objGxszxtbevo != null) {
            iobyxmoadgVar.zoijcleaow(objGxszxtbevo);
        }
        if (wflxmlrfwpVarIobyxmoadg != null) {
            iobyxmoadgVar.wkgbmnqykc(wflxmlrfwpVarIobyxmoadg);
        }
        return iobyxmoadgVar.iobyxmoadg();
    }

    public final nufgyqmvbu zoijcleaow(int i13) {
        int next;
        Resources res = this.f12063iobyxmoadg.getResources();
        XmlResourceParser xml = res.getXml(i13);
        zdlpuopuiu.dxjokdxxww(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e13) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(i13) + " line " + xml.getLineNumber(), e13);
                }
            } catch (Throwable th2) {
                xml.close();
                throw th2;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        zdlpuopuiu.dxjokdxxww(res, "res");
        zdlpuopuiu.dxjokdxxww(attrs, "attrs");
        lqeggnwhkg lqeggnwhkgVarIobyxmoadg = iobyxmoadg(res, xml, attrs, i13);
        if (lqeggnwhkgVarIobyxmoadg instanceof nufgyqmvbu) {
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) lqeggnwhkgVarIobyxmoadg;
            xml.close();
            return nufgyqmvbuVar;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
