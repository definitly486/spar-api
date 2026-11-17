package e4;

import java.util.Arrays;
import java.util.Objects;
import v2.jyumaefscl;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements jyumaefscl.iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final androidx.media3.common.iobyxmoadg f30411lqeggnwhkg = new androidx.media3.common.iobyxmoadg.zoijcleaow().zeieaojujs("application/id3").cllcsxoeiz();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final androidx.media3.common.iobyxmoadg f30412nufgyqmvbu = new androidx.media3.common.iobyxmoadg.zoijcleaow().zeieaojujs("application/x-scte35").cllcsxoeiz();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final byte[] f30413eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f30414gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f30415iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final long f30416ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final long f30417wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f30418zoijcleaow;

    public iobyxmoadg(String str, String str2, long j13, long j14, byte[] bArr) {
        this.f30415iobyxmoadg = str;
        this.f30418zoijcleaow = str2;
        this.f30416ppxfxbqfkf = j13;
        this.f30417wkgbmnqykc = j14;
        this.f30413eablkybsjg = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iobyxmoadg.class != obj.getClass()) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f30416ppxfxbqfkf == iobyxmoadgVar.f30416ppxfxbqfkf && this.f30417wkgbmnqykc == iobyxmoadgVar.f30417wkgbmnqykc && Objects.equals(this.f30415iobyxmoadg, iobyxmoadgVar.f30415iobyxmoadg) && Objects.equals(this.f30418zoijcleaow, iobyxmoadgVar.f30418zoijcleaow) && Arrays.equals(this.f30413eablkybsjg, iobyxmoadgVar.f30413eablkybsjg);
    }

    public int hashCode() {
        if (this.f30414gxszxtbevo == 0) {
            String str = this.f30415iobyxmoadg;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f30418zoijcleaow;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j13 = this.f30416ppxfxbqfkf;
            int i13 = (((iHashCode + iHashCode2) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f30417wkgbmnqykc;
            this.f30414gxszxtbevo = ((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + Arrays.hashCode(this.f30413eablkybsjg);
        }
        return this.f30414gxszxtbevo;
    }

    @Override // v2.jyumaefscl.iobyxmoadg
    public androidx.media3.common.iobyxmoadg iobyxmoadg() {
        String str = this.f30415iobyxmoadg;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f30412nufgyqmvbu;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f30411lqeggnwhkg;
            default:
                return null;
        }
    }

    @Override // v2.jyumaefscl.iobyxmoadg
    public byte[] ppxfxbqfkf() {
        if (iobyxmoadg() != null) {
            return this.f30413eablkybsjg;
        }
        return null;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f30415iobyxmoadg + ", id=" + this.f30417wkgbmnqykc + ", durationMs=" + this.f30416ppxfxbqfkf + ", value=" + this.f30418zoijcleaow;
    }
}
