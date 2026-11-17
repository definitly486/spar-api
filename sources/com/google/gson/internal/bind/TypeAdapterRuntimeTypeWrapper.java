package com.google.gson.internal.bind;

import ce.ppxfxbqfkf;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes2.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Gson f25031iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Type f25032ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final TypeAdapter f25033zoijcleaow;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.f25031iobyxmoadg = gson;
        this.f25033zoijcleaow = typeAdapter;
        this.f25032ppxfxbqfkf = type;
    }

    private static Type eablkybsjg(Type type, Object obj) {
        if (obj != null) {
            return ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type;
        }
        return type;
    }

    private static boolean gxszxtbevo(TypeAdapter typeAdapter) {
        TypeAdapter typeAdapterEablkybsjg;
        while ((typeAdapter instanceof SerializationDelegatingTypeAdapter) && (typeAdapterEablkybsjg = ((SerializationDelegatingTypeAdapter) typeAdapter).eablkybsjg()) != typeAdapter) {
            typeAdapter = typeAdapterEablkybsjg;
        }
        return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    @Override // com.google.gson.TypeAdapter
    public void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, Object obj) {
        TypeAdapter typeAdapterWflxmlrfwp = this.f25033zoijcleaow;
        Type typeEablkybsjg = eablkybsjg(this.f25032ppxfxbqfkf, obj);
        if (typeEablkybsjg != this.f25032ppxfxbqfkf) {
            typeAdapterWflxmlrfwp = this.f25031iobyxmoadg.wflxmlrfwp(be.iobyxmoadg.zoijcleaow(typeEablkybsjg));
            if ((typeAdapterWflxmlrfwp instanceof ReflectiveTypeAdapterFactory.Adapter) && !gxszxtbevo(this.f25033zoijcleaow)) {
                typeAdapterWflxmlrfwp = this.f25033zoijcleaow;
            }
        }
        typeAdapterWflxmlrfwp.wkgbmnqykc(ppxfxbqfkfVar, obj);
    }

    @Override // com.google.gson.TypeAdapter
    public Object zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) {
        return this.f25033zoijcleaow.zoijcleaow(iobyxmoadgVar);
    }
}
