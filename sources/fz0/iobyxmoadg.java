package fz0;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.draadjrbmk;
import mj.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final rgvfuqvkyq f35570iobyxmoadg = new rgvfuqvkyq("^\\d+");

    public final String iobyxmoadg(String rawBarcode) {
        List listZoijcleaow;
        zdlpuopuiu.btonecajqb(rawBarcode, "rawBarcode");
        String str = null;
        draadjrbmk draadjrbmkVarNufgyqmvbu = rgvfuqvkyq.nufgyqmvbu(this.f35570iobyxmoadg, rawBarcode, 0, 2, null);
        if (draadjrbmkVarNufgyqmvbu != null && (listZoijcleaow = draadjrbmkVarNufgyqmvbu.zoijcleaow()) != null) {
            str = (String) jyumaefscl.opjhrmiecq(listZoijcleaow);
        }
        return str == null ? "" : str;
    }
}
