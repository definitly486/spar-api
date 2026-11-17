package bz;

import android.content.Context;
import android.telecom.TelecomManager;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class i0 extends metgxyhuhe implements t6.gxszxtbevo, lrnfpwlwnk.iobyxmoadg, wizcaqwiak.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final long f17436zdlpuopuiu = TimeUnit.MINUTES.toMillis(15);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private String f17437agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private Date f17438btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f17439draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private lrnfpwlwnk f17440dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17441eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private Date f17442gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final wizcaqwiak f17443gxszxtbevo;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private boolean f17444kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final t6.hcddaimhww f17445lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final TelecomManager f17446nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f17447ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f17448oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f17449rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f17450vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f17451wflxmlrfwp;

    class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ int f17452iobyxmoadg;

        iobyxmoadg(int i13) {
            this.f17452iobyxmoadg = i13;
        }

        private boolean wkgbmnqykc() {
            return this.f17452iobyxmoadg == 0;
        }

        @Override // bz.i0.ppxfxbqfkf
        public long eablkybsjg() {
            if (wkgbmnqykc() || i0.this.f17438btonecajqb == null) {
                return 0L;
            }
            return ((i0.this.f17442gtknphoqwx == null ? new Date() : i0.this.f17442gtknphoqwx).getTime() - i0.this.f17438btonecajqb.getTime()) / TimeUnit.SECONDS.toMillis(1L);
        }

        @Override // bz.i0.ppxfxbqfkf
        public boolean gxszxtbevo() {
            return i0.this.f17447ojitshcjhn;
        }

        @Override // bz.i0.ppxfxbqfkf
        public int iobyxmoadg() {
            return this.f17452iobyxmoadg;
        }

        @Override // bz.i0.ppxfxbqfkf
        public int ppxfxbqfkf() {
            if (wkgbmnqykc()) {
                return 0;
            }
            return i0.this.f17451wflxmlrfwp;
        }

        @Override // bz.i0.ppxfxbqfkf
        public String zoijcleaow() {
            return wkgbmnqykc() ? CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE : i0.this.f17437agtfadlqog;
        }
    }

    interface ppxfxbqfkf {
        long eablkybsjg();

        boolean gxszxtbevo();

        int iobyxmoadg();

        int ppxfxbqfkf();

        String zoijcleaow();
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f17454iobyxmoadg;

        static {
            int[] iArr = new int[wizcaqwiak.zoijcleaow.values().length];
            f17454iobyxmoadg = iArr;
            try {
                iArr[wizcaqwiak.zoijcleaow.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17454iobyxmoadg[wizcaqwiak.zoijcleaow.Ringtone.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17454iobyxmoadg[wizcaqwiak.zoijcleaow.InCall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17454iobyxmoadg[wizcaqwiak.zoijcleaow.InVoipCall.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17454iobyxmoadg[wizcaqwiak.zoijcleaow.CallScreen.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    i0(Context context, TelecomManager telecomManager, wizcaqwiak wizcaqwiakVar, t6.hcddaimhww hcddaimhwwVar) {
        super(kc2.lqeggnwhkg.PhoneLastCall);
        this.f17439draadjrbmk = 0;
        this.f17451wflxmlrfwp = 0;
        this.f17437agtfadlqog = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
        this.f17449rgvfuqvkyq = true;
        this.f17441eablkybsjg = context;
        this.f17446nufgyqmvbu = telecomManager;
        this.f17443gxszxtbevo = wizcaqwiakVar;
        this.f17445lqeggnwhkg = hcddaimhwwVar;
    }

    private boolean cdpycssgdh() {
        return t6.skhdrjzrfn.iobyxmoadg(this.f17441eablkybsjg, t6.ppxfxbqfkf.READ_PHONE_STATE.iobyxmoadg());
    }

    private void cllcsxoeiz() {
        this.f17443gxszxtbevo.wkgbmnqykc(this);
    }

    private boolean hkdspvbjdz() {
        if (cdpycssgdh()) {
            return this.f17446nufgyqmvbu.isInCall();
        }
        return false;
    }

    private boolean jpowsppfya() {
        return this.f17438btonecajqb != null && System.currentTimeMillis() < this.f17438btonecajqb.getTime() + f17436zdlpuopuiu;
    }

    private void mbcevpiqjq(String str, int i13, Date date, Date date2) {
        this.f17437agtfadlqog = str;
        this.f17439draadjrbmk = 0;
        this.f17451wflxmlrfwp = i13;
        this.f17438btonecajqb = date;
        this.f17442gtknphoqwx = date2;
    }

    private void ntlheqmsrt(String str, Date date) {
        this.f17437agtfadlqog = str;
        this.f17439draadjrbmk = 2;
        this.f17451wflxmlrfwp = 1;
        this.f17438btonecajqb = date;
        this.f17442gtknphoqwx = null;
        this.f17447ojitshcjhn = true;
    }

    private void pkzmftpjix(String str, Date date) {
        this.f17437agtfadlqog = str;
        this.f17439draadjrbmk = 1;
        this.f17451wflxmlrfwp = 1;
        this.f17438btonecajqb = date;
        this.f17442gtknphoqwx = null;
        this.f17447ojitshcjhn = false;
    }

    private void stevsuqkhv() {
        lrnfpwlwnk lrnfpwlwnkVar = this.f17440dxjokdxxww;
        if (lrnfpwlwnkVar != null) {
            this.f17441eablkybsjg.unregisterReceiver(lrnfpwlwnkVar);
            this.f17440dxjokdxxww = null;
        }
    }

    private void tzroggbefp(String str) {
        this.f17445lqeggnwhkg.gxszxtbevo(iwizpuwonk(), kc2.nufgyqmvbu.zoijcleaow.Warning, str, 1);
    }

    private void yadqdtsiqt() {
        if (this.f17448oxmwwwfdhm) {
            this.f17448oxmwwwfdhm = false;
            this.f17443gxszxtbevo.zoijcleaow();
        }
    }

    @Override // bz.wizcaqwiak.iobyxmoadg
    public void cqumvgiudr(wizcaqwiak.zoijcleaow zoijcleaowVar) {
        ylkuphrtab(zoijcleaowVar);
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void draadjrbmk(Date date) {
        ntlheqmsrt("cell", date);
        this.f17450vdvldrhtss = true;
    }

    ppxfxbqfkf dsvhmnatus() {
        ylkuphrtab(this.f17443gxszxtbevo.iobyxmoadg());
        boolean zJpowsppfya = jpowsppfya();
        int i13 = this.f17439draadjrbmk;
        if (i13 == 0 && zJpowsppfya) {
            i13 = 3;
        }
        if (i13 == 0 && this.f17449rgvfuqvkyq && !this.f17450vdvldrhtss) {
            if (hkdspvbjdz()) {
                i13 = 4;
            }
            this.f17449rgvfuqvkyq = false;
        }
        return new iobyxmoadg(i13);
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void dxjokdxxww(Date date) {
        pkzmftpjix("cell", date);
        this.f17450vdvldrhtss = true;
    }

    protected void finalize() throws Throwable {
        try {
            gxszxtbevo();
        } finally {
            super.finalize();
        }
    }

    @Override // t6.gxszxtbevo
    public void gxszxtbevo() {
        stevsuqkhv();
        cllcsxoeiz();
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void kcexrzcfyt(Date date, Date date2) {
        mbcevpiqjq("cell", 2, date, date2);
        yadqdtsiqt();
        this.f17450vdvldrhtss = true;
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void lqeggnwhkg(Date date) {
        this.f17437agtfadlqog = "cell";
        this.f17439draadjrbmk = 2;
        this.f17451wflxmlrfwp = 2;
        this.f17438btonecajqb = date;
        this.f17442gtknphoqwx = null;
        this.f17447ojitshcjhn = true;
        this.f17450vdvldrhtss = true;
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void nufgyqmvbu(Date date) {
        mbcevpiqjq("cell", 1, date, new Date());
        yadqdtsiqt();
        this.f17450vdvldrhtss = true;
    }

    @Override // t6.gxszxtbevo
    public void oxmwwwfdhm() {
        if (cdpycssgdh()) {
            stevsuqkhv();
            lrnfpwlwnk lrnfpwlwnkVar = new lrnfpwlwnk(this);
            this.f17440dxjokdxxww = lrnfpwlwnkVar;
            this.f17441eablkybsjg.registerReceiver(lrnfpwlwnkVar, lrnfpwlwnk.zoijcleaow());
        } else {
            tzroggbefp("Permission READ_PHONE_STATE was not granted. Parameter may contain inaccurate values");
        }
        this.f17443gxszxtbevo.ppxfxbqfkf(this);
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void rgvfuqvkyq(Date date, Date date2) {
        mbcevpiqjq("cell", 1, date, date2);
        yadqdtsiqt();
        this.f17450vdvldrhtss = true;
    }

    @Override // bz.wizcaqwiak.iobyxmoadg
    public void wkgbmnqykc(int i13) {
        if (i13 == -1) {
            this.f17448oxmwwwfdhm = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: wypolnanlu, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg lereixgezr() {
        ppxfxbqfkf ppxfxbqfkfVarDsvhmnatus = dsvhmnatus();
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        iobyxmoadgVar.put("state", Integer.valueOf(ppxfxbqfkfVarDsvhmnatus.iobyxmoadg()));
        iobyxmoadgVar.put("direction", Integer.valueOf(ppxfxbqfkfVarDsvhmnatus.ppxfxbqfkf()));
        iobyxmoadgVar.put("type", ppxfxbqfkfVarDsvhmnatus.zoijcleaow());
        iobyxmoadgVar.put("duration", Long.valueOf(ppxfxbqfkfVarDsvhmnatus.eablkybsjg()));
        iobyxmoadgVar.put("answered", Boolean.valueOf(ppxfxbqfkfVarDsvhmnatus.gxszxtbevo()));
        return iobyxmoadgVar;
    }

    void ylkuphrtab(wizcaqwiak.zoijcleaow zoijcleaowVar) {
        boolean z13 = this.f17440dxjokdxxww != null;
        Date date = new Date();
        Date date2 = jpowsppfya() ? this.f17438btonecajqb : date;
        int i13 = zoijcleaow.f17454iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            if (!jpowsppfya() || this.f17442gtknphoqwx != null) {
                date = this.f17442gtknphoqwx;
            }
            mbcevpiqjq(this.f17437agtfadlqog, this.f17451wflxmlrfwp, this.f17438btonecajqb, date);
            this.f17444kcexrzcfyt = false;
            return;
        }
        if (i13 == 2) {
            if (this.f17444kcexrzcfyt) {
                Objects.requireNonNull(date2);
                date = date2;
            }
            pkzmftpjix(CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE, date);
            this.f17444kcexrzcfyt = true;
            return;
        }
        if (i13 == 3) {
            if (this.f17449rgvfuqvkyq && z13 && !this.f17450vdvldrhtss) {
                if (this.f17444kcexrzcfyt) {
                    Objects.requireNonNull(date2);
                    date = date2;
                }
                ntlheqmsrt("cell", date);
            } else if (!z13) {
                if (this.f17444kcexrzcfyt) {
                    Objects.requireNonNull(date2);
                    date = date2;
                }
                ntlheqmsrt("cell", date);
            }
            this.f17444kcexrzcfyt = true;
            return;
        }
        if (i13 == 4) {
            if (this.f17444kcexrzcfyt) {
                Objects.requireNonNull(date2);
                date = date2;
            }
            ntlheqmsrt("voip", date);
            this.f17444kcexrzcfyt = true;
            return;
        }
        if (i13 != 5) {
            return;
        }
        if (this.f17449rgvfuqvkyq && z13 && !this.f17450vdvldrhtss) {
            if (this.f17444kcexrzcfyt) {
                Objects.requireNonNull(date2);
                date = date2;
            }
            ntlheqmsrt("cell", date);
        } else if (!z13) {
            String str = this.f17437agtfadlqog;
            if (this.f17444kcexrzcfyt) {
                Objects.requireNonNull(date2);
                date = date2;
            }
            ntlheqmsrt(str, date);
        }
        this.f17444kcexrzcfyt = true;
    }
}
