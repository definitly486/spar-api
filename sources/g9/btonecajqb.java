package g9;

/* JADX INFO: loaded from: classes2.dex */
public class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Class f36679iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Class f36680ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Class f36681zoijcleaow;

    public btonecajqb() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return this.f36679iobyxmoadg.equals(btonecajqbVar.f36679iobyxmoadg) && this.f36681zoijcleaow.equals(btonecajqbVar.f36681zoijcleaow) && draadjrbmk.wkgbmnqykc(this.f36680ppxfxbqfkf, btonecajqbVar.f36680ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f36679iobyxmoadg.hashCode() * 31) + this.f36681zoijcleaow.hashCode()) * 31;
        Class cls = this.f36680ppxfxbqfkf;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public void iobyxmoadg(Class cls, Class cls2, Class cls3) {
        this.f36679iobyxmoadg = cls;
        this.f36681zoijcleaow = cls2;
        this.f36680ppxfxbqfkf = cls3;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f36679iobyxmoadg + ", second=" + this.f36681zoijcleaow + '}';
    }

    public btonecajqb(Class cls, Class cls2, Class cls3) {
        iobyxmoadg(cls, cls2, cls3);
    }
}
