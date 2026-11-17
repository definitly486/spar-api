package kr0;

import hg.agtfadlqog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yp1.zoijcleaow f60448iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow[] f60449zoijcleaow;

    public iobyxmoadg(yp1.zoijcleaow crashLogger, zoijcleaow... customLoggers) {
        zdlpuopuiu.btonecajqb(crashLogger, "crashLogger");
        zdlpuopuiu.btonecajqb(customLoggers, "customLoggers");
        this.f60448iobyxmoadg = crashLogger;
        this.f60449zoijcleaow = customLoggers;
        jc2.iobyxmoadg.f51100iobyxmoadg.ojitshcjhn(new jc2.iobyxmoadg.C1098iobyxmoadg());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    private final void ppxfxbqfkf(Throwable th2, List list) {
        CrashlyticsKey[] crashlyticsKeyArr;
        boolean z13 = th2 instanceof CancellationException;
        if (th2 == null || z13) {
            return;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof CrashlyticsKey) {
                    arrayList.add(obj);
                }
            }
            crashlyticsKeyArr = (CrashlyticsKey[]) arrayList.toArray(new CrashlyticsKey[0]);
            if (crashlyticsKeyArr == null) {
                crashlyticsKeyArr = new CrashlyticsKey[0];
            }
        } else {
            crashlyticsKeyArr = new CrashlyticsKey[0];
        }
        this.f60448iobyxmoadg.iobyxmoadg(th2, (CrashlyticsKey[]) Arrays.copyOf(crashlyticsKeyArr, crashlyticsKeyArr.length));
    }

    @Override // kr0.ppxfxbqfkf
    public void iobyxmoadg(String tag, String message, boolean z13) {
        zdlpuopuiu.btonecajqb(tag, "tag");
        zdlpuopuiu.btonecajqb(message, "message");
        jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq(tag).iobyxmoadg(message, new Object[0]);
        if (z13) {
            zoijcleaow[] zoijcleaowVarArr = this.f60449zoijcleaow;
            if (zoijcleaowVarArr.length == 0) {
                return;
            }
            for (zoijcleaow zoijcleaowVar : zoijcleaowVarArr) {
                zoijcleaowVar.iobyxmoadg(tag, message);
            }
        }
    }

    @Override // kr0.ppxfxbqfkf
    public void zoijcleaow(Throwable e13, CrashlyticsKey... keys) {
        zdlpuopuiu.btonecajqb(e13, "e");
        zdlpuopuiu.btonecajqb(keys, "keys");
        jc2.iobyxmoadg.f51100iobyxmoadg.ppxfxbqfkf(e13);
        ppxfxbqfkf(e13, agtfadlqog.i(keys));
        zoijcleaow[] zoijcleaowVarArr = this.f60449zoijcleaow;
        if (zoijcleaowVarArr.length == 0) {
            return;
        }
        for (zoijcleaow zoijcleaowVar : zoijcleaowVarArr) {
            zoijcleaowVar.ppxfxbqfkf(e13);
        }
    }
}
