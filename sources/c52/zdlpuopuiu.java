package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f19053iobyxmoadg;

    public zdlpuopuiu(String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        this.f19053iobyxmoadg = key;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f19053iobyxmoadg, ((zdlpuopuiu) obj).f19053iobyxmoadg);
    }

    public int hashCode() {
        return this.f19053iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f19053iobyxmoadg;
    }

    public String toString() {
        return "PreloadLandingPageResult(key=" + this.f19053iobyxmoadg + ")";
    }
}
