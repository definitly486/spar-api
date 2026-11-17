package n4;

import java.nio.ByteBuffer;
import java.util.UUID;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public abstract class rgvfuqvkyq {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final UUID f68688iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final byte[] f68689ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final UUID[] f68690wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f68691zoijcleaow;

        iobyxmoadg(UUID uuid, int i13, byte[] bArr, UUID[] uuidArr) {
            this.f68688iobyxmoadg = uuid;
            this.f68691zoijcleaow = i13;
            this.f68689ppxfxbqfkf = bArr;
            this.f68690wkgbmnqykc = uuidArr;
        }
    }

    public static byte[] eablkybsjg(byte[] bArr, UUID uuid) {
        iobyxmoadg iobyxmoadgVarWkgbmnqykc = wkgbmnqykc(bArr);
        if (iobyxmoadgVarWkgbmnqykc == null) {
            return null;
        }
        if (uuid.equals(iobyxmoadgVarWkgbmnqykc.f68688iobyxmoadg)) {
            return iobyxmoadgVarWkgbmnqykc.f68689ppxfxbqfkf;
        }
        y2.kcexrzcfyt.nufgyqmvbu("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + iobyxmoadgVarWkgbmnqykc.f68688iobyxmoadg + ".");
        return null;
    }

    public static UUID gxszxtbevo(byte[] bArr) {
        iobyxmoadg iobyxmoadgVarWkgbmnqykc = wkgbmnqykc(bArr);
        if (iobyxmoadgVarWkgbmnqykc == null) {
            return null;
        }
        return iobyxmoadgVarWkgbmnqykc.f68688iobyxmoadg;
    }

    public static byte[] iobyxmoadg(UUID uuid, byte[] bArr) {
        return zoijcleaow(uuid, null, bArr);
    }

    public static int lqeggnwhkg(byte[] bArr) {
        iobyxmoadg iobyxmoadgVarWkgbmnqykc = wkgbmnqykc(bArr);
        if (iobyxmoadgVarWkgbmnqykc == null) {
            return -1;
        }
        return iobyxmoadgVarWkgbmnqykc.f68691zoijcleaow;
    }

    public static boolean ppxfxbqfkf(byte[] bArr) {
        return wkgbmnqykc(bArr) != null;
    }

    public static iobyxmoadg wkgbmnqykc(byte[] bArr) {
        UUID[] uuidArr;
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(bArr);
        if (yadqdtsiqtVar.lqeggnwhkg() < 32) {
            return null;
        }
        yadqdtsiqtVar.sopmlzcsov(0);
        int iIobyxmoadg = yadqdtsiqtVar.iobyxmoadg();
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        if (iVdvldrhtss != iIobyxmoadg) {
            y2.kcexrzcfyt.nufgyqmvbu("PsshAtomUtil", "Advertised atom size (" + iVdvldrhtss + ") does not match buffer size: " + iIobyxmoadg);
            return null;
        }
        int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
        if (iVdvldrhtss2 != 1886614376) {
            y2.kcexrzcfyt.nufgyqmvbu("PsshAtomUtil", "Atom type is not pssh: " + iVdvldrhtss2);
            return null;
        }
        int iRgvfuqvkyq = zoijcleaow.rgvfuqvkyq(yadqdtsiqtVar.vdvldrhtss());
        if (iRgvfuqvkyq > 1) {
            y2.kcexrzcfyt.nufgyqmvbu("PsshAtomUtil", "Unsupported pssh version: " + iRgvfuqvkyq);
            return null;
        }
        UUID uuid = new UUID(yadqdtsiqtVar.pmvmpeiblj(), yadqdtsiqtVar.pmvmpeiblj());
        if (iRgvfuqvkyq == 1) {
            int iJpowsppfya = yadqdtsiqtVar.jpowsppfya();
            uuidArr = new UUID[iJpowsppfya];
            for (int i13 = 0; i13 < iJpowsppfya; i13++) {
                uuidArr[i13] = new UUID(yadqdtsiqtVar.pmvmpeiblj(), yadqdtsiqtVar.pmvmpeiblj());
            }
        } else {
            uuidArr = null;
        }
        int iJpowsppfya2 = yadqdtsiqtVar.jpowsppfya();
        int iIobyxmoadg2 = yadqdtsiqtVar.iobyxmoadg();
        if (iJpowsppfya2 == iIobyxmoadg2) {
            byte[] bArr2 = new byte[iJpowsppfya2];
            yadqdtsiqtVar.draadjrbmk(bArr2, 0, iJpowsppfya2);
            return new iobyxmoadg(uuid, iRgvfuqvkyq, bArr2, uuidArr);
        }
        y2.kcexrzcfyt.nufgyqmvbu("PsshAtomUtil", "Atom data size (" + iJpowsppfya2 + ") does not match the bytes left: " + iIobyxmoadg2);
        return null;
    }

    public static byte[] zoijcleaow(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }
}
