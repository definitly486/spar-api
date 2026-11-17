package c52;

import java.util.Map;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes6.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final istkbnxepw f18985iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final User f18986ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f18987zoijcleaow;

    public rgvfuqvkyq(istkbnxepw content, Map boundedBoxes, User user) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(content, "content");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(boundedBoxes, "boundedBoxes");
        this.f18985iobyxmoadg = content;
        this.f18987zoijcleaow = boundedBoxes;
        this.f18986ppxfxbqfkf = user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18985iobyxmoadg, rgvfuqvkyqVar.f18985iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18987zoijcleaow, rgvfuqvkyqVar.f18987zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18986ppxfxbqfkf, rgvfuqvkyqVar.f18986ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f18985iobyxmoadg.hashCode() * 31) + this.f18987zoijcleaow.hashCode()) * 31;
        User user = this.f18986ppxfxbqfkf;
        return iHashCode + (user == null ? 0 : user.hashCode());
    }

    public final istkbnxepw iobyxmoadg() {
        return this.f18985iobyxmoadg;
    }

    public final User ppxfxbqfkf() {
        return this.f18986ppxfxbqfkf;
    }

    public String toString() {
        return "LandingPageData(content=" + this.f18985iobyxmoadg + ", boundedBoxes=" + this.f18987zoijcleaow + ", user=" + this.f18986ppxfxbqfkf + ")";
    }

    public final Map zoijcleaow() {
        return this.f18987zoijcleaow;
    }
}
