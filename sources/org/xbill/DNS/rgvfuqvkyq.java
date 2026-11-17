package org.xbill.DNS;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final oipsdeybqn f74498iobyxmoadg;

    private static class iobyxmoadg extends oipsdeybqn {
        public iobyxmoadg() {
            super("DClass", 2);
            nufgyqmvbu("CLASS");
        }

        @Override // org.xbill.DNS.oipsdeybqn
        public void ppxfxbqfkf(int i13) {
            rgvfuqvkyq.iobyxmoadg(i13);
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        f74498iobyxmoadg = iobyxmoadgVar;
        iobyxmoadgVar.iobyxmoadg(1, "IN");
        iobyxmoadgVar.iobyxmoadg(3, "CH");
        iobyxmoadgVar.zoijcleaow(3, "CHAOS");
        iobyxmoadgVar.iobyxmoadg(4, "HS");
        iobyxmoadgVar.zoijcleaow(4, "HESIOD");
        iobyxmoadgVar.iobyxmoadg(254, "NONE");
        iobyxmoadgVar.iobyxmoadg(KotlinVersion.MAX_COMPONENT_VALUE, "ANY");
    }

    public static void iobyxmoadg(int i13) {
        if (i13 < 0 || i13 > 65535) {
            throw new InvalidDClassException(i13);
        }
    }

    public static String zoijcleaow(int i13) {
        return f74498iobyxmoadg.wkgbmnqykc(i13);
    }
}
