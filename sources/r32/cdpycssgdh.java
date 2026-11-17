package r32;

/* JADX INFO: loaded from: classes6.dex */
public final class cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f81578iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f81579ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f81580zoijcleaow;

    public cdpycssgdh(boolean z13, int i13, boolean z14) {
        this.f81578iobyxmoadg = z13;
        this.f81580zoijcleaow = i13;
        this.f81579ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdpycssgdh)) {
            return false;
        }
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) obj;
        return this.f81578iobyxmoadg == cdpycssgdhVar.f81578iobyxmoadg && this.f81580zoijcleaow == cdpycssgdhVar.f81580zoijcleaow && this.f81579ppxfxbqfkf == cdpycssgdhVar.f81579ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f81578iobyxmoadg) * 31) + Integer.hashCode(this.f81580zoijcleaow)) * 31) + Boolean.hashCode(this.f81579ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f81580zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f81579ppxfxbqfkf;
    }

    public String toString() {
        return "Model(flashButtonVisibility=" + this.f81578iobyxmoadg + ", flashButtonDrawable=" + this.f81580zoijcleaow + ", isLoading=" + this.f81579ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f81578iobyxmoadg;
    }
}
