package x9;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class oxmwwwfdhm {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final y9.ppxfxbqfkf f121791dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Executor f121792eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final z9.iobyxmoadg f121793gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f121794iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final aa.iobyxmoadg f121795lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final aa.iobyxmoadg f121796nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y9.wkgbmnqykc f121797ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cqumvgiudr f121798wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final r9.eablkybsjg f121799zoijcleaow;

    public oxmwwwfdhm(Context context, r9.eablkybsjg eablkybsjgVar, y9.wkgbmnqykc wkgbmnqykcVar, cqumvgiudr cqumvgiudrVar, Executor executor, z9.iobyxmoadg iobyxmoadgVar, aa.iobyxmoadg iobyxmoadgVar2, aa.iobyxmoadg iobyxmoadgVar3, y9.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f121794iobyxmoadg = context;
        this.f121799zoijcleaow = eablkybsjgVar;
        this.f121797ppxfxbqfkf = wkgbmnqykcVar;
        this.f121798wkgbmnqykc = cqumvgiudrVar;
        this.f121792eablkybsjg = executor;
        this.f121793gxszxtbevo = iobyxmoadgVar;
        this.f121795lqeggnwhkg = iobyxmoadgVar2;
        this.f121796nufgyqmvbu = iobyxmoadgVar3;
        this.f121791dxjokdxxww = ppxfxbqfkfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object agtfadlqog(Iterable iterable, q9.rgvfuqvkyq rgvfuqvkyqVar, long j13) {
        this.f121797ppxfxbqfkf.fyldjkxazc(iterable);
        this.f121797ppxfxbqfkf.p(rgvfuqvkyqVar, this.f121795lqeggnwhkg.wflxmlrfwp() + j13);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean draadjrbmk(q9.rgvfuqvkyq rgvfuqvkyqVar) {
        return Boolean.valueOf(this.f121797ppxfxbqfkf.G(rgvfuqvkyqVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object kcexrzcfyt(q9.rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        this.f121798wkgbmnqykc.iobyxmoadg(rgvfuqvkyqVar, i13 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object ojitshcjhn(Iterable iterable) {
        this.f121797ppxfxbqfkf.esjtqupxsv(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object oxmwwwfdhm(q9.rgvfuqvkyq rgvfuqvkyqVar, long j13) {
        this.f121797ppxfxbqfkf.p(rgvfuqvkyqVar, this.f121795lqeggnwhkg.wflxmlrfwp() + j13);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object rgvfuqvkyq() {
        this.f121791dxjokdxxww.wkgbmnqykc();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object vdvldrhtss(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f121791dxjokdxxww.iobyxmoadg(((Integer) entry.getValue()).intValue(), t9.ppxfxbqfkf.zoijcleaow.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable wflxmlrfwp(q9.rgvfuqvkyq rgvfuqvkyqVar) {
        return this.f121797ppxfxbqfkf.cllcsxoeiz(rgvfuqvkyqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zdlpuopuiu(final q9.rgvfuqvkyq rgvfuqvkyqVar, final int i13, Runnable runnable) {
        try {
            try {
                z9.iobyxmoadg iobyxmoadgVar = this.f121793gxszxtbevo;
                final y9.wkgbmnqykc wkgbmnqykcVar = this.f121797ppxfxbqfkf;
                Objects.requireNonNull(wkgbmnqykcVar);
                iobyxmoadgVar.lqeggnwhkg(new z9.iobyxmoadg.InterfaceC3287iobyxmoadg() { // from class: x9.dxjokdxxww
                    @Override // z9.iobyxmoadg.InterfaceC3287iobyxmoadg
                    public final Object execute() {
                        return Integer.valueOf(wkgbmnqykcVar.iwizpuwonk());
                    }
                });
                if (gtknphoqwx()) {
                    yggfygwlhe(rgvfuqvkyqVar, i13);
                } else {
                    this.f121793gxszxtbevo.lqeggnwhkg(new z9.iobyxmoadg.InterfaceC3287iobyxmoadg() { // from class: x9.btonecajqb
                        @Override // z9.iobyxmoadg.InterfaceC3287iobyxmoadg
                        public final Object execute() {
                            return this.f121752iobyxmoadg.kcexrzcfyt(rgvfuqvkyqVar, i13);
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                this.f121798wkgbmnqykc.iobyxmoadg(rgvfuqvkyqVar, i13 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public q9.dxjokdxxww btonecajqb(r9.wflxmlrfwp wflxmlrfwpVar) {
        z9.iobyxmoadg iobyxmoadgVar = this.f121793gxszxtbevo;
        final y9.ppxfxbqfkf ppxfxbqfkfVar = this.f121791dxjokdxxww;
        Objects.requireNonNull(ppxfxbqfkfVar);
        return wflxmlrfwpVar.iobyxmoadg(q9.dxjokdxxww.iobyxmoadg().dxjokdxxww(this.f121795lqeggnwhkg.wflxmlrfwp()).ojitshcjhn(this.f121796nufgyqmvbu.wflxmlrfwp()).agtfadlqog("GDT_CLIENT_METRICS").nufgyqmvbu(new q9.nufgyqmvbu(o9.ppxfxbqfkf.zoijcleaow("proto"), ((t9.iobyxmoadg) iobyxmoadgVar.lqeggnwhkg(new z9.iobyxmoadg.InterfaceC3287iobyxmoadg() { // from class: x9.nufgyqmvbu
            @Override // z9.iobyxmoadg.InterfaceC3287iobyxmoadg
            public final Object execute() {
                return ppxfxbqfkfVar.nufgyqmvbu();
            }
        })).gxszxtbevo())).wkgbmnqykc());
    }

    boolean gtknphoqwx() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f121794iobyxmoadg.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void jyumaefscl(final q9.rgvfuqvkyq rgvfuqvkyqVar, final int i13, final Runnable runnable) {
        this.f121792eablkybsjg.execute(new Runnable() { // from class: x9.lqeggnwhkg
            @Override // java.lang.Runnable
            public final void run() {
                this.f121788zdlpuopuiu.zdlpuopuiu(rgvfuqvkyqVar, i13, runnable);
            }
        });
    }

    public r9.lqeggnwhkg yggfygwlhe(final q9.rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        r9.lqeggnwhkg lqeggnwhkgVarZoijcleaow;
        r9.wflxmlrfwp wflxmlrfwpVar = this.f121799zoijcleaow.get(rgvfuqvkyqVar.zoijcleaow());
        long jMax = 0;
        r9.lqeggnwhkg lqeggnwhkgVarEablkybsjg = r9.lqeggnwhkg.eablkybsjg(0L);
        while (true) {
            final long j13 = jMax;
            while (true) {
                if (!((Boolean) this.f121793gxszxtbevo.lqeggnwhkg(new z9.iobyxmoadg.InterfaceC3287iobyxmoadg() { // from class: x9.gtknphoqwx
                    @Override // z9.iobyxmoadg.InterfaceC3287iobyxmoadg
                    public final Object execute() {
                        return this.f121760iobyxmoadg.draadjrbmk(rgvfuqvkyqVar);
                    }
                })).booleanValue()) {
                    this.f121793gxszxtbevo.lqeggnwhkg(new z9.iobyxmoadg.InterfaceC3287iobyxmoadg() { // from class: x9.vdvldrhtss
                        @Override // z9.iobyxmoadg.InterfaceC3287iobyxmoadg
                        public final Object execute() {
                            return this.f121808iobyxmoadg.oxmwwwfdhm(rgvfuqvkyqVar, j13);
                        }
                    });
                    return lqeggnwhkgVarEablkybsjg;
                }
                final Iterable iterable = (Iterable) this.f121793gxszxtbevo.lqeggnwhkg(new z9.iobyxmoadg.InterfaceC3287iobyxmoadg() { // from class: x9.draadjrbmk
                    @Override // z9.iobyxmoadg.InterfaceC3287iobyxmoadg
                    public final Object execute() {
                        return this.f121755iobyxmoadg.wflxmlrfwp(rgvfuqvkyqVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return lqeggnwhkgVarEablkybsjg;
                }
                if (wflxmlrfwpVar == null) {
                    u9.iobyxmoadg.iobyxmoadg("Uploader", "Unknown backend for %s, deleting event batch for it...", rgvfuqvkyqVar);
                    lqeggnwhkgVarZoijcleaow = r9.lqeggnwhkg.iobyxmoadg();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((y9.gtknphoqwx) it.next()).zoijcleaow());
                    }
                    if (rgvfuqvkyqVar.eablkybsjg()) {
                        arrayList.add(btonecajqb(wflxmlrfwpVar));
                    }
                    lqeggnwhkgVarZoijcleaow = wflxmlrfwpVar.zoijcleaow(r9.gxszxtbevo.iobyxmoadg().zoijcleaow(arrayList).ppxfxbqfkf(rgvfuqvkyqVar.ppxfxbqfkf()).iobyxmoadg());
                }
                lqeggnwhkgVarEablkybsjg = lqeggnwhkgVarZoijcleaow;
                if (lqeggnwhkgVarEablkybsjg.ppxfxbqfkf() == r9.lqeggnwhkg.iobyxmoadg.TRANSIENT_ERROR) {
                    this.f121793gxszxtbevo.lqeggnwhkg(new z9.iobyxmoadg.InterfaceC3287iobyxmoadg() { // from class: x9.wflxmlrfwp
                        @Override // z9.iobyxmoadg.InterfaceC3287iobyxmoadg
                        public final Object execute() {
                            return this.f121811iobyxmoadg.agtfadlqog(iterable, rgvfuqvkyqVar, j13);
                        }
                    });
                    this.f121798wkgbmnqykc.zoijcleaow(rgvfuqvkyqVar, i13 + 1, true);
                    return lqeggnwhkgVarEablkybsjg;
                }
                this.f121793gxszxtbevo.lqeggnwhkg(new z9.iobyxmoadg.InterfaceC3287iobyxmoadg() { // from class: x9.agtfadlqog
                    @Override // z9.iobyxmoadg.InterfaceC3287iobyxmoadg
                    public final Object execute() {
                        return this.f121750iobyxmoadg.ojitshcjhn(iterable);
                    }
                });
                if (lqeggnwhkgVarEablkybsjg.ppxfxbqfkf() == r9.lqeggnwhkg.iobyxmoadg.OK) {
                    break;
                }
                if (lqeggnwhkgVarEablkybsjg.ppxfxbqfkf() == r9.lqeggnwhkg.iobyxmoadg.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strAgtfadlqog = ((y9.gtknphoqwx) it2.next()).zoijcleaow().agtfadlqog();
                        if (map.containsKey(strAgtfadlqog)) {
                            map.put(strAgtfadlqog, Integer.valueOf(((Integer) map.get(strAgtfadlqog)).intValue() + 1));
                        } else {
                            map.put(strAgtfadlqog, 1);
                        }
                    }
                    this.f121793gxszxtbevo.lqeggnwhkg(new z9.iobyxmoadg.InterfaceC3287iobyxmoadg() { // from class: x9.rgvfuqvkyq
                        @Override // z9.iobyxmoadg.InterfaceC3287iobyxmoadg
                        public final Object execute() {
                            return this.f121806iobyxmoadg.vdvldrhtss(map);
                        }
                    });
                }
            }
            jMax = Math.max(j13, lqeggnwhkgVarEablkybsjg.zoijcleaow());
            if (rgvfuqvkyqVar.eablkybsjg()) {
                this.f121793gxszxtbevo.lqeggnwhkg(new z9.iobyxmoadg.InterfaceC3287iobyxmoadg() { // from class: x9.ojitshcjhn
                    @Override // z9.iobyxmoadg.InterfaceC3287iobyxmoadg
                    public final Object execute() {
                        return this.f121790iobyxmoadg.rgvfuqvkyq();
                    }
                });
            }
        }
    }
}
