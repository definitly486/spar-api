package com.google.gson.internal.bind;

import ce.zoijcleaow;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.nufgyqmvbu;
import com.google.gson.internal.ppxfxbqfkf;
import com.google.gson.vdvldrhtss;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements vdvldrhtss {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ppxfxbqfkf f24969zdlpuopuiu;

    private static final class Adapter<E> extends TypeAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TypeAdapter f24970iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final nufgyqmvbu f24971zoijcleaow;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, nufgyqmvbu nufgyqmvbuVar) {
            this.f24970iobyxmoadg = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f24971zoijcleaow = nufgyqmvbuVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public Collection zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
            if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }
            Collection collection = (Collection) this.f24971zoijcleaow.iobyxmoadg();
            iobyxmoadgVar.iobyxmoadg();
            while (iobyxmoadgVar.vdvldrhtss()) {
                collection.add(this.f24970iobyxmoadg.zoijcleaow(iobyxmoadgVar));
            }
            iobyxmoadgVar.btonecajqb();
            return collection;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Collection collection) throws IOException {
            if (collection == null) {
                ppxfxbqfkfVar.jyumaefscl();
                return;
            }
            ppxfxbqfkfVar.lqeggnwhkg();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f24970iobyxmoadg.wkgbmnqykc(ppxfxbqfkfVar, it.next());
            }
            ppxfxbqfkfVar.btonecajqb();
        }
    }

    public CollectionTypeAdapterFactory(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f24969zdlpuopuiu = ppxfxbqfkfVar;
    }

    @Override // com.google.gson.vdvldrhtss
    public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
        Type typeWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        Class clsPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        if (!Collection.class.isAssignableFrom(clsPpxfxbqfkf)) {
            return null;
        }
        Type typeNufgyqmvbu = com.google.gson.internal.zoijcleaow.nufgyqmvbu(typeWkgbmnqykc, clsPpxfxbqfkf);
        return new Adapter(gson, typeNufgyqmvbu, gson.wflxmlrfwp(be.iobyxmoadg.zoijcleaow(typeNufgyqmvbu)), this.f24969zdlpuopuiu.zoijcleaow(iobyxmoadgVar));
    }
}
