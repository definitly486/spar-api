package q5;

import android.os.Bundle;
import hg.tzroggbefp;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {
    public static final List eablkybsjg(Bundle bundle, String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        return bundle.getStringArrayList(key);
    }

    public static final boolean gxszxtbevo(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static Bundle iobyxmoadg(Bundle source) {
        zdlpuopuiu.btonecajqb(source, "source");
        return source;
    }

    public static final Map lqeggnwhkg(Bundle bundle) {
        Map mapWkgbmnqykc = tzroggbefp.wkgbmnqykc(bundle.size());
        for (String str : bundle.keySet()) {
            zdlpuopuiu.lqeggnwhkg(str);
            mapWkgbmnqykc.put(str, bundle.get(str));
        }
        return tzroggbefp.zoijcleaow(mapWkgbmnqykc);
    }

    public static final Bundle ppxfxbqfkf(Bundle bundle, String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        wkgbmnqykc.iobyxmoadg(key);
        throw new KotlinNothingValueException();
    }

    public static final Bundle wkgbmnqykc(Bundle bundle, String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        return bundle.getBundle(key);
    }

    public static final boolean zoijcleaow(Bundle bundle, String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        return bundle.containsKey(key);
    }
}
