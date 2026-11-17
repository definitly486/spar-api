package gm;

/* JADX INFO: loaded from: classes3.dex */
public enum zoijcleaow implements gtknphoqwx {
    NANOS("Nanos", cm.ppxfxbqfkf.nufgyqmvbu(1)),
    MICROS("Micros", cm.ppxfxbqfkf.nufgyqmvbu(1000)),
    MILLIS("Millis", cm.ppxfxbqfkf.nufgyqmvbu(1000000)),
    SECONDS("Seconds", cm.ppxfxbqfkf.dxjokdxxww(1)),
    MINUTES("Minutes", cm.ppxfxbqfkf.dxjokdxxww(60)),
    HOURS("Hours", cm.ppxfxbqfkf.dxjokdxxww(3600)),
    HALF_DAYS("HalfDays", cm.ppxfxbqfkf.dxjokdxxww(43200)),
    DAYS("Days", cm.ppxfxbqfkf.dxjokdxxww(86400)),
    WEEKS("Weeks", cm.ppxfxbqfkf.dxjokdxxww(604800)),
    MONTHS("Months", cm.ppxfxbqfkf.dxjokdxxww(2629746)),
    YEARS("Years", cm.ppxfxbqfkf.dxjokdxxww(31556952)),
    DECADES("Decades", cm.ppxfxbqfkf.dxjokdxxww(315569520)),
    CENTURIES("Centuries", cm.ppxfxbqfkf.dxjokdxxww(3155695200L)),
    MILLENNIA("Millennia", cm.ppxfxbqfkf.dxjokdxxww(31556952000L)),
    ERAS("Eras", cm.ppxfxbqfkf.dxjokdxxww(31556952000000000L)),
    FOREVER("Forever", cm.ppxfxbqfkf.btonecajqb(Long.MAX_VALUE, 999999999));


    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final cm.ppxfxbqfkf f37905yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f37906zdlpuopuiu;

    zoijcleaow(String str, cm.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f37906zdlpuopuiu = str;
        this.f37905yggfygwlhe = ppxfxbqfkfVar;
    }

    @Override // gm.gtknphoqwx
    public boolean iobyxmoadg() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f37906zdlpuopuiu;
    }

    @Override // gm.gtknphoqwx
    public wkgbmnqykc wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, long j13) {
        return wkgbmnqykcVar.wkgbmnqykc(j13, this);
    }
}
