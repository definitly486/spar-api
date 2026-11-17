package hm;

import cm.vdvldrhtss;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
final class iobyxmoadg implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f40778yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private byte f40779zdlpuopuiu;

    iobyxmoadg(byte b13, Object obj) {
        this.f40779zdlpuopuiu = b13;
        this.f40778yggfygwlhe = obj;
    }

    private static void btonecajqb(byte b13, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b13);
        if (b13 == 1) {
            ((zoijcleaow) obj).yggfygwlhe(dataOutput);
        } else if (b13 == 2) {
            ((wkgbmnqykc) obj).zdlpuopuiu(dataOutput);
        } else {
            if (b13 != 3) {
                throw new InvalidClassException("Unknown serialized type");
            }
            ((eablkybsjg) obj).nufgyqmvbu(dataOutput);
        }
    }

    static void draadjrbmk(vdvldrhtss vdvldrhtssVar, DataOutput dataOutput) {
        int iLmojexxdyd = vdvldrhtssVar.lmojexxdyd();
        int i13 = iLmojexxdyd % 900 == 0 ? iLmojexxdyd / 900 : 127;
        dataOutput.writeByte(i13);
        if (i13 == 127) {
            dataOutput.writeInt(iLmojexxdyd);
        }
    }

    static void dxjokdxxww(long j13, DataOutput dataOutput) {
        if (j13 < -4575744000L || j13 >= 10413792000L || j13 % 900 != 0) {
            dataOutput.writeByte(KotlinVersion.MAX_COMPONENT_VALUE);
            dataOutput.writeLong(j13);
        } else {
            int i13 = (int) ((j13 + 4575744000L) / 900);
            dataOutput.writeByte((i13 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            dataOutput.writeByte((i13 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            dataOutput.writeByte(i13 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    static Object iobyxmoadg(DataInput dataInput) {
        return lqeggnwhkg(dataInput.readByte(), dataInput);
    }

    private static Object lqeggnwhkg(byte b13, DataInput dataInput) throws StreamCorruptedException {
        if (b13 == 1) {
            return zoijcleaow.zdlpuopuiu(dataInput);
        }
        if (b13 == 2) {
            return wkgbmnqykc.vdvldrhtss(dataInput);
        }
        if (b13 == 3) {
            return eablkybsjg.lqeggnwhkg(dataInput);
        }
        throw new StreamCorruptedException("Unknown serialized type");
    }

    static vdvldrhtss nufgyqmvbu(DataInput dataInput) {
        byte b13 = dataInput.readByte();
        return b13 == 127 ? vdvldrhtss.pkzmftpjix(dataInput.readInt()) : vdvldrhtss.pkzmftpjix(b13 * 900);
    }

    private Object readResolve() {
        return this.f40778yggfygwlhe;
    }

    static long wkgbmnqykc(DataInput dataInput) {
        int i13 = dataInput.readByte() & 255;
        if (i13 == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i13 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte b13 = objectInput.readByte();
        this.f40779zdlpuopuiu = b13;
        this.f40778yggfygwlhe = lqeggnwhkg(b13, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        btonecajqb(this.f40779zdlpuopuiu, this.f40778yggfygwlhe, objectOutput);
    }
}
