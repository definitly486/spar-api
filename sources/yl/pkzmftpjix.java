package yl;

/* JADX INFO: loaded from: classes3.dex */
class pkzmftpjix {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f125801iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private StringBuilder f125802zoijcleaow;

    pkzmftpjix() {
    }

    private void wkgbmnqykc() {
        StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
        this.f125802zoijcleaow = sbEablkybsjg;
        sbEablkybsjg.append(this.f125801iobyxmoadg);
        this.f125801iobyxmoadg = null;
    }

    boolean eablkybsjg() {
        return (this.f125802zoijcleaow == null && this.f125801iobyxmoadg == null) ? false : true;
    }

    void gxszxtbevo() {
        StringBuilder sb3 = this.f125802zoijcleaow;
        if (sb3 != null) {
            wl.kcexrzcfyt.lereixgezr(sb3);
            this.f125802zoijcleaow = null;
        }
        this.f125801iobyxmoadg = null;
    }

    void iobyxmoadg(char c13) {
        StringBuilder sb3 = this.f125802zoijcleaow;
        if (sb3 != null) {
            sb3.append(c13);
        } else if (this.f125801iobyxmoadg == null) {
            this.f125801iobyxmoadg = String.valueOf(c13);
        } else {
            wkgbmnqykc();
            this.f125802zoijcleaow.append(c13);
        }
    }

    void lqeggnwhkg(String str) {
        gxszxtbevo();
        this.f125801iobyxmoadg = str;
    }

    String nufgyqmvbu() {
        StringBuilder sb3 = this.f125802zoijcleaow;
        if (sb3 == null) {
            String str = this.f125801iobyxmoadg;
            return str != null ? str : "";
        }
        this.f125801iobyxmoadg = sb3.toString();
        wl.kcexrzcfyt.esjtqupxsv(this.f125802zoijcleaow);
        this.f125802zoijcleaow = null;
        return this.f125801iobyxmoadg;
    }

    void ppxfxbqfkf(int i13) {
        StringBuilder sb3 = this.f125802zoijcleaow;
        if (sb3 != null) {
            sb3.appendCodePoint(i13);
        } else if (this.f125801iobyxmoadg == null) {
            this.f125801iobyxmoadg = String.valueOf(Character.toChars(i13));
        } else {
            wkgbmnqykc();
            this.f125802zoijcleaow.appendCodePoint(i13);
        }
    }

    public String toString() {
        StringBuilder sb3 = this.f125802zoijcleaow;
        if (sb3 != null) {
            return sb3.toString();
        }
        String str = this.f125801iobyxmoadg;
        return str != null ? str : "";
    }

    void zoijcleaow(String str) {
        StringBuilder sb3 = this.f125802zoijcleaow;
        if (sb3 != null) {
            sb3.append(str);
        } else if (this.f125801iobyxmoadg == null) {
            this.f125801iobyxmoadg = str;
        } else {
            wkgbmnqykc();
            this.f125802zoijcleaow.append(str);
        }
    }
}
