package cl;

import bl.esjtqupxsv;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final List f19988btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final long f19989dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f19990eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f19991gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final esjtqupxsv f19992iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f19993lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Long f19994nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f19995ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f19996wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f19997zoijcleaow;

    public wkgbmnqykc(esjtqupxsv canonicalPath, boolean z13, String comment, long j13, long j14, long j15, int i13, Long l13, long j16) {
        zdlpuopuiu.btonecajqb(canonicalPath, "canonicalPath");
        zdlpuopuiu.btonecajqb(comment, "comment");
        this.f19992iobyxmoadg = canonicalPath;
        this.f19997zoijcleaow = z13;
        this.f19995ppxfxbqfkf = comment;
        this.f19996wkgbmnqykc = j13;
        this.f19990eablkybsjg = j14;
        this.f19991gxszxtbevo = j15;
        this.f19993lqeggnwhkg = i13;
        this.f19994nufgyqmvbu = l13;
        this.f19989dxjokdxxww = j16;
        this.f19988btonecajqb = new ArrayList();
    }

    public final Long eablkybsjg() {
        return this.f19994nufgyqmvbu;
    }

    public final long gxszxtbevo() {
        return this.f19989dxjokdxxww;
    }

    public final esjtqupxsv iobyxmoadg() {
        return this.f19992iobyxmoadg;
    }

    public final long lqeggnwhkg() {
        return this.f19991gxszxtbevo;
    }

    public final boolean nufgyqmvbu() {
        return this.f19997zoijcleaow;
    }

    public final long ppxfxbqfkf() {
        return this.f19990eablkybsjg;
    }

    public final int wkgbmnqykc() {
        return this.f19993lqeggnwhkg;
    }

    public final List zoijcleaow() {
        return this.f19988btonecajqb;
    }

    public /* synthetic */ wkgbmnqykc(esjtqupxsv esjtqupxsvVar, boolean z13, String str, long j13, long j14, long j15, int i13, Long l13, long j16, int i14, gtknphoqwx gtknphoqwxVar) {
        this(esjtqupxsvVar, (i14 & 2) != 0 ? false : z13, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? -1L : j13, (i14 & 16) != 0 ? -1L : j14, (i14 & 32) != 0 ? -1L : j15, (i14 & 64) != 0 ? -1 : i13, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : l13, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? j16 : -1L);
    }
}
