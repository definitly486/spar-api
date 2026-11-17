package com.google.crypto.tink.internal;

import bb.jyumaefscl;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import nb.lereixgezr;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final lb.zoijcleaow.iobyxmoadg f23837iobyxmoadg = new zoijcleaow(null);

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f23838iobyxmoadg;

        static {
            int[] iArr = new int[lereixgezr.values().length];
            f23838iobyxmoadg = iArr;
            try {
                iArr[lereixgezr.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23838iobyxmoadg[lereixgezr.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23838iobyxmoadg[lereixgezr.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static class zoijcleaow implements lb.zoijcleaow.iobyxmoadg {
        private zoijcleaow() {
        }

        @Override // lb.zoijcleaow.iobyxmoadg
        public void iobyxmoadg(int i13, long j13) {
        }

        @Override // lb.zoijcleaow.iobyxmoadg
        public void zoijcleaow() {
        }

        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    public static lb.ppxfxbqfkf iobyxmoadg(jyumaefscl jyumaefsclVar) {
        lb.ppxfxbqfkf.zoijcleaow zoijcleaowVarIobyxmoadg = lb.ppxfxbqfkf.iobyxmoadg();
        zoijcleaowVarIobyxmoadg.wkgbmnqykc(jyumaefsclVar.wkgbmnqykc());
        Iterator it = jyumaefsclVar.ppxfxbqfkf().iterator();
        while (it.hasNext()) {
            for (jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar : (List) it.next()) {
                zoijcleaowVarIobyxmoadg.iobyxmoadg(ppxfxbqfkf(ppxfxbqfkfVar.nufgyqmvbu()), ppxfxbqfkfVar.wkgbmnqykc(), zoijcleaow(ppxfxbqfkfVar.eablkybsjg()), ppxfxbqfkfVar.gxszxtbevo().name());
            }
        }
        if (jyumaefsclVar.eablkybsjg() != null) {
            zoijcleaowVarIobyxmoadg.eablkybsjg(jyumaefsclVar.eablkybsjg().wkgbmnqykc());
        }
        try {
            return zoijcleaowVarIobyxmoadg.zoijcleaow();
        } catch (GeneralSecurityException e13) {
            throw new IllegalStateException(e13);
        }
    }

    private static bb.gtknphoqwx ppxfxbqfkf(lereixgezr lereixgezrVar) {
        int i13 = iobyxmoadg.f23838iobyxmoadg[lereixgezrVar.ordinal()];
        if (i13 == 1) {
            return bb.gtknphoqwx.f15645zoijcleaow;
        }
        if (i13 == 2) {
            return bb.gtknphoqwx.f15643ppxfxbqfkf;
        }
        if (i13 == 3) {
            return bb.gtknphoqwx.f15644wkgbmnqykc;
        }
        throw new IllegalStateException("Unknown key status");
    }

    private static String zoijcleaow(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }
}
