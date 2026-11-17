package cf1;

import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Integer f19839eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f19840iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f19841ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f19842wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f19843zoijcleaow;

    public zoijcleaow(String orderId, String message, String emoji, iobyxmoadg backgroundColor, Integer num) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(emoji, "emoji");
        zdlpuopuiu.btonecajqb(backgroundColor, "backgroundColor");
        this.f19840iobyxmoadg = orderId;
        this.f19843zoijcleaow = message;
        this.f19841ppxfxbqfkf = emoji;
        this.f19842wkgbmnqykc = backgroundColor;
        this.f19839eablkybsjg = num;
    }

    private final String iobyxmoadg(String str) {
        if (!kcexrzcfyt.stevsuqkhv(str, "&#", false, 2, null)) {
            return str;
        }
        Integer numDecode = Integer.decode(kcexrzcfyt.hkdspvbjdz(str, "&#", "", false, 4, null));
        StringBuilder sb3 = new StringBuilder();
        zdlpuopuiu.lqeggnwhkg(numDecode);
        String string = sb3.appendCodePoint(numDecode.intValue()).toString();
        zdlpuopuiu.lqeggnwhkg(string);
        return string;
    }

    public final String eablkybsjg() {
        return this.f19840iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f19840iobyxmoadg, zoijcleaowVar.f19840iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f19843zoijcleaow, zoijcleaowVar.f19843zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f19841ppxfxbqfkf, zoijcleaowVar.f19841ppxfxbqfkf) && this.f19842wkgbmnqykc == zoijcleaowVar.f19842wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f19839eablkybsjg, zoijcleaowVar.f19839eablkybsjg);
    }

    public final Integer gxszxtbevo() {
        return this.f19839eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f19840iobyxmoadg.hashCode() * 31) + this.f19843zoijcleaow.hashCode()) * 31) + this.f19841ppxfxbqfkf.hashCode()) * 31) + this.f19842wkgbmnqykc.hashCode()) * 31;
        Integer num = this.f19839eablkybsjg;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String ppxfxbqfkf() {
        return iobyxmoadg(this.f19841ppxfxbqfkf);
    }

    public String toString() {
        return "OrderStatusBannerUiModel(orderId=" + this.f19840iobyxmoadg + ", message=" + this.f19843zoijcleaow + ", emoji=" + this.f19841ppxfxbqfkf + ", backgroundColor=" + this.f19842wkgbmnqykc + ", otherImageRes=" + this.f19839eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f19843zoijcleaow;
    }

    public final iobyxmoadg zoijcleaow() {
        return this.f19842wkgbmnqykc;
    }
}
