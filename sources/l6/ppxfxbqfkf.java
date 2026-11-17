package l6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import g6.yggfygwlhe;
import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.jyumaefscl;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import rj.iwizpuwonk;
import rj.oxmwwwfdhm;
import rj.zdlpuopuiu;
import sj.dxjokdxxww;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements m6.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConnectivityManager f61673iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f61674zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f61675iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ g6.wkgbmnqykc f61676jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f61677yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61678zdlpuopuiu;

        /* JADX INFO: renamed from: l6.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1246iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ C1247ppxfxbqfkf f61679yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf f61680zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1246iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, C1247ppxfxbqfkf c1247ppxfxbqfkf) {
                super(0);
                this.f61680zdlpuopuiu = ppxfxbqfkfVar;
                this.f61679yggfygwlhe = c1247ppxfxbqfkf;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                yggfygwlhe.eablkybsjg().iobyxmoadg(lqeggnwhkg.f61665iobyxmoadg, "NetworkRequestConstraintController unregister callback");
                this.f61680zdlpuopuiu.f61673iobyxmoadg.unregisterNetworkCallback(this.f61679yggfygwlhe);
            }
        }

        /* JADX INFO: renamed from: l6.ppxfxbqfkf$iobyxmoadg$ppxfxbqfkf, reason: collision with other inner class name */
        public static final class C1247ppxfxbqfkf extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ auzgnhcxok f61681iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f61682zoijcleaow;

            C1247ppxfxbqfkf(auzgnhcxok auzgnhcxokVar, zdlpuopuiu zdlpuopuiuVar) {
                this.f61681iobyxmoadg = auzgnhcxokVar;
                this.f61682zoijcleaow = zdlpuopuiuVar;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(network, "network");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkCapabilities, "networkCapabilities");
                auzgnhcxok.iobyxmoadg.iobyxmoadg(this.f61681iobyxmoadg, null, 1, null);
                yggfygwlhe.eablkybsjg().iobyxmoadg(lqeggnwhkg.f61665iobyxmoadg, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                this.f61682zoijcleaow.eablkybsjg(l6.zoijcleaow.iobyxmoadg.f61690iobyxmoadg);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(network, "network");
                auzgnhcxok.iobyxmoadg.iobyxmoadg(this.f61681iobyxmoadg, null, 1, null);
                yggfygwlhe.eablkybsjg().iobyxmoadg(lqeggnwhkg.f61665iobyxmoadg, "NetworkRequestConstraintController onLost callback");
                this.f61682zoijcleaow.eablkybsjg(new l6.zoijcleaow.C1248zoijcleaow(7));
            }
        }

        static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f61683jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf f61684yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f61685zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f61684yggfygwlhe = ppxfxbqfkfVar;
                this.f61683jyumaefscl = zdlpuopuiuVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f61684yggfygwlhe, this.f61683jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f61685zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    long j13 = this.f61684yggfygwlhe.f61674zoijcleaow;
                    this.f61685zdlpuopuiu = 1;
                    if (crxdokpmqz.zoijcleaow(j13, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                yggfygwlhe.eablkybsjg().iobyxmoadg(lqeggnwhkg.f61665iobyxmoadg, "NetworkRequestConstraintController didn't receive neither  onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.f61684yggfygwlhe.f61674zoijcleaow + " ms");
                this.f61683jyumaefscl.eablkybsjg(new l6.zoijcleaow.C1248zoijcleaow(7));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(g6.wkgbmnqykc wkgbmnqykcVar, ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f61676jyumaefscl = wkgbmnqykcVar;
            this.f61675iwizpuwonk = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f61676jyumaefscl, this.f61675iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f61677yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f61678zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) this.f61677yggfygwlhe;
                NetworkRequest networkRequestWkgbmnqykc = this.f61676jyumaefscl.wkgbmnqykc();
                if (networkRequestWkgbmnqykc == null) {
                    iwizpuwonk.iobyxmoadg.iobyxmoadg(zdlpuopuiuVar.kcexrzcfyt(), null, 1, null);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                C1247ppxfxbqfkf c1247ppxfxbqfkf = new C1247ppxfxbqfkf(gtknphoqwx.wkgbmnqykc(zdlpuopuiuVar, null, null, new zoijcleaow(this.f61675iwizpuwonk, zdlpuopuiuVar, null), 3, null), zdlpuopuiuVar);
                yggfygwlhe.eablkybsjg().iobyxmoadg(lqeggnwhkg.f61665iobyxmoadg, "NetworkRequestConstraintController register callback");
                this.f61675iwizpuwonk.f61673iobyxmoadg.registerNetworkCallback(networkRequestWkgbmnqykc, c1247ppxfxbqfkf);
                C1246iobyxmoadg c1246iobyxmoadg = new C1246iobyxmoadg(this.f61675iwizpuwonk, c1247ppxfxbqfkf);
                this.f61678zdlpuopuiu = 1;
                if (oxmwwwfdhm.iobyxmoadg(zdlpuopuiuVar, c1246iobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ppxfxbqfkf(ConnectivityManager connManager, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(connManager, "connManager");
        this.f61673iobyxmoadg = connManager;
        this.f61674zoijcleaow = j13;
    }

    @Override // m6.wkgbmnqykc
    public boolean iobyxmoadg(p6.yggfygwlhe workSpec) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpec, "workSpec");
        return workSpec.f75789btonecajqb.wkgbmnqykc() != null;
    }

    @Override // m6.wkgbmnqykc
    public boolean ppxfxbqfkf(p6.yggfygwlhe workSpec) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workSpec, "workSpec");
        if (iobyxmoadg(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // m6.wkgbmnqykc
    public sj.lqeggnwhkg zoijcleaow(g6.wkgbmnqykc constraints) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constraints, "constraints");
        return dxjokdxxww.eablkybsjg(new iobyxmoadg(constraints, this, null));
    }

    public /* synthetic */ ppxfxbqfkf(ConnectivityManager connectivityManager, long j13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(connectivityManager, (i13 & 2) != 0 ? lqeggnwhkg.f61666zoijcleaow : j13);
    }
}
