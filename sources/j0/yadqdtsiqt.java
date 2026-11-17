package j0;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iozdgvuglv f50318iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f50319ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f50320zoijcleaow;

    public yadqdtsiqt(iozdgvuglv iozdgvuglvVar, int i13, int i14) {
        this.f50318iobyxmoadg = iozdgvuglvVar;
        this.f50320zoijcleaow = i13;
        this.f50319ppxfxbqfkf = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yadqdtsiqt)) {
            return false;
        }
        yadqdtsiqt yadqdtsiqtVar = (yadqdtsiqt) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50318iobyxmoadg, yadqdtsiqtVar.f50318iobyxmoadg) && this.f50320zoijcleaow == yadqdtsiqtVar.f50320zoijcleaow && this.f50319ppxfxbqfkf == yadqdtsiqtVar.f50319ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f50318iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f50320zoijcleaow)) * 31) + Integer.hashCode(this.f50319ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f50319ppxfxbqfkf;
    }

    public final int ppxfxbqfkf() {
        return this.f50320zoijcleaow;
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f50318iobyxmoadg + ", startIndex=" + this.f50320zoijcleaow + ", endIndex=" + this.f50319ppxfxbqfkf + ')';
    }

    public final iozdgvuglv zoijcleaow() {
        return this.f50318iobyxmoadg;
    }
}
