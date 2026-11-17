package androidx.lifecycle;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pkzmftpjix {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f9541ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f9542iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private r2.zoijcleaow f9543zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final pkzmftpjix iobyxmoadg(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new pkzmftpjix();
            }
            ClassLoader classLoader = pkzmftpjix.class.getClassLoader();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(classLoader);
            bundle.setClassLoader(classLoader);
            return new pkzmftpjix(q5.ppxfxbqfkf.lqeggnwhkg(q5.ppxfxbqfkf.iobyxmoadg(bundle)));
        }

        public final boolean zoijcleaow(Object obj) {
            return r2.ppxfxbqfkf.iobyxmoadg(obj);
        }

        private iobyxmoadg() {
        }
    }

    public pkzmftpjix(Map initialState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(initialState, "initialState");
        this.f9542iobyxmoadg = new LinkedHashMap();
        this.f9543zoijcleaow = new r2.zoijcleaow(initialState);
    }

    public final void eablkybsjg(String key, q5.gxszxtbevo.zoijcleaow provider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(provider, "provider");
        this.f9543zoijcleaow.nufgyqmvbu(key, provider);
    }

    public final void iobyxmoadg(String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        this.f9543zoijcleaow.zoijcleaow(key);
    }

    public final q5.gxszxtbevo.zoijcleaow ppxfxbqfkf() {
        return this.f9543zoijcleaow.wkgbmnqykc();
    }

    public final void wkgbmnqykc(String key, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        if (f9541ppxfxbqfkf.zoijcleaow(obj)) {
            Object obj2 = this.f9542iobyxmoadg.get(key);
            pmvmpeiblj pmvmpeibljVar = obj2 instanceof pmvmpeiblj ? (pmvmpeiblj) obj2 : null;
            if (pmvmpeibljVar != null) {
                pmvmpeibljVar.ojitshcjhn(obj);
            }
            this.f9543zoijcleaow.lqeggnwhkg(key, obj);
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Can't put value with type ");
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj);
        sb3.append(obj.getClass());
        sb3.append(" into saved state");
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    public final Object zoijcleaow(String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        return this.f9543zoijcleaow.ppxfxbqfkf(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pkzmftpjix() {
        this.f9542iobyxmoadg = new LinkedHashMap();
        this.f9543zoijcleaow = new r2.zoijcleaow(null, 1, 0 == true ? 1 : 0);
    }
}
