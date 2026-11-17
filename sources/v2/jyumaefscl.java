package v2;

import java.util.Arrays;
import java.util.List;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg[] f115382iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f115383zoijcleaow;

    public interface iobyxmoadg {
        default androidx.media3.common.iobyxmoadg iobyxmoadg() {
            return null;
        }

        default byte[] ppxfxbqfkf() {
            return null;
        }

        default void zoijcleaow(yggfygwlhe.zoijcleaow zoijcleaowVar) {
        }
    }

    public jyumaefscl(iobyxmoadg... iobyxmoadgVarArr) {
        this(-9223372036854775807L, iobyxmoadgVarArr);
    }

    public int eablkybsjg() {
        return this.f115382iobyxmoadg.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jyumaefscl.class != obj.getClass()) {
            return false;
        }
        jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
        return Arrays.equals(this.f115382iobyxmoadg, jyumaefsclVar.f115382iobyxmoadg) && this.f115383zoijcleaow == jyumaefsclVar.f115383zoijcleaow;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f115382iobyxmoadg) * 31) + com.google.common.primitives.nufgyqmvbu.iobyxmoadg(this.f115383zoijcleaow);
    }

    public jyumaefscl iobyxmoadg(iobyxmoadg... iobyxmoadgVarArr) {
        return iobyxmoadgVarArr.length == 0 ? this : new jyumaefscl(this.f115383zoijcleaow, (iobyxmoadg[]) stevsuqkhv.rhgxfdycjh(this.f115382iobyxmoadg, iobyxmoadgVarArr));
    }

    public jyumaefscl ppxfxbqfkf(long j13) {
        return this.f115383zoijcleaow == j13 ? this : new jyumaefscl(j13, this.f115382iobyxmoadg);
    }

    public String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("entries=");
        sb3.append(Arrays.toString(this.f115382iobyxmoadg));
        if (this.f115383zoijcleaow == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f115383zoijcleaow;
        }
        sb3.append(str);
        return sb3.toString();
    }

    public iobyxmoadg wkgbmnqykc(int i13) {
        return this.f115382iobyxmoadg[i13];
    }

    public jyumaefscl zoijcleaow(jyumaefscl jyumaefsclVar) {
        return jyumaefsclVar == null ? this : iobyxmoadg(jyumaefsclVar.f115382iobyxmoadg);
    }

    public jyumaefscl(long j13, iobyxmoadg... iobyxmoadgVarArr) {
        this.f115383zoijcleaow = j13;
        this.f115382iobyxmoadg = iobyxmoadgVarArr;
    }

    public jyumaefscl(List list) {
        this((iobyxmoadg[]) list.toArray(new iobyxmoadg[0]));
    }

    public jyumaefscl(long j13, List list) {
        this(j13, (iobyxmoadg[]) list.toArray(new iobyxmoadg[0]));
    }
}
