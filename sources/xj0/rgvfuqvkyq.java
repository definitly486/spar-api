package xj0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f122621iobyxmoadg;

    public rgvfuqvkyq(String url) {
        zdlpuopuiu.btonecajqb(url, "url");
        this.f122621iobyxmoadg = url;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgvfuqvkyq) && zdlpuopuiu.eablkybsjg(this.f122621iobyxmoadg, ((rgvfuqvkyq) obj).f122621iobyxmoadg);
    }

    public int hashCode() {
        return this.f122621iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f122621iobyxmoadg;
    }

    public String toString() {
        return "Model(url=" + this.f122621iobyxmoadg + ")";
    }
}
