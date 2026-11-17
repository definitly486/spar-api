package v42;

import c52.rgvfuqvkyq;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a52.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f116060iobyxmoadg = Collections.synchronizedMap(new LinkedHashMap());

    @Override // a52.iobyxmoadg
    public rgvfuqvkyq ppxfxbqfkf(String str) {
        return (rgvfuqvkyq) this.f116060iobyxmoadg.get(str);
    }

    @Override // a52.iobyxmoadg
    public String wkgbmnqykc(rgvfuqvkyq landingPageData) {
        zdlpuopuiu.btonecajqb(landingPageData, "landingPageData");
        String strValueOf = String.valueOf(landingPageData.hashCode());
        Map cachedLandingPages = this.f116060iobyxmoadg;
        zdlpuopuiu.dxjokdxxww(cachedLandingPages, "cachedLandingPages");
        cachedLandingPages.put(strValueOf, landingPageData);
        return strValueOf;
    }

    @Override // a52.iobyxmoadg
    public void zoijcleaow(String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        this.f116060iobyxmoadg.remove(key);
    }
}
