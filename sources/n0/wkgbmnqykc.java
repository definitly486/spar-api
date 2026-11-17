package n0;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc implements dsvhmnatus {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f68349zoijcleaow;

    public wkgbmnqykc(int i13) {
        this.f68349zoijcleaow = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkgbmnqykc) && this.f68349zoijcleaow == ((wkgbmnqykc) obj).f68349zoijcleaow;
    }

    public int hashCode() {
        return Integer.hashCode(this.f68349zoijcleaow);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f68349zoijcleaow + ')';
    }

    @Override // n0.dsvhmnatus
    public yadqdtsiqt wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar) {
        int i13 = this.f68349zoijcleaow;
        return (i13 == 0 || i13 == Integer.MAX_VALUE) ? yadqdtsiqtVar : new yadqdtsiqt(zg.gtknphoqwx.agtfadlqog(yadqdtsiqtVar.dxjokdxxww() + this.f68349zoijcleaow, 1, 1000));
    }
}
