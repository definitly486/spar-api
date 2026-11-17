package hm;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.threeten.bp.zone.ZoneRulesException;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf extends nufgyqmvbu {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private List f40786ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ConcurrentNavigableMap f40787wkgbmnqykc = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Set f40785eablkybsjg = new CopyOnWriteArraySet();

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f40788iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final short[] f40789ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final AtomicReferenceArray f40790wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String[] f40791zoijcleaow;

        iobyxmoadg(String str, String[] strArr, short[] sArr, AtomicReferenceArray atomicReferenceArray) {
            this.f40790wkgbmnqykc = atomicReferenceArray;
            this.f40788iobyxmoadg = str;
            this.f40791zoijcleaow = strArr;
            this.f40789ppxfxbqfkf = sArr;
        }

        gxszxtbevo ppxfxbqfkf(String str) {
            int iBinarySearch = Arrays.binarySearch(this.f40791zoijcleaow, str);
            if (iBinarySearch < 0) {
                return null;
            }
            try {
                return zoijcleaow(this.f40789ppxfxbqfkf[iBinarySearch]);
            } catch (Exception e13) {
                throw new ZoneRulesException("Invalid binary time-zone data: TZDB:" + str + ", version: " + this.f40788iobyxmoadg, e13);
            }
        }

        public String toString() {
            return this.f40788iobyxmoadg;
        }

        gxszxtbevo zoijcleaow(short s13) {
            Object objIobyxmoadg = this.f40790wkgbmnqykc.get(s13);
            if (objIobyxmoadg instanceof byte[]) {
                objIobyxmoadg = hm.iobyxmoadg.iobyxmoadg(new DataInputStream(new ByteArrayInputStream((byte[]) objIobyxmoadg)));
                this.f40790wkgbmnqykc.set(s13, objIobyxmoadg);
            }
            return (gxszxtbevo) objIobyxmoadg;
        }
    }

    public ppxfxbqfkf(InputStream inputStream) {
        try {
            lqeggnwhkg(inputStream);
        } catch (Exception e13) {
            throw new ZoneRulesException("Unable to load TZDB time-zone rules", e13);
        }
    }

    private boolean lqeggnwhkg(InputStream inputStream) {
        boolean z13 = false;
        for (iobyxmoadg iobyxmoadgVar : nufgyqmvbu(inputStream)) {
            iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.f40787wkgbmnqykc.putIfAbsent(iobyxmoadgVar.f40788iobyxmoadg, iobyxmoadgVar);
            if (iobyxmoadgVar2 != null && !iobyxmoadgVar2.f40788iobyxmoadg.equals(iobyxmoadgVar.f40788iobyxmoadg)) {
                throw new ZoneRulesException("Data already loaded for TZDB time-zone rules version: " + iobyxmoadgVar.f40788iobyxmoadg);
            }
            z13 = true;
        }
        return z13;
    }

    private Iterable nufgyqmvbu(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new StreamCorruptedException("File format not recognised");
        }
        if (!"TZDB".equals(dataInputStream.readUTF())) {
            throw new StreamCorruptedException("File format not recognised");
        }
        int i13 = dataInputStream.readShort();
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            strArr[i14] = dataInputStream.readUTF();
        }
        int i15 = dataInputStream.readShort();
        String[] strArr2 = new String[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            strArr2[i16] = dataInputStream.readUTF();
        }
        this.f40786ppxfxbqfkf = Arrays.asList(strArr2);
        int i17 = dataInputStream.readShort();
        Object[] objArr = new Object[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            byte[] bArr = new byte[dataInputStream.readShort()];
            dataInputStream.readFully(bArr);
            objArr[i18] = bArr;
        }
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
        HashSet hashSet = new HashSet(i13);
        for (int i19 = 0; i19 < i13; i19++) {
            int i23 = dataInputStream.readShort();
            String[] strArr3 = new String[i23];
            short[] sArr = new short[i23];
            for (int i24 = 0; i24 < i23; i24++) {
                strArr3[i24] = strArr2[dataInputStream.readShort()];
                sArr[i24] = dataInputStream.readShort();
            }
            hashSet.add(new iobyxmoadg(strArr[i19], strArr3, sArr, atomicReferenceArray));
        }
        return hashSet;
    }

    @Override // hm.nufgyqmvbu
    protected gxszxtbevo ppxfxbqfkf(String str, boolean z13) {
        fm.ppxfxbqfkf.dxjokdxxww(str, "zoneId");
        gxszxtbevo gxszxtbevoVarPpxfxbqfkf = ((iobyxmoadg) this.f40787wkgbmnqykc.lastEntry().getValue()).ppxfxbqfkf(str);
        if (gxszxtbevoVarPpxfxbqfkf != null) {
            return gxszxtbevoVarPpxfxbqfkf;
        }
        throw new ZoneRulesException("Unknown time-zone ID: " + str);
    }

    public String toString() {
        return "TZDB";
    }

    @Override // hm.nufgyqmvbu
    protected Set wkgbmnqykc() {
        return new HashSet(this.f40786ppxfxbqfkf);
    }
}
