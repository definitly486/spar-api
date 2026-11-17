package t6;

/* JADX INFO: loaded from: classes2.dex */
final class g0 implements opjhrmiecq {
    g0() {
    }

    private boolean eablkybsjg(int i13) {
        return i13 >= 100 && i13 <= 999;
    }

    private boolean gxszxtbevo(wflxmlrfwp wflxmlrfwpVar, boolean z13, boolean z14) {
        if (wflxmlrfwpVar.oxmwwwfdhm() <= 0 || wflxmlrfwpVar.iwizpuwonk() <= 0) {
            return false;
        }
        return (!z13 || eablkybsjg(wkgbmnqykc(wflxmlrfwpVar.gtknphoqwx()))) && (!z14 || ppxfxbqfkf(wkgbmnqykc(wflxmlrfwpVar.esjtqupxsv())));
    }

    private boolean ppxfxbqfkf(int i13) {
        return i13 >= 0 && i13 <= 999;
    }

    private int wkgbmnqykc(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    private boolean zoijcleaow(int i13) {
        return i13 >= 0 && i13 <= 32767;
    }

    @Override // t6.opjhrmiecq
    public boolean iobyxmoadg(wflxmlrfwp wflxmlrfwpVar) {
        String strZoijcleaow = wflxmlrfwpVar.zoijcleaow();
        strZoijcleaow.hashCode();
        switch (strZoijcleaow) {
            case "NR":
            case "GSM":
            case "LTE":
            case "UMTS":
            case "TD-SCDMA":
                return gxszxtbevo(wflxmlrfwpVar, true, true);
            case "CDMA":
                return gxszxtbevo(wflxmlrfwpVar, false, false) && zoijcleaow(wkgbmnqykc(wflxmlrfwpVar.gtknphoqwx()));
            default:
                return false;
        }
    }
}
