package com.google.gson.internal;

import androidx.appcompat.app.yggfygwlhe;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.vdvldrhtss;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Excluder implements vdvldrhtss, Cloneable {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final Excluder f24953lereixgezr = new Excluder();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f24956iwizpuwonk;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private double f24959zdlpuopuiu = -1.0d;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f24958yggfygwlhe = 136;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f24957jyumaefscl = true;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private List f24954cqumvgiudr = Collections.emptyList();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private List f24955esjtqupxsv = Collections.emptyList();

    private boolean agtfadlqog(yd.wkgbmnqykc wkgbmnqykcVar, yd.eablkybsjg eablkybsjgVar) {
        return draadjrbmk(wkgbmnqykcVar) && wflxmlrfwp(eablkybsjgVar);
    }

    private boolean draadjrbmk(yd.wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar != null) {
            return this.f24959zdlpuopuiu >= wkgbmnqykcVar.value();
        }
        return true;
    }

    private boolean eablkybsjg(Class cls, boolean z13) {
        Iterator it = (z13 ? this.f24954cqumvgiudr : this.f24955esjtqupxsv).iterator();
        if (!it.hasNext()) {
            return false;
        }
        yggfygwlhe.iobyxmoadg(it.next());
        throw null;
    }

    private boolean gtknphoqwx(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean lqeggnwhkg(Class cls) {
        return (Enum.class.isAssignableFrom(cls) || gtknphoqwx(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    private boolean nufgyqmvbu(Class cls) {
        return cls.isMemberClass() && !gtknphoqwx(cls);
    }

    private boolean wflxmlrfwp(yd.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar != null) {
            return this.f24959zdlpuopuiu < eablkybsjgVar.value();
        }
        return true;
    }

    private boolean wkgbmnqykc(Class cls) {
        if (this.f24959zdlpuopuiu != -1.0d && !agtfadlqog((yd.wkgbmnqykc) cls.getAnnotation(yd.wkgbmnqykc.class), (yd.eablkybsjg) cls.getAnnotation(yd.eablkybsjg.class))) {
            return true;
        }
        if (this.f24957jyumaefscl || !nufgyqmvbu(cls)) {
            return lqeggnwhkg(cls);
        }
        return true;
    }

    public boolean gxszxtbevo(Field field, boolean z13) {
        yd.iobyxmoadg iobyxmoadgVar;
        if ((this.f24958yggfygwlhe & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f24959zdlpuopuiu != -1.0d && !agtfadlqog((yd.wkgbmnqykc) field.getAnnotation(yd.wkgbmnqykc.class), (yd.eablkybsjg) field.getAnnotation(yd.eablkybsjg.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f24956iwizpuwonk && ((iobyxmoadgVar = (yd.iobyxmoadg) field.getAnnotation(yd.iobyxmoadg.class)) == null || (!z13 ? iobyxmoadgVar.deserialize() : iobyxmoadgVar.serialize()))) {
            return true;
        }
        if ((!this.f24957jyumaefscl && nufgyqmvbu(field.getType())) || lqeggnwhkg(field.getType())) {
            return true;
        }
        List list = z13 ? this.f24954cqumvgiudr : this.f24955esjtqupxsv;
        if (list.isEmpty()) {
            return false;
        }
        new com.google.gson.iobyxmoadg(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        yggfygwlhe.iobyxmoadg(it.next());
        throw null;
    }

    @Override // com.google.gson.vdvldrhtss
    public TypeAdapter iobyxmoadg(final Gson gson, final be.iobyxmoadg iobyxmoadgVar) {
        Class clsPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        boolean zWkgbmnqykc = wkgbmnqykc(clsPpxfxbqfkf);
        final boolean z13 = zWkgbmnqykc || eablkybsjg(clsPpxfxbqfkf, true);
        final boolean z14 = zWkgbmnqykc || eablkybsjg(clsPpxfxbqfkf, false);
        if (z13 || z14) {
            return new TypeAdapter() { // from class: com.google.gson.internal.Excluder.1

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                private TypeAdapter f24962iobyxmoadg;

                private TypeAdapter eablkybsjg() {
                    TypeAdapter typeAdapter = this.f24962iobyxmoadg;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter typeAdapterOjitshcjhn = gson.ojitshcjhn(Excluder.this, iobyxmoadgVar);
                    this.f24962iobyxmoadg = typeAdapterOjitshcjhn;
                    return typeAdapterOjitshcjhn;
                }

                @Override // com.google.gson.TypeAdapter
                public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Object obj) throws IOException {
                    if (z13) {
                        ppxfxbqfkfVar.jyumaefscl();
                    } else {
                        eablkybsjg().wkgbmnqykc(ppxfxbqfkfVar, obj);
                    }
                }

                @Override // com.google.gson.TypeAdapter
                public Object zoijcleaow(ce.iobyxmoadg iobyxmoadgVar2) throws IOException {
                    if (!z14) {
                        return eablkybsjg().zoijcleaow(iobyxmoadgVar2);
                    }
                    iobyxmoadgVar2.yfnezrywwk();
                    return null;
                }
            };
        }
        return null;
    }

    public boolean ppxfxbqfkf(Class cls, boolean z13) {
        return wkgbmnqykc(cls) || eablkybsjg(cls, z13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e13) {
            throw new AssertionError(e13);
        }
    }
}
