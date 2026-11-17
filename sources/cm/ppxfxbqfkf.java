package cm;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf implements Comparable, Serializable {
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f20147yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f20148zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final ppxfxbqfkf f20146jyumaefscl = new ppxfxbqfkf(0, 0);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final BigInteger f20145iwizpuwonk = BigInteger.valueOf(1000000000);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final Pattern f20144cqumvgiudr = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);

    private ppxfxbqfkf(long j13, int i13) {
        this.f20148zdlpuopuiu = j13;
        this.f20147yggfygwlhe = i13;
    }

    public static ppxfxbqfkf btonecajqb(long j13, long j14) {
        return wkgbmnqykc(fm.ppxfxbqfkf.btonecajqb(j13, fm.ppxfxbqfkf.eablkybsjg(j14, 1000000000L)), fm.ppxfxbqfkf.lqeggnwhkg(j14, 1000000000));
    }

    static ppxfxbqfkf draadjrbmk(DataInput dataInput) {
        return btonecajqb(dataInput.readLong(), dataInput.readInt());
    }

    public static ppxfxbqfkf dxjokdxxww(long j13) {
        return wkgbmnqykc(j13, 0);
    }

    public static ppxfxbqfkf nufgyqmvbu(long j13) {
        long j14 = j13 / 1000000000;
        int i13 = (int) (j13 % 1000000000);
        if (i13 < 0) {
            i13 += 1000000000;
            j14--;
        }
        return wkgbmnqykc(j14, i13);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static ppxfxbqfkf wkgbmnqykc(long j13, int i13) {
        return (((long) i13) | j13) == 0 ? f20146jyumaefscl : new ppxfxbqfkf(j13, i13);
    }

    private Object writeReplace() {
        return new wflxmlrfwp((byte) 1, this);
    }

    void agtfadlqog(DataOutput dataOutput) {
        dataOutput.writeLong(this.f20148zdlpuopuiu);
        dataOutput.writeInt(this.f20147yggfygwlhe);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f20148zdlpuopuiu == ppxfxbqfkfVar.f20148zdlpuopuiu && this.f20147yggfygwlhe == ppxfxbqfkfVar.f20147yggfygwlhe;
    }

    public int hashCode() {
        long j13 = this.f20148zdlpuopuiu;
        return ((int) (j13 ^ (j13 >>> 32))) + (this.f20147yggfygwlhe * 51);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public int compareTo(ppxfxbqfkf ppxfxbqfkfVar) {
        int iZoijcleaow = fm.ppxfxbqfkf.zoijcleaow(this.f20148zdlpuopuiu, ppxfxbqfkfVar.f20148zdlpuopuiu);
        return iZoijcleaow != 0 ? iZoijcleaow : this.f20147yggfygwlhe - ppxfxbqfkfVar.f20147yggfygwlhe;
    }

    public long lqeggnwhkg() {
        return this.f20148zdlpuopuiu;
    }

    public String toString() {
        if (this == f20146jyumaefscl) {
            return "PT0S";
        }
        long j13 = this.f20148zdlpuopuiu;
        long j14 = j13 / 3600;
        int i13 = (int) ((j13 % 3600) / 60);
        int i14 = (int) (j13 % 60);
        StringBuilder sb3 = new StringBuilder(24);
        sb3.append("PT");
        if (j14 != 0) {
            sb3.append(j14);
            sb3.append('H');
        }
        if (i13 != 0) {
            sb3.append(i13);
            sb3.append('M');
        }
        if (i14 == 0 && this.f20147yggfygwlhe == 0 && sb3.length() > 2) {
            return sb3.toString();
        }
        if (i14 >= 0 || this.f20147yggfygwlhe <= 0) {
            sb3.append(i14);
        } else if (i14 == -1) {
            sb3.append("-0");
        } else {
            sb3.append(i14 + 1);
        }
        if (this.f20147yggfygwlhe > 0) {
            int length = sb3.length();
            if (i14 < 0) {
                sb3.append(2000000000 - this.f20147yggfygwlhe);
            } else {
                sb3.append(this.f20147yggfygwlhe + 1000000000);
            }
            while (sb3.charAt(sb3.length() - 1) == '0') {
                sb3.setLength(sb3.length() - 1);
            }
            sb3.setCharAt(length, '.');
        }
        sb3.append('S');
        return sb3.toString();
    }
}
