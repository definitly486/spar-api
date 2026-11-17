package jpowsppfya;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends wypolnanlu.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wwaezpbzkn f52062iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f52063zoijcleaow;

    zoijcleaow(wwaezpbzkn wwaezpbzknVar, List list) {
        if (wwaezpbzknVar == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f52062iobyxmoadg = wwaezpbzknVar;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f52063zoijcleaow = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wypolnanlu.zoijcleaow)) {
            return false;
        }
        wypolnanlu.zoijcleaow zoijcleaowVar = (wypolnanlu.zoijcleaow) obj;
        return this.f52062iobyxmoadg.equals(zoijcleaowVar.zoijcleaow()) && this.f52063zoijcleaow.equals(zoijcleaowVar.iobyxmoadg());
    }

    public int hashCode() {
        return ((this.f52062iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f52063zoijcleaow.hashCode();
    }

    @Override // jpowsppfya.wypolnanlu.zoijcleaow
    public List iobyxmoadg() {
        return this.f52063zoijcleaow;
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f52062iobyxmoadg + ", outConfigs=" + this.f52063zoijcleaow + "}";
    }

    @Override // jpowsppfya.wypolnanlu.zoijcleaow
    public wwaezpbzkn zoijcleaow() {
        return this.f52062iobyxmoadg;
    }
}
