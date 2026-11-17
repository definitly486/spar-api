package np1;

/* JADX INFO: loaded from: classes6.dex */
public final class cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f70507iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f70508ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f70509zoijcleaow;

    public cdpycssgdh(boolean z13, int i13, boolean z14) {
        this.f70507iobyxmoadg = z13;
        this.f70509zoijcleaow = i13;
        this.f70508ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdpycssgdh)) {
            return false;
        }
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) obj;
        return this.f70507iobyxmoadg == cdpycssgdhVar.f70507iobyxmoadg && this.f70509zoijcleaow == cdpycssgdhVar.f70509zoijcleaow && this.f70508ppxfxbqfkf == cdpycssgdhVar.f70508ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f70507iobyxmoadg) * 31) + Integer.hashCode(this.f70509zoijcleaow)) * 31) + Boolean.hashCode(this.f70508ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f70509zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f70508ppxfxbqfkf;
    }

    public String toString() {
        return "Model(flashButtonVisibility=" + this.f70507iobyxmoadg + ", flashButtonDrawable=" + this.f70509zoijcleaow + ", isLoading=" + this.f70508ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f70507iobyxmoadg;
    }
}
