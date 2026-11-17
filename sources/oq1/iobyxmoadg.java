package oq1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import vq1.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements tq1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f74121iobyxmoadg = Collections.synchronizedMap(new LinkedHashMap());

    @Override // tq1.iobyxmoadg
    public String iobyxmoadg(rgvfuqvkyq landingPageData) {
        zdlpuopuiu.btonecajqb(landingPageData, "landingPageData");
        String strValueOf = String.valueOf(landingPageData.hashCode());
        Map cachedLandingPages = this.f74121iobyxmoadg;
        zdlpuopuiu.dxjokdxxww(cachedLandingPages, "cachedLandingPages");
        cachedLandingPages.put(strValueOf, landingPageData);
        return strValueOf;
    }

    @Override // tq1.iobyxmoadg
    public rgvfuqvkyq ppxfxbqfkf(String str) {
        return (rgvfuqvkyq) this.f74121iobyxmoadg.get(str);
    }

    @Override // tq1.iobyxmoadg
    public void zoijcleaow(String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        this.f74121iobyxmoadg.remove(key);
    }
}
