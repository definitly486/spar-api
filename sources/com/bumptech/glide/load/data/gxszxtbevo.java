package com.bumptech.glide.load.data;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final eablkybsjg.iobyxmoadg f20786zoijcleaow = new iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f20787iobyxmoadg = new HashMap();

    class iobyxmoadg implements eablkybsjg.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // com.bumptech.glide.load.data.eablkybsjg.iobyxmoadg
        public Class iobyxmoadg() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.eablkybsjg.iobyxmoadg
        public eablkybsjg zoijcleaow(Object obj) {
            return new zoijcleaow(obj);
        }
    }

    private static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Object f20788iobyxmoadg;

        zoijcleaow(Object obj) {
            this.f20788iobyxmoadg = obj;
        }

        @Override // com.bumptech.glide.load.data.eablkybsjg
        public Object iobyxmoadg() {
            return this.f20788iobyxmoadg;
        }

        @Override // com.bumptech.glide.load.data.eablkybsjg
        public void zoijcleaow() {
        }
    }

    public synchronized eablkybsjg iobyxmoadg(Object obj) {
        eablkybsjg.iobyxmoadg iobyxmoadgVar;
        try {
            g9.gtknphoqwx.eablkybsjg(obj);
            iobyxmoadgVar = (eablkybsjg.iobyxmoadg) this.f20787iobyxmoadg.get(obj.getClass());
            if (iobyxmoadgVar == null) {
                for (eablkybsjg.iobyxmoadg iobyxmoadgVar2 : this.f20787iobyxmoadg.values()) {
                    if (iobyxmoadgVar2.iobyxmoadg().isAssignableFrom(obj.getClass())) {
                        iobyxmoadgVar = iobyxmoadgVar2;
                        break;
                    }
                }
            }
            if (iobyxmoadgVar == null) {
                iobyxmoadgVar = f20786zoijcleaow;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iobyxmoadgVar.zoijcleaow(obj);
    }

    public synchronized void zoijcleaow(eablkybsjg.iobyxmoadg iobyxmoadgVar) {
        this.f20787iobyxmoadg.put(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar);
    }
}
