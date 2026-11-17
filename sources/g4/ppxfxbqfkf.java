package g4;

import java.util.Arrays;
import v2.jyumaefscl;
import v2.yggfygwlhe;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf implements jyumaefscl.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final byte[] f36176iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f36177ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f36178zoijcleaow;

    public ppxfxbqfkf(byte[] bArr, String str, String str2) {
        this.f36176iobyxmoadg = bArr;
        this.f36178zoijcleaow = str;
        this.f36177ppxfxbqfkf = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ppxfxbqfkf.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f36176iobyxmoadg, ((ppxfxbqfkf) obj).f36176iobyxmoadg);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f36176iobyxmoadg);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f36178zoijcleaow, this.f36177ppxfxbqfkf, Integer.valueOf(this.f36176iobyxmoadg.length));
    }

    @Override // v2.jyumaefscl.iobyxmoadg
    public void zoijcleaow(yggfygwlhe.zoijcleaow zoijcleaowVar) {
        String str = this.f36178zoijcleaow;
        if (str != null) {
            zoijcleaowVar.bfopjjpdmp(str);
        }
    }
}
