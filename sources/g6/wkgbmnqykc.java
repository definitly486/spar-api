package g6;

import android.net.NetworkRequest;
import android.net.Uri;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.ikoacuggdj;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final zoijcleaow f36461btonecajqb = new zoijcleaow(null);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final wkgbmnqykc f36462gtknphoqwx = new wkgbmnqykc(null, false, false, false, 15, null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final Set f36463dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f36464eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f36465gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jyumaefscl f36466iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final long f36467lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final long f36468nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f36469ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f36470wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final q6.lereixgezr f36471zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f36473eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f36474gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f36475iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f36480zoijcleaow;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private q6.lereixgezr f36478ppxfxbqfkf = new q6.lereixgezr(null, 1, null);

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private jyumaefscl f36479wkgbmnqykc = jyumaefscl.NOT_REQUIRED;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private long f36476lqeggnwhkg = -1;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private long f36477nufgyqmvbu = -1;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private Set f36472dxjokdxxww = new LinkedHashSet();

        public final wkgbmnqykc iobyxmoadg() {
            Set setR = hg.jyumaefscl.r(this.f36472dxjokdxxww);
            return new wkgbmnqykc(this.f36478ppxfxbqfkf, this.f36479wkgbmnqykc, this.f36475iobyxmoadg, this.f36480zoijcleaow, this.f36473eablkybsjg, this.f36474gxszxtbevo, this.f36476lqeggnwhkg, this.f36477nufgyqmvbu, setR);
        }

        public final iobyxmoadg ppxfxbqfkf(boolean z13) {
            this.f36473eablkybsjg = z13;
            return this;
        }

        public final iobyxmoadg wkgbmnqykc(boolean z13) {
            this.f36475iobyxmoadg = z13;
            return this;
        }

        public final iobyxmoadg zoijcleaow(jyumaefscl networkType) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkType, "networkType");
            this.f36479wkgbmnqykc = networkType;
            this.f36478ppxfxbqfkf = new q6.lereixgezr(null, 1, null);
            return this;
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Uri f36481iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f36482zoijcleaow;

        public ppxfxbqfkf(Uri uri, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uri, "uri");
            this.f36481iobyxmoadg = uri;
            this.f36482zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkf.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f36481iobyxmoadg, ppxfxbqfkfVar.f36481iobyxmoadg) && this.f36482zoijcleaow == ppxfxbqfkfVar.f36482zoijcleaow;
        }

        public int hashCode() {
            return (this.f36481iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f36482zoijcleaow);
        }

        public final Uri iobyxmoadg() {
            return this.f36481iobyxmoadg;
        }

        public final boolean zoijcleaow() {
            return this.f36482zoijcleaow;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public /* synthetic */ wkgbmnqykc(jyumaefscl jyumaefsclVar, boolean z13, boolean z14, boolean z15, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jyumaefscl.NOT_REQUIRED : jyumaefsclVar, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15);
    }

    public final boolean btonecajqb() {
        return this.f36470wkgbmnqykc;
    }

    public final boolean dxjokdxxww() {
        return this.f36469ppxfxbqfkf;
    }

    public final q6.lereixgezr eablkybsjg() {
        return this.f36471zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykc.class, obj.getClass())) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        if (this.f36469ppxfxbqfkf == wkgbmnqykcVar.f36469ppxfxbqfkf && this.f36470wkgbmnqykc == wkgbmnqykcVar.f36470wkgbmnqykc && this.f36464eablkybsjg == wkgbmnqykcVar.f36464eablkybsjg && this.f36465gxszxtbevo == wkgbmnqykcVar.f36465gxszxtbevo && this.f36467lqeggnwhkg == wkgbmnqykcVar.f36467lqeggnwhkg && this.f36468nufgyqmvbu == wkgbmnqykcVar.f36468nufgyqmvbu && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykc(), wkgbmnqykcVar.wkgbmnqykc()) && this.f36466iobyxmoadg == wkgbmnqykcVar.f36466iobyxmoadg) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f36463dxjokdxxww, wkgbmnqykcVar.f36463dxjokdxxww);
        }
        return false;
    }

    public final boolean gtknphoqwx() {
        return this.f36465gxszxtbevo;
    }

    public final jyumaefscl gxszxtbevo() {
        return this.f36466iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f36466iobyxmoadg.hashCode() * 31) + (this.f36469ppxfxbqfkf ? 1 : 0)) * 31) + (this.f36470wkgbmnqykc ? 1 : 0)) * 31) + (this.f36464eablkybsjg ? 1 : 0)) * 31) + (this.f36465gxszxtbevo ? 1 : 0)) * 31;
        long j13 = this.f36467lqeggnwhkg;
        int i13 = (iHashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f36468nufgyqmvbu;
        int iHashCode2 = (((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f36463dxjokdxxww.hashCode()) * 31;
        NetworkRequest networkRequestWkgbmnqykc = wkgbmnqykc();
        return iHashCode2 + (networkRequestWkgbmnqykc != null ? networkRequestWkgbmnqykc.hashCode() : 0);
    }

    public final long iobyxmoadg() {
        return this.f36468nufgyqmvbu;
    }

    public final boolean lqeggnwhkg() {
        return !this.f36463dxjokdxxww.isEmpty();
    }

    public final boolean nufgyqmvbu() {
        return this.f36464eablkybsjg;
    }

    public final Set ppxfxbqfkf() {
        return this.f36463dxjokdxxww;
    }

    public String toString() {
        return "Constraints{requiredNetworkType=" + this.f36466iobyxmoadg + ", requiresCharging=" + this.f36469ppxfxbqfkf + ", requiresDeviceIdle=" + this.f36470wkgbmnqykc + ", requiresBatteryNotLow=" + this.f36464eablkybsjg + ", requiresStorageNotLow=" + this.f36465gxszxtbevo + ", contentTriggerUpdateDelayMillis=" + this.f36467lqeggnwhkg + ", contentTriggerMaxDelayMillis=" + this.f36468nufgyqmvbu + ", contentUriTriggers=" + this.f36463dxjokdxxww + ", }";
    }

    public final NetworkRequest wkgbmnqykc() {
        return this.f36471zoijcleaow.zoijcleaow();
    }

    public final long zoijcleaow() {
        return this.f36467lqeggnwhkg;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(jyumaefscl requiredNetworkType, boolean z13, boolean z14, boolean z15) {
        this(requiredNetworkType, z13, false, z14, z15);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(requiredNetworkType, "requiredNetworkType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(jyumaefscl requiredNetworkType, boolean z13, boolean z14, boolean z15, boolean z16) {
        this(requiredNetworkType, z13, z14, z15, z16, -1L, 0L, null, 192, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ wkgbmnqykc(jyumaefscl jyumaefsclVar, boolean z13, boolean z14, boolean z15, boolean z16, long j13, long j14, Set set, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jyumaefscl.NOT_REQUIRED : jyumaefsclVar, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15, (i13 & 16) == 0 ? z16 : false, (i13 & 32) != 0 ? -1L : j13, (i13 & 64) == 0 ? j14 : -1L, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ikoacuggdj.eablkybsjg() : set);
    }

    public wkgbmnqykc(jyumaefscl requiredNetworkType, boolean z13, boolean z14, boolean z15, boolean z16, long j13, long j14, Set contentUriTriggers) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(requiredNetworkType, "requiredNetworkType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(contentUriTriggers, "contentUriTriggers");
        this.f36471zoijcleaow = new q6.lereixgezr(null, 1, null);
        this.f36466iobyxmoadg = requiredNetworkType;
        this.f36469ppxfxbqfkf = z13;
        this.f36470wkgbmnqykc = z14;
        this.f36464eablkybsjg = z15;
        this.f36465gxszxtbevo = z16;
        this.f36467lqeggnwhkg = j13;
        this.f36468nufgyqmvbu = j14;
        this.f36463dxjokdxxww = contentUriTriggers;
    }

    public wkgbmnqykc(q6.lereixgezr requiredNetworkRequestCompat, jyumaefscl requiredNetworkType, boolean z13, boolean z14, boolean z15, boolean z16, long j13, long j14, Set contentUriTriggers) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(requiredNetworkType, "requiredNetworkType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(contentUriTriggers, "contentUriTriggers");
        this.f36471zoijcleaow = requiredNetworkRequestCompat;
        this.f36466iobyxmoadg = requiredNetworkType;
        this.f36469ppxfxbqfkf = z13;
        this.f36470wkgbmnqykc = z14;
        this.f36464eablkybsjg = z15;
        this.f36465gxszxtbevo = z16;
        this.f36467lqeggnwhkg = j13;
        this.f36468nufgyqmvbu = j14;
        this.f36463dxjokdxxww = contentUriTriggers;
    }

    public wkgbmnqykc(wkgbmnqykc other) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        this.f36469ppxfxbqfkf = other.f36469ppxfxbqfkf;
        this.f36470wkgbmnqykc = other.f36470wkgbmnqykc;
        this.f36471zoijcleaow = other.f36471zoijcleaow;
        this.f36466iobyxmoadg = other.f36466iobyxmoadg;
        this.f36464eablkybsjg = other.f36464eablkybsjg;
        this.f36465gxszxtbevo = other.f36465gxszxtbevo;
        this.f36463dxjokdxxww = other.f36463dxjokdxxww;
        this.f36467lqeggnwhkg = other.f36467lqeggnwhkg;
        this.f36468nufgyqmvbu = other.f36468nufgyqmvbu;
    }
}
