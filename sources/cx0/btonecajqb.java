package cx0;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb implements u41.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f26024iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f26025ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f26026zoijcleaow;

    public btonecajqb(double d13, double d14, double d15) {
        this.f26024iobyxmoadg = d13;
        this.f26026zoijcleaow = d14;
        this.f26025ppxfxbqfkf = d15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return Double.compare(this.f26024iobyxmoadg, btonecajqbVar.f26024iobyxmoadg) == 0 && Double.compare(this.f26026zoijcleaow, btonecajqbVar.f26026zoijcleaow) == 0 && Double.compare(this.f26025ppxfxbqfkf, btonecajqbVar.f26025ppxfxbqfkf) == 0;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f26024iobyxmoadg) * 31) + Double.hashCode(this.f26026zoijcleaow)) * 31) + Double.hashCode(this.f26025ppxfxbqfkf);
    }

    public final double iobyxmoadg() {
        return this.f26025ppxfxbqfkf;
    }

    public final double ppxfxbqfkf() {
        return this.f26024iobyxmoadg;
    }

    public String toString() {
        return "OrderPropertiesEntity(minPrice=" + this.f26024iobyxmoadg + ", freeDeliveryFrom=" + this.f26026zoijcleaow + ", basketSum=" + this.f26025ppxfxbqfkf + ")";
    }

    public final double zoijcleaow() {
        return this.f26026zoijcleaow;
    }
}
