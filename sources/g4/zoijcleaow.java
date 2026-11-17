package g4;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import v2.jyumaefscl;
import v2.yggfygwlhe;
import y2.kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements jyumaefscl.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final boolean f36179eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final int f36180gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f36181iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f36182ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final String f36183wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f36184zoijcleaow;

    public zoijcleaow(int i13, String str, String str2, String str3, boolean z13, int i14) {
        y2.iobyxmoadg.iobyxmoadg(i14 == -1 || i14 > 0);
        this.f36181iobyxmoadg = i13;
        this.f36184zoijcleaow = str;
        this.f36182ppxfxbqfkf = str2;
        this.f36183wkgbmnqykc = str3;
        this.f36179eablkybsjg = z13;
        this.f36180gxszxtbevo = i14;
    }

    public static zoijcleaow wkgbmnqykc(Map map) {
        boolean z13;
        int i13;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i14;
        List list = (List) map.get("icy-br");
        boolean z14 = true;
        int i15 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i14 = Integer.parseInt(str4) * 1000;
                if (i14 > 0) {
                    z13 = true;
                } else {
                    try {
                        kcexrzcfyt.nufgyqmvbu("IcyHeaders", "Invalid bitrate: " + str4);
                        z13 = false;
                        i14 = -1;
                    } catch (NumberFormatException unused) {
                        kcexrzcfyt.nufgyqmvbu("IcyHeaders", "Invalid bitrate header: " + str4);
                        z13 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i14 = -1;
            }
            i13 = i14;
        } else {
            z13 = false;
            i13 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z13 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z13 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z13 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z13 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i16 = Integer.parseInt(str5);
                if (i16 > 0) {
                    i15 = i16;
                } else {
                    try {
                        kcexrzcfyt.nufgyqmvbu("IcyHeaders", "Invalid metadata interval: " + str5);
                        z14 = z13;
                    } catch (NumberFormatException unused3) {
                        i15 = i16;
                        kcexrzcfyt.nufgyqmvbu("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z13 = z14;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z13) {
            return new zoijcleaow(i13, str, str2, str3, zEquals, i15);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zoijcleaow.class != obj.getClass()) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f36181iobyxmoadg == zoijcleaowVar.f36181iobyxmoadg && Objects.equals(this.f36184zoijcleaow, zoijcleaowVar.f36184zoijcleaow) && Objects.equals(this.f36182ppxfxbqfkf, zoijcleaowVar.f36182ppxfxbqfkf) && Objects.equals(this.f36183wkgbmnqykc, zoijcleaowVar.f36183wkgbmnqykc) && this.f36179eablkybsjg == zoijcleaowVar.f36179eablkybsjg && this.f36180gxszxtbevo == zoijcleaowVar.f36180gxszxtbevo;
    }

    public int hashCode() {
        int i13 = (527 + this.f36181iobyxmoadg) * 31;
        String str = this.f36184zoijcleaow;
        int iHashCode = (i13 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36182ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36183wkgbmnqykc;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f36179eablkybsjg ? 1 : 0)) * 31) + this.f36180gxszxtbevo;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f36182ppxfxbqfkf + "\", genre=\"" + this.f36184zoijcleaow + "\", bitrate=" + this.f36181iobyxmoadg + ", metadataInterval=" + this.f36180gxszxtbevo;
    }

    @Override // v2.jyumaefscl.iobyxmoadg
    public void zoijcleaow(yggfygwlhe.zoijcleaow zoijcleaowVar) {
        String str = this.f36182ppxfxbqfkf;
        if (str != null) {
            zoijcleaowVar.sflfametgt(str);
        }
        String str2 = this.f36184zoijcleaow;
        if (str2 != null) {
            zoijcleaowVar.ikoacuggdj(str2);
        }
    }
}
