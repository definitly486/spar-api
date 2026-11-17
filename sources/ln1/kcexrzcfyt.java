package ln1;

/* JADX INFO: loaded from: classes6.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final in1.iobyxmoadg f63688iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f63689ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f63690zoijcleaow;

    public kcexrzcfyt(in1.iobyxmoadg scanType, boolean z13, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanType, "scanType");
        this.f63688iobyxmoadg = scanType;
        this.f63690zoijcleaow = z13;
        this.f63689ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcexrzcfyt)) {
            return false;
        }
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
        return this.f63688iobyxmoadg == kcexrzcfytVar.f63688iobyxmoadg && this.f63690zoijcleaow == kcexrzcfytVar.f63690zoijcleaow && this.f63689ppxfxbqfkf == kcexrzcfytVar.f63689ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f63688iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f63690zoijcleaow)) * 31) + Boolean.hashCode(this.f63689ppxfxbqfkf);
    }

    public final in1.iobyxmoadg iobyxmoadg() {
        return this.f63688iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f63690zoijcleaow;
    }

    public String toString() {
        return "Model(scanType=" + this.f63688iobyxmoadg + ", isFlashVisibility=" + this.f63690zoijcleaow + ", isFlashEnabled=" + this.f63689ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f63689ppxfxbqfkf;
    }
}
