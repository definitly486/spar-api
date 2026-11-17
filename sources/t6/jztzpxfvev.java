package t6;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class jztzpxfvev {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f109826iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private bz.m f109827zoijcleaow;

    public jztzpxfvev(Map map) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException("Base feature holders should be provided!");
        }
        this.f109826iobyxmoadg = new HashMap(map);
    }

    private void eablkybsjg(Class cls) {
        if (this.f109827zoijcleaow == null) {
            return;
        }
        throw new IllegalStateException("Concurrent feature requests not supported!\nMaybe You used 'getFeature' from DI code - if so replace it with 'getDependency' \nDetails: \n\n\trequestedFeature = " + cls.getName() + "\n\tcurrentThread = " + Thread.currentThread().getName() + "\n\tcurrentBuildFeatureContext = " + this.f109827zoijcleaow);
    }

    private jhduphickx wkgbmnqykc(Class cls) {
        return (jhduphickx) this.f109826iobyxmoadg.get(cls);
    }

    public void gxszxtbevo(Map map) {
        this.f109826iobyxmoadg.putAll(map);
    }

    public Object iobyxmoadg(Class cls) {
        eablkybsjg(cls);
        this.f109827zoijcleaow = new bz.m(cls, Thread.currentThread().getName(), new Throwable());
        Object objIobyxmoadg = zoijcleaow(cls).iobyxmoadg();
        this.f109827zoijcleaow = null;
        return objIobyxmoadg;
    }

    public Object ppxfxbqfkf(Class cls) {
        bz.m mVar = this.f109827zoijcleaow;
        if (mVar == null) {
            return iobyxmoadg(cls);
        }
        mVar.iobyxmoadg(cls);
        Object objIobyxmoadg = zoijcleaow(cls).iobyxmoadg();
        this.f109827zoijcleaow.ppxfxbqfkf(cls);
        return objIobyxmoadg;
    }

    public jhduphickx zoijcleaow(Class cls) {
        jhduphickx jhduphickxVarWkgbmnqykc = wkgbmnqykc(cls);
        if (jhduphickxVarWkgbmnqykc != null) {
            return jhduphickxVarWkgbmnqykc;
        }
        throw new IllegalStateException(String.format("Failed to get feature with key = %s", cls));
    }
}
