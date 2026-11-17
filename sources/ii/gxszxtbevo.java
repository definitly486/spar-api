package ii;

import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo implements Comparable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f44447yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f44448zdlpuopuiu;

    private gxszxtbevo(String str, boolean z13) {
        if (str == null) {
            iobyxmoadg(0);
        }
        this.f44448zdlpuopuiu = str;
        this.f44447yggfygwlhe = z13;
    }

    public static gxszxtbevo dxjokdxxww(String str) {
        if (str == null) {
            iobyxmoadg(8);
        }
        if (str.startsWith("<")) {
            return new gxszxtbevo(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public static gxszxtbevo eablkybsjg(String str) {
        if (str == null) {
            iobyxmoadg(9);
        }
        return str.startsWith("<") ? dxjokdxxww(str) : gxszxtbevo(str);
    }

    public static gxszxtbevo gxszxtbevo(String str) {
        if (str == null) {
            iobyxmoadg(5);
        }
        return new gxszxtbevo(str, false);
    }

    private static /* synthetic */ void iobyxmoadg(int i13) {
        String str = (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? 2 : 3];
        if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = ExternalMetricsManagerImpl.NAME;
        }
        if (i13 == 1) {
            objArr[1] = "asString";
        } else if (i13 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i13 == 3 || i13 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean nufgyqmvbu(String str) {
        if (str == null) {
            iobyxmoadg(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f44447yggfygwlhe == gxszxtbevoVar.f44447yggfygwlhe && this.f44448zdlpuopuiu.equals(gxszxtbevoVar.f44448zdlpuopuiu);
    }

    public int hashCode() {
        return (this.f44448zdlpuopuiu.hashCode() * 31) + (this.f44447yggfygwlhe ? 1 : 0);
    }

    public boolean lqeggnwhkg() {
        return this.f44447yggfygwlhe;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public int compareTo(gxszxtbevo gxszxtbevoVar) {
        return this.f44448zdlpuopuiu.compareTo(gxszxtbevoVar.f44448zdlpuopuiu);
    }

    public String toString() {
        return this.f44448zdlpuopuiu;
    }

    public String wkgbmnqykc() {
        if (this.f44447yggfygwlhe) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strZoijcleaow = zoijcleaow();
        if (strZoijcleaow == null) {
            iobyxmoadg(2);
        }
        return strZoijcleaow;
    }

    public String zoijcleaow() {
        String str = this.f44448zdlpuopuiu;
        if (str == null) {
            iobyxmoadg(1);
        }
        return str;
    }
}
