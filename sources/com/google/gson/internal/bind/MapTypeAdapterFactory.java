package com.google.gson.internal.bind;

import ce.zoijcleaow;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.gtknphoqwx;
import com.google.gson.internal.draadjrbmk;
import com.google.gson.internal.eablkybsjg;
import com.google.gson.internal.nufgyqmvbu;
import com.google.gson.internal.ppxfxbqfkf;
import com.google.gson.vdvldrhtss;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final boolean f24979yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ppxfxbqfkf f24980zdlpuopuiu;

    private final class Adapter<K, V> extends TypeAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TypeAdapter f24981iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final nufgyqmvbu f24982ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final TypeAdapter f24984zoijcleaow;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, Type type2, TypeAdapter typeAdapter2, nufgyqmvbu nufgyqmvbuVar) {
            this.f24981iobyxmoadg = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f24984zoijcleaow = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f24982ppxfxbqfkf = nufgyqmvbuVar;
        }

        private String eablkybsjg(com.google.gson.nufgyqmvbu nufgyqmvbuVar) {
            if (!nufgyqmvbuVar.draadjrbmk()) {
                if (nufgyqmvbuVar.btonecajqb()) {
                    return "null";
                }
                throw new AssertionError();
            }
            gtknphoqwx gtknphoqwxVarWkgbmnqykc = nufgyqmvbuVar.wkgbmnqykc();
            if (gtknphoqwxVarWkgbmnqykc.vdvldrhtss()) {
                return String.valueOf(gtknphoqwxVarWkgbmnqykc.agtfadlqog());
            }
            if (gtknphoqwxVarWkgbmnqykc.ojitshcjhn()) {
                return Boolean.toString(gtknphoqwxVarWkgbmnqykc.iobyxmoadg());
            }
            if (gtknphoqwxVarWkgbmnqykc.oxmwwwfdhm()) {
                return gtknphoqwxVarWkgbmnqykc.gxszxtbevo();
            }
            throw new AssertionError();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public Map zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
            zoijcleaow zoijcleaowVarKegysxyocb = iobyxmoadgVar.kegysxyocb();
            if (zoijcleaowVarKegysxyocb == zoijcleaow.NULL) {
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }
            Map map = (Map) this.f24982ppxfxbqfkf.iobyxmoadg();
            if (zoijcleaowVarKegysxyocb == zoijcleaow.BEGIN_ARRAY) {
                iobyxmoadgVar.iobyxmoadg();
                while (iobyxmoadgVar.vdvldrhtss()) {
                    iobyxmoadgVar.iobyxmoadg();
                    Object objZoijcleaow = this.f24981iobyxmoadg.zoijcleaow(iobyxmoadgVar);
                    if (map.put(objZoijcleaow, this.f24984zoijcleaow.zoijcleaow(iobyxmoadgVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + objZoijcleaow);
                    }
                    iobyxmoadgVar.btonecajqb();
                }
                iobyxmoadgVar.btonecajqb();
            } else {
                iobyxmoadgVar.wkgbmnqykc();
                while (iobyxmoadgVar.vdvldrhtss()) {
                    eablkybsjg.f25113iobyxmoadg.iobyxmoadg(iobyxmoadgVar);
                    Object objZoijcleaow2 = this.f24981iobyxmoadg.zoijcleaow(iobyxmoadgVar);
                    if (map.put(objZoijcleaow2, this.f24984zoijcleaow.zoijcleaow(iobyxmoadgVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + objZoijcleaow2);
                    }
                }
                iobyxmoadgVar.draadjrbmk();
            }
            return map;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Map map) throws IOException {
            if (map == null) {
                ppxfxbqfkfVar.jyumaefscl();
                return;
            }
            if (!MapTypeAdapterFactory.this.f24979yggfygwlhe) {
                ppxfxbqfkfVar.nufgyqmvbu();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    ppxfxbqfkfVar.kcexrzcfyt(String.valueOf(entry.getKey()));
                    this.f24984zoijcleaow.wkgbmnqykc(ppxfxbqfkfVar, entry.getValue());
                }
                ppxfxbqfkfVar.draadjrbmk();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i13 = 0;
            boolean z13 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                com.google.gson.nufgyqmvbu nufgyqmvbuVarPpxfxbqfkf = this.f24981iobyxmoadg.ppxfxbqfkf(entry2.getKey());
                arrayList.add(nufgyqmvbuVarPpxfxbqfkf);
                arrayList2.add(entry2.getValue());
                z13 |= nufgyqmvbuVarPpxfxbqfkf.dxjokdxxww() || nufgyqmvbuVarPpxfxbqfkf.gtknphoqwx();
            }
            if (!z13) {
                ppxfxbqfkfVar.nufgyqmvbu();
                int size = arrayList.size();
                while (i13 < size) {
                    ppxfxbqfkfVar.kcexrzcfyt(eablkybsjg((com.google.gson.nufgyqmvbu) arrayList.get(i13)));
                    this.f24984zoijcleaow.wkgbmnqykc(ppxfxbqfkfVar, arrayList2.get(i13));
                    i13++;
                }
                ppxfxbqfkfVar.draadjrbmk();
                return;
            }
            ppxfxbqfkfVar.lqeggnwhkg();
            int size2 = arrayList.size();
            while (i13 < size2) {
                ppxfxbqfkfVar.lqeggnwhkg();
                draadjrbmk.zoijcleaow((com.google.gson.nufgyqmvbu) arrayList.get(i13), ppxfxbqfkfVar);
                this.f24984zoijcleaow.wkgbmnqykc(ppxfxbqfkfVar, arrayList2.get(i13));
                ppxfxbqfkfVar.btonecajqb();
                i13++;
            }
            ppxfxbqfkfVar.btonecajqb();
        }
    }

    public MapTypeAdapterFactory(ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        this.f24980zdlpuopuiu = ppxfxbqfkfVar;
        this.f24979yggfygwlhe = z13;
    }

    private TypeAdapter zoijcleaow(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f25046gxszxtbevo : gson.wflxmlrfwp(be.iobyxmoadg.zoijcleaow(type));
    }

    @Override // com.google.gson.vdvldrhtss
    public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
        Type typeWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        Class clsPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        if (!Map.class.isAssignableFrom(clsPpxfxbqfkf)) {
            return null;
        }
        Type[] typeArrBtonecajqb = com.google.gson.internal.zoijcleaow.btonecajqb(typeWkgbmnqykc, clsPpxfxbqfkf);
        return new Adapter(gson, typeArrBtonecajqb[0], zoijcleaow(gson, typeArrBtonecajqb[0]), typeArrBtonecajqb[1], gson.wflxmlrfwp(be.iobyxmoadg.zoijcleaow(typeArrBtonecajqb[1])), this.f24980zdlpuopuiu.zoijcleaow(iobyxmoadgVar));
    }
}
