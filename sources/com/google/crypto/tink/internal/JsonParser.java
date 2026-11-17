package com.google.crypto.tink.internal;

import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonParser {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final JsonElementTypeAdapter f23814iobyxmoadg = new JsonElementTypeAdapter(null);

    private static final class JsonElementTypeAdapter extends TypeAdapter {
        private JsonElementTypeAdapter() {
        }

        private com.google.gson.nufgyqmvbu gxszxtbevo(ce.iobyxmoadg iobyxmoadgVar, ce.zoijcleaow zoijcleaowVar) throws IOException {
            int i13 = iobyxmoadg.f23815iobyxmoadg[zoijcleaowVar.ordinal()];
            if (i13 == 3) {
                String strDsvhmnatus = iobyxmoadgVar.dsvhmnatus();
                if (JsonParser.iobyxmoadg(strDsvhmnatus)) {
                    return new com.google.gson.gtknphoqwx(strDsvhmnatus);
                }
                throw new IOException("illegal characters in string");
            }
            if (i13 == 4) {
                return new com.google.gson.gtknphoqwx(new zoijcleaow(iobyxmoadgVar.dsvhmnatus()));
            }
            if (i13 == 5) {
                return new com.google.gson.gtknphoqwx(Boolean.valueOf(iobyxmoadgVar.cqumvgiudr()));
            }
            if (i13 == 6) {
                iobyxmoadgVar.wwaezpbzkn();
                return com.google.gson.dxjokdxxww.f24950zdlpuopuiu;
            }
            throw new IllegalStateException("Unexpected token: " + zoijcleaowVar);
        }

        private com.google.gson.nufgyqmvbu lqeggnwhkg(ce.iobyxmoadg iobyxmoadgVar, ce.zoijcleaow zoijcleaowVar) throws IOException {
            int i13 = iobyxmoadg.f23815iobyxmoadg[zoijcleaowVar.ordinal()];
            if (i13 == 1) {
                iobyxmoadgVar.iobyxmoadg();
                return new com.google.gson.eablkybsjg();
            }
            if (i13 != 2) {
                return null;
            }
            iobyxmoadgVar.wkgbmnqykc();
            return new com.google.gson.btonecajqb();
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public com.google.gson.nufgyqmvbu zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
            String strIstkbnxepw;
            ce.zoijcleaow zoijcleaowVarKegysxyocb = iobyxmoadgVar.kegysxyocb();
            com.google.gson.nufgyqmvbu nufgyqmvbuVarLqeggnwhkg = lqeggnwhkg(iobyxmoadgVar, zoijcleaowVarKegysxyocb);
            if (nufgyqmvbuVarLqeggnwhkg == null) {
                return gxszxtbevo(iobyxmoadgVar, zoijcleaowVarKegysxyocb);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (iobyxmoadgVar.vdvldrhtss()) {
                    if (nufgyqmvbuVarLqeggnwhkg instanceof com.google.gson.btonecajqb) {
                        strIstkbnxepw = iobyxmoadgVar.istkbnxepw();
                        if (!JsonParser.iobyxmoadg(strIstkbnxepw)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        strIstkbnxepw = null;
                    }
                    ce.zoijcleaow zoijcleaowVarKegysxyocb2 = iobyxmoadgVar.kegysxyocb();
                    com.google.gson.nufgyqmvbu nufgyqmvbuVarLqeggnwhkg2 = lqeggnwhkg(iobyxmoadgVar, zoijcleaowVarKegysxyocb2);
                    boolean z13 = nufgyqmvbuVarLqeggnwhkg2 != null;
                    if (nufgyqmvbuVarLqeggnwhkg2 == null) {
                        nufgyqmvbuVarLqeggnwhkg2 = gxszxtbevo(iobyxmoadgVar, zoijcleaowVarKegysxyocb2);
                    }
                    if (nufgyqmvbuVarLqeggnwhkg instanceof com.google.gson.eablkybsjg) {
                        ((com.google.gson.eablkybsjg) nufgyqmvbuVarLqeggnwhkg).wflxmlrfwp(nufgyqmvbuVarLqeggnwhkg2);
                    } else {
                        com.google.gson.btonecajqb btonecajqbVar = (com.google.gson.btonecajqb) nufgyqmvbuVarLqeggnwhkg;
                        if (btonecajqbVar.vdvldrhtss(strIstkbnxepw)) {
                            throw new IOException("duplicate key: " + strIstkbnxepw);
                        }
                        btonecajqbVar.wflxmlrfwp(strIstkbnxepw, nufgyqmvbuVarLqeggnwhkg2);
                    }
                    if (z13) {
                        arrayDeque.addLast(nufgyqmvbuVarLqeggnwhkg);
                        if (arrayDeque.size() > 100) {
                            throw new IOException("too many recursions");
                        }
                        nufgyqmvbuVarLqeggnwhkg = nufgyqmvbuVarLqeggnwhkg2;
                    } else {
                        continue;
                    }
                } else {
                    if (nufgyqmvbuVarLqeggnwhkg instanceof com.google.gson.eablkybsjg) {
                        iobyxmoadgVar.btonecajqb();
                    } else {
                        iobyxmoadgVar.draadjrbmk();
                    }
                    if (arrayDeque.isEmpty()) {
                        return nufgyqmvbuVarLqeggnwhkg;
                    }
                    nufgyqmvbuVarLqeggnwhkg = (com.google.gson.nufgyqmvbu) arrayDeque.removeLast();
                }
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, com.google.gson.nufgyqmvbu nufgyqmvbuVar) {
            throw new UnsupportedOperationException("write is not supported");
        }

        /* synthetic */ JsonElementTypeAdapter(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f23815iobyxmoadg;

        static {
            int[] iArr = new int[ce.zoijcleaow.values().length];
            f23815iobyxmoadg = iArr;
            try {
                iArr[ce.zoijcleaow.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23815iobyxmoadg[ce.zoijcleaow.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23815iobyxmoadg[ce.zoijcleaow.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23815iobyxmoadg[ce.zoijcleaow.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23815iobyxmoadg[ce.zoijcleaow.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23815iobyxmoadg[ce.zoijcleaow.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static final class zoijcleaow extends Number {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f23816zdlpuopuiu;

        public zoijcleaow(String str) {
            this.f23816zdlpuopuiu = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException {
            throw new NotSerializableException("serialization is not supported");
        }

        private Object writeReplace() throws NotSerializableException {
            throw new NotSerializableException("serialization is not supported");
        }

        @Override // java.lang.Number
        public double doubleValue() {
            return Double.parseDouble(this.f23816zdlpuopuiu);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof zoijcleaow) {
                return this.f23816zdlpuopuiu.equals(((zoijcleaow) obj).f23816zdlpuopuiu);
            }
            return false;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return Float.parseFloat(this.f23816zdlpuopuiu);
        }

        public int hashCode() {
            return this.f23816zdlpuopuiu.hashCode();
        }

        @Override // java.lang.Number
        public int intValue() {
            try {
                try {
                    return Integer.parseInt(this.f23816zdlpuopuiu);
                } catch (NumberFormatException unused) {
                    return (int) Long.parseLong(this.f23816zdlpuopuiu);
                }
            } catch (NumberFormatException unused2) {
                return new BigDecimal(this.f23816zdlpuopuiu).intValue();
            }
        }

        @Override // java.lang.Number
        public long longValue() {
            try {
                return Long.parseLong(this.f23816zdlpuopuiu);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f23816zdlpuopuiu).longValue();
            }
        }

        public String toString() {
            return this.f23816zdlpuopuiu;
        }
    }

    public static boolean iobyxmoadg(String str) {
        int length = str.length();
        int i13 = 0;
        while (i13 != length) {
            char cCharAt = str.charAt(i13);
            int i14 = i13 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i13 = i14;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i14 == length || !Character.isLowSurrogate(str.charAt(i14))) {
                    return false;
                }
                i13 += 2;
            }
        }
        return true;
    }
}
