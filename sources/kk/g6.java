package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class g6 extends lx {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final Integer f56649agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final int f56650btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final int f56651draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final int f56652gtknphoqwx;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public final String f56653kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final String f56654ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public final String f56655oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final Integer f56656rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public final vu f56657vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final int f56658wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final Integer f56659yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final boolean f56660zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(int i13, int i14, int i15, int i16, Integer num, String number, Integer num2, vu title, String name, String str, boolean z13, Integer num3) {
        super(title, name, i16, num, number, num2, str, false, null, 384);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(number, "number");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        this.f56650btonecajqb = i13;
        this.f56652gtknphoqwx = i14;
        this.f56651draadjrbmk = i15;
        this.f56658wflxmlrfwp = i16;
        this.f56649agtfadlqog = num;
        this.f56654ojitshcjhn = number;
        this.f56656rgvfuqvkyq = num2;
        this.f56657vdvldrhtss = title;
        this.f56655oxmwwwfdhm = name;
        this.f56653kcexrzcfyt = str;
        this.f56660zdlpuopuiu = z13;
        this.f56659yggfygwlhe = num3;
    }

    @Override // kk.lx
    public final boolean eablkybsjg() {
        return this.f56660zdlpuopuiu;
    }

    @Override // kk.lx
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        return this.f56650btonecajqb == l6Var.f57396btonecajqb && this.f56658wflxmlrfwp == l6Var.f57404wflxmlrfwp && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56649agtfadlqog, l6Var.f57395agtfadlqog) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56654ojitshcjhn, l6Var.f57400ojitshcjhn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56656rgvfuqvkyq, l6Var.f57402rgvfuqvkyq) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56657vdvldrhtss, l6Var.f57403vdvldrhtss) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56655oxmwwwfdhm, l6Var.f57401oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56653kcexrzcfyt, l6Var.f57399kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56659yggfygwlhe, l6Var.f57405yggfygwlhe);
    }

    @Override // kk.lx
    public final Integer gxszxtbevo() {
        return this.f56649agtfadlqog;
    }

    @Override // kk.lx
    public final int hashCode() {
        int i13 = ((this.f56650btonecajqb * 31) + this.f56658wflxmlrfwp) * 31;
        Integer num = this.f56649agtfadlqog;
        int iIobyxmoadg = xg.iobyxmoadg(this.f56654ojitshcjhn, (i13 + (num != null ? num.intValue() : 0)) * 31, 31);
        Integer num2 = this.f56656rgvfuqvkyq;
        int iIobyxmoadg2 = xg.iobyxmoadg(this.f56655oxmwwwfdhm, (this.f56657vdvldrhtss.hashCode() + ((iIobyxmoadg + (num2 != null ? num2.intValue() : 0)) * 31)) * 31, 31);
        String str = this.f56653kcexrzcfyt;
        int iHashCode = (iIobyxmoadg2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num3 = this.f56659yggfygwlhe;
        return iHashCode + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // kk.lx
    public final Integer iobyxmoadg() {
        return this.f56656rgvfuqvkyq;
    }

    @Override // kk.lx
    public final Integer lqeggnwhkg() {
        return this.f56659yggfygwlhe;
    }

    @Override // kk.lx
    public final vu nufgyqmvbu() {
        return this.f56657vdvldrhtss;
    }

    @Override // kk.lx
    public final String ppxfxbqfkf() {
        return this.f56654ojitshcjhn;
    }

    @Override // kk.lx
    public final String toString() {
        return "DisabledBankCard(paymentId=" + this.f56650btonecajqb + ", backgroundColor=" + this.f56652gtknphoqwx + ", statusImage=" + this.f56651draadjrbmk + ", numberResId=" + this.f56658wflxmlrfwp + ", pluralsResId=" + this.f56649agtfadlqog + ", number='" + this.f56654ojitshcjhn + "', cardsCount=" + this.f56656rgvfuqvkyq + ", title=" + this.f56657vdvldrhtss + ", name='" + this.f56655oxmwwwfdhm + "', cardLogo=" + this.f56653kcexrzcfyt + ", precalculatedBonuses='" + this.f56659yggfygwlhe + "')";
    }

    @Override // kk.lx
    public final int wkgbmnqykc() {
        return this.f56658wflxmlrfwp;
    }

    @Override // kk.lx
    public final String zoijcleaow() {
        return this.f56655oxmwwwfdhm;
    }
}
