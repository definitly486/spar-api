package bz;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import t6.f1;

/* JADX INFO: loaded from: classes2.dex */
abstract class rlfsiqarku extends metgxyhuhe implements t6.lxfrhoxuzk, e {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final long f17610dxjokdxxww = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17611eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final t6.zdlpuopuiu f17612gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final t6.yadqdtsiqt f17613lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final t6.hcddaimhww f17614nufgyqmvbu;

    class iobyxmoadg extends e.iobyxmoadg {
        iobyxmoadg(kc2.gxszxtbevo gxszxtbevoVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                zoijcleaow zoijcleaowVarCdpycssgdh = rlfsiqarku.this.cdpycssgdh();
                if (zoijcleaowVarCdpycssgdh == null || jCurrentTimeMillis > zoijcleaowVarCdpycssgdh.f17616yggfygwlhe + rlfsiqarku.f17610dxjokdxxww) {
                    if (rlfsiqarku.this.ylkuphrtab() && rlfsiqarku.this.jpowsppfya()) {
                        rlfsiqarku.this.cllcsxoeiz(new zoijcleaow(rlfsiqarku.this.f17613lqeggnwhkg.iobyxmoadg(), System.currentTimeMillis()));
                    }
                }
                rlfsiqarku.this.iozdgvuglv(null);
            } catch (Throwable th2) {
                try {
                    rlfsiqarku.this.f17614nufgyqmvbu.eablkybsjg(rlfsiqarku.this.iwizpuwonk(), new u4(th2.getMessage(), th2));
                } finally {
                    rlfsiqarku.this.iozdgvuglv(null);
                }
            }
        }
    }

    static final class zoijcleaow implements Serializable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        long f17616yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        ArrayList f17617zdlpuopuiu;

        zoijcleaow(ArrayList arrayList, long j13) {
            this.f17617zdlpuopuiu = arrayList;
            this.f17616yggfygwlhe = j13;
        }
    }

    rlfsiqarku(Context context, kc2.lqeggnwhkg lqeggnwhkgVar, t6.zdlpuopuiu zdlpuopuiuVar, t6.yadqdtsiqt yadqdtsiqtVar, t6.hcddaimhww hcddaimhwwVar) {
        super(lqeggnwhkgVar);
        this.f17611eablkybsjg = context;
        this.f17612gxszxtbevo = zdlpuopuiuVar;
        this.f17613lqeggnwhkg = yadqdtsiqtVar;
        this.f17614nufgyqmvbu = hcddaimhwwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iozdgvuglv(kc2.gxszxtbevo gxszxtbevoVar) {
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.iobyxmoadg(iwizpuwonk());
        }
    }

    private static kc2.lqeggnwhkg wwaezpbzkn() {
        return kc2.lqeggnwhkg.CellIdentities;
    }

    private boolean yadqdtsiqt() {
        return f1.ppxfxbqfkf(this.f17611eablkybsjg);
    }

    @Override // bz.e
    public e.iobyxmoadg agtfadlqog(kc2.gxszxtbevo gxszxtbevoVar) {
        return new iobyxmoadg(gxszxtbevoVar);
    }

    public zoijcleaow cdpycssgdh() {
        return (zoijcleaow) jyumaefscl().iobyxmoadg(wwaezpbzkn(), t6.agtfadlqog.f109770zoijcleaow);
    }

    public void cllcsxoeiz(zoijcleaow zoijcleaowVar) {
        jyumaefscl().ppxfxbqfkf(wwaezpbzkn(), zoijcleaowVar);
    }

    @Override // t6.lxfrhoxuzk
    public Set gtknphoqwx() {
        return t6.jyumaefscl.iobyxmoadg(t6.ppxfxbqfkf.ACCESS_FINE_LOCATION);
    }

    @Override // t6.lxfrhoxuzk
    public Context iobyxmoadg() {
        return this.f17611eablkybsjg;
    }

    protected boolean jpowsppfya() {
        PackageManager packageManager = this.f17611eablkybsjg.getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? packageManager.hasSystemFeature("android.hardware.telephony.radio.access") : packageManager.hasSystemFeature("android.hardware.telephony");
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17612gxszxtbevo;
    }

    protected List pkzmftpjix() throws jhduphickx, u4 {
        if (!yadqdtsiqt()) {
            throw new jhduphickx("The network provider is not activated for location detection in the phone settings");
        }
        if (!jpowsppfya()) {
            throw new u4("The device not support system feature: android.hardware.telephony (for Android 13.0 (Tiramisu) additionally required 'android.hardware.telephony.radio.access'");
        }
        List listEmptyList = Collections.emptyList();
        zoijcleaow zoijcleaowVarCdpycssgdh = cdpycssgdh();
        if (zoijcleaowVarCdpycssgdh != null) {
            listEmptyList = zoijcleaowVarCdpycssgdh.f17617zdlpuopuiu;
        }
        ojitshcjhn(null);
        return listEmptyList;
    }

    protected boolean ylkuphrtab() {
        Iterator it = gtknphoqwx().iterator();
        while (it.hasNext()) {
            if (!t6.skhdrjzrfn.iobyxmoadg(this.f17611eablkybsjg, ((t6.ppxfxbqfkf) it.next()).iobyxmoadg())) {
                return false;
            }
        }
        return true;
    }
}
