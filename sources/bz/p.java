package bz;

import android.content.Context;
import android.media.AudioManager;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class p extends metgxyhuhe implements t6.gxszxtbevo, lrnfpwlwnk.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final long f17550dxjokdxxww = TimeUnit.MINUTES.toMillis(15);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Date f17551eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Context f17552gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private lrnfpwlwnk f17553lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f17554nufgyqmvbu;

    p(Context context) {
        super(kc2.lqeggnwhkg.PhoneCallDirection);
        this.f17554nufgyqmvbu = 0;
        this.f17552gxszxtbevo = context;
    }

    private boolean cdpycssgdh() {
        Date date = this.f17551eablkybsjg;
        return date != null && date.getTime() + f17550dxjokdxxww < System.currentTimeMillis();
    }

    private int yadqdtsiqt() {
        int i13;
        AudioManager audioManager = (AudioManager) this.f17552gxszxtbevo.getSystemService("audio");
        if (audioManager == null) {
            return 0;
        }
        switch (audioManager.getMode()) {
            case 0:
            default:
                return 0;
            case 1:
                return 1;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (!t6.skhdrjzrfn.iobyxmoadg(this.f17552gxszxtbevo, t6.ppxfxbqfkf.READ_PHONE_STATE.iobyxmoadg()) || (i13 = this.f17554nufgyqmvbu) == 0) {
                    return 1;
                }
                return i13;
        }
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void draadjrbmk(Date date) {
        this.f17551eablkybsjg = date;
        this.f17554nufgyqmvbu = 1;
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void dxjokdxxww(Date date) {
        this.f17551eablkybsjg = date;
        this.f17554nufgyqmvbu = 1;
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
        lrnfpwlwnk lrnfpwlwnkVar = this.f17553lqeggnwhkg;
        if (lrnfpwlwnkVar != null) {
            this.f17552gxszxtbevo.unregisterReceiver(lrnfpwlwnkVar);
        }
        this.f17553lqeggnwhkg = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: iozdgvuglv, reason: merged with bridge method [inline-methods] */
    public Integer lereixgezr() {
        int iYadqdtsiqt = yadqdtsiqt();
        if (iYadqdtsiqt != 0) {
            this.f17551eablkybsjg = new Date();
        } else {
            iYadqdtsiqt = !cdpycssgdh() ? this.f17554nufgyqmvbu : 0;
        }
        if (iYadqdtsiqt != 0) {
            this.f17554nufgyqmvbu = iYadqdtsiqt;
        }
        return Integer.valueOf(iYadqdtsiqt);
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void kcexrzcfyt(Date date, Date date2) {
        this.f17551eablkybsjg = date2;
        this.f17554nufgyqmvbu = 2;
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void lqeggnwhkg(Date date) {
        this.f17551eablkybsjg = date;
        this.f17554nufgyqmvbu = 2;
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void nufgyqmvbu(Date date) {
        this.f17551eablkybsjg = date;
        this.f17554nufgyqmvbu = 1;
    }

    @Override // t6.gxszxtbevo
    public void oxmwwwfdhm() {
        if (t6.skhdrjzrfn.iobyxmoadg(this.f17552gxszxtbevo, t6.ppxfxbqfkf.READ_PHONE_STATE.iobyxmoadg())) {
            if (this.f17553lqeggnwhkg != null) {
                gxszxtbevo();
            }
            lrnfpwlwnk lrnfpwlwnkVar = new lrnfpwlwnk(this);
            this.f17553lqeggnwhkg = lrnfpwlwnkVar;
            this.f17552gxszxtbevo.registerReceiver(lrnfpwlwnkVar, lrnfpwlwnk.zoijcleaow());
        }
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void rgvfuqvkyq(Date date, Date date2) {
        this.f17551eablkybsjg = date2;
        this.f17554nufgyqmvbu = 1;
    }
}
