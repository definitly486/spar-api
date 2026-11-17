package xh0;

import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Integer f122403eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f122404iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f122405ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f122406wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f122407zoijcleaow;

    public zoijcleaow(String orderId, String message, String emoji, iobyxmoadg backgroundColor, Integer num) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(emoji, "emoji");
        zdlpuopuiu.btonecajqb(backgroundColor, "backgroundColor");
        this.f122404iobyxmoadg = orderId;
        this.f122407zoijcleaow = message;
        this.f122405ppxfxbqfkf = emoji;
        this.f122406wkgbmnqykc = backgroundColor;
        this.f122403eablkybsjg = num;
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
        return this.f122404iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f122404iobyxmoadg, zoijcleaowVar.f122404iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f122407zoijcleaow, zoijcleaowVar.f122407zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122405ppxfxbqfkf, zoijcleaowVar.f122405ppxfxbqfkf) && this.f122406wkgbmnqykc == zoijcleaowVar.f122406wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f122403eablkybsjg, zoijcleaowVar.f122403eablkybsjg);
    }

    public final Integer gxszxtbevo() {
        return this.f122403eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f122404iobyxmoadg.hashCode() * 31) + this.f122407zoijcleaow.hashCode()) * 31) + this.f122405ppxfxbqfkf.hashCode()) * 31) + this.f122406wkgbmnqykc.hashCode()) * 31;
        Integer num = this.f122403eablkybsjg;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String ppxfxbqfkf() {
        return iobyxmoadg(this.f122405ppxfxbqfkf);
    }

    public String toString() {
        return "OrderStatusBannerUiModel(orderId=" + this.f122404iobyxmoadg + ", message=" + this.f122407zoijcleaow + ", emoji=" + this.f122405ppxfxbqfkf + ", backgroundColor=" + this.f122406wkgbmnqykc + ", otherImageRes=" + this.f122403eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f122407zoijcleaow;
    }

    public final iobyxmoadg zoijcleaow() {
        return this.f122406wkgbmnqykc;
    }
}
