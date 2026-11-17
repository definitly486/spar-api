package bz;

import android.content.Context;
import android.media.AudioManager;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class v extends metgxyhuhe implements t6.gxszxtbevo, lrnfpwlwnk.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final long f17650dxjokdxxww = TimeUnit.MINUTES.toMillis(15);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17651eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Date f17652gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f17653lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private lrnfpwlwnk f17654nufgyqmvbu;

    v(Context context) {
        super(kc2.lqeggnwhkg.PhoneCallState);
        this.f17651eablkybsjg = context;
    }

    private boolean cdpycssgdh() {
        return this.f17652gxszxtbevo != null && System.currentTimeMillis() < this.f17652gxszxtbevo.getTime() + f17650dxjokdxxww;
    }

    private int yadqdtsiqt() {
        AudioManager audioManager = (AudioManager) this.f17651eablkybsjg.getSystemService("audio");
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
                return 2;
        }
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void draadjrbmk(Date date) {
        this.f17653lqeggnwhkg = 2;
        this.f17652gxszxtbevo = date;
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void dxjokdxxww(Date date) {
        this.f17653lqeggnwhkg = 1;
        this.f17652gxszxtbevo = date;
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
        lrnfpwlwnk lrnfpwlwnkVar = this.f17654nufgyqmvbu;
        if (lrnfpwlwnkVar != null) {
            this.f17651eablkybsjg.unregisterReceiver(lrnfpwlwnkVar);
        }
        this.f17654nufgyqmvbu = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: iozdgvuglv, reason: merged with bridge method [inline-methods] */
    public Integer lereixgezr() {
        int iYadqdtsiqt = yadqdtsiqt();
        if (iYadqdtsiqt != 0) {
            this.f17652gxszxtbevo = new Date();
        } else if (this.f17653lqeggnwhkg == 0 && cdpycssgdh()) {
            iYadqdtsiqt = 3;
        } else if (t6.skhdrjzrfn.iobyxmoadg(this.f17651eablkybsjg, t6.ppxfxbqfkf.READ_PHONE_STATE.iobyxmoadg())) {
            iYadqdtsiqt = this.f17653lqeggnwhkg;
        } else if (cdpycssgdh()) {
            iYadqdtsiqt = 3;
        } else {
            iYadqdtsiqt = 0;
        }
        if (iYadqdtsiqt != 3) {
            this.f17653lqeggnwhkg = iYadqdtsiqt;
        }
        return Integer.valueOf(iYadqdtsiqt);
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void kcexrzcfyt(Date date, Date date2) {
        this.f17653lqeggnwhkg = 0;
        this.f17652gxszxtbevo = date2;
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void lqeggnwhkg(Date date) {
        this.f17653lqeggnwhkg = 2;
        this.f17652gxszxtbevo = date;
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void nufgyqmvbu(Date date) {
        this.f17653lqeggnwhkg = 0;
        this.f17652gxszxtbevo = date;
    }

    @Override // t6.gxszxtbevo
    public void oxmwwwfdhm() {
        if (t6.skhdrjzrfn.iobyxmoadg(this.f17651eablkybsjg, t6.ppxfxbqfkf.READ_PHONE_STATE.iobyxmoadg())) {
            if (this.f17654nufgyqmvbu != null) {
                gxszxtbevo();
            }
            lrnfpwlwnk lrnfpwlwnkVar = new lrnfpwlwnk(this);
            this.f17654nufgyqmvbu = lrnfpwlwnkVar;
            this.f17651eablkybsjg.registerReceiver(lrnfpwlwnkVar, lrnfpwlwnk.zoijcleaow());
        }
    }

    @Override // bz.lrnfpwlwnk.iobyxmoadg
    public void rgvfuqvkyq(Date date, Date date2) {
        this.f17653lqeggnwhkg = 0;
        this.f17652gxszxtbevo = date2;
    }
}
