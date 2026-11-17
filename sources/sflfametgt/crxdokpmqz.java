package sflfametgt;

/* JADX INFO: loaded from: classes.dex */
public final class crxdokpmqz implements sopmlzcsov {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f106135zoijcleaow;

    public crxdokpmqz(int i13) {
        this.f106135zoijcleaow = i13;
    }

    public boolean equals(Object obj) {
        return (obj instanceof crxdokpmqz) && this.f106135zoijcleaow == ((crxdokpmqz) obj).f106135zoijcleaow;
    }

    public int hashCode() {
        return Integer.hashCode(this.f106135zoijcleaow);
    }

    @Override // sflfametgt.sopmlzcsov
    public int iobyxmoadg(int i13, int i14, float f13, int i15, int i16) {
        long j13 = i13;
        return zg.gtknphoqwx.agtfadlqog(i14, (int) zg.gtknphoqwx.lqeggnwhkg(j13 - ((long) this.f106135zoijcleaow), 0L), (int) zg.gtknphoqwx.gtknphoqwx(j13 + ((long) this.f106135zoijcleaow), 2147483647L));
    }
}
