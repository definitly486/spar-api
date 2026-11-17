package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes2.dex */
public final class Gson {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    static final String f24910lereixgezr = null;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    final boolean f24913agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    final boolean f24914btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    final rgvfuqvkyq f24915cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    final boolean f24916draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    final boolean f24917dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final List f24918eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    final List f24919esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    final boolean f24920gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    final Excluder f24921gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ThreadLocal f24922iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final rgvfuqvkyq f24923iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final List f24924jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    final int f24925kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    final ppxfxbqfkf f24926lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    final Map f24927nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    final boolean f24928ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    final int f24929oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final com.google.gson.internal.ppxfxbqfkf f24930ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    final boolean f24931rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    final String f24932vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    final boolean f24933wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f24934wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final List f24935yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final wflxmlrfwp f24936zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ConcurrentMap f24937zoijcleaow;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    static final ppxfxbqfkf f24911pmvmpeiblj = zoijcleaow.f25221zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    static final rgvfuqvkyq f24912zynmafqrjb = ojitshcjhn.f25190zdlpuopuiu;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    static final rgvfuqvkyq f24909istkbnxepw = ojitshcjhn.f25189yggfygwlhe;

    static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private TypeAdapter f24942iobyxmoadg = null;

        FutureTypeAdapter() {
        }

        private TypeAdapter gxszxtbevo() {
            TypeAdapter typeAdapter = this.f24942iobyxmoadg;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public TypeAdapter eablkybsjg() {
            return gxszxtbevo();
        }

        public void lqeggnwhkg(TypeAdapter typeAdapter) {
            if (this.f24942iobyxmoadg != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f24942iobyxmoadg = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Object obj) {
            gxszxtbevo().wkgbmnqykc(ppxfxbqfkfVar, obj);
        }

        @Override // com.google.gson.TypeAdapter
        public Object zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) {
            return gxszxtbevo().zoijcleaow(iobyxmoadgVar);
        }
    }

    public Gson() {
        this(Excluder.f24953lereixgezr, f24911pmvmpeiblj, Collections.emptyMap(), false, false, false, true, false, false, false, true, wflxmlrfwp.f25193zdlpuopuiu, f24910lereixgezr, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f24912zynmafqrjb, f24909istkbnxepw, Collections.emptyList());
    }

    private TypeAdapter eablkybsjg(boolean z13) {
        return z13 ? TypeAdapters.f25054jyumaefscl : new TypeAdapter() { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Double zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() != ce.zoijcleaow.NULL) {
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
                    return;
                }
                double dDoubleValue = number.doubleValue();
                Gson.wkgbmnqykc(dDoubleValue);
                ppxfxbqfkfVar.wypolnanlu(dDoubleValue);
            }
        };
    }

    private TypeAdapter gxszxtbevo(boolean z13) {
        return z13 ? TypeAdapters.f25079yggfygwlhe : new TypeAdapter() { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Float zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() != ce.zoijcleaow.NULL) {
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
                float fFloatValue = number.floatValue();
                Gson.wkgbmnqykc(fFloatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(fFloatValue);
                }
                ppxfxbqfkfVar.ntlheqmsrt(number);
            }
        };
    }

    private static void iobyxmoadg(Object obj, ce.iobyxmoadg iobyxmoadgVar) {
        if (obj != null) {
            try {
                if (iobyxmoadgVar.kegysxyocb() == ce.zoijcleaow.END_DOCUMENT) {
                } else {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e13) {
                throw new JsonSyntaxException(e13);
            } catch (IOException e14) {
                throw new JsonIOException(e14);
            }
        }
    }

    private static TypeAdapter ppxfxbqfkf(final TypeAdapter typeAdapter) {
        return new TypeAdapter() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public AtomicLongArray zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                iobyxmoadgVar.iobyxmoadg();
                while (iobyxmoadgVar.vdvldrhtss()) {
                    arrayList.add(Long.valueOf(((Number) typeAdapter.zoijcleaow(iobyxmoadgVar)).longValue()));
                }
                iobyxmoadgVar.btonecajqb();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i13 = 0; i13 < size; i13++) {
                    atomicLongArray.set(i13, ((Long) arrayList.get(i13)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, AtomicLongArray atomicLongArray) throws IOException {
                ppxfxbqfkfVar.lqeggnwhkg();
                int length = atomicLongArray.length();
                for (int i13 = 0; i13 < length; i13++) {
                    typeAdapter.wkgbmnqykc(ppxfxbqfkfVar, Long.valueOf(atomicLongArray.get(i13)));
                }
                ppxfxbqfkfVar.btonecajqb();
            }
        }.iobyxmoadg();
    }

    private static TypeAdapter rgvfuqvkyq(wflxmlrfwp wflxmlrfwpVar) {
        return wflxmlrfwpVar == wflxmlrfwp.f25193zdlpuopuiu ? TypeAdapters.f25081zdlpuopuiu : new TypeAdapter() { // from class: com.google.gson.Gson.3
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public Number zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() != ce.zoijcleaow.NULL) {
                    return Long.valueOf(iobyxmoadgVar.zynmafqrjb());
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
                    ppxfxbqfkfVar.ulzqkzuiru(number.toString());
                }
            }
        };
    }

    static void wkgbmnqykc(double d13) {
        if (Double.isNaN(d13) || Double.isInfinite(d13)) {
            throw new IllegalArgumentException(d13 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private static TypeAdapter zoijcleaow(final TypeAdapter typeAdapter) {
        return new TypeAdapter() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
            public AtomicLong zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) {
                return new AtomicLong(((Number) typeAdapter.zoijcleaow(iobyxmoadgVar)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, AtomicLong atomicLong) {
                typeAdapter.wkgbmnqykc(ppxfxbqfkfVar, Long.valueOf(atomicLong.get()));
            }
        }.iobyxmoadg();
    }

    public TypeAdapter agtfadlqog(Class cls) {
        return wflxmlrfwp(be.iobyxmoadg.iobyxmoadg(cls));
    }

    public Object btonecajqb(String str, be.iobyxmoadg iobyxmoadgVar) {
        if (str == null) {
            return null;
        }
        return nufgyqmvbu(new StringReader(str), iobyxmoadgVar);
    }

    public void cqumvgiudr(Object obj, Type type, ce.ppxfxbqfkf ppxfxbqfkfVar) {
        TypeAdapter typeAdapterWflxmlrfwp = wflxmlrfwp(be.iobyxmoadg.zoijcleaow(type));
        boolean zRgvfuqvkyq = ppxfxbqfkfVar.rgvfuqvkyq();
        ppxfxbqfkfVar.wwaezpbzkn(true);
        boolean zOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
        ppxfxbqfkfVar.istkbnxepw(this.f24916draadjrbmk);
        boolean zAgtfadlqog = ppxfxbqfkfVar.agtfadlqog();
        ppxfxbqfkfVar.hkdspvbjdz(this.f24917dxjokdxxww);
        try {
            try {
                typeAdapterWflxmlrfwp.wkgbmnqykc(ppxfxbqfkfVar, obj);
                ppxfxbqfkfVar.wwaezpbzkn(zRgvfuqvkyq);
                ppxfxbqfkfVar.istkbnxepw(zOjitshcjhn);
                ppxfxbqfkfVar.hkdspvbjdz(zAgtfadlqog);
            } catch (IOException e13) {
                throw new JsonIOException(e13);
            } catch (AssertionError e14) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e14.getMessage(), e14);
            }
        } catch (Throwable th2) {
            ppxfxbqfkfVar.wwaezpbzkn(zRgvfuqvkyq);
            ppxfxbqfkfVar.istkbnxepw(zOjitshcjhn);
            ppxfxbqfkfVar.hkdspvbjdz(zAgtfadlqog);
            throw th2;
        }
    }

    public Object draadjrbmk(String str, Type type) {
        return btonecajqb(str, be.iobyxmoadg.zoijcleaow(type));
    }

    public Object dxjokdxxww(Reader reader, Class cls) {
        return com.google.gson.internal.btonecajqb.zoijcleaow(cls).cast(nufgyqmvbu(reader, be.iobyxmoadg.iobyxmoadg(cls)));
    }

    public void esjtqupxsv(Object obj, Type type, Appendable appendable) {
        try {
            cqumvgiudr(obj, type, oxmwwwfdhm(com.google.gson.internal.draadjrbmk.ppxfxbqfkf(appendable)));
        } catch (IOException e13) {
            throw new JsonIOException(e13);
        }
    }

    public Object gtknphoqwx(String str, Class cls) {
        return com.google.gson.internal.btonecajqb.zoijcleaow(cls).cast(btonecajqb(str, be.iobyxmoadg.iobyxmoadg(cls)));
    }

    public void iwizpuwonk(nufgyqmvbu nufgyqmvbuVar, Appendable appendable) {
        try {
            jyumaefscl(nufgyqmvbuVar, oxmwwwfdhm(com.google.gson.internal.draadjrbmk.ppxfxbqfkf(appendable)));
        } catch (IOException e13) {
            throw new JsonIOException(e13);
        }
    }

    public void jyumaefscl(nufgyqmvbu nufgyqmvbuVar, ce.ppxfxbqfkf ppxfxbqfkfVar) {
        boolean zRgvfuqvkyq = ppxfxbqfkfVar.rgvfuqvkyq();
        ppxfxbqfkfVar.wwaezpbzkn(true);
        boolean zOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
        ppxfxbqfkfVar.istkbnxepw(this.f24916draadjrbmk);
        boolean zAgtfadlqog = ppxfxbqfkfVar.agtfadlqog();
        ppxfxbqfkfVar.hkdspvbjdz(this.f24917dxjokdxxww);
        try {
            try {
                com.google.gson.internal.draadjrbmk.zoijcleaow(nufgyqmvbuVar, ppxfxbqfkfVar);
                ppxfxbqfkfVar.wwaezpbzkn(zRgvfuqvkyq);
                ppxfxbqfkfVar.istkbnxepw(zOjitshcjhn);
                ppxfxbqfkfVar.hkdspvbjdz(zAgtfadlqog);
            } catch (IOException e13) {
                throw new JsonIOException(e13);
            } catch (AssertionError e14) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e14.getMessage(), e14);
            }
        } catch (Throwable th2) {
            ppxfxbqfkfVar.wwaezpbzkn(zRgvfuqvkyq);
            ppxfxbqfkfVar.istkbnxepw(zOjitshcjhn);
            ppxfxbqfkfVar.hkdspvbjdz(zAgtfadlqog);
            throw th2;
        }
    }

    public String kcexrzcfyt(nufgyqmvbu nufgyqmvbuVar) {
        StringWriter stringWriter = new StringWriter();
        iwizpuwonk(nufgyqmvbuVar, stringWriter);
        return stringWriter.toString();
    }

    public Object lqeggnwhkg(ce.iobyxmoadg iobyxmoadgVar, be.iobyxmoadg iobyxmoadgVar2) {
        boolean zKcexrzcfyt = iobyxmoadgVar.kcexrzcfyt();
        boolean z13 = true;
        iobyxmoadgVar.jlmebxxoox(true);
        try {
            try {
                try {
                    iobyxmoadgVar.kegysxyocb();
                    z13 = false;
                    Object objZoijcleaow = wflxmlrfwp(iobyxmoadgVar2).zoijcleaow(iobyxmoadgVar);
                    iobyxmoadgVar.jlmebxxoox(zKcexrzcfyt);
                    return objZoijcleaow;
                } catch (AssertionError e13) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e13.getMessage(), e13);
                } catch (IllegalStateException e14) {
                    throw new JsonSyntaxException(e14);
                }
            } catch (EOFException e15) {
                if (!z13) {
                    throw new JsonSyntaxException(e15);
                }
                iobyxmoadgVar.jlmebxxoox(zKcexrzcfyt);
                return null;
            } catch (IOException e16) {
                throw new JsonSyntaxException(e16);
            }
        } catch (Throwable th2) {
            iobyxmoadgVar.jlmebxxoox(zKcexrzcfyt);
            throw th2;
        }
    }

    public Object nufgyqmvbu(Reader reader, be.iobyxmoadg iobyxmoadgVar) {
        ce.iobyxmoadg iobyxmoadgVarVdvldrhtss = vdvldrhtss(reader);
        Object objLqeggnwhkg = lqeggnwhkg(iobyxmoadgVarVdvldrhtss, iobyxmoadgVar);
        iobyxmoadg(objLqeggnwhkg, iobyxmoadgVarVdvldrhtss);
        return objLqeggnwhkg;
    }

    public TypeAdapter ojitshcjhn(vdvldrhtss vdvldrhtssVar, be.iobyxmoadg iobyxmoadgVar) {
        if (!this.f24918eablkybsjg.contains(vdvldrhtssVar)) {
            vdvldrhtssVar = this.f24934wkgbmnqykc;
        }
        boolean z13 = false;
        for (vdvldrhtss vdvldrhtssVar2 : this.f24918eablkybsjg) {
            if (z13) {
                TypeAdapter typeAdapterIobyxmoadg = vdvldrhtssVar2.iobyxmoadg(this, iobyxmoadgVar);
                if (typeAdapterIobyxmoadg != null) {
                    return typeAdapterIobyxmoadg;
                }
            } else if (vdvldrhtssVar2 == vdvldrhtssVar) {
                z13 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + iobyxmoadgVar);
    }

    public ce.ppxfxbqfkf oxmwwwfdhm(Writer writer) throws IOException {
        if (this.f24920gtknphoqwx) {
            writer.write(")]}'\n");
        }
        ce.ppxfxbqfkf ppxfxbqfkfVar = new ce.ppxfxbqfkf(writer);
        if (this.f24933wflxmlrfwp) {
            ppxfxbqfkfVar.cdpycssgdh("  ");
        }
        ppxfxbqfkfVar.istkbnxepw(this.f24916draadjrbmk);
        ppxfxbqfkfVar.wwaezpbzkn(this.f24913agtfadlqog);
        ppxfxbqfkfVar.hkdspvbjdz(this.f24917dxjokdxxww);
        return ppxfxbqfkfVar;
    }

    public String toString() {
        return "{serializeNulls:" + this.f24917dxjokdxxww + ",factories:" + this.f24918eablkybsjg + ",instanceCreators:" + this.f24930ppxfxbqfkf + "}";
    }

    public ce.iobyxmoadg vdvldrhtss(Reader reader) {
        ce.iobyxmoadg iobyxmoadgVar = new ce.iobyxmoadg(reader);
        iobyxmoadgVar.jlmebxxoox(this.f24913agtfadlqog);
        return iobyxmoadgVar;
    }

    public TypeAdapter wflxmlrfwp(be.iobyxmoadg iobyxmoadgVar) {
        boolean z13;
        Objects.requireNonNull(iobyxmoadgVar, "type must not be null");
        TypeAdapter typeAdapter = (TypeAdapter) this.f24937zoijcleaow.get(iobyxmoadgVar);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map map = (Map) this.f24922iobyxmoadg.get();
        if (map == null) {
            map = new HashMap();
            this.f24922iobyxmoadg.set(map);
            z13 = true;
        } else {
            TypeAdapter typeAdapter2 = (TypeAdapter) map.get(iobyxmoadgVar);
            if (typeAdapter2 != null) {
                return typeAdapter2;
            }
            z13 = false;
        }
        try {
            FutureTypeAdapter futureTypeAdapter = new FutureTypeAdapter();
            map.put(iobyxmoadgVar, futureTypeAdapter);
            Iterator it = this.f24918eablkybsjg.iterator();
            TypeAdapter typeAdapterIobyxmoadg = null;
            while (it.hasNext()) {
                typeAdapterIobyxmoadg = ((vdvldrhtss) it.next()).iobyxmoadg(this, iobyxmoadgVar);
                if (typeAdapterIobyxmoadg != null) {
                    futureTypeAdapter.lqeggnwhkg(typeAdapterIobyxmoadg);
                    map.put(iobyxmoadgVar, typeAdapterIobyxmoadg);
                    break;
                }
            }
            if (z13) {
                this.f24922iobyxmoadg.remove();
            }
            if (typeAdapterIobyxmoadg != null) {
                if (z13) {
                    this.f24937zoijcleaow.putAll(map);
                }
                return typeAdapterIobyxmoadg;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + iobyxmoadgVar);
        } catch (Throwable th2) {
            if (z13) {
                this.f24922iobyxmoadg.remove();
            }
            throw th2;
        }
    }

    public String yggfygwlhe(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        esjtqupxsv(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String zdlpuopuiu(Object obj) {
        return obj == null ? kcexrzcfyt(dxjokdxxww.f24950zdlpuopuiu) : yggfygwlhe(obj, obj.getClass());
    }

    Gson(Excluder excluder, ppxfxbqfkf ppxfxbqfkfVar, Map map, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23, wflxmlrfwp wflxmlrfwpVar, String str, int i13, int i14, List list, List list2, List list3, rgvfuqvkyq rgvfuqvkyqVar, rgvfuqvkyq rgvfuqvkyqVar2, List list4) {
        this.f24922iobyxmoadg = new ThreadLocal();
        this.f24937zoijcleaow = new ConcurrentHashMap();
        this.f24921gxszxtbevo = excluder;
        this.f24926lqeggnwhkg = ppxfxbqfkfVar;
        this.f24927nufgyqmvbu = map;
        com.google.gson.internal.ppxfxbqfkf ppxfxbqfkfVar2 = new com.google.gson.internal.ppxfxbqfkf(map, z23, list4);
        this.f24930ppxfxbqfkf = ppxfxbqfkfVar2;
        this.f24917dxjokdxxww = z13;
        this.f24914btonecajqb = z14;
        this.f24920gtknphoqwx = z15;
        this.f24916draadjrbmk = z16;
        this.f24933wflxmlrfwp = z17;
        this.f24913agtfadlqog = z18;
        this.f24928ojitshcjhn = z19;
        this.f24931rgvfuqvkyq = z23;
        this.f24936zdlpuopuiu = wflxmlrfwpVar;
        this.f24932vdvldrhtss = str;
        this.f24929oxmwwwfdhm = i13;
        this.f24925kcexrzcfyt = i14;
        this.f24935yggfygwlhe = list;
        this.f24924jyumaefscl = list2;
        this.f24923iwizpuwonk = rgvfuqvkyqVar;
        this.f24915cqumvgiudr = rgvfuqvkyqVar2;
        this.f24919esjtqupxsv = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f25069sopmlzcsov);
        arrayList.add(ObjectTypeAdapter.eablkybsjg(rgvfuqvkyqVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f25051istkbnxepw);
        arrayList.add(TypeAdapters.f25074wflxmlrfwp);
        arrayList.add(TypeAdapters.f25059lqeggnwhkg);
        arrayList.add(TypeAdapters.f25042dxjokdxxww);
        arrayList.add(TypeAdapters.f25045gtknphoqwx);
        TypeAdapter typeAdapterRgvfuqvkyq = rgvfuqvkyq(wflxmlrfwpVar);
        arrayList.add(TypeAdapters.ppxfxbqfkf(Long.TYPE, Long.class, typeAdapterRgvfuqvkyq));
        arrayList.add(TypeAdapters.ppxfxbqfkf(Double.TYPE, Double.class, eablkybsjg(z19)));
        arrayList.add(TypeAdapters.ppxfxbqfkf(Float.TYPE, Float.class, gxszxtbevo(z19)));
        arrayList.add(NumberTypeAdapter.eablkybsjg(rgvfuqvkyqVar2));
        arrayList.add(TypeAdapters.f25063ojitshcjhn);
        arrayList.add(TypeAdapters.f25073vdvldrhtss);
        arrayList.add(TypeAdapters.zoijcleaow(AtomicLong.class, zoijcleaow(typeAdapterRgvfuqvkyq)));
        arrayList.add(TypeAdapters.zoijcleaow(AtomicLongArray.class, ppxfxbqfkf(typeAdapterRgvfuqvkyq)));
        arrayList.add(TypeAdapters.f25055kcexrzcfyt);
        arrayList.add(TypeAdapters.f25038cqumvgiudr);
        arrayList.add(TypeAdapters.f25078yadqdtsiqt);
        arrayList.add(TypeAdapters.f25058lmojexxdyd);
        arrayList.add(TypeAdapters.zoijcleaow(BigDecimal.class, TypeAdapters.f25057lereixgezr));
        arrayList.add(TypeAdapters.zoijcleaow(BigInteger.class, TypeAdapters.f25066pmvmpeiblj));
        arrayList.add(TypeAdapters.zoijcleaow(com.google.gson.internal.gxszxtbevo.class, TypeAdapters.f25083zynmafqrjb));
        arrayList.add(TypeAdapters.f25080ylkuphrtab);
        arrayList.add(TypeAdapters.f25047hcddaimhww);
        arrayList.add(TypeAdapters.f25041dsvhmnatus);
        arrayList.add(TypeAdapters.f25070stevsuqkhv);
        arrayList.add(TypeAdapters.f25061ntlheqmsrt);
        arrayList.add(TypeAdapters.f25048hkdspvbjdz);
        arrayList.add(TypeAdapters.f25075wkgbmnqykc);
        arrayList.add(DateTypeAdapter.f24972zoijcleaow);
        arrayList.add(TypeAdapters.f25071tzroggbefp);
        if (com.google.gson.internal.sql.iobyxmoadg.f25167iobyxmoadg) {
            arrayList.add(com.google.gson.internal.sql.iobyxmoadg.f25165eablkybsjg);
            arrayList.add(com.google.gson.internal.sql.iobyxmoadg.f25169wkgbmnqykc);
            arrayList.add(com.google.gson.internal.sql.iobyxmoadg.f25166gxszxtbevo);
        }
        arrayList.add(ArrayTypeAdapter.f24966ppxfxbqfkf);
        arrayList.add(TypeAdapters.f25082zoijcleaow);
        arrayList.add(new CollectionTypeAdapterFactory(ppxfxbqfkfVar2));
        arrayList.add(new MapTypeAdapterFactory(ppxfxbqfkfVar2, z14));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(ppxfxbqfkfVar2);
        this.f24934wkgbmnqykc = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f25039crxdokpmqz);
        arrayList.add(new ReflectiveTypeAdapterFactory(ppxfxbqfkfVar2, ppxfxbqfkfVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f24918eablkybsjg = Collections.unmodifiableList(arrayList);
    }
}
