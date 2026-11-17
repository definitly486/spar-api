package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ppxfxbqfkf;
import com.google.gson.lqeggnwhkg;
import com.google.gson.vdvldrhtss;
import yd.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements vdvldrhtss {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ppxfxbqfkf f24978zdlpuopuiu;

    public JsonAdapterAnnotationTypeAdapterFactory(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f24978zdlpuopuiu = ppxfxbqfkfVar;
    }

    @Override // com.google.gson.vdvldrhtss
    public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
        zoijcleaow zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.ppxfxbqfkf().getAnnotation(zoijcleaow.class);
        if (zoijcleaowVar == null) {
            return null;
        }
        return zoijcleaow(this.f24978zdlpuopuiu, gson, iobyxmoadgVar, zoijcleaowVar);
    }

    TypeAdapter zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, Gson gson, be.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar) {
        TypeAdapter treeTypeAdapter;
        Object objIobyxmoadg = ppxfxbqfkfVar.zoijcleaow(be.iobyxmoadg.iobyxmoadg(zoijcleaowVar.value())).iobyxmoadg();
        boolean zNullSafe = zoijcleaowVar.nullSafe();
        if (objIobyxmoadg instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) objIobyxmoadg;
        } else if (objIobyxmoadg instanceof vdvldrhtss) {
            treeTypeAdapter = ((vdvldrhtss) objIobyxmoadg).iobyxmoadg(gson, iobyxmoadgVar);
        } else {
            if (!(objIobyxmoadg instanceof lqeggnwhkg)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objIobyxmoadg.getClass().getName() + " as a @JsonAdapter for " + iobyxmoadgVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter(null, objIobyxmoadg instanceof lqeggnwhkg ? (lqeggnwhkg) objIobyxmoadg : null, gson, iobyxmoadgVar, null, zNullSafe);
            zNullSafe = false;
        }
        return (treeTypeAdapter == null || !zNullSafe) ? treeTypeAdapter : treeTypeAdapter.iobyxmoadg();
    }
}
