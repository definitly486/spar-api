package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class l6 extends lx {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final Integer f57395agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final int f57396btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final int f57397draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final int f57398gtknphoqwx;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public final String f57399kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final String f57400ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public final String f57401oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final Integer f57402rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public final vu f57403vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final int f57404wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final Integer f57405yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final boolean f57406zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(int i13, int i14, int i15, int i16, Integer num, String number, Integer num2, vu title, String name, String str, boolean z13, Integer num3) {
        super(title, name, i16, num, number, num2, str, false, null, 384);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(number, "number");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        this.f57396btonecajqb = i13;
        this.f57398gtknphoqwx = i14;
        this.f57397draadjrbmk = i15;
        this.f57404wflxmlrfwp = i16;
        this.f57395agtfadlqog = num;
        this.f57400ojitshcjhn = number;
        this.f57402rgvfuqvkyq = num2;
        this.f57403vdvldrhtss = title;
        this.f57401oxmwwwfdhm = name;
        this.f57399kcexrzcfyt = str;
        this.f57406zdlpuopuiu = z13;
        this.f57405yggfygwlhe = num3;
    }

    @Override // kk.lx
    public final boolean eablkybsjg() {
        return this.f57406zdlpuopuiu;
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
        return this.f57396btonecajqb == l6Var.f57396btonecajqb && this.f57404wflxmlrfwp == l6Var.f57404wflxmlrfwp && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57395agtfadlqog, l6Var.f57395agtfadlqog) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57400ojitshcjhn, l6Var.f57400ojitshcjhn) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57402rgvfuqvkyq, l6Var.f57402rgvfuqvkyq) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57403vdvldrhtss, l6Var.f57403vdvldrhtss) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57401oxmwwwfdhm, l6Var.f57401oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57399kcexrzcfyt, l6Var.f57399kcexrzcfyt) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57405yggfygwlhe, l6Var.f57405yggfygwlhe);
    }

    @Override // kk.lx
    public final Integer gxszxtbevo() {
        return this.f57395agtfadlqog;
    }

    @Override // kk.lx
    public final int hashCode() {
        int i13 = ((this.f57396btonecajqb * 31) + this.f57404wflxmlrfwp) * 31;
        Integer num = this.f57395agtfadlqog;
        int iIobyxmoadg = xg.iobyxmoadg(this.f57400ojitshcjhn, (i13 + (num != null ? num.intValue() : 0)) * 31, 31);
        Integer num2 = this.f57402rgvfuqvkyq;
        int iIobyxmoadg2 = xg.iobyxmoadg(this.f57401oxmwwwfdhm, (this.f57403vdvldrhtss.hashCode() + ((iIobyxmoadg + (num2 != null ? num2.intValue() : 0)) * 31)) * 31, 31);
        String str = this.f57399kcexrzcfyt;
        int iHashCode = (iIobyxmoadg2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num3 = this.f57405yggfygwlhe;
        return iHashCode + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // kk.lx
    public final Integer iobyxmoadg() {
        return this.f57402rgvfuqvkyq;
    }

    @Override // kk.lx
    public final Integer lqeggnwhkg() {
        return this.f57405yggfygwlhe;
    }

    @Override // kk.lx
    public final vu nufgyqmvbu() {
        return this.f57403vdvldrhtss;
    }

    @Override // kk.lx
    public final String ppxfxbqfkf() {
        return this.f57400ojitshcjhn;
    }

    @Override // kk.lx
    public final String toString() {
        return "BankCard(paymentId=" + this.f57396btonecajqb + ", backgroundColor=" + this.f57398gtknphoqwx + ", statusImage=" + this.f57397draadjrbmk + ", numberResId=" + this.f57404wflxmlrfwp + ", pluralsResId=" + this.f57395agtfadlqog + ", number='" + this.f57400ojitshcjhn + "', cardsCount=" + this.f57402rgvfuqvkyq + ", title=" + this.f57403vdvldrhtss + ", name='" + this.f57401oxmwwwfdhm + "', cardLogo=" + this.f57399kcexrzcfyt + ", precalculatedBonuses='" + this.f57405yggfygwlhe + "')";
    }

    @Override // kk.lx
    public final int wkgbmnqykc() {
        return this.f57404wflxmlrfwp;
    }

    @Override // kk.lx
    public final String zoijcleaow() {
        return this.f57401oxmwwwfdhm;
    }
}
