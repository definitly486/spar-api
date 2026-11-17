package f4;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import v2.iwizpuwonk;
import v2.jyumaefscl;
import v2.yggfygwlhe;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements jyumaefscl.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int f32769eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final int f32770gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f32771iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final int f32772lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final byte[] f32773nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f32774ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f32775wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f32776zoijcleaow;

    public iobyxmoadg(int i13, String str, String str2, int i14, int i15, int i16, int i17, byte[] bArr) {
        this.f32771iobyxmoadg = i13;
        this.f32776zoijcleaow = str;
        this.f32774ppxfxbqfkf = str2;
        this.f32775wkgbmnqykc = i14;
        this.f32769eablkybsjg = i15;
        this.f32770gxszxtbevo = i16;
        this.f32772lqeggnwhkg = i17;
        this.f32773nufgyqmvbu = bArr;
    }

    public static iobyxmoadg wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar) {
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        String strOxmwwwfdhm = iwizpuwonk.oxmwwwfdhm(yadqdtsiqtVar.iozdgvuglv(yadqdtsiqtVar.vdvldrhtss(), StandardCharsets.US_ASCII));
        String strYadqdtsiqt = yadqdtsiqtVar.yadqdtsiqt(yadqdtsiqtVar.vdvldrhtss());
        int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
        int iVdvldrhtss3 = yadqdtsiqtVar.vdvldrhtss();
        int iVdvldrhtss4 = yadqdtsiqtVar.vdvldrhtss();
        int iVdvldrhtss5 = yadqdtsiqtVar.vdvldrhtss();
        int iVdvldrhtss6 = yadqdtsiqtVar.vdvldrhtss();
        byte[] bArr = new byte[iVdvldrhtss6];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, iVdvldrhtss6);
        return new iobyxmoadg(iVdvldrhtss, strOxmwwwfdhm, strYadqdtsiqt, iVdvldrhtss2, iVdvldrhtss3, iVdvldrhtss4, iVdvldrhtss5, bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iobyxmoadg.class != obj.getClass()) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f32771iobyxmoadg == iobyxmoadgVar.f32771iobyxmoadg && this.f32776zoijcleaow.equals(iobyxmoadgVar.f32776zoijcleaow) && this.f32774ppxfxbqfkf.equals(iobyxmoadgVar.f32774ppxfxbqfkf) && this.f32775wkgbmnqykc == iobyxmoadgVar.f32775wkgbmnqykc && this.f32769eablkybsjg == iobyxmoadgVar.f32769eablkybsjg && this.f32770gxszxtbevo == iobyxmoadgVar.f32770gxszxtbevo && this.f32772lqeggnwhkg == iobyxmoadgVar.f32772lqeggnwhkg && Arrays.equals(this.f32773nufgyqmvbu, iobyxmoadgVar.f32773nufgyqmvbu);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f32771iobyxmoadg) * 31) + this.f32776zoijcleaow.hashCode()) * 31) + this.f32774ppxfxbqfkf.hashCode()) * 31) + this.f32775wkgbmnqykc) * 31) + this.f32769eablkybsjg) * 31) + this.f32770gxszxtbevo) * 31) + this.f32772lqeggnwhkg) * 31) + Arrays.hashCode(this.f32773nufgyqmvbu);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f32776zoijcleaow + ", description=" + this.f32774ppxfxbqfkf;
    }

    @Override // v2.jyumaefscl.iobyxmoadg
    public void zoijcleaow(yggfygwlhe.zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.hcddaimhww(this.f32773nufgyqmvbu, this.f32771iobyxmoadg);
    }
}
