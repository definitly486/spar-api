package hy;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb implements h60.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f41279iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f41280ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f41281zoijcleaow;

    public btonecajqb(double d13, double d14, double d15) {
        this.f41279iobyxmoadg = d13;
        this.f41281zoijcleaow = d14;
        this.f41280ppxfxbqfkf = d15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return Double.compare(this.f41279iobyxmoadg, btonecajqbVar.f41279iobyxmoadg) == 0 && Double.compare(this.f41281zoijcleaow, btonecajqbVar.f41281zoijcleaow) == 0 && Double.compare(this.f41280ppxfxbqfkf, btonecajqbVar.f41280ppxfxbqfkf) == 0;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f41279iobyxmoadg) * 31) + Double.hashCode(this.f41281zoijcleaow)) * 31) + Double.hashCode(this.f41280ppxfxbqfkf);
    }

    public final double iobyxmoadg() {
        return this.f41280ppxfxbqfkf;
    }

    public final double ppxfxbqfkf() {
        return this.f41279iobyxmoadg;
    }

    public String toString() {
        return "OrderPropertiesEntity(minPrice=" + this.f41279iobyxmoadg + ", freeDeliveryFrom=" + this.f41281zoijcleaow + ", basketSum=" + this.f41280ppxfxbqfkf + ")";
    }

    public final double zoijcleaow() {
        return this.f41281zoijcleaow;
    }
}
