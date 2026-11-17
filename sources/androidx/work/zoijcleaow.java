package androidx.work;

import ah.wkgbmnqykc;
import g6.eablkybsjg;
import g6.yggfygwlhe;
import hg.agtfadlqog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f14019iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final C0211zoijcleaow f14018zoijcleaow = new C0211zoijcleaow(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f14017ppxfxbqfkf = new iobyxmoadg().iobyxmoadg();

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f14020iobyxmoadg = new LinkedHashMap();

        private final iobyxmoadg gxszxtbevo(String str, Object obj) {
            this.f14020iobyxmoadg.put(str, obj);
            return this;
        }

        public final iobyxmoadg eablkybsjg(String key, boolean z13) {
            zdlpuopuiu.btonecajqb(key, "key");
            return gxszxtbevo(key, Boolean.valueOf(z13));
        }

        public final zoijcleaow iobyxmoadg() {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f14020iobyxmoadg);
            zoijcleaow.f14018zoijcleaow.eablkybsjg(zoijcleaowVar);
            return zoijcleaowVar;
        }

        public final iobyxmoadg lqeggnwhkg(String key, String str) {
            zdlpuopuiu.btonecajqb(key, "key");
            return gxszxtbevo(key, str);
        }

        public final iobyxmoadg ppxfxbqfkf(zoijcleaow data) {
            zdlpuopuiu.btonecajqb(data, "data");
            wkgbmnqykc(data.f14019iobyxmoadg);
            return this;
        }

        public final iobyxmoadg wkgbmnqykc(Map values) {
            zdlpuopuiu.btonecajqb(values, "values");
            for (Map.Entry entry : values.entrySet()) {
                zoijcleaow((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final iobyxmoadg zoijcleaow(String key, Object obj) {
            zdlpuopuiu.btonecajqb(key, "key");
            Map map = this.f14020iobyxmoadg;
            if (obj == null) {
                obj = null;
            } else {
                wkgbmnqykc wkgbmnqykcVarZoijcleaow = cllcsxoeiz.zoijcleaow(obj.getClass());
                if (!(zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Boolean.TYPE)) ? true : zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Byte.TYPE)) ? true : zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Integer.TYPE)) ? true : zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Long.TYPE)) ? true : zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Float.TYPE)) ? true : zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Double.TYPE)) ? true : zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(String.class)) ? true : zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Boolean[].class)) ? true : zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Byte[].class)) ? true : zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Integer[].class)) ? true : zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Long[].class)) ? true : zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Float[].class)) ? true : zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Double[].class)) ? true : zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(String[].class)))) {
                    if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(boolean[].class))) {
                        obj = eablkybsjg.nufgyqmvbu((boolean[]) obj);
                    } else if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(byte[].class))) {
                        obj = eablkybsjg.dxjokdxxww((byte[]) obj);
                    } else if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(int[].class))) {
                        obj = eablkybsjg.draadjrbmk((int[]) obj);
                    } else if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(long[].class))) {
                        obj = eablkybsjg.wflxmlrfwp((long[]) obj);
                    } else if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(float[].class))) {
                        obj = eablkybsjg.gtknphoqwx((float[]) obj);
                    } else {
                        if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + wkgbmnqykcVarZoijcleaow);
                        }
                        obj = eablkybsjg.btonecajqb((double[]) obj);
                    }
                }
            }
            map.put(key, obj);
            return this;
        }
    }

    static final class ppxfxbqfkf extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f14021zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            zdlpuopuiu.btonecajqb(entry, "<name for destructuring parameter 0>");
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" : ");
            if (value instanceof Object[]) {
                value = Arrays.toString((Object[]) value);
                zdlpuopuiu.dxjokdxxww(value, "toString(this)");
            }
            sb3.append(value);
            return sb3.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.work.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C0211zoijcleaow {
        public /* synthetic */ C0211zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private static final void gxszxtbevo(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
            int i13;
            wkgbmnqykc wkgbmnqykcVarZoijcleaow = cllcsxoeiz.zoijcleaow(objArr.getClass());
            if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Boolean[].class))) {
                i13 = 8;
            } else if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Byte[].class))) {
                i13 = 9;
            } else if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Integer[].class))) {
                i13 = 10;
            } else if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Long[].class))) {
                i13 = 11;
            } else if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Float[].class))) {
                i13 = 12;
            } else if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(Double[].class))) {
                i13 = 13;
            } else {
                if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVarZoijcleaow, cllcsxoeiz.zoijcleaow(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + cllcsxoeiz.zoijcleaow(objArr.getClass()).yggfygwlhe());
                }
                i13 = 14;
            }
            dataOutputStream.writeByte(i13);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i13 == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i13 == 9) {
                    Byte b13 = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b13 != null ? b13.byteValue() : (byte) 0);
                } else if (i13 == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i13 == 11) {
                    Long l13 = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l13 != null ? l13.longValue() : 0L);
                } else if (i13 == 12) {
                    Float f13 = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f13 != null ? f13.floatValue() : 0.0f);
                } else if (i13 == 13) {
                    Double d13 = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d13 != null ? d13.doubleValue() : 0.0d);
                } else if (i13 == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        private static final void lqeggnwhkg(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + cllcsxoeiz.zoijcleaow(obj.getClass()).jyumaefscl());
                }
                gxszxtbevo(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        private static final void nufgyqmvbu(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        private static final void ppxfxbqfkf(DataInputStream dataInputStream) throws IOException {
            short s13 = dataInputStream.readShort();
            if (s13 != -21521) {
                throw new IllegalStateException(("Magic number doesn't match: " + ((int) s13)).toString());
            }
            short s14 = dataInputStream.readShort();
            if (s14 == 1) {
                return;
            }
            throw new IllegalStateException(("Unsupported version number: " + ((int) s14)).toString());
        }

        private static final Object wkgbmnqykc(DataInputStream dataInputStream, byte b13) throws IOException {
            if (b13 == 0) {
                return null;
            }
            if (b13 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b13 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b13 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b13 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b13 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b13 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b13 == 7) {
                return dataInputStream.readUTF();
            }
            int i13 = 0;
            if (b13 == 8) {
                int i14 = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[i14];
                while (i13 < i14) {
                    boolArr[i13] = Boolean.valueOf(dataInputStream.readBoolean());
                    i13++;
                }
                return boolArr;
            }
            if (b13 == 9) {
                int i15 = dataInputStream.readInt();
                Byte[] bArr = new Byte[i15];
                while (i13 < i15) {
                    bArr[i13] = Byte.valueOf(dataInputStream.readByte());
                    i13++;
                }
                return bArr;
            }
            if (b13 == 10) {
                int i16 = dataInputStream.readInt();
                Integer[] numArr = new Integer[i16];
                while (i13 < i16) {
                    numArr[i13] = Integer.valueOf(dataInputStream.readInt());
                    i13++;
                }
                return numArr;
            }
            if (b13 == 11) {
                int i17 = dataInputStream.readInt();
                Long[] lArr = new Long[i17];
                while (i13 < i17) {
                    lArr[i13] = Long.valueOf(dataInputStream.readLong());
                    i13++;
                }
                return lArr;
            }
            if (b13 == 12) {
                int i18 = dataInputStream.readInt();
                Float[] fArr = new Float[i18];
                while (i13 < i18) {
                    fArr[i13] = Float.valueOf(dataInputStream.readFloat());
                    i13++;
                }
                return fArr;
            }
            if (b13 == 13) {
                int i19 = dataInputStream.readInt();
                Double[] dArr = new Double[i19];
                while (i13 < i19) {
                    dArr[i13] = Double.valueOf(dataInputStream.readDouble());
                    i13++;
                }
                return dArr;
            }
            if (b13 != 14) {
                throw new IllegalStateException("Unsupported type " + ((int) b13));
            }
            int i23 = dataInputStream.readInt();
            String[] strArr = new String[i23];
            while (i13 < i23) {
                String utf = dataInputStream.readUTF();
                if (zdlpuopuiu.eablkybsjg(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                strArr[i13] = utf;
                i13++;
            }
            return strArr;
        }

        private static final boolean zoijcleaow(ByteArrayInputStream byteArrayInputStream) throws IOException {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b13 = (byte) (-21267);
            boolean z13 = false;
            if (bArr[0] == ((byte) 16777132) && bArr[1] == b13) {
                z13 = true;
            }
            byteArrayInputStream.reset();
            return z13;
        }

        public final byte[] eablkybsjg(zoijcleaow data) {
            zdlpuopuiu.btonecajqb(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    nufgyqmvbu(dataOutputStream);
                    dataOutputStream.writeInt(data.lqeggnwhkg());
                    for (Map.Entry entry : data.f14019iobyxmoadg.entrySet()) {
                        lqeggnwhkg(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    rg.zoijcleaow.iobyxmoadg(dataOutputStream, null);
                    zdlpuopuiu.dxjokdxxww(byteArray, "{\n                ByteAr…          }\n            }");
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        rg.zoijcleaow.iobyxmoadg(dataOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e13) {
                yggfygwlhe.eablkybsjg().wkgbmnqykc(eablkybsjg.f36389iobyxmoadg, "Error in Data#toByteArray: ", e13);
                return new byte[0];
            }
        }

        public final zoijcleaow iobyxmoadg(byte[] bytes) {
            zdlpuopuiu.btonecajqb(bytes, "bytes");
            if (bytes.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if (bytes.length == 0) {
                return zoijcleaow.f14017ppxfxbqfkf;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                int i13 = 0;
                if (zoijcleaow(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i14 = objectInputStream.readInt();
                        while (i13 < i14) {
                            String utf = objectInputStream.readUTF();
                            zdlpuopuiu.dxjokdxxww(utf, "readUTF()");
                            linkedHashMap.put(utf, objectInputStream.readObject());
                            i13++;
                        }
                        rg.zoijcleaow.iobyxmoadg(objectInputStream, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            rg.zoijcleaow.iobyxmoadg(objectInputStream, th2);
                            throw th3;
                        }
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        ppxfxbqfkf(dataInputStream);
                        int i15 = dataInputStream.readInt();
                        while (i13 < i15) {
                            Object objWkgbmnqykc = wkgbmnqykc(dataInputStream, dataInputStream.readByte());
                            String key = dataInputStream.readUTF();
                            zdlpuopuiu.dxjokdxxww(key, "key");
                            linkedHashMap.put(key, objWkgbmnqykc);
                            i13++;
                        }
                        rg.zoijcleaow.iobyxmoadg(dataInputStream, null);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            rg.zoijcleaow.iobyxmoadg(dataInputStream, th4);
                            throw th5;
                        }
                    }
                }
            } catch (IOException e13) {
                yggfygwlhe.eablkybsjg().wkgbmnqykc(eablkybsjg.f36389iobyxmoadg, "Error in Data#fromByteArray: ", e13);
            } catch (ClassNotFoundException e14) {
                yggfygwlhe.eablkybsjg().wkgbmnqykc(eablkybsjg.f36389iobyxmoadg, "Error in Data#fromByteArray: ", e14);
            }
            return new zoijcleaow(linkedHashMap);
        }

        private C0211zoijcleaow() {
        }
    }

    public zoijcleaow(zoijcleaow other) {
        zdlpuopuiu.btonecajqb(other, "other");
        this.f14019iobyxmoadg = new HashMap(other.f14019iobyxmoadg);
    }

    public static final byte[] nufgyqmvbu(zoijcleaow zoijcleaowVar) {
        return f14018zoijcleaow.eablkybsjg(zoijcleaowVar);
    }

    public static final zoijcleaow zoijcleaow(byte[] bArr) {
        return f14018zoijcleaow.iobyxmoadg(bArr);
    }

    public final String eablkybsjg(String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        Object obj = this.f14019iobyxmoadg.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    public boolean equals(Object obj) {
        boolean zEablkybsjg;
        if (this == obj) {
            return true;
        }
        if (obj == null || !zdlpuopuiu.eablkybsjg(zoijcleaow.class, obj.getClass())) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        Set<String> setKeySet = this.f14019iobyxmoadg.keySet();
        if (!zdlpuopuiu.eablkybsjg(setKeySet, zoijcleaowVar.f14019iobyxmoadg.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f14019iobyxmoadg.get(str);
            Object obj3 = zoijcleaowVar.f14019iobyxmoadg.get(str);
            if (obj2 == null || obj3 == null) {
                zEablkybsjg = obj2 == obj3;
            } else if (obj2 instanceof Object[]) {
                Object[] objArr = (Object[]) obj2;
                if (obj3 instanceof Object[]) {
                    zEablkybsjg = agtfadlqog.wkgbmnqykc(objArr, (Object[]) obj3);
                } else {
                    zEablkybsjg = zdlpuopuiu.eablkybsjg(obj2, obj3);
                }
            } else {
                zEablkybsjg = zdlpuopuiu.eablkybsjg(obj2, obj3);
            }
            if (!zEablkybsjg) {
                return false;
            }
        }
        return true;
    }

    public final boolean gxszxtbevo(String key, Class klass) {
        zdlpuopuiu.btonecajqb(key, "key");
        zdlpuopuiu.btonecajqb(klass, "klass");
        Object obj = this.f14019iobyxmoadg.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f14019iobyxmoadg.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ agtfadlqog.zoijcleaow((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final int lqeggnwhkg() {
        return this.f14019iobyxmoadg.size();
    }

    public final boolean ppxfxbqfkf(String key, boolean z13) {
        zdlpuopuiu.btonecajqb(key, "key");
        Object objValueOf = Boolean.valueOf(z13);
        Object obj = this.f14019iobyxmoadg.get(key);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    public String toString() {
        String str = "Data {" + hg.jyumaefscl.iwxlajgraz(this.f14019iobyxmoadg.entrySet(), null, null, null, 0, null, ppxfxbqfkf.f14021zdlpuopuiu, 31, null) + "}";
        zdlpuopuiu.dxjokdxxww(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public final Map wkgbmnqykc() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f14019iobyxmoadg);
        zdlpuopuiu.dxjokdxxww(mapUnmodifiableMap, "unmodifiableMap(values)");
        return mapUnmodifiableMap;
    }

    public zoijcleaow(Map values) {
        zdlpuopuiu.btonecajqb(values, "values");
        this.f14019iobyxmoadg = new HashMap(values);
    }
}
