package androidx.navigation;

import hg.tzroggbefp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f12219iobyxmoadg = new LinkedHashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f12218zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Map f12217ppxfxbqfkf = new LinkedHashMap();

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final String iobyxmoadg(Class navigatorClass) {
            zdlpuopuiu.btonecajqb(navigatorClass, "navigatorClass");
            String strValue = (String) ojitshcjhn.f12217ppxfxbqfkf.get(navigatorClass);
            if (strValue == null) {
                agtfadlqog.zoijcleaow zoijcleaowVar = (agtfadlqog.zoijcleaow) navigatorClass.getAnnotation(agtfadlqog.zoijcleaow.class);
                strValue = zoijcleaowVar != null ? zoijcleaowVar.value() : null;
                if (!zoijcleaow(strValue)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
                ojitshcjhn.f12217ppxfxbqfkf.put(navigatorClass, strValue);
            }
            zdlpuopuiu.lqeggnwhkg(strValue);
            return strValue;
        }

        public final boolean zoijcleaow(String str) {
            return str != null && str.length() > 0;
        }

        private iobyxmoadg() {
        }
    }

    public final Map eablkybsjg() {
        return tzroggbefp.yggfygwlhe(this.f12219iobyxmoadg);
    }

    public agtfadlqog ppxfxbqfkf(String name, agtfadlqog navigator) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(navigator, "navigator");
        if (!f12218zoijcleaow.zoijcleaow(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) this.f12219iobyxmoadg.get(name);
        if (zdlpuopuiu.eablkybsjg(agtfadlqogVar, navigator)) {
            return navigator;
        }
        boolean z13 = false;
        if (agtfadlqogVar != null && agtfadlqogVar.ppxfxbqfkf()) {
            z13 = true;
        }
        if (z13) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + agtfadlqogVar).toString());
        }
        if (!navigator.ppxfxbqfkf()) {
            return (agtfadlqog) this.f12219iobyxmoadg.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public agtfadlqog wkgbmnqykc(String name) {
        zdlpuopuiu.btonecajqb(name, "name");
        if (!f12218zoijcleaow.zoijcleaow(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) this.f12219iobyxmoadg.get(name);
        if (agtfadlqogVar != null) {
            return agtfadlqogVar;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public final agtfadlqog zoijcleaow(agtfadlqog navigator) {
        zdlpuopuiu.btonecajqb(navigator, "navigator");
        return ppxfxbqfkf(f12218zoijcleaow.iobyxmoadg(navigator.getClass()), navigator);
    }
}
