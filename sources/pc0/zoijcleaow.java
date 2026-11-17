package pc0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f76383dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f76384eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private String f76385gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f76386iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private String f76387lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f76388nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f76389ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f76390wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f76391zoijcleaow;

    public zoijcleaow(String id2, String title, String body, String action, String reference, String imageUrl, String dateFrom, long j13, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(body, "body");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(dateFrom, "dateFrom");
        this.f76386iobyxmoadg = id2;
        this.f76391zoijcleaow = title;
        this.f76389ppxfxbqfkf = body;
        this.f76390wkgbmnqykc = action;
        this.f76384eablkybsjg = reference;
        this.f76385gxszxtbevo = imageUrl;
        this.f76387lqeggnwhkg = dateFrom;
        this.f76388nufgyqmvbu = j13;
        this.f76383dxjokdxxww = z13;
    }

    public final String eablkybsjg() {
        return this.f76384eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f76386iobyxmoadg, zoijcleaowVar.f76386iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f76391zoijcleaow, zoijcleaowVar.f76391zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f76389ppxfxbqfkf, zoijcleaowVar.f76389ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f76390wkgbmnqykc, zoijcleaowVar.f76390wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f76384eablkybsjg, zoijcleaowVar.f76384eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f76385gxszxtbevo, zoijcleaowVar.f76385gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f76387lqeggnwhkg, zoijcleaowVar.f76387lqeggnwhkg) && this.f76388nufgyqmvbu == zoijcleaowVar.f76388nufgyqmvbu && this.f76383dxjokdxxww == zoijcleaowVar.f76383dxjokdxxww;
    }

    public final String gxszxtbevo() {
        return this.f76391zoijcleaow;
    }

    public int hashCode() {
        return (((((((((((((((this.f76386iobyxmoadg.hashCode() * 31) + this.f76391zoijcleaow.hashCode()) * 31) + this.f76389ppxfxbqfkf.hashCode()) * 31) + this.f76390wkgbmnqykc.hashCode()) * 31) + this.f76384eablkybsjg.hashCode()) * 31) + this.f76385gxszxtbevo.hashCode()) * 31) + this.f76387lqeggnwhkg.hashCode()) * 31) + Long.hashCode(this.f76388nufgyqmvbu)) * 31) + Boolean.hashCode(this.f76383dxjokdxxww);
    }

    public final String iobyxmoadg() {
        return this.f76390wkgbmnqykc;
    }

    public final boolean lqeggnwhkg() {
        return this.f76383dxjokdxxww;
    }

    public final String ppxfxbqfkf() {
        return this.f76387lqeggnwhkg;
    }

    public String toString() {
        return "NotificationUiModel(id=" + this.f76386iobyxmoadg + ", title=" + this.f76391zoijcleaow + ", body=" + this.f76389ppxfxbqfkf + ", action=" + this.f76390wkgbmnqykc + ", reference=" + this.f76384eablkybsjg + ", imageUrl=" + this.f76385gxszxtbevo + ", dateFrom=" + this.f76387lqeggnwhkg + ", time=" + this.f76388nufgyqmvbu + ", isCopyButtonVisible=" + this.f76383dxjokdxxww + ")";
    }

    public final String wkgbmnqykc() {
        return this.f76386iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f76389ppxfxbqfkf;
    }

    public /* synthetic */ zoijcleaow(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j13, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? "" : str6, (i13 & 64) == 0 ? str7 : "", (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0L : j13, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z13);
    }
}
