package kr0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f60450iobyxmoadg = new wkgbmnqykc();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final List f60451ppxfxbqfkf = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static ppxfxbqfkf f60452zoijcleaow;

    private static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: kr0.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1210iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f60453iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final boolean f60454ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f60455zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1210iobyxmoadg(String tag, String message, boolean z13) {
                super(null);
                zdlpuopuiu.btonecajqb(tag, "tag");
                zdlpuopuiu.btonecajqb(message, "message");
                this.f60453iobyxmoadg = tag;
                this.f60455zoijcleaow = message;
                this.f60454ppxfxbqfkf = z13;
            }

            public final String iobyxmoadg() {
                return this.f60455zoijcleaow;
            }

            public final String ppxfxbqfkf() {
                return this.f60453iobyxmoadg;
            }

            public final boolean zoijcleaow() {
                return this.f60454ppxfxbqfkf;
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final Throwable f60456iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final CrashlyticsKey[] f60457zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public zoijcleaow(Throwable e13, CrashlyticsKey[] keys) {
                super(null);
                zdlpuopuiu.btonecajqb(e13, "e");
                zdlpuopuiu.btonecajqb(keys, "keys");
                this.f60456iobyxmoadg = e13;
                this.f60457zoijcleaow = keys;
            }

            public final Throwable iobyxmoadg() {
                return this.f60456iobyxmoadg;
            }

            public final CrashlyticsKey[] zoijcleaow() {
                return this.f60457zoijcleaow;
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    private wkgbmnqykc() {
    }

    public static /* synthetic */ void eablkybsjg(wkgbmnqykc wkgbmnqykcVar, String str, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        wkgbmnqykcVar.ppxfxbqfkf(str, z13);
    }

    private final List lqeggnwhkg(ppxfxbqfkf ppxfxbqfkfVar) {
        List<iobyxmoadg> list = f60451ppxfxbqfkf;
        for (iobyxmoadg iobyxmoadgVar : list) {
            if (iobyxmoadgVar instanceof iobyxmoadg.C1210iobyxmoadg) {
                iobyxmoadg.C1210iobyxmoadg c1210iobyxmoadg = (iobyxmoadg.C1210iobyxmoadg) iobyxmoadgVar;
                ppxfxbqfkfVar.iobyxmoadg(c1210iobyxmoadg.ppxfxbqfkf(), c1210iobyxmoadg.iobyxmoadg(), c1210iobyxmoadg.zoijcleaow());
            } else {
                if (!(iobyxmoadgVar instanceof iobyxmoadg.zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg.zoijcleaow zoijcleaowVar = (iobyxmoadg.zoijcleaow) iobyxmoadgVar;
                Throwable thIobyxmoadg = zoijcleaowVar.iobyxmoadg();
                CrashlyticsKey[] crashlyticsKeyArrZoijcleaow = zoijcleaowVar.zoijcleaow();
                ppxfxbqfkfVar.zoijcleaow(thIobyxmoadg, (CrashlyticsKey[]) Arrays.copyOf(crashlyticsKeyArrZoijcleaow, crashlyticsKeyArrZoijcleaow.length));
            }
        }
        list.clear();
        return list;
    }

    public static /* synthetic */ void wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, String str, String str2, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        wkgbmnqykcVar.zoijcleaow(str, str2, z13);
    }

    public final void gxszxtbevo(Throwable e13, CrashlyticsKey... keys) {
        zdlpuopuiu.btonecajqb(e13, "e");
        zdlpuopuiu.btonecajqb(keys, "keys");
        ppxfxbqfkf ppxfxbqfkfVar = f60452zoijcleaow;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.zoijcleaow(e13, (CrashlyticsKey[]) Arrays.copyOf(keys, keys.length));
        } else {
            f60451ppxfxbqfkf.add(new iobyxmoadg.zoijcleaow(e13, keys));
        }
    }

    public final void iobyxmoadg(ppxfxbqfkf logger) {
        zdlpuopuiu.btonecajqb(logger, "logger");
        f60452zoijcleaow = logger;
        if (f60451ppxfxbqfkf.isEmpty()) {
            return;
        }
        lqeggnwhkg(logger);
    }

    public final void ppxfxbqfkf(String message, boolean z13) {
        zdlpuopuiu.btonecajqb(message, "message");
        ppxfxbqfkf ppxfxbqfkfVar = f60452zoijcleaow;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.iobyxmoadg("MYSPAR", message, z13);
        } else {
            f60451ppxfxbqfkf.add(new iobyxmoadg.C1210iobyxmoadg("MYSPAR", message, z13));
        }
    }

    public final void zoijcleaow(String tag, String message, boolean z13) {
        zdlpuopuiu.btonecajqb(tag, "tag");
        zdlpuopuiu.btonecajqb(message, "message");
        ppxfxbqfkf ppxfxbqfkfVar = f60452zoijcleaow;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.iobyxmoadg(tag, message, z13);
        } else {
            f60451ppxfxbqfkf.add(new iobyxmoadg.C1210iobyxmoadg(tag, message, z13));
        }
    }
}
