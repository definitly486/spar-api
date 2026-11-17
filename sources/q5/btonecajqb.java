package q5;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class btonecajqb {
    public static final void eablkybsjg(Bundle bundle, String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        bundle.remove(key);
    }

    public static Bundle iobyxmoadg(Bundle source) {
        zdlpuopuiu.btonecajqb(source, "source");
        return source;
    }

    public static final void ppxfxbqfkf(Bundle bundle, String key, Bundle value) {
        zdlpuopuiu.btonecajqb(key, "key");
        zdlpuopuiu.btonecajqb(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void wkgbmnqykc(Bundle bundle, String key, List value) {
        zdlpuopuiu.btonecajqb(key, "key");
        zdlpuopuiu.btonecajqb(value, "value");
        bundle.putStringArrayList(key, gtknphoqwx.iobyxmoadg(value));
    }

    public static final void zoijcleaow(Bundle bundle, Bundle from) {
        zdlpuopuiu.btonecajqb(from, "from");
        bundle.putAll(from);
    }
}
