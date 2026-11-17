package qb0;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f78387iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f78388ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f78389zoijcleaow;

    public gxszxtbevo(int i13, int i14, boolean z13) {
        this.f78387iobyxmoadg = i13;
        this.f78389zoijcleaow = i14;
        this.f78388ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f78387iobyxmoadg == gxszxtbevoVar.f78387iobyxmoadg && this.f78389zoijcleaow == gxszxtbevoVar.f78389zoijcleaow && this.f78388ppxfxbqfkf == gxszxtbevoVar.f78388ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f78387iobyxmoadg) * 31) + Integer.hashCode(this.f78389zoijcleaow)) * 31) + Boolean.hashCode(this.f78388ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f78389zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f78388ppxfxbqfkf;
    }

    public String toString() {
        return "ReviewsListStubUiModel(titleRes=" + this.f78387iobyxmoadg + ", descriptionRes=" + this.f78389zoijcleaow + ", isVisible=" + this.f78388ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f78387iobyxmoadg;
    }
}
