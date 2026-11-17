package com.google.gson.internal.bind;

import ce.ppxfxbqfkf;
import ce.zoijcleaow;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.lqeggnwhkg;
import com.google.gson.ojitshcjhn;
import com.google.gson.rgvfuqvkyq;
import com.google.gson.vdvldrhtss;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectTypeAdapter extends TypeAdapter {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final vdvldrhtss f24989ppxfxbqfkf = gxszxtbevo(ojitshcjhn.f25190zdlpuopuiu);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Gson f24990iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rgvfuqvkyq f24991zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f24993iobyxmoadg;

        static {
            int[] iArr = new int[zoijcleaow.values().length];
            f24993iobyxmoadg = iArr;
            try {
                iArr[zoijcleaow.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24993iobyxmoadg[zoijcleaow.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24993iobyxmoadg[zoijcleaow.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24993iobyxmoadg[zoijcleaow.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24993iobyxmoadg[zoijcleaow.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24993iobyxmoadg[zoijcleaow.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static vdvldrhtss eablkybsjg(rgvfuqvkyq rgvfuqvkyqVar) {
        return rgvfuqvkyqVar == ojitshcjhn.f25190zdlpuopuiu ? f24989ppxfxbqfkf : gxszxtbevo(rgvfuqvkyqVar);
    }

    private static vdvldrhtss gxszxtbevo(final rgvfuqvkyq rgvfuqvkyqVar) {
        return new vdvldrhtss() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.vdvldrhtss
            public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
                if (iobyxmoadgVar.ppxfxbqfkf() == Object.class) {
                    return new ObjectTypeAdapter(gson, rgvfuqvkyqVar);
                }
                return null;
            }
        };
    }

    private Object lqeggnwhkg(ce.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar) throws IOException {
        int i13 = iobyxmoadg.f24993iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 3) {
            return iobyxmoadgVar.dsvhmnatus();
        }
        if (i13 == 4) {
            return this.f24991zoijcleaow.iobyxmoadg(iobyxmoadgVar);
        }
        if (i13 == 5) {
            return Boolean.valueOf(iobyxmoadgVar.cqumvgiudr());
        }
        if (i13 == 6) {
            iobyxmoadgVar.wwaezpbzkn();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + zoijcleaowVar);
    }

    private Object nufgyqmvbu(ce.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar) throws IOException {
        int i13 = iobyxmoadg.f24993iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            iobyxmoadgVar.iobyxmoadg();
            return new ArrayList();
        }
        if (i13 != 2) {
            return null;
        }
        iobyxmoadgVar.wkgbmnqykc();
        return new lqeggnwhkg();
    }

    @Override // com.google.gson.TypeAdapter
    public void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, Object obj) throws IOException {
        if (obj == null) {
            ppxfxbqfkfVar.jyumaefscl();
            return;
        }
        TypeAdapter typeAdapterAgtfadlqog = this.f24990iobyxmoadg.agtfadlqog(obj.getClass());
        if (!(typeAdapterAgtfadlqog instanceof ObjectTypeAdapter)) {
            typeAdapterAgtfadlqog.wkgbmnqykc(ppxfxbqfkfVar, obj);
        } else {
            ppxfxbqfkfVar.nufgyqmvbu();
            ppxfxbqfkfVar.draadjrbmk();
        }
    }

    @Override // com.google.gson.TypeAdapter
    public Object zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
        zoijcleaow zoijcleaowVarKegysxyocb = iobyxmoadgVar.kegysxyocb();
        Object objNufgyqmvbu = nufgyqmvbu(iobyxmoadgVar, zoijcleaowVarKegysxyocb);
        if (objNufgyqmvbu == null) {
            return lqeggnwhkg(iobyxmoadgVar, zoijcleaowVarKegysxyocb);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (iobyxmoadgVar.vdvldrhtss()) {
                String strIstkbnxepw = objNufgyqmvbu instanceof Map ? iobyxmoadgVar.istkbnxepw() : null;
                zoijcleaow zoijcleaowVarKegysxyocb2 = iobyxmoadgVar.kegysxyocb();
                Object objNufgyqmvbu2 = nufgyqmvbu(iobyxmoadgVar, zoijcleaowVarKegysxyocb2);
                boolean z13 = objNufgyqmvbu2 != null;
                if (objNufgyqmvbu2 == null) {
                    objNufgyqmvbu2 = lqeggnwhkg(iobyxmoadgVar, zoijcleaowVarKegysxyocb2);
                }
                if (objNufgyqmvbu instanceof List) {
                    ((List) objNufgyqmvbu).add(objNufgyqmvbu2);
                } else {
                    ((Map) objNufgyqmvbu).put(strIstkbnxepw, objNufgyqmvbu2);
                }
                if (z13) {
                    arrayDeque.addLast(objNufgyqmvbu);
                    objNufgyqmvbu = objNufgyqmvbu2;
                }
            } else {
                if (objNufgyqmvbu instanceof List) {
                    iobyxmoadgVar.btonecajqb();
                } else {
                    iobyxmoadgVar.draadjrbmk();
                }
                if (arrayDeque.isEmpty()) {
                    return objNufgyqmvbu;
                }
                objNufgyqmvbu = arrayDeque.removeLast();
            }
        }
    }

    private ObjectTypeAdapter(Gson gson, rgvfuqvkyq rgvfuqvkyqVar) {
        this.f24990iobyxmoadg = gson;
        this.f24991zoijcleaow = rgvfuqvkyqVar;
    }
}
