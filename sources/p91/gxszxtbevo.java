package p91;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f76221iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f76222ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f76223zoijcleaow;

    public gxszxtbevo(int i13, int i14, boolean z13) {
        this.f76221iobyxmoadg = i13;
        this.f76223zoijcleaow = i14;
        this.f76222ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f76221iobyxmoadg == gxszxtbevoVar.f76221iobyxmoadg && this.f76223zoijcleaow == gxszxtbevoVar.f76223zoijcleaow && this.f76222ppxfxbqfkf == gxszxtbevoVar.f76222ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f76221iobyxmoadg) * 31) + Integer.hashCode(this.f76223zoijcleaow)) * 31) + Boolean.hashCode(this.f76222ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f76223zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f76222ppxfxbqfkf;
    }

    public String toString() {
        return "ReviewsListStubUiModel(titleRes=" + this.f76221iobyxmoadg + ", descriptionRes=" + this.f76223zoijcleaow + ", isVisible=" + this.f76222ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f76221iobyxmoadg;
    }
}
