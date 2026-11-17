package bz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.TelephonyManager;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class lrnfpwlwnk extends BroadcastReceiver {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f17517iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Date f17518ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f17519wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f17520zoijcleaow = 0;

    public interface iobyxmoadg {
        void draadjrbmk(Date date);

        void dxjokdxxww(Date date);

        void kcexrzcfyt(Date date, Date date2);

        void lqeggnwhkg(Date date);

        void nufgyqmvbu(Date date);

        void rgvfuqvkyq(Date date, Date date2);
    }

    public lrnfpwlwnk(iobyxmoadg iobyxmoadgVar) {
        this.f17517iobyxmoadg = iobyxmoadgVar;
    }

    private static int iobyxmoadg(Intent intent) {
        String stringExtra = intent.getStringExtra("state");
        if (stringExtra != null) {
            if (stringExtra.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                return 2;
            }
            if (stringExtra.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                return 1;
            }
        }
        return 0;
    }

    private void ppxfxbqfkf(int i13) {
        Date date = new Date();
        if (i13 == 1) {
            this.f17519wkgbmnqykc = true;
            this.f17518ppxfxbqfkf = date;
            this.f17517iobyxmoadg.dxjokdxxww(date);
        } else if (i13 == 2) {
            this.f17518ppxfxbqfkf = date;
            if (this.f17520zoijcleaow != 1) {
                this.f17519wkgbmnqykc = false;
                this.f17517iobyxmoadg.lqeggnwhkg(date);
            } else {
                this.f17519wkgbmnqykc = true;
                this.f17517iobyxmoadg.draadjrbmk(date);
            }
        } else if (this.f17520zoijcleaow == 1) {
            this.f17517iobyxmoadg.nufgyqmvbu(this.f17518ppxfxbqfkf);
        } else if (this.f17519wkgbmnqykc) {
            this.f17517iobyxmoadg.rgvfuqvkyq(this.f17518ppxfxbqfkf, date);
        } else {
            this.f17517iobyxmoadg.kcexrzcfyt(this.f17518ppxfxbqfkf, date);
        }
        this.f17520zoijcleaow = i13;
    }

    public static IntentFilter zoijcleaow() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int iIobyxmoadg;
        if (!"android.intent.action.PHONE_STATE".equals(intent.getAction()) || this.f17520zoijcleaow == (iIobyxmoadg = iobyxmoadg(intent))) {
            return;
        }
        ppxfxbqfkf(iIobyxmoadg);
    }
}
