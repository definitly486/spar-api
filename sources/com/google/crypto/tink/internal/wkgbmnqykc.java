package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.hkdspvbjdz;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import nb.esjtqupxsv;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Class f23867iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Class f23868ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f23869zoijcleaow;

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f23870iobyxmoadg;

        /* JADX INFO: renamed from: com.google.crypto.tink.internal.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0412iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public Object f23871iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            public bb.draadjrbmk.zoijcleaow f23872zoijcleaow;

            public C0412iobyxmoadg(Object obj, bb.draadjrbmk.zoijcleaow zoijcleaowVar) {
                this.f23871iobyxmoadg = obj;
                this.f23872zoijcleaow = zoijcleaowVar;
            }
        }

        public iobyxmoadg(Class cls) {
            this.f23870iobyxmoadg = cls;
        }

        public abstract void eablkybsjg(hkdspvbjdz hkdspvbjdzVar);

        public abstract hkdspvbjdz iobyxmoadg(hkdspvbjdz hkdspvbjdzVar);

        public Map ppxfxbqfkf() {
            return Collections.emptyMap();
        }

        public abstract hkdspvbjdz wkgbmnqykc(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar);

        public final Class zoijcleaow() {
            return this.f23870iobyxmoadg;
        }
    }

    protected wkgbmnqykc(Class cls, wflxmlrfwp... wflxmlrfwpVarArr) {
        this.f23867iobyxmoadg = cls;
        HashMap map = new HashMap();
        for (wflxmlrfwp wflxmlrfwpVar : wflxmlrfwpVarArr) {
            if (map.containsKey(wflxmlrfwpVar.zoijcleaow())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + wflxmlrfwpVar.zoijcleaow().getCanonicalName());
            }
            map.put(wflxmlrfwpVar.zoijcleaow(), wflxmlrfwpVar);
        }
        if (wflxmlrfwpVarArr.length > 0) {
            this.f23868ppxfxbqfkf = wflxmlrfwpVarArr[0].zoijcleaow();
        } else {
            this.f23868ppxfxbqfkf = Void.class;
        }
        this.f23869zoijcleaow = Collections.unmodifiableMap(map);
    }

    public abstract void btonecajqb(hkdspvbjdz hkdspvbjdzVar);

    public final Set dxjokdxxww() {
        return this.f23869zoijcleaow.keySet();
    }

    public final Object eablkybsjg(hkdspvbjdz hkdspvbjdzVar, Class cls) {
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) this.f23869zoijcleaow.get(cls);
        if (wflxmlrfwpVar != null) {
            return wflxmlrfwpVar.iobyxmoadg(hkdspvbjdzVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract iobyxmoadg gxszxtbevo();

    public gb.zoijcleaow.EnumC0829zoijcleaow iobyxmoadg() {
        return gb.zoijcleaow.EnumC0829zoijcleaow.f36735zdlpuopuiu;
    }

    public abstract esjtqupxsv.ppxfxbqfkf lqeggnwhkg();

    public abstract hkdspvbjdz nufgyqmvbu(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar);

    public final Class ppxfxbqfkf() {
        return this.f23867iobyxmoadg;
    }

    public abstract String wkgbmnqykc();

    public final Class zoijcleaow() {
        return this.f23868ppxfxbqfkf;
    }
}
