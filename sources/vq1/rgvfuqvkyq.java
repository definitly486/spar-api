package vq1;

import java.util.Map;
import ru.myspar.proloyalty.user.domain.model.UserInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final istkbnxepw f117905iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final UserInfo f117906ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f117907zoijcleaow;

    public rgvfuqvkyq(istkbnxepw content, Map boundedBoxes, UserInfo userInfo) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(content, "content");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(boundedBoxes, "boundedBoxes");
        this.f117905iobyxmoadg = content;
        this.f117907zoijcleaow = boundedBoxes;
        this.f117906ppxfxbqfkf = userInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117905iobyxmoadg, rgvfuqvkyqVar.f117905iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117907zoijcleaow, rgvfuqvkyqVar.f117907zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117906ppxfxbqfkf, rgvfuqvkyqVar.f117906ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f117905iobyxmoadg.hashCode() * 31) + this.f117907zoijcleaow.hashCode()) * 31;
        UserInfo userInfo = this.f117906ppxfxbqfkf;
        return iHashCode + (userInfo == null ? 0 : userInfo.hashCode());
    }

    public final istkbnxepw iobyxmoadg() {
        return this.f117905iobyxmoadg;
    }

    public final UserInfo ppxfxbqfkf() {
        return this.f117906ppxfxbqfkf;
    }

    public String toString() {
        return "LandingPageData(content=" + this.f117905iobyxmoadg + ", boundedBoxes=" + this.f117907zoijcleaow + ", user=" + this.f117906ppxfxbqfkf + ")";
    }

    public final Map zoijcleaow() {
        return this.f117907zoijcleaow;
    }
}
