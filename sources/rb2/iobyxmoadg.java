package rb2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import mj.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final C1847iobyxmoadg f82491gxszxtbevo = new C1847iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final rgvfuqvkyq f82492lqeggnwhkg = new rgvfuqvkyq("\\r\\n|\\r|\\n|\\t");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f82493eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f82494iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f82495ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f82496wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f82497zoijcleaow;

    /* JADX INFO: renamed from: rb2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1847iobyxmoadg {
        public /* synthetic */ C1847iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1847iobyxmoadg() {
        }
    }

    public enum zoijcleaow {
        BUSINESS("business"),
        TECHNICAL("technical"),
        SENSITIVE("sensitive");


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f82502zdlpuopuiu;

        zoijcleaow(String str) {
            this.f82502zdlpuopuiu = str;
        }

        public final String wkgbmnqykc() {
            return this.f82502zdlpuopuiu;
        }
    }

    public iobyxmoadg(String eventName, zoijcleaow eventType, String str, String str2) {
        zdlpuopuiu.btonecajqb(eventName, "eventName");
        zdlpuopuiu.btonecajqb(eventType, "eventType");
        this.f82494iobyxmoadg = eventType.wkgbmnqykc();
        this.f82497zoijcleaow = wkgbmnqykc(eventName, "unknownAction");
        this.f82495ppxfxbqfkf = eablkybsjg(this, str, null, 2, null);
        this.f82496wkgbmnqykc = eablkybsjg(this, str2, null, 2, null);
        this.f82493eablkybsjg = new LinkedHashMap();
    }

    static /* synthetic */ String eablkybsjg(iobyxmoadg iobyxmoadgVar, String str, String str2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        return iobyxmoadgVar.wkgbmnqykc(str, str2);
    }

    private final boolean ppxfxbqfkf(String str, String str2) {
        if (this.f82493eablkybsjg.size() >= 64) {
            return false;
        }
        this.f82493eablkybsjg.put(wkgbmnqykc(str, "unknownKey"), eablkybsjg(this, str2, null, 2, null));
        return true;
    }

    private final String wkgbmnqykc(String str, String str2) {
        String strRgvfuqvkyq;
        if (str == null || str.length() == 0) {
            strRgvfuqvkyq = "";
        } else {
            strRgvfuqvkyq = f82492lqeggnwhkg.rgvfuqvkyq(kcexrzcfyt.pkzmftpjix(str, '=', '-', false, 4, null), " ");
            if (strRgvfuqvkyq.length() > 256) {
                strRgvfuqvkyq = strRgvfuqvkyq.substring(0, UserVerificationMethods.USER_VERIFY_HANDPRINT);
                zdlpuopuiu.dxjokdxxww(strRgvfuqvkyq, "this as java.lang.String…ing(startIndex, endIndex)");
            }
        }
        return strRgvfuqvkyq.length() == 0 ? str2 : strRgvfuqvkyq;
    }

    private final void zoijcleaow(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return;
        }
        for (Map.Entry entry : setEntrySet) {
            if (!ppxfxbqfkf((String) entry.getKey(), (String) entry.getValue())) {
                return;
            }
        }
    }

    public final Map btonecajqb() {
        return this.f82493eablkybsjg;
    }

    public final String dxjokdxxww() {
        return this.f82496wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(iobyxmoadg.class, obj != null ? obj.getClass() : null) || hashCode() != obj.hashCode()) {
            return false;
        }
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.sber.platform.clickstream.clickstreamlite.ClickstreamEvent");
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f82497zoijcleaow, iobyxmoadgVar.f82497zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f82494iobyxmoadg, iobyxmoadgVar.f82494iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f82495ppxfxbqfkf, iobyxmoadgVar.f82495ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f82496wkgbmnqykc, iobyxmoadgVar.f82496wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f82493eablkybsjg, iobyxmoadgVar.f82493eablkybsjg);
    }

    public final String gxszxtbevo() {
        return this.f82497zoijcleaow;
    }

    public int hashCode() {
        return (((((((this.f82497zoijcleaow.hashCode() * 31) + this.f82494iobyxmoadg.hashCode()) * 31) + this.f82495ppxfxbqfkf.hashCode()) * 31) + this.f82496wkgbmnqykc.hashCode()) * 31) + this.f82493eablkybsjg.hashCode();
    }

    public final void iobyxmoadg(Map newProperties) {
        zdlpuopuiu.btonecajqb(newProperties, "newProperties");
        zoijcleaow(newProperties);
    }

    public final String lqeggnwhkg() {
        return this.f82495ppxfxbqfkf;
    }

    public final String nufgyqmvbu() {
        return this.f82494iobyxmoadg;
    }

    public String toString() {
        return "ClickstreamEvent(eventAction=" + this.f82497zoijcleaow + ", internalEventType=" + this.f82494iobyxmoadg + ", internalEventCategory=" + this.f82495ppxfxbqfkf + ", internalValue=" + this.f82496wkgbmnqykc + ", properties=" + this.f82493eablkybsjg + ')';
    }

    public /* synthetic */ iobyxmoadg(String str, zoijcleaow zoijcleaowVar, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? zoijcleaow.BUSINESS : zoijcleaowVar, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3);
    }
}
