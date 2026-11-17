package com.google.gson.internal.bind;

import ce.zoijcleaow;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.btonecajqb;
import com.google.gson.dxjokdxxww;
import com.google.gson.eablkybsjg;
import com.google.gson.gtknphoqwx;
import com.google.gson.internal.gxszxtbevo;
import com.google.gson.nufgyqmvbu;
import com.google.gson.vdvldrhtss;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeAdapters {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public static final TypeAdapter f25034agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final TypeAdapter f25035btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final TypeAdapter f25036cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    public static final TypeAdapter f25037cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final vdvldrhtss f25038cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    public static final vdvldrhtss f25039crxdokpmqz;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final TypeAdapter f25040draadjrbmk;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    public static final vdvldrhtss f25041dsvhmnatus;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final vdvldrhtss f25042dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final TypeAdapter f25043eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final TypeAdapter f25044esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final vdvldrhtss f25045gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final TypeAdapter f25046gxszxtbevo;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final vdvldrhtss f25047hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    public static final vdvldrhtss f25048hkdspvbjdz;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final TypeAdapter f25049iobyxmoadg;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final TypeAdapter f25050iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final vdvldrhtss f25051istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final TypeAdapter f25052iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    public static final TypeAdapter f25053jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final TypeAdapter f25054jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public static final vdvldrhtss f25055kcexrzcfyt;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    public static final TypeAdapter f25056kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final TypeAdapter f25057lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final vdvldrhtss f25058lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final vdvldrhtss f25059lqeggnwhkg;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    public static final TypeAdapter f25060mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    public static final vdvldrhtss f25061ntlheqmsrt;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final TypeAdapter f25062nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final vdvldrhtss f25063ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public static final TypeAdapter f25064oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    public static final TypeAdapter f25065pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final TypeAdapter f25066pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final TypeAdapter f25067ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final TypeAdapter f25068rgvfuqvkyq;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    public static final vdvldrhtss f25069sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    public static final vdvldrhtss f25070stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    public static final vdvldrhtss f25071tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    public static final TypeAdapter f25072ulzqkzuiru;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public static final vdvldrhtss f25073vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final vdvldrhtss f25074wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final vdvldrhtss f25075wkgbmnqykc;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public static final TypeAdapter f25076wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    public static final TypeAdapter f25077wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final vdvldrhtss f25078yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final TypeAdapter f25079yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public static final vdvldrhtss f25080ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final TypeAdapter f25081zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final vdvldrhtss f25082zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final TypeAdapter f25083zynmafqrjb;

    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f25098iobyxmoadg = new HashMap();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Map f25100zoijcleaow = new HashMap();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Map f25099ppxfxbqfkf = new HashMap();

        class iobyxmoadg implements PrivilegedAction {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ Class f25101iobyxmoadg;

            iobyxmoadg(Class cls) {
                this.f25101iobyxmoadg = cls;
            }

            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public Field[] run() {
                Field[] declaredFields = this.f25101iobyxmoadg.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public EnumTypeAdapter(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new iobyxmoadg(cls))) {
                    Enum r13 = (Enum) field.get(null);
                    String strName = r13.name();
                    String string = r13.toString();
                    ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) field.getAnnotation(ppxfxbqfkf.class);
                    if (ppxfxbqfkfVar != null) {
                        strName = ppxfxbqfkfVar.value();
                        for (String str : ppxfxbqfkfVar.alternate()) {
                            this.f25098iobyxmoadg.put(str, r13);
                        }
                    }
                    this.f25098iobyxmoadg.put(strName, r13);
                    this.f25100zoijcleaow.put(string, r13);
                    this.f25099ppxfxbqfkf.put(r13, strName);
                }
            } catch (IllegalAccessException e13) {
                throw new AssertionError(e13);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public Enum zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
            if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }
            String strDsvhmnatus = iobyxmoadgVar.dsvhmnatus();
            Enum r13 = (Enum) this.f25098iobyxmoadg.get(strDsvhmnatus);
            return r13 == null ? (Enum) this.f25100zoijcleaow.get(strDsvhmnatus) : r13;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Enum r13) throws IOException {
            ppxfxbqfkfVar.ulzqkzuiru(r13 == null ? null : (String) this.f25099ppxfxbqfkf.get(r13));
        }
    }

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f25103iobyxmoadg;

        static {
            int[] iArr = new int[zoijcleaow.values().length];
            f25103iobyxmoadg = iArr;
            try {
                iArr[zoijcleaow.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25103iobyxmoadg[zoijcleaow.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25103iobyxmoadg[zoijcleaow.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25103iobyxmoadg[zoijcleaow.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25103iobyxmoadg[zoijcleaow.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25103iobyxmoadg[zoijcleaow.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        TypeAdapter typeAdapterIobyxmoadg = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Class zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.iobyxmoadg();
        f25049iobyxmoadg = typeAdapterIobyxmoadg;
        f25082zoijcleaow = zoijcleaow(Class.class, typeAdapterIobyxmoadg);
        TypeAdapter typeAdapterIobyxmoadg2 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public BitSet zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                BitSet bitSet = new BitSet();
                iobyxmoadgVar.iobyxmoadg();
                zoijcleaow zoijcleaowVarKegysxyocb = iobyxmoadgVar.kegysxyocb();
                int i13 = 0;
                while (zoijcleaowVarKegysxyocb != zoijcleaow.END_ARRAY) {
                    int i14 = iobyxmoadg.f25103iobyxmoadg[zoijcleaowVarKegysxyocb.ordinal()];
                    boolean zCqumvgiudr = true;
                    if (i14 == 1 || i14 == 2) {
                        int iPmvmpeiblj = iobyxmoadgVar.pmvmpeiblj();
                        if (iPmvmpeiblj == 0) {
                            zCqumvgiudr = false;
                        } else if (iPmvmpeiblj != 1) {
                            throw new JsonSyntaxException("Invalid bitset value " + iPmvmpeiblj + ", expected 0 or 1; at path " + iobyxmoadgVar.rgvfuqvkyq());
                        }
                    } else {
                        if (i14 != 3) {
                            throw new JsonSyntaxException("Invalid bitset value type: " + zoijcleaowVarKegysxyocb + "; at path " + iobyxmoadgVar.gxszxtbevo());
                        }
                        zCqumvgiudr = iobyxmoadgVar.cqumvgiudr();
                    }
                    if (zCqumvgiudr) {
                        bitSet.set(i13);
                    }
                    i13++;
                    zoijcleaowVarKegysxyocb = iobyxmoadgVar.kegysxyocb();
                }
                iobyxmoadgVar.btonecajqb();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, BitSet bitSet) throws IOException {
                ppxfxbqfkfVar.lqeggnwhkg();
                int length = bitSet.length();
                for (int i13 = 0; i13 < length; i13++) {
                    ppxfxbqfkfVar.kegysxyocb(bitSet.get(i13) ? 1L : 0L);
                }
                ppxfxbqfkfVar.btonecajqb();
            }
        }.iobyxmoadg();
        f25067ppxfxbqfkf = typeAdapterIobyxmoadg2;
        f25075wkgbmnqykc = zoijcleaow(BitSet.class, typeAdapterIobyxmoadg2);
        TypeAdapter typeAdapter = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Boolean zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                zoijcleaow zoijcleaowVarKegysxyocb = iobyxmoadgVar.kegysxyocb();
                if (zoijcleaowVarKegysxyocb != zoijcleaow.NULL) {
                    return zoijcleaowVarKegysxyocb == zoijcleaow.STRING ? Boolean.valueOf(Boolean.parseBoolean(iobyxmoadgVar.dsvhmnatus())) : Boolean.valueOf(iobyxmoadgVar.cqumvgiudr());
                }
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Boolean bool) throws IOException {
                ppxfxbqfkfVar.mbcevpiqjq(bool);
            }
        };
        f25043eablkybsjg = typeAdapter;
        f25046gxszxtbevo = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Boolean zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() != zoijcleaow.NULL) {
                    return Boolean.valueOf(iobyxmoadgVar.dsvhmnatus());
                }
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Boolean bool) throws IOException {
                ppxfxbqfkfVar.ulzqkzuiru(bool == null ? "null" : bool.toString());
            }
        };
        f25059lqeggnwhkg = ppxfxbqfkf(Boolean.TYPE, Boolean.class, typeAdapter);
        TypeAdapter typeAdapter2 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Number zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                    iobyxmoadgVar.wwaezpbzkn();
                    return null;
                }
                try {
                    int iPmvmpeiblj = iobyxmoadgVar.pmvmpeiblj();
                    if (iPmvmpeiblj <= 255 && iPmvmpeiblj >= -128) {
                        return Byte.valueOf((byte) iPmvmpeiblj);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + iPmvmpeiblj + " to byte; at path " + iobyxmoadgVar.rgvfuqvkyq());
                } catch (NumberFormatException e13) {
                    throw new JsonSyntaxException(e13);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Number number) throws IOException {
                if (number == null) {
                    ppxfxbqfkfVar.jyumaefscl();
                } else {
                    ppxfxbqfkfVar.kegysxyocb(number.byteValue());
                }
            }
        };
        f25062nufgyqmvbu = typeAdapter2;
        f25042dxjokdxxww = ppxfxbqfkf(Byte.TYPE, Byte.class, typeAdapter2);
        TypeAdapter typeAdapter3 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Number zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                    iobyxmoadgVar.wwaezpbzkn();
                    return null;
                }
                try {
                    int iPmvmpeiblj = iobyxmoadgVar.pmvmpeiblj();
                    if (iPmvmpeiblj <= 65535 && iPmvmpeiblj >= -32768) {
                        return Short.valueOf((short) iPmvmpeiblj);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + iPmvmpeiblj + " to short; at path " + iobyxmoadgVar.rgvfuqvkyq());
                } catch (NumberFormatException e13) {
                    throw new JsonSyntaxException(e13);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Number number) throws IOException {
                if (number == null) {
                    ppxfxbqfkfVar.jyumaefscl();
                } else {
                    ppxfxbqfkfVar.kegysxyocb(number.shortValue());
                }
            }
        };
        f25035btonecajqb = typeAdapter3;
        f25045gtknphoqwx = ppxfxbqfkf(Short.TYPE, Short.class, typeAdapter3);
        TypeAdapter typeAdapter4 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Number zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                    iobyxmoadgVar.wwaezpbzkn();
                    return null;
                }
                try {
                    return Integer.valueOf(iobyxmoadgVar.pmvmpeiblj());
                } catch (NumberFormatException e13) {
                    throw new JsonSyntaxException(e13);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Number number) throws IOException {
                if (number == null) {
                    ppxfxbqfkfVar.jyumaefscl();
                } else {
                    ppxfxbqfkfVar.kegysxyocb(number.intValue());
                }
            }
        };
        f25040draadjrbmk = typeAdapter4;
        f25074wflxmlrfwp = ppxfxbqfkf(Integer.TYPE, Integer.class, typeAdapter4);
        TypeAdapter typeAdapterIobyxmoadg3 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public AtomicInteger zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) {
                try {
                    return new AtomicInteger(iobyxmoadgVar.pmvmpeiblj());
                } catch (NumberFormatException e13) {
                    throw new JsonSyntaxException(e13);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, AtomicInteger atomicInteger) throws IOException {
                ppxfxbqfkfVar.kegysxyocb(atomicInteger.get());
            }
        }.iobyxmoadg();
        f25034agtfadlqog = typeAdapterIobyxmoadg3;
        f25063ojitshcjhn = zoijcleaow(AtomicInteger.class, typeAdapterIobyxmoadg3);
        TypeAdapter typeAdapterIobyxmoadg4 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public AtomicBoolean zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) {
                return new AtomicBoolean(iobyxmoadgVar.cqumvgiudr());
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, AtomicBoolean atomicBoolean) throws IOException {
                ppxfxbqfkfVar.crxdokpmqz(atomicBoolean.get());
            }
        }.iobyxmoadg();
        f25068rgvfuqvkyq = typeAdapterIobyxmoadg4;
        f25073vdvldrhtss = zoijcleaow(AtomicBoolean.class, typeAdapterIobyxmoadg4);
        TypeAdapter typeAdapterIobyxmoadg5 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public AtomicIntegerArray zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                iobyxmoadgVar.iobyxmoadg();
                while (iobyxmoadgVar.vdvldrhtss()) {
                    try {
                        arrayList.add(Integer.valueOf(iobyxmoadgVar.pmvmpeiblj()));
                    } catch (NumberFormatException e13) {
                        throw new JsonSyntaxException(e13);
                    }
                }
                iobyxmoadgVar.btonecajqb();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i13 = 0; i13 < size; i13++) {
                    atomicIntegerArray.set(i13, ((Integer) arrayList.get(i13)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                ppxfxbqfkfVar.lqeggnwhkg();
                int length = atomicIntegerArray.length();
                for (int i13 = 0; i13 < length; i13++) {
                    ppxfxbqfkfVar.kegysxyocb(atomicIntegerArray.get(i13));
                }
                ppxfxbqfkfVar.btonecajqb();
            }
        }.iobyxmoadg();
        f25064oxmwwwfdhm = typeAdapterIobyxmoadg5;
        f25055kcexrzcfyt = zoijcleaow(AtomicIntegerArray.class, typeAdapterIobyxmoadg5);
        f25081zdlpuopuiu = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Number zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                    iobyxmoadgVar.wwaezpbzkn();
                    return null;
                }
                try {
                    return Long.valueOf(iobyxmoadgVar.zynmafqrjb());
                } catch (NumberFormatException e13) {
                    throw new JsonSyntaxException(e13);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Number number) throws IOException {
                if (number == null) {
                    ppxfxbqfkfVar.jyumaefscl();
                } else {
                    ppxfxbqfkfVar.kegysxyocb(number.longValue());
                }
            }
        };
        f25079yggfygwlhe = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Number zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() != zoijcleaow.NULL) {
                    return Float.valueOf((float) iobyxmoadgVar.lereixgezr());
                }
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Number number) throws IOException {
                if (number == null) {
                    ppxfxbqfkfVar.jyumaefscl();
                    return;
                }
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                ppxfxbqfkfVar.ntlheqmsrt(number);
            }
        };
        f25054jyumaefscl = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Number zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() != zoijcleaow.NULL) {
                    return Double.valueOf(iobyxmoadgVar.lereixgezr());
                }
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Number number) throws IOException {
                if (number == null) {
                    ppxfxbqfkfVar.jyumaefscl();
                } else {
                    ppxfxbqfkfVar.wypolnanlu(number.doubleValue());
                }
            }
        };
        TypeAdapter typeAdapter5 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Character zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                    iobyxmoadgVar.wwaezpbzkn();
                    return null;
                }
                String strDsvhmnatus = iobyxmoadgVar.dsvhmnatus();
                if (strDsvhmnatus.length() == 1) {
                    return Character.valueOf(strDsvhmnatus.charAt(0));
                }
                throw new JsonSyntaxException("Expecting character, got: " + strDsvhmnatus + "; at " + iobyxmoadgVar.rgvfuqvkyq());
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Character ch2) throws IOException {
                ppxfxbqfkfVar.ulzqkzuiru(ch2 == null ? null : String.valueOf(ch2));
            }
        };
        f25052iwizpuwonk = typeAdapter5;
        f25038cqumvgiudr = ppxfxbqfkf(Character.TYPE, Character.class, typeAdapter5);
        TypeAdapter typeAdapter6 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public String zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                zoijcleaow zoijcleaowVarKegysxyocb = iobyxmoadgVar.kegysxyocb();
                if (zoijcleaowVarKegysxyocb != zoijcleaow.NULL) {
                    return zoijcleaowVarKegysxyocb == zoijcleaow.BOOLEAN ? Boolean.toString(iobyxmoadgVar.cqumvgiudr()) : iobyxmoadgVar.dsvhmnatus();
                }
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, String str) throws IOException {
                ppxfxbqfkfVar.ulzqkzuiru(str);
            }
        };
        f25044esjtqupxsv = typeAdapter6;
        f25057lereixgezr = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public BigDecimal zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                    iobyxmoadgVar.wwaezpbzkn();
                    return null;
                }
                String strDsvhmnatus = iobyxmoadgVar.dsvhmnatus();
                try {
                    return new BigDecimal(strDsvhmnatus);
                } catch (NumberFormatException e13) {
                    throw new JsonSyntaxException("Failed parsing '" + strDsvhmnatus + "' as BigDecimal; at path " + iobyxmoadgVar.rgvfuqvkyq(), e13);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, BigDecimal bigDecimal) throws IOException {
                ppxfxbqfkfVar.ntlheqmsrt(bigDecimal);
            }
        };
        f25066pmvmpeiblj = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public BigInteger zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                    iobyxmoadgVar.wwaezpbzkn();
                    return null;
                }
                String strDsvhmnatus = iobyxmoadgVar.dsvhmnatus();
                try {
                    return new BigInteger(strDsvhmnatus);
                } catch (NumberFormatException e13) {
                    throw new JsonSyntaxException("Failed parsing '" + strDsvhmnatus + "' as BigInteger; at path " + iobyxmoadgVar.rgvfuqvkyq(), e13);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, BigInteger bigInteger) throws IOException {
                ppxfxbqfkfVar.ntlheqmsrt(bigInteger);
            }
        };
        f25083zynmafqrjb = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public gxszxtbevo zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() != zoijcleaow.NULL) {
                    return new gxszxtbevo(iobyxmoadgVar.dsvhmnatus());
                }
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) throws IOException {
                ppxfxbqfkfVar.ntlheqmsrt(gxszxtbevoVar);
            }
        };
        f25051istkbnxepw = zoijcleaow(String.class, typeAdapter6);
        TypeAdapter typeAdapter7 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public StringBuilder zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() != zoijcleaow.NULL) {
                    return new StringBuilder(iobyxmoadgVar.dsvhmnatus());
                }
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) throws IOException {
                ppxfxbqfkfVar.ulzqkzuiru(sb3 == null ? null : sb3.toString());
            }
        };
        f25036cdpycssgdh = typeAdapter7;
        f25078yadqdtsiqt = zoijcleaow(StringBuilder.class, typeAdapter7);
        TypeAdapter typeAdapter8 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public StringBuffer zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() != zoijcleaow.NULL) {
                    return new StringBuffer(iobyxmoadgVar.dsvhmnatus());
                }
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, StringBuffer stringBuffer) throws IOException {
                ppxfxbqfkfVar.ulzqkzuiru(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        f25050iozdgvuglv = typeAdapter8;
        f25058lmojexxdyd = zoijcleaow(StringBuffer.class, typeAdapter8);
        TypeAdapter typeAdapter9 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public URL zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                    iobyxmoadgVar.wwaezpbzkn();
                    return null;
                }
                String strDsvhmnatus = iobyxmoadgVar.dsvhmnatus();
                if ("null".equals(strDsvhmnatus)) {
                    return null;
                }
                return new URL(strDsvhmnatus);
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, URL url) throws IOException {
                ppxfxbqfkfVar.ulzqkzuiru(url == null ? null : url.toExternalForm());
            }
        };
        f25076wwaezpbzkn = typeAdapter9;
        f25080ylkuphrtab = zoijcleaow(URL.class, typeAdapter9);
        TypeAdapter typeAdapter10 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public URI zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                    iobyxmoadgVar.wwaezpbzkn();
                    return null;
                }
                try {
                    String strDsvhmnatus = iobyxmoadgVar.dsvhmnatus();
                    if ("null".equals(strDsvhmnatus)) {
                        return null;
                    }
                    return new URI(strDsvhmnatus);
                } catch (URISyntaxException e13) {
                    throw new JsonIOException(e13);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, URI uri) throws IOException {
                ppxfxbqfkfVar.ulzqkzuiru(uri == null ? null : uri.toASCIIString());
            }
        };
        f25065pkzmftpjix = typeAdapter10;
        f25047hcddaimhww = zoijcleaow(URI.class, typeAdapter10);
        TypeAdapter typeAdapter11 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public InetAddress zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() != zoijcleaow.NULL) {
                    return InetAddress.getByName(iobyxmoadgVar.dsvhmnatus());
                }
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, InetAddress inetAddress) throws IOException {
                ppxfxbqfkfVar.ulzqkzuiru(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        f25053jpowsppfya = typeAdapter11;
        f25048hkdspvbjdz = eablkybsjg(InetAddress.class, typeAdapter11);
        TypeAdapter typeAdapter12 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public UUID zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                    iobyxmoadgVar.wwaezpbzkn();
                    return null;
                }
                String strDsvhmnatus = iobyxmoadgVar.dsvhmnatus();
                try {
                    return UUID.fromString(strDsvhmnatus);
                } catch (IllegalArgumentException e13) {
                    throw new JsonSyntaxException("Failed parsing '" + strDsvhmnatus + "' as UUID; at path " + iobyxmoadgVar.rgvfuqvkyq(), e13);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, UUID uuid) throws IOException {
                ppxfxbqfkfVar.ulzqkzuiru(uuid == null ? null : uuid.toString());
            }
        };
        f25037cllcsxoeiz = typeAdapter12;
        f25041dsvhmnatus = zoijcleaow(UUID.class, typeAdapter12);
        TypeAdapter typeAdapterIobyxmoadg6 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Currency zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                String strDsvhmnatus = iobyxmoadgVar.dsvhmnatus();
                try {
                    return Currency.getInstance(strDsvhmnatus);
                } catch (IllegalArgumentException e13) {
                    throw new JsonSyntaxException("Failed parsing '" + strDsvhmnatus + "' as Currency; at path " + iobyxmoadgVar.rgvfuqvkyq(), e13);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Currency currency) throws IOException {
                ppxfxbqfkfVar.ulzqkzuiru(currency.getCurrencyCode());
            }
        }.iobyxmoadg();
        f25077wypolnanlu = typeAdapterIobyxmoadg6;
        f25070stevsuqkhv = zoijcleaow(Currency.class, typeAdapterIobyxmoadg6);
        TypeAdapter typeAdapter13 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Calendar zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                    iobyxmoadgVar.wwaezpbzkn();
                    return null;
                }
                iobyxmoadgVar.wkgbmnqykc();
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (iobyxmoadgVar.kegysxyocb() != zoijcleaow.END_OBJECT) {
                    String strIstkbnxepw = iobyxmoadgVar.istkbnxepw();
                    int iPmvmpeiblj = iobyxmoadgVar.pmvmpeiblj();
                    if ("year".equals(strIstkbnxepw)) {
                        i13 = iPmvmpeiblj;
                    } else if ("month".equals(strIstkbnxepw)) {
                        i14 = iPmvmpeiblj;
                    } else if ("dayOfMonth".equals(strIstkbnxepw)) {
                        i15 = iPmvmpeiblj;
                    } else if ("hourOfDay".equals(strIstkbnxepw)) {
                        i16 = iPmvmpeiblj;
                    } else if ("minute".equals(strIstkbnxepw)) {
                        i17 = iPmvmpeiblj;
                    } else if ("second".equals(strIstkbnxepw)) {
                        i18 = iPmvmpeiblj;
                    }
                }
                iobyxmoadgVar.draadjrbmk();
                return new GregorianCalendar(i13, i14, i15, i16, i17, i18);
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Calendar calendar) throws IOException {
                if (calendar == null) {
                    ppxfxbqfkfVar.jyumaefscl();
                    return;
                }
                ppxfxbqfkfVar.nufgyqmvbu();
                ppxfxbqfkfVar.kcexrzcfyt("year");
                ppxfxbqfkfVar.kegysxyocb(calendar.get(1));
                ppxfxbqfkfVar.kcexrzcfyt("month");
                ppxfxbqfkfVar.kegysxyocb(calendar.get(2));
                ppxfxbqfkfVar.kcexrzcfyt("dayOfMonth");
                ppxfxbqfkfVar.kegysxyocb(calendar.get(5));
                ppxfxbqfkfVar.kcexrzcfyt("hourOfDay");
                ppxfxbqfkfVar.kegysxyocb(calendar.get(11));
                ppxfxbqfkfVar.kcexrzcfyt("minute");
                ppxfxbqfkfVar.kegysxyocb(calendar.get(12));
                ppxfxbqfkfVar.kcexrzcfyt("second");
                ppxfxbqfkfVar.kegysxyocb(calendar.get(13));
                ppxfxbqfkfVar.draadjrbmk();
            }
        };
        f25056kegysxyocb = typeAdapter13;
        f25071tzroggbefp = wkgbmnqykc(Calendar.class, GregorianCalendar.class, typeAdapter13);
        TypeAdapter typeAdapter14 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Locale zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                    iobyxmoadgVar.wwaezpbzkn();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(iobyxmoadgVar.dsvhmnatus(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Locale locale) throws IOException {
                ppxfxbqfkfVar.ulzqkzuiru(locale == null ? null : locale.toString());
            }
        };
        f25060mbcevpiqjq = typeAdapter14;
        f25061ntlheqmsrt = zoijcleaow(Locale.class, typeAdapter14);
        TypeAdapter typeAdapter15 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            private nufgyqmvbu gxszxtbevo(ce.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar) throws IOException {
                int i13 = iobyxmoadg.f25103iobyxmoadg[zoijcleaowVar.ordinal()];
                if (i13 == 1) {
                    return new gtknphoqwx(new gxszxtbevo(iobyxmoadgVar.dsvhmnatus()));
                }
                if (i13 == 2) {
                    return new gtknphoqwx(iobyxmoadgVar.dsvhmnatus());
                }
                if (i13 == 3) {
                    return new gtknphoqwx(Boolean.valueOf(iobyxmoadgVar.cqumvgiudr()));
                }
                if (i13 == 6) {
                    iobyxmoadgVar.wwaezpbzkn();
                    return dxjokdxxww.f24950zdlpuopuiu;
                }
                throw new IllegalStateException("Unexpected token: " + zoijcleaowVar);
            }

            private nufgyqmvbu lqeggnwhkg(ce.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar) throws IOException {
                int i13 = iobyxmoadg.f25103iobyxmoadg[zoijcleaowVar.ordinal()];
                if (i13 == 4) {
                    iobyxmoadgVar.iobyxmoadg();
                    return new eablkybsjg();
                }
                if (i13 != 5) {
                    return null;
                }
                iobyxmoadgVar.wkgbmnqykc();
                return new btonecajqb();
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public nufgyqmvbu zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                zoijcleaow zoijcleaowVarKegysxyocb = iobyxmoadgVar.kegysxyocb();
                nufgyqmvbu nufgyqmvbuVarLqeggnwhkg = lqeggnwhkg(iobyxmoadgVar, zoijcleaowVarKegysxyocb);
                if (nufgyqmvbuVarLqeggnwhkg == null) {
                    return gxszxtbevo(iobyxmoadgVar, zoijcleaowVarKegysxyocb);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (iobyxmoadgVar.vdvldrhtss()) {
                        String strIstkbnxepw = nufgyqmvbuVarLqeggnwhkg instanceof btonecajqb ? iobyxmoadgVar.istkbnxepw() : null;
                        zoijcleaow zoijcleaowVarKegysxyocb2 = iobyxmoadgVar.kegysxyocb();
                        nufgyqmvbu nufgyqmvbuVarLqeggnwhkg2 = lqeggnwhkg(iobyxmoadgVar, zoijcleaowVarKegysxyocb2);
                        boolean z13 = nufgyqmvbuVarLqeggnwhkg2 != null;
                        if (nufgyqmvbuVarLqeggnwhkg2 == null) {
                            nufgyqmvbuVarLqeggnwhkg2 = gxszxtbevo(iobyxmoadgVar, zoijcleaowVarKegysxyocb2);
                        }
                        if (nufgyqmvbuVarLqeggnwhkg instanceof eablkybsjg) {
                            ((eablkybsjg) nufgyqmvbuVarLqeggnwhkg).wflxmlrfwp(nufgyqmvbuVarLqeggnwhkg2);
                        } else {
                            ((btonecajqb) nufgyqmvbuVarLqeggnwhkg).wflxmlrfwp(strIstkbnxepw, nufgyqmvbuVarLqeggnwhkg2);
                        }
                        if (z13) {
                            arrayDeque.addLast(nufgyqmvbuVarLqeggnwhkg);
                            nufgyqmvbuVarLqeggnwhkg = nufgyqmvbuVarLqeggnwhkg2;
                        }
                    } else {
                        if (nufgyqmvbuVarLqeggnwhkg instanceof eablkybsjg) {
                            iobyxmoadgVar.btonecajqb();
                        } else {
                            iobyxmoadgVar.draadjrbmk();
                        }
                        if (arrayDeque.isEmpty()) {
                            return nufgyqmvbuVarLqeggnwhkg;
                        }
                        nufgyqmvbuVarLqeggnwhkg = (nufgyqmvbu) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, nufgyqmvbu nufgyqmvbuVar) throws IOException {
                if (nufgyqmvbuVar == null || nufgyqmvbuVar.btonecajqb()) {
                    ppxfxbqfkfVar.jyumaefscl();
                    return;
                }
                if (nufgyqmvbuVar.draadjrbmk()) {
                    gtknphoqwx gtknphoqwxVarWkgbmnqykc = nufgyqmvbuVar.wkgbmnqykc();
                    if (gtknphoqwxVarWkgbmnqykc.vdvldrhtss()) {
                        ppxfxbqfkfVar.ntlheqmsrt(gtknphoqwxVarWkgbmnqykc.agtfadlqog());
                        return;
                    } else if (gtknphoqwxVarWkgbmnqykc.ojitshcjhn()) {
                        ppxfxbqfkfVar.crxdokpmqz(gtknphoqwxVarWkgbmnqykc.iobyxmoadg());
                        return;
                    } else {
                        ppxfxbqfkfVar.ulzqkzuiru(gtknphoqwxVarWkgbmnqykc.gxszxtbevo());
                        return;
                    }
                }
                if (nufgyqmvbuVar.dxjokdxxww()) {
                    ppxfxbqfkfVar.lqeggnwhkg();
                    Iterator it = nufgyqmvbuVar.zoijcleaow().iterator();
                    while (it.hasNext()) {
                        wkgbmnqykc(ppxfxbqfkfVar, (nufgyqmvbu) it.next());
                    }
                    ppxfxbqfkfVar.btonecajqb();
                    return;
                }
                if (!nufgyqmvbuVar.gtknphoqwx()) {
                    throw new IllegalArgumentException("Couldn't write " + nufgyqmvbuVar.getClass());
                }
                ppxfxbqfkfVar.nufgyqmvbu();
                for (Map.Entry entry : nufgyqmvbuVar.ppxfxbqfkf().ojitshcjhn()) {
                    ppxfxbqfkfVar.kcexrzcfyt((String) entry.getKey());
                    wkgbmnqykc(ppxfxbqfkfVar, (nufgyqmvbu) entry.getValue());
                }
                ppxfxbqfkfVar.draadjrbmk();
            }
        };
        f25072ulzqkzuiru = typeAdapter15;
        f25069sopmlzcsov = eablkybsjg(nufgyqmvbu.class, typeAdapter15);
        f25039crxdokpmqz = new vdvldrhtss() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.vdvldrhtss
            public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
                Class clsPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
                if (!Enum.class.isAssignableFrom(clsPpxfxbqfkf) || clsPpxfxbqfkf == Enum.class) {
                    return null;
                }
                if (!clsPpxfxbqfkf.isEnum()) {
                    clsPpxfxbqfkf = clsPpxfxbqfkf.getSuperclass();
                }
                return new EnumTypeAdapter(clsPpxfxbqfkf);
            }
        };
    }

    public static vdvldrhtss eablkybsjg(final Class cls, final TypeAdapter typeAdapter) {
        return new vdvldrhtss() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.vdvldrhtss
            public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
                final Class<?> clsPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
                if (cls.isAssignableFrom(clsPpxfxbqfkf)) {
                    return new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                        @Override // com.google.gson.TypeAdapter
                        public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Object obj) {
                            typeAdapter.wkgbmnqykc(ppxfxbqfkfVar, obj);
                        }

                        @Override // com.google.gson.TypeAdapter
                        public Object zoijcleaow(ce.iobyxmoadg iobyxmoadgVar2) {
                            Object objZoijcleaow = typeAdapter.zoijcleaow(iobyxmoadgVar2);
                            if (objZoijcleaow == null || clsPpxfxbqfkf.isInstance(objZoijcleaow)) {
                                return objZoijcleaow;
                            }
                            throw new JsonSyntaxException("Expected a " + clsPpxfxbqfkf.getName() + " but was " + objZoijcleaow.getClass().getName() + "; at path " + iobyxmoadgVar2.rgvfuqvkyq());
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static vdvldrhtss iobyxmoadg(final be.iobyxmoadg iobyxmoadgVar, final TypeAdapter typeAdapter) {
        return new vdvldrhtss() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.vdvldrhtss
            public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar2) {
                if (iobyxmoadgVar2.equals(iobyxmoadgVar)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static vdvldrhtss ppxfxbqfkf(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new vdvldrhtss() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.vdvldrhtss
            public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
                Class clsPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
                if (clsPpxfxbqfkf == cls || clsPpxfxbqfkf == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static vdvldrhtss wkgbmnqykc(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new vdvldrhtss() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.vdvldrhtss
            public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
                Class clsPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
                if (clsPpxfxbqfkf == cls || clsPpxfxbqfkf == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static vdvldrhtss zoijcleaow(final Class cls, final TypeAdapter typeAdapter) {
        return new vdvldrhtss() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.vdvldrhtss
            public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
                if (iobyxmoadgVar.ppxfxbqfkf() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
