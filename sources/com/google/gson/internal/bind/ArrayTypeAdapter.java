package com.google.gson.internal.bind;

import ce.ppxfxbqfkf;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.zoijcleaow;
import com.google.gson.vdvldrhtss;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final vdvldrhtss f24966ppxfxbqfkf = new vdvldrhtss() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.vdvldrhtss
        public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
            Type typeWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
            if (!(typeWkgbmnqykc instanceof GenericArrayType) && (!(typeWkgbmnqykc instanceof Class) || !((Class) typeWkgbmnqykc).isArray())) {
                return null;
            }
            Type typeLqeggnwhkg = zoijcleaow.lqeggnwhkg(typeWkgbmnqykc);
            return new ArrayTypeAdapter(gson, gson.wflxmlrfwp(be.iobyxmoadg.zoijcleaow(typeLqeggnwhkg)), zoijcleaow.gtknphoqwx(typeLqeggnwhkg));
        }
    };

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Class f24967iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final TypeAdapter f24968zoijcleaow;

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeAdapter, Class cls) {
        this.f24968zoijcleaow = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f24967iobyxmoadg = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, Object obj) throws IOException {
        if (obj == null) {
            ppxfxbqfkfVar.jyumaefscl();
            return;
        }
        ppxfxbqfkfVar.lqeggnwhkg();
        int length = Array.getLength(obj);
        for (int i13 = 0; i13 < length; i13++) {
            this.f24968zoijcleaow.wkgbmnqykc(ppxfxbqfkfVar, Array.get(obj, i13));
        }
        ppxfxbqfkfVar.btonecajqb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public Object zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
        if (iobyxmoadgVar.kegysxyocb() == ce.zoijcleaow.NULL) {
            iobyxmoadgVar.wwaezpbzkn();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        iobyxmoadgVar.iobyxmoadg();
        while (iobyxmoadgVar.vdvldrhtss()) {
            arrayList.add(this.f24968zoijcleaow.zoijcleaow(iobyxmoadgVar));
        }
        iobyxmoadgVar.btonecajqb();
        int size = arrayList.size();
        if (!this.f24967iobyxmoadg.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f24967iobyxmoadg, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f24967iobyxmoadg, size);
        for (int i13 = 0; i13 < size; i13++) {
            Array.set(objNewInstance, i13, arrayList.get(i13));
        }
        return objNewInstance;
    }
}
