package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class st {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ms f58577iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f58578ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f58579zoijcleaow;

    public st(ms name, int i13, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        this.f58577iobyxmoadg = name;
        this.f58579zoijcleaow = i13;
        this.f58578ppxfxbqfkf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st)) {
            return false;
        }
        st stVar = (st) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58577iobyxmoadg, stVar.f58577iobyxmoadg) && this.f58579zoijcleaow == stVar.f58579zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58578ppxfxbqfkf, stVar.f58578ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(null, null);
    }

    public final int hashCode() {
        int iHashCode = (Integer.hashCode(this.f58579zoijcleaow) + (this.f58577iobyxmoadg.hashCode() * 31)) * 31;
        String str = this.f58578ppxfxbqfkf;
        return (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        return "UserData(name=" + this.f58577iobyxmoadg + ", icon=" + this.f58579zoijcleaow + ", phone=" + this.f58578ppxfxbqfkf + ", email=" + ((String) null) + ")";
    }
}
