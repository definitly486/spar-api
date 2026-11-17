package dc;

/* JADX INFO: loaded from: classes2.dex */
final class yadqdtsiqt extends lmojexxdyd.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27784iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f27785ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27786zoijcleaow;

    yadqdtsiqt(String str, String str2, boolean z13) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f27784iobyxmoadg = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f27786zoijcleaow = str2;
        this.f27785ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lmojexxdyd.ppxfxbqfkf)) {
            return false;
        }
        lmojexxdyd.ppxfxbqfkf ppxfxbqfkfVar = (lmojexxdyd.ppxfxbqfkf) obj;
        return this.f27784iobyxmoadg.equals(ppxfxbqfkfVar.wkgbmnqykc()) && this.f27786zoijcleaow.equals(ppxfxbqfkfVar.ppxfxbqfkf()) && this.f27785ppxfxbqfkf == ppxfxbqfkfVar.zoijcleaow();
    }

    public int hashCode() {
        return ((((this.f27784iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f27786zoijcleaow.hashCode()) * 1000003) ^ (this.f27785ppxfxbqfkf ? 1231 : 1237);
    }

    @Override // dc.lmojexxdyd.ppxfxbqfkf
    public String ppxfxbqfkf() {
        return this.f27786zoijcleaow;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f27784iobyxmoadg + ", osCodeName=" + this.f27786zoijcleaow + ", isRooted=" + this.f27785ppxfxbqfkf + "}";
    }

    @Override // dc.lmojexxdyd.ppxfxbqfkf
    public String wkgbmnqykc() {
        return this.f27784iobyxmoadg;
    }

    @Override // dc.lmojexxdyd.ppxfxbqfkf
    public boolean zoijcleaow() {
        return this.f27785ppxfxbqfkf;
    }
}
