package n0;

import androidx.compose.runtime.i1;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss implements wflxmlrfwp.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final hcddaimhww f68334eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tg.draadjrbmk f68335gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jpowsppfya f68336iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jhduphickx f68337ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final jyumaefscl f68338wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dsvhmnatus f68339zoijcleaow;

    public vdvldrhtss(jpowsppfya jpowsppfyaVar, dsvhmnatus dsvhmnatusVar, jhduphickx jhduphickxVar, jyumaefscl jyumaefsclVar, hcddaimhww hcddaimhwwVar) {
        this.f68336iobyxmoadg = jpowsppfyaVar;
        this.f68339zoijcleaow = dsvhmnatusVar;
        this.f68337ppxfxbqfkf = jhduphickxVar;
        this.f68338wkgbmnqykc = jyumaefsclVar;
        this.f68334eablkybsjg = hcddaimhwwVar;
        this.f68335gxszxtbevo = new tg.draadjrbmk() { // from class: n0.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return vdvldrhtss.eablkybsjg(this.f68315zdlpuopuiu, (ribwqtqdhb) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object eablkybsjg(vdvldrhtss vdvldrhtssVar, ribwqtqdhb ribwqtqdhbVar) {
        return vdvldrhtssVar.gxszxtbevo(ribwqtqdhb.zoijcleaow(ribwqtqdhbVar, null, null, 0, 0, null, 30, null)).getValue();
    }

    private final i1 gxszxtbevo(final ribwqtqdhb ribwqtqdhbVar) {
        return this.f68337ppxfxbqfkf.zoijcleaow(ribwqtqdhbVar, new tg.draadjrbmk() { // from class: n0.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return vdvldrhtss.lqeggnwhkg(this.f68328zdlpuopuiu, ribwqtqdhbVar, (tg.draadjrbmk) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ikoacuggdj lqeggnwhkg(vdvldrhtss vdvldrhtssVar, ribwqtqdhb ribwqtqdhbVar, tg.draadjrbmk draadjrbmkVar) {
        ikoacuggdj ikoacuggdjVarIobyxmoadg = vdvldrhtssVar.f68338wkgbmnqykc.iobyxmoadg(ribwqtqdhbVar, vdvldrhtssVar.f68336iobyxmoadg, draadjrbmkVar, vdvldrhtssVar.f68335gxszxtbevo);
        if (ikoacuggdjVarIobyxmoadg == null && (ikoacuggdjVarIobyxmoadg = vdvldrhtssVar.f68334eablkybsjg.iobyxmoadg(ribwqtqdhbVar, vdvldrhtssVar.f68336iobyxmoadg, draadjrbmkVar, vdvldrhtssVar.f68335gxszxtbevo)) == null) {
            throw new IllegalStateException("Could not load font");
        }
        return ikoacuggdjVarIobyxmoadg;
    }

    @Override // n0.wflxmlrfwp.zoijcleaow
    public i1 zoijcleaow(wflxmlrfwp wflxmlrfwpVar, yadqdtsiqt yadqdtsiqtVar, int i13, int i14) {
        return gxszxtbevo(new ribwqtqdhb(this.f68339zoijcleaow.ppxfxbqfkf(wflxmlrfwpVar), this.f68339zoijcleaow.wkgbmnqykc(yadqdtsiqtVar), this.f68339zoijcleaow.iobyxmoadg(i13), this.f68339zoijcleaow.zoijcleaow(i14), this.f68336iobyxmoadg.iobyxmoadg(), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vdvldrhtss(jpowsppfya jpowsppfyaVar, dsvhmnatus dsvhmnatusVar, jhduphickx jhduphickxVar, jyumaefscl jyumaefsclVar, hcddaimhww hcddaimhwwVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(jpowsppfyaVar, (i13 & 2) != 0 ? dsvhmnatus.f68246iobyxmoadg.iobyxmoadg() : dsvhmnatusVar, (i13 & 4) != 0 ? oxmwwwfdhm.zoijcleaow() : jhduphickxVar, (i13 & 8) != 0 ? new jyumaefscl(oxmwwwfdhm.iobyxmoadg(), null, 2, 0 == true ? 1 : 0) : jyumaefsclVar, (i13 & 16) != 0 ? new hcddaimhww() : hcddaimhwwVar);
    }
}
