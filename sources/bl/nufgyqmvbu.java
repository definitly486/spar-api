package bl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Long f16724eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Long f16725gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f16726iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Long f16727lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Map f16728nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final esjtqupxsv f16729ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Long f16730wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f16731zoijcleaow;

    public nufgyqmvbu(boolean z13, boolean z14, esjtqupxsv esjtqupxsvVar, Long l13, Long l14, Long l15, Long l16, Map extras) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
        this.f16726iobyxmoadg = z13;
        this.f16731zoijcleaow = z14;
        this.f16729ppxfxbqfkf = esjtqupxsvVar;
        this.f16730wkgbmnqykc = l13;
        this.f16724eablkybsjg = l14;
        this.f16725gxszxtbevo = l15;
        this.f16727lqeggnwhkg = l16;
        this.f16728nufgyqmvbu = tzroggbefp.yggfygwlhe(extras);
    }

    public final esjtqupxsv eablkybsjg() {
        return this.f16729ppxfxbqfkf;
    }

    public final boolean gxszxtbevo() {
        return this.f16731zoijcleaow;
    }

    public final nufgyqmvbu iobyxmoadg(boolean z13, boolean z14, esjtqupxsv esjtqupxsvVar, Long l13, Long l14, Long l15, Long l16, Map extras) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
        return new nufgyqmvbu(z13, z14, esjtqupxsvVar, l13, l14, l15, l16, extras);
    }

    public final boolean lqeggnwhkg() {
        return this.f16726iobyxmoadg;
    }

    public final Long ppxfxbqfkf() {
        return this.f16725gxszxtbevo;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f16726iobyxmoadg) {
            arrayList.add("isRegularFile");
        }
        if (this.f16731zoijcleaow) {
            arrayList.add("isDirectory");
        }
        if (this.f16730wkgbmnqykc != null) {
            arrayList.add("byteCount=" + this.f16730wkgbmnqykc);
        }
        if (this.f16724eablkybsjg != null) {
            arrayList.add("createdAt=" + this.f16724eablkybsjg);
        }
        if (this.f16725gxszxtbevo != null) {
            arrayList.add("lastModifiedAt=" + this.f16725gxszxtbevo);
        }
        if (this.f16727lqeggnwhkg != null) {
            arrayList.add("lastAccessedAt=" + this.f16727lqeggnwhkg);
        }
        if (!this.f16728nufgyqmvbu.isEmpty()) {
            arrayList.add("extras=" + this.f16728nufgyqmvbu);
        }
        return hg.jyumaefscl.iwxlajgraz(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public final Long wkgbmnqykc() {
        return this.f16730wkgbmnqykc;
    }

    public /* synthetic */ nufgyqmvbu(boolean z13, boolean z14, esjtqupxsv esjtqupxsvVar, Long l13, Long l14, Long l15, Long l16, Map map, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) == 0 ? z14 : false, (i13 & 4) != 0 ? null : esjtqupxsvVar, (i13 & 8) != 0 ? null : l13, (i13 & 16) != 0 ? null : l14, (i13 & 32) != 0 ? null : l15, (i13 & 64) == 0 ? l16 : null, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tzroggbefp.dxjokdxxww() : map);
    }
}
