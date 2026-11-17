package gm;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final long f37802iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final long f37803jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long f37804yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f37805zdlpuopuiu;

    private draadjrbmk(long j13, long j14, long j15, long j16) {
        this.f37805zdlpuopuiu = j13;
        this.f37804yggfygwlhe = j14;
        this.f37803jyumaefscl = j15;
        this.f37802iwizpuwonk = j16;
    }

    public static draadjrbmk ojitshcjhn(long j13, long j14) {
        if (j13 <= j14) {
            return new draadjrbmk(j13, j13, j14, j14);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static draadjrbmk rgvfuqvkyq(long j13, long j14, long j15) {
        return vdvldrhtss(j13, j13, j14, j15);
    }

    public static draadjrbmk vdvldrhtss(long j13, long j14, long j15, long j16) {
        if (j13 > j14) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j15 > j16) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (j14 <= j16) {
            return new draadjrbmk(j13, j14, j15, j16);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public boolean agtfadlqog(long j13) {
        return j13 >= nufgyqmvbu() && j13 <= lqeggnwhkg();
    }

    public boolean btonecajqb() {
        return nufgyqmvbu() >= -2147483648L && lqeggnwhkg() <= 2147483647L;
    }

    public boolean draadjrbmk(long j13) {
        return btonecajqb() && agtfadlqog(j13);
    }

    public boolean dxjokdxxww() {
        return this.f37805zdlpuopuiu == this.f37804yggfygwlhe && this.f37803jyumaefscl == this.f37802iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f37805zdlpuopuiu == draadjrbmkVar.f37805zdlpuopuiu && this.f37804yggfygwlhe == draadjrbmkVar.f37804yggfygwlhe && this.f37803jyumaefscl == draadjrbmkVar.f37803jyumaefscl && this.f37802iwizpuwonk == draadjrbmkVar.f37802iwizpuwonk;
    }

    public int hashCode() {
        long j13 = this.f37805zdlpuopuiu;
        long j14 = this.f37804yggfygwlhe;
        long j15 = (j13 + j14) << ((int) (j14 + 16));
        long j16 = this.f37803jyumaefscl;
        long j17 = (j15 >> ((int) (j16 + 48))) << ((int) (j16 + 32));
        long j18 = this.f37802iwizpuwonk;
        long j19 = ((j17 >> ((int) (32 + j18))) << ((int) (j18 + 48))) >> 16;
        return (int) (j19 ^ (j19 >>> 32));
    }

    public int iobyxmoadg(long j13, nufgyqmvbu nufgyqmvbuVar) {
        if (draadjrbmk(j13)) {
            return (int) j13;
        }
        throw new DateTimeException("Invalid int value for " + nufgyqmvbuVar + ": " + j13);
    }

    public long lqeggnwhkg() {
        return this.f37802iwizpuwonk;
    }

    public long nufgyqmvbu() {
        return this.f37805zdlpuopuiu;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f37805zdlpuopuiu);
        if (this.f37805zdlpuopuiu != this.f37804yggfygwlhe) {
            sb3.append('/');
            sb3.append(this.f37804yggfygwlhe);
        }
        sb3.append(" - ");
        sb3.append(this.f37803jyumaefscl);
        if (this.f37803jyumaefscl != this.f37802iwizpuwonk) {
            sb3.append('/');
            sb3.append(this.f37802iwizpuwonk);
        }
        return sb3.toString();
    }

    public long wkgbmnqykc(long j13, nufgyqmvbu nufgyqmvbuVar) {
        if (agtfadlqog(j13)) {
            return j13;
        }
        if (nufgyqmvbuVar == null) {
            throw new DateTimeException("Invalid value (valid values " + this + "): " + j13);
        }
        throw new DateTimeException("Invalid value for " + nufgyqmvbuVar + " (valid values " + this + "): " + j13);
    }
}
